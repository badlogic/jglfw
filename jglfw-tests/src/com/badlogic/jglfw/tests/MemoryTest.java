/**
 * Copyright (C) 2010
 * "Kompetenzzentrum fuer wissensbasierte Anwendungen Forschungs- und EntwicklungsgmbH"
 * (Know-Center), Graz, Austria, office@know-center.at.
 *
 * Licensees holding valid Know-Center Commercial licenses may use this file in
 * accordance with the Know-Center Commercial License Agreement provided with
 * the Software or, alternatively, in accordance with the terms contained in
 * a written agreement between Licensees and Know-Center.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.badlogic.jglfw.tests;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

import com.badlogic.jglfw.utils.Memory;

public class MemoryTest {
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(20);
		buffer.position(1);
		System.out.println(Memory.getPosition(buffer));
		
		ShortBuffer sBuffer = buffer.asShortBuffer();
		sBuffer.position(1);
		System.out.println(Memory.getPosition(sBuffer));
		
		CharBuffer cBuffer = buffer.asCharBuffer();
		cBuffer.position(1);
		System.out.println(Memory.getPosition(cBuffer));
		
		IntBuffer iBuffer = buffer.asIntBuffer();
		iBuffer.position(1);
		System.out.println(Memory.getPosition(iBuffer));
		
		FloatBuffer fBuffer = buffer.asFloatBuffer();
		fBuffer.position(1);
		System.out.println(Memory.getPosition(fBuffer));
		
		LongBuffer lBuffer = buffer.asLongBuffer();
		lBuffer.position(1);
		System.out.println(Memory.getPosition(lBuffer));
		
		DoubleBuffer dBuffer = buffer.asDoubleBuffer();
		dBuffer.position(1);
		System.out.println(Memory.getPosition(dBuffer));
	}
}
