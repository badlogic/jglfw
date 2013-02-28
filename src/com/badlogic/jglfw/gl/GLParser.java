package com.badlogic.jglfw.gl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GLParser {
	public static class GLConstant {
		public String name;
		public String value;
		@Override
		public String toString() {
			return "const " + name + " = " + value;
		}			
	}
	
	public static class GLType {
		public String text;
		
		public String getJavaType() {
			return ""; // FIXME
		}

		@Override
		public String toString() {
			return text;
		}
	}
	
	public static class GLParam {
		public String name;
		public GLType type;
		@Override
		public String toString() {
			return "[name=" + name + ", type=" + type + "]";
		}
	}
	
	public static class GLProcedure {
		public String text;
		public boolean needsLoading;
		public List<GLParam> params = new ArrayList<GLParam>();
		public GLType returnType;
	}
	
	/**
	 * Takes the glew header and generates a jnigen based Java file
	 * that wraps OpenGL and all it's extensions.
	 * @param inputFile the path to the glew.h file.
	 * @param outputFile the path to the resulting Java output file, e.g. src/com/badlogic/jglfw/gl/GL.java
	 */
	public void generate(String inputFile, String outputFile) {
		File input = new File(inputFile);
		File output = new File(outputFile);
		if(!input.exists()) throw new RuntimeException(inputFile + " does not exist");
		if(!output.getParentFile().exists()) {
			if(!output.getParentFile().mkdirs()) throw new RuntimeException("Couldn't create output directory " + output.getParent());
		}
		
		List<GLProcedure> procs = new ArrayList<GLProcedure>();
		List<GLConstant> constants = new ArrayList<GLConstant>();
		parseGLHeader(input, procs, constants);
		
		for(GLConstant c: constants) {
			System.out.println(c);
		}
	}
	
	private void parseGLHeader(File input, List<GLProcedure> procedures, List<GLConstant> constants) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(input));
			int lines = 0;
			while(true) {				
				String line = reader.readLine();
				if(line == null) break;
				if(line.startsWith("#define GL_")) {
					parseConstant(line, constants);
				} else if(line.startsWith("GLAPI")) {
					parseProcedure(line, procedures);
				}
						  
			}
			reader.close();
		} catch(IOException e) {
			throw new RuntimeException("Couldn't parse header file, " + e);
		}
	}
	
	private void parseConstant(String line, List<GLConstant> constants) {
		String[] tokens = line.split(" ");
		if(tokens.length != 3) {
			System.out.println("warning: couldn't parse constant '" + line + "'");
		} else {
			GLConstant constant = new GLConstant();
			constant.name = tokens[1];
			constant.value = tokens[2];
			constants.add(constant);
		}
	}
	
	private void parseProcedure(String line, List<GLProcedure> procedures) {
		String[] tokens = line.split(" ");
		GLProcedure proc = new GLProcedure();
		proc.text = line;
	}
	
	public static void main(String[] args) {
		new GLParser().generate("jni/glew-headers/glew.h", "src/com/badlogic/jglfw/gl/GL.java");
	}
}
