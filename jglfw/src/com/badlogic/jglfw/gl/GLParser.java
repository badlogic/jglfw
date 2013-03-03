package com.badlogic.jglfw.gl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		public static final Map<String, String> javaTypes = new HashMap<String, String>();
		static {			
			javaTypes.put("void", "void");
			javaTypes.put("GLenum", "int");
			javaTypes.put("GLbitfield", "int");
			javaTypes.put("GLuint", "int");
			javaTypes.put("GLint", "int");
			javaTypes.put("GLsizei", "int");
			javaTypes.put("GLboolean", "boolean");
			javaTypes.put("GLbyte", "byte");
			javaTypes.put("GLshort", "short");
			javaTypes.put("GLubyte", "byte");
			javaTypes.put("GLushort", "short");
			javaTypes.put("GLulong", "long");
			javaTypes.put("GLfloat", "float");
			javaTypes.put("GLclampf", "float");
			javaTypes.put("GLdouble", "double");
			javaTypes.put("GLclampd", "double");
		}
		
		
		public String text;
		public int ptrCount;
		
		public GLType(String text, int ptrCount) {
			this.text = text;
			this.ptrCount = ptrCount;
			if(ptrCount == 0) {
				if(!javaTypes.containsKey(text)) {
					throw new RuntimeException("unknown C type " + text);
				}
			}
		}
		
		public String getJavaType() {
			if(ptrCount != 0) return "Buffer";
			else return javaTypes.get(text);
		}
		
		public String getCType() {
			return text + repeat('*', ptrCount);
		}

		@Override
		public String toString() {
			return text + (ptrCount > 0?"|" + ptrCount:"");
		}
	}
	
	private static String repeat(char c, int times) {
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < times; i++) {
			buffer.append(c);
		}
		return buffer.toString();
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
	 * Takes the glew header, parses it and returns a list of {@link GLConstant} and
	 * {@link GLProcedure} instances for all GL constants and procedures found in the
	 * header
	 * @param inputFile the path to the glew.h file.
	 * @param procedures list of {@link GLProcedure} instances, filled by this function
	 * @param constants list of {@link GLConstant} instances, filled by this function
	 */
	public void parse(String inputFile, List<GLProcedure> procedures, List<GLConstant> constants) {
		File input = new File(inputFile);
		if(!input.exists()) throw new RuntimeException(inputFile + " does not exist");
		
		parseGLHeader(input, procedures, constants);
		
		deduplicateConsts(constants);
		sortConsts(constants);
		for(GLConstant c: constants) {
			System.out.println(c);
		}
		System.out.println(constants.size());
		
		for(GLProcedure p: procedures) {
			System.out.println(p);
		}
		System.out.println(procedures.size());
		
		printTypes(procedures);
	}
	
	private void sortConsts (List<GLConstant> constants) {
		// among all the silly things, this shall get
		// the medal of stupidity. I'm tired.
		for(int i = 0; i < constants.size(); i++) {
			GLConstant c = constants.get(i);
			if(c.value.startsWith("GL_")) {
				for(int j = i; j < constants.size(); j++) {
					GLConstant c2 = constants.get(j);
					if(c2.name.equals(c.value)) {
						constants.set(i, c2);
						constants.set(j, c);
						break;
					}
				}
			}
		}
	}

	private void deduplicateConsts (List<GLConstant> constants) {
		List<GLConstant> newConsts = new ArrayList<GLConstant>();
		Set<String> lookup = new HashSet<String>();
		for(GLConstant c: constants) {
			if(!lookup.contains(c.name)) {
				newConsts.add(c);
				lookup.add(c.name);
			}
		}
		constants.clear();
		constants.addAll(newConsts);
	}

	private void parseGLHeader(File input, List<GLProcedure> procedures, List<GLConstant> constants) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(input));
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
	
	private void printTypes(List<GLProcedure> procs) {
		Set<String> types = new HashSet<String>();
		for(GLProcedure proc: procs) {
			types.add(proc.returnType.getCType());
			for(GLParam param: proc.params) {
				types.add(param.type.getCType());
			}
		}
		for(String type: types) {
			System.out.println(type);
		}
	}
	
	private int count(String text, char c) {
		int sum = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == c) sum++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<GLProcedure> procs = new ArrayList<GLProcedure>();
		List<GLConstant> consts = new ArrayList<GLConstant>();
		new GLParser().parse("jni/glew-headers/glew.h", procs, consts);
	}
}
