package com.williambl.steamaudioexample;

import com.valvesoftware.phonon.*;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.channels.FileChannel;

import static com.valvesoftware.phonon.phonon.*;

public class Main {

    private static final int samplingrate = 44100;
    private static final int framesize    = 1024;

    public static void main(String[] args) throws IOException {
        System.loadLibrary("phonon");
        System.loadLibrary("phononjni");

        FloatBuffer inputaudio = readFile("inputAudio.raw").asFloatBuffer();

        SWIGTYPE_p_p_void context = new_IPLHandle();
        iplCreateContext(null, null, null, context);

        IPLRenderingSettings settings = new IPLRenderingSettings();
        settings.setSamplingRate(samplingrate);
        settings.setFrameSize(framesize);

        SWIGTYPE_p_p_void renderer = new_IPLHandle();

        IPLHrtfParams hrtfParams = new IPLHrtfParams();
        hrtfParams.setType(IPLHrtfDatabaseType.IPL_HRTFDATABASETYPE_DEFAULT);

        iplCreateBinauralRenderer(IPLHandle_value(context), settings, hrtfParams, renderer);

        IPLAudioFormat mono = new IPLAudioFormat();
        mono.setChannelLayoutType(IPLChannelLayoutType.IPL_CHANNELLAYOUTTYPE_SPEAKERS);
        mono.setChannelLayout(IPLChannelLayout.IPL_CHANNELLAYOUT_MONO);
        mono.setChannelOrder(IPLChannelOrder.IPL_CHANNELORDER_INTERLEAVED);

        IPLAudioFormat stereo = new IPLAudioFormat();
        stereo.setChannelLayoutType(IPLChannelLayoutType.IPL_CHANNELLAYOUTTYPE_SPEAKERS);
        stereo.setChannelLayout(IPLChannelLayout.IPL_CHANNELLAYOUT_STEREO);
        stereo.setChannelOrder(IPLChannelOrder.IPL_CHANNELORDER_INTERLEAVED);

        SWIGTYPE_p_p_void effect = new_IPLHandle();

        iplCreateBinauralEffect(IPLHandle_value(renderer), mono, stereo, effect);

        FloatBuffer outputaudioframe = ByteBuffer.allocateDirect(framesize * 4 * 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        outputaudioframe.mark();

        ByteBuffer outputdata = ByteBuffer.allocate(inputaudio.remaining()*4*2);
        outputdata.mark();
        FloatBuffer outputaudio = outputdata.asFloatBuffer();

        IPLAudioBuffer inbuffer = new IPLAudioBuffer();
        inbuffer.setFormat(mono);
        inbuffer.setNumSamples(framesize);
        inbuffer.setInterleavedBuffer(inputaudio);

        IPLAudioBuffer outbuffer = new IPLAudioBuffer();
        outbuffer.setFormat(stereo);
        outbuffer.setNumSamples(framesize);
        outbuffer.setInterleavedBuffer(outputaudioframe);

        int numframes = inputaudio.remaining() / framesize;

        for (int i = 0; i < numframes; ++i) {
            IPLVector3 vector = new IPLVector3();
            vector.setX(1f);
            vector.setY(1f);
            vector.setZ(1f);
            iplApplyBinauralEffect(IPLHandle_value(effect), IPLHandle_value(renderer), inbuffer, vector, IPLHrtfInterpolation.IPL_HRTFINTERPOLATION_BILINEAR, 1.0f, outbuffer);
            outputaudioframe.reset();
            outputaudio.put(outputaudioframe);
            outputaudioframe.reset();
            inputaudio.position(inputaudio.position()+1024);
            inbuffer.setInterleavedBuffer(inputaudio.slice());
        }

        iplDestroyBinauralEffect(effect);
        iplDestroyBinauralRenderer(renderer);
        iplDestroyContext(context);
        iplCleanup();

        try (FileChannel channel = new FileOutputStream(new File("output.raw"), false).getChannel()) {
            outputdata.reset();
            channel.write(outputdata);
        }
    }

    private static ByteBuffer readFile(String path) throws IOException {
        try (FileChannel channel = new RandomAccessFile(path, "r").getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int) (channel.size())).order(ByteOrder.nativeOrder());
            byteBuffer.mark();
            channel.read(byteBuffer);
            byteBuffer.reset();
            return byteBuffer;
        }
    }
}
