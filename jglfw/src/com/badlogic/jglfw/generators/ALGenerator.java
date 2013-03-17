package com.badlogic.jglfw.generators;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.badlogic.jglfw.generators.ALParser.ALConstant;
import com.badlogic.jglfw.generators.ALParser.ALParam;
import com.badlogic.jglfw.generators.ALParser.ALProcedure;

public class ALGenerator {
	private static final String EXT = "ext_";
	
	private static enum ProcedureType {
		Default,
		LongPointerParams,
		ArrayParams
	}

	public void generate(String outputFile, String packageName, String className, List<ALProcedure> procedures, List<ALConstant> constants) {
		StringBuffer buffer = new StringBuffer();
		Map<String, String> customProcedures = readCustomProcs();
		generateClassHeader(buffer, packageName, className);
		generateConstants(buffer, constants);
		buffer.append("\n");
		generatePreamble(buffer);
		generateFunctionPointers(buffer, procedures);
		generateProcedures(buffer, procedures, customProcedures);
		buffer.append("}");
		try {
			FileWriter writer = new FileWriter(new File(outputFile));
			writer.write(buffer.toString());
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException("Couldn't write Java class file " + outputFile, e);
		}
	}	

	private void generatePreamble (StringBuffer buffer) {
		buffer.append("\t// @off\n");
		buffer.append("\t/*JNI\n"); 
		buffer.append("\t#include \"AL/alc.h\"\n");
		buffer.append("\t#include \"AL/al.h\"\n");
		buffer.append("\t*/\n");
	}

	private void generateFunctionPointers (StringBuffer buffer, List<ALProcedure> procedures) {
		buffer.append("\t// @off\n");
		buffer.append("\t/*JNI\n"); 
		for(ALProcedure proc: procedures) {
			if(proc.isExtension) {
				buffer.append("\t" + proc.extensionName + " " + EXT + proc.name + " = (" + proc.extensionName + ")0xdeadbeef;\n");
			}
		}
		buffer.append("\tstatic int initialized = 0;");
		buffer.append("\t*/\n");
		
		buffer.append("\n\tpublic static native void init(); /*\n");
		buffer.append("\t\tif(initialized) return;\n");
		buffer.append("\t\tinitialized = -1;\n");
		for(ALProcedure proc: procedures) {
			if(proc.isExtension) {
				buffer.append("\t\t" + EXT + proc.name + " = (" + proc.extensionName + ")glfwGetProcAddress(\"" + proc.name + "\");\n");
			}
		}
		buffer.append("\t*/\n\n");
	}
	
	private boolean hasPointerReturnType(ALProcedure proc) {
		return proc.returnType.ptrCount > 0;			
	}

	private boolean hasPointerParam(ALProcedure proc) {
		for(ALParam param: proc.params) {
			if(param.type.ptrCount > 0) return true;
		}
		return false;
	}
	
	private boolean hasDoublePointerParam(ALProcedure proc) {
		for(ALParam param: proc.params) {
			if(param.type.ptrCount > 1) return true;
		}
		return false;
	}

	private void generateProcedures (StringBuffer buffer, List<ALProcedure> procedures, Map<String, String> customProcedures) {
		for(ALProcedure proc: procedures) {
			if(customProcedures.containsKey(proc.name)) {
				buffer.append(customProcedures.get(proc.name));
				buffer.append("\n");
			} else {
				if(hasDoublePointerParam(proc)) {
					System.out.println("ALGenerator warning: double pointer param detected, " + proc.name + " may need custom procedure in custom.txt");
				}
				if(hasPointerReturnType(proc)) {
					System.err.println("ALGenerator error: pointer return type, " + proc.name + " may need custom procedure in custom.txt");
				}
				generateProcedure(buffer, proc, ProcedureType.Default);
				if(hasPointerParam(proc)) {
					generateProcedure(buffer, proc, ProcedureType.LongPointerParams);
				}
			}
		}
	}	

