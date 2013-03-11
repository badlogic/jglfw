#include <com.badlogic.jglfw.al.ALC.h>

//@line:37

	#include "AL/alc.h"
	
//@line:41

	static int initialized = 0;	JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_init(JNIEnv* env, jclass clazz) {


//@line:44

		if(initialized) return;
		initialized = -1;
	

}

static inline jobject wrapped_Java_com_badlogic_jglfw_al_ALC_alcCreateContext
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_attrlist, jint attrlistByteOffset, unsigned char* device, unsigned char* attrlist) {

//@line:49

		return (ALCcontext*)alcCreateContext((ALCdevice*)(device + deviceByteOffset), (const ALCint*)(attrlist + attrlistByteOffset));
	
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcCreateContext(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_attrlist, jint attrlistByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);
	unsigned char* attrlist = (unsigned char*)env->GetDirectBufferAddress(obj_attrlist);

	jobject JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCreateContext(env, clazz, obj_device, deviceByteOffset, obj_attrlist, attrlistByteOffset, device, attrlist);


	return JNI_returnValue;
}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset, unsigned char* context) {

//@line:53

		return (jboolean)alcMakeContextCurrent((ALCcontext*)(context + contextByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)env->GetDirectBufferAddress(obj_context);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__Ljava_nio_Buffer_2I(env, clazz, obj_context, contextByteOffset, context);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:57

		return (jboolean)alcMakeContextCurrent((ALCcontext*)context);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcProcessContext__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)env->GetDirectBufferAddress(obj_context);


//@line:61

		alcProcessContext((ALCcontext*)(context + contextByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcProcessContext__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:65

		alcProcessContext((ALCcontext*)context);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcSuspendContext__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)env->GetDirectBufferAddress(obj_context);


//@line:69

		alcSuspendContext((ALCcontext*)(context + contextByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcSuspendContext__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:73

		alcSuspendContext((ALCcontext*)context);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcDestroyContext__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)env->GetDirectBufferAddress(obj_context);


//@line:77

		alcDestroyContext((ALCcontext*)(context + contextByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcDestroyContext__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:81

		alcDestroyContext((ALCcontext*)context);
	

}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetCurrentContext(JNIEnv* env, jclass clazz) {


//@line:85

		return (ALCcontext*)alcGetCurrentContext();
	

}

static inline jobject wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetContextsDevice__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset, unsigned char* context) {

//@line:89

		return (ALCdevice*)alcGetContextsDevice((ALCcontext*)(context + contextByteOffset));
	
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetContextsDevice__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)env->GetDirectBufferAddress(obj_context);

	jobject JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetContextsDevice__Ljava_nio_Buffer_2I(env, clazz, obj_context, contextByteOffset, context);


	return JNI_returnValue;
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetContextsDevice__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:93

		return (ALCdevice*)alcGetContextsDevice((ALCcontext*)context);
	

}

static inline jobject wrapped_Java_com_badlogic_jglfw_al_ALC_alcOpenDevice__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_devicename, jint devicenameByteOffset, unsigned char* devicename) {

//@line:97

		return (ALCdevice*)alcOpenDevice((const ALCchar*)(devicename + devicenameByteOffset));
	
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcOpenDevice__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_devicename, jint devicenameByteOffset) {
	unsigned char* devicename = (unsigned char*)env->GetDirectBufferAddress(obj_devicename);

	jobject JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcOpenDevice__Ljava_nio_Buffer_2I(env, clazz, obj_devicename, devicenameByteOffset, devicename);


	return JNI_returnValue;
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcOpenDevice__J(JNIEnv* env, jclass clazz, jlong devicename) {


//@line:101

		return (ALCdevice*)alcOpenDevice((const ALCchar*)devicename);
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, unsigned char* device) {

//@line:105

		return (jboolean)alcCloseDevice((ALCdevice*)(device + deviceByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__Ljava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, device);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:109

		return (jboolean)alcCloseDevice((ALCdevice*)device);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetError__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, unsigned char* device) {

//@line:113

		return (jint)alcGetError((ALCdevice*)(device + deviceByteOffset));
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetError__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetError__Ljava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, device);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetError__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:117

		return (jint)alcGetError((ALCdevice*)device);
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_extname, jint extnameByteOffset, unsigned char* device, unsigned char* extname) {

//@line:121

		return (jboolean)alcIsExtensionPresent((ALCdevice*)(device + deviceByteOffset), (const ALCchar*)(extname + extnameByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_extname, jint extnameByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);
	unsigned char* extname = (unsigned char*)env->GetDirectBufferAddress(obj_extname);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, obj_extname, extnameByteOffset, device, extname);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__JJ(JNIEnv* env, jclass clazz, jlong device, jlong extname) {


//@line:125

		return (jboolean)alcIsExtensionPresent((ALCdevice*)device, (const ALCchar*)extname);
	

}

static inline jobject wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetProcAddress__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_funcname, jint funcnameByteOffset, unsigned char* device, unsigned char* funcname) {

//@line:129

		return (void*)alcGetProcAddress((ALCdevice*)(device + deviceByteOffset), (const ALCchar*)(funcname + funcnameByteOffset));
	
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetProcAddress__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_funcname, jint funcnameByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);
	unsigned char* funcname = (unsigned char*)env->GetDirectBufferAddress(obj_funcname);

	jobject JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetProcAddress__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, obj_funcname, funcnameByteOffset, device, funcname);


	return JNI_returnValue;
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetProcAddress__JJ(JNIEnv* env, jclass clazz, jlong device, jlong funcname) {


//@line:133

		return (void*)alcGetProcAddress((ALCdevice*)device, (const ALCchar*)funcname);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_enumname, jint enumnameByteOffset, unsigned char* device, unsigned char* enumname) {

//@line:137

		return (jint)alcGetEnumValue((ALCdevice*)(device + deviceByteOffset), (const ALCchar*)(enumname + enumnameByteOffset));
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_enumname, jint enumnameByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);
	unsigned char* enumname = (unsigned char*)env->GetDirectBufferAddress(obj_enumname);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, obj_enumname, enumnameByteOffset, device, enumname);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__JJ(JNIEnv* env, jclass clazz, jlong device, jlong enumname) {


//@line:141

		return (jint)alcGetEnumValue((ALCdevice*)device, (const ALCchar*)enumname);
	

}

