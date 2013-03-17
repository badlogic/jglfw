package com.badlogic.jglfw.al;

import java.nio.Buffer;

public class AL {
	public static final int AL_INVALID = (-1);
	public static final int AL_INVALID_ENUM = 0xA002;
	public static final int AL_INVALID_OPERATION = 0xA004;
	public static final int AL_NONE = 0;
	public static final int AL_FALSE = 0;
	public static final int AL_TRUE = 1;
	public static final int AL_SOURCE_RELATIVE = 0x202;
	public static final int AL_CONE_INNER_ANGLE = 0x1001;
	public static final int AL_CONE_OUTER_ANGLE = 0x1002;
	public static final int AL_PITCH = 0x1003;
	public static final int AL_POSITION = 0x1004;
	public static final int AL_DIRECTION = 0x1005;
	public static final int AL_VELOCITY = 0x1006;
	public static final int AL_LOOPING = 0x1007;
	public static final int AL_BUFFER = 0x1009;
	public static final int AL_GAIN = 0x100A;
	public static final int AL_MIN_GAIN = 0x100D;
	public static final int AL_MAX_GAIN = 0x100E;
	public static final int AL_ORIENTATION = 0x100F;
	public static final int AL_SOURCE_STATE = 0x1010;
	public static final int AL_INITIAL = 0x1011;
	public static final int AL_PLAYING = 0x1012;
	public static final int AL_PAUSED = 0x1013;
	public static final int AL_STOPPED = 0x1014;
	public static final int AL_BUFFERS_QUEUED = 0x1015;
	public static final int AL_BUFFERS_PROCESSED = 0x1016;
	public static final int AL_REFERENCE_DISTANCE = 0x1020;
	public static final int AL_ROLLOFF_FACTOR = 0x1021;
	public static final int AL_CONE_OUTER_GAIN = 0x1022;
	public static final int AL_MAX_DISTANCE = 0x1023;
	public static final int AL_SEC_OFFSET = 0x1024;
	public static final int AL_SAMPLE_OFFSET = 0x1025;
	public static final int AL_BYTE_OFFSET = 0x1026;
	public static final int AL_SOURCE_TYPE = 0x1027;
	public static final int AL_STATIC = 0x1028;
	public static final int AL_STREAMING = 0x1029;
	public static final int AL_UNDETERMINED = 0x1030;
	public static final int AL_FORMAT_MONO8 = 0x1100;
	public static final int AL_FORMAT_MONO16 = 0x1101;
	public static final int AL_FORMAT_STEREO8 = 0x1102;
	public static final int AL_FORMAT_STEREO16 = 0x1103;
	public static final int AL_FREQUENCY = 0x2001;
	public static final int AL_BITS = 0x2002;
	public static final int AL_CHANNELS = 0x2003;
	public static final int AL_SIZE = 0x2004;
	public static final int AL_UNUSED = 0x2010;
	public static final int AL_PENDING = 0x2011;
	public static final int AL_PROCESSED = 0x2012;
	public static final int AL_NO_ERROR = 0;
	public static final int AL_INVALID_NAME = 0xA001;
	public static final int AL_ILLEGAL_ENUM = AL_INVALID_ENUM;
	public static final int AL_INVALID_VALUE = 0xA003;
	public static final int AL_ILLEGAL_COMMAND = AL_INVALID_OPERATION;
	public static final int AL_OUT_OF_MEMORY = 0xA005;
	public static final int AL_VENDOR = 0xB001;
	public static final int AL_VERSION = 0xB002;
	public static final int AL_RENDERER = 0xB003;
	public static final int AL_EXTENSIONS = 0xB004;
	public static final int AL_DOPPLER_FACTOR = 0xC000;
	public static final int AL_DOPPLER_VELOCITY = 0xC001;
	public static final int AL_SPEED_OF_SOUND = 0xC003;
	public static final int AL_DISTANCE_MODEL = 0xD000;
	public static final int AL_INVERSE_DISTANCE = 0xD001;
	public static final int AL_INVERSE_DISTANCE_CLAMPED = 0xD002;
	public static final int AL_LINEAR_DISTANCE = 0xD003;
	public static final int AL_LINEAR_DISTANCE_CLAMPED = 0xD004;
	public static final int AL_EXPONENT_DISTANCE = 0xD005;
	public static final int AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;

