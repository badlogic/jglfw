//========================================================================
// Simple GLFW example
// Copyright (c) Camilla Berglund <elmindreda@elmindreda.org>
//
// This software is provided 'as-is', without any express or implied
// warranty. In no event will the authors be held liable for any damages
// arising from the use of this software.
//
// Permission is granted to anyone to use this software for any purpose,
// including commercial applications, and to alter it and redistribute it
// freely, subject to the following restrictions:
//
// 1. The origin of this software must not be misrepresented; you must not
//    claim that you wrote the original software. If you use this software
//    in a product, an acknowledgment in the product documentation would
//    be appreciated but is not required.
//
// 2. Altered source versions must be plainly marked as such, and must not
//    be misrepresented as being the original software.
//
// 3. This notice may not be removed or altered from any source
//    distribution.
//
//========================================================================
//! [code]

#include <GL/glfw3.h>

#include <stdlib.h>
#include <stdio.h>

static const char* get_key_name(int key)
{
	switch (key)
	{
			// Printable keys
		case GLFW_KEY_A:            return "A";
		case GLFW_KEY_B:            return "B";
		case GLFW_KEY_C:            return "C";
		case GLFW_KEY_D:            return "D";
		case GLFW_KEY_E:            return "E";
		case GLFW_KEY_F:            return "F";
		case GLFW_KEY_G:            return "G";
		case GLFW_KEY_H:            return "H";
		case GLFW_KEY_I:            return "I";
		case GLFW_KEY_J:            return "J";
		case GLFW_KEY_K:            return "K";
		case GLFW_KEY_L:            return "L";
		case GLFW_KEY_M:            return "M";
		case GLFW_KEY_N:            return "N";
		case GLFW_KEY_O:            return "O";
		case GLFW_KEY_P:            return "P";
		case GLFW_KEY_Q:            return "Q";
		case GLFW_KEY_R:            return "R";
		case GLFW_KEY_S:            return "S";
		case GLFW_KEY_T:            return "T";
		case GLFW_KEY_U:            return "U";
		case GLFW_KEY_V:            return "V";
		case GLFW_KEY_W:            return "W";
		case GLFW_KEY_X:            return "X";
		case GLFW_KEY_Y:            return "Y";
		case GLFW_KEY_Z:            return "Z";
		case GLFW_KEY_1:            return "1";
		case GLFW_KEY_2:            return "2";
		case GLFW_KEY_3:            return "3";
		case GLFW_KEY_4:            return "4";
		case GLFW_KEY_5:            return "5";
		case GLFW_KEY_6:            return "6";
		case GLFW_KEY_7:            return "7";
		case GLFW_KEY_8:            return "8";
		case GLFW_KEY_9:            return "9";
		case GLFW_KEY_0:            return "0";
		case GLFW_KEY_SPACE:        return "SPACE";
		case GLFW_KEY_MINUS:        return "MINUS";
		case GLFW_KEY_EQUAL:        return "EQUAL";
		case GLFW_KEY_LEFT_BRACKET: return "LEFT BRACKET";
		case GLFW_KEY_RIGHT_BRACKET: return "RIGHT BRACKET";
		case GLFW_KEY_BACKSLASH:    return "BACKSLASH";
		case GLFW_KEY_SEMICOLON:    return "SEMICOLON";
		case GLFW_KEY_APOSTROPHE:   return "APOSTROPHE";
		case GLFW_KEY_GRAVE_ACCENT: return "GRAVE ACCENT";
		case GLFW_KEY_COMMA:        return "COMMA";
		case GLFW_KEY_PERIOD:       return "PERIOD";
		case GLFW_KEY_SLASH:        return "SLASH";
		case GLFW_KEY_WORLD_1:      return "WORLD 1";
		case GLFW_KEY_WORLD_2:      return "WORLD 2";
			
			// Function keys
		case GLFW_KEY_ESCAPE:       return "ESCAPE";
		case GLFW_KEY_F1:           return "F1";
		case GLFW_KEY_F2:           return "F2";
		case GLFW_KEY_F3:           return "F3";
		case GLFW_KEY_F4:           return "F4";
		case GLFW_KEY_F5:           return "F5";
		case GLFW_KEY_F6:           return "F6";
		case GLFW_KEY_F7:           return "F7";
		case GLFW_KEY_F8:           return "F8";
		case GLFW_KEY_F9:           return "F9";
		case GLFW_KEY_F10:          return "F10";
		case GLFW_KEY_F11:          return "F11";
		case GLFW_KEY_F12:          return "F12";
		case GLFW_KEY_F13:          return "F13";
		case GLFW_KEY_F14:          return "F14";
		case GLFW_KEY_F15:          return "F15";
		case GLFW_KEY_F16:          return "F16";
		case GLFW_KEY_F17:          return "F17";
		case GLFW_KEY_F18:          return "F18";
		case GLFW_KEY_F19:          return "F19";
		case GLFW_KEY_F20:          return "F20";
		case GLFW_KEY_F21:          return "F21";
		case GLFW_KEY_F22:          return "F22";
		case GLFW_KEY_F23:          return "F23";
		case GLFW_KEY_F24:          return "F24";
		case GLFW_KEY_F25:          return "F25";
		case GLFW_KEY_UP:           return "UP";
		case GLFW_KEY_DOWN:         return "DOWN";
		case GLFW_KEY_LEFT:         return "LEFT";
		case GLFW_KEY_RIGHT:        return "RIGHT";
		case GLFW_KEY_LEFT_SHIFT:   return "LEFT SHIFT";
		case GLFW_KEY_RIGHT_SHIFT:  return "RIGHT SHIFT";
		case GLFW_KEY_LEFT_CONTROL: return "LEFT CONTROL";
		case GLFW_KEY_RIGHT_CONTROL: return "RIGHT CONTROL";
		case GLFW_KEY_LEFT_ALT:     return "LEFT ALT";
		case GLFW_KEY_RIGHT_ALT:    return "RIGHT ALT";
		case GLFW_KEY_TAB:          return "TAB";
		case GLFW_KEY_ENTER:        return "ENTER";
		case GLFW_KEY_BACKSPACE:    return "BACKSPACE";
		case GLFW_KEY_INSERT:       return "INSERT";
		case GLFW_KEY_DELETE:       return "DELETE";
		case GLFW_KEY_PAGE_UP:      return "PAGE UP";
		case GLFW_KEY_PAGE_DOWN:    return "PAGE DOWN";
		case GLFW_KEY_HOME:         return "HOME";
		case GLFW_KEY_END:          return "END";
		case GLFW_KEY_KP_0:         return "KEYPAD 0";
		case GLFW_KEY_KP_1:         return "KEYPAD 1";
		case GLFW_KEY_KP_2:         return "KEYPAD 2";
		case GLFW_KEY_KP_3:         return "KEYPAD 3";
		case GLFW_KEY_KP_4:         return "KEYPAD 4";
		case GLFW_KEY_KP_5:         return "KEYPAD 5";
		case GLFW_KEY_KP_6:         return "KEYPAD 6";
		case GLFW_KEY_KP_7:         return "KEYPAD 7";
		case GLFW_KEY_KP_8:         return "KEYPAD 8";
		case GLFW_KEY_KP_9:         return "KEYPAD 9";
		case GLFW_KEY_KP_DIVIDE:    return "KEYPAD DIVIDE";
		case GLFW_KEY_KP_MULTIPLY:  return "KEYPAD MULTPLY";
		case GLFW_KEY_KP_SUBTRACT:  return "KEYPAD SUBTRACT";
		case GLFW_KEY_KP_ADD:       return "KEYPAD ADD";
		case GLFW_KEY_KP_DECIMAL:   return "KEYPAD DECIMAL";
		case GLFW_KEY_KP_EQUAL:     return "KEYPAD EQUAL";
		case GLFW_KEY_KP_ENTER:     return "KEYPAD ENTER";
		case GLFW_KEY_PRINT_SCREEN: return "PRINT SCREEN";
		case GLFW_KEY_NUM_LOCK:     return "NUM LOCK";
		case GLFW_KEY_CAPS_LOCK:    return "CAPS LOCK";
		case GLFW_KEY_SCROLL_LOCK:  return "SCROLL LOCK";
		case GLFW_KEY_PAUSE:        return "PAUSE";
		case GLFW_KEY_LEFT_SUPER:   return "LEFT SUPER";
		case GLFW_KEY_RIGHT_SUPER:  return "RIGHT SUPER";
		case GLFW_KEY_MENU:         return "MENU";
			
		default:                    return NULL;
	}
}

