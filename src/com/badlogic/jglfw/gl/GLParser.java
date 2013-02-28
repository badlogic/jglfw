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
		public int ptrCount;
		
		public GLType(String text, int ptrCount) {
			this.text = text;
			this.ptrCount = ptrCount;
		}
		
		public String getJavaType() {
			return ""; // FIXME
		}

		@Override
		public String toString() {
			return text + (ptrCount > 0?"|" + ptrCount:"");
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
		public String name;
		public List<GLParam> params = new ArrayList<GLParam>();
		public GLType returnType;
		@Override
		public String toString() {
			return "GLProcedure [name=" + name + ", params=" + params
					+ ", returnType=" + returnType + "]";
		}		
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
		
		for(GLProcedure p: procs) {
			System.out.println(p);
		}
		System.out.println(procs.size());
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
		line = line.substring("GLAPI".length());
		String returnType = line.substring(0, line.indexOf("GLAPIENTRY")).trim();
		String name = line.substring(line.indexOf("GLAPIENTRY") + "GLAPIENTRY".length(), line.indexOf("(")).trim();
		String[] params = line.substring(line.indexOf("(") + 1, line.indexOf(")")).split(",");
		GLProcedure proc = new GLProcedure();
		proc.text = line;
		proc.name = name;
		proc.returnType = new GLType(returnType.replace('*', ' ').trim(), count(returnType, '*'));
		proc.params = parseParameters(params);
		procedures.add(proc);
	}
	
	private List<GLParam> parseParameters(String[] params) {
		List<GLParam> parameters = new ArrayList<GLParam>();
		if(!(params.length == 1 && params[0].equals("void"))) {
			for(String param: params) {
				int pointers = count(param, '*');
				param = param.replace('*', ' ').trim();
				GLParam p = new GLParam();
				p.name = param.substring(param.lastIndexOf(" ")).trim();
				p.type = new GLType(param.substring(0, param.lastIndexOf(" ")).trim(), pointers);				
				parameters.add(p);
			}
		}
		return parameters;
	}
	
	private int count(String text, char c) {
		int sum = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == c) sum++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		new GLParser().generate("jni/glew-headers/glew.h", "src/com/badlogic/jglfw/gl/GL.java");
	}
}
