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

public class ALParser {
	public static class ALConstant {
		public String name;
		public String value;
		public String type = "int";
		@Override
		public String toString() {
			return "const " + name + " = " + value;
		}			
	}
	
	public static class ALType {
		public static final Map<String, String> javaTypes = new HashMap<String, String>();

		static {			
			javaTypes.put("void", "void");
			javaTypes.put("ALCboolean", "boolean");
			javaTypes.put("ALCchar", "byte");
			javaTypes.put("ALCbyte", "byte");
			javaTypes.put("ALCubyte", "byte");
			javaTypes.put("ALCshort", "short");
			javaTypes.put("ALCushort", "short");
			javaTypes.put("ALCint", "int");
			javaTypes.put("ALCuint", "int");
			javaTypes.put("ALCsizei", "int");
			javaTypes.put("ALCenum", "int");
			javaTypes.put("ALCfloat", "float");
			javaTypes.put("ALCdouble", "double");
			javaTypes.put("ALCvoid", "void");
			javaTypes.put("ALboolean", "boolean");
			javaTypes.put("ALbyte", "byte");
			javaTypes.put("ALubyte", "byte");
			javaTypes.put("ALshort", "short");
			javaTypes.put("ALushort", "short");
			javaTypes.put("ALint", "int");
			javaTypes.put("ALuint", "int");
			javaTypes.put("ALsizei", "int");
			javaTypes.put("ALenum", "int");
			javaTypes.put("ALfloat", "float");
			javaTypes.put("ALdouble", "double");
			javaTypes.put("ALvoid", "void");
		}
		
		public String text;
		public int ptrCount;
		public boolean isConst;
		
