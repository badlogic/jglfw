#!/bin/bash
set -e

BUILD=debug
BUILD_DIR="target"

JAR=$JAVA_HOME/bin/jar
STRIP="strip -S -x "
CC=clang
CC_FLAGS="-c -m64 -Wfatal-errors -Wall -fPIC -mmacosx-version-min=10.7 -D_GLFW_COCOA -D_GLFW_NSGL -D_GLFW_USE_OPENGL -D_GLFW_USE_MENUBAR -DNS_FORMAT_ARGUMENT(A)= -D_Nullable_result=_Nullable"
CXX=clang
CXX_FLAGS="-c -m64 -Wfatal-errors -Wall -std=c++11 -stdlib=libc++ -fPIC -mmacosx-version-min=10.7 -D_GLFW_COCOA -D_GLFW_NSGL -D_GLFW_USE_OPENGL -D_GLFW_USE_MENUBAR -DNS_FORMAT_ARGUMENT(A)= -D_Nullable_result=_Nullable"

HEADERS="-I./ -Iglfw-3.0/include -Iglfw-3.0/src -Igl-headers/ -Ijni-headers"
CC_SOURCES=(
    "glfw-3.0/src/clipboard.c"
    "glfw-3.0/src/context.c"
    "glfw-3.0/src/gamma.c"
    "glfw-3.0/src/init.c"
    "glfw-3.0/src/input.c"
    "glfw-3.0/src/joystick.c"
    "glfw-3.0/src/monitor.c"
    "glfw-3.0/src/time.c"
    "glfw-3.0/src/window.c"
    "glfw-3.0/src/cocoa_clipboard.m"
    "glfw-3.0/src/cocoa_gamma.c"
	"glfw-3.0/src/cocoa_init.m"
    "glfw-3.0/src/cocoa_joystick.m"
    "glfw-3.0/src/cocoa_monitor.m"
	"glfw-3.0/src/cocoa_time.c"
    "glfw-3.0/src/cocoa_window.m"
    "glfw-3.0/src/nsgl_context.m"
    "memcpy_wrap.c"
)
CXX_SOURCES=(
    "com.badlogic.jglfw.gl.GL.cpp"
    "com.badlogic.jglfw.Glfw.cpp"
    "com.badlogic.jglfw.utils.Memory.cpp"
)

echo "${CC_SOURCES[@]}"

LINKER_FLAGS="-shared -m64 -framework Cocoa -framework OpenGL -framework IOKit -lpthread"
LIBRARIES="-L$BUILD_DIR -lm"

JNI_MD="mac"

OUTPUT_DIR="$BUILD_DIR"
OUTPUT_PREFIX="lib"
OUTPUT_NAME="jglfw"
OUTPUT_SUFFIX=".dylib"

function usage {
  cat <<EOF
Usage: $SELF [options]
Options:
  --build=[release|debug] Specifies the build type. If not set both release
						  and debug versions of the libraries will be built.
  --target=...            Specifies the target to build for. Supported
						  targets are macosx and macosx-aarch64. If not set the
						  current host OS determines the targets.
  --help                  Displays this information and exits.
EOF
  exit $1
}

+() { :;} 2> /dev/null; trace() { (PS4=; set -x; "$@";{ set +x; } 2> /dev/null); "$@";}

while [ "${1:0:2}" = '--' ]; do
  NAME=${1%%=*}
  VALUE=${1#*=}
  case $NAME in
	'--target') TARGET="$VALUE" ;;
	'--build') BUILD="$VALUE" ;;	
	'--help')
	  usage 0
	  ;;
	*)
	  echo "Unrecognized option or syntax error in option '$1'"
	  usage 1
	  ;;
  esac
  shift
done

if [ "x$TARGET" = 'x' ]; then
	echo "Please specify a target with --target=<target>: macosx, macosx-aarch64"
	exit 1
fi

if [ "x$TARGET" != 'x' ]; then
	OS=${TARGET%%-*}
	ARCH=${TARGET#*-}

    if [ "$ARCH" = "aarch64" ]; then     
      OUTPUT_NAME="$OUTPUT_NAME""arm64"    
    else        
      OUTPUT_NAME="$OUTPUT_NAME""64"
    fi 
			
	# CXX_FLAGS="$CXX_FLAGS -DNS_FORMAT_ARGUMENT(A)= -D_Nullable_result=_Nullable -mmacosx-version-min=10.7"

    if [ "$ARCH" == "aarch64" ]; then			
        CC_FLAGS="$CC_FLAGS -arch arm64"
        CXX_FLAGS="$CXX_FLAGS -arch arm64"
        LINKER_FLAGS="$LINKER_FLAGS -arch arm64"
    else
        CC_FLAGS="$CC_FLAGS -arch x86_64"
        CXX_FLAGS="$CXX_FLAGS -arch x86_64"
        LINKER_FLAGS="$LINKER_FLAGS -arch x86_64"
    fi	

	if [ "$BUILD" = "debug" ]; then
		CXX_FLAGS="$CXX_FLAGS -g"
	else		
		CC_FLAGS="$CC_FLAGS -O3"
		CXX_FLAGS="$CXX_FLAGS -O3"
	fi
fi

HEADERS="$HEADERS -Ijni-headers/${JNI_MD}"

rm -rf $BUILD_DIR
mkdir -p $BUILD_DIR
mkdir -p $OUTPUT_DIR

echo "--- Compiling for $TARGET, build type $BUILD"

echo "------ Compiling C sources"
for f in "${CC_SOURCES[@]}"; do
	OBJECT_FILE=$BUILD_DIR/`basename $f .c`
	trace $CC $CC_FLAGS $HEADERS "$f" -o $OBJECT_FILE.o
done
echo

echo "------ Compiling C++ sources"
for f in "${CXX_SOURCES[@]}"; do
	OBJECT_FILE=$BUILD_DIR/`basename $f .cpp`
	trace $CXX $CXX_FLAGS $HEADERS "$f" -o $OBJECT_FILE.o
done
echo

echo "--- Linking & stripping"
LINKER=$CXX
OBJ_FILES=`find $BUILD_DIR -name "*.o"`
OUTPUT_FILE="$OUTPUT_DIR/$OUTPUT_PREFIX$OUTPUT_NAME$OUTPUT_SUFFIX"
trace $LINKER $OBJ_FILES $LIBRARIES $LINKER_FLAGS -o "$OUTPUT_FILE"
trace $STRIP "$OUTPUT_FILE"
echo

echo "--- Updating spine-editor-natives.jar"
if test -f ../libs/jglfw-natives.jar; then
    trace $JAR uf ../libs/jglfw-natives.jar -C "$OUTPUT_DIR" "$OUTPUT_PREFIX$OUTPUT_NAME$OUTPUT_SUFFIX"
else
    trace $JAR cf ../libs/jglfw-natives.jar -C "$OUTPUT_DIR" "$OUTPUT_PREFIX$OUTPUT_NAME$OUTPUT_SUFFIX"
fi

#trace rm -rf $BUILD_DIR