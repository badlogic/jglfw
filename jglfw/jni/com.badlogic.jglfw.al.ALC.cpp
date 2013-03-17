#include <com.badlogic.jglfw.al.ALC.h>

//@line:37

	#include "AL/alc.h"
	#include "AL/al.h"
	
//@line:42

	static int initialized = 0;	JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_init(JNIEnv* env, jclass clazz) {


//@line:45

		if(initialized) return;
		initialized = -1;
	

}

static inline jlong wrapped_Java_com_badlogic_jglfw_al_ALC_alcCreateContext
(JNIEnv* env, jclass clazz, jlong device, jintArray obj_attrlist, int* attrlist) {

//@line:50

		return (jlong)alcCreateContext((ALCdevice*)(device), (const ALCint*)(attrlist));
	
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_al_ALC_alcCreateContext(JNIEnv* env, jclass clazz, jlong device, jintArray obj_attrlist) {
	int* attrlist = (int*)env->GetPrimitiveArrayCritical(obj_attrlist, 0);

	jlong JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCreateContext(env, clazz, device, obj_attrlist, attrlist);

	env->ReleasePrimitiveArrayCritical(obj_attrlist, attrlist, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset, unsigned char* context) {

//@line:54

		return (jboolean)alcMakeContextCurrent((ALCcontext*)(context + contextByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)(obj_context?env->GetDirectBufferAddress(obj_context):0);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__Ljava_nio_Buffer_2I(env, clazz, obj_context, contextByteOffset, context);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcMakeContextCurrent__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:58

		return (jboolean)alcMakeContextCurrent((ALCcontext*)context);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcProcessContext__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)(obj_context?env->GetDirectBufferAddress(obj_context):0);


//@line:62

		alcProcessContext((ALCcontext*)(context + contextByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcProcessContext__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:66

		alcProcessContext((ALCcontext*)context);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcSuspendContext__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)(obj_context?env->GetDirectBufferAddress(obj_context):0);


//@line:70

		alcSuspendContext((ALCcontext*)(context + contextByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcSuspendContext__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:74

		alcSuspendContext((ALCcontext*)context);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcDestroyContext__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_context, jint contextByteOffset) {
	unsigned char* context = (unsigned char*)(obj_context?env->GetDirectBufferAddress(obj_context):0);


//@line:78

		alcDestroyContext((ALCcontext*)(context + contextByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcDestroyContext__J(JNIEnv* env, jclass clazz, jlong context) {


//@line:82

		alcDestroyContext((ALCcontext*)context);
	

}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetCurrentContext(JNIEnv* env, jclass clazz) {


//@line:86

		return (jlong)alcGetCurrentContext();
	

}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetContextsDevice(JNIEnv* env, jclass clazz, jlong context) {


//@line:90

		return (jlong)alcGetContextsDevice((ALCcontext*)context);
	

}

static inline jlong wrapped_Java_com_badlogic_jglfw_al_ALC_alcOpenDevice
(JNIEnv* env, jclass clazz, jstring obj_deviceName, char* deviceName) {

//@line:94

		return (long)alcOpenDevice((const ALCchar*)(deviceName));
	
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_al_ALC_alcOpenDevice(JNIEnv* env, jclass clazz, jstring obj_deviceName) {
	char* deviceName = (char*)env->GetStringUTFChars(obj_deviceName, 0);

	jlong JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcOpenDevice(env, clazz, obj_deviceName, deviceName);

	env->ReleaseStringUTFChars(obj_deviceName, deviceName);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, unsigned char* device) {

//@line:98

		return (jboolean)alcCloseDevice((ALCdevice*)(device + deviceByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__Ljava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, device);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCloseDevice__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:102

		return (jboolean)alcCloseDevice((ALCdevice*)device);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetError__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, unsigned char* device) {

//@line:106

		return (jint)alcGetError((ALCdevice*)(device + deviceByteOffset));
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetError__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetError__Ljava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, device);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetError__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:110

		return (jint)alcGetError((ALCdevice*)device);
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_extname, jint extnameByteOffset, unsigned char* device, unsigned char* extname) {

//@line:114

		return (jboolean)alcIsExtensionPresent((ALCdevice*)(device + deviceByteOffset), (const ALCchar*)(extname + extnameByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_extname, jint extnameByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	unsigned char* extname = (unsigned char*)(obj_extname?env->GetDirectBufferAddress(obj_extname):0);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, obj_extname, extnameByteOffset, device, extname);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcIsExtensionPresent__JJ(JNIEnv* env, jclass clazz, jlong device, jlong extname) {


//@line:118

		return (jboolean)alcIsExtensionPresent((ALCdevice*)device, (const ALCchar*)extname);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_enumname, jint enumnameByteOffset, unsigned char* device, unsigned char* enumname) {

//@line:122

		return (jint)alcGetEnumValue((ALCdevice*)(device + deviceByteOffset), (const ALCchar*)(enumname + enumnameByteOffset));
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_enumname, jint enumnameByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	unsigned char* enumname = (unsigned char*)(obj_enumname?env->GetDirectBufferAddress(obj_enumname):0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__Ljava_nio_Buffer_2ILjava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, obj_enumname, enumnameByteOffset, device, enumname);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetEnumValue__JJ(JNIEnv* env, jclass clazz, jlong device, jlong enumname) {


//@line:126

		return (jint)alcGetEnumValue((ALCdevice*)device, (const ALCchar*)enumname);
	

}

JNIEXPORT jstring JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetString(JNIEnv* env, jclass clazz, jlong device, jint name) {


//@line:130

		return env->NewStringUTF((const char*)alcGetString((ALCdevice*)device, (ALCenum)name));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetIntegerv__Ljava_nio_Buffer_2IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jint param, jint size, jobject obj_values, jint valuesByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:134

		alcGetIntegerv((ALCdevice*)(device + deviceByteOffset), (ALCenum)param, (ALCsizei)size, (ALCint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcGetIntegerv__JIIJ(JNIEnv* env, jclass clazz, jlong device, jint param, jint size, jlong values) {


//@line:138

		alcGetIntegerv((ALCdevice*)device, (ALCenum)param, (ALCsizei)size, (ALCint*)values);
	

}

static inline jlong wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureOpenDevice
(JNIEnv* env, jclass clazz, jstring obj_deviceName, jint frequency, jint format, jint buffersize, char* deviceName) {

//@line:142

		return (jlong)alcCaptureOpenDevice((const ALCchar*)deviceName, (ALCuint)frequency, (ALCenum)format, (ALCsizei)buffersize);
	
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureOpenDevice(JNIEnv* env, jclass clazz, jstring obj_deviceName, jint frequency, jint format, jint buffersize) {
	char* deviceName = (char*)env->GetStringUTFChars(obj_deviceName, 0);

	jlong JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureOpenDevice(env, clazz, obj_deviceName, frequency, format, buffersize, deviceName);

	env->ReleaseStringUTFChars(obj_deviceName, deviceName);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, unsigned char* device) {

//@line:146

		return (jboolean)alcCaptureCloseDevice((ALCdevice*)(device + deviceByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__Ljava_nio_Buffer_2I(env, clazz, obj_device, deviceByteOffset, device);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureCloseDevice__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:150

		return (jboolean)alcCaptureCloseDevice((ALCdevice*)device);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStart__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);


//@line:154

		alcCaptureStart((ALCdevice*)(device + deviceByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStart__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:158

		alcCaptureStart((ALCdevice*)device);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStop__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);


//@line:162

		alcCaptureStop((ALCdevice*)(device + deviceByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureStop__J(JNIEnv* env, jclass clazz, jlong device) {


//@line:166

		alcCaptureStop((ALCdevice*)device);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureSamples__Ljava_nio_Buffer_2ILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jobject obj_device, jint deviceByteOffset, jobject obj_buffer, jint bufferByteOffset, jint samples) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	unsigned char* buffer = (unsigned char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);


//@line:170

		alcCaptureSamples((ALCdevice*)(device + deviceByteOffset), (ALCvoid*)(buffer + bufferByteOffset), (ALCsizei)samples);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_ALC_alcCaptureSamples__JJI(JNIEnv* env, jclass clazz, jlong device, jlong buffer, jint samples) {


//@line:174

		alcCaptureSamples((ALCdevice*)device, (ALCvoid*)buffer, (ALCsizei)samples);
	

}