	// @off
	/*JNI
	#include "AL/alc.h"
	#include "AL/al.h"
	*/
	// @off
	/*JNI
	static int initialized = 0;	*/

	public static native void init(); /*
		if(initialized) return;
		initialized = -1;
	*/

	public static native void alDopplerFactor(float value); /*
		alDopplerFactor((ALfloat)value);
	*/

	public static native void alDopplerVelocity(float value); /*
		alDopplerVelocity((ALfloat)value);
	*/

	public static native void alSpeedOfSound(float value); /*
		alSpeedOfSound((ALfloat)value);
	*/

	public static native void alDistanceModel(int distanceModel); /*
		alDistanceModel((ALenum)distanceModel);
	*/

	public static native void alEnable(int capability); /*
		alEnable((ALenum)capability);
	*/

	public static native void alDisable(int capability); /*
		alDisable((ALenum)capability);
	*/

	public static native boolean alIsEnabled(int capability); /*
		return (jboolean)alIsEnabled((ALenum)capability);
	*/

	public static native Buffer alGetString(int param); /*
		return env->NewStringUTF((const char*)alGetString((ALenum)param));
	*/

	public static native void alGetBooleanv(int param, Buffer values, int valuesByteOffset); /*
		alGetBooleanv((ALenum)param, (ALboolean*)(values + valuesByteOffset));
	*/

	public static native void alGetBooleanv(int param, long values); /*
		alGetBooleanv((ALenum)param, (ALboolean*)values);
	*/

	public static native void alGetIntegerv(int param, Buffer values, int valuesByteOffset); /*
		alGetIntegerv((ALenum)param, (ALint*)(values + valuesByteOffset));
	*/

	public static native void alGetIntegerv(int param, long values); /*
		alGetIntegerv((ALenum)param, (ALint*)values);
	*/

	public static native void alGetFloatv(int param, Buffer values, int valuesByteOffset); /*
		alGetFloatv((ALenum)param, (ALfloat*)(values + valuesByteOffset));
	*/

	public static native void alGetFloatv(int param, long values); /*
		alGetFloatv((ALenum)param, (ALfloat*)values);
	*/

	public static native void alGetDoublev(int param, Buffer values, int valuesByteOffset); /*
		alGetDoublev((ALenum)param, (ALdouble*)(values + valuesByteOffset));
	*/

	public static native void alGetDoublev(int param, long values); /*
		alGetDoublev((ALenum)param, (ALdouble*)values);
	*/

	public static native boolean alGetBoolean(int param); /*
		return (jboolean)alGetBoolean((ALenum)param);
	*/

	public static native int alGetInteger(int param); /*
		return (jint)alGetInteger((ALenum)param);
	*/

	public static native float alGetFloat(int param); /*
		return (jfloat)alGetFloat((ALenum)param);
	*/

	public static native double alGetDouble(int param); /*
		return (jdouble)alGetDouble((ALenum)param);
	*/

	public static native int alGetError(); /*
		return (jint)alGetError();
	*/

	public static native boolean alIsExtensionPresent(Buffer extname, int extnameByteOffset); /*
		return (jboolean)alIsExtensionPresent((const ALchar*)(extname + extnameByteOffset));
	*/

	public static native boolean alIsExtensionPresent(long extname); /*
		return (jboolean)alIsExtensionPresent((const ALchar*)extname);
	*/

	public static native int alGetEnumValue(Buffer ename, int enameByteOffset); /*
		return (jint)alGetEnumValue((const ALchar*)(ename + enameByteOffset));
	*/

	public static native int alGetEnumValue(long ename); /*
		return (jint)alGetEnumValue((const ALchar*)ename);
	*/

	public static native void alListenerf(int param, float value); /*
		alListenerf((ALenum)param, (ALfloat)value);
	*/

	public static native void alListener3f(int param, float value1, float value2, float value3); /*
		alListener3f((ALenum)param, (ALfloat)value1, (ALfloat)value2, (ALfloat)value3);
	*/

