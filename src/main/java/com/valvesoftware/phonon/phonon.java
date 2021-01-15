/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.valvesoftware.phonon;

public class phonon implements phononConstants {
  public static SWIGTYPE_p_p_void new_IPLHandle() {
    long cPtr = phononJNI.new_IPLHandle();
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_p_void copy_IPLHandle(SWIGTYPE_p_void value) {
    long cPtr = phononJNI.copy_IPLHandle(SWIGTYPE_p_void.getCPtr(value));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public static void delete_IPLHandle(SWIGTYPE_p_p_void obj) {
    phononJNI.delete_IPLHandle(SWIGTYPE_p_p_void.getCPtr(obj));
  }

  public static void IPLHandle_assign(SWIGTYPE_p_p_void obj, SWIGTYPE_p_void value) {
    phononJNI.IPLHandle_assign(SWIGTYPE_p_p_void.getCPtr(obj), SWIGTYPE_p_void.getCPtr(value));
  }

  public static SWIGTYPE_p_void IPLHandle_value(SWIGTYPE_p_p_void obj) {
    long cPtr = phononJNI.IPLHandle_value(SWIGTYPE_p_p_void.getCPtr(obj));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static IPLerror iplCreateContext(SWIGTYPE_p_f_p_char__void logCallback, SWIGTYPE_p_f_size_t_size_t__p_void allocateCallback, SWIGTYPE_p_f_p_void__void freeCallback, SWIGTYPE_p_p_void context) {
    return IPLerror.swigToEnum(phononJNI.iplCreateContext(SWIGTYPE_p_f_p_char__void.getCPtr(logCallback), SWIGTYPE_p_f_size_t_size_t__p_void.getCPtr(allocateCallback), SWIGTYPE_p_f_p_void__void.getCPtr(freeCallback), SWIGTYPE_p_p_void.getCPtr(context)));
  }

  public static void iplDestroyContext(SWIGTYPE_p_p_void context) {
    phononJNI.iplDestroyContext(SWIGTYPE_p_p_void.getCPtr(context));
  }

  public static void iplCleanup() {
    phononJNI.iplCleanup();
  }

  public static IPLVector3 iplCalculateRelativeDirection(IPLVector3 sourcePosition, IPLVector3 listenerPosition, IPLVector3 listenerAhead, IPLVector3 listenerUp) {
    return new IPLVector3(phononJNI.iplCalculateRelativeDirection(IPLVector3.getCPtr(sourcePosition), sourcePosition, IPLVector3.getCPtr(listenerPosition), listenerPosition, IPLVector3.getCPtr(listenerAhead), listenerAhead, IPLVector3.getCPtr(listenerUp), listenerUp), true);
  }

  public static IPLerror iplCreateComputeDevice(SWIGTYPE_p_void context, IPLComputeDeviceFilter deviceFilter, SWIGTYPE_p_p_void device) {
    return IPLerror.swigToEnum(phononJNI.iplCreateComputeDevice(SWIGTYPE_p_void.getCPtr(context), IPLComputeDeviceFilter.getCPtr(deviceFilter), deviceFilter, SWIGTYPE_p_p_void.getCPtr(device)));
  }

  public static void iplDestroyComputeDevice(SWIGTYPE_p_p_void device) {
    phononJNI.iplDestroyComputeDevice(SWIGTYPE_p_p_void.getCPtr(device));
  }

  public static IPLerror iplCreateScene(SWIGTYPE_p_void context, SWIGTYPE_p_void computeDevice, IPLSceneType sceneType, int numMaterials, IPLMaterial materials, SWIGTYPE_p_f_p_q_const__float_p_q_const__float_q_const__float_q_const__float_p_float_p_float_p_p_IPLMaterial_p_void__void closestHitCallback, SWIGTYPE_p_f_p_q_const__float_p_q_const__float_q_const__float_q_const__float_p_int_p_void__void anyHitCallback, SWIGTYPE_p_f_int_p_IPLVector3_p_IPLVector3_int_p_float_p_float_p_float_p_IPLVector3_p_p_IPLMaterial_int_p_void__void batchedClosestHitCallback, SWIGTYPE_p_f_int_p_IPLVector3_p_IPLVector3_int_p_float_p_float_p_unsigned_char_p_void__void batchedAnyHitCallback, SWIGTYPE_p_void userData, SWIGTYPE_p_p_void scene) {
    return IPLerror.swigToEnum(phononJNI.iplCreateScene(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_void.getCPtr(computeDevice), sceneType.swigValue(), numMaterials, IPLMaterial.getCPtr(materials), materials, SWIGTYPE_p_f_p_q_const__float_p_q_const__float_q_const__float_q_const__float_p_float_p_float_p_p_IPLMaterial_p_void__void.getCPtr(closestHitCallback), SWIGTYPE_p_f_p_q_const__float_p_q_const__float_q_const__float_q_const__float_p_int_p_void__void.getCPtr(anyHitCallback), SWIGTYPE_p_f_int_p_IPLVector3_p_IPLVector3_int_p_float_p_float_p_float_p_IPLVector3_p_p_IPLMaterial_int_p_void__void.getCPtr(batchedClosestHitCallback), SWIGTYPE_p_f_int_p_IPLVector3_p_IPLVector3_int_p_float_p_float_p_unsigned_char_p_void__void.getCPtr(batchedAnyHitCallback), SWIGTYPE_p_void.getCPtr(userData), SWIGTYPE_p_p_void.getCPtr(scene)));
  }

  public static void iplDestroyScene(SWIGTYPE_p_p_void scene) {
    phononJNI.iplDestroyScene(SWIGTYPE_p_p_void.getCPtr(scene));
  }

  public static IPLerror iplCreateStaticMesh(SWIGTYPE_p_void scene, int numVertices, int numTriangles, IPLVector3 vertices, IPLTriangle triangles, java.nio.IntBuffer materialIndices, SWIGTYPE_p_p_void staticMesh) {
  assert materialIndices.isDirect() : "Buffer must be allocated direct.";
    {
      return IPLerror.swigToEnum(phononJNI.iplCreateStaticMesh(SWIGTYPE_p_void.getCPtr(scene), numVertices, numTriangles, IPLVector3.getCPtr(vertices), vertices, IPLTriangle.getCPtr(triangles), triangles, materialIndices, SWIGTYPE_p_p_void.getCPtr(staticMesh)));
    }
  }

  public static void iplDestroyStaticMesh(SWIGTYPE_p_p_void staticMesh) {
    phononJNI.iplDestroyStaticMesh(SWIGTYPE_p_p_void.getCPtr(staticMesh));
  }

  public static int iplSaveScene(SWIGTYPE_p_void scene, SWIGTYPE_p_unsigned_char data) {
    return phononJNI.iplSaveScene(SWIGTYPE_p_void.getCPtr(scene), SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public static IPLerror iplLoadScene(SWIGTYPE_p_void context, IPLSceneType sceneType, SWIGTYPE_p_unsigned_char data, int size, SWIGTYPE_p_void computeDevice, SWIGTYPE_p_f_float__void progressCallback, SWIGTYPE_p_p_void scene) {
    return IPLerror.swigToEnum(phononJNI.iplLoadScene(SWIGTYPE_p_void.getCPtr(context), sceneType.swigValue(), SWIGTYPE_p_unsigned_char.getCPtr(data), size, SWIGTYPE_p_void.getCPtr(computeDevice), SWIGTYPE_p_f_float__void.getCPtr(progressCallback), SWIGTYPE_p_p_void.getCPtr(scene)));
  }

  public static void iplSaveSceneAsObj(SWIGTYPE_p_void scene, String fileBaseName) {
    phononJNI.iplSaveSceneAsObj(SWIGTYPE_p_void.getCPtr(scene), fileBaseName);
  }

  public static IPLerror iplCreateInstancedMesh(SWIGTYPE_p_void scene, SWIGTYPE_p_void instancedScene, IPLMatrix4x4 transform, SWIGTYPE_p_p_void instancedMesh) {
    return IPLerror.swigToEnum(phononJNI.iplCreateInstancedMesh(SWIGTYPE_p_void.getCPtr(scene), SWIGTYPE_p_void.getCPtr(instancedScene), IPLMatrix4x4.getCPtr(transform), transform, SWIGTYPE_p_p_void.getCPtr(instancedMesh)));
  }

  public static void iplDestroyInstancedMesh(SWIGTYPE_p_p_void instancedMesh) {
    phononJNI.iplDestroyInstancedMesh(SWIGTYPE_p_p_void.getCPtr(instancedMesh));
  }

  public static void iplAddInstancedMesh(SWIGTYPE_p_void scene, SWIGTYPE_p_void instancedMesh) {
    phononJNI.iplAddInstancedMesh(SWIGTYPE_p_void.getCPtr(scene), SWIGTYPE_p_void.getCPtr(instancedMesh));
  }

  public static void iplRemoveInstancedMesh(SWIGTYPE_p_void scene, SWIGTYPE_p_void instancedMesh) {
    phononJNI.iplRemoveInstancedMesh(SWIGTYPE_p_void.getCPtr(scene), SWIGTYPE_p_void.getCPtr(instancedMesh));
  }

  public static void iplUpdateInstancedMeshTransform(SWIGTYPE_p_void instancedMesh, IPLMatrix4x4 transform) {
    phononJNI.iplUpdateInstancedMeshTransform(SWIGTYPE_p_void.getCPtr(instancedMesh), IPLMatrix4x4.getCPtr(transform), transform);
  }

  public static void iplCommitScene(SWIGTYPE_p_void scene) {
    phononJNI.iplCommitScene(SWIGTYPE_p_void.getCPtr(scene));
  }

  public static IPLerror iplCreateEnvironment(SWIGTYPE_p_void context, SWIGTYPE_p_void computeDevice, IPLSimulationSettings simulationSettings, SWIGTYPE_p_void scene, SWIGTYPE_p_void probeManager, SWIGTYPE_p_p_void environment) {
    return IPLerror.swigToEnum(phononJNI.iplCreateEnvironment(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_void.getCPtr(computeDevice), IPLSimulationSettings.getCPtr(simulationSettings), simulationSettings, SWIGTYPE_p_void.getCPtr(scene), SWIGTYPE_p_void.getCPtr(probeManager), SWIGTYPE_p_p_void.getCPtr(environment)));
  }

  public static void iplDestroyEnvironment(SWIGTYPE_p_p_void environment) {
    phononJNI.iplDestroyEnvironment(SWIGTYPE_p_p_void.getCPtr(environment));
  }

  public static void iplSetNumBounces(SWIGTYPE_p_void environment, int numBounces) {
    phononJNI.iplSetNumBounces(SWIGTYPE_p_void.getCPtr(environment), numBounces);
  }

  public static void iplMixAudioBuffers(int numBuffers, IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplMixAudioBuffers(numBuffers, IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplInterleaveAudioBuffer(IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplInterleaveAudioBuffer(IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplDeinterleaveAudioBuffer(IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplDeinterleaveAudioBuffer(IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplConvertAudioBufferFormat(IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplConvertAudioBufferFormat(IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static IPLerror iplCreateAmbisonicsRotator(SWIGTYPE_p_void context, int order, SWIGTYPE_p_p_void rotator) {
    return IPLerror.swigToEnum(phononJNI.iplCreateAmbisonicsRotator(SWIGTYPE_p_void.getCPtr(context), order, SWIGTYPE_p_p_void.getCPtr(rotator)));
  }

  public static void iplDestroyAmbisonicsRotator(SWIGTYPE_p_p_void rotator) {
    phononJNI.iplDestroyAmbisonicsRotator(SWIGTYPE_p_p_void.getCPtr(rotator));
  }

  public static void iplSetAmbisonicsRotation(SWIGTYPE_p_void rotator, IPLVector3 listenerAhead, IPLVector3 listenerUp) {
    phononJNI.iplSetAmbisonicsRotation(SWIGTYPE_p_void.getCPtr(rotator), IPLVector3.getCPtr(listenerAhead), listenerAhead, IPLVector3.getCPtr(listenerUp), listenerUp);
  }

  public static void iplRotateAmbisonicsAudioBuffer(SWIGTYPE_p_void rotator, IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplRotateAmbisonicsAudioBuffer(SWIGTYPE_p_void.getCPtr(rotator), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static IPLerror iplCreateBinauralRenderer(SWIGTYPE_p_void context, IPLRenderingSettings renderingSettings, IPLHrtfParams params, SWIGTYPE_p_p_void renderer) {
    return IPLerror.swigToEnum(phononJNI.iplCreateBinauralRenderer(SWIGTYPE_p_void.getCPtr(context), IPLRenderingSettings.getCPtr(renderingSettings), renderingSettings, IPLHrtfParams.getCPtr(params), params, SWIGTYPE_p_p_void.getCPtr(renderer)));
  }

  public static void iplDestroyBinauralRenderer(SWIGTYPE_p_p_void renderer) {
    phononJNI.iplDestroyBinauralRenderer(SWIGTYPE_p_p_void.getCPtr(renderer));
  }

  public static IPLerror iplCreatePanningEffect(SWIGTYPE_p_void renderer, IPLAudioFormat inputFormat, IPLAudioFormat outputFormat, SWIGTYPE_p_p_void effect) {
    return IPLerror.swigToEnum(phononJNI.iplCreatePanningEffect(SWIGTYPE_p_void.getCPtr(renderer), IPLAudioFormat.getCPtr(inputFormat), inputFormat, IPLAudioFormat.getCPtr(outputFormat), outputFormat, SWIGTYPE_p_p_void.getCPtr(effect)));
  }

  public static void iplDestroyPanningEffect(SWIGTYPE_p_p_void effect) {
    phononJNI.iplDestroyPanningEffect(SWIGTYPE_p_p_void.getCPtr(effect));
  }

  public static void iplApplyPanningEffect(SWIGTYPE_p_void effect, SWIGTYPE_p_void binauralRenderer, IPLAudioBuffer inputAudio, IPLVector3 direction, IPLAudioBuffer outputAudio) {
    phononJNI.iplApplyPanningEffect(SWIGTYPE_p_void.getCPtr(effect), SWIGTYPE_p_void.getCPtr(binauralRenderer), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLVector3.getCPtr(direction), direction, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplFlushPanningEffect(SWIGTYPE_p_void effect) {
    phononJNI.iplFlushPanningEffect(SWIGTYPE_p_void.getCPtr(effect));
  }

  public static IPLerror iplCreateBinauralEffect(SWIGTYPE_p_void renderer, IPLAudioFormat inputFormat, IPLAudioFormat outputFormat, SWIGTYPE_p_p_void effect) {
    return IPLerror.swigToEnum(phononJNI.iplCreateBinauralEffect(SWIGTYPE_p_void.getCPtr(renderer), IPLAudioFormat.getCPtr(inputFormat), inputFormat, IPLAudioFormat.getCPtr(outputFormat), outputFormat, SWIGTYPE_p_p_void.getCPtr(effect)));
  }

  public static void iplDestroyBinauralEffect(SWIGTYPE_p_p_void effect) {
    phononJNI.iplDestroyBinauralEffect(SWIGTYPE_p_p_void.getCPtr(effect));
  }

  public static void iplApplyBinauralEffect(SWIGTYPE_p_void effect, SWIGTYPE_p_void binauralRenderer, IPLAudioBuffer inputAudio, IPLVector3 direction, IPLHrtfInterpolation interpolation, float spatialBlend, IPLAudioBuffer outputAudio) {
    phononJNI.iplApplyBinauralEffect(SWIGTYPE_p_void.getCPtr(effect), SWIGTYPE_p_void.getCPtr(binauralRenderer), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLVector3.getCPtr(direction), direction, interpolation.swigValue(), spatialBlend, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplApplyBinauralEffectWithParameters(SWIGTYPE_p_void effect, SWIGTYPE_p_void binauralRenderer, IPLAudioBuffer inputAudio, IPLVector3 direction, IPLHrtfInterpolation interpolation, boolean enableSpatialBlend, float spatialBlend, IPLAudioBuffer outputAudio, java.nio.FloatBuffer leftDelay, java.nio.FloatBuffer rightDelay) {
  assert leftDelay.isDirect() : "Buffer must be allocated direct.";
  assert rightDelay.isDirect() : "Buffer must be allocated direct.";
    {
      phononJNI.iplApplyBinauralEffectWithParameters(SWIGTYPE_p_void.getCPtr(effect), SWIGTYPE_p_void.getCPtr(binauralRenderer), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLVector3.getCPtr(direction), direction, interpolation.swigValue(), enableSpatialBlend, spatialBlend, IPLAudioBuffer.getCPtr(outputAudio), outputAudio, leftDelay, rightDelay);
    }
  }

  public static void iplFlushBinauralEffect(SWIGTYPE_p_void effect) {
    phononJNI.iplFlushBinauralEffect(SWIGTYPE_p_void.getCPtr(effect));
  }

  public static IPLerror iplCreateVirtualSurroundEffect(SWIGTYPE_p_void renderer, IPLAudioFormat inputFormat, IPLAudioFormat outputFormat, SWIGTYPE_p_p_void effect) {
    return IPLerror.swigToEnum(phononJNI.iplCreateVirtualSurroundEffect(SWIGTYPE_p_void.getCPtr(renderer), IPLAudioFormat.getCPtr(inputFormat), inputFormat, IPLAudioFormat.getCPtr(outputFormat), outputFormat, SWIGTYPE_p_p_void.getCPtr(effect)));
  }

  public static void iplDestroyVirtualSurroundEffect(SWIGTYPE_p_p_void effect) {
    phononJNI.iplDestroyVirtualSurroundEffect(SWIGTYPE_p_p_void.getCPtr(effect));
  }

  public static void iplApplyVirtualSurroundEffect(SWIGTYPE_p_void effect, SWIGTYPE_p_void binauralRenderer, IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplApplyVirtualSurroundEffect(SWIGTYPE_p_void.getCPtr(effect), SWIGTYPE_p_void.getCPtr(binauralRenderer), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplFlushVirtualSurroundEffect(SWIGTYPE_p_void effect) {
    phononJNI.iplFlushVirtualSurroundEffect(SWIGTYPE_p_void.getCPtr(effect));
  }

  public static IPLerror iplCreateAmbisonicsPanningEffect(SWIGTYPE_p_void renderer, IPLAudioFormat inputFormat, IPLAudioFormat outputFormat, SWIGTYPE_p_p_void effect) {
    return IPLerror.swigToEnum(phononJNI.iplCreateAmbisonicsPanningEffect(SWIGTYPE_p_void.getCPtr(renderer), IPLAudioFormat.getCPtr(inputFormat), inputFormat, IPLAudioFormat.getCPtr(outputFormat), outputFormat, SWIGTYPE_p_p_void.getCPtr(effect)));
  }

  public static void iplDestroyAmbisonicsPanningEffect(SWIGTYPE_p_p_void effect) {
    phononJNI.iplDestroyAmbisonicsPanningEffect(SWIGTYPE_p_p_void.getCPtr(effect));
  }

  public static void iplApplyAmbisonicsPanningEffect(SWIGTYPE_p_void effect, SWIGTYPE_p_void binauralRenderer, IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplApplyAmbisonicsPanningEffect(SWIGTYPE_p_void.getCPtr(effect), SWIGTYPE_p_void.getCPtr(binauralRenderer), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplFlushAmbisonicsPanningEffect(SWIGTYPE_p_void effect) {
    phononJNI.iplFlushAmbisonicsPanningEffect(SWIGTYPE_p_void.getCPtr(effect));
  }

  public static IPLerror iplCreateAmbisonicsBinauralEffect(SWIGTYPE_p_void renderer, IPLAudioFormat inputFormat, IPLAudioFormat outputFormat, SWIGTYPE_p_p_void effect) {
    return IPLerror.swigToEnum(phononJNI.iplCreateAmbisonicsBinauralEffect(SWIGTYPE_p_void.getCPtr(renderer), IPLAudioFormat.getCPtr(inputFormat), inputFormat, IPLAudioFormat.getCPtr(outputFormat), outputFormat, SWIGTYPE_p_p_void.getCPtr(effect)));
  }

  public static void iplDestroyAmbisonicsBinauralEffect(SWIGTYPE_p_p_void effect) {
    phononJNI.iplDestroyAmbisonicsBinauralEffect(SWIGTYPE_p_p_void.getCPtr(effect));
  }

  public static void iplApplyAmbisonicsBinauralEffect(SWIGTYPE_p_void effect, SWIGTYPE_p_void binauralRenderer, IPLAudioBuffer inputAudio, IPLAudioBuffer outputAudio) {
    phononJNI.iplApplyAmbisonicsBinauralEffect(SWIGTYPE_p_void.getCPtr(effect), SWIGTYPE_p_void.getCPtr(binauralRenderer), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplFlushAmbisonicsBinauralEffect(SWIGTYPE_p_void effect) {
    phononJNI.iplFlushAmbisonicsBinauralEffect(SWIGTYPE_p_void.getCPtr(effect));
  }

  public static IPLerror iplCreateEnvironmentalRenderer(SWIGTYPE_p_void context, SWIGTYPE_p_void environment, IPLRenderingSettings renderingSettings, IPLAudioFormat outputFormat, SWIGTYPE_p_f_void__void threadCreateCallback, SWIGTYPE_p_f_void__void threadDestroyCallback, SWIGTYPE_p_p_void renderer) {
    return IPLerror.swigToEnum(phononJNI.iplCreateEnvironmentalRenderer(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_void.getCPtr(environment), IPLRenderingSettings.getCPtr(renderingSettings), renderingSettings, IPLAudioFormat.getCPtr(outputFormat), outputFormat, SWIGTYPE_p_f_void__void.getCPtr(threadCreateCallback), SWIGTYPE_p_f_void__void.getCPtr(threadDestroyCallback), SWIGTYPE_p_p_void.getCPtr(renderer)));
  }

  public static void iplDestroyEnvironmentalRenderer(SWIGTYPE_p_p_void renderer) {
    phononJNI.iplDestroyEnvironmentalRenderer(SWIGTYPE_p_p_void.getCPtr(renderer));
  }

  public static SWIGTYPE_p_void iplGetEnvironmentForRenderer(SWIGTYPE_p_void renderer) {
    long cPtr = phononJNI.iplGetEnvironmentForRenderer(SWIGTYPE_p_void.getCPtr(renderer));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static IPLDirectSoundPath iplGetDirectSoundPath(SWIGTYPE_p_void environment, IPLVector3 listenerPosition, IPLVector3 listenerAhead, IPLVector3 listenerUp, IPLSource source, float sourceRadius, int numSamples, IPLDirectOcclusionMode occlusionMode, IPLDirectOcclusionMethod occlusionMethod) {
    return new IPLDirectSoundPath(phononJNI.iplGetDirectSoundPath(SWIGTYPE_p_void.getCPtr(environment), IPLVector3.getCPtr(listenerPosition), listenerPosition, IPLVector3.getCPtr(listenerAhead), listenerAhead, IPLVector3.getCPtr(listenerUp), listenerUp, IPLSource.getCPtr(source), source, sourceRadius, numSamples, occlusionMode.swigValue(), occlusionMethod.swigValue()), true);
  }

  public static IPLerror iplCreateDirectSoundEffect(IPLAudioFormat inputFormat, IPLAudioFormat outputFormat, IPLRenderingSettings renderingSettings, SWIGTYPE_p_p_void effect) {
    return IPLerror.swigToEnum(phononJNI.iplCreateDirectSoundEffect(IPLAudioFormat.getCPtr(inputFormat), inputFormat, IPLAudioFormat.getCPtr(outputFormat), outputFormat, IPLRenderingSettings.getCPtr(renderingSettings), renderingSettings, SWIGTYPE_p_p_void.getCPtr(effect)));
  }

  public static void iplDestroyDirectSoundEffect(SWIGTYPE_p_p_void effect) {
    phononJNI.iplDestroyDirectSoundEffect(SWIGTYPE_p_p_void.getCPtr(effect));
  }

  public static void iplApplyDirectSoundEffect(SWIGTYPE_p_void effect, IPLAudioBuffer inputAudio, IPLDirectSoundPath directSoundPath, IPLDirectSoundEffectOptions options, IPLAudioBuffer outputAudio) {
    phononJNI.iplApplyDirectSoundEffect(SWIGTYPE_p_void.getCPtr(effect), IPLAudioBuffer.getCPtr(inputAudio), inputAudio, IPLDirectSoundPath.getCPtr(directSoundPath), directSoundPath, IPLDirectSoundEffectOptions.getCPtr(options), options, IPLAudioBuffer.getCPtr(outputAudio), outputAudio);
  }

  public static void iplFlushDirectSoundEffect(SWIGTYPE_p_void effect) {
    phononJNI.iplFlushDirectSoundEffect(SWIGTYPE_p_void.getCPtr(effect));
  }

  public static IPLerror iplCreateConvolutionEffect(SWIGTYPE_p_void renderer, IPLBakedDataIdentifier identifier, IPLSimulationType simulationType, IPLAudioFormat inputFormat, IPLAudioFormat outputFormat, SWIGTYPE_p_p_void effect) {
    return IPLerror.swigToEnum(phononJNI.iplCreateConvolutionEffect(SWIGTYPE_p_void.getCPtr(renderer), IPLBakedDataIdentifier.getCPtr(identifier), identifier, simulationType.swigValue(), IPLAudioFormat.getCPtr(inputFormat), inputFormat, IPLAudioFormat.getCPtr(outputFormat), outputFormat, SWIGTYPE_p_p_void.getCPtr(effect)));
  }

  public static void iplDestroyConvolutionEffect(SWIGTYPE_p_p_void effect) {
    phononJNI.iplDestroyConvolutionEffect(SWIGTYPE_p_p_void.getCPtr(effect));
  }

  public static void iplSetConvolutionEffectIdentifier(SWIGTYPE_p_void effect, IPLBakedDataIdentifier identifier) {
    phononJNI.iplSetConvolutionEffectIdentifier(SWIGTYPE_p_void.getCPtr(effect), IPLBakedDataIdentifier.getCPtr(identifier), identifier);
  }

  public static void iplSetDryAudioForConvolutionEffect(SWIGTYPE_p_void effect, IPLSource source, IPLAudioBuffer dryAudio) {
    phononJNI.iplSetDryAudioForConvolutionEffect(SWIGTYPE_p_void.getCPtr(effect), IPLSource.getCPtr(source), source, IPLAudioBuffer.getCPtr(dryAudio), dryAudio);
  }

  public static void iplGetWetAudioForConvolutionEffect(SWIGTYPE_p_void effect, IPLVector3 listenerPosition, IPLVector3 listenerAhead, IPLVector3 listenerUp, IPLAudioBuffer wetAudio) {
    phononJNI.iplGetWetAudioForConvolutionEffect(SWIGTYPE_p_void.getCPtr(effect), IPLVector3.getCPtr(listenerPosition), listenerPosition, IPLVector3.getCPtr(listenerAhead), listenerAhead, IPLVector3.getCPtr(listenerUp), listenerUp, IPLAudioBuffer.getCPtr(wetAudio), wetAudio);
  }

  public static void iplGetMixedEnvironmentalAudio(SWIGTYPE_p_void renderer, IPLVector3 listenerPosition, IPLVector3 listenerAhead, IPLVector3 listenerUp, IPLAudioBuffer mixedWetAudio) {
    phononJNI.iplGetMixedEnvironmentalAudio(SWIGTYPE_p_void.getCPtr(renderer), IPLVector3.getCPtr(listenerPosition), listenerPosition, IPLVector3.getCPtr(listenerAhead), listenerAhead, IPLVector3.getCPtr(listenerUp), listenerUp, IPLAudioBuffer.getCPtr(mixedWetAudio), mixedWetAudio);
  }

  public static void iplFlushConvolutionEffect(SWIGTYPE_p_void effect) {
    phononJNI.iplFlushConvolutionEffect(SWIGTYPE_p_void.getCPtr(effect));
  }

  public static IPLerror iplCreateProbeBox(SWIGTYPE_p_void context, SWIGTYPE_p_void scene, java.nio.FloatBuffer boxLocalToWorldTransform, IPLProbePlacementParams placementParams, SWIGTYPE_p_f_float__void progressCallback, SWIGTYPE_p_p_void probeBox) {
  assert boxLocalToWorldTransform.isDirect() : "Buffer must be allocated direct.";
    {
      return IPLerror.swigToEnum(phononJNI.iplCreateProbeBox(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_void.getCPtr(scene), boxLocalToWorldTransform, IPLProbePlacementParams.getCPtr(placementParams), placementParams, SWIGTYPE_p_f_float__void.getCPtr(progressCallback), SWIGTYPE_p_p_void.getCPtr(probeBox)));
    }
  }

  public static void iplDestroyProbeBox(SWIGTYPE_p_p_void probeBox) {
    phononJNI.iplDestroyProbeBox(SWIGTYPE_p_p_void.getCPtr(probeBox));
  }

  public static int iplGetProbeSpheres(SWIGTYPE_p_void probeBox, IPLSphere probeSpheres) {
    return phononJNI.iplGetProbeSpheres(SWIGTYPE_p_void.getCPtr(probeBox), IPLSphere.getCPtr(probeSpheres), probeSpheres);
  }

  public static int iplSaveProbeBox(SWIGTYPE_p_void probeBox, SWIGTYPE_p_unsigned_char data) {
    return phononJNI.iplSaveProbeBox(SWIGTYPE_p_void.getCPtr(probeBox), SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public static IPLerror iplLoadProbeBox(SWIGTYPE_p_void context, SWIGTYPE_p_unsigned_char data, int size, SWIGTYPE_p_p_void probeBox) {
    return IPLerror.swigToEnum(phononJNI.iplLoadProbeBox(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_unsigned_char.getCPtr(data), size, SWIGTYPE_p_p_void.getCPtr(probeBox)));
  }

  public static IPLerror iplCreateProbeBatch(SWIGTYPE_p_void context, SWIGTYPE_p_p_void probeBatch) {
    return IPLerror.swigToEnum(phononJNI.iplCreateProbeBatch(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_p_void.getCPtr(probeBatch)));
  }

  public static void iplDestroyProbeBatch(SWIGTYPE_p_p_void probeBatch) {
    phononJNI.iplDestroyProbeBatch(SWIGTYPE_p_p_void.getCPtr(probeBatch));
  }

  public static void iplAddProbeToBatch(SWIGTYPE_p_void probeBatch, SWIGTYPE_p_void probeBox, int probeIndex) {
    phononJNI.iplAddProbeToBatch(SWIGTYPE_p_void.getCPtr(probeBatch), SWIGTYPE_p_void.getCPtr(probeBox), probeIndex);
  }

  public static void iplFinalizeProbeBatch(SWIGTYPE_p_void probeBatch) {
    phononJNI.iplFinalizeProbeBatch(SWIGTYPE_p_void.getCPtr(probeBatch));
  }

  public static int iplSaveProbeBatch(SWIGTYPE_p_void probeBatch, SWIGTYPE_p_unsigned_char data) {
    return phononJNI.iplSaveProbeBatch(SWIGTYPE_p_void.getCPtr(probeBatch), SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public static IPLerror iplLoadProbeBatch(SWIGTYPE_p_void context, SWIGTYPE_p_unsigned_char data, int size, SWIGTYPE_p_p_void probeBatch) {
    return IPLerror.swigToEnum(phononJNI.iplLoadProbeBatch(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_unsigned_char.getCPtr(data), size, SWIGTYPE_p_p_void.getCPtr(probeBatch)));
  }

  public static IPLerror iplCreateProbeManager(SWIGTYPE_p_void context, SWIGTYPE_p_p_void probeManager) {
    return IPLerror.swigToEnum(phononJNI.iplCreateProbeManager(SWIGTYPE_p_void.getCPtr(context), SWIGTYPE_p_p_void.getCPtr(probeManager)));
  }

  public static void iplDestroyProbeManager(SWIGTYPE_p_p_void probeManager) {
    phononJNI.iplDestroyProbeManager(SWIGTYPE_p_p_void.getCPtr(probeManager));
  }

  public static void iplAddProbeBatch(SWIGTYPE_p_void probeManager, SWIGTYPE_p_void probeBatch) {
    phononJNI.iplAddProbeBatch(SWIGTYPE_p_void.getCPtr(probeManager), SWIGTYPE_p_void.getCPtr(probeBatch));
  }

  public static void iplRemoveProbeBatch(SWIGTYPE_p_void probeManager, SWIGTYPE_p_void probeBatch) {
    phononJNI.iplRemoveProbeBatch(SWIGTYPE_p_void.getCPtr(probeManager), SWIGTYPE_p_void.getCPtr(probeBatch));
  }

  public static void iplBakeReverb(SWIGTYPE_p_void environment, SWIGTYPE_p_void probeBox, IPLBakingSettings bakingSettings, SWIGTYPE_p_f_float__void progressCallback) {
    phononJNI.iplBakeReverb(SWIGTYPE_p_void.getCPtr(environment), SWIGTYPE_p_void.getCPtr(probeBox), IPLBakingSettings.getCPtr(bakingSettings), bakingSettings, SWIGTYPE_p_f_float__void.getCPtr(progressCallback));
  }

  public static void iplBakePropagation(SWIGTYPE_p_void environment, SWIGTYPE_p_void probeBox, IPLSphere sourceInfluence, IPLBakedDataIdentifier sourceIdentifier, IPLBakingSettings bakingSettings, SWIGTYPE_p_f_float__void progressCallback) {
    phononJNI.iplBakePropagation(SWIGTYPE_p_void.getCPtr(environment), SWIGTYPE_p_void.getCPtr(probeBox), IPLSphere.getCPtr(sourceInfluence), sourceInfluence, IPLBakedDataIdentifier.getCPtr(sourceIdentifier), sourceIdentifier, IPLBakingSettings.getCPtr(bakingSettings), bakingSettings, SWIGTYPE_p_f_float__void.getCPtr(progressCallback));
  }

  public static void iplBakeStaticListener(SWIGTYPE_p_void environment, SWIGTYPE_p_void probeBox, IPLSphere listenerInfluence, IPLBakedDataIdentifier listenerIdentifier, IPLBakingSettings bakingSettings, SWIGTYPE_p_f_float__void progressCallback) {
    phononJNI.iplBakeStaticListener(SWIGTYPE_p_void.getCPtr(environment), SWIGTYPE_p_void.getCPtr(probeBox), IPLSphere.getCPtr(listenerInfluence), listenerInfluence, IPLBakedDataIdentifier.getCPtr(listenerIdentifier), listenerIdentifier, IPLBakingSettings.getCPtr(bakingSettings), bakingSettings, SWIGTYPE_p_f_float__void.getCPtr(progressCallback));
  }

  public static void iplCancelBake() {
    phononJNI.iplCancelBake();
  }

  public static void iplDeleteBakedDataByIdentifier(SWIGTYPE_p_void probeBox, IPLBakedDataIdentifier identifier) {
    phononJNI.iplDeleteBakedDataByIdentifier(SWIGTYPE_p_void.getCPtr(probeBox), IPLBakedDataIdentifier.getCPtr(identifier), identifier);
  }

  public static int iplGetBakedDataSizeByIdentifier(SWIGTYPE_p_void probeBox, IPLBakedDataIdentifier identifier) {
    return phononJNI.iplGetBakedDataSizeByIdentifier(SWIGTYPE_p_void.getCPtr(probeBox), IPLBakedDataIdentifier.getCPtr(identifier), identifier);
  }

}