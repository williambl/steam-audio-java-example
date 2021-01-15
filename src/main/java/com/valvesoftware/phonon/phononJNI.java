/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public class phononJNI {
  public final static native long new_IPLHandle();
  public final static native long copy_IPLHandle(long jarg1);
  public final static native void delete_IPLHandle(long jarg1);
  public final static native void IPLHandle_assign(long jarg1, long jarg2);
  public final static native long IPLHandle_value(long jarg1);
  public final static native int iplCreateContext(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void iplDestroyContext(long jarg1);
  public final static native void iplCleanup();
  public final static native void IPLVector3_x_set(long jarg1, IPLVector3 jarg1_, float jarg2);
  public final static native float IPLVector3_x_get(long jarg1, IPLVector3 jarg1_);
  public final static native void IPLVector3_y_set(long jarg1, IPLVector3 jarg1_, float jarg2);
  public final static native float IPLVector3_y_get(long jarg1, IPLVector3 jarg1_);
  public final static native void IPLVector3_z_set(long jarg1, IPLVector3 jarg1_, float jarg2);
  public final static native float IPLVector3_z_get(long jarg1, IPLVector3 jarg1_);
  public final static native long new_IPLVector3();
  public final static native void delete_IPLVector3(long jarg1);
  public final static native void IPLBox_minCoordinates_set(long jarg1, IPLBox jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLBox_minCoordinates_get(long jarg1, IPLBox jarg1_);
  public final static native void IPLBox_maxCoordinates_set(long jarg1, IPLBox jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLBox_maxCoordinates_get(long jarg1, IPLBox jarg1_);
  public final static native long new_IPLBox();
  public final static native void delete_IPLBox(long jarg1);
  public final static native void IPLSphere_center_set(long jarg1, IPLSphere jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLSphere_center_get(long jarg1, IPLSphere jarg1_);
  public final static native void IPLSphere_radius_set(long jarg1, IPLSphere jarg1_, float jarg2);
  public final static native float IPLSphere_radius_get(long jarg1, IPLSphere jarg1_);
  public final static native long new_IPLSphere();
  public final static native void delete_IPLSphere(long jarg1);
  public final static native long iplCalculateRelativeDirection(long jarg1, IPLVector3 jarg1_, long jarg2, IPLVector3 jarg2_, long jarg3, IPLVector3 jarg3_, long jarg4, IPLVector3 jarg4_);
  public final static native void IPLComputeDeviceFilter_type_set(long jarg1, IPLComputeDeviceFilter jarg1_, int jarg2);
  public final static native int IPLComputeDeviceFilter_type_get(long jarg1, IPLComputeDeviceFilter jarg1_);
  public final static native void IPLComputeDeviceFilter_maxCUsToReserve_set(long jarg1, IPLComputeDeviceFilter jarg1_, int jarg2);
  public final static native int IPLComputeDeviceFilter_maxCUsToReserve_get(long jarg1, IPLComputeDeviceFilter jarg1_);
  public final static native void IPLComputeDeviceFilter_fractionCUsForIRUpdate_set(long jarg1, IPLComputeDeviceFilter jarg1_, float jarg2);
  public final static native float IPLComputeDeviceFilter_fractionCUsForIRUpdate_get(long jarg1, IPLComputeDeviceFilter jarg1_);
  public final static native long new_IPLComputeDeviceFilter();
  public final static native void delete_IPLComputeDeviceFilter(long jarg1);
  public final static native int iplCreateComputeDevice(long jarg1, long jarg2, IPLComputeDeviceFilter jarg2_, long jarg3);
  public final static native void iplDestroyComputeDevice(long jarg1);
  public final static native void IPLSimulationSettings_sceneType_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_sceneType_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_maxNumOcclusionSamples_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_maxNumOcclusionSamples_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_numRays_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_numRays_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_numDiffuseSamples_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_numDiffuseSamples_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_numBounces_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_numBounces_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_numThreads_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_numThreads_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_irDuration_set(long jarg1, IPLSimulationSettings jarg1_, float jarg2);
  public final static native float IPLSimulationSettings_irDuration_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_ambisonicsOrder_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_ambisonicsOrder_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_maxConvolutionSources_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_maxConvolutionSources_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_bakingBatchSize_set(long jarg1, IPLSimulationSettings jarg1_, int jarg2);
  public final static native int IPLSimulationSettings_bakingBatchSize_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native void IPLSimulationSettings_irradianceMinDistance_set(long jarg1, IPLSimulationSettings jarg1_, float jarg2);
  public final static native float IPLSimulationSettings_irradianceMinDistance_get(long jarg1, IPLSimulationSettings jarg1_);
  public final static native long new_IPLSimulationSettings();
  public final static native void delete_IPLSimulationSettings(long jarg1);
  public final static native void IPLTriangle_indices_set(long jarg1, IPLTriangle jarg1_, int[] jarg2);
  public final static native int[] IPLTriangle_indices_get(long jarg1, IPLTriangle jarg1_);
  public final static native long new_IPLTriangle();
  public final static native void delete_IPLTriangle(long jarg1);
  public final static native void IPLMaterial_lowFreqAbsorption_set(long jarg1, IPLMaterial jarg1_, float jarg2);
  public final static native float IPLMaterial_lowFreqAbsorption_get(long jarg1, IPLMaterial jarg1_);
  public final static native void IPLMaterial_midFreqAbsorption_set(long jarg1, IPLMaterial jarg1_, float jarg2);
  public final static native float IPLMaterial_midFreqAbsorption_get(long jarg1, IPLMaterial jarg1_);
  public final static native void IPLMaterial_highFreqAbsorption_set(long jarg1, IPLMaterial jarg1_, float jarg2);
  public final static native float IPLMaterial_highFreqAbsorption_get(long jarg1, IPLMaterial jarg1_);
  public final static native void IPLMaterial_scattering_set(long jarg1, IPLMaterial jarg1_, float jarg2);
  public final static native float IPLMaterial_scattering_get(long jarg1, IPLMaterial jarg1_);
  public final static native void IPLMaterial_lowFreqTransmission_set(long jarg1, IPLMaterial jarg1_, float jarg2);
  public final static native float IPLMaterial_lowFreqTransmission_get(long jarg1, IPLMaterial jarg1_);
  public final static native void IPLMaterial_midFreqTransmission_set(long jarg1, IPLMaterial jarg1_, float jarg2);
  public final static native float IPLMaterial_midFreqTransmission_get(long jarg1, IPLMaterial jarg1_);
  public final static native void IPLMaterial_highFreqTransmission_set(long jarg1, IPLMaterial jarg1_, float jarg2);
  public final static native float IPLMaterial_highFreqTransmission_get(long jarg1, IPLMaterial jarg1_);
  public final static native long new_IPLMaterial();
  public final static native void delete_IPLMaterial(long jarg1);
  public final static native int iplCreateScene(long jarg1, long jarg2, int jarg3, int jarg4, long jarg5, IPLMaterial jarg5_, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10, long jarg11);
  public final static native void iplDestroyScene(long jarg1);
  public final static native int iplCreateStaticMesh(long jarg1, int jarg2, int jarg3, long jarg4, IPLVector3 jarg4_, long jarg5, IPLTriangle jarg5_, java.nio.IntBuffer jarg6, long jarg7);
  public final static native void iplDestroyStaticMesh(long jarg1);
  public final static native int iplSaveScene(long jarg1, long jarg2);
  public final static native int iplLoadScene(long jarg1, int jarg2, long jarg3, int jarg4, long jarg5, long jarg6, long jarg7);
  public final static native void iplSaveSceneAsObj(long jarg1, String jarg2);
  public final static native void IPLMatrix4x4_elements_set(long jarg1, IPLMatrix4x4 jarg1_, long jarg2);
  public final static native long IPLMatrix4x4_elements_get(long jarg1, IPLMatrix4x4 jarg1_);
  public final static native long new_IPLMatrix4x4();
  public final static native void delete_IPLMatrix4x4(long jarg1);
  public final static native int iplCreateInstancedMesh(long jarg1, long jarg2, long jarg3, IPLMatrix4x4 jarg3_, long jarg4);
  public final static native void iplDestroyInstancedMesh(long jarg1);
  public final static native void iplAddInstancedMesh(long jarg1, long jarg2);
  public final static native void iplRemoveInstancedMesh(long jarg1, long jarg2);
  public final static native void iplUpdateInstancedMeshTransform(long jarg1, long jarg2, IPLMatrix4x4 jarg2_);
  public final static native void iplCommitScene(long jarg1);
  public final static native int iplCreateEnvironment(long jarg1, long jarg2, long jarg3, IPLSimulationSettings jarg3_, long jarg4, long jarg5, long jarg6);
  public final static native void iplDestroyEnvironment(long jarg1);
  public final static native void iplSetNumBounces(long jarg1, int jarg2);
  public final static native void IPLRenderingSettings_samplingRate_set(long jarg1, IPLRenderingSettings jarg1_, int jarg2);
  public final static native int IPLRenderingSettings_samplingRate_get(long jarg1, IPLRenderingSettings jarg1_);
  public final static native void IPLRenderingSettings_frameSize_set(long jarg1, IPLRenderingSettings jarg1_, int jarg2);
  public final static native int IPLRenderingSettings_frameSize_get(long jarg1, IPLRenderingSettings jarg1_);
  public final static native void IPLRenderingSettings_convolutionType_set(long jarg1, IPLRenderingSettings jarg1_, int jarg2);
  public final static native int IPLRenderingSettings_convolutionType_get(long jarg1, IPLRenderingSettings jarg1_);
  public final static native long new_IPLRenderingSettings();
  public final static native void delete_IPLRenderingSettings(long jarg1);
  public final static native void IPLAudioFormat_channelLayoutType_set(long jarg1, IPLAudioFormat jarg1_, int jarg2);
  public final static native int IPLAudioFormat_channelLayoutType_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native void IPLAudioFormat_channelLayout_set(long jarg1, IPLAudioFormat jarg1_, int jarg2);
  public final static native int IPLAudioFormat_channelLayout_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native void IPLAudioFormat_numSpeakers_set(long jarg1, IPLAudioFormat jarg1_, int jarg2);
  public final static native int IPLAudioFormat_numSpeakers_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native void IPLAudioFormat_speakerDirections_set(long jarg1, IPLAudioFormat jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLAudioFormat_speakerDirections_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native void IPLAudioFormat_ambisonicsOrder_set(long jarg1, IPLAudioFormat jarg1_, int jarg2);
  public final static native int IPLAudioFormat_ambisonicsOrder_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native void IPLAudioFormat_ambisonicsOrdering_set(long jarg1, IPLAudioFormat jarg1_, int jarg2);
  public final static native int IPLAudioFormat_ambisonicsOrdering_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native void IPLAudioFormat_ambisonicsNormalization_set(long jarg1, IPLAudioFormat jarg1_, int jarg2);
  public final static native int IPLAudioFormat_ambisonicsNormalization_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native void IPLAudioFormat_channelOrder_set(long jarg1, IPLAudioFormat jarg1_, int jarg2);
  public final static native int IPLAudioFormat_channelOrder_get(long jarg1, IPLAudioFormat jarg1_);
  public final static native long new_IPLAudioFormat();
  public final static native void delete_IPLAudioFormat(long jarg1);
  public final static native void IPLAudioBuffer_format_set(long jarg1, IPLAudioBuffer jarg1_, long jarg2, IPLAudioFormat jarg2_);
  public final static native long IPLAudioBuffer_format_get(long jarg1, IPLAudioBuffer jarg1_);
  public final static native void IPLAudioBuffer_numSamples_set(long jarg1, IPLAudioBuffer jarg1_, int jarg2);
  public final static native int IPLAudioBuffer_numSamples_get(long jarg1, IPLAudioBuffer jarg1_);
  public final static native void IPLAudioBuffer_interleavedBuffer_set(long jarg1, IPLAudioBuffer jarg1_, java.nio.FloatBuffer jarg2);
  public final static native java.nio.FloatBuffer IPLAudioBuffer_interleavedBuffer_get(long jarg1, IPLAudioBuffer jarg1_);
  public final static native void IPLAudioBuffer_deinterleavedBuffer_set(long jarg1, IPLAudioBuffer jarg1_, long jarg2);
  public final static native long IPLAudioBuffer_deinterleavedBuffer_get(long jarg1, IPLAudioBuffer jarg1_);
  public final static native long new_IPLAudioBuffer();
  public final static native void delete_IPLAudioBuffer(long jarg1);
  public final static native void iplMixAudioBuffers(int jarg1, long jarg2, IPLAudioBuffer jarg2_, long jarg3, IPLAudioBuffer jarg3_);
  public final static native void iplInterleaveAudioBuffer(long jarg1, IPLAudioBuffer jarg1_, long jarg2, IPLAudioBuffer jarg2_);
  public final static native void iplDeinterleaveAudioBuffer(long jarg1, IPLAudioBuffer jarg1_, long jarg2, IPLAudioBuffer jarg2_);
  public final static native void iplConvertAudioBufferFormat(long jarg1, IPLAudioBuffer jarg1_, long jarg2, IPLAudioBuffer jarg2_);
  public final static native int iplCreateAmbisonicsRotator(long jarg1, int jarg2, long jarg3);
  public final static native void iplDestroyAmbisonicsRotator(long jarg1);
  public final static native void iplSetAmbisonicsRotation(long jarg1, long jarg2, IPLVector3 jarg2_, long jarg3, IPLVector3 jarg3_);
  public final static native void iplRotateAmbisonicsAudioBuffer(long jarg1, long jarg2, IPLAudioBuffer jarg2_, long jarg3, IPLAudioBuffer jarg3_);
  public final static native void IPLHrtfParams_type_set(long jarg1, IPLHrtfParams jarg1_, int jarg2);
  public final static native int IPLHrtfParams_type_get(long jarg1, IPLHrtfParams jarg1_);
  public final static native void IPLHrtfParams_hrtfData_set(long jarg1, IPLHrtfParams jarg1_, long jarg2);
  public final static native long IPLHrtfParams_hrtfData_get(long jarg1, IPLHrtfParams jarg1_);
  public final static native void IPLHrtfParams_sofaFileName_set(long jarg1, IPLHrtfParams jarg1_, String jarg2);
  public final static native String IPLHrtfParams_sofaFileName_get(long jarg1, IPLHrtfParams jarg1_);
  public final static native long new_IPLHrtfParams();
  public final static native void delete_IPLHrtfParams(long jarg1);
  public final static native int iplCreateBinauralRenderer(long jarg1, long jarg2, IPLRenderingSettings jarg2_, long jarg3, IPLHrtfParams jarg3_, long jarg4);
  public final static native void iplDestroyBinauralRenderer(long jarg1);
  public final static native int iplCreatePanningEffect(long jarg1, long jarg2, IPLAudioFormat jarg2_, long jarg3, IPLAudioFormat jarg3_, long jarg4);
  public final static native void iplDestroyPanningEffect(long jarg1);
  public final static native void iplApplyPanningEffect(long jarg1, long jarg2, long jarg3, IPLAudioBuffer jarg3_, long jarg4, IPLVector3 jarg4_, long jarg5, IPLAudioBuffer jarg5_);
  public final static native void iplFlushPanningEffect(long jarg1);
  public final static native int iplCreateBinauralEffect(long jarg1, long jarg2, IPLAudioFormat jarg2_, long jarg3, IPLAudioFormat jarg3_, long jarg4);
  public final static native void iplDestroyBinauralEffect(long jarg1);
  public final static native void iplApplyBinauralEffect(long jarg1, long jarg2, long jarg3, IPLAudioBuffer jarg3_, long jarg4, IPLVector3 jarg4_, int jarg5, float jarg6, long jarg7, IPLAudioBuffer jarg7_);
  public final static native void iplApplyBinauralEffectWithParameters(long jarg1, long jarg2, long jarg3, IPLAudioBuffer jarg3_, long jarg4, IPLVector3 jarg4_, int jarg5, boolean jarg6, float jarg7, long jarg8, IPLAudioBuffer jarg8_, java.nio.FloatBuffer jarg9, java.nio.FloatBuffer jarg10);
  public final static native void iplFlushBinauralEffect(long jarg1);
  public final static native int iplCreateVirtualSurroundEffect(long jarg1, long jarg2, IPLAudioFormat jarg2_, long jarg3, IPLAudioFormat jarg3_, long jarg4);
  public final static native void iplDestroyVirtualSurroundEffect(long jarg1);
  public final static native void iplApplyVirtualSurroundEffect(long jarg1, long jarg2, long jarg3, IPLAudioBuffer jarg3_, long jarg4, IPLAudioBuffer jarg4_);
  public final static native void iplFlushVirtualSurroundEffect(long jarg1);
  public final static native int iplCreateAmbisonicsPanningEffect(long jarg1, long jarg2, IPLAudioFormat jarg2_, long jarg3, IPLAudioFormat jarg3_, long jarg4);
  public final static native void iplDestroyAmbisonicsPanningEffect(long jarg1);
  public final static native void iplApplyAmbisonicsPanningEffect(long jarg1, long jarg2, long jarg3, IPLAudioBuffer jarg3_, long jarg4, IPLAudioBuffer jarg4_);
  public final static native void iplFlushAmbisonicsPanningEffect(long jarg1);
  public final static native int iplCreateAmbisonicsBinauralEffect(long jarg1, long jarg2, IPLAudioFormat jarg2_, long jarg3, IPLAudioFormat jarg3_, long jarg4);
  public final static native void iplDestroyAmbisonicsBinauralEffect(long jarg1);
  public final static native void iplApplyAmbisonicsBinauralEffect(long jarg1, long jarg2, long jarg3, IPLAudioBuffer jarg3_, long jarg4, IPLAudioBuffer jarg4_);
  public final static native void iplFlushAmbisonicsBinauralEffect(long jarg1);
  public final static native int iplCreateEnvironmentalRenderer(long jarg1, long jarg2, long jarg3, IPLRenderingSettings jarg3_, long jarg4, IPLAudioFormat jarg4_, long jarg5, long jarg6, long jarg7);
  public final static native void iplDestroyEnvironmentalRenderer(long jarg1);
  public final static native long iplGetEnvironmentForRenderer(long jarg1);
  public final static native void IPLDistanceAttenuationModel_type_set(long jarg1, IPLDistanceAttenuationModel jarg1_, int jarg2);
  public final static native int IPLDistanceAttenuationModel_type_get(long jarg1, IPLDistanceAttenuationModel jarg1_);
  public final static native void IPLDistanceAttenuationModel_minDistance_set(long jarg1, IPLDistanceAttenuationModel jarg1_, float jarg2);
  public final static native float IPLDistanceAttenuationModel_minDistance_get(long jarg1, IPLDistanceAttenuationModel jarg1_);
  public final static native void IPLDistanceAttenuationModel_callback_set(long jarg1, IPLDistanceAttenuationModel jarg1_, long jarg2);
  public final static native long IPLDistanceAttenuationModel_callback_get(long jarg1, IPLDistanceAttenuationModel jarg1_);
  public final static native void IPLDistanceAttenuationModel_userData_set(long jarg1, IPLDistanceAttenuationModel jarg1_, long jarg2);
  public final static native long IPLDistanceAttenuationModel_userData_get(long jarg1, IPLDistanceAttenuationModel jarg1_);
  public final static native void IPLDistanceAttenuationModel_dirty_set(long jarg1, IPLDistanceAttenuationModel jarg1_, boolean jarg2);
  public final static native boolean IPLDistanceAttenuationModel_dirty_get(long jarg1, IPLDistanceAttenuationModel jarg1_);
  public final static native long new_IPLDistanceAttenuationModel();
  public final static native void delete_IPLDistanceAttenuationModel(long jarg1);
  public final static native void IPLAirAbsorptionModel_type_set(long jarg1, IPLAirAbsorptionModel jarg1_, int jarg2);
  public final static native int IPLAirAbsorptionModel_type_get(long jarg1, IPLAirAbsorptionModel jarg1_);
  public final static native void IPLAirAbsorptionModel_coefficients_set(long jarg1, IPLAirAbsorptionModel jarg1_, float[] jarg2);
  public final static native float[] IPLAirAbsorptionModel_coefficients_get(long jarg1, IPLAirAbsorptionModel jarg1_);
  public final static native void IPLAirAbsorptionModel_callback_set(long jarg1, IPLAirAbsorptionModel jarg1_, long jarg2);
  public final static native long IPLAirAbsorptionModel_callback_get(long jarg1, IPLAirAbsorptionModel jarg1_);
  public final static native void IPLAirAbsorptionModel_userData_set(long jarg1, IPLAirAbsorptionModel jarg1_, long jarg2);
  public final static native long IPLAirAbsorptionModel_userData_get(long jarg1, IPLAirAbsorptionModel jarg1_);
  public final static native void IPLAirAbsorptionModel_dirty_set(long jarg1, IPLAirAbsorptionModel jarg1_, boolean jarg2);
  public final static native boolean IPLAirAbsorptionModel_dirty_get(long jarg1, IPLAirAbsorptionModel jarg1_);
  public final static native long new_IPLAirAbsorptionModel();
  public final static native void delete_IPLAirAbsorptionModel(long jarg1);
  public final static native void IPLDirectSoundPath_direction_set(long jarg1, IPLDirectSoundPath jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLDirectSoundPath_direction_get(long jarg1, IPLDirectSoundPath jarg1_);
  public final static native void IPLDirectSoundPath_distanceAttenuation_set(long jarg1, IPLDirectSoundPath jarg1_, float jarg2);
  public final static native float IPLDirectSoundPath_distanceAttenuation_get(long jarg1, IPLDirectSoundPath jarg1_);
  public final static native void IPLDirectSoundPath_airAbsorption_set(long jarg1, IPLDirectSoundPath jarg1_, float[] jarg2);
  public final static native float[] IPLDirectSoundPath_airAbsorption_get(long jarg1, IPLDirectSoundPath jarg1_);
  public final static native void IPLDirectSoundPath_propagationDelay_set(long jarg1, IPLDirectSoundPath jarg1_, float jarg2);
  public final static native float IPLDirectSoundPath_propagationDelay_get(long jarg1, IPLDirectSoundPath jarg1_);
  public final static native void IPLDirectSoundPath_occlusionFactor_set(long jarg1, IPLDirectSoundPath jarg1_, float jarg2);
  public final static native float IPLDirectSoundPath_occlusionFactor_get(long jarg1, IPLDirectSoundPath jarg1_);
  public final static native void IPLDirectSoundPath_transmissionFactor_set(long jarg1, IPLDirectSoundPath jarg1_, float[] jarg2);
  public final static native float[] IPLDirectSoundPath_transmissionFactor_get(long jarg1, IPLDirectSoundPath jarg1_);
  public final static native void IPLDirectSoundPath_directivityFactor_set(long jarg1, IPLDirectSoundPath jarg1_, float jarg2);
  public final static native float IPLDirectSoundPath_directivityFactor_get(long jarg1, IPLDirectSoundPath jarg1_);
  public final static native long new_IPLDirectSoundPath();
  public final static native void delete_IPLDirectSoundPath(long jarg1);
  public final static native void IPLDirectivity_dipoleWeight_set(long jarg1, IPLDirectivity jarg1_, float jarg2);
  public final static native float IPLDirectivity_dipoleWeight_get(long jarg1, IPLDirectivity jarg1_);
  public final static native void IPLDirectivity_dipolePower_set(long jarg1, IPLDirectivity jarg1_, float jarg2);
  public final static native float IPLDirectivity_dipolePower_get(long jarg1, IPLDirectivity jarg1_);
  public final static native void IPLDirectivity_callback_set(long jarg1, IPLDirectivity jarg1_, long jarg2);
  public final static native long IPLDirectivity_callback_get(long jarg1, IPLDirectivity jarg1_);
  public final static native void IPLDirectivity_userData_set(long jarg1, IPLDirectivity jarg1_, long jarg2);
  public final static native long IPLDirectivity_userData_get(long jarg1, IPLDirectivity jarg1_);
  public final static native long new_IPLDirectivity();
  public final static native void delete_IPLDirectivity(long jarg1);
  public final static native void IPLSource_position_set(long jarg1, IPLSource jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLSource_position_get(long jarg1, IPLSource jarg1_);
  public final static native void IPLSource_ahead_set(long jarg1, IPLSource jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLSource_ahead_get(long jarg1, IPLSource jarg1_);
  public final static native void IPLSource_up_set(long jarg1, IPLSource jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLSource_up_get(long jarg1, IPLSource jarg1_);
  public final static native void IPLSource_right_set(long jarg1, IPLSource jarg1_, long jarg2, IPLVector3 jarg2_);
  public final static native long IPLSource_right_get(long jarg1, IPLSource jarg1_);
  public final static native void IPLSource_directivity_set(long jarg1, IPLSource jarg1_, long jarg2, IPLDirectivity jarg2_);
  public final static native long IPLSource_directivity_get(long jarg1, IPLSource jarg1_);
  public final static native void IPLSource_distanceAttenuationModel_set(long jarg1, IPLSource jarg1_, long jarg2, IPLDistanceAttenuationModel jarg2_);
  public final static native long IPLSource_distanceAttenuationModel_get(long jarg1, IPLSource jarg1_);
  public final static native void IPLSource_airAbsorptionModel_set(long jarg1, IPLSource jarg1_, long jarg2, IPLAirAbsorptionModel jarg2_);
  public final static native long IPLSource_airAbsorptionModel_get(long jarg1, IPLSource jarg1_);
  public final static native long new_IPLSource();
  public final static native void delete_IPLSource(long jarg1);
  public final static native long iplGetDirectSoundPath(long jarg1, long jarg2, IPLVector3 jarg2_, long jarg3, IPLVector3 jarg3_, long jarg4, IPLVector3 jarg4_, long jarg5, IPLSource jarg5_, float jarg6, int jarg7, int jarg8, int jarg9);
  public final static native void IPLDirectSoundEffectOptions_applyDistanceAttenuation_set(long jarg1, IPLDirectSoundEffectOptions jarg1_, boolean jarg2);
  public final static native boolean IPLDirectSoundEffectOptions_applyDistanceAttenuation_get(long jarg1, IPLDirectSoundEffectOptions jarg1_);
  public final static native void IPLDirectSoundEffectOptions_applyAirAbsorption_set(long jarg1, IPLDirectSoundEffectOptions jarg1_, boolean jarg2);
  public final static native boolean IPLDirectSoundEffectOptions_applyAirAbsorption_get(long jarg1, IPLDirectSoundEffectOptions jarg1_);
  public final static native void IPLDirectSoundEffectOptions_applyDirectivity_set(long jarg1, IPLDirectSoundEffectOptions jarg1_, boolean jarg2);
  public final static native boolean IPLDirectSoundEffectOptions_applyDirectivity_get(long jarg1, IPLDirectSoundEffectOptions jarg1_);
  public final static native void IPLDirectSoundEffectOptions_directOcclusionMode_set(long jarg1, IPLDirectSoundEffectOptions jarg1_, int jarg2);
  public final static native int IPLDirectSoundEffectOptions_directOcclusionMode_get(long jarg1, IPLDirectSoundEffectOptions jarg1_);
  public final static native long new_IPLDirectSoundEffectOptions();
  public final static native void delete_IPLDirectSoundEffectOptions(long jarg1);
  public final static native int iplCreateDirectSoundEffect(long jarg1, IPLAudioFormat jarg1_, long jarg2, IPLAudioFormat jarg2_, long jarg3, IPLRenderingSettings jarg3_, long jarg4);
  public final static native void iplDestroyDirectSoundEffect(long jarg1);
  public final static native void iplApplyDirectSoundEffect(long jarg1, long jarg2, IPLAudioBuffer jarg2_, long jarg3, IPLDirectSoundPath jarg3_, long jarg4, IPLDirectSoundEffectOptions jarg4_, long jarg5, IPLAudioBuffer jarg5_);
  public final static native void iplFlushDirectSoundEffect(long jarg1);
  public final static native void IPLBakedDataIdentifier_identifier_set(long jarg1, IPLBakedDataIdentifier jarg1_, int jarg2);
  public final static native int IPLBakedDataIdentifier_identifier_get(long jarg1, IPLBakedDataIdentifier jarg1_);
  public final static native void IPLBakedDataIdentifier_type_set(long jarg1, IPLBakedDataIdentifier jarg1_, int jarg2);
  public final static native int IPLBakedDataIdentifier_type_get(long jarg1, IPLBakedDataIdentifier jarg1_);
  public final static native long new_IPLBakedDataIdentifier();
  public final static native void delete_IPLBakedDataIdentifier(long jarg1);
  public final static native int iplCreateConvolutionEffect(long jarg1, long jarg2, IPLBakedDataIdentifier jarg2_, int jarg3, long jarg4, IPLAudioFormat jarg4_, long jarg5, IPLAudioFormat jarg5_, long jarg6);
  public final static native void iplDestroyConvolutionEffect(long jarg1);
  public final static native void iplSetConvolutionEffectIdentifier(long jarg1, long jarg2, IPLBakedDataIdentifier jarg2_);
  public final static native void iplSetDryAudioForConvolutionEffect(long jarg1, long jarg2, IPLSource jarg2_, long jarg3, IPLAudioBuffer jarg3_);
  public final static native void iplGetWetAudioForConvolutionEffect(long jarg1, long jarg2, IPLVector3 jarg2_, long jarg3, IPLVector3 jarg3_, long jarg4, IPLVector3 jarg4_, long jarg5, IPLAudioBuffer jarg5_);
  public final static native void iplGetMixedEnvironmentalAudio(long jarg1, long jarg2, IPLVector3 jarg2_, long jarg3, IPLVector3 jarg3_, long jarg4, IPLVector3 jarg4_, long jarg5, IPLAudioBuffer jarg5_);
  public final static native void iplFlushConvolutionEffect(long jarg1);
  public final static native void IPLProbePlacementParams_placement_set(long jarg1, IPLProbePlacementParams jarg1_, int jarg2);
  public final static native int IPLProbePlacementParams_placement_get(long jarg1, IPLProbePlacementParams jarg1_);
  public final static native void IPLProbePlacementParams_spacing_set(long jarg1, IPLProbePlacementParams jarg1_, float jarg2);
  public final static native float IPLProbePlacementParams_spacing_get(long jarg1, IPLProbePlacementParams jarg1_);
  public final static native void IPLProbePlacementParams_heightAboveFloor_set(long jarg1, IPLProbePlacementParams jarg1_, float jarg2);
  public final static native float IPLProbePlacementParams_heightAboveFloor_get(long jarg1, IPLProbePlacementParams jarg1_);
  public final static native void IPLProbePlacementParams_maxOctreeTriangles_set(long jarg1, IPLProbePlacementParams jarg1_, int jarg2);
  public final static native int IPLProbePlacementParams_maxOctreeTriangles_get(long jarg1, IPLProbePlacementParams jarg1_);
  public final static native void IPLProbePlacementParams_maxOctreeDepth_set(long jarg1, IPLProbePlacementParams jarg1_, int jarg2);
  public final static native int IPLProbePlacementParams_maxOctreeDepth_get(long jarg1, IPLProbePlacementParams jarg1_);
  public final static native long new_IPLProbePlacementParams();
  public final static native void delete_IPLProbePlacementParams(long jarg1);
  public final static native int iplCreateProbeBox(long jarg1, long jarg2, java.nio.FloatBuffer jarg3, long jarg4, IPLProbePlacementParams jarg4_, long jarg5, long jarg6);
  public final static native void iplDestroyProbeBox(long jarg1);
  public final static native int iplGetProbeSpheres(long jarg1, long jarg2, IPLSphere jarg2_);
  public final static native int iplSaveProbeBox(long jarg1, long jarg2);
  public final static native int iplLoadProbeBox(long jarg1, long jarg2, int jarg3, long jarg4);
  public final static native int iplCreateProbeBatch(long jarg1, long jarg2);
  public final static native void iplDestroyProbeBatch(long jarg1);
  public final static native void iplAddProbeToBatch(long jarg1, long jarg2, int jarg3);
  public final static native void iplFinalizeProbeBatch(long jarg1);
  public final static native int iplSaveProbeBatch(long jarg1, long jarg2);
  public final static native int iplLoadProbeBatch(long jarg1, long jarg2, int jarg3, long jarg4);
  public final static native int iplCreateProbeManager(long jarg1, long jarg2);
  public final static native void iplDestroyProbeManager(long jarg1);
  public final static native void iplAddProbeBatch(long jarg1, long jarg2);
  public final static native void iplRemoveProbeBatch(long jarg1, long jarg2);
  public final static native void IPLBakingSettings_bakeParametric_set(long jarg1, IPLBakingSettings jarg1_, boolean jarg2);
  public final static native boolean IPLBakingSettings_bakeParametric_get(long jarg1, IPLBakingSettings jarg1_);
  public final static native void IPLBakingSettings_bakeConvolution_set(long jarg1, IPLBakingSettings jarg1_, boolean jarg2);
  public final static native boolean IPLBakingSettings_bakeConvolution_get(long jarg1, IPLBakingSettings jarg1_);
  public final static native void IPLBakingSettings_irDurationForBake_set(long jarg1, IPLBakingSettings jarg1_, float jarg2);
  public final static native float IPLBakingSettings_irDurationForBake_get(long jarg1, IPLBakingSettings jarg1_);
  public final static native long new_IPLBakingSettings();
  public final static native void delete_IPLBakingSettings(long jarg1);
  public final static native void iplBakeReverb(long jarg1, long jarg2, long jarg3, IPLBakingSettings jarg3_, long jarg4);
  public final static native void iplBakePropagation(long jarg1, long jarg2, long jarg3, IPLSphere jarg3_, long jarg4, IPLBakedDataIdentifier jarg4_, long jarg5, IPLBakingSettings jarg5_, long jarg6);
  public final static native void iplBakeStaticListener(long jarg1, long jarg2, long jarg3, IPLSphere jarg3_, long jarg4, IPLBakedDataIdentifier jarg4_, long jarg5, IPLBakingSettings jarg5_, long jarg6);
  public final static native void iplCancelBake();
  public final static native void iplDeleteBakedDataByIdentifier(long jarg1, long jarg2, IPLBakedDataIdentifier jarg2_);
  public final static native int iplGetBakedDataSizeByIdentifier(long jarg1, long jarg2, IPLBakedDataIdentifier jarg2_);
}