	public static native void alListenerfv(int param, Buffer values, int valuesByteOffset); /*
		alListenerfv((ALenum)param, (const ALfloat*)(values + valuesByteOffset));
	*/

	public static native void alListenerfv(int param, long values); /*
		alListenerfv((ALenum)param, (const ALfloat*)values);
	*/

	public static native void alListeneri(int param, int value); /*
		alListeneri((ALenum)param, (ALint)value);
	*/

	public static native void alListener3i(int param, int value1, int value2, int value3); /*
		alListener3i((ALenum)param, (ALint)value1, (ALint)value2, (ALint)value3);
	*/

	public static native void alListeneriv(int param, Buffer values, int valuesByteOffset); /*
		alListeneriv((ALenum)param, (const ALint*)(values + valuesByteOffset));
	*/

	public static native void alListeneriv(int param, long values); /*
		alListeneriv((ALenum)param, (const ALint*)values);
	*/

	public static native void alGetListenerf(int param, Buffer value, int valueByteOffset); /*
		alGetListenerf((ALenum)param, (ALfloat*)(value + valueByteOffset));
	*/

	public static native void alGetListenerf(int param, long value); /*
		alGetListenerf((ALenum)param, (ALfloat*)value);
	*/

	public static native void alGetListener3f(int param, Buffer value1, int value1ByteOffset, Buffer value2, int value2ByteOffset, Buffer value3, int value3ByteOffset); /*
		alGetListener3f((ALenum)param, (ALfloat*)(value1 + value1ByteOffset), (ALfloat*)(value2 + value2ByteOffset), (ALfloat*)(value3 + value3ByteOffset));
	*/

	public static native void alGetListener3f(int param, long value1, long value2, long value3); /*
		alGetListener3f((ALenum)param, (ALfloat*)value1, (ALfloat*)value2, (ALfloat*)value3);
	*/

	public static native void alGetListenerfv(int param, Buffer values, int valuesByteOffset); /*
		alGetListenerfv((ALenum)param, (ALfloat*)(values + valuesByteOffset));
	*/

	public static native void alGetListenerfv(int param, long values); /*
		alGetListenerfv((ALenum)param, (ALfloat*)values);
	*/

	public static native void alGetListeneri(int param, Buffer value, int valueByteOffset); /*
		alGetListeneri((ALenum)param, (ALint*)(value + valueByteOffset));
	*/

	public static native void alGetListeneri(int param, long value); /*
		alGetListeneri((ALenum)param, (ALint*)value);
	*/

	public static native void alGetListener3i(int param, Buffer value1, int value1ByteOffset, Buffer value2, int value2ByteOffset, Buffer value3, int value3ByteOffset); /*
		alGetListener3i((ALenum)param, (ALint*)(value1 + value1ByteOffset), (ALint*)(value2 + value2ByteOffset), (ALint*)(value3 + value3ByteOffset));
	*/

	public static native void alGetListener3i(int param, long value1, long value2, long value3); /*
		alGetListener3i((ALenum)param, (ALint*)value1, (ALint*)value2, (ALint*)value3);
	*/

	public static native void alGetListeneriv(int param, Buffer values, int valuesByteOffset); /*
		alGetListeneriv((ALenum)param, (ALint*)(values + valuesByteOffset));
	*/

	public static native void alGetListeneriv(int param, long values); /*
		alGetListeneriv((ALenum)param, (ALint*)values);
	*/

	public static native void alGenSources(int n, Buffer sources, int sourcesByteOffset); /*
		alGenSources((ALsizei)n, (ALuint*)(sources + sourcesByteOffset));
	*/

	public static native void alGenSources(int n, long sources); /*
		alGenSources((ALsizei)n, (ALuint*)sources);
	*/

	public static native void alDeleteSources(int n, Buffer sources, int sourcesByteOffset); /*
		alDeleteSources((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	*/

	public static native void alDeleteSources(int n, long sources); /*
		alDeleteSources((ALsizei)n, (const ALuint*)sources);
	*/

	public static native boolean alIsSource(int source); /*
		return (jboolean)alIsSource((ALuint)source);
	*/

	public static native void alSourcef(int source, int param, float value); /*
		alSourcef((ALuint)source, (ALenum)param, (ALfloat)value);
	*/

