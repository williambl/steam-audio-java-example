/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public enum IPLAmbisonicsNormalization {
  IPL_AMBISONICSNORMALIZATION_FURSEMALHAM,
  IPL_AMBISONICSNORMALIZATION_SN3D,
  IPL_AMBISONICSNORMALIZATION_N3D;

  public final int swigValue() {
    return swigValue;
  }

  public static IPLAmbisonicsNormalization swigToEnum(int swigValue) {
    IPLAmbisonicsNormalization[] swigValues = IPLAmbisonicsNormalization.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IPLAmbisonicsNormalization swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IPLAmbisonicsNormalization.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IPLAmbisonicsNormalization() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IPLAmbisonicsNormalization(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IPLAmbisonicsNormalization(IPLAmbisonicsNormalization swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

