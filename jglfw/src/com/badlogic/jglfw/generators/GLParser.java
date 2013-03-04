package com.badlogic.jglfw.generators;

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
			javaTypes.put("const GLint", "int");
			javaTypes.put("GLsizei", "int");
			javaTypes.put("GLboolean", "boolean");
			javaTypes.put("GLbyte", "byte");
			javaTypes.put("GLshort", "short");
			javaTypes.put("GLubyte", "byte");
			javaTypes.put("GLushort", "short");
			javaTypes.put("GLulong", "long");
			javaTypes.put("GLfloat", "float");
			javaTypes.put("const GLfloat", "float");
			javaTypes.put("GLclampf", "float");
			javaTypes.put("GLdouble", "double");
			javaTypes.put("GLclampd", "double");
			javaTypes.put("GLsizeiptr", "int");
			javaTypes.put("GLintptr", "int");
			javaTypes.put("GLsync", "long");
			javaTypes.put("cl_context", "long");
			javaTypes.put("cl_event", "long");
			javaTypes.put("GLhandleARB", "int");
			javaTypes.put("GLuint64", "long");
			javaTypes.put("GLsizeiptrARB", "int");
			javaTypes.put("GLintptrARB", "int");
			javaTypes.put("GLint64EXT", "long");
			javaTypes.put("GLuint64EXT", "long");
			javaTypes.put("GLhalf", "short");
			javaTypes.put("GLhalfNV", "short");
			javaTypes.put("GLvdpauSurfaceNV", "int");
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
	
	static String repeat(char c, int times) {
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
		public boolean isExtension;
		public String extensionName;
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
	 * @param procedures list of {@link GLProcedure} instances, filled by this function
	 * @param constants list of {@link GLConstant} instances, filled by this function
	 * @param inputFiles the path to the glew files.
	 */
	public void parse(List<GLProcedure> procedures, List<GLConstant> constants, String ... inputFiles) {
		for(String inputFile: inputFiles) {
			File input = new File(inputFile);
			if(!input.exists()) throw new RuntimeException(inputFile + " does not exist");
			
			parseGLHeader(input, procedures, constants);
			
			deduplicateConsts(constants);
			sortConsts(constants);
			filterProcedures(procedures);
		}
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
	
	private void filterProcedures(List<GLProcedure> procedures) {
		List<GLProcedure> newProcs = new ArrayList<GLProcedure>();
		for(GLProcedure proc: procedures) {
			if(proc.name.contains("_")) {
				System.out.println("GLParser warning: skipping " + proc.name + " due to underline in name, bug in jnigen");
				continue;
			}
			newProcs.add(proc);
		}
		procedures.clear();
		procedures.addAll(newProcs);
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
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(input));
			Map<String, GLProcedure> extensions = new HashMap<String, GLProcedure>();
			while(true) {				
				String line = reader.readLine();
				if(line == null) break;
				if(line.startsWith("#define GL_")) {
					parseConstant(line, constants);
				} else if(line.startsWith("GLAPI") && !isExcludedProcedure(line)) {
					parseProcedure(line, procedures);
				} else if(line.startsWith("typedef") && line.contains("GLAPIENTRY") && !isExcludedProcedure(line)) {
					parseExtensionDef(line, extensions);
				} else if(line.startsWith("#define gl") && line.contains("GLEW_GET_FUN") && !isExcludedProcedure(line)) {
					String name = line.substring("#define ".length(), line.indexOf("GLEW_GET_FUN")).trim();
					String extName = "PFN" + name.toUpperCase() + "PROC";
					GLProcedure proc = extensions.remove(extName);
					if(proc == null) {
						throw new RuntimeException("Extension " + name + "|" + extName + " not defined");
					}
					proc.extensionName = extName;
					proc.isExtension = true;
					proc.name = name;
					procedures.add(proc);
				}
			}			
		} catch(IOException e) {
			throw new RuntimeException("Couldn't parse header file, " + e);
		} finally {
			if(reader != null) try { reader.close(); } catch(IOException e) { };
		}
	}
	
	private boolean isExcludedProcedure(String line) {
		if(line.toLowerCase().contains("gldebug")) {
			System.out.println("GLParser warning: skipped " + line);
			return true;
		}
		if(line.toLowerCase().contains("glgetpointerv")) {
			System.out.println("GLParser warning: skipped " + line);
			return true;
		}
		return false;
	}

	private void parseExtensionDef(String line, Map<String, GLProcedure> extensions) {		
		line = line.substring("typedef".length());
		String returnType = line.substring(0, line.indexOf("(GLAPIENTRY")).trim();
		String name = line.substring(line.indexOf("PFNGL"), line.indexOf("PROC)") + "PROC)".length() - 1).trim();
		line = line.substring(line.indexOf("PROC)") + "PROC)".length());
		String[] params = line.substring(line.indexOf("(") + 1, line.indexOf(")")).split(",");
		GLProcedure proc = new GLProcedure();
		proc.text = line;
		proc.returnType = new GLType(returnType.replace('*', ' ').trim(), count(returnType, '*'));
		proc.params = parseParameters(params);
		if(extensions.containsKey(name)) {
			throw new RuntimeException("Extension " + name + " already defined!");
		}
		extensions.put(name, proc);
	}

	private void parseConstant(String line, List<GLConstant> constants) {
		String[] tokens = line.split("\\s+");
		if(tokens.length != 3) {
			System.out.println("GLParser warning: couldn't parse constant '" + line + "'");
		} else {
			GLConstant constant = new GLConstant();
			constant.name = tokens[1];
			constant.value = tokens[2];
			constants.add(constant);
		}
	}
	
	private void parseProcedure(String line, List<GLProcedure> procedures) {
		line = line.substring("GLAPI".length());
		String returnType = line.substring(0, line.indexOf("APIENTRY")).trim();
		String name = line.substring(line.indexOf("APIENTRY") + "APIENTRY".length(), line.indexOf("(")).trim();
		String[] params = line.substring(line.indexOf("(") + 1, line.indexOf(")")).trim().split(",");
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
			for(int i = 0; i < params.length; i++) {
				String param = params[i];
				int pointers = count(param, '*');
				param = param.replace('*', ' ').trim();
				
				// could be an array as well for some extensions..
				if(param.contains("[")) {
					pointers = 1;
					param = param.replaceAll("\\[.*?\\]", "");
				}
				
				GLParam p = new GLParam();
				int nameIndex = param.lastIndexOf(" ");
				if(nameIndex == -1) {
					p.name = "param" + i;
					p.type = new GLType(param.trim(), pointers);
				} else {
					p.name = param.substring(nameIndex).trim();
					p.type = new GLType(param.substring(0, param.lastIndexOf(" ")).trim(), pointers);				
				}
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
		List<GLProcedure> procs = new ArrayList<GLProcedure>();
		List<GLConstant> consts = new ArrayList<GLConstant>();
		new GLParser().parse(procs, consts, "jni/gl-headers/GL/gl11.h", "jni/gl-headers/GL/glext.h");
	}
}