	public static native void alSource3f(int source, int param, float value1, float value2, float value3); /*
		alSource3f((ALuint)source, (ALenum)param, (ALfloat)value1, (ALfloat)value2, (ALfloat)value3);
	*/

	public static native void alSourcefv(int source, int param, Buffer values, int valuesByteOffset); /*
		alSourcefv((ALuint)source, (ALenum)param, (const ALfloat*)(values + valuesByteOffset));
	*/

	public static native void alSourcefv(int source, int param, long values); /*
		alSourcefv((ALuint)source, (ALenum)param, (const ALfloat*)values);
	*/

	public static native void alSourcei(int source, int param, int value); /*
		alSourcei((ALuint)source, (ALenum)param, (ALint)value);
	*/

	public static native void alSource3i(int source, int param, int value1, int value2, int value3); /*
		alSource3i((ALuint)source, (ALenum)param, (ALint)value1, (ALint)value2, (ALint)value3);
	*/

	public static native void alSourceiv(int source, int param, Buffer values, int valuesByteOffset); /*
		alSourceiv((ALuint)source, (ALenum)param, (const ALint*)(values + valuesByteOffset));
	*/

	public static native void alSourceiv(int source, int param, long values); /*
		alSourceiv((ALuint)source, (ALenum)param, (const ALint*)values);
	*/

	public static native void alGetSourcef(int source, int param, Buffer value, int valueByteOffset); /*
		alGetSourcef((ALuint)source, (ALenum)param, (ALfloat*)(value + valueByteOffset));
	*/

	public static native void alGetSourcef(int source, int param, long value); /*
		alGetSourcef((ALuint)source, (ALenum)param, (ALfloat*)value);
	*/

	public static native void alGetSource3f(int source, int param, Buffer value1, int value1ByteOffset, Buffer value2, int value2ByteOffset, Buffer value3, int value3ByteOffset); /*
		alGetSource3f((ALuint)source, (ALenum)param, (ALfloat*)(value1 + value1ByteOffset), (ALfloat*)(value2 + value2ByteOffset), (ALfloat*)(value3 + value3ByteOffset));
	*/

	public static native void alGetSource3f(int source, int param, long value1, long value2, long value3); /*
		alGetSource3f((ALuint)source, (ALenum)param, (ALfloat*)value1, (ALfloat*)value2, (ALfloat*)value3);
	*/

	public static native void alGetSourcefv(int source, int param, Buffer values, int valuesByteOffset); /*
		alGetSourcefv((ALuint)source, (ALenum)param, (ALfloat*)(values + valuesByteOffset));
	*/

	public static native void alGetSourcefv(int source, int param, long values); /*
		alGetSourcefv((ALuint)source, (ALenum)param, (ALfloat*)values);
	*/

	public static native void alGetSourcei(int source, int param, Buffer value, int valueByteOffset); /*
		alGetSourcei((ALuint)source, (ALenum)param, (ALint*)(value + valueByteOffset));
	*/

	public static native void alGetSourcei(int source, int param, long value); /*
		alGetSourcei((ALuint)source, (ALenum)param, (ALint*)value);
	*/

	public static native void alGetSource3i(int source, int param, Buffer value1, int value1ByteOffset, Buffer value2, int value2ByteOffset, Buffer value3, int value3ByteOffset); /*
		alGetSource3i((ALuint)source, (ALenum)param, (ALint*)(value1 + value1ByteOffset), (ALint*)(value2 + value2ByteOffset), (ALint*)(value3 + value3ByteOffset));
	*/

	public static native void alGetSource3i(int source, int param, long value1, long value2, long value3); /*
		alGetSource3i((ALuint)source, (ALenum)param, (ALint*)value1, (ALint*)value2, (ALint*)value3);
	*/

	public static native void alGetSourceiv(int source, int param, Buffer values, int valuesByteOffset); /*
		alGetSourceiv((ALuint)source, (ALenum)param, (ALint*)(values + valuesByteOffset));
	*/

	public static native void alGetSourceiv(int source, int param, long values); /*
		alGetSourceiv((ALuint)source, (ALenum)param, (ALint*)values);
	*/

