/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public enum IPLDirectOcclusionMethod {
  IPL_DIRECTOCCLUSION_RAYCAST,
  IPL_DIRECTOCCLUSION_VOLUMETRIC;

  public final int swigValue() {
    return swigValue;
  }

  public static IPLDirectOcclusionMethod swigToEnum(int swigValue) {
    IPLDirectOcclusionMethod[] swigValues = IPLDirectOcclusionMethod.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IPLDirectOcclusionMethod swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IPLDirectOcclusionMethod.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IPLDirectOcclusionMethod() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IPLDirectOcclusionMethod(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IPLDirectOcclusionMethod(IPLDirectOcclusionMethod swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
