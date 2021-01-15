/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public class IPLMaterial {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IPLMaterial(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IPLMaterial obj) {
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
        phononJNI.delete_IPLMaterial(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLowFreqAbsorption(float value) {
    phononJNI.IPLMaterial_lowFreqAbsorption_set(swigCPtr, this, value);
  }

  public float getLowFreqAbsorption() {
    return phononJNI.IPLMaterial_lowFreqAbsorption_get(swigCPtr, this);
  }

  public void setMidFreqAbsorption(float value) {
    phononJNI.IPLMaterial_midFreqAbsorption_set(swigCPtr, this, value);
  }

  public float getMidFreqAbsorption() {
    return phononJNI.IPLMaterial_midFreqAbsorption_get(swigCPtr, this);
  }

  public void setHighFreqAbsorption(float value) {
    phononJNI.IPLMaterial_highFreqAbsorption_set(swigCPtr, this, value);
  }

  public float getHighFreqAbsorption() {
    return phononJNI.IPLMaterial_highFreqAbsorption_get(swigCPtr, this);
  }

  public void setScattering(float value) {
    phononJNI.IPLMaterial_scattering_set(swigCPtr, this, value);
  }

  public float getScattering() {
    return phononJNI.IPLMaterial_scattering_get(swigCPtr, this);
  }

  public void setLowFreqTransmission(float value) {
    phononJNI.IPLMaterial_lowFreqTransmission_set(swigCPtr, this, value);
  }

  public float getLowFreqTransmission() {
    return phononJNI.IPLMaterial_lowFreqTransmission_get(swigCPtr, this);
  }

  public void setMidFreqTransmission(float value) {
    phononJNI.IPLMaterial_midFreqTransmission_set(swigCPtr, this, value);
  }

  public float getMidFreqTransmission() {
    return phononJNI.IPLMaterial_midFreqTransmission_get(swigCPtr, this);
  }

  public void setHighFreqTransmission(float value) {
    phononJNI.IPLMaterial_highFreqTransmission_set(swigCPtr, this, value);
  }

  public float getHighFreqTransmission() {
    return phononJNI.IPLMaterial_highFreqTransmission_get(swigCPtr, this);
  }

  public IPLMaterial() {
    this(phononJNI.new_IPLMaterial(), true);
  }

}