	public static native void alSourcePlayv(int n, Buffer sources, int sourcesByteOffset); /*
		alSourcePlayv((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	*/

	public static native void alSourcePlayv(int n, long sources); /*
		alSourcePlayv((ALsizei)n, (const ALuint*)sources);
	*/

	public static native void alSourceStopv(int n, Buffer sources, int sourcesByteOffset); /*
		alSourceStopv((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	*/

	public static native void alSourceStopv(int n, long sources); /*
		alSourceStopv((ALsizei)n, (const ALuint*)sources);
	*/

	public static native void alSourceRewindv(int n, Buffer sources, int sourcesByteOffset); /*
		alSourceRewindv((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	*/

	public static native void alSourceRewindv(int n, long sources); /*
		alSourceRewindv((ALsizei)n, (const ALuint*)sources);
	*/

	public static native void alSourcePausev(int n, Buffer sources, int sourcesByteOffset); /*
		alSourcePausev((ALsizei)n, (const ALuint*)(sources + sourcesByteOffset));
	*/

	public static native void alSourcePausev(int n, long sources); /*
		alSourcePausev((ALsizei)n, (const ALuint*)sources);
	*/

	public static native void alSourcePlay(int source); /*
		alSourcePlay((ALuint)source);
	*/

	public static native void alSourceStop(int source); /*
		alSourceStop((ALuint)source);
	*/

	public static native void alSourceRewind(int source); /*
		alSourceRewind((ALuint)source);
	*/

	public static native void alSourcePause(int source); /*
		alSourcePause((ALuint)source);
	*/

	public static native void alSourceQueueBuffers(int source, int nb, Buffer buffers, int buffersByteOffset); /*
		alSourceQueueBuffers((ALuint)source, (ALsizei)nb, (const ALuint*)(buffers + buffersByteOffset));
	*/

	public static native void alSourceQueueBuffers(int source, int nb, long buffers); /*
		alSourceQueueBuffers((ALuint)source, (ALsizei)nb, (const ALuint*)buffers);
	*/

	public static native void alSourceUnqueueBuffers(int source, int nb, Buffer buffers, int buffersByteOffset); /*
		alSourceUnqueueBuffers((ALuint)source, (ALsizei)nb, (ALuint*)(buffers + buffersByteOffset));
	*/

	public static native void alSourceUnqueueBuffers(int source, int nb, long buffers); /*
		alSourceUnqueueBuffers((ALuint)source, (ALsizei)nb, (ALuint*)buffers);
	*/

	public static native void alGenBuffers(int n, Buffer buffers, int buffersByteOffset); /*
		alGenBuffers((ALsizei)n, (ALuint*)(buffers + buffersByteOffset));
	*/

	public static native void alGenBuffers(int n, long buffers); /*
		alGenBuffers((ALsizei)n, (ALuint*)buffers);
	*/

	public static native void alDeleteBuffers(int n, Buffer buffers, int buffersByteOffset); /*
		alDeleteBuffers((ALsizei)n, (const ALuint*)(buffers + buffersByteOffset));
	*/

	public static native void alDeleteBuffers(int n, long buffers); /*
		alDeleteBuffers((ALsizei)n, (const ALuint*)buffers);
	*/

	public static native boolean alIsBuffer(int buffer); /*
		return (jboolean)alIsBuffer((ALuint)buffer);
	*/

	public static native void alBufferData(int buffer, int format, Buffer data, int dataByteOffset, int size, int freq); /*
		alBufferData((ALuint)buffer, (ALenum)format, (const ALvoid*)(data + dataByteOffset), (ALsizei)size, (ALsizei)freq);
	*/

	public static native void alBufferData(int buffer, int format, long data, int size, int freq); /*
		alBufferData((ALuint)buffer, (ALenum)format, (const ALvoid*)data, (ALsizei)size, (ALsizei)freq);
	*/

	public static native void alBufferf(int buffer, int param, float value); /*
		alBufferf((ALuint)buffer, (ALenum)param, (ALfloat)value);
	*/

	public static native void alBuffer3f(int buffer, int param, float value1, float value2, float value3); /*
		alBuffer3f((ALuint)buffer, (ALenum)param, (ALfloat)value1, (ALfloat)value2, (ALfloat)value3);
	*/

