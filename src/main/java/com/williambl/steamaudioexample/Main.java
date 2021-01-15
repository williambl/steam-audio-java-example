package com.williambl.steamaudioexample;

import com.valvesoftware.phonon.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.channels.FileChannel;

import static com.valvesoftware.phonon.phonon.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.loadLibrary("phonon");
        System.loadLibrary("phononjni");

        FloatBuffer inaudio = readFile("inputAudio.raw").asFloatBuffer();

        int numframes = inaudio.remaining()/1024;

        SWIGTYPE_p_p_void context = phonon.new_IPLHandle();
        phonon.iplCreateContext(null, null, null, context);

        IPLRenderingSettings settings = new IPLRenderingSettings();
        settings.setSamplingRate(44100);
        settings.setFrameSize(1024);
        settings.setConvolutionType(IPLConvolutionType.IPL_CONVOLUTIONTYPE_PHONON);

        SWIGTYPE_p_p_void renderer = phonon.new_IPLHandle();
        IPLHrtfParams params = new IPLHrtfParams();
        params.setType(IPLHrtfDatabaseType.IPL_HRTFDATABASETYPE_DEFAULT);
        phonon.iplCreateBinauralRenderer(phonon.IPLHandle_value(context), settings, params, renderer);

        IPLAudioFormat mono = new IPLAudioFormat();
        mono.setChannelLayoutType(IPLChannelLayoutType.IPL_CHANNELLAYOUTTYPE_SPEAKERS);
        mono.setChannelLayout(IPLChannelLayout.IPL_CHANNELLAYOUT_MONO);
        mono.setChannelOrder(IPLChannelOrder.IPL_CHANNELORDER_INTERLEAVED);
        IPLAudioFormat stereo = new IPLAudioFormat();
        stereo.setChannelLayoutType(IPLChannelLayoutType.IPL_CHANNELLAYOUTTYPE_SPEAKERS);
        stereo.setChannelLayout(IPLChannelLayout.IPL_CHANNELLAYOUT_STEREO);
        stereo.setChannelOrder(IPLChannelOrder.IPL_CHANNELORDER_INTERLEAVED);

        SWIGTYPE_p_p_void effect = phonon.new_IPLHandle();

        phonon.iplCreateBinauralEffect(phonon.IPLHandle_value(renderer), mono, stereo, effect);

        IPLAudioBuffer inBuffer = new IPLAudioBuffer();
        inBuffer.setFormat(mono);
        inBuffer.setNumSamples(1024);
        inBuffer.setInterleavedBuffer(inaudio);

        FloatBuffer outputaudioframe = ByteBuffer.allocateDirect(2 * 1024).order(ByteOrder.nativeOrder()).asFloatBuffer();
        outputaudioframe.mark();

        FloatBuffer output = FloatBuffer.allocate(2 * 1024 * numframes);
        output.mark();

        IPLAudioBuffer outBuffer = new IPLAudioBuffer();
        outBuffer.setFormat(stereo);
        outBuffer.setNumSamples(1024);
        outBuffer.setInterleavedBuffer(outputaudioframe);

        IPLVector3 direction = new IPLVector3();
        direction.setX(1f);
        direction.setY(1f);
        direction.setZ(1f);

        for (int i = 0; i < numframes; ++i) {
            System.out.println(i);
            iplApplyBinauralEffect(IPLHandle_value(effect), IPLHandle_value(renderer), inBuffer, direction, IPLHrtfInterpolation.IPL_HRTFINTERPOLATION_NEAREST, 0f, outBuffer);
            outputaudioframe.reset();
            output.put(outputaudioframe);
            inaudio.position(inaudio.position()+1024);
            if (inaudio.remaining() >= 1024)
                inBuffer.setInterleavedBuffer(inaudio.slice());
        }

        System.out.println("going to clean up now.");

        iplDestroyBinauralEffect(effect);
        System.out.println(1);
        iplDestroyBinauralRenderer(renderer);
        System.out.println(2);
        iplDestroyContext(context);
        System.out.println(3);
        iplCleanup();
        System.out.println("done");

        ByteBuffer outputBytes = ByteBuffer.allocate(output.capacity()*4);
        System.out.println("outbut buffer allocated");
        output.reset();
        System.out.println("set pos");
        outputBytes.mark();
        System.out.println("marked");
        outputBytes.asFloatBuffer().put(output);
        System.out.println("written to buffer");
        outputBytes.reset();
        System.out.println("reset buffer");

        try (FileChannel channel = new FileOutputStream(new File("output.raw"), false).getChannel()) {
            channel.write(outputBytes);
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
