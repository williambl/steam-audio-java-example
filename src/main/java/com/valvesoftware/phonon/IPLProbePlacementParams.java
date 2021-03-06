/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public class IPLProbePlacementParams {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IPLProbePlacementParams(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IPLProbePlacementParams obj) {
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
        phononJNI.delete_IPLProbePlacementParams(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPlacement(IPLProbePlacement value) {
    phononJNI.IPLProbePlacementParams_placement_set(swigCPtr, this, value.swigValue());
  }

  public IPLProbePlacement getPlacement() {
    return IPLProbePlacement.swigToEnum(phononJNI.IPLProbePlacementParams_placement_get(swigCPtr, this));
  }

  public void setSpacing(float value) {
    phononJNI.IPLProbePlacementParams_spacing_set(swigCPtr, this, value);
  }

  public float getSpacing() {
    return phononJNI.IPLProbePlacementParams_spacing_get(swigCPtr, this);
  }

  public void setHeightAboveFloor(float value) {
    phononJNI.IPLProbePlacementParams_heightAboveFloor_set(swigCPtr, this, value);
  }

  public float getHeightAboveFloor() {
    return phononJNI.IPLProbePlacementParams_heightAboveFloor_get(swigCPtr, this);
  }

  public void setMaxOctreeTriangles(int value) {
    phononJNI.IPLProbePlacementParams_maxOctreeTriangles_set(swigCPtr, this, value);
  }

  public int getMaxOctreeTriangles() {
    return phononJNI.IPLProbePlacementParams_maxOctreeTriangles_get(swigCPtr, this);
  }

  public void setMaxOctreeDepth(int value) {
    phononJNI.IPLProbePlacementParams_maxOctreeDepth_set(swigCPtr, this, value);
  }

  public int getMaxOctreeDepth() {
    return phononJNI.IPLProbePlacementParams_maxOctreeDepth_get(swigCPtr, this);
  }

  public IPLProbePlacementParams() {
    this(phononJNI.new_IPLProbePlacementParams(), true);
  }

}
