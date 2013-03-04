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

import com.badlogic.jglfw.generators.GLParser.GLConstant;
import com.badlogic.jglfw.generators.GLParser.GLParam;
import com.badlogic.jglfw.generators.GLParser.GLProcedure;

public class GLGenerator {
	private static final String EXT = "ext_";

	public void generate(String outputFile, String packageName, String className, List<GLProcedure> procedures, List<GLConstant> constants) {
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
		buffer.append("\t#include <GL/glfw3.h>\n");
		buffer.append("\t#include \"GL/glext.h\"\n");
		buffer.append("\t*/\n");
	}

	private void generateFunctionPointers (StringBuffer buffer, List<GLProcedure> procedures) {
		buffer.append("\t// @off\n");
		buffer.append("\t/*JNI\n"); 
		for(GLProcedure proc: procedures) {
			if(proc.isExtension) {
				buffer.append("\t" + proc.extensionName + " " + EXT + proc.name + ";\n");
			}
		}
		buffer.append("\t*/\n");
		
		buffer.append("\n\tpublic static native void init(); /*\n");
		for(GLProcedure proc: procedures) {
			if(proc.isExtension) {
//				buffer.append("\t\t" + proc.extensionName + " " + EXT + proc.name + ";\n");
			}
		}
		buffer.append("\t*/\n\n");
	}

	private void generateProcedures (StringBuffer buffer, List<GLProcedure> procedures, Map<String, String> customProcedures) {
		for(GLProcedure proc: procedures) {
			if(customProcedures.containsKey(proc.name)) {
				buffer.append(customProcedures.get(proc.name));
				buffer.append("\n");
			} else {
				if(hasDoublePointerParam(proc)) {
					System.out.println("GLGenerator warning: double pointer param detected, " + proc.name + " may need custom procedure in custom.txt");
				}
				if(hasPointerReturnType(proc)) {
					System.err.println("GLGenerator error: pointer return type, " + proc.name + " may need custom procedure in custom.txt");
				}
				generateProcedure(buffer, proc);
			}
		}
	}	

	private boolean hasPointerReturnType(GLProcedure proc) {
		return proc.returnType.ptrCount > 0;			
	}

	private boolean hasPointerParam(GLProcedure proc) {
		for(GLParam param: proc.params) {
			if(param.type.ptrCount > 0) return true;
		}
		return false;
	}
	
	private boolean hasDoublePointerParam(GLProcedure proc) {
		for(GLParam param: proc.params) {
			if(param.type.ptrCount > 1) return true;
		}
		return false;
	}

	private void generateProcedure (StringBuffer buffer, GLProcedure proc) {
		buffer.append("\tpublic static native " + proc.returnType.getJavaType() + " " + proc.name + "(");
		
		generateJavaParams(buffer, proc);
		
		buffer.append("); /*\n");
		if(!proc.returnType.getCType().equals("void")) {
			buffer.append("\t\treturn (" + proc.returnType.getCType() + ")");
		} else {
			buffer.append("\t\t");
		}
		buffer.append((proc.isExtension?EXT: "") + proc.name + "(");
		generateCParams(buffer, proc);
		buffer.append(");\n");
		buffer.append("\t*/\n\n");
	}

	private void generateCParams (StringBuffer buffer, GLProcedure proc) {
		for(int i = 0; i < proc.params.size(); i++) {
			GLParam param = proc.params.get(i);
			if(param.type.ptrCount > 0) {
				buffer.append("(" + param.type.getCType() + ")(" + param.name + " + " + param.name + "ByteOffset)");
			} else {
				buffer.append("(" + param.type.getCType() + ")" + param.name);
			}
			if(i < proc.params.size() - 1) {
				buffer.append(", ");
			}
		}
	}

	private void generateJavaParams (StringBuffer buffer, GLProcedure proc) {
		for(int i = 0; i < proc.params.size(); i++) {
			GLParam param = proc.params.get(i);
			if(param.type.ptrCount > 0) {
				buffer.append("Buffer " + param.name + ", int " + param.name + "ByteOffset");
			} else {
				buffer.append(param.type.getJavaType() + " " + param.name);
			}
			if(i < proc.params.size() - 1) {
				buffer.append(", ");
			}
		}
	}

	private void generateConstants (StringBuffer buffer, List<GLConstant> constants) {
		for(GLConstant c: constants) {
			if(c.value.equals("0xFFFFFFFFFFFFFFFF")) {
				buffer.append("\tpublic static final long " + c.name + " = 0xFFFFFFFFFFFFFFFFl;\n");
			} else {
				buffer.append("\tpublic static final int " + c.name + " = " + c.value + ";\n");
			}
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
			BufferedReader reader = new BufferedReader(new InputStreamReader(GLGenerator.class.getResourceAsStream("/com/badlogic/jglfw/generators/gl_custom.txt")));
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
		List<GLProcedure> procs = new ArrayList<GLProcedure>();
		List<GLConstant> consts = new ArrayList<GLConstant>();
		new GLParser().parse(procs, consts, "jni/gl-headers/GL/gl11.h"); //, "jni/gl-headers/GL/glext.h");
		Set<String> names = new HashSet<String>();
		for(GLProcedure proc: procs) {
			if(names.contains(proc.name)) {
				System.out.println("duplicate " + proc.name);
			} else {
				names.add(proc.name);
			}
		}
		new GLGenerator().generate("src/com/badlogic/jglfw/gl/GL.java", "com.badlogic.jglfw.gl", "GL", procs, consts);
	}
}
