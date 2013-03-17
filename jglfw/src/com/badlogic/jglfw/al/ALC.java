package com.badlogic.jglfw.al;

import java.nio.Buffer;

public class ALC {
	public static final int ALC_INVALID = 0;
	public static final int ALC_VERSION_0_1 = 1;
	public static final int ALC_FALSE = 0;
	public static final int ALC_TRUE = 1;
	public static final int ALC_FREQUENCY = 0x1007;
	public static final int ALC_REFRESH = 0x1008;
	public static final int ALC_SYNC = 0x1009;
	public static final int ALC_MONO_SOURCES = 0x1010;
	public static final int ALC_STEREO_SOURCES = 0x1011;
	public static final int ALC_NO_ERROR = 0;
	public static final int ALC_INVALID_DEVICE = 0xA001;
	public static final int ALC_INVALID_CONTEXT = 0xA002;
	public static final int ALC_INVALID_ENUM = 0xA003;
	public static final int ALC_INVALID_VALUE = 0xA004;
	public static final int ALC_OUT_OF_MEMORY = 0xA005;
	public static final int ALC_MAJOR_VERSION = 0x1000;
	public static final int ALC_MINOR_VERSION = 0x1001;
	public static final int ALC_ATTRIBUTES_SIZE = 0x1002;
	public static final int ALC_ALL_ATTRIBUTES = 0x1003;
	public static final int ALC_DEFAULT_DEVICE_SPECIFIER = 0x1004;
	public static final int ALC_DEVICE_SPECIFIER = 0x1005;
	public static final int ALC_EXTENSIONS = 0x1006;
	public static final int ALC_EXT_CAPTURE = 1;
	public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 0x310;
	public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;
	public static final int ALC_CAPTURE_SAMPLES = 0x312;
	public static final int ALC_ENUMERATE_ALL_EXT = 1;
	public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 0x1012;
	public static final int ALC_ALL_DEVICES_SPECIFIER = 0x1013;

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

	public static native long alcCreateContext(long device, int[] attrlist); /*
		return (jlong)alcCreateContext((ALCdevice*)(device), (const ALCint*)(attrlist));
	*/

	public static native boolean alcMakeContextCurrent(Buffer context, int contextByteOffset); /*
		return (jboolean)alcMakeContextCurrent((ALCcontext*)(context + contextByteOffset));
	*/

	public static native boolean alcMakeContextCurrent(long context); /*
		return (jboolean)alcMakeContextCurrent((ALCcontext*)context);
	*/

	public static native void alcProcessContext(Buffer context, int contextByteOffset); /*
		alcProcessContext((ALCcontext*)(context + contextByteOffset));
	*/

	public static native void alcProcessContext(long context); /*
		alcProcessContext((ALCcontext*)context);
	*/

	public static native void alcSuspendContext(Buffer context, int contextByteOffset); /*
		alcSuspendContext((ALCcontext*)(context + contextByteOffset));
	*/

	public static native void alcSuspendContext(long context); /*
		alcSuspendContext((ALCcontext*)context);
	*/

	public static native void alcDestroyContext(Buffer context, int contextByteOffset); /*
		alcDestroyContext((ALCcontext*)(context + contextByteOffset));
	*/

	public static native void alcDestroyContext(long context); /*
		alcDestroyContext((ALCcontext*)context);
	*/

	public static native long alcGetCurrentContext(); /*
		return (jlong)alcGetCurrentContext();
	*/

	public static native long alcGetContextsDevice(long context); /*
		return (jlong)alcGetContextsDevice((ALCcontext*)context);
	*/

	public static native long alcOpenDevice(String deviceName); /*
		return (long)alcOpenDevice((const ALCchar*)(deviceName));
	*/

	public static native boolean alcCloseDevice(Buffer device, int deviceByteOffset); /*
		return (jboolean)alcCloseDevice((ALCdevice*)(device + deviceByteOffset));
	*/

