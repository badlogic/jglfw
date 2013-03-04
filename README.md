JGLFW
=====
JGLFW is a crossplatform (Windows, Linux, Mac OS X) wrapper for
 * [GLFW 3.0](https://github.com/elmindreda/glfw), for window managment, OpenGL context creation and input handling
 * OpenGL, for graphics
 * OpenAL, for audio

The GLFW bindings where created manually using [gdx-jnigen](https://code.google.com/p/libgdx/wiki/SourceBuilding#Jnigen). The bindings for OpenGL and OpenAL are automatically generated from the [GLEW](http://glew.sourceforge.net/) header and the standard [OpenAL Soft](http://kcat.strangesoft.net/openal.html) headers.

Building
--------
The build system consists of an ant script located in the root folder. The simplest way to build jglfw is to invoke ant as follows

    ant clean package
   
This will fetch the latest jglfw-natives.jar from the build server (http://libgdx.badlogicgames.com/jglfw), compile the Java sources and put everything into a versioned zip file.

If you want to compile the native code yourself, you'll have a much more fun time. I only provide instructions to build on Linux and Mac OS X, on Windows you can try to use MinGW.

  * Linux (to compile for Windows 32-/64-bit and Linux 32-/64-bit)
    sudo apt-get install g++-mingw-w64-i686 g++-mingw-w64-x86-64 g++-multilib gcc-multilib libX11-dev libXrandr libXxf86vm libgl1-mesa-dev libgl1-mesa-glx
    ant clean compile-natives package
  * Mac
    * Latest XCode from the Mac OS X App Store



  * Import jglfw into Eclipse
  * Run GlGenerator if you modified the automatic binding generator
  * Run GlfwBuild if you modified the jnigen bindings for GLFW

This will regenerate any build files and C/C++ files as a result of your modifications. 

TODO
----
 * [X] Build system
 * [X] Nightly builds, see http://libgdx.badlogicgames.com:8080, http://libgdx.badlogicgames.com/jglfw
 * [X] GLFW wrapper
 * [O] OpenGL generator
 * [ ] OpenAL generator
