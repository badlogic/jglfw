#include <com.badlogic.jglfw.al.AL.h>

//@line:76

	#include "AL/alc.h"
	#include "AL/al.h"
	
//@line:81

	static int initialized = 0;	JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_init(JNIEnv* env, jclass clazz) {


//@line:84

		if(initialized) return;
		initialized = -1;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDopplerFactor(JNIEnv* env, jclass clazz, jfloat value) {


//@line:89

		alDopplerFactor((ALfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDopplerVelocity(JNIEnv* env, jclass clazz, jfloat value) {


//@line:93

		alDopplerVelocity((ALfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSpeedOfSound(JNIEnv* env, jclass clazz, jfloat value) {


//@line:97

		alSpeedOfSound((ALfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDistanceModel(JNIEnv* env, jclass clazz, jint distanceModel) {


//@line:101

		alDistanceModel((ALenum)distanceModel);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alEnable(JNIEnv* env, jclass clazz, jint capability) {


//@line:105

		alEnable((ALenum)capability);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDisable(JNIEnv* env, jclass clazz, jint capability) {


//@line:109

		alDisable((ALenum)capability);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_AL_alIsEnabled(JNIEnv* env, jclass clazz, jint capability) {


//@line:113

		return (jboolean)alIsEnabled((ALenum)capability);
	

}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_al_AL_alGetString(JNIEnv* env, jclass clazz, jint param) {


//@line:117

		return env->NewStringUTF((const char*)alGetString((ALenum)param));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBooleanv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:121

		alGetBooleanv((ALenum)param, (ALboolean*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBooleanv__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:125

		alGetBooleanv((ALenum)param, (ALboolean*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetIntegerv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:129

		alGetIntegerv((ALenum)param, (ALint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetIntegerv__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:133

		alGetIntegerv((ALenum)param, (ALint*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetFloatv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:137

		alGetFloatv((ALenum)param, (ALfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetFloatv__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:141

		alGetFloatv((ALenum)param, (ALfloat*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetDoublev__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:145

		alGetDoublev((ALenum)param, (ALdouble*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetDoublev__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:149

		alGetDoublev((ALenum)param, (ALdouble*)values);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_AL_alGetBoolean(JNIEnv* env, jclass clazz, jint param) {


//@line:153

		return (jboolean)alGetBoolean((ALenum)param);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_AL_alGetInteger(JNIEnv* env, jclass clazz, jint param) {


//@line:157

		return (jint)alGetInteger((ALenum)param);
	

}

JNIEXPORT jfloat JNICALL Java_com_badlogic_jglfw_al_AL_alGetFloat(JNIEnv* env, jclass clazz, jint param) {


//@line:161

		return (jfloat)alGetFloat((ALenum)param);
	

}

JNIEXPORT jdouble JNICALL Java_com_badlogic_jglfw_al_AL_alGetDouble(JNIEnv* env, jclass clazz, jint param) {


//@line:165

		return (jdouble)alGetDouble((ALenum)param);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_AL_alGetError(JNIEnv* env, jclass clazz) {


//@line:169

		return (jint)alGetError();
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_al_AL_alIsExtensionPresent__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_extname, jint extnameByteOffset, unsigned char* extname) {

//@line:173

		return (jboolean)alIsExtensionPresent((const ALchar*)(extname + extnameByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_AL_alIsExtensionPresent__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_extname, jint extnameByteOffset) {
	unsigned char* extname = (unsigned char*)(obj_extname?env->GetDirectBufferAddress(obj_extname):0);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_AL_alIsExtensionPresent__Ljava_nio_Buffer_2I(env, clazz, obj_extname, extnameByteOffset, extname);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_AL_alIsExtensionPresent__J(JNIEnv* env, jclass clazz, jlong extname) {


//@line:177

		return (jboolean)alIsExtensionPresent((const ALchar*)extname);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_al_AL_alGetEnumValue__Ljava_nio_Buffer_2I
(JNIEnv* env, jclass clazz, jobject obj_ename, jint enameByteOffset, unsigned char* ename) {

//@line:181

		return (jint)alGetEnumValue((const ALchar*)(ename + enameByteOffset));
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_AL_alGetEnumValue__Ljava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jobject obj_ename, jint enameByteOffset) {
	unsigned char* ename = (unsigned char*)(obj_ename?env->GetDirectBufferAddress(obj_ename):0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_al_AL_alGetEnumValue__Ljava_nio_Buffer_2I(env, clazz, obj_ename, enameByteOffset, ename);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_al_AL_alGetEnumValue__J(JNIEnv* env, jclass clazz, jlong ename) {


//@line:185

		return (jint)alGetEnumValue((const ALchar*)ename);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListenerf(JNIEnv* env, jclass clazz, jint param, jfloat value) {


//@line:189

		alListenerf((ALenum)param, (ALfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListener3f(JNIEnv* env, jclass clazz, jint param, jfloat value1, jfloat value2, jfloat value3) {


//@line:193

		alListener3f((ALenum)param, (ALfloat)value1, (ALfloat)value2, (ALfloat)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListenerfv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:197

		alListenerfv((ALenum)param, (const ALfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListenerfv__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:201

		alListenerfv((ALenum)param, (const ALfloat*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListeneri(JNIEnv* env, jclass clazz, jint param, jint value) {


//@line:205

		alListeneri((ALenum)param, (ALint)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListener3i(JNIEnv* env, jclass clazz, jint param, jint value1, jint value2, jint value3) {


//@line:209

		alListener3i((ALenum)param, (ALint)value1, (ALint)value2, (ALint)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListeneriv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:213

		alListeneriv((ALenum)param, (const ALint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alListeneriv__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:217

		alListeneriv((ALenum)param, (const ALint*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListenerf__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_value, jint valueByteOffset) {
	unsigned char* value = (unsigned char*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:221

		alGetListenerf((ALenum)param, (ALfloat*)(value + valueByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListenerf__IJ(JNIEnv* env, jclass clazz, jint param, jlong value) {


//@line:225

		alGetListenerf((ALenum)param, (ALfloat*)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListener3f__ILjava_nio_Buffer_2ILjava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_value1, jint value1ByteOffset, jobject obj_value2, jint value2ByteOffset, jobject obj_value3, jint value3ByteOffset) {
	unsigned char* value1 = (unsigned char*)(obj_value1?env->GetDirectBufferAddress(obj_value1):0);
	unsigned char* value2 = (unsigned char*)(obj_value2?env->GetDirectBufferAddress(obj_value2):0);
	unsigned char* value3 = (unsigned char*)(obj_value3?env->GetDirectBufferAddress(obj_value3):0);


//@line:229

		alGetListener3f((ALenum)param, (ALfloat*)(value1 + value1ByteOffset), (ALfloat*)(value2 + value2ByteOffset), (ALfloat*)(value3 + value3ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListener3f__IJJJ(JNIEnv* env, jclass clazz, jint param, jlong value1, jlong value2, jlong value3) {


//@line:233

		alGetListener3f((ALenum)param, (ALfloat*)value1, (ALfloat*)value2, (ALfloat*)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListenerfv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:237

		alGetListenerfv((ALenum)param, (ALfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListenerfv__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:241

		alGetListenerfv((ALenum)param, (ALfloat*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListeneri__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_value, jint valueByteOffset) {
	unsigned char* value = (unsigned char*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:245

		alGetListeneri((ALenum)param, (ALint*)(value + valueByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListeneri__IJ(JNIEnv* env, jclass clazz, jint param, jlong value) {


//@line:249

		alGetListeneri((ALenum)param, (ALint*)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListener3i__ILjava_nio_Buffer_2ILjava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_value1, jint value1ByteOffset, jobject obj_value2, jint value2ByteOffset, jobject obj_value3, jint value3ByteOffset) {
	unsigned char* value1 = (unsigned char*)(obj_value1?env->GetDirectBufferAddress(obj_value1):0);
	unsigned char* value2 = (unsigned char*)(obj_value2?env->GetDirectBufferAddress(obj_value2):0);
	unsigned char* value3 = (unsigned char*)(obj_value3?env->GetDirectBufferAddress(obj_value3):0);


//@line:253

		alGetListener3i((ALenum)param, (ALint*)(value1 + value1ByteOffset), (ALint*)(value2 + value2ByteOffset), (ALint*)(value3 + value3ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListener3i__IJJJ(JNIEnv* env, jclass clazz, jint param, jlong value1, jlong value2, jlong value3) {


//@line:257

		alGetListener3i((ALenum)param, (ALint*)value1, (ALint*)value2, (ALint*)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListeneriv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:261

		alGetListeneriv((ALenum)param, (ALint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetListeneriv__IJ(JNIEnv* env, jclass clazz, jint param, jlong values) {


//@line:265

		alGetListeneriv((ALenum)param, (ALint*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGenSources__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_sources, jint sourcesByteOffset) {
	unsigned char* sources = (unsigned char*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);


//@line:269

		alGenSources((ALsizei)n, (ALuint*)(sources + sourcesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGenSources__IJ(JNIEnv* env, jclass clazz, jint n, jlong sources) {


//@line:273

		alGenSources((ALsizei)n, (ALuint*)sources);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDeleteSources__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_sources, jint sourcesByteOffset) {
	unsigned char* sources = (unsigned char*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);


//@line:277

		alDeleteSources((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDeleteSources__IJ(JNIEnv* env, jclass clazz, jint n, jlong sources) {


//@line:281

		alDeleteSources((ALsizei)n, (const ALuint*)sources);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_AL_alIsSource(JNIEnv* env, jclass clazz, jint source) {


//@line:285

		return (jboolean)alIsSource((ALuint)source);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcef(JNIEnv* env, jclass clazz, jint source, jint param, jfloat value) {


//@line:289

		alSourcef((ALuint)source, (ALenum)param, (ALfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSource3f(JNIEnv* env, jclass clazz, jint source, jint param, jfloat value1, jfloat value2, jfloat value3) {


//@line:293

		alSource3f((ALuint)source, (ALenum)param, (ALfloat)value1, (ALfloat)value2, (ALfloat)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcefv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:297

		alSourcefv((ALuint)source, (ALenum)param, (const ALfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcefv__IIJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong values) {


//@line:301

		alSourcefv((ALuint)source, (ALenum)param, (const ALfloat*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcei(JNIEnv* env, jclass clazz, jint source, jint param, jint value) {


//@line:305

		alSourcei((ALuint)source, (ALenum)param, (ALint)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSource3i(JNIEnv* env, jclass clazz, jint source, jint param, jint value1, jint value2, jint value3) {


//@line:309

		alSource3i((ALuint)source, (ALenum)param, (ALint)value1, (ALint)value2, (ALint)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceiv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:313

		alSourceiv((ALuint)source, (ALenum)param, (const ALint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceiv__IIJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong values) {


//@line:317

		alSourceiv((ALuint)source, (ALenum)param, (const ALint*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourcef__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_value, jint valueByteOffset) {
	unsigned char* value = (unsigned char*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:321

		alGetSourcef((ALuint)source, (ALenum)param, (ALfloat*)(value + valueByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourcef__IIJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong value) {


//@line:325

		alGetSourcef((ALuint)source, (ALenum)param, (ALfloat*)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSource3f__IILjava_nio_Buffer_2ILjava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_value1, jint value1ByteOffset, jobject obj_value2, jint value2ByteOffset, jobject obj_value3, jint value3ByteOffset) {
	unsigned char* value1 = (unsigned char*)(obj_value1?env->GetDirectBufferAddress(obj_value1):0);
	unsigned char* value2 = (unsigned char*)(obj_value2?env->GetDirectBufferAddress(obj_value2):0);
	unsigned char* value3 = (unsigned char*)(obj_value3?env->GetDirectBufferAddress(obj_value3):0);


//@line:329

		alGetSource3f((ALuint)source, (ALenum)param, (ALfloat*)(value1 + value1ByteOffset), (ALfloat*)(value2 + value2ByteOffset), (ALfloat*)(value3 + value3ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSource3f__IIJJJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong value1, jlong value2, jlong value3) {


//@line:333

		alGetSource3f((ALuint)source, (ALenum)param, (ALfloat*)value1, (ALfloat*)value2, (ALfloat*)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourcefv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:337

		alGetSourcefv((ALuint)source, (ALenum)param, (ALfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourcefv__IIJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong values) {


//@line:341

		alGetSourcefv((ALuint)source, (ALenum)param, (ALfloat*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourcei__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_value, jint valueByteOffset) {
	unsigned char* value = (unsigned char*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:345

		alGetSourcei((ALuint)source, (ALenum)param, (ALint*)(value + valueByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourcei__IIJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong value) {


//@line:349

		alGetSourcei((ALuint)source, (ALenum)param, (ALint*)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSource3i__IILjava_nio_Buffer_2ILjava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_value1, jint value1ByteOffset, jobject obj_value2, jint value2ByteOffset, jobject obj_value3, jint value3ByteOffset) {
	unsigned char* value1 = (unsigned char*)(obj_value1?env->GetDirectBufferAddress(obj_value1):0);
	unsigned char* value2 = (unsigned char*)(obj_value2?env->GetDirectBufferAddress(obj_value2):0);
	unsigned char* value3 = (unsigned char*)(obj_value3?env->GetDirectBufferAddress(obj_value3):0);


//@line:353

		alGetSource3i((ALuint)source, (ALenum)param, (ALint*)(value1 + value1ByteOffset), (ALint*)(value2 + value2ByteOffset), (ALint*)(value3 + value3ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSource3i__IIJJJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong value1, jlong value2, jlong value3) {


//@line:357

		alGetSource3i((ALuint)source, (ALenum)param, (ALint*)value1, (ALint*)value2, (ALint*)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourceiv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:361

		alGetSourceiv((ALuint)source, (ALenum)param, (ALint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetSourceiv__IIJ(JNIEnv* env, jclass clazz, jint source, jint param, jlong values) {


//@line:365

		alGetSourceiv((ALuint)source, (ALenum)param, (ALint*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcePlayv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_sources, jint sourcesByteOffset) {
	unsigned char* sources = (unsigned char*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);


//@line:369

		alSourcePlayv((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcePlayv__IJ(JNIEnv* env, jclass clazz, jint n, jlong sources) {


//@line:373

		alSourcePlayv((ALsizei)n, (const ALuint*)sources);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceStopv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_sources, jint sourcesByteOffset) {
	unsigned char* sources = (unsigned char*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);


//@line:377

		alSourceStopv((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceStopv__IJ(JNIEnv* env, jclass clazz, jint n, jlong sources) {


//@line:381

		alSourceStopv((ALsizei)n, (const ALuint*)sources);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceRewindv__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_sources, jint sourcesByteOffset) {
	unsigned char* sources = (unsigned char*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);


//@line:385

		alSourceRewindv((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceRewindv__IJ(JNIEnv* env, jclass clazz, jint n, jlong sources) {


//@line:389

		alSourceRewindv((ALsizei)n, (const ALuint*)sources);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcePausev__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_sources, jint sourcesByteOffset) {
	unsigned char* sources = (unsigned char*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);


//@line:393

		alSourcePausev((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcePausev__IJ(JNIEnv* env, jclass clazz, jint n, jlong sources) {


//@line:397

		alSourcePausev((ALsizei)n, (const ALuint*)sources);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcePlay(JNIEnv* env, jclass clazz, jint source) {


//@line:401

		alSourcePlay((ALuint)source);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceStop(JNIEnv* env, jclass clazz, jint source) {


//@line:405

		alSourceStop((ALuint)source);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceRewind(JNIEnv* env, jclass clazz, jint source) {


//@line:409

		alSourceRewind((ALuint)source);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourcePause(JNIEnv* env, jclass clazz, jint source) {


//@line:413

		alSourcePause((ALuint)source);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceQueueBuffers__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint nb, jobject obj_buffers, jint buffersByteOffset) {
	unsigned char* buffers = (unsigned char*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:417

		alSourceQueueBuffers((ALuint)source, (ALsizei)nb, (const ALuint*)(buffers + buffersByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceQueueBuffers__IIJ(JNIEnv* env, jclass clazz, jint source, jint nb, jlong buffers) {


//@line:421

		alSourceQueueBuffers((ALuint)source, (ALsizei)nb, (const ALuint*)buffers);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceUnqueueBuffers__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint source, jint nb, jobject obj_buffers, jint buffersByteOffset) {
	unsigned char* buffers = (unsigned char*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:425

		alSourceUnqueueBuffers((ALuint)source, (ALsizei)nb, (ALuint*)(buffers + buffersByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alSourceUnqueueBuffers__IIJ(JNIEnv* env, jclass clazz, jint source, jint nb, jlong buffers) {


//@line:429

		alSourceUnqueueBuffers((ALuint)source, (ALsizei)nb, (ALuint*)buffers);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGenBuffers__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint buffersByteOffset) {
	unsigned char* buffers = (unsigned char*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:433

		alGenBuffers((ALsizei)n, (ALuint*)(buffers + buffersByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGenBuffers__IJ(JNIEnv* env, jclass clazz, jint n, jlong buffers) {


//@line:437

		alGenBuffers((ALsizei)n, (ALuint*)buffers);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDeleteBuffers__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint buffersByteOffset) {
	unsigned char* buffers = (unsigned char*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:441

		alDeleteBuffers((ALsizei)n, (const ALuint*)(buffers + buffersByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alDeleteBuffers__IJ(JNIEnv* env, jclass clazz, jint n, jlong buffers) {


//@line:445

		alDeleteBuffers((ALsizei)n, (const ALuint*)buffers);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_al_AL_alIsBuffer(JNIEnv* env, jclass clazz, jint buffer) {


//@line:449

		return (jboolean)alIsBuffer((ALuint)buffer);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferData__IILjava_nio_Buffer_2III(JNIEnv* env, jclass clazz, jint buffer, jint format, jobject obj_data, jint dataByteOffset, jint size, jint freq) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:453

		alBufferData((ALuint)buffer, (ALenum)format, (const ALvoid*)(data + dataByteOffset), (ALsizei)size, (ALsizei)freq);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferData__IIJII(JNIEnv* env, jclass clazz, jint buffer, jint format, jlong data, jint size, jint freq) {


//@line:457

		alBufferData((ALuint)buffer, (ALenum)format, (const ALvoid*)data, (ALsizei)size, (ALsizei)freq);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferf(JNIEnv* env, jclass clazz, jint buffer, jint param, jfloat value) {


//@line:461

		alBufferf((ALuint)buffer, (ALenum)param, (ALfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBuffer3f(JNIEnv* env, jclass clazz, jint buffer, jint param, jfloat value1, jfloat value2, jfloat value3) {


//@line:465

		alBuffer3f((ALuint)buffer, (ALenum)param, (ALfloat)value1, (ALfloat)value2, (ALfloat)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferfv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:469

		alBufferfv((ALuint)buffer, (ALenum)param, (const ALfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferfv__IIJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong values) {


//@line:473

		alBufferfv((ALuint)buffer, (ALenum)param, (const ALfloat*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferi(JNIEnv* env, jclass clazz, jint buffer, jint param, jint value) {


//@line:477

		alBufferi((ALuint)buffer, (ALenum)param, (ALint)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBuffer3i(JNIEnv* env, jclass clazz, jint buffer, jint param, jint value1, jint value2, jint value3) {


//@line:481

		alBuffer3i((ALuint)buffer, (ALenum)param, (ALint)value1, (ALint)value2, (ALint)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferiv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:485

		alBufferiv((ALuint)buffer, (ALenum)param, (const ALint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alBufferiv__IIJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong values) {


//@line:489

		alBufferiv((ALuint)buffer, (ALenum)param, (const ALint*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferf__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_value, jint valueByteOffset) {
	unsigned char* value = (unsigned char*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:493

		alGetBufferf((ALuint)buffer, (ALenum)param, (ALfloat*)(value + valueByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferf__IIJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong value) {


//@line:497

		alGetBufferf((ALuint)buffer, (ALenum)param, (ALfloat*)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBuffer3f__IILjava_nio_Buffer_2ILjava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_value1, jint value1ByteOffset, jobject obj_value2, jint value2ByteOffset, jobject obj_value3, jint value3ByteOffset) {
	unsigned char* value1 = (unsigned char*)(obj_value1?env->GetDirectBufferAddress(obj_value1):0);
	unsigned char* value2 = (unsigned char*)(obj_value2?env->GetDirectBufferAddress(obj_value2):0);
	unsigned char* value3 = (unsigned char*)(obj_value3?env->GetDirectBufferAddress(obj_value3):0);


//@line:501

		alGetBuffer3f((ALuint)buffer, (ALenum)param, (ALfloat*)(value1 + value1ByteOffset), (ALfloat*)(value2 + value2ByteOffset), (ALfloat*)(value3 + value3ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBuffer3f__IIJJJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong value1, jlong value2, jlong value3) {


//@line:505

		alGetBuffer3f((ALuint)buffer, (ALenum)param, (ALfloat*)value1, (ALfloat*)value2, (ALfloat*)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferfv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:509

		alGetBufferfv((ALuint)buffer, (ALenum)param, (ALfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferfv__IIJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong values) {


//@line:513

		alGetBufferfv((ALuint)buffer, (ALenum)param, (ALfloat*)values);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferi__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_value, jint valueByteOffset) {
	unsigned char* value = (unsigned char*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:517

		alGetBufferi((ALuint)buffer, (ALenum)param, (ALint*)(value + valueByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferi__IIJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong value) {


//@line:521

		alGetBufferi((ALuint)buffer, (ALenum)param, (ALint*)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBuffer3i__IILjava_nio_Buffer_2ILjava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_value1, jint value1ByteOffset, jobject obj_value2, jint value2ByteOffset, jobject obj_value3, jint value3ByteOffset) {
	unsigned char* value1 = (unsigned char*)(obj_value1?env->GetDirectBufferAddress(obj_value1):0);
	unsigned char* value2 = (unsigned char*)(obj_value2?env->GetDirectBufferAddress(obj_value2):0);
	unsigned char* value3 = (unsigned char*)(obj_value3?env->GetDirectBufferAddress(obj_value3):0);


//@line:525

		alGetBuffer3i((ALuint)buffer, (ALenum)param, (ALint*)(value1 + value1ByteOffset), (ALint*)(value2 + value2ByteOffset), (ALint*)(value3 + value3ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBuffer3i__IIJJJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong value1, jlong value2, jlong value3) {


//@line:529

		alGetBuffer3i((ALuint)buffer, (ALenum)param, (ALint*)value1, (ALint*)value2, (ALint*)value3);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferiv__IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint param, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:533

		alGetBufferiv((ALuint)buffer, (ALenum)param, (ALint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_al_AL_alGetBufferiv__IIJ(JNIEnv* env, jclass clazz, jint buffer, jint param, jlong values) {


//@line:537

		alGetBufferiv((ALuint)buffer, (ALenum)param, (ALint*)values);
	

}

