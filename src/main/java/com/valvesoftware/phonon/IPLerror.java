/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public enum IPLerror {
  IPL_STATUS_SUCCESS,
  IPL_STATUS_FAILURE,
  IPL_STATUS_OUTOFMEMORY,
  IPL_STATUS_INITIALIZATION;

  public final int swigValue() {
    return swigValue;
  }

  public static IPLerror swigToEnum(int swigValue) {
    IPLerror[] swigValues = IPLerror.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IPLerror swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IPLerror.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IPLerror() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IPLerror(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IPLerror(IPLerror swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

