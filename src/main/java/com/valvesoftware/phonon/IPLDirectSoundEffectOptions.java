/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public class IPLDirectSoundEffectOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IPLDirectSoundEffectOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IPLDirectSoundEffectOptions obj) {
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
        phononJNI.delete_IPLDirectSoundEffectOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setApplyDistanceAttenuation(boolean value) {
    phononJNI.IPLDirectSoundEffectOptions_applyDistanceAttenuation_set(swigCPtr, this, value);
  }

  public boolean getApplyDistanceAttenuation() {
    return phononJNI.IPLDirectSoundEffectOptions_applyDistanceAttenuation_get(swigCPtr, this);
  }

  public void setApplyAirAbsorption(boolean value) {
    phononJNI.IPLDirectSoundEffectOptions_applyAirAbsorption_set(swigCPtr, this, value);
  }

  public boolean getApplyAirAbsorption() {
    return phononJNI.IPLDirectSoundEffectOptions_applyAirAbsorption_get(swigCPtr, this);
  }

  public void setApplyDirectivity(boolean value) {
    phononJNI.IPLDirectSoundEffectOptions_applyDirectivity_set(swigCPtr, this, value);
  }

  public boolean getApplyDirectivity() {
    return phononJNI.IPLDirectSoundEffectOptions_applyDirectivity_get(swigCPtr, this);
  }

  public void setDirectOcclusionMode(IPLDirectOcclusionMode value) {
    phononJNI.IPLDirectSoundEffectOptions_directOcclusionMode_set(swigCPtr, this, value.swigValue());
  }

  public IPLDirectOcclusionMode getDirectOcclusionMode() {
    return IPLDirectOcclusionMode.swigToEnum(phononJNI.IPLDirectSoundEffectOptions_directOcclusionMode_get(swigCPtr, this));
  }

  public IPLDirectSoundEffectOptions() {
    this(phononJNI.new_IPLDirectSoundEffectOptions(), true);
  }

}
