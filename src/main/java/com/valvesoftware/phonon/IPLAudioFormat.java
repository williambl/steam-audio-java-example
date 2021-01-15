/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public class IPLAudioFormat {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IPLAudioFormat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IPLAudioFormat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        phononJNI.delete_IPLAudioFormat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setChannelLayoutType(IPLChannelLayoutType value) {
    phononJNI.IPLAudioFormat_channelLayoutType_set(swigCPtr, this, value.swigValue());
  }

  public IPLChannelLayoutType getChannelLayoutType() {
    return IPLChannelLayoutType.swigToEnum(phononJNI.IPLAudioFormat_channelLayoutType_get(swigCPtr, this));
  }

  public void setChannelLayout(IPLChannelLayout value) {
    phononJNI.IPLAudioFormat_channelLayout_set(swigCPtr, this, value.swigValue());
  }

  public IPLChannelLayout getChannelLayout() {
    return IPLChannelLayout.swigToEnum(phononJNI.IPLAudioFormat_channelLayout_get(swigCPtr, this));
  }

  public void setNumSpeakers(int value) {
    phononJNI.IPLAudioFormat_numSpeakers_set(swigCPtr, this, value);
  }

  public int getNumSpeakers() {
    return phononJNI.IPLAudioFormat_numSpeakers_get(swigCPtr, this);
  }

  public void setSpeakerDirections(IPLVector3 value) {
    phononJNI.IPLAudioFormat_speakerDirections_set(swigCPtr, this, IPLVector3.getCPtr(value), value);
  }

  public IPLVector3 getSpeakerDirections() {
    long cPtr = phononJNI.IPLAudioFormat_speakerDirections_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IPLVector3(cPtr, false);
  }

  public void setAmbisonicsOrder(int value) {
    phononJNI.IPLAudioFormat_ambisonicsOrder_set(swigCPtr, this, value);
  }

  public int getAmbisonicsOrder() {
    return phononJNI.IPLAudioFormat_ambisonicsOrder_get(swigCPtr, this);
  }

  public void setAmbisonicsOrdering(IPLAmbisonicsOrdering value) {
    phononJNI.IPLAudioFormat_ambisonicsOrdering_set(swigCPtr, this, value.swigValue());
  }

  public IPLAmbisonicsOrdering getAmbisonicsOrdering() {
    return IPLAmbisonicsOrdering.swigToEnum(phononJNI.IPLAudioFormat_ambisonicsOrdering_get(swigCPtr, this));
  }

  public void setAmbisonicsNormalization(IPLAmbisonicsNormalization value) {
    phononJNI.IPLAudioFormat_ambisonicsNormalization_set(swigCPtr, this, value.swigValue());
  }

  public IPLAmbisonicsNormalization getAmbisonicsNormalization() {
    return IPLAmbisonicsNormalization.swigToEnum(phononJNI.IPLAudioFormat_ambisonicsNormalization_get(swigCPtr, this));
  }

  public void setChannelOrder(IPLChannelOrder value) {
    phononJNI.IPLAudioFormat_channelOrder_set(swigCPtr, this, value.swigValue());
  }

  public IPLChannelOrder getChannelOrder() {
    return IPLChannelOrder.swigToEnum(phononJNI.IPLAudioFormat_channelOrder_get(swigCPtr, this));
  }

  public IPLAudioFormat() {
    this(phononJNI.new_IPLAudioFormat(), true);
  }

}
