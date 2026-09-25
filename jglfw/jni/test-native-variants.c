#include <dlfcn.h>
#include <objc/runtime.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

static void* load(const char* path) {
    void* library = dlopen(path, RTLD_NOW | RTLD_LOCAL);
    if (!library) {
        fprintf(stderr, "dlopen %s: %s\n", path, dlerror());
        exit(1);
    }
    if (!dlsym(library, "Java_com_badlogic_jglfw_Glfw_glfwTerminate")) {
        fprintf(stderr, "Missing JNI export: %s\n", path);
        exit(1);
    }
    return library;
}

static void checkClass(const char* name, const char* path) {
    Class type = objc_getClass(name);
    const char* image = type ? class_getImageName(type) : NULL;
    char* actual = image ? realpath(image, NULL) : NULL;
    char* expected = realpath(path, NULL);
    if (!actual || !expected || strcmp(actual, expected)) {
        fprintf(stderr, "Wrong image for %s: %s, expected %s\n", name, image ? image : "missing", path);
        exit(1);
    }
    free(actual);
    free(expected);
}

int main(int argc, char** argv) {
    if (argc != 4) return 2;
    void* launcher;
    if (!strcmp(argv[3], "launcher-first")) {
        launcher = load(argv[1]);
        load(argv[2]);
    } else {
        load(argv[2]);
        launcher = load(argv[1]);
    }
    const char* classes[] = {"GLFWWindow", "GLFWWindowDelegate", "GLFWApplicationDelegate", "GLFWContentView"};
    for (unsigned i = 0; i < sizeof(classes) / sizeof(classes[0]); i++) {
        char name[128];
        snprintf(name, sizeof(name), "SpineLauncher%s", classes[i]);
        checkClass(name, argv[1]);
        checkClass(classes[i], argv[2]);
    }
    if (dlsym(launcher, "glfwInit") || dlsym(launcher, "_glfw")) {
        fprintf(stderr, "Launcher exports GLFW internals\n");
        return 1;
    }
    printf("PASS: separate JGLFW classes and JNI exports (%s)\n", argv[3]);
    return 0;
}
