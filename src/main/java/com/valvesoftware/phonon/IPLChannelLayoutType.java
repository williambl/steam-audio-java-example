/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public enum IPLChannelLayoutType {
  IPL_CHANNELLAYOUTTYPE_SPEAKERS,
  IPL_CHANNELLAYOUTTYPE_AMBISONICS;

  public final int swigValue() {
    return swigValue;
  }

  public static IPLChannelLayoutType swigToEnum(int swigValue) {
    IPLChannelLayoutType[] swigValues = IPLChannelLayoutType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IPLChannelLayoutType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IPLChannelLayoutType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IPLChannelLayoutType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IPLChannelLayoutType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IPLChannelLayoutType(IPLChannelLayoutType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