	public static native boolean alcCloseDevice(long device); /*
		return (jboolean)alcCloseDevice((ALCdevice*)device);
	*/

	public static native int alcGetError(Buffer device, int deviceByteOffset); /*
		return (jint)alcGetError((ALCdevice*)(device + deviceByteOffset));
	*/

	public static native int alcGetError(long device); /*
		return (jint)alcGetError((ALCdevice*)device);
	*/

	public static native boolean alcIsExtensionPresent(Buffer device, int deviceByteOffset, Buffer extname, int extnameByteOffset); /*
		return (jboolean)alcIsExtensionPresent((ALCdevice*)(device + deviceByteOffset), (const ALCchar*)(extname + extnameByteOffset));
	*/

	public static native boolean alcIsExtensionPresent(long device, long extname); /*
		return (jboolean)alcIsExtensionPresent((ALCdevice*)device, (const ALCchar*)extname);
	*/

	public static native int alcGetEnumValue(Buffer device, int deviceByteOffset, Buffer enumname, int enumnameByteOffset); /*
		return (jint)alcGetEnumValue((ALCdevice*)(device + deviceByteOffset), (const ALCchar*)(enumname + enumnameByteOffset));
	*/

	public static native int alcGetEnumValue(long device, long enumname); /*
		return (jint)alcGetEnumValue((ALCdevice*)device, (const ALCchar*)enumname);
	*/

	public static native String alcGetString(long device, int name); /*
		return env->NewStringUTF((const char*)alcGetString((ALCdevice*)device, (ALCenum)name));
	*/

	public static native void alcGetIntegerv(Buffer device, int deviceByteOffset, int param, int size, Buffer values, int valuesByteOffset); /*
		alcGetIntegerv((ALCdevice*)(device + deviceByteOffset), (ALCenum)param, (ALCsizei)size, (ALCint*)(values + valuesByteOffset));
	*/

	public static native void alcGetIntegerv(long device, int param, int size, long values); /*
		alcGetIntegerv((ALCdevice*)device, (ALCenum)param, (ALCsizei)size, (ALCint*)values);
	*/

	public static native long alcCaptureOpenDevice(String deviceName, int frequency, int format, int buffersize); /*
		return (jlong)alcCaptureOpenDevice((const ALCchar*)deviceName, (ALCuint)frequency, (ALCenum)format, (ALCsizei)buffersize);
	*/

	public static native boolean alcCaptureCloseDevice(Buffer device, int deviceByteOffset); /*
		return (jboolean)alcCaptureCloseDevice((ALCdevice*)(device + deviceByteOffset));
	*/

	public static native boolean alcCaptureCloseDevice(long device); /*
		return (jboolean)alcCaptureCloseDevice((ALCdevice*)device);
	*/

	public static native void alcCaptureStart(Buffer device, int deviceByteOffset); /*
		alcCaptureStart((ALCdevice*)(device + deviceByteOffset));
	*/

	public static native void alcCaptureStart(long device); /*
		alcCaptureStart((ALCdevice*)device);
	*/

	public static native void alcCaptureStop(Buffer device, int deviceByteOffset); /*
		alcCaptureStop((ALCdevice*)(device + deviceByteOffset));
	*/

	public static native void alcCaptureStop(long device); /*
		alcCaptureStop((ALCdevice*)device);
	*/

	public static native void alcCaptureSamples(Buffer device, int deviceByteOffset, Buffer buffer, int bufferByteOffset, int samples); /*
		alcCaptureSamples((ALCdevice*)(device + deviceByteOffset), (ALCvoid*)(buffer + bufferByteOffset), (ALCsizei)samples);
	*/

	public static native void alcCaptureSamples(long device, long buffer, int samples); /*
		alcCaptureSamples((ALCdevice*)device, (ALCvoid*)buffer, (ALCsizei)samples);
	*/

}