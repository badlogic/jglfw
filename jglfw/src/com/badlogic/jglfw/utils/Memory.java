package com.badlogic.jglfw.utils;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * Methods to allocate memory on the heap and copy. Note that buffers
 * allocated with methods of this class need to be freed manually 
 * via #free(Buffer). No bounds checking is performed, all buffers
 * are assumed to be direct buffers.
 * 
 * @author mzechner
 *
 */
public class Memory {
	// @off
	/*JNI 
	#include <stdio.h>
	#include <stdlib.h>
	#include <string.h>
	*/
	
	/**
	 * Allocates numBytes bytes on the native heap. The
	 * returned {@link ByteBuffer} needs to be free via {@link #free(Buffer)}
	 * when no longer used.
	 * @param numBytes the number of bytes to allocate
	 * @return the direct Buffer pointing to the allocated heap memory or null
	 */
	public static ByteBuffer malloc(int numBytes) {
		ByteBuffer buffer = mallocJni(numBytes);
		if(buffer == null) return null;
		buffer.order(ByteOrder.nativeOrder());
		return buffer;
	}
	
	private static native ByteBuffer mallocJni (int numBytes); /*
		char* ptr = (char*)malloc(numBytes);
		if(ptr == 0) return 0;
		return env->NewDirectByteBuffer(ptr, numBytes);
	 */
	
	/**
	 * @param buffer the direct {@link Buffer} to free, previously allocated via {@link #malloc(int)}
	 */
	public static native void free (Buffer buffer); /*
		free(buffer);
	*/
	
	/**
	 * The address of the heap memory block the direct buffer points to. Does not
	 * take the position of the buffer into account.
	 * 
	 * @param buffer
	 * @return the address of the native heap area the buffer points to
	 */
	public static native long getBufferAddress (Buffer buffer); /*
	   return (jlong) buffer;
	*/

	public static int getPosition(Buffer buffer) {
		if(buffer instanceof ByteBuffer) return buffer.position();				
		if(buffer instanceof CharBuffer) return buffer.position() << 1;
		if(buffer instanceof DoubleBuffer) return buffer.position() << 3;
		if(buffer instanceof FloatBuffer) return buffer.position() << 2;
		if(buffer instanceof IntBuffer) return buffer.position() << 2;
		if(buffer instanceof LongBuffer) return buffer.position() << 3;
		if(buffer instanceof ShortBuffer) return buffer.position() << 1;
		if(buffer == null) return 0;
		return buffer.position();
	}
}