	public static native void alBufferfv(int buffer, int param, Buffer values, int valuesByteOffset); /*
		alBufferfv((ALuint)buffer, (ALenum)param, (const ALfloat*)(values + valuesByteOffset));
	*/

	public static native void alBufferfv(int buffer, int param, long values); /*
		alBufferfv((ALuint)buffer, (ALenum)param, (const ALfloat*)values);
	*/

	public static native void alBufferi(int buffer, int param, int value); /*
		alBufferi((ALuint)buffer, (ALenum)param, (ALint)value);
	*/

	public static native void alBuffer3i(int buffer, int param, int value1, int value2, int value3); /*
		alBuffer3i((ALuint)buffer, (ALenum)param, (ALint)value1, (ALint)value2, (ALint)value3);
	*/

	public static native void alBufferiv(int buffer, int param, Buffer values, int valuesByteOffset); /*
		alBufferiv((ALuint)buffer, (ALenum)param, (const ALint*)(values + valuesByteOffset));
	*/

	public static native void alBufferiv(int buffer, int param, long values); /*
		alBufferiv((ALuint)buffer, (ALenum)param, (const ALint*)values);
	*/

	public static native void alGetBufferf(int buffer, int param, Buffer value, int valueByteOffset); /*
		alGetBufferf((ALuint)buffer, (ALenum)param, (ALfloat*)(value + valueByteOffset));
	*/

	public static native void alGetBufferf(int buffer, int param, long value); /*
		alGetBufferf((ALuint)buffer, (ALenum)param, (ALfloat*)value);
	*/

	public static native void alGetBuffer3f(int buffer, int param, Buffer value1, int value1ByteOffset, Buffer value2, int value2ByteOffset, Buffer value3, int value3ByteOffset); /*
		alGetBuffer3f((ALuint)buffer, (ALenum)param, (ALfloat*)(value1 + value1ByteOffset), (ALfloat*)(value2 + value2ByteOffset), (ALfloat*)(value3 + value3ByteOffset));
	*/

	public static native void alGetBuffer3f(int buffer, int param, long value1, long value2, long value3); /*
		alGetBuffer3f((ALuint)buffer, (ALenum)param, (ALfloat*)value1, (ALfloat*)value2, (ALfloat*)value3);
	*/

	public static native void alGetBufferfv(int buffer, int param, Buffer values, int valuesByteOffset); /*
		alGetBufferfv((ALuint)buffer, (ALenum)param, (ALfloat*)(values + valuesByteOffset));
	*/

	public static native void alGetBufferfv(int buffer, int param, long values); /*
		alGetBufferfv((ALuint)buffer, (ALenum)param, (ALfloat*)values);
	*/

	public static native void alGetBufferi(int buffer, int param, Buffer value, int valueByteOffset); /*
		alGetBufferi((ALuint)buffer, (ALenum)param, (ALint*)(value + valueByteOffset));
	*/

	public static native void alGetBufferi(int buffer, int param, long value); /*
		alGetBufferi((ALuint)buffer, (ALenum)param, (ALint*)value);
	*/

	public static native void alGetBuffer3i(int buffer, int param, Buffer value1, int value1ByteOffset, Buffer value2, int value2ByteOffset, Buffer value3, int value3ByteOffset); /*
		alGetBuffer3i((ALuint)buffer, (ALenum)param, (ALint*)(value1 + value1ByteOffset), (ALint*)(value2 + value2ByteOffset), (ALint*)(value3 + value3ByteOffset));
	*/

	public static native void alGetBuffer3i(int buffer, int param, long value1, long value2, long value3); /*
		alGetBuffer3i((ALuint)buffer, (ALenum)param, (ALint*)value1, (ALint*)value2, (ALint*)value3);
	*/

	public static native void alGetBufferiv(int buffer, int param, Buffer values, int valuesByteOffset); /*
		alGetBufferiv((ALuint)buffer, (ALenum)param, (ALint*)(values + valuesByteOffset));
	*/

	public static native void alGetBufferiv(int buffer, int param, long values); /*
		alGetBufferiv((ALuint)buffer, (ALenum)param, (ALint*)values);
	*/

}