static const char* get_action_name(int action)
{
	switch (action)
	{
		case GLFW_PRESS:
			return "pressed";
		case GLFW_RELEASE:
			return "released";
		case GLFW_REPEAT:
			return "repeated";
	}
	
	return "caused unknown action";
}

static const char* get_modifier_name(int modifiers) {
	switch (modifiers) {
		case GLFW_MOD_ALT:
			return "ALT";
		case GLFW_MOD_SHIFT:
			return "SHITF";
		case GLFW_MOD_SUPER:
			return "SUPER";
		case GLFW_MOD_CONTROL:
			return "CONTROL";
	}
	return "unknown modifier";
}

static int counter = 0;
static int closeable = 0;

static void key_callback(GLFWwindow* window, int key, int scancode, int action, int modifiers)
{
	const char* name = get_key_name(key);
	
	printf("%08x at %0.3f: Key 0x%04x", counter++, glfwGetTime(), key);
	
	if (name)
		printf(" (%s) was %s, modifier %s\n", name, get_action_name(action), get_modifier_name(modifiers));
	else
		printf(" was %s\n", get_action_name(action));
	
	if (action != GLFW_PRESS)
		return;
	
	switch (key)
	{
		case GLFW_KEY_C:
		{
			closeable = !closeable;
			
			printf("(( closing %s ))\n", closeable ? "enabled" : "disabled");
			break;
		}
	}
}


