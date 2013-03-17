#include <com.badlogic.jglfw.utils.Memory.h>

//@line:24
 
	#include <stdio.h>
	#include <stdlib.h>
	#include <string.h>
	JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_utils_Memory_mallocJni(JNIEnv* env, jclass clazz, jint numBytes) {


//@line:44

		char* ptr = (char*)malloc(numBytes);
		if(ptr == 0) return 0;
		return env->NewDirectByteBuffer(ptr, numBytes);
	 

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_utils_Memory_free(JNIEnv* env, jclass clazz, jobject obj_buffer) {
	unsigned char* buffer = (unsigned char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);


//@line:53

		free(buffer);
	

}

static inline jlong wrapped_Java_com_badlogic_jglfw_utils_Memory_getBufferAddress
(JNIEnv* env, jclass clazz, jobject obj_buffer, unsigned char* buffer) {

//@line:64

	   return (jlong) buffer;
	
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_utils_Memory_getBufferAddress(JNIEnv* env, jclass clazz, jobject obj_buffer) {
	unsigned char* buffer = (unsigned char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);

	jlong JNI_returnValue = wrapped_Java_com_badlogic_jglfw_utils_Memory_getBufferAddress(env, clazz, obj_buffer, buffer);


	return JNI_returnValue;
}