		public ALType(String text, int ptrCount, boolean isConst) {
			this.text = text;
			this.ptrCount = ptrCount;
			this.isConst = isConst;
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
		
		public String getJniType() {
			if(ptrCount != 0) return getCType(); // should be a compile error
			return "j" + javaTypes.get(text);
		}
		
		public String getCType() {
			return (isConst?"const ": "") + text + repeat('*', ptrCount);
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
	
	public static class ALParam {
		public String name;
		public ALType type;
		@Override
		public String toString() {
			return "[name=" + name + ", type=" + type + "]";
		}
	}
	
	public static class ALProcedure {
		public String text;
		public boolean isExtension;
		public String extensionName;
		public String name;
		public List<ALParam> params = new ArrayList<ALParam>();
		public ALType returnType;
		@Override
		public String toString() {
			return "ALProcedure [name=" + name + ", params=" + params
					+ ", returnType=" + returnType + "]";
		}		
	}
	
	/**
	 * Takes the glew header, parses it and returns a list of {@link ALConstant} and
	 * {@link ALProcedure} instances for all GL constants and procedures found in the
	 * header
	 * @param procedures list of {@link ALProcedure} instances, filled by this function
	 * @param constants list of {@link ALConstant} instances, filled by this function
	 * @param inputFiles the path to the glew files.
	 */
	public void parse(List<ALProcedure> procedures, List<ALConstant> constants, String ... inputFiles) {
		for(String inputFile: inputFiles) {
			File input = new File(inputFile);
			if(!input.exists()) throw new RuntimeException(inputFile + " does not exist");
			
			parseGLHeader(input, procedures, constants);
			
			deduplicateConsts(constants);
			sortConsts(constants);
			filterProcedures(procedures);
		}
	}
	
	private void sortConsts (List<ALConstant> constants) {
		// among all the silly things, this shall get
		// the medal of stupidity. I'm tired.
		for(int i = 0; i < constants.size(); i++) {
			ALConstant c = constants.get(i);
			if(c.value.startsWith("ALC_") || c.value.startsWith("AL_")) {
				for(int j = i; j < constants.size(); j++) {
					ALConstant c2 = constants.get(j);
					if(c2.name.equals(c.value)) {
						constants.set(i, c2);
						constants.set(j, c);
						break;
					}
				}
			}
		}
	}
	
	private void filterProcedures(List<ALProcedure> procedures) {
		List<ALProcedure> newProcs = new ArrayList<ALProcedure>();
		for(ALProcedure proc: procedures) {
			if(proc.name.contains("_")) {
				System.out.println("ALParser warning: skipping " + proc.name + " due to underline in name, bug in jnigen");
				continue;
			}
			newProcs.add(proc);
		}
		procedures.clear();
		procedures.addAll(newProcs);
	}

	private void deduplicateConsts (List<ALConstant> constants) {
		List<ALConstant> newConsts = new ArrayList<ALConstant>();
		Set<String> lookup = new HashSet<String>();
		for(ALConstant c: constants) {
			if(!lookup.contains(c.name)) {
				newConsts.add(c);
				lookup.add(c.name);
			}
		}
		constants.clear();
		constants.addAll(newConsts);
	}

	private void parseGLHeader(File input, List<ALProcedure> procedures, List<ALConstant> constants) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(input));
			while(true) {				
				String line = reader.readLine();
				if(line == null) break;
				if(line.startsWith("#define AL_") || line.startsWith("#define ALC_")) {
					parseConstant(line, constants);
				} else if((line.startsWith("ALC_API") || line.startsWith("AL_API")) && !isExcludedProcedure(line)) {
					parseProcedure(line, procedures);
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
			System.out.println("ALParser warning: skipped " + line);
			return true;
		}
		if(line.toLowerCase().contains("glgetpointerv")) {
			System.out.println("ALParser warning: skipped " + line);
			return true;
		}
		if(line.toLowerCase().contains("alcgetprocaddress")) {
			System.out.println("ALParser warning: skipped " + line);
			return true;
		}
		if(line.toLowerCase().contains("algetprocaddress")) {
			System.out.println("ALParser warning: skipped " + line);
			return true;
		}
		return false;
	}

	private void parseConstant(String line, List<ALConstant> constants) {
		String[] tokens = line.split("\\s+");
		if(tokens.length != 3) {
			System.out.println("ALParser warning: couldn't parse constant '" + line + "'");
		} else {
			ALConstant constant = new ALConstant();
			constant.name = tokens[1];
			constant.value = tokens[2];
			if(constant.value.endsWith("u")) {
				constant.value = constant.value.substring(0, constant.value.length() - 1);
			}
			if(constant.value.equals("0xFFFFFFFFFFFFFFFFull")) {
				constant.value = "0xFFFFFFFFFFFFFFFFl";
				constant.type = "long";
			}
			constants.add(constant);
		}
	}
	
	private ALProcedure parseProcedure(String line, List<ALProcedure> procedures) {
		String api = line.startsWith("ALC_")?"ALC_API":"AL_API";
		String apiEntry = line.contains("ALC_APIENTRY")?"ALC_APIENTRY": "AL_APIENTRY";
		
		line = line.substring(api.length());
		String returnType = line.substring(0, line.indexOf(apiEntry)).trim();
		String name = line.substring(line.indexOf(apiEntry) + apiEntry.length(), line.indexOf("(")).trim();
		String[] params = line.substring(line.indexOf("(") + 1, line.indexOf(")")).trim().split(",");
		ALProcedure proc = new ALProcedure();
		proc.text = line;
		proc.name = name;
		boolean isConst = false;
		if(returnType.contains("const")) {
			returnType = returnType.replace("const", "");
			isConst = true;
		}
		proc.returnType = new ALType(returnType.replace('*', ' ').trim(), count(returnType, '*'), isConst);
		proc.params = parseParameters(params);
		procedures.add(proc);
		return proc;
	}
	
	private List<ALParam> parseParameters(String[] params) {
		List<ALParam> parameters = new ArrayList<ALParam>();
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
				
				// could be double const ...
				boolean isConst = false;
				if(param.contains("const")) {
					param = param.replace("const", "").trim();
					isConst = true;
				}
				
				ALParam p = new ALParam();
				int nameIndex = param.lastIndexOf(" ");
				if(nameIndex == -1) {
					p.name = "param" + i;
					p.type = new ALType(param.trim(), pointers, isConst);
				} else {
					p.name = param.substring(nameIndex).trim();
					p.type = new ALType(param.substring(0, param.lastIndexOf(" ")).trim(), pointers, isConst);				
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
		List<ALProcedure> procs = new ArrayList<ALProcedure>();
		List<ALConstant> consts = new ArrayList<ALConstant>();
		new ALParser().parse(procs, consts, "jni/al-headers/AL/alc.h");
		for(ALConstant c: consts) {
			System.out.println(c);
		}
		for(ALProcedure p: procs) {
			System.out.println(p);
		}
	}
}