static void error_callback(int error, const char* description)
{
    fputs(description, stderr);
}

static const char* get_character_string(int character)
{
	// This assumes UTF-8, which is stupid
	static char result[6 + 1];
	
	int length = wctomb(result, character);
	if (length == -1)
		length = 0;
	
	result[length] = '\0';
	return result;
}

static void char_callback(GLFWwindow* window, unsigned int character)
{
	printf("%08x at %0.3f: Character 0x%08x (%s) input\n",
		   counter++,
		   glfwGetTime(),
		   character,
		   get_character_string(character));
}

int main(void)
{
    GLFWwindow* window;

    glfwSetErrorCallback(error_callback);

    if (!glfwInit())
        exit(EXIT_FAILURE);

    window = glfwCreateWindow(640, 480, "Simple example", NULL, NULL);
    if (!window)
    {
        glfwTerminate();
        exit(EXIT_FAILURE);
    }
	
	glfwSetKeyCallback(window, key_callback);
	glfwSetCharCallback(window, char_callback);

    glfwMakeContextCurrent(window);

    while (!glfwWindowShouldClose(window))
    {
        float ratio;
        int width, height;

        glfwGetWindowSize(window, &width, &height);
        ratio = width / (float) height;

        glViewport(0, 0, width, height);
        glClear(GL_COLOR_BUFFER_BIT);

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(-ratio, ratio, -1.f, 1.f, 1.f, -1.f);
        glMatrixMode(GL_MODELVIEW);

        glLoadIdentity();
        glRotatef(glfwGetTime() * 50.f, 0.f, 0.f, 1.f);

        glBegin(GL_TRIANGLES);
        glColor3f(1.f, 0.f, 0.f);
        glVertex3f(-0.6f, -0.4f, 0.f);
        glColor3f(0.f, 1.f, 0.f);
        glVertex3f(0.6f, -0.4f, 0.f);
        glColor3f(0.f, 0.f, 1.f);
        glVertex3f(0.f, 0.6f, 0.f);
        glEnd();

        glfwSwapBuffers(window);
        glfwPollEvents();
    }

    glfwDestroyWindow(window);

    glfwTerminate();
    exit(EXIT_SUCCESS);
}

//! [code]