static inline jobject wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetString__Ljava_nio_Buffer_2II
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jint param, unsigned char* device) {

//@line:145

		return (const ALCchar*)alcGetString((ALCdevice*)(device + deviceByteOffset), (ALCenum)param);
	
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetString__Ljava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jint param) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);

	jobject JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetString__Ljava_nio_Buffer_2II(env, clazz, obj_device, deviceByteOffset, param, device);


	return JNI_returnValue;
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetString__JI(JNIEnv* env, jclass clazz, jlong device, jint param) {


//@line:149

		return (const ALCchar*)alcGetString((ALCdevice*)device, (ALCenum)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetIntegerv__Ljava_nio_Buffer_2IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jint param, jint size, jobject obj_values, jint valuesByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:153

		alcGetIntegerv((ALCdevice*)(device + deviceByteOffset), (ALCenum)param, (ALCsizei)size, (ALCint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetIntegerv__JIIJ(JNIEnv* env, jclass clazz, jlong device, jint param, jint size, jlong values) {


//@line:157

		alcGetIntegerv((ALCdevice*)device, (ALCenum)param, (ALCsizei)size, (ALCint*)values);
	

}

static inline jobject wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureOpenDevice__Ljava_nio_Buffer_2IIII
(JNIEnv* env, jclass clazz, jobject obj_devicename, jint devicenameByteOffset, jint frequency, jint format, jint buffersize, unsigned char* devicename) {

//@line:161

		return (ALCdevice*)alcCaptureOpenDevice((const ALCchar*)(devicename + devicenameByteOffset), (ALCuint)frequency, (ALCenum)format, (ALCsizei)buffersize);
	
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureOpenDevice__Ljava_nio_Buffer_2IIII(JNIEnv* env, jclass clazz, jobject obj_devicename, jint devicenameByteOffset, jint frequency, jint format, jint buffersize) {
	unsigned char* devicename = (unsigned char*)env->GetDirectBufferAddress(obj_devicename);

	jobject JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureOpenDevice__Ljava_nio_Buffer_2IIII(env, clazz, obj_devicename, devicenameByteOffset, frequency, format, buffersize, devicename);


	return JNI_returnValue;
}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureOpenDevice__JIII(JNIEnv* env, jclass clazz, jlong devicename, jint frequency, jint format, jint buffersize) {


//@line:165

		return (ALCdevice*)alcCaptureOpenDevice((const ALCchar*)devicename, (ALCuint)frequency, (ALCenum)format, (ALCsizei)buffersize);
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, unsigned char* device) {

//@line:169

		return (jboolean)alcCaptureCloseDevice((ALCdevice*)(device + deviceByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__Ljava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, device);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:173

		return (jboolean)alcCaptureCloseDevice((ALCdevice*)device);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStart__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);


//@line:177

		alcCaptureStart((ALCdevice*)(device + deviceByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStart__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:181

		alcCaptureStart((ALCdevice*)device);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStop__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);


//@line:185

		alcCaptureStop((ALCdevice*)(device + deviceByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStop__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:189

		alcCaptureStop((ALCdevice*)device);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureSamples__Ljava_nio_Buffer_2ILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_buffer, jint bufferByteOffset, jint samples) {
	unsigned char* device = (unsigned char*)env->GetDirectBufferAddress(obj_device);
	unsigned char* buffer = (unsigned char*)env->GetDirectBufferAddress(obj_buffer);


//@line:193

		alcCaptureSamples((ALCdevice*)(device + deviceByteOffset), (ALCvoid*)(buffer + bufferByteOffset), (ALCsizei)samples);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureSamples__JJI(JNIEnv* env, jclass clazz, jlong device, jlong buffer, jint samples) {


//@line:197

		alcCaptureSamples((ALCdevice*)device, (ALCvoid*)buffer, (ALCsizei)samples);
	

}