	private void generateProcedure (StringBuffer buffer, ALProcedure proc, ProcedureType type) {
		buffer.append("\tpublic static native " + proc.returnType.getJavaType() + " " + proc.name + "(");
		
		generateJavaParams(buffer, proc, type);
		
		buffer.append("); /*\n");
		if(!proc.returnType.getCType().equals("void")) {
			buffer.append("\t\treturn (" + proc.returnType.getJniType() + ")");
		} else {
			buffer.append("\t\t");
		}
		buffer.append((proc.isExtension?EXT: "") + proc.name + "(");
		generateCParams(buffer, proc, type);
		buffer.append(");\n");
		buffer.append("\t*/\n\n");
	}

	private void generateCParams (StringBuffer buffer, ALProcedure proc, ProcedureType type) {
		for(int i = 0; i < proc.params.size(); i++) {
			ALParam param = proc.params.get(i);
			if(param.type.ptrCount > 0) {
				if(type == ProcedureType.Default) {
					buffer.append("(" + param.type.getCType() + ")(" + param.name + " + " + param.name + "ByteOffset)");
				}
				if(type == ProcedureType.LongPointerParams) {
					buffer.append("(" + param.type.getCType() + ")" + param.name);
				}
			} else {
				buffer.append("(" + param.type.getCType() + ")" + param.name);
			}
			if(i < proc.params.size() - 1) {
				buffer.append(", ");
			}
		}
	}

	private void generateJavaParams (StringBuffer buffer, ALProcedure proc, ProcedureType type) {
		for(int i = 0; i < proc.params.size(); i++) {
			ALParam param = proc.params.get(i);
			if(param.type.ptrCount > 0) {
				if(type == ProcedureType.Default) {
					buffer.append("Buffer " + param.name + ", int " + param.name + "ByteOffset");
				}
				if(type == ProcedureType.LongPointerParams) {
					buffer.append("long " + param.name);
				}
			} else {
				buffer.append(param.type.getJavaType() + " " + param.name);
			}
			if(i < proc.params.size() - 1) {
				buffer.append(", ");
			}
		}
	}

	private void generateConstants (StringBuffer buffer, List<ALConstant> constants) {
		for(ALConstant c: constants) {
			buffer.append("\tpublic static final " + c.type + " " + c.name + " = " + c.value + ";\n");
		}
	}

	private void generateClassHeader(StringBuffer buffer, String packageName, String className) {
		buffer.append("package " + packageName + ";\n\n");
		buffer.append("import java.nio.Buffer;\n\n");
		buffer.append("public class " + className + " {\n");
	}
	
	private Map<String, String> readCustomProcs () {
		Map<String, String> customProcs = new HashMap<String, String>();
		String procName = null;
		StringBuffer procBody = new StringBuffer();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(ALGenerator.class.getResourceAsStream("/com/badlogic/jglfw/generators/al_custom.txt")));
			while(true) {
				String line = reader.readLine();
				if(line == null) {
					break;
				}
				
				if(line.startsWith("-")) {
					customProcs.put(procName, procBody.toString());
					procName = null;
					procBody = new StringBuffer();
					continue;
				}
				
				if(procName == null) {
					procName = line.trim();
				} else {
					procBody.append(line + "\n");
				}
			}
			if(procName != null) {
				customProcs.put(procName, procBody.toString());
			}
			reader.close();
			return customProcs;
		} catch (IOException e) {
			throw new RuntimeException("Couldn't read custom procedures", e);
		}
	}
	
	public static void main (String[] args) {
		List<ALProcedure> procs = new ArrayList<ALProcedure>();
		List<ALConstant> consts = new ArrayList<ALConstant>();
		new ALParser().parse(procs, consts, "jni/al-headers/AL/alc.h");
		new ALGenerator().generate("src/com/badlogic/jglfw/al/ALC.java", "com.badlogic.jglfw.al", "ALC", procs, consts);
		
		procs = new ArrayList<ALProcedure>();
		consts = new ArrayList<ALConstant>();
		new ALParser().parse(procs, consts, "jni/al-headers/AL/al.h");
		new ALGenerator().generate("src/com/badlogic/jglfw/al/AL.java", "com.badlogic.jglfw.al", "AL", procs, consts);
	}
}
