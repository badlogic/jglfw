package com.badlogic.jglfw.gl;

import java.nio.Buffer;

public class GL {
	public static final int GL_VERSION_1_1 = 1;
	public static final int GL_ZERO = 0;
	public static final int GL_FALSE = 0;
	public static final int GL_LOGIC_OP = 0x0BF1;
	public static final int GL_NONE = 0;
	public static final int GL_TEXTURE_COMPONENTS = 0x1003;
	public static final int GL_NO_ERROR = 0;
	public static final int GL_POINTS = 0x0000;
	public static final int GL_CURRENT_BIT = 0x00000001;
	public static final int GL_TRUE = 1;
	public static final int GL_ONE = 1;
	public static final int GL_CLIENT_PIXEL_STORE_BIT = 0x00000001;
	public static final int GL_LINES = 0x0001;
	public static final int GL_LINE_LOOP = 0x0002;
	public static final int GL_POINT_BIT = 0x00000002;
	public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 0x00000002;
	public static final int GL_LINE_STRIP = 0x0003;
	public static final int GL_LINE_BIT = 0x00000004;
	public static final int GL_TRIANGLES = 0x0004;
	public static final int GL_TRIANGLE_STRIP = 0x0005;
	public static final int GL_TRIANGLE_FAN = 0x0006;
	public static final int GL_QUADS = 0x0007;
	public static final int GL_QUAD_STRIP = 0x0008;
	public static final int GL_POLYGON_BIT = 0x00000008;
	public static final int GL_POLYGON = 0x0009;
	public static final int GL_POLYGON_STIPPLE_BIT = 0x00000010;
	public static final int GL_PIXEL_MODE_BIT = 0x00000020;
	public static final int GL_LIGHTING_BIT = 0x00000040;
	public static final int GL_FOG_BIT = 0x00000080;
	public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
	public static final int GL_ACCUM = 0x0100;
	public static final int GL_LOAD = 0x0101;
	public static final int GL_RETURN = 0x0102;
	public static final int GL_MULT = 0x0103;
	public static final int GL_ADD = 0x0104;
	public static final int GL_NEVER = 0x0200;
	public static final int GL_ACCUM_BUFFER_BIT = 0x00000200;
	public static final int GL_LESS = 0x0201;
	public static final int GL_EQUAL = 0x0202;
	public static final int GL_LEQUAL = 0x0203;
	public static final int GL_GREATER = 0x0204;
	public static final int GL_NOTEQUAL = 0x0205;
	public static final int GL_GEQUAL = 0x0206;
	public static final int GL_ALWAYS = 0x0207;
	public static final int GL_SRC_COLOR = 0x0300;
	public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
	public static final int GL_SRC_ALPHA = 0x0302;
	public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
	public static final int GL_DST_ALPHA = 0x0304;
	public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
	public static final int GL_DST_COLOR = 0x0306;
	public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
	public static final int GL_SRC_ALPHA_SATURATE = 0x0308;
	public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
	public static final int GL_FRONT_LEFT = 0x0400;
	public static final int GL_FRONT_RIGHT = 0x0401;
	public static final int GL_BACK_LEFT = 0x0402;
	public static final int GL_BACK_RIGHT = 0x0403;
	public static final int GL_FRONT = 0x0404;
	public static final int GL_BACK = 0x0405;
	public static final int GL_LEFT = 0x0406;
	public static final int GL_RIGHT = 0x0407;
	public static final int GL_FRONT_AND_BACK = 0x0408;
	public static final int GL_AUX0 = 0x0409;
	public static final int GL_AUX1 = 0x040A;
	public static final int GL_AUX2 = 0x040B;
	public static final int GL_AUX3 = 0x040C;
	public static final int GL_INVALID_ENUM = 0x0500;
	public static final int GL_INVALID_VALUE = 0x0501;
	public static final int GL_INVALID_OPERATION = 0x0502;
	public static final int GL_STACK_OVERFLOW = 0x0503;
	public static final int GL_STACK_UNDERFLOW = 0x0504;
	public static final int GL_OUT_OF_MEMORY = 0x0505;
	public static final int GL_2D = 0x0600;
	public static final int GL_3D = 0x0601;
	public static final int GL_3D_COLOR = 0x0602;
	public static final int GL_3D_COLOR_TEXTURE = 0x0603;
	public static final int GL_4D_COLOR_TEXTURE = 0x0604;
	public static final int GL_PASS_THROUGH_TOKEN = 0x0700;
	public static final int GL_POINT_TOKEN = 0x0701;
	public static final int GL_LINE_TOKEN = 0x0702;
	public static final int GL_POLYGON_TOKEN = 0x0703;
	public static final int GL_BITMAP_TOKEN = 0x0704;
	public static final int GL_DRAW_PIXEL_TOKEN = 0x0705;
	public static final int GL_COPY_PIXEL_TOKEN = 0x0706;
	public static final int GL_LINE_RESET_TOKEN = 0x0707;
	public static final int GL_EXP = 0x0800;
	public static final int GL_VIEWPORT_BIT = 0x00000800;
	public static final int GL_EXP2 = 0x0801;
	public static final int GL_CW = 0x0900;
	public static final int GL_CCW = 0x0901;
	public static final int GL_COEFF = 0x0A00;
	public static final int GL_ORDER = 0x0A01;
	public static final int GL_DOMAIN = 0x0A02;
	public static final int GL_CURRENT_COLOR = 0x0B00;
	public static final int GL_CURRENT_INDEX = 0x0B01;
	public static final int GL_CURRENT_NORMAL = 0x0B02;
	public static final int GL_CURRENT_TEXTURE_COORDS = 0x0B03;
	public static final int GL_CURRENT_RASTER_COLOR = 0x0B04;
	public static final int GL_CURRENT_RASTER_INDEX = 0x0B05;
	public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 0x0B06;
	public static final int GL_CURRENT_RASTER_POSITION = 0x0B07;
	public static final int GL_CURRENT_RASTER_POSITION_VALID = 0x0B08;
	public static final int GL_CURRENT_RASTER_DISTANCE = 0x0B09;
	public static final int GL_POINT_SMOOTH = 0x0B10;
	public static final int GL_POINT_SIZE = 0x0B11;
	public static final int GL_POINT_SIZE_RANGE = 0x0B12;
	public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
	public static final int GL_LINE_SMOOTH = 0x0B20;
	public static final int GL_LINE_WIDTH = 0x0B21;
	public static final int GL_LINE_WIDTH_RANGE = 0x0B22;
	public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
	public static final int GL_LINE_STIPPLE = 0x0B24;
	public static final int GL_LINE_STIPPLE_PATTERN = 0x0B25;
	public static final int GL_LINE_STIPPLE_REPEAT = 0x0B26;
	public static final int GL_LIST_MODE = 0x0B30;
	public static final int GL_MAX_LIST_NESTING = 0x0B31;
	public static final int GL_LIST_BASE = 0x0B32;
	public static final int GL_LIST_INDEX = 0x0B33;
	public static final int GL_POLYGON_MODE = 0x0B40;
	public static final int GL_POLYGON_SMOOTH = 0x0B41;
	public static final int GL_POLYGON_STIPPLE = 0x0B42;
	public static final int GL_EDGE_FLAG = 0x0B43;
	public static final int GL_CULL_FACE = 0x0B44;
	public static final int GL_CULL_FACE_MODE = 0x0B45;
	public static final int GL_FRONT_FACE = 0x0B46;
	public static final int GL_LIGHTING = 0x0B50;
	public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 0x0B51;
	public static final int GL_LIGHT_MODEL_TWO_SIDE = 0x0B52;
	public static final int GL_LIGHT_MODEL_AMBIENT = 0x0B53;
	public static final int GL_SHADE_MODEL = 0x0B54;
	public static final int GL_COLOR_MATERIAL_FACE = 0x0B55;
	public static final int GL_COLOR_MATERIAL_PARAMETER = 0x0B56;
	public static final int GL_COLOR_MATERIAL = 0x0B57;
	public static final int GL_FOG = 0x0B60;
	public static final int GL_FOG_INDEX = 0x0B61;
	public static final int GL_FOG_DENSITY = 0x0B62;
	public static final int GL_FOG_START = 0x0B63;
	public static final int GL_FOG_END = 0x0B64;
	public static final int GL_FOG_MODE = 0x0B65;
	public static final int GL_FOG_COLOR = 0x0B66;
	public static final int GL_DEPTH_RANGE = 0x0B70;
	public static final int GL_DEPTH_TEST = 0x0B71;
	public static final int GL_DEPTH_WRITEMASK = 0x0B72;
	public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
	public static final int GL_DEPTH_FUNC = 0x0B74;
	public static final int GL_ACCUM_CLEAR_VALUE = 0x0B80;
	public static final int GL_STENCIL_TEST = 0x0B90;
	public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;
	public static final int GL_STENCIL_FUNC = 0x0B92;
	public static final int GL_STENCIL_VALUE_MASK = 0x0B93;
	public static final int GL_STENCIL_FAIL = 0x0B94;
	public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
	public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
	public static final int GL_STENCIL_REF = 0x0B97;
	public static final int GL_STENCIL_WRITEMASK = 0x0B98;
	public static final int GL_MATRIX_MODE = 0x0BA0;
	public static final int GL_NORMALIZE = 0x0BA1;
	public static final int GL_VIEWPORT = 0x0BA2;
	public static final int GL_MODELVIEW_STACK_DEPTH = 0x0BA3;
	public static final int GL_PROJECTION_STACK_DEPTH = 0x0BA4;
	public static final int GL_TEXTURE_STACK_DEPTH = 0x0BA5;
	public static final int GL_MODELVIEW_MATRIX = 0x0BA6;
	public static final int GL_PROJECTION_MATRIX = 0x0BA7;
	public static final int GL_TEXTURE_MATRIX = 0x0BA8;
	public static final int GL_ATTRIB_STACK_DEPTH = 0x0BB0;
	public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 0x0BB1;
	public static final int GL_ALPHA_TEST = 0x0BC0;
	public static final int GL_ALPHA_TEST_FUNC = 0x0BC1;
	public static final int GL_ALPHA_TEST_REF = 0x0BC2;
	public static final int GL_DITHER = 0x0BD0;
	public static final int GL_BLEND_DST = 0x0BE0;
	public static final int GL_BLEND_SRC = 0x0BE1;
	public static final int GL_BLEND = 0x0BE2;
	public static final int GL_LOGIC_OP_MODE = 0x0BF0;
	public static final int GL_INDEX_LOGIC_OP = 0x0BF1;
	public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
	public static final int GL_AUX_BUFFERS = 0x0C00;
	public static final int GL_DRAW_BUFFER = 0x0C01;
	public static final int GL_READ_BUFFER = 0x0C02;
	public static final int GL_SCISSOR_BOX = 0x0C10;
	public static final int GL_SCISSOR_TEST = 0x0C11;
	public static final int GL_INDEX_CLEAR_VALUE = 0x0C20;
	public static final int GL_INDEX_WRITEMASK = 0x0C21;
	public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;
	public static final int GL_COLOR_WRITEMASK = 0x0C23;
	public static final int GL_INDEX_MODE = 0x0C30;
	public static final int GL_RGBA_MODE = 0x0C31;
	public static final int GL_DOUBLEBUFFER = 0x0C32;
	public static final int GL_STEREO = 0x0C33;
	public static final int GL_RENDER_MODE = 0x0C40;
	public static final int GL_PERSPECTIVE_CORRECTION_HINT = 0x0C50;
	public static final int GL_POINT_SMOOTH_HINT = 0x0C51;
	public static final int GL_LINE_SMOOTH_HINT = 0x0C52;
	public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;
	public static final int GL_FOG_HINT = 0x0C54;
	public static final int GL_TEXTURE_GEN_S = 0x0C60;
	public static final int GL_TEXTURE_GEN_T = 0x0C61;
	public static final int GL_TEXTURE_GEN_R = 0x0C62;
	public static final int GL_TEXTURE_GEN_Q = 0x0C63;
	public static final int GL_PIXEL_MAP_I_TO_I = 0x0C70;
	public static final int GL_PIXEL_MAP_S_TO_S = 0x0C71;
	public static final int GL_PIXEL_MAP_I_TO_R = 0x0C72;
	public static final int GL_PIXEL_MAP_I_TO_G = 0x0C73;
	public static final int GL_PIXEL_MAP_I_TO_B = 0x0C74;
	public static final int GL_PIXEL_MAP_I_TO_A = 0x0C75;
	public static final int GL_PIXEL_MAP_R_TO_R = 0x0C76;
	public static final int GL_PIXEL_MAP_G_TO_G = 0x0C77;
	public static final int GL_PIXEL_MAP_B_TO_B = 0x0C78;
	public static final int GL_PIXEL_MAP_A_TO_A = 0x0C79;
	public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 0x0CB0;
	public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 0x0CB1;
	public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 0x0CB2;
	public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 0x0CB3;
	public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 0x0CB4;
	public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 0x0CB5;
	public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 0x0CB6;
	public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 0x0CB7;
	public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 0x0CB8;
	public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 0x0CB9;
	public static final int GL_UNPACK_SWAP_BYTES = 0x0CF0;
	public static final int GL_UNPACK_LSB_FIRST = 0x0CF1;
	public static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;
	public static final int GL_UNPACK_SKIP_ROWS = 0x0CF3;
	public static final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
	public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
	public static final int GL_PACK_SWAP_BYTES = 0x0D00;
	public static final int GL_PACK_LSB_FIRST = 0x0D01;
	public static final int GL_PACK_ROW_LENGTH = 0x0D02;
	public static final int GL_PACK_SKIP_ROWS = 0x0D03;
	public static final int GL_PACK_SKIP_PIXELS = 0x0D04;
	public static final int GL_PACK_ALIGNMENT = 0x0D05;
	public static final int GL_MAP_COLOR = 0x0D10;
	public static final int GL_MAP_STENCIL = 0x0D11;
	public static final int GL_INDEX_SHIFT = 0x0D12;
	public static final int GL_INDEX_OFFSET = 0x0D13;
	public static final int GL_RED_SCALE = 0x0D14;
	public static final int GL_RED_BIAS = 0x0D15;
	public static final int GL_ZOOM_X = 0x0D16;
	public static final int GL_ZOOM_Y = 0x0D17;
	public static final int GL_GREEN_SCALE = 0x0D18;
	public static final int GL_GREEN_BIAS = 0x0D19;
	public static final int GL_BLUE_SCALE = 0x0D1A;
	public static final int GL_BLUE_BIAS = 0x0D1B;
	public static final int GL_ALPHA_SCALE = 0x0D1C;
	public static final int GL_ALPHA_BIAS = 0x0D1D;
	public static final int GL_DEPTH_SCALE = 0x0D1E;
	public static final int GL_DEPTH_BIAS = 0x0D1F;
	public static final int GL_MAX_EVAL_ORDER = 0x0D30;
	public static final int GL_MAX_LIGHTS = 0x0D31;
	public static final int GL_MAX_CLIP_PLANES = 0x0D32;
	public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;
	public static final int GL_MAX_PIXEL_MAP_TABLE = 0x0D34;
	public static final int GL_MAX_ATTRIB_STACK_DEPTH = 0x0D35;
	public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 0x0D36;
	public static final int GL_MAX_NAME_STACK_DEPTH = 0x0D37;
	public static final int GL_MAX_PROJECTION_STACK_DEPTH = 0x0D38;
	public static final int GL_MAX_TEXTURE_STACK_DEPTH = 0x0D39;
	public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;
	public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0x0D3B;
	public static final int GL_SUBPIXEL_BITS = 0x0D50;
	public static final int GL_INDEX_BITS = 0x0D51;
	public static final int GL_RED_BITS = 0x0D52;
	public static final int GL_GREEN_BITS = 0x0D53;
	public static final int GL_BLUE_BITS = 0x0D54;
	public static final int GL_ALPHA_BITS = 0x0D55;
	public static final int GL_DEPTH_BITS = 0x0D56;
	public static final int GL_STENCIL_BITS = 0x0D57;
	public static final int GL_ACCUM_RED_BITS = 0x0D58;
	public static final int GL_ACCUM_GREEN_BITS = 0x0D59;
	public static final int GL_ACCUM_BLUE_BITS = 0x0D5A;
	public static final int GL_ACCUM_ALPHA_BITS = 0x0D5B;
	public static final int GL_NAME_STACK_DEPTH = 0x0D70;
	public static final int GL_AUTO_NORMAL = 0x0D80;
	public static final int GL_MAP1_COLOR_4 = 0x0D90;
	public static final int GL_MAP1_INDEX = 0x0D91;
	public static final int GL_MAP1_NORMAL = 0x0D92;
	public static final int GL_MAP1_TEXTURE_COORD_1 = 0x0D93;
	public static final int GL_MAP1_TEXTURE_COORD_2 = 0x0D94;
	public static final int GL_MAP1_TEXTURE_COORD_3 = 0x0D95;
	public static final int GL_MAP1_TEXTURE_COORD_4 = 0x0D96;
	public static final int GL_MAP1_VERTEX_3 = 0x0D97;
	public static final int GL_MAP1_VERTEX_4 = 0x0D98;
	public static final int GL_MAP2_COLOR_4 = 0x0DB0;
	public static final int GL_MAP2_INDEX = 0x0DB1;
	public static final int GL_MAP2_NORMAL = 0x0DB2;
	public static final int GL_MAP2_TEXTURE_COORD_1 = 0x0DB3;
	public static final int GL_MAP2_TEXTURE_COORD_2 = 0x0DB4;
	public static final int GL_MAP2_TEXTURE_COORD_3 = 0x0DB5;
	public static final int GL_MAP2_TEXTURE_COORD_4 = 0x0DB6;
	public static final int GL_MAP2_VERTEX_3 = 0x0DB7;
	public static final int GL_MAP2_VERTEX_4 = 0x0DB8;
	public static final int GL_MAP1_GRID_DOMAIN = 0x0DD0;
	public static final int GL_MAP1_GRID_SEGMENTS = 0x0DD1;
	public static final int GL_MAP2_GRID_DOMAIN = 0x0DD2;
	public static final int GL_MAP2_GRID_SEGMENTS = 0x0DD3;
	public static final int GL_TEXTURE_1D = 0x0DE0;
	public static final int GL_TEXTURE_2D = 0x0DE1;
	public static final int GL_FEEDBACK_BUFFER_POINTER = 0x0DF0;
	public static final int GL_FEEDBACK_BUFFER_SIZE = 0x0DF1;
	public static final int GL_FEEDBACK_BUFFER_TYPE = 0x0DF2;
	public static final int GL_SELECTION_BUFFER_POINTER = 0x0DF3;
	public static final int GL_SELECTION_BUFFER_SIZE = 0x0DF4;
	public static final int GL_TEXTURE_WIDTH = 0x1000;
	public static final int GL_TRANSFORM_BIT = 0x00001000;
	public static final int GL_TEXTURE_HEIGHT = 0x1001;
	public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
	public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
	public static final int GL_TEXTURE_BORDER = 0x1005;
	public static final int GL_DONT_CARE = 0x1100;
	public static final int GL_FASTEST = 0x1101;
	public static final int GL_NICEST = 0x1102;
	public static final int GL_AMBIENT = 0x1200;
	public static final int GL_DIFFUSE = 0x1201;
	public static final int GL_SPECULAR = 0x1202;
	public static final int GL_POSITION = 0x1203;
	public static final int GL_SPOT_DIRECTION = 0x1204;
	public static final int GL_SPOT_EXPONENT = 0x1205;
	public static final int GL_SPOT_CUTOFF = 0x1206;
	public static final int GL_CONSTANT_ATTENUATION = 0x1207;
	public static final int GL_LINEAR_ATTENUATION = 0x1208;
	public static final int GL_QUADRATIC_ATTENUATION = 0x1209;
	public static final int GL_COMPILE = 0x1300;
	public static final int GL_COMPILE_AND_EXECUTE = 0x1301;
	public static final int GL_BYTE = 0x1400;
	public static final int GL_UNSIGNED_BYTE = 0x1401;
	public static final int GL_SHORT = 0x1402;
	public static final int GL_UNSIGNED_SHORT = 0x1403;
	public static final int GL_INT = 0x1404;
	public static final int GL_UNSIGNED_INT = 0x1405;
	public static final int GL_FLOAT = 0x1406;
	public static final int GL_2_BYTES = 0x1407;
	public static final int GL_3_BYTES = 0x1408;
	public static final int GL_4_BYTES = 0x1409;
	public static final int GL_DOUBLE = 0x140A;
	public static final int GL_CLEAR = 0x1500;
	public static final int GL_AND = 0x1501;
	public static final int GL_AND_REVERSE = 0x1502;
	public static final int GL_COPY = 0x1503;
	public static final int GL_AND_INVERTED = 0x1504;
	public static final int GL_NOOP = 0x1505;
	public static final int GL_XOR = 0x1506;
	public static final int GL_OR = 0x1507;
	public static final int GL_NOR = 0x1508;
	public static final int GL_EQUIV = 0x1509;
	public static final int GL_INVERT = 0x150A;
	public static final int GL_OR_REVERSE = 0x150B;
	public static final int GL_COPY_INVERTED = 0x150C;
	public static final int GL_OR_INVERTED = 0x150D;
	public static final int GL_NAND = 0x150E;
	public static final int GL_SET = 0x150F;
	public static final int GL_EMISSION = 0x1600;
	public static final int GL_SHININESS = 0x1601;
	public static final int GL_AMBIENT_AND_DIFFUSE = 0x1602;
	public static final int GL_COLOR_INDEXES = 0x1603;
	public static final int GL_MODELVIEW = 0x1700;
	public static final int GL_PROJECTION = 0x1701;
	public static final int GL_TEXTURE = 0x1702;
	public static final int GL_COLOR = 0x1800;
	public static final int GL_DEPTH = 0x1801;
	public static final int GL_STENCIL = 0x1802;
	public static final int GL_COLOR_INDEX = 0x1900;
	public static final int GL_STENCIL_INDEX = 0x1901;
	public static final int GL_DEPTH_COMPONENT = 0x1902;
	public static final int GL_RED = 0x1903;
	public static final int GL_GREEN = 0x1904;
	public static final int GL_BLUE = 0x1905;
	public static final int GL_ALPHA = 0x1906;
	public static final int GL_RGB = 0x1907;
	public static final int GL_RGBA = 0x1908;
	public static final int GL_LUMINANCE = 0x1909;
	public static final int GL_LUMINANCE_ALPHA = 0x190A;
	public static final int GL_BITMAP = 0x1A00;
	public static final int GL_POINT = 0x1B00;
	public static final int GL_LINE = 0x1B01;
	public static final int GL_FILL = 0x1B02;
	public static final int GL_RENDER = 0x1C00;
	public static final int GL_FEEDBACK = 0x1C01;
	public static final int GL_SELECT = 0x1C02;
	public static final int GL_FLAT = 0x1D00;
	public static final int GL_SMOOTH = 0x1D01;
	public static final int GL_KEEP = 0x1E00;
	public static final int GL_REPLACE = 0x1E01;
	public static final int GL_INCR = 0x1E02;
	public static final int GL_DECR = 0x1E03;
	public static final int GL_VENDOR = 0x1F00;
	public static final int GL_RENDERER = 0x1F01;
	public static final int GL_VERSION = 0x1F02;
	public static final int GL_EXTENSIONS = 0x1F03;
	public static final int GL_S = 0x2000;
	public static final int GL_ENABLE_BIT = 0x00002000;
	public static final int GL_T = 0x2001;
	public static final int GL_R = 0x2002;
	public static final int GL_Q = 0x2003;
	public static final int GL_MODULATE = 0x2100;
	public static final int GL_DECAL = 0x2101;
	public static final int GL_TEXTURE_ENV_MODE = 0x2200;
	public static final int GL_TEXTURE_ENV_COLOR = 0x2201;
	public static final int GL_TEXTURE_ENV = 0x2300;
	public static final int GL_EYE_LINEAR = 0x2400;
	public static final int GL_OBJECT_LINEAR = 0x2401;
	public static final int GL_SPHERE_MAP = 0x2402;
	public static final int GL_TEXTURE_GEN_MODE = 0x2500;
	public static final int GL_OBJECT_PLANE = 0x2501;
	public static final int GL_EYE_PLANE = 0x2502;
	public static final int GL_NEAREST = 0x2600;
	public static final int GL_LINEAR = 0x2601;
	public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
	public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
	public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
	public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
	public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
	public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
	public static final int GL_TEXTURE_WRAP_S = 0x2802;
	public static final int GL_TEXTURE_WRAP_T = 0x2803;
	public static final int GL_CLAMP = 0x2900;
	public static final int GL_REPEAT = 0x2901;
	public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
	public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
	public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
	public static final int GL_R3_G3_B2 = 0x2A10;
	public static final int GL_V2F = 0x2A20;
	public static final int GL_V3F = 0x2A21;
	public static final int GL_C4UB_V2F = 0x2A22;
	public static final int GL_C4UB_V3F = 0x2A23;
	public static final int GL_C3F_V3F = 0x2A24;
	public static final int GL_N3F_V3F = 0x2A25;
	public static final int GL_C4F_N3F_V3F = 0x2A26;
	public static final int GL_T2F_V3F = 0x2A27;
	public static final int GL_T4F_V4F = 0x2A28;
	public static final int GL_T2F_C4UB_V3F = 0x2A29;
	public static final int GL_T2F_C3F_V3F = 0x2A2A;
	public static final int GL_T2F_N3F_V3F = 0x2A2B;
	public static final int GL_T2F_C4F_N3F_V3F = 0x2A2C;
	public static final int GL_T4F_C4F_N3F_V4F = 0x2A2D;
	public static final int GL_CLIP_PLANE0 = 0x3000;
	public static final int GL_CLIP_PLANE1 = 0x3001;
	public static final int GL_CLIP_PLANE2 = 0x3002;
	public static final int GL_CLIP_PLANE3 = 0x3003;
	public static final int GL_CLIP_PLANE4 = 0x3004;
	public static final int GL_CLIP_PLANE5 = 0x3005;
	public static final int GL_LIGHT0 = 0x4000;
	public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
	public static final int GL_LIGHT1 = 0x4001;
	public static final int GL_LIGHT2 = 0x4002;
	public static final int GL_LIGHT3 = 0x4003;
	public static final int GL_LIGHT4 = 0x4004;
	public static final int GL_LIGHT5 = 0x4005;
	public static final int GL_LIGHT6 = 0x4006;
	public static final int GL_LIGHT7 = 0x4007;
	public static final int GL_HINT_BIT = 0x00008000;
	public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
	public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
	public static final int GL_ALPHA4 = 0x803B;
	public static final int GL_ALPHA8 = 0x803C;
	public static final int GL_ALPHA12 = 0x803D;
	public static final int GL_ALPHA16 = 0x803E;
	public static final int GL_LUMINANCE4 = 0x803F;
	public static final int GL_LUMINANCE8 = 0x8040;
	public static final int GL_LUMINANCE12 = 0x8041;
	public static final int GL_LUMINANCE16 = 0x8042;
	public static final int GL_LUMINANCE4_ALPHA4 = 0x8043;
	public static final int GL_LUMINANCE6_ALPHA2 = 0x8044;
	public static final int GL_LUMINANCE8_ALPHA8 = 0x8045;
	public static final int GL_LUMINANCE12_ALPHA4 = 0x8046;
	public static final int GL_LUMINANCE12_ALPHA12 = 0x8047;
	public static final int GL_LUMINANCE16_ALPHA16 = 0x8048;
	public static final int GL_INTENSITY = 0x8049;
	public static final int GL_INTENSITY4 = 0x804A;
	public static final int GL_INTENSITY8 = 0x804B;
	public static final int GL_INTENSITY12 = 0x804C;
	public static final int GL_INTENSITY16 = 0x804D;
	public static final int GL_RGB4 = 0x804F;
	public static final int GL_RGB5 = 0x8050;
	public static final int GL_RGB8 = 0x8051;
	public static final int GL_RGB10 = 0x8052;
	public static final int GL_RGB12 = 0x8053;
	public static final int GL_RGB16 = 0x8054;
	public static final int GL_RGBA2 = 0x8055;
	public static final int GL_RGBA4 = 0x8056;
	public static final int GL_RGB5_A1 = 0x8057;
	public static final int GL_RGBA8 = 0x8058;
	public static final int GL_RGB10_A2 = 0x8059;
	public static final int GL_RGBA12 = 0x805A;
	public static final int GL_RGBA16 = 0x805B;
	public static final int GL_TEXTURE_RED_SIZE = 0x805C;
	public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
	public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
	public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
	public static final int GL_TEXTURE_LUMINANCE_SIZE = 0x8060;
	public static final int GL_TEXTURE_INTENSITY_SIZE = 0x8061;
	public static final int GL_PROXY_TEXTURE_1D = 0x8063;
	public static final int GL_PROXY_TEXTURE_2D = 0x8064;
	public static final int GL_TEXTURE_PRIORITY = 0x8066;
	public static final int GL_TEXTURE_RESIDENT = 0x8067;
	public static final int GL_TEXTURE_BINDING_1D = 0x8068;
	public static final int GL_TEXTURE_BINDING_2D = 0x8069;
	public static final int GL_VERTEX_ARRAY = 0x8074;
	public static final int GL_NORMAL_ARRAY = 0x8075;
	public static final int GL_COLOR_ARRAY = 0x8076;
	public static final int GL_INDEX_ARRAY = 0x8077;
	public static final int GL_TEXTURE_COORD_ARRAY = 0x8078;
	public static final int GL_EDGE_FLAG_ARRAY = 0x8079;
	public static final int GL_VERTEX_ARRAY_SIZE = 0x807A;
	public static final int GL_VERTEX_ARRAY_TYPE = 0x807B;
	public static final int GL_VERTEX_ARRAY_STRIDE = 0x807C;
	public static final int GL_NORMAL_ARRAY_TYPE = 0x807E;
	public static final int GL_NORMAL_ARRAY_STRIDE = 0x807F;
	public static final int GL_COLOR_ARRAY_SIZE = 0x8081;
	public static final int GL_COLOR_ARRAY_TYPE = 0x8082;
	public static final int GL_COLOR_ARRAY_STRIDE = 0x8083;
	public static final int GL_INDEX_ARRAY_TYPE = 0x8085;
	public static final int GL_INDEX_ARRAY_STRIDE = 0x8086;
	public static final int GL_TEXTURE_COORD_ARRAY_SIZE = 0x8088;
	public static final int GL_TEXTURE_COORD_ARRAY_TYPE = 0x8089;
	public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = 0x808A;
	public static final int GL_EDGE_FLAG_ARRAY_STRIDE = 0x808C;
	public static final int GL_VERTEX_ARRAY_POINTER = 0x808E;
	public static final int GL_NORMAL_ARRAY_POINTER = 0x808F;
	public static final int GL_COLOR_ARRAY_POINTER = 0x8090;
	public static final int GL_INDEX_ARRAY_POINTER = 0x8091;
	public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 0x8092;
	public static final int GL_EDGE_FLAG_ARRAY_POINTER = 0x8093;
	public static final int GL_COLOR_INDEX1_EXT = 0x80E2;
	public static final int GL_COLOR_INDEX2_EXT = 0x80E3;
	public static final int GL_COLOR_INDEX4_EXT = 0x80E4;
	public static final int GL_COLOR_INDEX8_EXT = 0x80E5;
	public static final int GL_COLOR_INDEX12_EXT = 0x80E6;
	public static final int GL_COLOR_INDEX16_EXT = 0x80E7;
	public static final int GL_EVAL_BIT = 0x00010000;
	public static final int GL_LIST_BIT = 0x00020000;
	public static final int GL_TEXTURE_BIT = 0x00040000;
	public static final int GL_SCISSOR_BIT = 0x00080000;
	public static final int GL_ALL_ATTRIB_BITS = 0x000fffff;
	public static final int GL_CLIENT_ALL_ATTRIB_BITS = 0xffffffff;
	public static final int GL_VERSION_1_2 = 1;
	public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0x0B12;
	public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
	public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
	public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
	public static final int GL_UNSIGNED_BYTE_3_3_2 = 0x8032;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;
	public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;
	public static final int GL_UNSIGNED_INT_8_8_8_8 = 0x8035;
	public static final int GL_UNSIGNED_INT_10_10_10_2 = 0x8036;
	public static final int GL_RESCALE_NORMAL = 0x803A;
	public static final int GL_TEXTURE_BINDING_3D = 0x806A;
	public static final int GL_PACK_SKIP_IMAGES = 0x806B;
	public static final int GL_PACK_IMAGE_HEIGHT = 0x806C;
	public static final int GL_UNPACK_SKIP_IMAGES = 0x806D;
	public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
	public static final int GL_TEXTURE_3D = 0x806F;
	public static final int GL_PROXY_TEXTURE_3D = 0x8070;
	public static final int GL_TEXTURE_DEPTH = 0x8071;
	public static final int GL_TEXTURE_WRAP_R = 0x8072;
	public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
	public static final int GL_BGR = 0x80E0;
	public static final int GL_BGRA = 0x80E1;
	public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
	public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;
	public static final int GL_CLAMP_TO_EDGE = 0x812F;
	public static final int GL_TEXTURE_MIN_LOD = 0x813A;
	public static final int GL_TEXTURE_MAX_LOD = 0x813B;
	public static final int GL_TEXTURE_BASE_LEVEL = 0x813C;
	public static final int GL_TEXTURE_MAX_LEVEL = 0x813D;
	public static final int GL_LIGHT_MODEL_COLOR_CONTROL = 0x81F8;
	public static final int GL_SINGLE_COLOR = 0x81F9;
	public static final int GL_SEPARATE_SPECULAR_COLOR = 0x81FA;
	public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 0x8362;
	public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;
	public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 0x8364;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
	public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
	public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;
	public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
	public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846D;
	public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;
	public static final int GL_VERSION_1_2_1 = 1;
	public static final int GL_VERSION_1_3 = 1;
	public static final int GL_MULTISAMPLE = 0x809D;
	public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
	public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;
	public static final int GL_SAMPLE_COVERAGE = 0x80A0;
	public static final int GL_SAMPLE_BUFFERS = 0x80A8;
	public static final int GL_SAMPLES = 0x80A9;
	public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;
	public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;
	public static final int GL_CLAMP_TO_BORDER = 0x812D;
	public static final int GL_TEXTURE0 = 0x84C0;
	public static final int GL_TEXTURE1 = 0x84C1;
	public static final int GL_TEXTURE2 = 0x84C2;
	public static final int GL_TEXTURE3 = 0x84C3;
	public static final int GL_TEXTURE4 = 0x84C4;
	public static final int GL_TEXTURE5 = 0x84C5;
	public static final int GL_TEXTURE6 = 0x84C6;
	public static final int GL_TEXTURE7 = 0x84C7;
	public static final int GL_TEXTURE8 = 0x84C8;
	public static final int GL_TEXTURE9 = 0x84C9;
	public static final int GL_TEXTURE10 = 0x84CA;
	public static final int GL_TEXTURE11 = 0x84CB;
	public static final int GL_TEXTURE12 = 0x84CC;
	public static final int GL_TEXTURE13 = 0x84CD;
	public static final int GL_TEXTURE14 = 0x84CE;
	public static final int GL_TEXTURE15 = 0x84CF;
	public static final int GL_TEXTURE16 = 0x84D0;
	public static final int GL_TEXTURE17 = 0x84D1;
	public static final int GL_TEXTURE18 = 0x84D2;
	public static final int GL_TEXTURE19 = 0x84D3;
	public static final int GL_TEXTURE20 = 0x84D4;
	public static final int GL_TEXTURE21 = 0x84D5;
	public static final int GL_TEXTURE22 = 0x84D6;
	public static final int GL_TEXTURE23 = 0x84D7;
	public static final int GL_TEXTURE24 = 0x84D8;
	public static final int GL_TEXTURE25 = 0x84D9;
	public static final int GL_TEXTURE26 = 0x84DA;
	public static final int GL_TEXTURE27 = 0x84DB;
	public static final int GL_TEXTURE28 = 0x84DC;
	public static final int GL_TEXTURE29 = 0x84DD;
	public static final int GL_TEXTURE30 = 0x84DE;
	public static final int GL_TEXTURE31 = 0x84DF;
	public static final int GL_ACTIVE_TEXTURE = 0x84E0;
	public static final int GL_CLIENT_ACTIVE_TEXTURE = 0x84E1;
	public static final int GL_MAX_TEXTURE_UNITS = 0x84E2;
	public static final int GL_TRANSPOSE_MODELVIEW_MATRIX = 0x84E3;
	public static final int GL_TRANSPOSE_PROJECTION_MATRIX = 0x84E4;
	public static final int GL_TRANSPOSE_TEXTURE_MATRIX = 0x84E5;
	public static final int GL_TRANSPOSE_COLOR_MATRIX = 0x84E6;
	public static final int GL_SUBTRACT = 0x84E7;
	public static final int GL_COMPRESSED_ALPHA = 0x84E9;
	public static final int GL_COMPRESSED_LUMINANCE = 0x84EA;
	public static final int GL_COMPRESSED_LUMINANCE_ALPHA = 0x84EB;
	public static final int GL_COMPRESSED_INTENSITY = 0x84EC;
	public static final int GL_COMPRESSED_RGB = 0x84ED;
	public static final int GL_COMPRESSED_RGBA = 0x84EE;
	public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;
	public static final int GL_NORMAL_MAP = 0x8511;
	public static final int GL_REFLECTION_MAP = 0x8512;
	public static final int GL_TEXTURE_CUBE_MAP = 0x8513;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;
	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
	public static final int GL_COMBINE = 0x8570;
	public static final int GL_COMBINE_RGB = 0x8571;
	public static final int GL_COMBINE_ALPHA = 0x8572;
	public static final int GL_RGB_SCALE = 0x8573;
	public static final int GL_ADD_SIGNED = 0x8574;
	public static final int GL_INTERPOLATE = 0x8575;
	public static final int GL_CONSTANT = 0x8576;
	public static final int GL_PRIMARY_COLOR = 0x8577;
	public static final int GL_PREVIOUS = 0x8578;
	public static final int GL_SOURCE0_RGB = 0x8580;
	public static final int GL_SOURCE1_RGB = 0x8581;
	public static final int GL_SOURCE2_RGB = 0x8582;
	public static final int GL_SOURCE0_ALPHA = 0x8588;
	public static final int GL_SOURCE1_ALPHA = 0x8589;
	public static final int GL_SOURCE2_ALPHA = 0x858A;
	public static final int GL_OPERAND0_RGB = 0x8590;
	public static final int GL_OPERAND1_RGB = 0x8591;
	public static final int GL_OPERAND2_RGB = 0x8592;
	public static final int GL_OPERAND0_ALPHA = 0x8598;
	public static final int GL_OPERAND1_ALPHA = 0x8599;
	public static final int GL_OPERAND2_ALPHA = 0x859A;
	public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
	public static final int GL_TEXTURE_COMPRESSED = 0x86A1;
	public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
	public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;
	public static final int GL_DOT3_RGB = 0x86AE;
	public static final int GL_DOT3_RGBA = 0x86AF;
	public static final int GL_MULTISAMPLE_BIT = 0x20000000;
	public static final int GL_VERSION_1_4 = 1;
	public static final int GL_BLEND_DST_RGB = 0x80C8;
	public static final int GL_BLEND_SRC_RGB = 0x80C9;
	public static final int GL_BLEND_DST_ALPHA = 0x80CA;
	public static final int GL_BLEND_SRC_ALPHA = 0x80CB;
	public static final int GL_POINT_SIZE_MIN = 0x8126;
	public static final int GL_POINT_SIZE_MAX = 0x8127;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;
	public static final int GL_POINT_DISTANCE_ATTENUATION = 0x8129;
	public static final int GL_GENERATE_MIPMAP = 0x8191;
	public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;
	public static final int GL_DEPTH_COMPONENT16 = 0x81A5;
	public static final int GL_DEPTH_COMPONENT24 = 0x81A6;
	public static final int GL_DEPTH_COMPONENT32 = 0x81A7;
	public static final int GL_MIRRORED_REPEAT = 0x8370;
	public static final int GL_FOG_COORDINATE_SOURCE = 0x8450;
	public static final int GL_FOG_COORDINATE = 0x8451;
	public static final int GL_FRAGMENT_DEPTH = 0x8452;
	public static final int GL_CURRENT_FOG_COORDINATE = 0x8453;
	public static final int GL_FOG_COORDINATE_ARRAY_TYPE = 0x8454;
	public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;
	public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;
	public static final int GL_FOG_COORDINATE_ARRAY = 0x8457;
	public static final int GL_COLOR_SUM = 0x8458;
	public static final int GL_CURRENT_SECONDARY_COLOR = 0x8459;
	public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = 0x845A;
	public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = 0x845B;
	public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;
	public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;
	public static final int GL_SECONDARY_COLOR_ARRAY = 0x845E;
	public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
	public static final int GL_TEXTURE_FILTER_CONTROL = 0x8500;
	public static final int GL_TEXTURE_LOD_BIAS = 0x8501;
	public static final int GL_INCR_WRAP = 0x8507;
	public static final int GL_DECR_WRAP = 0x8508;
	public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;
	public static final int GL_DEPTH_TEXTURE_MODE = 0x884B;
	public static final int GL_TEXTURE_COMPARE_MODE = 0x884C;
	public static final int GL_TEXTURE_COMPARE_FUNC = 0x884D;
	public static final int GL_COMPARE_R_TO_TEXTURE = 0x884E;
	public static final int GL_VERSION_1_5 = 1;
	public static final int GL_FOG_COORD_SRC = GL_FOG_COORDINATE_SOURCE;
	public static final int GL_FOG_COORD = GL_FOG_COORDINATE;
	public static final int GL_FOG_COORD_ARRAY = GL_FOG_COORDINATE_ARRAY;
	public static final int GL_SRC0_RGB = GL_SOURCE0_RGB;
	public static final int GL_FOG_COORD_ARRAY_POINTER = GL_FOG_COORDINATE_ARRAY_POINTER;
	public static final int GL_FOG_COORD_ARRAY_TYPE = GL_FOG_COORDINATE_ARRAY_TYPE;
	public static final int GL_SRC1_ALPHA = GL_SOURCE1_ALPHA;
	public static final int GL_CURRENT_FOG_COORD = GL_CURRENT_FOG_COORDINATE;
	public static final int GL_FOG_COORD_ARRAY_STRIDE = GL_FOG_COORDINATE_ARRAY_STRIDE;
	public static final int GL_SRC0_ALPHA = GL_SOURCE0_ALPHA;
	public static final int GL_SRC1_RGB = GL_SOURCE1_RGB;
	public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 0x889D;
	public static final int GL_SRC2_ALPHA = GL_SOURCE2_ALPHA;
	public static final int GL_SRC2_RGB = GL_SOURCE2_RGB;
	public static final int GL_BUFFER_SIZE = 0x8764;
	public static final int GL_BUFFER_USAGE = 0x8765;
	public static final int GL_QUERY_COUNTER_BITS = 0x8864;
	public static final int GL_CURRENT_QUERY = 0x8865;
	public static final int GL_QUERY_RESULT = 0x8866;
	public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;
	public static final int GL_ARRAY_BUFFER = 0x8892;
	public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;
	public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;
	public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
	public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = 0x8896;
	public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = 0x8897;
	public static final int GL_COLOR_ARRAY_BUFFER_BINDING = 0x8898;
	public static final int GL_INDEX_ARRAY_BUFFER_BINDING = 0x8899;
	public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 0x889A;
	public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 0x889B;
	public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C;
	public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING;
	public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = 0x889E;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
	public static final int GL_READ_ONLY = 0x88B8;
	public static final int GL_WRITE_ONLY = 0x88B9;
	public static final int GL_READ_WRITE = 0x88BA;
	public static final int GL_BUFFER_ACCESS = 0x88BB;
	public static final int GL_BUFFER_MAPPED = 0x88BC;
	public static final int GL_BUFFER_MAP_POINTER = 0x88BD;
	public static final int GL_STREAM_DRAW = 0x88E0;
	public static final int GL_STREAM_READ = 0x88E1;
	public static final int GL_STREAM_COPY = 0x88E2;
	public static final int GL_STATIC_DRAW = 0x88E4;
	public static final int GL_STATIC_READ = 0x88E5;
	public static final int GL_STATIC_COPY = 0x88E6;
	public static final int GL_DYNAMIC_DRAW = 0x88E8;
	public static final int GL_DYNAMIC_READ = 0x88E9;
	public static final int GL_DYNAMIC_COPY = 0x88EA;
	public static final int GL_SAMPLES_PASSED = 0x8914;
	public static final int GL_VERSION_2_0 = 1;
	public static final int GL_BLEND_EQUATION = 0x8009;
	public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
	public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
	public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
	public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
	public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;
	public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
	public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 0x8643;
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
	public static final int GL_STENCIL_BACK_FUNC = 0x8800;
	public static final int GL_STENCIL_BACK_FAIL = 0x8801;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
	public static final int GL_MAX_DRAW_BUFFERS = 0x8824;
	public static final int GL_DRAW_BUFFER0 = 0x8825;
	public static final int GL_DRAW_BUFFER1 = 0x8826;
	public static final int GL_DRAW_BUFFER2 = 0x8827;
	public static final int GL_DRAW_BUFFER3 = 0x8828;
	public static final int GL_DRAW_BUFFER4 = 0x8829;
	public static final int GL_DRAW_BUFFER5 = 0x882A;
	public static final int GL_DRAW_BUFFER6 = 0x882B;
	public static final int GL_DRAW_BUFFER7 = 0x882C;
	public static final int GL_DRAW_BUFFER8 = 0x882D;
	public static final int GL_DRAW_BUFFER9 = 0x882E;
	public static final int GL_DRAW_BUFFER10 = 0x882F;
	public static final int GL_DRAW_BUFFER11 = 0x8830;
	public static final int GL_DRAW_BUFFER12 = 0x8831;
	public static final int GL_DRAW_BUFFER13 = 0x8832;
	public static final int GL_DRAW_BUFFER14 = 0x8833;
	public static final int GL_DRAW_BUFFER15 = 0x8834;
	public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;
	public static final int GL_POINT_SPRITE = 0x8861;
	public static final int GL_COORD_REPLACE = 0x8862;
	public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;
	public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
	public static final int GL_MAX_TEXTURE_COORDS = 0x8871;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;
	public static final int GL_FRAGMENT_SHADER = 0x8B30;
	public static final int GL_VERTEX_SHADER = 0x8B31;
	public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
	public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
	public static final int GL_MAX_VARYING_FLOATS = 0x8B4B;
	public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
	public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
	public static final int GL_SHADER_TYPE = 0x8B4F;
	public static final int GL_FLOAT_VEC2 = 0x8B50;
	public static final int GL_FLOAT_VEC3 = 0x8B51;
	public static final int GL_FLOAT_VEC4 = 0x8B52;
	public static final int GL_INT_VEC2 = 0x8B53;
	public static final int GL_INT_VEC3 = 0x8B54;
	public static final int GL_INT_VEC4 = 0x8B55;
	public static final int GL_BOOL = 0x8B56;
	public static final int GL_BOOL_VEC2 = 0x8B57;
	public static final int GL_BOOL_VEC3 = 0x8B58;
	public static final int GL_BOOL_VEC4 = 0x8B59;
	public static final int GL_FLOAT_MAT2 = 0x8B5A;
	public static final int GL_FLOAT_MAT3 = 0x8B5B;
	public static final int GL_FLOAT_MAT4 = 0x8B5C;
	public static final int GL_SAMPLER_1D = 0x8B5D;
	public static final int GL_SAMPLER_2D = 0x8B5E;
	public static final int GL_SAMPLER_3D = 0x8B5F;
	public static final int GL_SAMPLER_CUBE = 0x8B60;
	public static final int GL_SAMPLER_1D_SHADOW = 0x8B61;
	public static final int GL_SAMPLER_2D_SHADOW = 0x8B62;
	public static final int GL_DELETE_STATUS = 0x8B80;
	public static final int GL_COMPILE_STATUS = 0x8B81;
	public static final int GL_LINK_STATUS = 0x8B82;
	public static final int GL_VALIDATE_STATUS = 0x8B83;
	public static final int GL_INFO_LOG_LENGTH = 0x8B84;
	public static final int GL_ATTACHED_SHADERS = 0x8B85;
	public static final int GL_ACTIVE_UNIFORMS = 0x8B86;
	public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
	public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;
	public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;
	public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
	public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
	public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
	public static final int GL_CURRENT_PROGRAM = 0x8B8D;
	public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
	public static final int GL_LOWER_LEFT = 0x8CA1;
	public static final int GL_UPPER_LEFT = 0x8CA2;
	public static final int GL_STENCIL_BACK_REF = 0x8CA3;
	public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;
	public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;
	public static final int GL_VERSION_2_1 = 1;
	public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 0x845F;
	public static final int GL_PIXEL_PACK_BUFFER = 0x88EB;
	public static final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
	public static final int GL_FLOAT_MAT2x3 = 0x8B65;
	public static final int GL_FLOAT_MAT2x4 = 0x8B66;
	public static final int GL_FLOAT_MAT3x2 = 0x8B67;
	public static final int GL_FLOAT_MAT3x4 = 0x8B68;
	public static final int GL_FLOAT_MAT4x2 = 0x8B69;
	public static final int GL_FLOAT_MAT4x3 = 0x8B6A;
	public static final int GL_SRGB = 0x8C40;
	public static final int GL_SRGB8 = 0x8C41;
	public static final int GL_SRGB_ALPHA = 0x8C42;
	public static final int GL_SRGB8_ALPHA8 = 0x8C43;
	public static final int GL_SLUMINANCE_ALPHA = 0x8C44;
	public static final int GL_SLUMINANCE8_ALPHA8 = 0x8C45;
	public static final int GL_SLUMINANCE = 0x8C46;
	public static final int GL_SLUMINANCE8 = 0x8C47;
	public static final int GL_COMPRESSED_SRGB = 0x8C48;
	public static final int GL_COMPRESSED_SRGB_ALPHA = 0x8C49;
	public static final int GL_COMPRESSED_SLUMINANCE = 0x8C4A;
	public static final int GL_COMPRESSED_SLUMINANCE_ALPHA = 0x8C4B;
	public static final int GL_VERSION_3_0 = 1;
	public static final int GL_MAX_CLIP_DISTANCES = GL_MAX_CLIP_PLANES;
	public static final int GL_CLIP_DISTANCE5 = GL_CLIP_PLANE5;
	public static final int GL_CLIP_DISTANCE1 = GL_CLIP_PLANE1;
	public static final int GL_CLIP_DISTANCE3 = GL_CLIP_PLANE3;
	public static final int GL_COMPARE_R_TO_TEXTURE_ARB = 0x884E;
	public static final int GL_CLIP_DISTANCE0 = GL_CLIP_PLANE0;
	public static final int GL_CLIP_DISTANCE4 = GL_CLIP_PLANE4;
	public static final int GL_CLIP_DISTANCE2 = GL_CLIP_PLANE2;
	public static final int GL_MAX_VARYING_COMPONENTS = GL_MAX_VARYING_FLOATS;
	public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x0001;
	public static final int GL_MAJOR_VERSION = 0x821B;
	public static final int GL_MINOR_VERSION = 0x821C;
	public static final int GL_NUM_EXTENSIONS = 0x821D;
	public static final int GL_CONTEXT_FLAGS = 0x821E;
	public static final int GL_DEPTH_BUFFER = 0x8223;
	public static final int GL_STENCIL_BUFFER = 0x8224;
	public static final int GL_COMPRESSED_RED = 0x8225;
	public static final int GL_COMPRESSED_RG = 0x8226;
	public static final int GL_RGBA32F = 0x8814;
	public static final int GL_RGB32F = 0x8815;
	public static final int GL_RGBA16F = 0x881A;
	public static final int GL_RGB16F = 0x881B;
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
	public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
	public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
	public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
	public static final int GL_CLAMP_VERTEX_COLOR = 0x891A;
	public static final int GL_CLAMP_FRAGMENT_COLOR = 0x891B;
	public static final int GL_CLAMP_READ_COLOR = 0x891C;
	public static final int GL_FIXED_ONLY = 0x891D;
	public static final int GL_TEXTURE_RED_TYPE = 0x8C10;
	public static final int GL_TEXTURE_GREEN_TYPE = 0x8C11;
	public static final int GL_TEXTURE_BLUE_TYPE = 0x8C12;
	public static final int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
	public static final int GL_TEXTURE_LUMINANCE_TYPE = 0x8C14;
	public static final int GL_TEXTURE_INTENSITY_TYPE = 0x8C15;
	public static final int GL_TEXTURE_DEPTH_TYPE = 0x8C16;
	public static final int GL_TEXTURE_1D_ARRAY = 0x8C18;
	public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;
	public static final int GL_TEXTURE_2D_ARRAY = 0x8C1A;
	public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
	public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
	public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
	public static final int GL_R11F_G11F_B10F = 0x8C3A;
	public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
	public static final int GL_RGB9_E5 = 0x8C3D;
	public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
	public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;
	public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
	public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
	public static final int GL_PRIMITIVES_GENERATED = 0x8C87;
	public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
	public static final int GL_RASTERIZER_DISCARD = 0x8C89;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
	public static final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
	public static final int GL_SEPARATE_ATTRIBS = 0x8C8D;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
	public static final int GL_RGBA32UI = 0x8D70;
	public static final int GL_RGB32UI = 0x8D71;
	public static final int GL_RGBA16UI = 0x8D76;
	public static final int GL_RGB16UI = 0x8D77;
	public static final int GL_RGBA8UI = 0x8D7C;
	public static final int GL_RGB8UI = 0x8D7D;
	public static final int GL_RGBA32I = 0x8D82;
	public static final int GL_RGB32I = 0x8D83;
	public static final int GL_RGBA16I = 0x8D88;
	public static final int GL_RGB16I = 0x8D89;
	public static final int GL_RGBA8I = 0x8D8E;
	public static final int GL_RGB8I = 0x8D8F;
	public static final int GL_RED_INTEGER = 0x8D94;
	public static final int GL_GREEN_INTEGER = 0x8D95;
	public static final int GL_BLUE_INTEGER = 0x8D96;
	public static final int GL_ALPHA_INTEGER = 0x8D97;
	public static final int GL_RGB_INTEGER = 0x8D98;
	public static final int GL_RGBA_INTEGER = 0x8D99;
	public static final int GL_BGR_INTEGER = 0x8D9A;
	public static final int GL_BGRA_INTEGER = 0x8D9B;
	public static final int GL_SAMPLER_1D_ARRAY = 0x8DC0;
	public static final int GL_SAMPLER_2D_ARRAY = 0x8DC1;
	public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
	public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
	public static final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
	public static final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
	public static final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
	public static final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
	public static final int GL_INT_SAMPLER_1D = 0x8DC9;
	public static final int GL_INT_SAMPLER_2D = 0x8DCA;
	public static final int GL_INT_SAMPLER_3D = 0x8DCB;
	public static final int GL_INT_SAMPLER_CUBE = 0x8DCC;
	public static final int GL_INT_SAMPLER_1D_ARRAY = 0x8DCE;
	public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
	public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
	public static final int GL_QUERY_WAIT = 0x8E13;
	public static final int GL_QUERY_NO_WAIT = 0x8E14;
	public static final int GL_QUERY_BY_REGION_WAIT = 0x8E15;
	public static final int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;
	public static final int GL_VERSION_3_1 = 1;
	public static final int GL_TEXTURE_RECTANGLE = 0x84F5;
	public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;
	public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
	public static final int GL_SAMPLER_2D_RECT = 0x8B63;
	public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;
	public static final int GL_TEXTURE_BUFFER = 0x8C2A;
	public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
	public static final int GL_TEXTURE_BINDING_BUFFER = 0x8C2C;
	public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
	public static final int GL_TEXTURE_BUFFER_FORMAT = 0x8C2E;
	public static final int GL_SAMPLER_BUFFER = 0x8DC2;
	public static final int GL_INT_SAMPLER_2D_RECT = 0x8DCD;
	public static final int GL_INT_SAMPLER_BUFFER = 0x8DD0;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
	public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
	public static final int GL_RED_SNORM = 0x8F90;
	public static final int GL_RG_SNORM = 0x8F91;
	public static final int GL_RGB_SNORM = 0x8F92;
	public static final int GL_RGBA_SNORM = 0x8F93;
	public static final int GL_R8_SNORM = 0x8F94;
	public static final int GL_RG8_SNORM = 0x8F95;
	public static final int GL_RGB8_SNORM = 0x8F96;
	public static final int GL_RGBA8_SNORM = 0x8F97;
	public static final int GL_R16_SNORM = 0x8F98;
	public static final int GL_RG16_SNORM = 0x8F99;
	public static final int GL_RGB16_SNORM = 0x8F9A;
	public static final int GL_RGBA16_SNORM = 0x8F9B;
	public static final int GL_SIGNED_NORMALIZED = 0x8F9C;
	public static final int GL_PRIMITIVE_RESTART = 0x8F9D;
	public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;
	public static final int GL_BUFFER_ACCESS_FLAGS = 0x911F;
	public static final int GL_BUFFER_MAP_LENGTH = 0x9120;
	public static final int GL_BUFFER_MAP_OFFSET = 0x9121;
	public static final int GL_VERSION_3_2 = 1;
	public static final int GL_CONTEXT_CORE_PROFILE_BIT = 0x00000001;
	public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
	public static final int GL_LINES_ADJACENCY = 0x000A;
	public static final int GL_LINE_STRIP_ADJACENCY = 0x000B;
	public static final int GL_TRIANGLES_ADJACENCY = 0x000C;
	public static final int GL_TRIANGLE_STRIP_ADJACENCY = 0x000D;
	public static final int GL_PROGRAM_POINT_SIZE = 0x8642;
	public static final int GL_GEOMETRY_VERTICES_OUT = 0x8916;
	public static final int GL_GEOMETRY_INPUT_TYPE = 0x8917;
	public static final int GL_GEOMETRY_OUTPUT_TYPE = 0x8918;
	public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
	public static final int GL_GEOMETRY_SHADER = 0x8DD9;
	public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
	public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
	public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
	public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
	public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
	public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
	public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
	public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;
	public static final int GL_VERSION_3_3 = 1;
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;
	public static final int GL_TEXTURE_SWIZZLE_R = 0x8E42;
	public static final int GL_TEXTURE_SWIZZLE_G = 0x8E43;
	public static final int GL_TEXTURE_SWIZZLE_B = 0x8E44;
	public static final int GL_TEXTURE_SWIZZLE_A = 0x8E45;
	public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;
	public static final int GL_RGB10_A2UI = 0x906F;
	public static final int GL_VERSION_4_0 = 1;
	public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;
	public static final int GL_SAMPLE_SHADING = 0x8C36;
	public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;
	public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 0x8E5A;
	public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5B;
	public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5C;
	public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;
	public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E;
	public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;
	public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS = 0x8F9F;
	public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY = 0x900C;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 0x900D;
	public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900E;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;
	public static final int GL_VERSION_4_1 = 1;
	public static final int GL_VERSION_4_2 = 1;
	public static final int GL_COMPRESSED_RGBA_BPTC_UNORM = 0x8E8C;
	public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 0x8E8D;
	public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 0x8E8E;
	public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;
	public static final int GL_VERSION_4_3 = 1;
	public static final int GL_NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;
	public static final int GL_VERTEX_ATTRIB_ARRAY_LONG = 0x874E;
	public static final int GL_3DFX_multisample = 1;
	public static final int GL_MULTISAMPLE_3DFX = 0x86B2;
	public static final int GL_SAMPLE_BUFFERS_3DFX = 0x86B3;
	public static final int GL_SAMPLES_3DFX = 0x86B4;
	public static final int GL_MULTISAMPLE_BIT_3DFX = 0x20000000;
	public static final int GL_3DFX_tbuffer = 1;
	public static final int GL_3DFX_texture_compression_FXT1 = 1;
	public static final int GL_COMPRESSED_RGB_FXT1_3DFX = 0x86B0;
	public static final int GL_COMPRESSED_RGBA_FXT1_3DFX = 0x86B1;
	public static final int GL_AMD_blend_minmax_factor = 1;
	public static final int GL_FACTOR_MIN_AMD = 0x901C;
	public static final int GL_FACTOR_MAX_AMD = 0x901D;
	public static final int GL_AMD_conservative_depth = 1;
	public static final int GL_AMD_debug_output = 1;
	public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_AMD = 0x9143;
	public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_AMD = 0x9144;
	public static final int GL_DEBUG_LOGGED_MESSAGES_AMD = 0x9145;
	public static final int GL_DEBUG_SEVERITY_HIGH_AMD = 0x9146;
	public static final int GL_DEBUG_SEVERITY_MEDIUM_AMD = 0x9147;
	public static final int GL_DEBUG_SEVERITY_LOW_AMD = 0x9148;
	public static final int GL_DEBUG_CATEGORY_API_ERROR_AMD = 0x9149;
	public static final int GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD = 0x914A;
	public static final int GL_DEBUG_CATEGORY_DEPRECATION_AMD = 0x914B;
	public static final int GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD = 0x914C;
	public static final int GL_DEBUG_CATEGORY_PERFORMANCE_AMD = 0x914D;
	public static final int GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD = 0x914E;
	public static final int GL_DEBUG_CATEGORY_APPLICATION_AMD = 0x914F;
	public static final int GL_DEBUG_CATEGORY_OTHER_AMD = 0x9150;
	public static final int GL_AMD_depth_clamp_separate = 1;
	public static final int GL_DEPTH_CLAMP_NEAR_AMD = 0x901E;
	public static final int GL_DEPTH_CLAMP_FAR_AMD = 0x901F;
	public static final int GL_AMD_draw_buffers_blend = 1;
	public static final int GL_AMD_multi_draw_indirect = 1;
	public static final int GL_AMD_name_gen_delete = 1;
	public static final int GL_DATA_BUFFER_AMD = 0x9151;
	public static final int GL_PERFORMANCE_MONITOR_AMD = 0x9152;
	public static final int GL_QUERY_OBJECT_AMD = 0x9153;
	public static final int GL_VERTEX_ARRAY_OBJECT_AMD = 0x9154;
	public static final int GL_SAMPLER_OBJECT_AMD = 0x9155;
	public static final int GL_AMD_performance_monitor = 1;
	public static final int GL_COUNTER_TYPE_AMD = 0x8BC0;
	public static final int GL_COUNTER_RANGE_AMD = 0x8BC1;
	public static final int GL_UNSIGNED_INT64_AMD = 0x8BC2;
	public static final int GL_PERCENTAGE_AMD = 0x8BC3;
	public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4;
	public static final int GL_PERFMON_RESULT_SIZE_AMD = 0x8BC5;
	public static final int GL_PERFMON_RESULT_AMD = 0x8BC6;
	public static final int GL_AMD_pinned_memory = 1;
	public static final int GL_EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD = 0x9160;
	public static final int GL_AMD_query_buffer_object = 1;
	public static final int GL_QUERY_BUFFER_AMD = 0x9192;
	public static final int GL_QUERY_BUFFER_BINDING_AMD = 0x9193;
	public static final int GL_QUERY_RESULT_NO_WAIT_AMD = 0x9194;
	public static final int GL_AMD_sample_positions = 1;
	public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
	public static final int GL_AMD_seamless_cubemap_per_texture = 1;
	public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS_ARB = 0x884F;
	public static final int GL_AMD_shader_stencil_export = 1;
	public static final int GL_AMD_stencil_operation_extended = 1;
	public static final int GL_SET_AMD = 0x874A;
	public static final int GL_REPLACE_VALUE_AMD = 0x874B;
	public static final int GL_STENCIL_OP_VALUE_AMD = 0x874C;
	public static final int GL_STENCIL_BACK_OP_VALUE_AMD = 0x874D;
	public static final int GL_AMD_texture_texture4 = 1;
	public static final int GL_AMD_transform_feedback3_lines_triangles = 1;
	public static final int GL_AMD_vertex_shader_layer = 1;
	public static final int GL_AMD_vertex_shader_tessellator = 1;
	public static final int GL_SAMPLER_BUFFER_AMD = 0x9001;
	public static final int GL_INT_SAMPLER_BUFFER_AMD = 0x9002;
	public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 0x9003;
	public static final int GL_TESSELLATION_MODE_AMD = 0x9004;
	public static final int GL_TESSELLATION_FACTOR_AMD = 0x9005;
	public static final int GL_DISCRETE_AMD = 0x9006;
	public static final int GL_CONTINUOUS_AMD = 0x9007;
	public static final int GL_AMD_vertex_shader_viewport_index = 1;
	public static final int GL_APPLE_aux_depth_stencil = 1;
	public static final int GL_AUX_DEPTH_STENCIL_APPLE = 0x8A14;
	public static final int GL_APPLE_client_storage = 1;
	public static final int GL_UNPACK_CLIENT_STORAGE_APPLE = 0x85B2;
	public static final int GL_APPLE_element_array = 1;
	public static final int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;
	public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;
	public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;
	public static final int GL_APPLE_fence = 1;
	public static final int GL_DRAW_PIXELS_APPLE = 0x8A0A;
	public static final int GL_FENCE_APPLE = 0x8A0B;
	public static final int GL_APPLE_float_pixels = 1;
	public static final int GL_HALF_APPLE = 0x140B;
	public static final int GL_RGBA_FLOAT32_APPLE = 0x8814;
	public static final int GL_RGB_FLOAT32_APPLE = 0x8815;
	public static final int GL_ALPHA_FLOAT32_APPLE = 0x8816;
	public static final int GL_INTENSITY_FLOAT32_APPLE = 0x8817;
	public static final int GL_LUMINANCE_FLOAT32_APPLE = 0x8818;
	public static final int GL_LUMINANCE_ALPHA_FLOAT32_APPLE = 0x8819;
	public static final int GL_RGBA_FLOAT16_APPLE = 0x881A;
	public static final int GL_RGB_FLOAT16_APPLE = 0x881B;
	public static final int GL_ALPHA_FLOAT16_APPLE = 0x881C;
	public static final int GL_INTENSITY_FLOAT16_APPLE = 0x881D;
	public static final int GL_LUMINANCE_FLOAT16_APPLE = 0x881E;
	public static final int GL_LUMINANCE_ALPHA_FLOAT16_APPLE = 0x881F;
	public static final int GL_COLOR_FLOAT_APPLE = 0x8A0F;
	public static final int GL_APPLE_flush_buffer_range = 1;
	public static final int GL_BUFFER_SERIALIZED_MODIFY_APPLE = 0x8A12;
	public static final int GL_BUFFER_FLUSHING_UNMAP_APPLE = 0x8A13;
	public static final int GL_APPLE_object_purgeable = 1;
	public static final int GL_BUFFER_OBJECT_APPLE = 0x85B3;
	public static final int GL_RELEASED_APPLE = 0x8A19;
	public static final int GL_VOLATILE_APPLE = 0x8A1A;
	public static final int GL_RETAINED_APPLE = 0x8A1B;
	public static final int GL_UNDEFINED_APPLE = 0x8A1C;
	public static final int GL_PURGEABLE_APPLE = 0x8A1D;
	public static final int GL_APPLE_pixel_buffer = 1;
	public static final int GL_MIN_PBUFFER_VIEWPORT_DIMS_APPLE = 0x8A10;
	public static final int GL_APPLE_rgb_422 = 1;
	public static final int GL_UNSIGNED_SHORT_8_8_APPLE = 0x85BA;
	public static final int GL_UNSIGNED_SHORT_8_8_REV_APPLE = 0x85BB;
	public static final int GL_RGB_422_APPLE = 0x8A1F;
	public static final int GL_APPLE_row_bytes = 1;
	public static final int GL_PACK_ROW_BYTES_APPLE = 0x8A15;
	public static final int GL_UNPACK_ROW_BYTES_APPLE = 0x8A16;
	public static final int GL_APPLE_specular_vector = 1;
	public static final int GL_LIGHT_MODEL_SPECULAR_VECTOR_APPLE = 0x85B0;
	public static final int GL_APPLE_texture_range = 1;
	public static final int GL_TEXTURE_RANGE_LENGTH_APPLE = 0x85B7;
	public static final int GL_TEXTURE_RANGE_POINTER_APPLE = 0x85B8;
	public static final int GL_TEXTURE_STORAGE_HINT_APPLE = 0x85BC;
	public static final int GL_STORAGE_PRIVATE_APPLE = 0x85BD;
	public static final int GL_STORAGE_CACHED_APPLE = 0x85BE;
	public static final int GL_STORAGE_SHARED_APPLE = 0x85BF;
	public static final int GL_APPLE_transform_hint = 1;
	public static final int GL_TRANSFORM_HINT_APPLE = 0x85B1;
	public static final int GL_APPLE_vertex_array_object = 1;
	public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;
	public static final int GL_APPLE_vertex_array_range = 1;
	public static final int GL_VERTEX_ARRAY_RANGE_APPLE = 0x851D;
	public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE = 0x851E;
	public static final int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = 0x851F;
	public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_APPLE = 0x8520;
	public static final int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = 0x8521;
	public static final int GL_STORAGE_CLIENT_APPLE = 0x85B4;
	public static final int GL_APPLE_vertex_program_evaluators = 1;
	public static final int GL_VERTEX_ATTRIB_MAP1_APPLE = 0x8A00;
	public static final int GL_VERTEX_ATTRIB_MAP2_APPLE = 0x8A01;
	public static final int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = 0x8A02;
	public static final int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = 0x8A03;
	public static final int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = 0x8A04;
	public static final int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 0x8A05;
	public static final int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = 0x8A06;
	public static final int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = 0x8A07;
	public static final int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = 0x8A08;
	public static final int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 0x8A09;
	public static final int GL_APPLE_ycbcr_422 = 1;
	public static final int GL_YCBCR_422_APPLE = 0x85B9;
	public static final int GL_ARB_ES2_compatibility = 1;
	public static final int GL_FIXED = 0x140C;
	public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
	public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
	public static final int GL_RGB565 = 0x8D62;
	public static final int GL_LOW_FLOAT = 0x8DF0;
	public static final int GL_MEDIUM_FLOAT = 0x8DF1;
	public static final int GL_HIGH_FLOAT = 0x8DF2;
	public static final int GL_LOW_INT = 0x8DF3;
	public static final int GL_MEDIUM_INT = 0x8DF4;
	public static final int GL_HIGH_INT = 0x8DF5;
	public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;
	public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;
	public static final int GL_SHADER_COMPILER = 0x8DFA;
	public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
	public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;
	public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
	public static final int GL_ARB_ES3_compatibility = 1;
	public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;
	public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
	public static final int GL_MAX_ELEMENT_INDEX = 0x8D6B;
	public static final int GL_COMPRESSED_R11_EAC = 0x9270;
	public static final int GL_COMPRESSED_SIGNED_R11_EAC = 0x9271;
	public static final int GL_COMPRESSED_RG11_EAC = 0x9272;
	public static final int GL_COMPRESSED_SIGNED_RG11_EAC = 0x9273;
	public static final int GL_COMPRESSED_RGB8_ETC2 = 0x9274;
	public static final int GL_COMPRESSED_SRGB8_ETC2 = 0x9275;
	public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
	public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
	public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = 0x9278;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
	public static final int GL_ARB_arrays_of_arrays = 1;
	public static final int GL_ARB_base_instance = 1;
	public static final int GL_ARB_blend_func_extended = 1;
	public static final int GL_SRC1_COLOR = 0x88F9;
	public static final int GL_ONE_MINUS_SRC1_COLOR = 0x88FA;
	public static final int GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;
	public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
	public static final int GL_ARB_cl_event = 1;
	public static final int GL_SYNC_CL_EVENT_ARB = 0x8240;
	public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 0x8241;
	public static final int GL_ARB_clear_buffer_object = 1;
	public static final int GL_ARB_color_buffer_float = 1;
	public static final int GL_RGBA_FLOAT_MODE_ARB = 0x8820;
	public static final int GL_CLAMP_VERTEX_COLOR_ARB = 0x891A;
	public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = 0x891B;
	public static final int GL_CLAMP_READ_COLOR_ARB = 0x891C;
	public static final int GL_FIXED_ONLY_ARB = 0x891D;
	public static final int GL_ARB_compatibility = 1;
	public static final int GL_ARB_compressed_texture_pixel_storage = 1;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_WIDTH = 0x9127;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_DEPTH = 0x9129;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_SIZE = 0x912A;
	public static final int GL_PACK_COMPRESSED_BLOCK_WIDTH = 0x912B;
	public static final int GL_PACK_COMPRESSED_BLOCK_HEIGHT = 0x912C;
	public static final int GL_PACK_COMPRESSED_BLOCK_DEPTH = 0x912D;
	public static final int GL_PACK_COMPRESSED_BLOCK_SIZE = 0x912E;
	public static final int GL_ARB_compute_shader = 1;
	public static final int GL_COMPUTE_SHADER_BIT = 0x00000020;
	public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 0x8262;
	public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
	public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
	public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 0x8265;
	public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
	public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;
	public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;
	public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
	public static final int GL_COMPUTE_SHADER = 0x91B9;
	public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 0x91BB;
	public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
	public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 0x91BD;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 0x91BF;
	public static final int GL_ARB_conservative_depth = 1;
	public static final int GL_ARB_copy_buffer = 1;
	public static final int GL_COPY_READ_BUFFER = 0x8F36;
	public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
	public static final int GL_ARB_copy_image = 1;
	public static final int GL_ARB_debug_output = 1;
	public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 0x8242;
	public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 0x8243;
	public static final int GL_DEBUG_CALLBACK_FUNCTION_ARB = 0x8244;
	public static final int GL_DEBUG_CALLBACK_USER_PARAM_ARB = 0x8245;
	public static final int GL_DEBUG_SOURCE_API_ARB = 0x8246;
	public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB = 0x8247;
	public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 0x8248;
	public static final int GL_DEBUG_SOURCE_THIRD_PARTY_ARB = 0x8249;
	public static final int GL_DEBUG_SOURCE_APPLICATION_ARB = 0x824A;
	public static final int GL_DEBUG_SOURCE_OTHER_ARB = 0x824B;
	public static final int GL_DEBUG_TYPE_ERROR_ARB = 0x824C;
	public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 0x824D;
	public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB = 0x824E;
	public static final int GL_DEBUG_TYPE_PORTABILITY_ARB = 0x824F;
	public static final int GL_DEBUG_TYPE_PERFORMANCE_ARB = 0x8250;
	public static final int GL_DEBUG_TYPE_OTHER_ARB = 0x8251;
	public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_ARB = 0x9143;
	public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_ARB = 0x9144;
	public static final int GL_DEBUG_LOGGED_MESSAGES_ARB = 0x9145;
	public static final int GL_DEBUG_SEVERITY_HIGH_ARB = 0x9146;
	public static final int GL_DEBUG_SEVERITY_MEDIUM_ARB = 0x9147;
	public static final int GL_DEBUG_SEVERITY_LOW_ARB = 0x9148;
	public static final int GL_ARB_depth_buffer_float = 1;
	public static final int GL_DEPTH_COMPONENT32F = 0x8CAC;
	public static final int GL_DEPTH32F_STENCIL8 = 0x8CAD;
	public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
	public static final int GL_ARB_depth_clamp = 1;
	public static final int GL_DEPTH_CLAMP = 0x864F;
	public static final int GL_ARB_depth_texture = 1;
	public static final int GL_DEPTH_COMPONENT16_ARB = 0x81A5;
	public static final int GL_DEPTH_COMPONENT24_ARB = 0x81A6;
	public static final int GL_DEPTH_COMPONENT32_ARB = 0x81A7;
	public static final int GL_TEXTURE_DEPTH_SIZE_ARB = 0x884A;
	public static final int GL_DEPTH_TEXTURE_MODE_ARB = 0x884B;
	public static final int GL_ARB_draw_buffers = 1;
	public static final int GL_MAX_DRAW_BUFFERS_ARB = 0x8824;
	public static final int GL_DRAW_BUFFER0_ARB = 0x8825;
	public static final int GL_DRAW_BUFFER1_ARB = 0x8826;
	public static final int GL_DRAW_BUFFER2_ARB = 0x8827;
	public static final int GL_DRAW_BUFFER3_ARB = 0x8828;
	public static final int GL_DRAW_BUFFER4_ARB = 0x8829;
	public static final int GL_DRAW_BUFFER5_ARB = 0x882A;
	public static final int GL_DRAW_BUFFER6_ARB = 0x882B;
	public static final int GL_DRAW_BUFFER7_ARB = 0x882C;
	public static final int GL_DRAW_BUFFER8_ARB = 0x882D;
	public static final int GL_DRAW_BUFFER9_ARB = 0x882E;
	public static final int GL_DRAW_BUFFER10_ARB = 0x882F;
	public static final int GL_DRAW_BUFFER11_ARB = 0x8830;
	public static final int GL_DRAW_BUFFER12_ARB = 0x8831;
	public static final int GL_DRAW_BUFFER13_ARB = 0x8832;
	public static final int GL_DRAW_BUFFER14_ARB = 0x8833;
	public static final int GL_DRAW_BUFFER15_ARB = 0x8834;
	public static final int GL_ARB_draw_buffers_blend = 1;
	public static final int GL_ARB_draw_elements_base_vertex = 1;
	public static final int GL_ARB_draw_indirect = 1;
	public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;
	public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
	public static final int GL_ARB_draw_instanced = 1;
	public static final int GL_ARB_explicit_attrib_location = 1;
	public static final int GL_ARB_explicit_uniform_location = 1;
	public static final int GL_MAX_UNIFORM_LOCATIONS = 0x826E;
	public static final int GL_ARB_fragment_coord_conventions = 1;
	public static final int GL_ARB_fragment_layer_viewport = 1;
	public static final int GL_ARB_fragment_program = 1;
	public static final int GL_FRAGMENT_PROGRAM_ARB = 0x8804;
	public static final int GL_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x8805;
	public static final int GL_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x8806;
	public static final int GL_PROGRAM_TEX_INDIRECTIONS_ARB = 0x8807;
	public static final int GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x8808;
	public static final int GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x8809;
	public static final int GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x880A;
	public static final int GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x880B;
	public static final int GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x880C;
	public static final int GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB = 0x880D;
	public static final int GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x880E;
	public static final int GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x880F;
	public static final int GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x8810;
	public static final int GL_MAX_TEXTURE_COORDS_ARB = 0x8871;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 0x8872;
	public static final int GL_ARB_fragment_program_shadow = 1;
	public static final int GL_ARB_fragment_shader = 1;
	public static final int GL_FRAGMENT_SHADER_ARB = 0x8B30;
	public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB = 0x8B49;
	public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB = 0x8B8B;
	public static final int GL_ARB_framebuffer_no_attachments = 1;
	public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
	public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
	public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
	public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
	public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
	public static final int GL_MAX_FRAMEBUFFER_WIDTH = 0x9315;
	public static final int GL_MAX_FRAMEBUFFER_HEIGHT = 0x9316;
	public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;
	public static final int GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;
	public static final int GL_ARB_framebuffer_object = 1;
	public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
	public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
	public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
	public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
	public static final int GL_INDEX = 0x8222;
	public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;
	public static final int GL_DEPTH_STENCIL = 0x84F9;
	public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;
	public static final int GL_DEPTH24_STENCIL8 = 0x88F0;
	public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
	public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;
	public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
	public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
	public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
	public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
	public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;
	public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
	public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
	public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
	public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
	public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
	public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
	public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
	public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
	public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
	public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
	public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
	public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
	public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
	public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
	public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
	public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
	public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
	public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
	public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
	public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
	public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
	public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
	public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
	public static final int GL_FRAMEBUFFER = 0x8D40;
	public static final int GL_RENDERBUFFER = 0x8D41;
	public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
	public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
	public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
	public static final int GL_STENCIL_INDEX1 = 0x8D46;
	public static final int GL_STENCIL_INDEX4 = 0x8D47;
	public static final int GL_STENCIL_INDEX8 = 0x8D48;
	public static final int GL_STENCIL_INDEX16 = 0x8D49;
	public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
	public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
	public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
	public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
	public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
	public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
	public static final int GL_MAX_SAMPLES = 0x8D57;
	public static final int GL_ARB_framebuffer_sRGB = 1;
	public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;
	public static final int GL_ARB_geometry_shader4 = 1;
	public static final int GL_LINES_ADJACENCY_ARB = 0xA;
	public static final int GL_LINE_STRIP_ADJACENCY_ARB = 0xB;
	public static final int GL_TRIANGLES_ADJACENCY_ARB = 0xC;
	public static final int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 0xD;
	public static final int GL_PROGRAM_POINT_SIZE_ARB = 0x8642;
	public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 0x8C29;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 0x8DA7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 0x8DA8;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 0x8DA9;
	public static final int GL_GEOMETRY_SHADER_ARB = 0x8DD9;
	public static final int GL_GEOMETRY_VERTICES_OUT_ARB = 0x8DDA;
	public static final int GL_GEOMETRY_INPUT_TYPE_ARB = 0x8DDB;
	public static final int GL_GEOMETRY_OUTPUT_TYPE_ARB = 0x8DDC;
	public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 0x8DDD;
	public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 0x8DDE;
	public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 0x8DDF;
	public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 0x8DE0;
	public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 0x8DE1;
	public static final int GL_ARB_get_program_binary = 1;
	public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
	public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;
	public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
	public static final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
	public static final int GL_ARB_gpu_shader5 = 1;
	public static final int GL_MAX_VERTEX_STREAMS = 0x8E71;
	public static final int GL_ARB_gpu_shader_fp64 = 1;
	public static final int GL_DOUBLE_MAT2 = 0x8F46;
	public static final int GL_DOUBLE_MAT3 = 0x8F47;
	public static final int GL_DOUBLE_MAT4 = 0x8F48;
	public static final int GL_DOUBLE_MAT2x3 = 0x8F49;
	public static final int GL_DOUBLE_MAT2x4 = 0x8F4A;
	public static final int GL_DOUBLE_MAT3x2 = 0x8F4B;
	public static final int GL_DOUBLE_MAT3x4 = 0x8F4C;
	public static final int GL_DOUBLE_MAT4x2 = 0x8F4D;
	public static final int GL_DOUBLE_MAT4x3 = 0x8F4E;
	public static final int GL_DOUBLE_VEC2 = 0x8FFC;
	public static final int GL_DOUBLE_VEC3 = 0x8FFD;
	public static final int GL_DOUBLE_VEC4 = 0x8FFE;
	public static final int GL_ARB_half_float_pixel = 1;
	public static final int GL_HALF_FLOAT_ARB = 0x140B;
	public static final int GL_ARB_half_float_vertex = 1;
	public static final int GL_HALF_FLOAT = 0x140B;
	public static final int GL_ARB_imaging = 1;
	public static final int GL_CONSTANT_COLOR = 0x8001;
	public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
	public static final int GL_CONSTANT_ALPHA = 0x8003;
	public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
	public static final int GL_BLEND_COLOR = 0x8005;
	public static final int GL_FUNC_ADD = 0x8006;
	public static final int GL_MIN = 0x8007;
	public static final int GL_MAX = 0x8008;
	public static final int GL_BLEND_EQUATION_RGB = GL_BLEND_EQUATION;
	public static final int GL_FUNC_SUBTRACT = 0x800A;
	public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;
	public static final int GL_CONVOLUTION_1D = 0x8010;
	public static final int GL_CONVOLUTION_2D = 0x8011;
	public static final int GL_SEPARABLE_2D = 0x8012;
	public static final int GL_CONVOLUTION_BORDER_MODE = 0x8013;
	public static final int GL_CONVOLUTION_FILTER_SCALE = 0x8014;
	public static final int GL_CONVOLUTION_FILTER_BIAS = 0x8015;
	public static final int GL_REDUCE = 0x8016;
	public static final int GL_CONVOLUTION_FORMAT = 0x8017;
	public static final int GL_CONVOLUTION_WIDTH = 0x8018;
	public static final int GL_CONVOLUTION_HEIGHT = 0x8019;
	public static final int GL_MAX_CONVOLUTION_WIDTH = 0x801A;
	public static final int GL_MAX_CONVOLUTION_HEIGHT = 0x801B;
	public static final int GL_POST_CONVOLUTION_RED_SCALE = 0x801C;
	public static final int GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D;
	public static final int GL_POST_CONVOLUTION_BLUE_SCALE = 0x801E;
	public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F;
	public static final int GL_POST_CONVOLUTION_RED_BIAS = 0x8020;
	public static final int GL_POST_CONVOLUTION_GREEN_BIAS = 0x8021;
	public static final int GL_POST_CONVOLUTION_BLUE_BIAS = 0x8022;
	public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = 0x8023;
	public static final int GL_HISTOGRAM = 0x8024;
	public static final int GL_PROXY_HISTOGRAM = 0x8025;
	public static final int GL_HISTOGRAM_WIDTH = 0x8026;
	public static final int GL_HISTOGRAM_FORMAT = 0x8027;
	public static final int GL_HISTOGRAM_RED_SIZE = 0x8028;
	public static final int GL_HISTOGRAM_GREEN_SIZE = 0x8029;
	public static final int GL_HISTOGRAM_BLUE_SIZE = 0x802A;
	public static final int GL_HISTOGRAM_ALPHA_SIZE = 0x802B;
	public static final int GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C;
	public static final int GL_HISTOGRAM_SINK = 0x802D;
	public static final int GL_MINMAX = 0x802E;
	public static final int GL_MINMAX_FORMAT = 0x802F;
	public static final int GL_MINMAX_SINK = 0x8030;
	public static final int GL_TABLE_TOO_LARGE = 0x8031;
	public static final int GL_COLOR_MATRIX = 0x80B1;
	public static final int GL_COLOR_MATRIX_STACK_DEPTH = 0x80B2;
	public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;
	public static final int GL_POST_COLOR_MATRIX_RED_SCALE = 0x80B4;
	public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5;
	public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = 0x80B6;
	public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7;
	public static final int GL_POST_COLOR_MATRIX_RED_BIAS = 0x80B8;
	public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = 0x80B9;
	public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = 0x80BA;
	public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 0x80BB;
	public static final int GL_COLOR_TABLE = 0x80D0;
	public static final int GL_POST_CONVOLUTION_COLOR_TABLE = 0x80D1;
	public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;
	public static final int GL_PROXY_COLOR_TABLE = 0x80D3;
	public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = 0x80D4;
	public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;
	public static final int GL_COLOR_TABLE_SCALE = 0x80D6;
	public static final int GL_COLOR_TABLE_BIAS = 0x80D7;
	public static final int GL_COLOR_TABLE_FORMAT = 0x80D8;
	public static final int GL_COLOR_TABLE_WIDTH = 0x80D9;
	public static final int GL_COLOR_TABLE_RED_SIZE = 0x80DA;
	public static final int GL_COLOR_TABLE_GREEN_SIZE = 0x80DB;
	public static final int GL_COLOR_TABLE_BLUE_SIZE = 0x80DC;
	public static final int GL_COLOR_TABLE_ALPHA_SIZE = 0x80DD;
	public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE;
	public static final int GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;
	public static final int GL_IGNORE_BORDER = 0x8150;
	public static final int GL_CONSTANT_BORDER = 0x8151;
	public static final int GL_WRAP_BORDER = 0x8152;
	public static final int GL_REPLICATE_BORDER = 0x8153;
	public static final int GL_CONVOLUTION_BORDER_COLOR = 0x8154;
	public static final int GL_ARB_instanced_arrays = 1;
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB = 0x88FE;
	public static final int GL_ARB_internalformat_query = 1;
	public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;
	public static final int GL_ARB_internalformat_query2 = 1;
	public static final int GL_INTERNALFORMAT_SUPPORTED = 0x826F;
	public static final int GL_INTERNALFORMAT_PREFERRED = 0x8270;
	public static final int GL_INTERNALFORMAT_RED_SIZE = 0x8271;
	public static final int GL_INTERNALFORMAT_GREEN_SIZE = 0x8272;
	public static final int GL_INTERNALFORMAT_BLUE_SIZE = 0x8273;
	public static final int GL_INTERNALFORMAT_ALPHA_SIZE = 0x8274;
	public static final int GL_INTERNALFORMAT_DEPTH_SIZE = 0x8275;
	public static final int GL_INTERNALFORMAT_STENCIL_SIZE = 0x8276;
	public static final int GL_INTERNALFORMAT_SHARED_SIZE = 0x8277;
	public static final int GL_INTERNALFORMAT_RED_TYPE = 0x8278;
	public static final int GL_INTERNALFORMAT_GREEN_TYPE = 0x8279;
	public static final int GL_INTERNALFORMAT_BLUE_TYPE = 0x827A;
	public static final int GL_INTERNALFORMAT_ALPHA_TYPE = 0x827B;
	public static final int GL_INTERNALFORMAT_DEPTH_TYPE = 0x827C;
	public static final int GL_INTERNALFORMAT_STENCIL_TYPE = 0x827D;
	public static final int GL_MAX_WIDTH = 0x827E;
	public static final int GL_MAX_HEIGHT = 0x827F;
	public static final int GL_MAX_DEPTH = 0x8280;
	public static final int GL_MAX_LAYERS = 0x8281;
	public static final int GL_MAX_COMBINED_DIMENSIONS = 0x8282;
	public static final int GL_COLOR_COMPONENTS = 0x8283;
	public static final int GL_DEPTH_COMPONENTS = 0x8284;
	public static final int GL_STENCIL_COMPONENTS = 0x8285;
	public static final int GL_COLOR_RENDERABLE = 0x8286;
	public static final int GL_DEPTH_RENDERABLE = 0x8287;
	public static final int GL_STENCIL_RENDERABLE = 0x8288;
	public static final int GL_FRAMEBUFFER_RENDERABLE = 0x8289;
	public static final int GL_FRAMEBUFFER_RENDERABLE_LAYERED = 0x828A;
	public static final int GL_FRAMEBUFFER_BLEND = 0x828B;
	public static final int GL_READ_PIXELS = 0x828C;
	public static final int GL_READ_PIXELS_FORMAT = 0x828D;
	public static final int GL_READ_PIXELS_TYPE = 0x828E;
	public static final int GL_TEXTURE_IMAGE_FORMAT = 0x828F;
	public static final int GL_TEXTURE_IMAGE_TYPE = 0x8290;
	public static final int GL_GET_TEXTURE_IMAGE_FORMAT = 0x8291;
	public static final int GL_GET_TEXTURE_IMAGE_TYPE = 0x8292;
	public static final int GL_MIPMAP = 0x8293;
	public static final int GL_MANUAL_GENERATE_MIPMAP = 0x8294;
	public static final int GL_AUTO_GENERATE_MIPMAP = 0x8295;
	public static final int GL_COLOR_ENCODING = 0x8296;
	public static final int GL_SRGB_READ = 0x8297;
	public static final int GL_SRGB_WRITE = 0x8298;
	public static final int GL_SRGB_DECODE_ARB = 0x8299;
	public static final int GL_FILTER = 0x829A;
	public static final int GL_VERTEX_TEXTURE = 0x829B;
	public static final int GL_TESS_CONTROL_TEXTURE = 0x829C;
	public static final int GL_TESS_EVALUATION_TEXTURE = 0x829D;
	public static final int GL_GEOMETRY_TEXTURE = 0x829E;
	public static final int GL_FRAGMENT_TEXTURE = 0x829F;
	public static final int GL_COMPUTE_TEXTURE = 0x82A0;
	public static final int GL_TEXTURE_SHADOW = 0x82A1;
	public static final int GL_TEXTURE_GATHER = 0x82A2;
	public static final int GL_TEXTURE_GATHER_SHADOW = 0x82A3;
	public static final int GL_SHADER_IMAGE_LOAD = 0x82A4;
	public static final int GL_SHADER_IMAGE_STORE = 0x82A5;
	public static final int GL_SHADER_IMAGE_ATOMIC = 0x82A6;
	public static final int GL_IMAGE_TEXEL_SIZE = 0x82A7;
	public static final int GL_IMAGE_COMPATIBILITY_CLASS = 0x82A8;
	public static final int GL_IMAGE_PIXEL_FORMAT = 0x82A9;
	public static final int GL_IMAGE_PIXEL_TYPE = 0x82AA;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 0x82AC;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 0x82AD;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 0x82AE;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF;
	public static final int GL_TEXTURE_COMPRESSED_BLOCK_WIDTH = 0x82B1;
	public static final int GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT = 0x82B2;
	public static final int GL_TEXTURE_COMPRESSED_BLOCK_SIZE = 0x82B3;
	public static final int GL_CLEAR_BUFFER = 0x82B4;
	public static final int GL_TEXTURE_VIEW = 0x82B5;
	public static final int GL_VIEW_COMPATIBILITY_CLASS = 0x82B6;
	public static final int GL_FULL_SUPPORT = 0x82B7;
	public static final int GL_CAVEAT_SUPPORT = 0x82B8;
	public static final int GL_IMAGE_CLASS_4_X_32 = 0x82B9;
	public static final int GL_IMAGE_CLASS_2_X_32 = 0x82BA;
	public static final int GL_IMAGE_CLASS_1_X_32 = 0x82BB;
	public static final int GL_IMAGE_CLASS_4_X_16 = 0x82BC;
	public static final int GL_IMAGE_CLASS_2_X_16 = 0x82BD;
	public static final int GL_IMAGE_CLASS_1_X_16 = 0x82BE;
	public static final int GL_IMAGE_CLASS_4_X_8 = 0x82BF;
	public static final int GL_IMAGE_CLASS_2_X_8 = 0x82C0;
	public static final int GL_IMAGE_CLASS_1_X_8 = 0x82C1;
	public static final int GL_IMAGE_CLASS_11_11_10 = 0x82C2;
	public static final int GL_IMAGE_CLASS_10_10_10_2 = 0x82C3;
	public static final int GL_VIEW_CLASS_128_BITS = 0x82C4;
	public static final int GL_VIEW_CLASS_96_BITS = 0x82C5;
	public static final int GL_VIEW_CLASS_64_BITS = 0x82C6;
	public static final int GL_VIEW_CLASS_48_BITS = 0x82C7;
	public static final int GL_VIEW_CLASS_32_BITS = 0x82C8;
	public static final int GL_VIEW_CLASS_24_BITS = 0x82C9;
	public static final int GL_VIEW_CLASS_16_BITS = 0x82CA;
	public static final int GL_VIEW_CLASS_8_BITS = 0x82CB;
	public static final int GL_VIEW_CLASS_S3TC_DXT1_RGB = 0x82CC;
	public static final int GL_VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD;
	public static final int GL_VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE;
	public static final int GL_VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF;
	public static final int GL_VIEW_CLASS_RGTC1_RED = 0x82D0;
	public static final int GL_VIEW_CLASS_RGTC2_RG = 0x82D1;
	public static final int GL_VIEW_CLASS_BPTC_UNORM = 0x82D2;
	public static final int GL_VIEW_CLASS_BPTC_FLOAT = 0x82D3;
	public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
	public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
	public static final int GL_ARB_invalidate_subdata = 1;
	public static final int GL_ARB_map_buffer_alignment = 1;
	public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;
	public static final int GL_ARB_map_buffer_range = 1;
	public static final int GL_MAP_READ_BIT = 0x0001;
	public static final int GL_MAP_WRITE_BIT = 0x0002;
	public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
	public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
	public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
	public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
	public static final int GL_ARB_matrix_palette = 1;
	public static final int GL_MATRIX_PALETTE_ARB = 0x8840;
	public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841;
	public static final int GL_MAX_PALETTE_MATRICES_ARB = 0x8842;
	public static final int GL_CURRENT_PALETTE_MATRIX_ARB = 0x8843;
	public static final int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;
	public static final int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;
	public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 0x8846;
	public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 0x8847;
	public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;
	public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;
	public static final int GL_ARB_multi_draw_indirect = 1;
	public static final int GL_ARB_multisample = 1;
	public static final int GL_MULTISAMPLE_ARB = 0x809D;
	public static final int GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 0x809E;
	public static final int GL_SAMPLE_ALPHA_TO_ONE_ARB = 0x809F;
	public static final int GL_SAMPLE_COVERAGE_ARB = 0x80A0;
	public static final int GL_SAMPLE_BUFFERS_ARB = 0x80A8;
	public static final int GL_SAMPLES_ARB = 0x80A9;
	public static final int GL_SAMPLE_COVERAGE_VALUE_ARB = 0x80AA;
	public static final int GL_SAMPLE_COVERAGE_INVERT_ARB = 0x80AB;
	public static final int GL_MULTISAMPLE_BIT_ARB = 0x20000000;
	public static final int GL_ARB_multitexture = 1;
	public static final int GL_TEXTURE0_ARB = 0x84C0;
	public static final int GL_TEXTURE1_ARB = 0x84C1;
	public static final int GL_TEXTURE2_ARB = 0x84C2;
	public static final int GL_TEXTURE3_ARB = 0x84C3;
	public static final int GL_TEXTURE4_ARB = 0x84C4;
	public static final int GL_TEXTURE5_ARB = 0x84C5;
	public static final int GL_TEXTURE6_ARB = 0x84C6;
	public static final int GL_TEXTURE7_ARB = 0x84C7;
	public static final int GL_TEXTURE8_ARB = 0x84C8;
	public static final int GL_TEXTURE9_ARB = 0x84C9;
	public static final int GL_TEXTURE10_ARB = 0x84CA;
	public static final int GL_TEXTURE11_ARB = 0x84CB;
	public static final int GL_TEXTURE12_ARB = 0x84CC;
	public static final int GL_TEXTURE13_ARB = 0x84CD;
	public static final int GL_TEXTURE14_ARB = 0x84CE;
	public static final int GL_TEXTURE15_ARB = 0x84CF;
	public static final int GL_TEXTURE16_ARB = 0x84D0;
	public static final int GL_TEXTURE17_ARB = 0x84D1;
	public static final int GL_TEXTURE18_ARB = 0x84D2;
	public static final int GL_TEXTURE19_ARB = 0x84D3;
	public static final int GL_TEXTURE20_ARB = 0x84D4;
	public static final int GL_TEXTURE21_ARB = 0x84D5;
	public static final int GL_TEXTURE22_ARB = 0x84D6;
	public static final int GL_TEXTURE23_ARB = 0x84D7;
	public static final int GL_TEXTURE24_ARB = 0x84D8;
	public static final int GL_TEXTURE25_ARB = 0x84D9;
	public static final int GL_TEXTURE26_ARB = 0x84DA;
	public static final int GL_TEXTURE27_ARB = 0x84DB;
	public static final int GL_TEXTURE28_ARB = 0x84DC;
	public static final int GL_TEXTURE29_ARB = 0x84DD;
	public static final int GL_TEXTURE30_ARB = 0x84DE;
	public static final int GL_TEXTURE31_ARB = 0x84DF;
	public static final int GL_ACTIVE_TEXTURE_ARB = 0x84E0;
	public static final int GL_CLIENT_ACTIVE_TEXTURE_ARB = 0x84E1;
	public static final int GL_MAX_TEXTURE_UNITS_ARB = 0x84E2;
	public static final int GL_ARB_occlusion_query = 1;
	public static final int GL_QUERY_COUNTER_BITS_ARB = 0x8864;
	public static final int GL_CURRENT_QUERY_ARB = 0x8865;
	public static final int GL_QUERY_RESULT_ARB = 0x8866;
	public static final int GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;
	public static final int GL_SAMPLES_PASSED_ARB = 0x8914;
	public static final int GL_ARB_occlusion_query2 = 1;
	public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;
	public static final int GL_ARB_pixel_buffer_object = 1;
	public static final int GL_PIXEL_PACK_BUFFER_ARB = 0x88EB;
	public static final int GL_PIXEL_UNPACK_BUFFER_ARB = 0x88EC;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING_ARB = 0x88ED;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING_ARB = 0x88EF;
	public static final int GL_ARB_point_parameters = 1;
	public static final int GL_POINT_SIZE_MIN_ARB = 0x8126;
	public static final int GL_POINT_SIZE_MAX_ARB = 0x8127;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = 0x8128;
	public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;
	public static final int GL_ARB_point_sprite = 1;
	public static final int GL_POINT_SPRITE_ARB = 0x8861;
	public static final int GL_COORD_REPLACE_ARB = 0x8862;
	public static final int GL_ARB_program_interface_query = 1;
	public static final int GL_UNIFORM = 0x92E1;
	public static final int GL_UNIFORM_BLOCK = 0x92E2;
	public static final int GL_PROGRAM_INPUT = 0x92E3;
	public static final int GL_PROGRAM_OUTPUT = 0x92E4;
	public static final int GL_BUFFER_VARIABLE = 0x92E5;
	public static final int GL_SHADER_STORAGE_BLOCK = 0x92E6;
	public static final int GL_IS_PER_PATCH = 0x92E7;
	public static final int GL_VERTEX_SUBROUTINE = 0x92E8;
	public static final int GL_TESS_CONTROL_SUBROUTINE = 0x92E9;
	public static final int GL_TESS_EVALUATION_SUBROUTINE = 0x92EA;
	public static final int GL_GEOMETRY_SUBROUTINE = 0x92EB;
	public static final int GL_FRAGMENT_SUBROUTINE = 0x92EC;
	public static final int GL_COMPUTE_SUBROUTINE = 0x92ED;
	public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
	public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
	public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
	public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
	public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
	public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
	public static final int GL_TRANSFORM_FEEDBACK_VARYING = 0x92F4;
	public static final int GL_ACTIVE_RESOURCES = 0x92F5;
	public static final int GL_MAX_NAME_LENGTH = 0x92F6;
	public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
	public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
	public static final int GL_NAME_LENGTH = 0x92F9;
	public static final int GL_TYPE = 0x92FA;
	public static final int GL_ARRAY_SIZE = 0x92FB;
	public static final int GL_OFFSET = 0x92FC;
	public static final int GL_BLOCK_INDEX = 0x92FD;
	public static final int GL_ARRAY_STRIDE = 0x92FE;
	public static final int GL_MATRIX_STRIDE = 0x92FF;
	public static final int GL_IS_ROW_MAJOR = 0x9300;
	public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
	public static final int GL_BUFFER_BINDING = 0x9302;
	public static final int GL_BUFFER_DATA_SIZE = 0x9303;
	public static final int GL_NUM_ACTIVE_VARIABLES = 0x9304;
	public static final int GL_ACTIVE_VARIABLES = 0x9305;
	public static final int GL_REFERENCED_BY_VERTEX_SHADER = 0x9306;
	public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
	public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
	public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
	public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
	public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 0x930B;
	public static final int GL_TOP_LEVEL_ARRAY_SIZE = 0x930C;
	public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 0x930D;
	public static final int GL_LOCATION = 0x930E;
	public static final int GL_LOCATION_INDEX = 0x930F;
	public static final int GL_ARB_provoking_vertex = 1;
	public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
	public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
	public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
	public static final int GL_PROVOKING_VERTEX = 0x8E4F;
	public static final int GL_ARB_robust_buffer_access_behavior = 1;
	public static final int GL_ARB_robustness = 1;
	public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
	public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
	public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
	public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
	public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
	public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
	public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
	public static final int GL_ARB_robustness_application_isolation = 1;
	public static final int GL_ARB_robustness_share_group_isolation = 1;
	public static final int GL_ARB_sample_shading = 1;
	public static final int GL_SAMPLE_SHADING_ARB = 0x8C36;
	public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 0x8C37;
	public static final int GL_ARB_sampler_objects = 1;
	public static final int GL_SAMPLER_BINDING = 0x8919;
	public static final int GL_ARB_seamless_cube_map = 1;
	public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
	public static final int GL_ARB_separate_shader_objects = 1;
	public static final int GL_VERTEX_SHADER_BIT = 0x00000001;
	public static final int GL_FRAGMENT_SHADER_BIT = 0x00000002;
	public static final int GL_GEOMETRY_SHADER_BIT = 0x00000004;
	public static final int GL_TESS_CONTROL_SHADER_BIT = 0x00000008;
	public static final int GL_TESS_EVALUATION_SHADER_BIT = 0x00000010;
	public static final int GL_PROGRAM_SEPARABLE = 0x8258;
	public static final int GL_ACTIVE_PROGRAM = 0x8259;
	public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;
	public static final int GL_ALL_SHADER_BITS = 0xFFFFFFFF;
	public static final int GL_ARB_shader_atomic_counters = 1;
	public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;
	public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;
	public static final int GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2;
	public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = 0x92C3;
	public static final int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 0x92C4;
	public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 0x92C5;
	public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 0x92C6;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 0x92C7;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 0x92C8;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 0x92CA;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 0x92CB;
	public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
	public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
	public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
	public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
	public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
	public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
	public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = 0x92D2;
	public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
	public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
	public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
	public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
	public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
	public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
	public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;
	public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;
	public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;
	public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
	public static final int GL_ARB_shader_bit_encoding = 1;
	public static final int GL_ARB_shader_image_load_store = 1;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x00000001;
	public static final int GL_ELEMENT_ARRAY_BARRIER_BIT = 0x00000002;
	public static final int GL_UNIFORM_BARRIER_BIT = 0x00000004;
	public static final int GL_TEXTURE_FETCH_BARRIER_BIT = 0x00000008;
	public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x00000020;
	public static final int GL_COMMAND_BARRIER_BIT = 0x00000040;
	public static final int GL_PIXEL_BUFFER_BARRIER_BIT = 0x00000080;
	public static final int GL_TEXTURE_UPDATE_BARRIER_BIT = 0x00000100;
	public static final int GL_BUFFER_UPDATE_BARRIER_BIT = 0x00000200;
	public static final int GL_FRAMEBUFFER_BARRIER_BIT = 0x00000400;
	public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 0x00000800;
	public static final int GL_ATOMIC_COUNTER_BARRIER_BIT = 0x00001000;
	public static final int GL_MAX_IMAGE_UNITS = 0x8F38;
	public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39;
	public static final int GL_IMAGE_BINDING_NAME = 0x8F3A;
	public static final int GL_IMAGE_BINDING_LEVEL = 0x8F3B;
	public static final int GL_IMAGE_BINDING_LAYERED = 0x8F3C;
	public static final int GL_IMAGE_BINDING_LAYER = 0x8F3D;
	public static final int GL_IMAGE_BINDING_ACCESS = 0x8F3E;
	public static final int GL_IMAGE_1D = 0x904C;
	public static final int GL_IMAGE_2D = 0x904D;
	public static final int GL_IMAGE_3D = 0x904E;
	public static final int GL_IMAGE_2D_RECT = 0x904F;
	public static final int GL_IMAGE_CUBE = 0x9050;
	public static final int GL_IMAGE_BUFFER = 0x9051;
	public static final int GL_IMAGE_1D_ARRAY = 0x9052;
	public static final int GL_IMAGE_2D_ARRAY = 0x9053;
	public static final int GL_IMAGE_CUBE_MAP_ARRAY = 0x9054;
	public static final int GL_IMAGE_2D_MULTISAMPLE = 0x9055;
	public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9056;
	public static final int GL_INT_IMAGE_1D = 0x9057;
	public static final int GL_INT_IMAGE_2D = 0x9058;
	public static final int GL_INT_IMAGE_3D = 0x9059;
	public static final int GL_INT_IMAGE_2D_RECT = 0x905A;
	public static final int GL_INT_IMAGE_CUBE = 0x905B;
	public static final int GL_INT_IMAGE_BUFFER = 0x905C;
	public static final int GL_INT_IMAGE_1D_ARRAY = 0x905D;
	public static final int GL_INT_IMAGE_2D_ARRAY = 0x905E;
	public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY = 0x905F;
	public static final int GL_INT_IMAGE_2D_MULTISAMPLE = 0x9060;
	public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9061;
	public static final int GL_UNSIGNED_INT_IMAGE_1D = 0x9062;
	public static final int GL_UNSIGNED_INT_IMAGE_2D = 0x9063;
	public static final int GL_UNSIGNED_INT_IMAGE_3D = 0x9064;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT = 0x9065;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE = 0x9066;
	public static final int GL_UNSIGNED_INT_IMAGE_BUFFER = 0x9067;
	public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY = 0x9068;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = 0x9069;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 0x906A;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 0x906B;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;
	public static final int GL_MAX_IMAGE_SAMPLES = 0x906D;
	public static final int GL_IMAGE_BINDING_FORMAT = 0x906E;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 0x90C8;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;
	public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS = 0x90CA;
	public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 0x90CB;
	public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 0x90CC;
	public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = 0x90CD;
	public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = 0x90CE;
	public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS = 0x90CF;
	public static final int GL_ALL_BARRIER_BITS = 0xFFFFFFFF;
	public static final int GL_ARB_shader_image_size = 1;
	public static final int GL_ARB_shader_objects = 1;
	public static final int GL_PROGRAM_OBJECT_ARB = 0x8B40;
	public static final int GL_SHADER_OBJECT_ARB = 0x8B48;
	public static final int GL_OBJECT_TYPE_ARB = 0x8B4E;
	public static final int GL_OBJECT_SUBTYPE_ARB = 0x8B4F;
	public static final int GL_FLOAT_VEC2_ARB = 0x8B50;
	public static final int GL_FLOAT_VEC3_ARB = 0x8B51;
	public static final int GL_FLOAT_VEC4_ARB = 0x8B52;
	public static final int GL_INT_VEC2_ARB = 0x8B53;
	public static final int GL_INT_VEC3_ARB = 0x8B54;
	public static final int GL_INT_VEC4_ARB = 0x8B55;
	public static final int GL_BOOL_ARB = 0x8B56;
	public static final int GL_BOOL_VEC2_ARB = 0x8B57;
	public static final int GL_BOOL_VEC3_ARB = 0x8B58;
	public static final int GL_BOOL_VEC4_ARB = 0x8B59;
	public static final int GL_FLOAT_MAT2_ARB = 0x8B5A;
	public static final int GL_FLOAT_MAT3_ARB = 0x8B5B;
	public static final int GL_FLOAT_MAT4_ARB = 0x8B5C;
	public static final int GL_SAMPLER_1D_ARB = 0x8B5D;
	public static final int GL_SAMPLER_2D_ARB = 0x8B5E;
	public static final int GL_SAMPLER_3D_ARB = 0x8B5F;
	public static final int GL_SAMPLER_CUBE_ARB = 0x8B60;
	public static final int GL_SAMPLER_1D_SHADOW_ARB = 0x8B61;
	public static final int GL_SAMPLER_2D_SHADOW_ARB = 0x8B62;
	public static final int GL_SAMPLER_2D_RECT_ARB = 0x8B63;
	public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;
	public static final int GL_OBJECT_DELETE_STATUS_ARB = 0x8B80;
	public static final int GL_OBJECT_COMPILE_STATUS_ARB = 0x8B81;
	public static final int GL_OBJECT_LINK_STATUS_ARB = 0x8B82;
	public static final int GL_OBJECT_VALIDATE_STATUS_ARB = 0x8B83;
	public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = 0x8B84;
	public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = 0x8B85;
	public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 0x8B86;
	public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 0x8B87;
	public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 0x8B88;
	public static final int GL_ARB_shader_precision = 1;
	public static final int GL_ARB_shader_stencil_export = 1;
	public static final int GL_ARB_shader_storage_buffer_object = 1;
	public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x2000;
	public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
	public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;
	public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;
	public static final int GL_SHADER_STORAGE_BUFFER_START = 0x90D4;
	public static final int GL_SHADER_STORAGE_BUFFER_SIZE = 0x90D5;
	public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
	public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
	public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
	public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
	public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
	public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
	public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
	public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
	public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 0x90DE;
	public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
	public static final int GL_ARB_shader_subroutine = 1;
	public static final int GL_ACTIVE_SUBROUTINES = 0x8DE5;
	public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
	public static final int GL_MAX_SUBROUTINES = 0x8DE7;
	public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
	public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
	public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
	public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
	public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
	public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
	public static final int GL_ARB_shader_texture_lod = 1;
	public static final int GL_ARB_shading_language_100 = 1;
	public static final int GL_SHADING_LANGUAGE_VERSION_ARB = 0x8B8C;
	public static final int GL_ARB_shading_language_420pack = 1;
	public static final int GL_ARB_shading_language_include = 1;
	public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;
	public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
	public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
	public static final int GL_ARB_shading_language_packing = 1;
	public static final int GL_ARB_shadow = 1;
	public static final int GL_TEXTURE_COMPARE_MODE_ARB = 0x884C;
	public static final int GL_TEXTURE_COMPARE_FUNC_ARB = 0x884D;
	public static final int GL_COMPARE_REF_TO_TEXTURE = GL_COMPARE_R_TO_TEXTURE_ARB;
	public static final int GL_ARB_shadow_ambient = 1;
	public static final int GL_TEXTURE_COMPARE_FAIL_VALUE_ARB = 0x80BF;
	public static final int GL_ARB_stencil_texturing = 1;
	public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;
	public static final int GL_ARB_sync = 1;
	public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
	public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
	public static final int GL_OBJECT_TYPE = 0x9112;
	public static final int GL_SYNC_CONDITION = 0x9113;
	public static final int GL_SYNC_STATUS = 0x9114;
	public static final int GL_SYNC_FLAGS = 0x9115;
	public static final int GL_SYNC_FENCE = 0x9116;
	public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
	public static final int GL_UNSIGNALED = 0x9118;
	public static final int GL_SIGNALED = 0x9119;
	public static final int GL_ALREADY_SIGNALED = 0x911A;
	public static final int GL_TIMEOUT_EXPIRED = 0x911B;
	public static final int GL_CONDITION_SATISFIED = 0x911C;
	public static final int GL_WAIT_FAILED = 0x911D;
	public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFl;
	public static final int GL_ARB_tessellation_shader = 1;
	public static final int GL_PATCHES = 0xE;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 0x84F0;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;
	public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
	public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
	public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
	public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
	public static final int GL_PATCH_VERTICES = 0x8E72;
	public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73;
	public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;
	public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
	public static final int GL_TESS_GEN_MODE = 0x8E76;
	public static final int GL_TESS_GEN_SPACING = 0x8E77;
	public static final int GL_TESS_GEN_VERTEX_ORDER = 0x8E78;
	public static final int GL_TESS_GEN_POINT_MODE = 0x8E79;
	public static final int GL_ISOLINES = 0x8E7A;
	public static final int GL_FRACTIONAL_ODD = 0x8E7B;
	public static final int GL_FRACTIONAL_EVEN = 0x8E7C;
	public static final int GL_MAX_PATCH_VERTICES = 0x8E7D;
	public static final int GL_MAX_TESS_GEN_LEVEL = 0x8E7E;
	public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
	public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
	public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
	public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
	public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
	public static final int GL_MAX_TESS_PATCH_COMPONENTS = 0x8E84;
	public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
	public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
	public static final int GL_TESS_EVALUATION_SHADER = 0x8E87;
	public static final int GL_TESS_CONTROL_SHADER = 0x8E88;
	public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
	public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
	public static final int GL_ARB_texture_border_clamp = 1;
	public static final int GL_CLAMP_TO_BORDER_ARB = 0x812D;
	public static final int GL_ARB_texture_buffer_object = 1;
	public static final int GL_TEXTURE_BUFFER_ARB = 0x8C2A;
	public static final int GL_MAX_TEXTURE_BUFFER_SIZE_ARB = 0x8C2B;
	public static final int GL_TEXTURE_BINDING_BUFFER_ARB = 0x8C2C;
	public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 0x8C2D;
	public static final int GL_TEXTURE_BUFFER_FORMAT_ARB = 0x8C2E;
	public static final int GL_ARB_texture_buffer_object_rgb32 = 1;
	public static final int GL_ARB_texture_buffer_range = 1;
	public static final int GL_TEXTURE_BUFFER_OFFSET = 0x919D;
	public static final int GL_TEXTURE_BUFFER_SIZE = 0x919E;
	public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
	public static final int GL_ARB_texture_compression = 1;
	public static final int GL_COMPRESSED_ALPHA_ARB = 0x84E9;
	public static final int GL_COMPRESSED_LUMINANCE_ARB = 0x84EA;
	public static final int GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 0x84EB;
	public static final int GL_COMPRESSED_INTENSITY_ARB = 0x84EC;
	public static final int GL_COMPRESSED_RGB_ARB = 0x84ED;
	public static final int GL_COMPRESSED_RGBA_ARB = 0x84EE;
	public static final int GL_TEXTURE_COMPRESSION_HINT_ARB = 0x84EF;
	public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 0x86A0;
	public static final int GL_TEXTURE_COMPRESSED_ARB = 0x86A1;
	public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A2;
	public static final int GL_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A3;
	public static final int GL_ARB_texture_compression_bptc = 1;
	public static final int GL_COMPRESSED_RGBA_BPTC_UNORM_ARB = 0x8E8C;
	public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB = 0x8E8D;
	public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB = 0x8E8E;
	public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB = 0x8E8F;
	public static final int GL_ARB_texture_compression_rgtc = 1;
	public static final int GL_COMPRESSED_RED_RGTC1 = 0x8DBB;
	public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
	public static final int GL_COMPRESSED_RG_RGTC2 = 0x8DBD;
	public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
	public static final int GL_ARB_texture_cube_map = 1;
	public static final int GL_NORMAL_MAP_ARB = 0x8511;
	public static final int GL_REFLECTION_MAP_ARB = 0x8512;
	public static final int GL_TEXTURE_CUBE_MAP_ARB = 0x8513;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARB = 0x8514;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB = 0x8515;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB = 0x8516;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB = 0x8517;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB = 0x8518;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB = 0x8519;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB = 0x851A;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARB = 0x851B;
	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE_ARB = 0x851C;
	public static final int GL_ARB_texture_cube_map_array = 1;
	public static final int GL_TEXTURE_CUBE_MAP_ARRAY_ARB = 0x9009;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB = 0x900A;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB = 0x900B;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY_ARB = 0x900C;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB = 0x900D;
	public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB = 0x900E;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB = 0x900F;
	public static final int GL_ARB_texture_env_add = 1;
	public static final int GL_ARB_texture_env_combine = 1;
	public static final int GL_SUBTRACT_ARB = 0x84E7;
	public static final int GL_COMBINE_ARB = 0x8570;
	public static final int GL_COMBINE_RGB_ARB = 0x8571;
	public static final int GL_COMBINE_ALPHA_ARB = 0x8572;
	public static final int GL_RGB_SCALE_ARB = 0x8573;
	public static final int GL_ADD_SIGNED_ARB = 0x8574;
	public static final int GL_INTERPOLATE_ARB = 0x8575;
	public static final int GL_CONSTANT_ARB = 0x8576;
	public static final int GL_PRIMARY_COLOR_ARB = 0x8577;
	public static final int GL_PREVIOUS_ARB = 0x8578;
	public static final int GL_SOURCE0_RGB_ARB = 0x8580;
	public static final int GL_SOURCE1_RGB_ARB = 0x8581;
	public static final int GL_SOURCE2_RGB_ARB = 0x8582;
	public static final int GL_SOURCE0_ALPHA_ARB = 0x8588;
	public static final int GL_SOURCE1_ALPHA_ARB = 0x8589;
	public static final int GL_SOURCE2_ALPHA_ARB = 0x858A;
	public static final int GL_OPERAND0_RGB_ARB = 0x8590;
	public static final int GL_OPERAND1_RGB_ARB = 0x8591;
	public static final int GL_OPERAND2_RGB_ARB = 0x8592;
	public static final int GL_OPERAND0_ALPHA_ARB = 0x8598;
	public static final int GL_OPERAND1_ALPHA_ARB = 0x8599;
	public static final int GL_OPERAND2_ALPHA_ARB = 0x859A;
	public static final int GL_ARB_texture_env_crossbar = 1;
	public static final int GL_ARB_texture_env_dot3 = 1;
	public static final int GL_DOT3_RGB_ARB = 0x86AE;
	public static final int GL_DOT3_RGBA_ARB = 0x86AF;
	public static final int GL_ARB_texture_float = 1;
	public static final int GL_RGBA32F_ARB = 0x8814;
	public static final int GL_RGB32F_ARB = 0x8815;
	public static final int GL_ALPHA32F_ARB = 0x8816;
	public static final int GL_INTENSITY32F_ARB = 0x8817;
	public static final int GL_LUMINANCE32F_ARB = 0x8818;
	public static final int GL_LUMINANCE_ALPHA32F_ARB = 0x8819;
	public static final int GL_RGBA16F_ARB = 0x881A;
	public static final int GL_RGB16F_ARB = 0x881B;
	public static final int GL_ALPHA16F_ARB = 0x881C;
	public static final int GL_INTENSITY16F_ARB = 0x881D;
	public static final int GL_LUMINANCE16F_ARB = 0x881E;
	public static final int GL_LUMINANCE_ALPHA16F_ARB = 0x881F;
	public static final int GL_TEXTURE_RED_TYPE_ARB = 0x8C10;
	public static final int GL_TEXTURE_GREEN_TYPE_ARB = 0x8C11;
	public static final int GL_TEXTURE_BLUE_TYPE_ARB = 0x8C12;
	public static final int GL_TEXTURE_ALPHA_TYPE_ARB = 0x8C13;
	public static final int GL_TEXTURE_LUMINANCE_TYPE_ARB = 0x8C14;
	public static final int GL_TEXTURE_INTENSITY_TYPE_ARB = 0x8C15;
	public static final int GL_TEXTURE_DEPTH_TYPE_ARB = 0x8C16;
	public static final int GL_UNSIGNED_NORMALIZED_ARB = 0x8C17;
	public static final int GL_ARB_texture_gather = 1;
	public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 0x8E5E;
	public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 0x8E5F;
	public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB = 0x8F9F;
	public static final int GL_ARB_texture_mirrored_repeat = 1;
	public static final int GL_MIRRORED_REPEAT_ARB = 0x8370;
	public static final int GL_ARB_texture_multisample = 1;
	public static final int GL_SAMPLE_POSITION = 0x8E50;
	public static final int GL_SAMPLE_MASK = 0x8E51;
	public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
	public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
	public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
	public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
	public static final int GL_TEXTURE_SAMPLES = 0x9106;
	public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
	public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
	public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
	public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
	public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
	public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
	public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
	public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
	public static final int GL_ARB_texture_non_power_of_two = 1;
	public static final int GL_ARB_texture_query_levels = 1;
	public static final int GL_ARB_texture_query_lod = 1;
	public static final int GL_ARB_texture_rectangle = 1;
	public static final int GL_TEXTURE_RECTANGLE_ARB = 0x84F5;
	public static final int GL_TEXTURE_BINDING_RECTANGLE_ARB = 0x84F6;
	public static final int GL_PROXY_TEXTURE_RECTANGLE_ARB = 0x84F7;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB = 0x84F8;
	public static final int GL_ARB_texture_rg = 1;
	public static final int GL_RG = 0x8227;
	public static final int GL_RG_INTEGER = 0x8228;
	public static final int GL_R8 = 0x8229;
	public static final int GL_R16 = 0x822A;
	public static final int GL_RG8 = 0x822B;
	public static final int GL_RG16 = 0x822C;
	public static final int GL_R16F = 0x822D;
	public static final int GL_R32F = 0x822E;
	public static final int GL_RG16F = 0x822F;
	public static final int GL_RG32F = 0x8230;
	public static final int GL_R8I = 0x8231;
	public static final int GL_R8UI = 0x8232;
	public static final int GL_R16I = 0x8233;
	public static final int GL_R16UI = 0x8234;
	public static final int GL_R32I = 0x8235;
	public static final int GL_R32UI = 0x8236;
	public static final int GL_RG8I = 0x8237;
	public static final int GL_RG8UI = 0x8238;
	public static final int GL_RG16I = 0x8239;
	public static final int GL_RG16UI = 0x823A;
	public static final int GL_RG32I = 0x823B;
	public static final int GL_RG32UI = 0x823C;
	public static final int GL_ARB_texture_rgb10_a2ui = 1;
	public static final int GL_ARB_texture_storage = 1;
	public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;
	public static final int GL_ARB_texture_storage_multisample = 1;
	public static final int GL_ARB_texture_swizzle = 1;
	public static final int GL_ARB_texture_view = 1;
	public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
	public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
	public static final int GL_TEXTURE_VIEW_MIN_LAYER = 0x82DD;
	public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
	public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
	public static final int GL_ARB_timer_query = 1;
	public static final int GL_TIME_ELAPSED = 0x88BF;
	public static final int GL_TIMESTAMP = 0x8E28;
	public static final int GL_ARB_transform_feedback2 = 1;
	public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
	public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
	public static final int GL_ARB_transform_feedback3 = 1;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;
	public static final int GL_ARB_transform_feedback_instanced = 1;
	public static final int GL_ARB_transpose_matrix = 1;
	public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;
	public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
	public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
	public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;
	public static final int GL_ARB_uniform_buffer_object = 1;
	public static final int GL_UNIFORM_BUFFER = 0x8A11;
	public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
	public static final int GL_UNIFORM_BUFFER_START = 0x8A29;
	public static final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
	public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
	public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
	public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
	public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
	public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
	public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
	public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
	public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
	public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
	public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
	public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
	public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
	public static final int GL_UNIFORM_TYPE = 0x8A37;
	public static final int GL_UNIFORM_SIZE = 0x8A38;
	public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
	public static final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
	public static final int GL_UNIFORM_OFFSET = 0x8A3B;
	public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
	public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
	public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
	public static final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
	public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
	public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
	public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
	public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
	public static final int GL_INVALID_INDEX = 0xFFFFFFFF;
	public static final int GL_ARB_vertex_array_bgra = 1;
	public static final int GL_ARB_vertex_array_object = 1;
	public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
	public static final int GL_ARB_vertex_attrib_64bit = 1;
	public static final int GL_ARB_vertex_attrib_binding = 1;
	public static final int GL_VERTEX_ATTRIB_BINDING = 0x82D4;
	public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
	public static final int GL_VERTEX_BINDING_DIVISOR = 0x82D6;
	public static final int GL_VERTEX_BINDING_OFFSET = 0x82D7;
	public static final int GL_VERTEX_BINDING_STRIDE = 0x82D8;
	public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
	public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
	public static final int GL_ARB_vertex_blend = 1;
	public static final int GL_MODELVIEW0_ARB = 0x1700;
	public static final int GL_MODELVIEW1_ARB = 0x850A;
	public static final int GL_MAX_VERTEX_UNITS_ARB = 0x86A4;
	public static final int GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;
	public static final int GL_WEIGHT_SUM_UNITY_ARB = 0x86A6;
	public static final int GL_VERTEX_BLEND_ARB = 0x86A7;
	public static final int GL_CURRENT_WEIGHT_ARB = 0x86A8;
	public static final int GL_WEIGHT_ARRAY_TYPE_ARB = 0x86A9;
	public static final int GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA;
	public static final int GL_WEIGHT_ARRAY_SIZE_ARB = 0x86AB;
	public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;
	public static final int GL_WEIGHT_ARRAY_ARB = 0x86AD;
	public static final int GL_MODELVIEW2_ARB = 0x8722;
	public static final int GL_MODELVIEW3_ARB = 0x8723;
	public static final int GL_MODELVIEW4_ARB = 0x8724;
	public static final int GL_MODELVIEW5_ARB = 0x8725;
	public static final int GL_MODELVIEW6_ARB = 0x8726;
	public static final int GL_MODELVIEW7_ARB = 0x8727;
	public static final int GL_MODELVIEW8_ARB = 0x8728;
	public static final int GL_MODELVIEW9_ARB = 0x8729;
	public static final int GL_MODELVIEW10_ARB = 0x872A;
	public static final int GL_MODELVIEW11_ARB = 0x872B;
	public static final int GL_MODELVIEW12_ARB = 0x872C;
	public static final int GL_MODELVIEW13_ARB = 0x872D;
	public static final int GL_MODELVIEW14_ARB = 0x872E;
	public static final int GL_MODELVIEW15_ARB = 0x872F;
	public static final int GL_MODELVIEW16_ARB = 0x8730;
	public static final int GL_MODELVIEW17_ARB = 0x8731;
	public static final int GL_MODELVIEW18_ARB = 0x8732;
	public static final int GL_MODELVIEW19_ARB = 0x8733;
	public static final int GL_MODELVIEW20_ARB = 0x8734;
	public static final int GL_MODELVIEW21_ARB = 0x8735;
	public static final int GL_MODELVIEW22_ARB = 0x8736;
	public static final int GL_MODELVIEW23_ARB = 0x8737;
	public static final int GL_MODELVIEW24_ARB = 0x8738;
	public static final int GL_MODELVIEW25_ARB = 0x8739;
	public static final int GL_MODELVIEW26_ARB = 0x873A;
	public static final int GL_MODELVIEW27_ARB = 0x873B;
	public static final int GL_MODELVIEW28_ARB = 0x873C;
	public static final int GL_MODELVIEW29_ARB = 0x873D;
	public static final int GL_MODELVIEW30_ARB = 0x873E;
	public static final int GL_MODELVIEW31_ARB = 0x873F;
	public static final int GL_ARB_vertex_buffer_object = 1;
	public static final int GL_BUFFER_SIZE_ARB = 0x8764;
	public static final int GL_BUFFER_USAGE_ARB = 0x8765;
	public static final int GL_ARRAY_BUFFER_ARB = 0x8892;
	public static final int GL_ELEMENT_ARRAY_BUFFER_ARB = 0x8893;
	public static final int GL_ARRAY_BUFFER_BINDING_ARB = 0x8894;
	public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB = 0x8895;
	public static final int GL_VERTEX_ARRAY_BUFFER_BINDING_ARB = 0x8896;
	public static final int GL_NORMAL_ARRAY_BUFFER_BINDING_ARB = 0x8897;
	public static final int GL_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x8898;
	public static final int GL_INDEX_ARRAY_BUFFER_BINDING_ARB = 0x8899;
	public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB = 0x889A;
	public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB = 0x889B;
	public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x889C;
	public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB = 0x889D;
	public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB = 0x889E;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 0x889F;
	public static final int GL_READ_ONLY_ARB = 0x88B8;
	public static final int GL_WRITE_ONLY_ARB = 0x88B9;
	public static final int GL_READ_WRITE_ARB = 0x88BA;
	public static final int GL_BUFFER_ACCESS_ARB = 0x88BB;
	public static final int GL_BUFFER_MAPPED_ARB = 0x88BC;
	public static final int GL_BUFFER_MAP_POINTER_ARB = 0x88BD;
	public static final int GL_STREAM_DRAW_ARB = 0x88E0;
	public static final int GL_STREAM_READ_ARB = 0x88E1;
	public static final int GL_STREAM_COPY_ARB = 0x88E2;
	public static final int GL_STATIC_DRAW_ARB = 0x88E4;
	public static final int GL_STATIC_READ_ARB = 0x88E5;
	public static final int GL_STATIC_COPY_ARB = 0x88E6;
	public static final int GL_DYNAMIC_DRAW_ARB = 0x88E8;
	public static final int GL_DYNAMIC_READ_ARB = 0x88E9;
	public static final int GL_DYNAMIC_COPY_ARB = 0x88EA;
	public static final int GL_ARB_vertex_program = 1;
	public static final int GL_COLOR_SUM_ARB = 0x8458;
	public static final int GL_VERTEX_PROGRAM_ARB = 0x8620;
	public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = 0x8622;
	public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = 0x8623;
	public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = 0x8624;
	public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = 0x8625;
	public static final int GL_CURRENT_VERTEX_ATTRIB_ARB = 0x8626;
	public static final int GL_PROGRAM_LENGTH_ARB = 0x8627;
	public static final int GL_PROGRAM_STRING_ARB = 0x8628;
	public static final int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;
	public static final int GL_MAX_PROGRAM_MATRICES_ARB = 0x862F;
	public static final int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = 0x8640;
	public static final int GL_CURRENT_MATRIX_ARB = 0x8641;
	public static final int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642;
	public static final int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = 0x8643;
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;
	public static final int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;
	public static final int GL_PROGRAM_BINDING_ARB = 0x8677;
	public static final int GL_MAX_VERTEX_ATTRIBS_ARB = 0x8869;
	public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A;
	public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;
	public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;
	public static final int GL_PROGRAM_FORMAT_ARB = 0x8876;
	public static final int GL_PROGRAM_INSTRUCTIONS_ARB = 0x88A0;
	public static final int GL_MAX_PROGRAM_INSTRUCTIONS_ARB = 0x88A1;
	public static final int GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A2;
	public static final int GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A3;
	public static final int GL_PROGRAM_TEMPORARIES_ARB = 0x88A4;
	public static final int GL_MAX_PROGRAM_TEMPORARIES_ARB = 0x88A5;
	public static final int GL_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A6;
	public static final int GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A7;
	public static final int GL_PROGRAM_PARAMETERS_ARB = 0x88A8;
	public static final int GL_MAX_PROGRAM_PARAMETERS_ARB = 0x88A9;
	public static final int GL_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AA;
	public static final int GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AB;
	public static final int GL_PROGRAM_ATTRIBS_ARB = 0x88AC;
	public static final int GL_MAX_PROGRAM_ATTRIBS_ARB = 0x88AD;
	public static final int GL_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AE;
	public static final int GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AF;
	public static final int GL_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B0;
	public static final int GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B1;
	public static final int GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B2;
	public static final int GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B3;
	public static final int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = 0x88B4;
	public static final int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = 0x88B5;
	public static final int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = 0x88B6;
	public static final int GL_TRANSPOSE_CURRENT_MATRIX_ARB = 0x88B7;
	public static final int GL_MATRIX0_ARB = 0x88C0;
	public static final int GL_MATRIX1_ARB = 0x88C1;
	public static final int GL_MATRIX2_ARB = 0x88C2;
	public static final int GL_MATRIX3_ARB = 0x88C3;
	public static final int GL_MATRIX4_ARB = 0x88C4;
	public static final int GL_MATRIX5_ARB = 0x88C5;
	public static final int GL_MATRIX6_ARB = 0x88C6;
	public static final int GL_MATRIX7_ARB = 0x88C7;
	public static final int GL_MATRIX8_ARB = 0x88C8;
	public static final int GL_MATRIX9_ARB = 0x88C9;
	public static final int GL_MATRIX10_ARB = 0x88CA;
	public static final int GL_MATRIX11_ARB = 0x88CB;
	public static final int GL_MATRIX12_ARB = 0x88CC;
	public static final int GL_MATRIX13_ARB = 0x88CD;
	public static final int GL_MATRIX14_ARB = 0x88CE;
	public static final int GL_MATRIX15_ARB = 0x88CF;
	public static final int GL_MATRIX16_ARB = 0x88D0;
	public static final int GL_MATRIX17_ARB = 0x88D1;
	public static final int GL_MATRIX18_ARB = 0x88D2;
	public static final int GL_MATRIX19_ARB = 0x88D3;
	public static final int GL_MATRIX20_ARB = 0x88D4;
	public static final int GL_MATRIX21_ARB = 0x88D5;
	public static final int GL_MATRIX22_ARB = 0x88D6;
	public static final int GL_MATRIX23_ARB = 0x88D7;
	public static final int GL_MATRIX24_ARB = 0x88D8;
	public static final int GL_MATRIX25_ARB = 0x88D9;
	public static final int GL_MATRIX26_ARB = 0x88DA;
	public static final int GL_MATRIX27_ARB = 0x88DB;
	public static final int GL_MATRIX28_ARB = 0x88DC;
	public static final int GL_MATRIX29_ARB = 0x88DD;
	public static final int GL_MATRIX30_ARB = 0x88DE;
	public static final int GL_MATRIX31_ARB = 0x88DF;
	public static final int GL_ARB_vertex_shader = 1;
	public static final int GL_VERTEX_SHADER_ARB = 0x8B31;
	public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB = 0x8B4A;
	public static final int GL_MAX_VARYING_FLOATS_ARB = 0x8B4B;
	public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB = 0x8B4C;
	public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = 0x8B4D;
	public static final int GL_OBJECT_ACTIVE_ATTRIBUTES_ARB = 0x8B89;
	public static final int GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = 0x8B8A;
	public static final int GL_ARB_vertex_type_2_10_10_10_rev = 1;
	public static final int GL_INT_2_10_10_10_REV = 0x8D9F;
	public static final int GL_ARB_viewport_array = 1;
	public static final int GL_MAX_VIEWPORTS = 0x825B;
	public static final int GL_VIEWPORT_SUBPIXEL_BITS = 0x825C;
	public static final int GL_VIEWPORT_BOUNDS_RANGE = 0x825D;
	public static final int GL_LAYER_PROVOKING_VERTEX = 0x825E;
	public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;
	public static final int GL_UNDEFINED_VERTEX = 0x8260;
	public static final int GL_ARB_window_pos = 1;
	public static final int GL_ATIX_point_sprites = 1;
	public static final int GL_TEXTURE_POINT_MODE_ATIX = 0x60B0;
	public static final int GL_TEXTURE_POINT_ONE_COORD_ATIX = 0x60B1;
	public static final int GL_TEXTURE_POINT_SPRITE_ATIX = 0x60B2;
	public static final int GL_POINT_SPRITE_CULL_MODE_ATIX = 0x60B3;
	public static final int GL_POINT_SPRITE_CULL_CENTER_ATIX = 0x60B4;
	public static final int GL_POINT_SPRITE_CULL_CLIP_ATIX = 0x60B5;
	public static final int GL_ATIX_texture_env_combine3 = 1;
	public static final int GL_MODULATE_ADD_ATIX = 0x8744;
	public static final int GL_MODULATE_SIGNED_ADD_ATIX = 0x8745;
	public static final int GL_MODULATE_SUBTRACT_ATIX = 0x8746;
	public static final int GL_ATIX_texture_env_route = 1;
	public static final int GL_SECONDARY_COLOR_ATIX = 0x8747;
	public static final int GL_TEXTURE_OUTPUT_RGB_ATIX = 0x8748;
	public static final int GL_TEXTURE_OUTPUT_ALPHA_ATIX = 0x8749;
	public static final int GL_ATIX_vertex_shader_output_point_size = 1;
	public static final int GL_OUTPUT_POINT_SIZE_ATIX = 0x610E;
	public static final int GL_ATI_draw_buffers = 1;
	public static final int GL_MAX_DRAW_BUFFERS_ATI = 0x8824;
	public static final int GL_DRAW_BUFFER0_ATI = 0x8825;
	public static final int GL_DRAW_BUFFER1_ATI = 0x8826;
	public static final int GL_DRAW_BUFFER2_ATI = 0x8827;
	public static final int GL_DRAW_BUFFER3_ATI = 0x8828;
	public static final int GL_DRAW_BUFFER4_ATI = 0x8829;
	public static final int GL_DRAW_BUFFER5_ATI = 0x882A;
	public static final int GL_DRAW_BUFFER6_ATI = 0x882B;
	public static final int GL_DRAW_BUFFER7_ATI = 0x882C;
	public static final int GL_DRAW_BUFFER8_ATI = 0x882D;
	public static final int GL_DRAW_BUFFER9_ATI = 0x882E;
	public static final int GL_DRAW_BUFFER10_ATI = 0x882F;
	public static final int GL_DRAW_BUFFER11_ATI = 0x8830;
	public static final int GL_DRAW_BUFFER12_ATI = 0x8831;
	public static final int GL_DRAW_BUFFER13_ATI = 0x8832;
	public static final int GL_DRAW_BUFFER14_ATI = 0x8833;
	public static final int GL_DRAW_BUFFER15_ATI = 0x8834;
	public static final int GL_ATI_element_array = 1;
	public static final int GL_ELEMENT_ARRAY_ATI = 0x8768;
	public static final int GL_ELEMENT_ARRAY_TYPE_ATI = 0x8769;
	public static final int GL_ELEMENT_ARRAY_POINTER_ATI = 0x876A;
	public static final int GL_ATI_envmap_bumpmap = 1;
	public static final int GL_BUMP_ROT_MATRIX_ATI = 0x8775;
	public static final int GL_BUMP_ROT_MATRIX_SIZE_ATI = 0x8776;
	public static final int GL_BUMP_NUM_TEX_UNITS_ATI = 0x8777;
	public static final int GL_BUMP_TEX_UNITS_ATI = 0x8778;
	public static final int GL_DUDV_ATI = 0x8779;
	public static final int GL_DU8DV8_ATI = 0x877A;
	public static final int GL_BUMP_ENVMAP_ATI = 0x877B;
	public static final int GL_BUMP_TARGET_ATI = 0x877C;
	public static final int GL_ATI_fragment_shader = 1;
	public static final int GL_RED_BIT_ATI = 0x00000001;
	public static final int GL_2X_BIT_ATI = 0x00000001;
	public static final int GL_4X_BIT_ATI = 0x00000002;
	public static final int GL_GREEN_BIT_ATI = 0x00000002;
	public static final int GL_COMP_BIT_ATI = 0x00000002;
	public static final int GL_BLUE_BIT_ATI = 0x00000004;
	public static final int GL_8X_BIT_ATI = 0x00000004;
	public static final int GL_NEGATE_BIT_ATI = 0x00000004;
	public static final int GL_BIAS_BIT_ATI = 0x00000008;
	public static final int GL_HALF_BIT_ATI = 0x00000008;
	public static final int GL_QUARTER_BIT_ATI = 0x00000010;
	public static final int GL_EIGHTH_BIT_ATI = 0x00000020;
	public static final int GL_SATURATE_BIT_ATI = 0x00000040;
	public static final int GL_FRAGMENT_SHADER_ATI = 0x8920;
	public static final int GL_REG_0_ATI = 0x8921;
	public static final int GL_REG_1_ATI = 0x8922;
	public static final int GL_REG_2_ATI = 0x8923;
	public static final int GL_REG_3_ATI = 0x8924;
	public static final int GL_REG_4_ATI = 0x8925;
	public static final int GL_REG_5_ATI = 0x8926;
	public static final int GL_CON_0_ATI = 0x8941;
	public static final int GL_CON_1_ATI = 0x8942;
	public static final int GL_CON_2_ATI = 0x8943;
	public static final int GL_CON_3_ATI = 0x8944;
	public static final int GL_CON_4_ATI = 0x8945;
	public static final int GL_CON_5_ATI = 0x8946;
	public static final int GL_CON_6_ATI = 0x8947;
	public static final int GL_CON_7_ATI = 0x8948;
	public static final int GL_MOV_ATI = 0x8961;
	public static final int GL_ADD_ATI = 0x8963;
	public static final int GL_MUL_ATI = 0x8964;
	public static final int GL_SUB_ATI = 0x8965;
	public static final int GL_DOT3_ATI = 0x8966;
	public static final int GL_DOT4_ATI = 0x8967;
	public static final int GL_MAD_ATI = 0x8968;
	public static final int GL_LERP_ATI = 0x8969;
	public static final int GL_CND_ATI = 0x896A;
	public static final int GL_CND0_ATI = 0x896B;
	public static final int GL_DOT2_ADD_ATI = 0x896C;
	public static final int GL_SECONDARY_INTERPOLATOR_ATI = 0x896D;
	public static final int GL_NUM_FRAGMENT_REGISTERS_ATI = 0x896E;
	public static final int GL_NUM_FRAGMENT_CONSTANTS_ATI = 0x896F;
	public static final int GL_NUM_PASSES_ATI = 0x8970;
	public static final int GL_NUM_INSTRUCTIONS_PER_PASS_ATI = 0x8971;
	public static final int GL_NUM_INSTRUCTIONS_TOTAL_ATI = 0x8972;
	public static final int GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI = 0x8973;
	public static final int GL_NUM_LOOPBACK_COMPONENTS_ATI = 0x8974;
	public static final int GL_COLOR_ALPHA_PAIRING_ATI = 0x8975;
	public static final int GL_SWIZZLE_STR_ATI = 0x8976;
	public static final int GL_SWIZZLE_STQ_ATI = 0x8977;
	public static final int GL_SWIZZLE_STR_DR_ATI = 0x8978;
	public static final int GL_SWIZZLE_STQ_DQ_ATI = 0x8979;
	public static final int GL_SWIZZLE_STRQ_ATI = 0x897A;
	public static final int GL_SWIZZLE_STRQ_DQ_ATI = 0x897B;
	public static final int GL_ATI_map_object_buffer = 1;
	public static final int GL_ATI_meminfo = 1;
	public static final int GL_VBO_FREE_MEMORY_ATI = 0x87FB;
	public static final int GL_TEXTURE_FREE_MEMORY_ATI = 0x87FC;
	public static final int GL_RENDERBUFFER_FREE_MEMORY_ATI = 0x87FD;
	public static final int GL_ATI_pn_triangles = 1;
	public static final int GL_PN_TRIANGLES_ATI = 0x87F0;
	public static final int GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F1;
	public static final int GL_PN_TRIANGLES_POINT_MODE_ATI = 0x87F2;
	public static final int GL_PN_TRIANGLES_NORMAL_MODE_ATI = 0x87F3;
	public static final int GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 0x87F4;
	public static final int GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI = 0x87F5;
	public static final int GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI = 0x87F6;
	public static final int GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI = 0x87F7;
	public static final int GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI = 0x87F8;
	public static final int GL_ATI_separate_stencil = 1;
	public static final int GL_STENCIL_BACK_FUNC_ATI = 0x8800;
	public static final int GL_STENCIL_BACK_FAIL_ATI = 0x8801;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = 0x8802;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = 0x8803;
	public static final int GL_ATI_shader_texture_lod = 1;
	public static final int GL_ATI_text_fragment_shader = 1;
	public static final int GL_TEXT_FRAGMENT_SHADER_ATI = 0x8200;
	public static final int GL_ATI_texture_compression_3dc = 1;
	public static final int GL_COMPRESSED_LUMINANCE_ALPHA_3DC_ATI = 0x8837;
	public static final int GL_ATI_texture_env_combine3 = 1;
	public static final int GL_MODULATE_ADD_ATI = 0x8744;
	public static final int GL_MODULATE_SIGNED_ADD_ATI = 0x8745;
	public static final int GL_MODULATE_SUBTRACT_ATI = 0x8746;
	public static final int GL_ATI_texture_float = 1;
	public static final int GL_RGBA_FLOAT32_ATI = 0x8814;
	public static final int GL_RGB_FLOAT32_ATI = 0x8815;
	public static final int GL_ALPHA_FLOAT32_ATI = 0x8816;
	public static final int GL_INTENSITY_FLOAT32_ATI = 0x8817;
	public static final int GL_LUMINANCE_FLOAT32_ATI = 0x8818;
	public static final int GL_LUMINANCE_ALPHA_FLOAT32_ATI = 0x8819;
	public static final int GL_RGBA_FLOAT16_ATI = 0x881A;
	public static final int GL_RGB_FLOAT16_ATI = 0x881B;
	public static final int GL_ALPHA_FLOAT16_ATI = 0x881C;
	public static final int GL_INTENSITY_FLOAT16_ATI = 0x881D;
	public static final int GL_LUMINANCE_FLOAT16_ATI = 0x881E;
	public static final int GL_LUMINANCE_ALPHA_FLOAT16_ATI = 0x881F;
	public static final int GL_ATI_texture_mirror_once = 1;
	public static final int GL_MIRROR_CLAMP_ATI = 0x8742;
	public static final int GL_MIRROR_CLAMP_TO_EDGE_ATI = 0x8743;
	public static final int GL_ATI_vertex_array_object = 1;
	public static final int GL_STATIC_ATI = 0x8760;
	public static final int GL_DYNAMIC_ATI = 0x8761;
	public static final int GL_PRESERVE_ATI = 0x8762;
	public static final int GL_DISCARD_ATI = 0x8763;
	public static final int GL_OBJECT_BUFFER_SIZE_ATI = 0x8764;
	public static final int GL_OBJECT_BUFFER_USAGE_ATI = 0x8765;
	public static final int GL_ARRAY_OBJECT_BUFFER_ATI = 0x8766;
	public static final int GL_ARRAY_OBJECT_OFFSET_ATI = 0x8767;
	public static final int GL_ATI_vertex_attrib_array_object = 1;
	public static final int GL_ATI_vertex_streams = 1;
	public static final int GL_MAX_VERTEX_STREAMS_ATI = 0x876B;
	public static final int GL_VERTEX_SOURCE_ATI = 0x876C;
	public static final int GL_VERTEX_STREAM0_ATI = 0x876D;
	public static final int GL_VERTEX_STREAM1_ATI = 0x876E;
	public static final int GL_VERTEX_STREAM2_ATI = 0x876F;
	public static final int GL_VERTEX_STREAM3_ATI = 0x8770;
	public static final int GL_VERTEX_STREAM4_ATI = 0x8771;
	public static final int GL_VERTEX_STREAM5_ATI = 0x8772;
	public static final int GL_VERTEX_STREAM6_ATI = 0x8773;
	public static final int GL_VERTEX_STREAM7_ATI = 0x8774;
	public static final int GL_EXT_422_pixels = 1;
	public static final int GL_422_EXT = 0x80CC;
	public static final int GL_422_REV_EXT = 0x80CD;
	public static final int GL_422_AVERAGE_EXT = 0x80CE;
	public static final int GL_422_REV_AVERAGE_EXT = 0x80CF;
	public static final int GL_EXT_Cg_shader = 1;
	public static final int GL_CG_VERTEX_SHADER_EXT = 0x890E;
	public static final int GL_CG_FRAGMENT_SHADER_EXT = 0x890F;
	public static final int GL_EXT_abgr = 1;
	public static final int GL_ABGR_EXT = 0x8000;
	public static final int GL_EXT_bgra = 1;
	public static final int GL_BGR_EXT = 0x80E0;
	public static final int GL_BGRA_EXT = 0x80E1;
	public static final int GL_EXT_bindable_uniform = 1;
	public static final int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = 0x8DE2;
	public static final int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3;
	public static final int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4;
	public static final int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = 0x8DED;
	public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;
	public static final int GL_UNIFORM_BUFFER_BINDING_EXT = 0x8DEF;
	public static final int GL_EXT_blend_color = 1;
	public static final int GL_CONSTANT_COLOR_EXT = 0x8001;
	public static final int GL_ONE_MINUS_CONSTANT_COLOR_EXT = 0x8002;
	public static final int GL_CONSTANT_ALPHA_EXT = 0x8003;
	public static final int GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 0x8004;
	public static final int GL_BLEND_COLOR_EXT = 0x8005;
	public static final int GL_EXT_blend_equation_separate = 1;
	public static final int GL_BLEND_EQUATION_RGB_EXT = 0x8009;
	public static final int GL_BLEND_EQUATION_ALPHA_EXT = 0x883D;
	public static final int GL_EXT_blend_func_separate = 1;
	public static final int GL_BLEND_DST_RGB_EXT = 0x80C8;
	public static final int GL_BLEND_SRC_RGB_EXT = 0x80C9;
	public static final int GL_BLEND_DST_ALPHA_EXT = 0x80CA;
	public static final int GL_BLEND_SRC_ALPHA_EXT = 0x80CB;
	public static final int GL_EXT_blend_logic_op = 1;
	public static final int GL_EXT_blend_minmax = 1;
	public static final int GL_FUNC_ADD_EXT = 0x8006;
	public static final int GL_MIN_EXT = 0x8007;
	public static final int GL_MAX_EXT = 0x8008;
	public static final int GL_BLEND_EQUATION_EXT = 0x8009;
	public static final int GL_EXT_blend_subtract = 1;
	public static final int GL_FUNC_SUBTRACT_EXT = 0x800A;
	public static final int GL_FUNC_REVERSE_SUBTRACT_EXT = 0x800B;
	public static final int GL_EXT_clip_volume_hint = 1;
	public static final int GL_CLIP_VOLUME_CLIPPING_HINT_EXT = 0x80F0;
	public static final int GL_EXT_cmyka = 1;
	public static final int GL_CMYK_EXT = 0x800C;
	public static final int GL_CMYKA_EXT = 0x800D;
	public static final int GL_PACK_CMYK_HINT_EXT = 0x800E;
	public static final int GL_UNPACK_CMYK_HINT_EXT = 0x800F;
	public static final int GL_EXT_color_subtable = 1;
	public static final int GL_EXT_compiled_vertex_array = 1;
	public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 0x81A8;
	public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 0x81A9;
	public static final int GL_EXT_convolution = 1;
	public static final int GL_CONVOLUTION_1D_EXT = 0x8010;
	public static final int GL_CONVOLUTION_2D_EXT = 0x8011;
	public static final int GL_SEPARABLE_2D_EXT = 0x8012;
	public static final int GL_CONVOLUTION_BORDER_MODE_EXT = 0x8013;
	public static final int GL_CONVOLUTION_FILTER_SCALE_EXT = 0x8014;
	public static final int GL_CONVOLUTION_FILTER_BIAS_EXT = 0x8015;
	public static final int GL_REDUCE_EXT = 0x8016;
	public static final int GL_CONVOLUTION_FORMAT_EXT = 0x8017;
	public static final int GL_CONVOLUTION_WIDTH_EXT = 0x8018;
	public static final int GL_CONVOLUTION_HEIGHT_EXT = 0x8019;
	public static final int GL_MAX_CONVOLUTION_WIDTH_EXT = 0x801A;
	public static final int GL_MAX_CONVOLUTION_HEIGHT_EXT = 0x801B;
	public static final int GL_POST_CONVOLUTION_RED_SCALE_EXT = 0x801C;
	public static final int GL_POST_CONVOLUTION_GREEN_SCALE_EXT = 0x801D;
	public static final int GL_POST_CONVOLUTION_BLUE_SCALE_EXT = 0x801E;
	public static final int GL_POST_CONVOLUTION_ALPHA_SCALE_EXT = 0x801F;
	public static final int GL_POST_CONVOLUTION_RED_BIAS_EXT = 0x8020;
	public static final int GL_POST_CONVOLUTION_GREEN_BIAS_EXT = 0x8021;
	public static final int GL_POST_CONVOLUTION_BLUE_BIAS_EXT = 0x8022;
	public static final int GL_POST_CONVOLUTION_ALPHA_BIAS_EXT = 0x8023;
	public static final int GL_EXT_coordinate_frame = 1;
	public static final int GL_TANGENT_ARRAY_EXT = 0x8439;
	public static final int GL_BINORMAL_ARRAY_EXT = 0x843A;
	public static final int GL_CURRENT_TANGENT_EXT = 0x843B;
	public static final int GL_CURRENT_BINORMAL_EXT = 0x843C;
	public static final int GL_TANGENT_ARRAY_TYPE_EXT = 0x843E;
	public static final int GL_TANGENT_ARRAY_STRIDE_EXT = 0x843F;
	public static final int GL_BINORMAL_ARRAY_TYPE_EXT = 0x8440;
	public static final int GL_BINORMAL_ARRAY_STRIDE_EXT = 0x8441;
	public static final int GL_TANGENT_ARRAY_POINTER_EXT = 0x8442;
	public static final int GL_BINORMAL_ARRAY_POINTER_EXT = 0x8443;
	public static final int GL_MAP1_TANGENT_EXT = 0x8444;
	public static final int GL_MAP2_TANGENT_EXT = 0x8445;
	public static final int GL_MAP1_BINORMAL_EXT = 0x8446;
	public static final int GL_MAP2_BINORMAL_EXT = 0x8447;
	public static final int GL_EXT_copy_texture = 1;
	public static final int GL_EXT_cull_vertex = 1;
	public static final int GL_CULL_VERTEX_EXT = 0x81AA;
	public static final int GL_CULL_VERTEX_EYE_POSITION_EXT = 0x81AB;
	public static final int GL_CULL_VERTEX_OBJECT_POSITION_EXT = 0x81AC;
	public static final int GL_EXT_debug_marker = 1;
	public static final int GL_EXT_depth_bounds_test = 1;
	public static final int GL_DEPTH_BOUNDS_TEST_EXT = 0x8890;
	public static final int GL_DEPTH_BOUNDS_EXT = 0x8891;
	public static final int GL_EXT_direct_state_access = 1;
	public static final int GL_PROGRAM_MATRIX_EXT = 0x8E2D;
	public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 0x8E2E;
	public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;
	public static final int GL_EXT_draw_buffers2 = 1;
	public static final int GL_EXT_draw_instanced = 1;
	public static final int GL_EXT_draw_range_elements = 1;
	public static final int GL_MAX_ELEMENTS_VERTICES_EXT = 0x80E8;
	public static final int GL_MAX_ELEMENTS_INDICES_EXT = 0x80E9;
	public static final int GL_EXT_fog_coord = 1;
	public static final int GL_FOG_COORDINATE_SOURCE_EXT = 0x8450;
	public static final int GL_FOG_COORDINATE_EXT = 0x8451;
	public static final int GL_FRAGMENT_DEPTH_EXT = 0x8452;
	public static final int GL_CURRENT_FOG_COORDINATE_EXT = 0x8453;
	public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 0x8454;
	public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 0x8455;
	public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 0x8456;
	public static final int GL_FOG_COORDINATE_ARRAY_EXT = 0x8457;
	public static final int GL_EXT_fragment_lighting = 1;
	public static final int GL_FRAGMENT_LIGHTING_EXT = 0x8400;
	public static final int GL_FRAGMENT_COLOR_MATERIAL_EXT = 0x8401;
	public static final int GL_FRAGMENT_COLOR_MATERIAL_FACE_EXT = 0x8402;
	public static final int GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_EXT = 0x8403;
	public static final int GL_MAX_FRAGMENT_LIGHTS_EXT = 0x8404;
	public static final int GL_MAX_ACTIVE_LIGHTS_EXT = 0x8405;
	public static final int GL_CURRENT_RASTER_NORMAL_EXT = 0x8406;
	public static final int GL_LIGHT_ENV_MODE_EXT = 0x8407;
	public static final int GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_EXT = 0x8408;
	public static final int GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_EXT = 0x8409;
	public static final int GL_FRAGMENT_LIGHT_MODEL_AMBIENT_EXT = 0x840A;
	public static final int GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_EXT = 0x840B;
	public static final int GL_FRAGMENT_LIGHT0_EXT = 0x840C;
	public static final int GL_FRAGMENT_LIGHT7_EXT = 0x8413;
	public static final int GL_EXT_framebuffer_blit = 1;
	public static final int GL_DRAW_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
	public static final int GL_READ_FRAMEBUFFER_EXT = 0x8CA8;
	public static final int GL_DRAW_FRAMEBUFFER_EXT = 0x8CA9;
	public static final int GL_READ_FRAMEBUFFER_BINDING_EXT = 0x8CAA;
	public static final int GL_EXT_framebuffer_multisample = 1;
	public static final int GL_RENDERBUFFER_SAMPLES_EXT = 0x8CAB;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 0x8D56;
	public static final int GL_MAX_SAMPLES_EXT = 0x8D57;
	public static final int GL_EXT_framebuffer_multisample_blit_scaled = 1;
	public static final int GL_SCALED_RESOLVE_FASTEST_EXT = 0x90BA;
	public static final int GL_SCALED_RESOLVE_NICEST_EXT = 0x90BB;
	public static final int GL_EXT_framebuffer_object = 1;
	public static final int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = 0x0506;
	public static final int GL_MAX_RENDERBUFFER_SIZE_EXT = 0x84E8;
	public static final int GL_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
	public static final int GL_RENDERBUFFER_BINDING_EXT = 0x8CA7;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT = 0x8CD0;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT = 0x8CD1;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT = 0x8CD2;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = 0x8CD3;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT = 0x8CD4;
	public static final int GL_FRAMEBUFFER_COMPLETE_EXT = 0x8CD5;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT = 0x8CD6;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = 0x8CD7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT = 0x8CD9;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT = 0x8CDA;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT = 0x8CDB;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT = 0x8CDC;
	public static final int GL_FRAMEBUFFER_UNSUPPORTED_EXT = 0x8CDD;
	public static final int GL_MAX_COLOR_ATTACHMENTS_EXT = 0x8CDF;
	public static final int GL_COLOR_ATTACHMENT0_EXT = 0x8CE0;
	public static final int GL_COLOR_ATTACHMENT1_EXT = 0x8CE1;
	public static final int GL_COLOR_ATTACHMENT2_EXT = 0x8CE2;
	public static final int GL_COLOR_ATTACHMENT3_EXT = 0x8CE3;
	public static final int GL_COLOR_ATTACHMENT4_EXT = 0x8CE4;
	public static final int GL_COLOR_ATTACHMENT5_EXT = 0x8CE5;
	public static final int GL_COLOR_ATTACHMENT6_EXT = 0x8CE6;
	public static final int GL_COLOR_ATTACHMENT7_EXT = 0x8CE7;
	public static final int GL_COLOR_ATTACHMENT8_EXT = 0x8CE8;
	public static final int GL_COLOR_ATTACHMENT9_EXT = 0x8CE9;
	public static final int GL_COLOR_ATTACHMENT10_EXT = 0x8CEA;
	public static final int GL_COLOR_ATTACHMENT11_EXT = 0x8CEB;
	public static final int GL_COLOR_ATTACHMENT12_EXT = 0x8CEC;
	public static final int GL_COLOR_ATTACHMENT13_EXT = 0x8CED;
	public static final int GL_COLOR_ATTACHMENT14_EXT = 0x8CEE;
	public static final int GL_COLOR_ATTACHMENT15_EXT = 0x8CEF;
	public static final int GL_DEPTH_ATTACHMENT_EXT = 0x8D00;
	public static final int GL_STENCIL_ATTACHMENT_EXT = 0x8D20;
	public static final int GL_FRAMEBUFFER_EXT = 0x8D40;
	public static final int GL_RENDERBUFFER_EXT = 0x8D41;
	public static final int GL_RENDERBUFFER_WIDTH_EXT = 0x8D42;
	public static final int GL_RENDERBUFFER_HEIGHT_EXT = 0x8D43;
	public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_EXT = 0x8D44;
	public static final int GL_STENCIL_INDEX1_EXT = 0x8D46;
	public static final int GL_STENCIL_INDEX4_EXT = 0x8D47;
	public static final int GL_STENCIL_INDEX8_EXT = 0x8D48;
	public static final int GL_STENCIL_INDEX16_EXT = 0x8D49;
	public static final int GL_RENDERBUFFER_RED_SIZE_EXT = 0x8D50;
	public static final int GL_RENDERBUFFER_GREEN_SIZE_EXT = 0x8D51;
	public static final int GL_RENDERBUFFER_BLUE_SIZE_EXT = 0x8D52;
	public static final int GL_RENDERBUFFER_ALPHA_SIZE_EXT = 0x8D53;
	public static final int GL_RENDERBUFFER_DEPTH_SIZE_EXT = 0x8D54;
	public static final int GL_RENDERBUFFER_STENCIL_SIZE_EXT = 0x8D55;
	public static final int GL_EXT_framebuffer_sRGB = 1;
	public static final int GL_FRAMEBUFFER_SRGB_EXT = 0x8DB9;
	public static final int GL_FRAMEBUFFER_SRGB_CAPABLE_EXT = 0x8DBA;
	public static final int GL_EXT_geometry_shader4 = 1;
	public static final int GL_LINES_ADJACENCY_EXT = 0xA;
	public static final int GL_LINE_STRIP_ADJACENCY_EXT = 0xB;
	public static final int GL_TRIANGLES_ADJACENCY_EXT = 0xC;
	public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = 0xD;
	public static final int GL_PROGRAM_POINT_SIZE_EXT = 0x8642;
	public static final int GL_MAX_VARYING_COMPONENTS_EXT = 0x8B4B;
	public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = 0x8C29;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 0x8CD4;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = 0x8DA7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 0x8DA8;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT = 0x8DA9;
	public static final int GL_GEOMETRY_SHADER_EXT = 0x8DD9;
	public static final int GL_GEOMETRY_VERTICES_OUT_EXT = 0x8DDA;
	public static final int GL_GEOMETRY_INPUT_TYPE_EXT = 0x8DDB;
	public static final int GL_GEOMETRY_OUTPUT_TYPE_EXT = 0x8DDC;
	public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT = 0x8DDD;
	public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_EXT = 0x8DDE;
	public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT = 0x8DDF;
	public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT = 0x8DE0;
	public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = 0x8DE1;
	public static final int GL_EXT_gpu_program_parameters = 1;
	public static final int GL_EXT_gpu_shader4 = 1;
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;
	public static final int GL_SAMPLER_1D_ARRAY_EXT = 0x8DC0;
	public static final int GL_SAMPLER_2D_ARRAY_EXT = 0x8DC1;
	public static final int GL_SAMPLER_BUFFER_EXT = 0x8DC2;
	public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 0x8DC3;
	public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 0x8DC4;
	public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 0x8DC5;
	public static final int GL_UNSIGNED_INT_VEC2_EXT = 0x8DC6;
	public static final int GL_UNSIGNED_INT_VEC3_EXT = 0x8DC7;
	public static final int GL_UNSIGNED_INT_VEC4_EXT = 0x8DC8;
	public static final int GL_INT_SAMPLER_1D_EXT = 0x8DC9;
	public static final int GL_INT_SAMPLER_2D_EXT = 0x8DCA;
	public static final int GL_INT_SAMPLER_3D_EXT = 0x8DCB;
	public static final int GL_INT_SAMPLER_CUBE_EXT = 0x8DCC;
	public static final int GL_INT_SAMPLER_2D_RECT_EXT = 0x8DCD;
	public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 0x8DCE;
	public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 0x8DCF;
	public static final int GL_INT_SAMPLER_BUFFER_EXT = 0x8DD0;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 0x8DD1;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 0x8DD2;
	public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 0x8DD3;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 0x8DD4;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 0x8DD5;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 0x8DD6;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 0x8DD7;
	public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 0x8DD8;
	public static final int GL_EXT_histogram = 1;
	public static final int GL_HISTOGRAM_EXT = 0x8024;
	public static final int GL_PROXY_HISTOGRAM_EXT = 0x8025;
	public static final int GL_HISTOGRAM_WIDTH_EXT = 0x8026;
	public static final int GL_HISTOGRAM_FORMAT_EXT = 0x8027;
	public static final int GL_HISTOGRAM_RED_SIZE_EXT = 0x8028;
	public static final int GL_HISTOGRAM_GREEN_SIZE_EXT = 0x8029;
	public static final int GL_HISTOGRAM_BLUE_SIZE_EXT = 0x802A;
	public static final int GL_HISTOGRAM_ALPHA_SIZE_EXT = 0x802B;
	public static final int GL_HISTOGRAM_LUMINANCE_SIZE_EXT = 0x802C;
	public static final int GL_HISTOGRAM_SINK_EXT = 0x802D;
	public static final int GL_MINMAX_EXT = 0x802E;
	public static final int GL_MINMAX_FORMAT_EXT = 0x802F;
	public static final int GL_MINMAX_SINK_EXT = 0x8030;
	public static final int GL_EXT_index_array_formats = 1;
	public static final int GL_EXT_index_func = 1;
	public static final int GL_EXT_index_material = 1;
	public static final int GL_EXT_index_texture = 1;
	public static final int GL_EXT_light_texture = 1;
	public static final int GL_FRAGMENT_MATERIAL_EXT = 0x8349;
	public static final int GL_FRAGMENT_NORMAL_EXT = 0x834A;
	public static final int GL_FRAGMENT_COLOR_EXT = 0x834C;
	public static final int GL_ATTENUATION_EXT = 0x834D;
	public static final int GL_SHADOW_ATTENUATION_EXT = 0x834E;
	public static final int GL_TEXTURE_APPLICATION_MODE_EXT = 0x834F;
	public static final int GL_TEXTURE_LIGHT_EXT = 0x8350;
	public static final int GL_TEXTURE_MATERIAL_FACE_EXT = 0x8351;
	public static final int GL_TEXTURE_MATERIAL_PARAMETER_EXT = 0x8352;
	public static final int GL_EXT_misc_attribute = 1;
	public static final int GL_EXT_multi_draw_arrays = 1;
	public static final int GL_EXT_multisample = 1;
	public static final int GL_MULTISAMPLE_EXT = 0x809D;
	public static final int GL_SAMPLE_ALPHA_TO_MASK_EXT = 0x809E;
	public static final int GL_SAMPLE_ALPHA_TO_ONE_EXT = 0x809F;
	public static final int GL_SAMPLE_MASK_EXT = 0x80A0;
	public static final int GL_1PASS_EXT = 0x80A1;
	public static final int GL_2PASS_0_EXT = 0x80A2;
	public static final int GL_2PASS_1_EXT = 0x80A3;
	public static final int GL_4PASS_0_EXT = 0x80A4;
	public static final int GL_4PASS_1_EXT = 0x80A5;
	public static final int GL_4PASS_2_EXT = 0x80A6;
	public static final int GL_4PASS_3_EXT = 0x80A7;
	public static final int GL_SAMPLE_BUFFERS_EXT = 0x80A8;
	public static final int GL_SAMPLES_EXT = 0x80A9;
	public static final int GL_SAMPLE_MASK_VALUE_EXT = 0x80AA;
	public static final int GL_SAMPLE_MASK_INVERT_EXT = 0x80AB;
	public static final int GL_SAMPLE_PATTERN_EXT = 0x80AC;
	public static final int GL_MULTISAMPLE_BIT_EXT = 0x20000000;
	public static final int GL_EXT_packed_depth_stencil = 1;
	public static final int GL_DEPTH_STENCIL_EXT = 0x84F9;
	public static final int GL_UNSIGNED_INT_24_8_EXT = 0x84FA;
	public static final int GL_DEPTH24_STENCIL8_EXT = 0x88F0;
	public static final int GL_TEXTURE_STENCIL_SIZE_EXT = 0x88F1;
	public static final int GL_EXT_packed_float = 1;
	public static final int GL_R11F_G11F_B10F_EXT = 0x8C3A;
	public static final int GL_UNSIGNED_INT_10F_11F_11F_REV_EXT = 0x8C3B;
	public static final int GL_RGBA_SIGNED_COMPONENTS_EXT = 0x8C3C;
	public static final int GL_EXT_packed_pixels = 1;
	public static final int GL_UNSIGNED_BYTE_3_3_2_EXT = 0x8032;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4_EXT = 0x8033;
	public static final int GL_UNSIGNED_SHORT_5_5_5_1_EXT = 0x8034;
	public static final int GL_UNSIGNED_INT_8_8_8_8_EXT = 0x8035;
	public static final int GL_UNSIGNED_INT_10_10_10_2_EXT = 0x8036;
	public static final int GL_EXT_paletted_texture = 1;
	public static final int GL_COLOR_TABLE_FORMAT_EXT = 0x80D8;
	public static final int GL_COLOR_TABLE_WIDTH_EXT = 0x80D9;
	public static final int GL_COLOR_TABLE_RED_SIZE_EXT = 0x80DA;
	public static final int GL_COLOR_TABLE_GREEN_SIZE_EXT = 0x80DB;
	public static final int GL_COLOR_TABLE_BLUE_SIZE_EXT = 0x80DC;
	public static final int GL_COLOR_TABLE_ALPHA_SIZE_EXT = 0x80DD;
	public static final int GL_COLOR_TABLE_LUMINANCE_SIZE_EXT = 0x80DE;
	public static final int GL_COLOR_TABLE_INTENSITY_SIZE_EXT = 0x80DF;
	public static final int GL_TEXTURE_INDEX_SIZE_EXT = 0x80ED;
	public static final int GL_EXT_pixel_buffer_object = 1;
	public static final int GL_PIXEL_PACK_BUFFER_EXT = 0x88EB;
	public static final int GL_PIXEL_UNPACK_BUFFER_EXT = 0x88EC;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING_EXT = 0x88ED;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING_EXT = 0x88EF;
	public static final int GL_EXT_pixel_transform = 1;
	public static final int GL_PIXEL_TRANSFORM_2D_EXT = 0x8330;
	public static final int GL_PIXEL_MAG_FILTER_EXT = 0x8331;
	public static final int GL_PIXEL_MIN_FILTER_EXT = 0x8332;
	public static final int GL_PIXEL_CUBIC_WEIGHT_EXT = 0x8333;
	public static final int GL_CUBIC_EXT = 0x8334;
	public static final int GL_AVERAGE_EXT = 0x8335;
	public static final int GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8336;
	public static final int GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8337;
	public static final int GL_PIXEL_TRANSFORM_2D_MATRIX_EXT = 0x8338;
	public static final int GL_EXT_pixel_transform_color_table = 1;
	public static final int GL_EXT_point_parameters = 1;
	public static final int GL_POINT_SIZE_MIN_EXT = 0x8126;
	public static final int GL_POINT_SIZE_MAX_EXT = 0x8127;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = 0x8128;
	public static final int GL_DISTANCE_ATTENUATION_EXT = 0x8129;
	public static final int GL_EXT_polygon_offset = 1;
	public static final int GL_POLYGON_OFFSET_EXT = 0x8037;
	public static final int GL_POLYGON_OFFSET_FACTOR_EXT = 0x8038;
	public static final int GL_POLYGON_OFFSET_BIAS_EXT = 0x8039;
	public static final int GL_EXT_provoking_vertex = 1;
	public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 0x8E4C;
	public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D;
	public static final int GL_LAST_VERTEX_CONVENTION_EXT = 0x8E4E;
	public static final int GL_PROVOKING_VERTEX_EXT = 0x8E4F;
	public static final int GL_EXT_rescale_normal = 1;
	public static final int GL_RESCALE_NORMAL_EXT = 0x803A;
	public static final int GL_EXT_scene_marker = 1;
	public static final int GL_EXT_secondary_color = 1;
	public static final int GL_COLOR_SUM_EXT = 0x8458;
	public static final int GL_CURRENT_SECONDARY_COLOR_EXT = 0x8459;
	public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 0x845A;
	public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 0x845B;
	public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;
	public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;
	public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;
	public static final int GL_EXT_separate_shader_objects = 1;
	public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;
	public static final int GL_EXT_separate_specular_color = 1;
	public static final int GL_LIGHT_MODEL_COLOR_CONTROL_EXT = 0x81F8;
	public static final int GL_SINGLE_COLOR_EXT = 0x81F9;
	public static final int GL_SEPARATE_SPECULAR_COLOR_EXT = 0x81FA;
	public static final int GL_EXT_shader_image_load_store = 1;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT = 0x00000001;
	public static final int GL_ELEMENT_ARRAY_BARRIER_BIT_EXT = 0x00000002;
	public static final int GL_UNIFORM_BARRIER_BIT_EXT = 0x00000004;
	public static final int GL_TEXTURE_FETCH_BARRIER_BIT_EXT = 0x00000008;
	public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT = 0x00000020;
	public static final int GL_COMMAND_BARRIER_BIT_EXT = 0x00000040;
	public static final int GL_PIXEL_BUFFER_BARRIER_BIT_EXT = 0x00000080;
	public static final int GL_TEXTURE_UPDATE_BARRIER_BIT_EXT = 0x00000100;
	public static final int GL_BUFFER_UPDATE_BARRIER_BIT_EXT = 0x00000200;
	public static final int GL_FRAMEBUFFER_BARRIER_BIT_EXT = 0x00000400;
	public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT_EXT = 0x00000800;
	public static final int GL_ATOMIC_COUNTER_BARRIER_BIT_EXT = 0x00001000;
	public static final int GL_MAX_IMAGE_UNITS_EXT = 0x8F38;
	public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT = 0x8F39;
	public static final int GL_IMAGE_BINDING_NAME_EXT = 0x8F3A;
	public static final int GL_IMAGE_BINDING_LEVEL_EXT = 0x8F3B;
	public static final int GL_IMAGE_BINDING_LAYERED_EXT = 0x8F3C;
	public static final int GL_IMAGE_BINDING_LAYER_EXT = 0x8F3D;
	public static final int GL_IMAGE_BINDING_ACCESS_EXT = 0x8F3E;
	public static final int GL_IMAGE_1D_EXT = 0x904C;
	public static final int GL_IMAGE_2D_EXT = 0x904D;
	public static final int GL_IMAGE_3D_EXT = 0x904E;
	public static final int GL_IMAGE_2D_RECT_EXT = 0x904F;
	public static final int GL_IMAGE_CUBE_EXT = 0x9050;
	public static final int GL_IMAGE_BUFFER_EXT = 0x9051;
	public static final int GL_IMAGE_1D_ARRAY_EXT = 0x9052;
	public static final int GL_IMAGE_2D_ARRAY_EXT = 0x9053;
	public static final int GL_IMAGE_CUBE_MAP_ARRAY_EXT = 0x9054;
	public static final int GL_IMAGE_2D_MULTISAMPLE_EXT = 0x9055;
	public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x9056;
	public static final int GL_INT_IMAGE_1D_EXT = 0x9057;
	public static final int GL_INT_IMAGE_2D_EXT = 0x9058;
	public static final int GL_INT_IMAGE_3D_EXT = 0x9059;
	public static final int GL_INT_IMAGE_2D_RECT_EXT = 0x905A;
	public static final int GL_INT_IMAGE_CUBE_EXT = 0x905B;
	public static final int GL_INT_IMAGE_BUFFER_EXT = 0x905C;
	public static final int GL_INT_IMAGE_1D_ARRAY_EXT = 0x905D;
	public static final int GL_INT_IMAGE_2D_ARRAY_EXT = 0x905E;
	public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT = 0x905F;
	public static final int GL_INT_IMAGE_2D_MULTISAMPLE_EXT = 0x9060;
	public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x9061;
	public static final int GL_UNSIGNED_INT_IMAGE_1D_EXT = 0x9062;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_EXT = 0x9063;
	public static final int GL_UNSIGNED_INT_IMAGE_3D_EXT = 0x9064;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT_EXT = 0x9065;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE_EXT = 0x9066;
	public static final int GL_UNSIGNED_INT_IMAGE_BUFFER_EXT = 0x9067;
	public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY_EXT = 0x9068;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY_EXT = 0x9069;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT = 0x906A;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT = 0x906B;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x906C;
	public static final int GL_MAX_IMAGE_SAMPLES_EXT = 0x906D;
	public static final int GL_IMAGE_BINDING_FORMAT_EXT = 0x906E;
	public static final int GL_ALL_BARRIER_BITS_EXT = 0xFFFFFFFF;
	public static final int GL_EXT_shadow_funcs = 1;
	public static final int GL_EXT_shared_texture_palette = 1;
	public static final int GL_SHARED_TEXTURE_PALETTE_EXT = 0x81FB;
	public static final int GL_EXT_stencil_clear_tag = 1;
	public static final int GL_STENCIL_TAG_BITS_EXT = 0x88F2;
	public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = 0x88F3;
	public static final int GL_EXT_stencil_two_side = 1;
	public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = 0x8910;
	public static final int GL_ACTIVE_STENCIL_FACE_EXT = 0x8911;
	public static final int GL_EXT_stencil_wrap = 1;
	public static final int GL_INCR_WRAP_EXT = 0x8507;
	public static final int GL_DECR_WRAP_EXT = 0x8508;
	public static final int GL_EXT_subtexture = 1;
	public static final int GL_EXT_texture = 1;
	public static final int GL_ALPHA4_EXT = 0x803B;
	public static final int GL_ALPHA8_EXT = 0x803C;
	public static final int GL_ALPHA12_EXT = 0x803D;
	public static final int GL_ALPHA16_EXT = 0x803E;
	public static final int GL_LUMINANCE4_EXT = 0x803F;
	public static final int GL_LUMINANCE8_EXT = 0x8040;
	public static final int GL_LUMINANCE12_EXT = 0x8041;
	public static final int GL_LUMINANCE16_EXT = 0x8042;
	public static final int GL_LUMINANCE4_ALPHA4_EXT = 0x8043;
	public static final int GL_LUMINANCE6_ALPHA2_EXT = 0x8044;
	public static final int GL_LUMINANCE8_ALPHA8_EXT = 0x8045;
	public static final int GL_LUMINANCE12_ALPHA4_EXT = 0x8046;
	public static final int GL_LUMINANCE12_ALPHA12_EXT = 0x8047;
	public static final int GL_LUMINANCE16_ALPHA16_EXT = 0x8048;
	public static final int GL_INTENSITY_EXT = 0x8049;
	public static final int GL_INTENSITY4_EXT = 0x804A;
	public static final int GL_INTENSITY8_EXT = 0x804B;
	public static final int GL_INTENSITY12_EXT = 0x804C;
	public static final int GL_INTENSITY16_EXT = 0x804D;
	public static final int GL_RGB2_EXT = 0x804E;
	public static final int GL_RGB4_EXT = 0x804F;
	public static final int GL_RGB5_EXT = 0x8050;
	public static final int GL_RGB8_EXT = 0x8051;
	public static final int GL_RGB10_EXT = 0x8052;
	public static final int GL_RGB12_EXT = 0x8053;
	public static final int GL_RGB16_EXT = 0x8054;
	public static final int GL_RGBA2_EXT = 0x8055;
	public static final int GL_RGBA4_EXT = 0x8056;
	public static final int GL_RGB5_A1_EXT = 0x8057;
	public static final int GL_RGBA8_EXT = 0x8058;
	public static final int GL_RGB10_A2_EXT = 0x8059;
	public static final int GL_RGBA12_EXT = 0x805A;
	public static final int GL_RGBA16_EXT = 0x805B;
	public static final int GL_TEXTURE_RED_SIZE_EXT = 0x805C;
	public static final int GL_TEXTURE_GREEN_SIZE_EXT = 0x805D;
	public static final int GL_TEXTURE_BLUE_SIZE_EXT = 0x805E;
	public static final int GL_TEXTURE_ALPHA_SIZE_EXT = 0x805F;
	public static final int GL_TEXTURE_LUMINANCE_SIZE_EXT = 0x8060;
	public static final int GL_TEXTURE_INTENSITY_SIZE_EXT = 0x8061;
	public static final int GL_REPLACE_EXT = 0x8062;
	public static final int GL_PROXY_TEXTURE_1D_EXT = 0x8063;
	public static final int GL_PROXY_TEXTURE_2D_EXT = 0x8064;
	public static final int GL_EXT_texture3D = 1;
	public static final int GL_PACK_SKIP_IMAGES_EXT = 0x806B;
	public static final int GL_PACK_IMAGE_HEIGHT_EXT = 0x806C;
	public static final int GL_UNPACK_SKIP_IMAGES_EXT = 0x806D;
	public static final int GL_UNPACK_IMAGE_HEIGHT_EXT = 0x806E;
	public static final int GL_TEXTURE_3D_EXT = 0x806F;
	public static final int GL_PROXY_TEXTURE_3D_EXT = 0x8070;
	public static final int GL_TEXTURE_DEPTH_EXT = 0x8071;
	public static final int GL_TEXTURE_WRAP_R_EXT = 0x8072;
	public static final int GL_MAX_3D_TEXTURE_SIZE_EXT = 0x8073;
	public static final int GL_EXT_texture_array = 1;
	public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT = 0x884E;
	public static final int GL_MAX_ARRAY_TEXTURE_LAYERS_EXT = 0x88FF;
	public static final int GL_TEXTURE_1D_ARRAY_EXT = 0x8C18;
	public static final int GL_PROXY_TEXTURE_1D_ARRAY_EXT = 0x8C19;
	public static final int GL_TEXTURE_2D_ARRAY_EXT = 0x8C1A;
	public static final int GL_PROXY_TEXTURE_2D_ARRAY_EXT = 0x8C1B;
	public static final int GL_TEXTURE_BINDING_1D_ARRAY_EXT = 0x8C1C;
	public static final int GL_TEXTURE_BINDING_2D_ARRAY_EXT = 0x8C1D;
	public static final int GL_EXT_texture_buffer_object = 1;
	public static final int GL_TEXTURE_BUFFER_EXT = 0x8C2A;
	public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 0x8C2B;
	public static final int GL_TEXTURE_BINDING_BUFFER_EXT = 0x8C2C;
	public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 0x8C2D;
	public static final int GL_TEXTURE_BUFFER_FORMAT_EXT = 0x8C2E;
	public static final int GL_EXT_texture_compression_dxt1 = 1;
	public static final int GL_EXT_texture_compression_latc = 1;
	public static final int GL_COMPRESSED_LUMINANCE_LATC1_EXT = 0x8C70;
	public static final int GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT = 0x8C71;
	public static final int GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT = 0x8C72;
	public static final int GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT = 0x8C73;
	public static final int GL_EXT_texture_compression_rgtc = 1;
	public static final int GL_COMPRESSED_RED_RGTC1_EXT = 0x8DBB;
	public static final int GL_COMPRESSED_SIGNED_RED_RGTC1_EXT = 0x8DBC;
	public static final int GL_COMPRESSED_RED_GREEN_RGTC2_EXT = 0x8DBD;
	public static final int GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT = 0x8DBE;
	public static final int GL_EXT_texture_compression_s3tc = 1;
	public static final int GL_COMPRESSED_RGB_S3TC_DXT1_EXT = 0x83F0;
	public static final int GL_COMPRESSED_RGBA_S3TC_DXT1_EXT = 0x83F1;
	public static final int GL_COMPRESSED_RGBA_S3TC_DXT3_EXT = 0x83F2;
	public static final int GL_COMPRESSED_RGBA_S3TC_DXT5_EXT = 0x83F3;
	public static final int GL_EXT_texture_cube_map = 1;
	public static final int GL_NORMAL_MAP_EXT = 0x8511;
	public static final int GL_REFLECTION_MAP_EXT = 0x8512;
	public static final int GL_TEXTURE_CUBE_MAP_EXT = 0x8513;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_EXT = 0x8514;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X_EXT = 0x8515;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X_EXT = 0x8516;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y_EXT = 0x8517;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_EXT = 0x8518;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z_EXT = 0x8519;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_EXT = 0x851A;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP_EXT = 0x851B;
	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE_EXT = 0x851C;
	public static final int GL_EXT_texture_edge_clamp = 1;
	public static final int GL_CLAMP_TO_EDGE_EXT = 0x812F;
	public static final int GL_EXT_texture_env = 1;
	public static final int GL_TEXTURE_ENV0_EXT = 0;
	public static final int GL_ENV_BLEND_EXT = 0;
	public static final int GL_TEXTURE_ENV_SHIFT_EXT = 0;
	public static final int GL_ENV_REPLACE_EXT = 0;
	public static final int GL_ENV_ADD_EXT = 0;
	public static final int GL_ENV_SUBTRACT_EXT = 0;
	public static final int GL_TEXTURE_ENV_MODE_ALPHA_EXT = 0;
	public static final int GL_ENV_REVERSE_SUBTRACT_EXT = 0;
	public static final int GL_ENV_REVERSE_BLEND_EXT = 0;
	public static final int GL_ENV_COPY_EXT = 0;
	public static final int GL_ENV_MODULATE_EXT = 0;
	public static final int GL_EXT_texture_env_add = 1;
	public static final int GL_EXT_texture_env_combine = 1;
	public static final int GL_COMBINE_EXT = 0x8570;
	public static final int GL_COMBINE_RGB_EXT = 0x8571;
	public static final int GL_COMBINE_ALPHA_EXT = 0x8572;
	public static final int GL_RGB_SCALE_EXT = 0x8573;
	public static final int GL_ADD_SIGNED_EXT = 0x8574;
	public static final int GL_INTERPOLATE_EXT = 0x8575;
	public static final int GL_CONSTANT_EXT = 0x8576;
	public static final int GL_PRIMARY_COLOR_EXT = 0x8577;
	public static final int GL_PREVIOUS_EXT = 0x8578;
	public static final int GL_SOURCE0_RGB_EXT = 0x8580;
	public static final int GL_SOURCE1_RGB_EXT = 0x8581;
	public static final int GL_SOURCE2_RGB_EXT = 0x8582;
	public static final int GL_SOURCE0_ALPHA_EXT = 0x8588;
	public static final int GL_SOURCE1_ALPHA_EXT = 0x8589;
	public static final int GL_SOURCE2_ALPHA_EXT = 0x858A;
	public static final int GL_OPERAND0_RGB_EXT = 0x8590;
	public static final int GL_OPERAND1_RGB_EXT = 0x8591;
	public static final int GL_OPERAND2_RGB_EXT = 0x8592;
	public static final int GL_OPERAND0_ALPHA_EXT = 0x8598;
	public static final int GL_OPERAND1_ALPHA_EXT = 0x8599;
	public static final int GL_OPERAND2_ALPHA_EXT = 0x859A;
	public static final int GL_EXT_texture_env_dot3 = 1;
	public static final int GL_DOT3_RGB_EXT = 0x8740;
	public static final int GL_DOT3_RGBA_EXT = 0x8741;
	public static final int GL_EXT_texture_filter_anisotropic = 1;
	public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FE;
	public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FF;
	public static final int GL_EXT_texture_integer = 1;
	public static final int GL_RGBA32UI_EXT = 0x8D70;
	public static final int GL_RGB32UI_EXT = 0x8D71;
	public static final int GL_ALPHA32UI_EXT = 0x8D72;
	public static final int GL_INTENSITY32UI_EXT = 0x8D73;
	public static final int GL_LUMINANCE32UI_EXT = 0x8D74;
	public static final int GL_LUMINANCE_ALPHA32UI_EXT = 0x8D75;
	public static final int GL_RGBA16UI_EXT = 0x8D76;
	public static final int GL_RGB16UI_EXT = 0x8D77;
	public static final int GL_ALPHA16UI_EXT = 0x8D78;
	public static final int GL_INTENSITY16UI_EXT = 0x8D79;
	public static final int GL_LUMINANCE16UI_EXT = 0x8D7A;
	public static final int GL_LUMINANCE_ALPHA16UI_EXT = 0x8D7B;
	public static final int GL_RGBA8UI_EXT = 0x8D7C;
	public static final int GL_RGB8UI_EXT = 0x8D7D;
	public static final int GL_ALPHA8UI_EXT = 0x8D7E;
	public static final int GL_INTENSITY8UI_EXT = 0x8D7F;
	public static final int GL_LUMINANCE8UI_EXT = 0x8D80;
	public static final int GL_LUMINANCE_ALPHA8UI_EXT = 0x8D81;
	public static final int GL_RGBA32I_EXT = 0x8D82;
	public static final int GL_RGB32I_EXT = 0x8D83;
	public static final int GL_ALPHA32I_EXT = 0x8D84;
	public static final int GL_INTENSITY32I_EXT = 0x8D85;
	public static final int GL_LUMINANCE32I_EXT = 0x8D86;
	public static final int GL_LUMINANCE_ALPHA32I_EXT = 0x8D87;
	public static final int GL_RGBA16I_EXT = 0x8D88;
	public static final int GL_RGB16I_EXT = 0x8D89;
	public static final int GL_ALPHA16I_EXT = 0x8D8A;
	public static final int GL_INTENSITY16I_EXT = 0x8D8B;
	public static final int GL_LUMINANCE16I_EXT = 0x8D8C;
	public static final int GL_LUMINANCE_ALPHA16I_EXT = 0x8D8D;
	public static final int GL_RGBA8I_EXT = 0x8D8E;
	public static final int GL_RGB8I_EXT = 0x8D8F;
	public static final int GL_ALPHA8I_EXT = 0x8D90;
	public static final int GL_INTENSITY8I_EXT = 0x8D91;
	public static final int GL_LUMINANCE8I_EXT = 0x8D92;
	public static final int GL_LUMINANCE_ALPHA8I_EXT = 0x8D93;
	public static final int GL_RED_INTEGER_EXT = 0x8D94;
	public static final int GL_GREEN_INTEGER_EXT = 0x8D95;
	public static final int GL_BLUE_INTEGER_EXT = 0x8D96;
	public static final int GL_ALPHA_INTEGER_EXT = 0x8D97;
	public static final int GL_RGB_INTEGER_EXT = 0x8D98;
	public static final int GL_RGBA_INTEGER_EXT = 0x8D99;
	public static final int GL_BGR_INTEGER_EXT = 0x8D9A;
	public static final int GL_BGRA_INTEGER_EXT = 0x8D9B;
	public static final int GL_LUMINANCE_INTEGER_EXT = 0x8D9C;
	public static final int GL_LUMINANCE_ALPHA_INTEGER_EXT = 0x8D9D;
	public static final int GL_RGBA_INTEGER_MODE_EXT = 0x8D9E;
	public static final int GL_EXT_texture_lod_bias = 1;
	public static final int GL_MAX_TEXTURE_LOD_BIAS_EXT = 0x84FD;
	public static final int GL_TEXTURE_FILTER_CONTROL_EXT = 0x8500;
	public static final int GL_TEXTURE_LOD_BIAS_EXT = 0x8501;
	public static final int GL_EXT_texture_mirror_clamp = 1;
	public static final int GL_MIRROR_CLAMP_EXT = 0x8742;
	public static final int GL_MIRROR_CLAMP_TO_EDGE_EXT = 0x8743;
	public static final int GL_MIRROR_CLAMP_TO_BORDER_EXT = 0x8912;
	public static final int GL_EXT_texture_object = 1;
	public static final int GL_TEXTURE_PRIORITY_EXT = 0x8066;
	public static final int GL_TEXTURE_RESIDENT_EXT = 0x8067;
	public static final int GL_TEXTURE_1D_BINDING_EXT = 0x8068;
	public static final int GL_TEXTURE_2D_BINDING_EXT = 0x8069;
	public static final int GL_TEXTURE_3D_BINDING_EXT = 0x806A;
	public static final int GL_EXT_texture_perturb_normal = 1;
	public static final int GL_PERTURB_EXT = 0x85AE;
	public static final int GL_TEXTURE_NORMAL_EXT = 0x85AF;
	public static final int GL_EXT_texture_rectangle = 1;
	public static final int GL_TEXTURE_RECTANGLE_EXT = 0x84F5;
	public static final int GL_TEXTURE_BINDING_RECTANGLE_EXT = 0x84F6;
	public static final int GL_PROXY_TEXTURE_RECTANGLE_EXT = 0x84F7;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE_EXT = 0x84F8;
	public static final int GL_EXT_texture_sRGB = 1;
	public static final int GL_SRGB_EXT = 0x8C40;
	public static final int GL_SRGB8_EXT = 0x8C41;
	public static final int GL_SRGB_ALPHA_EXT = 0x8C42;
	public static final int GL_SRGB8_ALPHA8_EXT = 0x8C43;
	public static final int GL_SLUMINANCE_ALPHA_EXT = 0x8C44;
	public static final int GL_SLUMINANCE8_ALPHA8_EXT = 0x8C45;
	public static final int GL_SLUMINANCE_EXT = 0x8C46;
	public static final int GL_SLUMINANCE8_EXT = 0x8C47;
	public static final int GL_COMPRESSED_SRGB_EXT = 0x8C48;
	public static final int GL_COMPRESSED_SRGB_ALPHA_EXT = 0x8C49;
	public static final int GL_COMPRESSED_SLUMINANCE_EXT = 0x8C4A;
	public static final int GL_COMPRESSED_SLUMINANCE_ALPHA_EXT = 0x8C4B;
	public static final int GL_COMPRESSED_SRGB_S3TC_DXT1_EXT = 0x8C4C;
	public static final int GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = 0x8C4D;
	public static final int GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = 0x8C4E;
	public static final int GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = 0x8C4F;
	public static final int GL_EXT_texture_sRGB_decode = 1;
	public static final int GL_TEXTURE_SRGB_DECODE_EXT = 0x8A48;
	public static final int GL_DECODE_EXT = 0x8A49;
	public static final int GL_SKIP_DECODE_EXT = 0x8A4A;
	public static final int GL_EXT_texture_shared_exponent = 1;
	public static final int GL_RGB9_E5_EXT = 0x8C3D;
	public static final int GL_UNSIGNED_INT_5_9_9_9_REV_EXT = 0x8C3E;
	public static final int GL_TEXTURE_SHARED_SIZE_EXT = 0x8C3F;
	public static final int GL_EXT_texture_snorm = 1;
	public static final int GL_ALPHA_SNORM = 0x9010;
	public static final int GL_LUMINANCE_SNORM = 0x9011;
	public static final int GL_LUMINANCE_ALPHA_SNORM = 0x9012;
	public static final int GL_INTENSITY_SNORM = 0x9013;
	public static final int GL_ALPHA8_SNORM = 0x9014;
	public static final int GL_LUMINANCE8_SNORM = 0x9015;
	public static final int GL_LUMINANCE8_ALPHA8_SNORM = 0x9016;
	public static final int GL_INTENSITY8_SNORM = 0x9017;
	public static final int GL_ALPHA16_SNORM = 0x9018;
	public static final int GL_LUMINANCE16_SNORM = 0x9019;
	public static final int GL_LUMINANCE16_ALPHA16_SNORM = 0x901A;
	public static final int GL_INTENSITY16_SNORM = 0x901B;
	public static final int GL_EXT_texture_swizzle = 1;
	public static final int GL_TEXTURE_SWIZZLE_R_EXT = 0x8E42;
	public static final int GL_TEXTURE_SWIZZLE_G_EXT = 0x8E43;
	public static final int GL_TEXTURE_SWIZZLE_B_EXT = 0x8E44;
	public static final int GL_TEXTURE_SWIZZLE_A_EXT = 0x8E45;
	public static final int GL_TEXTURE_SWIZZLE_RGBA_EXT = 0x8E46;
	public static final int GL_EXT_timer_query = 1;
	public static final int GL_TIME_ELAPSED_EXT = 0x88BF;
	public static final int GL_EXT_transform_feedback = 1;
	public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT = 0x8C7F;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT = 0x8C80;
	public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_EXT = 0x8C83;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT = 0x8C85;
	public static final int GL_PRIMITIVES_GENERATED_EXT = 0x8C87;
	public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;
	public static final int GL_RASTERIZER_DISCARD_EXT = 0x8C89;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT = 0x8C8B;
	public static final int GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C;
	public static final int GL_SEPARATE_ATTRIBS_EXT = 0x8C8D;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;
	public static final int GL_EXT_vertex_array = 1;
	public static final int GL_DOUBLE_EXT = 0x140A;
	public static final int GL_VERTEX_ARRAY_EXT = 0x8074;
	public static final int GL_NORMAL_ARRAY_EXT = 0x8075;
	public static final int GL_COLOR_ARRAY_EXT = 0x8076;
	public static final int GL_INDEX_ARRAY_EXT = 0x8077;
	public static final int GL_TEXTURE_COORD_ARRAY_EXT = 0x8078;
	public static final int GL_EDGE_FLAG_ARRAY_EXT = 0x8079;
	public static final int GL_VERTEX_ARRAY_SIZE_EXT = 0x807A;
	public static final int GL_VERTEX_ARRAY_TYPE_EXT = 0x807B;
	public static final int GL_VERTEX_ARRAY_STRIDE_EXT = 0x807C;
	public static final int GL_VERTEX_ARRAY_COUNT_EXT = 0x807D;
	public static final int GL_NORMAL_ARRAY_TYPE_EXT = 0x807E;
	public static final int GL_NORMAL_ARRAY_STRIDE_EXT = 0x807F;
	public static final int GL_NORMAL_ARRAY_COUNT_EXT = 0x8080;
	public static final int GL_COLOR_ARRAY_SIZE_EXT = 0x8081;
	public static final int GL_COLOR_ARRAY_TYPE_EXT = 0x8082;
	public static final int GL_COLOR_ARRAY_STRIDE_EXT = 0x8083;
	public static final int GL_COLOR_ARRAY_COUNT_EXT = 0x8084;
	public static final int GL_INDEX_ARRAY_TYPE_EXT = 0x8085;
	public static final int GL_INDEX_ARRAY_STRIDE_EXT = 0x8086;
	public static final int GL_INDEX_ARRAY_COUNT_EXT = 0x8087;
	public static final int GL_TEXTURE_COORD_ARRAY_SIZE_EXT = 0x8088;
	public static final int GL_TEXTURE_COORD_ARRAY_TYPE_EXT = 0x8089;
	public static final int GL_TEXTURE_COORD_ARRAY_STRIDE_EXT = 0x808A;
	public static final int GL_TEXTURE_COORD_ARRAY_COUNT_EXT = 0x808B;
	public static final int GL_EDGE_FLAG_ARRAY_STRIDE_EXT = 0x808C;
	public static final int GL_EDGE_FLAG_ARRAY_COUNT_EXT = 0x808D;
	public static final int GL_VERTEX_ARRAY_POINTER_EXT = 0x808E;
	public static final int GL_NORMAL_ARRAY_POINTER_EXT = 0x808F;
	public static final int GL_COLOR_ARRAY_POINTER_EXT = 0x8090;
	public static final int GL_INDEX_ARRAY_POINTER_EXT = 0x8091;
	public static final int GL_TEXTURE_COORD_ARRAY_POINTER_EXT = 0x8092;
	public static final int GL_EDGE_FLAG_ARRAY_POINTER_EXT = 0x8093;
	public static final int GL_EXT_vertex_array_bgra = 1;
	public static final int GL_EXT_vertex_attrib_64bit = 1;
	public static final int GL_DOUBLE_MAT2_EXT = 0x8F46;
	public static final int GL_DOUBLE_MAT3_EXT = 0x8F47;
	public static final int GL_DOUBLE_MAT4_EXT = 0x8F48;
	public static final int GL_DOUBLE_MAT2x3_EXT = 0x8F49;
	public static final int GL_DOUBLE_MAT2x4_EXT = 0x8F4A;
	public static final int GL_DOUBLE_MAT3x2_EXT = 0x8F4B;
	public static final int GL_DOUBLE_MAT3x4_EXT = 0x8F4C;
	public static final int GL_DOUBLE_MAT4x2_EXT = 0x8F4D;
	public static final int GL_DOUBLE_MAT4x3_EXT = 0x8F4E;
	public static final int GL_DOUBLE_VEC2_EXT = 0x8FFC;
	public static final int GL_DOUBLE_VEC3_EXT = 0x8FFD;
	public static final int GL_DOUBLE_VEC4_EXT = 0x8FFE;
	public static final int GL_EXT_vertex_shader = 1;
	public static final int GL_VERTEX_SHADER_EXT = 0x8780;
	public static final int GL_VERTEX_SHADER_BINDING_EXT = 0x8781;
	public static final int GL_OP_INDEX_EXT = 0x8782;
	public static final int GL_OP_NEGATE_EXT = 0x8783;
	public static final int GL_OP_DOT3_EXT = 0x8784;
	public static final int GL_OP_DOT4_EXT = 0x8785;
	public static final int GL_OP_MUL_EXT = 0x8786;
	public static final int GL_OP_ADD_EXT = 0x8787;
	public static final int GL_OP_MADD_EXT = 0x8788;
	public static final int GL_OP_FRAC_EXT = 0x8789;
	public static final int GL_OP_MAX_EXT = 0x878A;
	public static final int GL_OP_MIN_EXT = 0x878B;
	public static final int GL_OP_SET_GE_EXT = 0x878C;
	public static final int GL_OP_SET_LT_EXT = 0x878D;
	public static final int GL_OP_CLAMP_EXT = 0x878E;
	public static final int GL_OP_FLOOR_EXT = 0x878F;
	public static final int GL_OP_ROUND_EXT = 0x8790;
	public static final int GL_OP_EXP_BASE_2_EXT = 0x8791;
	public static final int GL_OP_LOG_BASE_2_EXT = 0x8792;
	public static final int GL_OP_POWER_EXT = 0x8793;
	public static final int GL_OP_RECIP_EXT = 0x8794;
	public static final int GL_OP_RECIP_SQRT_EXT = 0x8795;
	public static final int GL_OP_SUB_EXT = 0x8796;
	public static final int GL_OP_CROSS_PRODUCT_EXT = 0x8797;
	public static final int GL_OP_MULTIPLY_MATRIX_EXT = 0x8798;
	public static final int GL_OP_MOV_EXT = 0x8799;
	public static final int GL_OUTPUT_VERTEX_EXT = 0x879A;
	public static final int GL_OUTPUT_COLOR0_EXT = 0x879B;
	public static final int GL_OUTPUT_COLOR1_EXT = 0x879C;
	public static final int GL_OUTPUT_TEXTURE_COORD0_EXT = 0x879D;
	public static final int GL_OUTPUT_TEXTURE_COORD1_EXT = 0x879E;
	public static final int GL_OUTPUT_TEXTURE_COORD2_EXT = 0x879F;
	public static final int GL_OUTPUT_TEXTURE_COORD3_EXT = 0x87A0;
	public static final int GL_OUTPUT_TEXTURE_COORD4_EXT = 0x87A1;
	public static final int GL_OUTPUT_TEXTURE_COORD5_EXT = 0x87A2;
	public static final int GL_OUTPUT_TEXTURE_COORD6_EXT = 0x87A3;
	public static final int GL_OUTPUT_TEXTURE_COORD7_EXT = 0x87A4;
	public static final int GL_OUTPUT_TEXTURE_COORD8_EXT = 0x87A5;
	public static final int GL_OUTPUT_TEXTURE_COORD9_EXT = 0x87A6;
	public static final int GL_OUTPUT_TEXTURE_COORD10_EXT = 0x87A7;
	public static final int GL_OUTPUT_TEXTURE_COORD11_EXT = 0x87A8;
	public static final int GL_OUTPUT_TEXTURE_COORD12_EXT = 0x87A9;
	public static final int GL_OUTPUT_TEXTURE_COORD13_EXT = 0x87AA;
	public static final int GL_OUTPUT_TEXTURE_COORD14_EXT = 0x87AB;
	public static final int GL_OUTPUT_TEXTURE_COORD15_EXT = 0x87AC;
	public static final int GL_OUTPUT_TEXTURE_COORD16_EXT = 0x87AD;
	public static final int GL_OUTPUT_TEXTURE_COORD17_EXT = 0x87AE;
	public static final int GL_OUTPUT_TEXTURE_COORD18_EXT = 0x87AF;
	public static final int GL_OUTPUT_TEXTURE_COORD19_EXT = 0x87B0;
	public static final int GL_OUTPUT_TEXTURE_COORD20_EXT = 0x87B1;
	public static final int GL_OUTPUT_TEXTURE_COORD21_EXT = 0x87B2;
	public static final int GL_OUTPUT_TEXTURE_COORD22_EXT = 0x87B3;
	public static final int GL_OUTPUT_TEXTURE_COORD23_EXT = 0x87B4;
	public static final int GL_OUTPUT_TEXTURE_COORD24_EXT = 0x87B5;
	public static final int GL_OUTPUT_TEXTURE_COORD25_EXT = 0x87B6;
	public static final int GL_OUTPUT_TEXTURE_COORD26_EXT = 0x87B7;
	public static final int GL_OUTPUT_TEXTURE_COORD27_EXT = 0x87B8;
	public static final int GL_OUTPUT_TEXTURE_COORD28_EXT = 0x87B9;
	public static final int GL_OUTPUT_TEXTURE_COORD29_EXT = 0x87BA;
	public static final int GL_OUTPUT_TEXTURE_COORD30_EXT = 0x87BB;
	public static final int GL_OUTPUT_TEXTURE_COORD31_EXT = 0x87BC;
	public static final int GL_OUTPUT_FOG_EXT = 0x87BD;
	public static final int GL_SCALAR_EXT = 0x87BE;
	public static final int GL_VECTOR_EXT = 0x87BF;
	public static final int GL_MATRIX_EXT = 0x87C0;
	public static final int GL_VARIANT_EXT = 0x87C1;
	public static final int GL_INVARIANT_EXT = 0x87C2;
	public static final int GL_LOCAL_CONSTANT_EXT = 0x87C3;
	public static final int GL_LOCAL_EXT = 0x87C4;
	public static final int GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87C5;
	public static final int GL_MAX_VERTEX_SHADER_VARIANTS_EXT = 0x87C6;
	public static final int GL_MAX_VERTEX_SHADER_INVARIANTS_EXT = 0x87C7;
	public static final int GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87C8;
	public static final int GL_MAX_VERTEX_SHADER_LOCALS_EXT = 0x87C9;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87CA;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT = 0x87CB;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT = 0x87CC;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87CD;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT = 0x87CE;
	public static final int GL_VERTEX_SHADER_INSTRUCTIONS_EXT = 0x87CF;
	public static final int GL_VERTEX_SHADER_VARIANTS_EXT = 0x87D0;
	public static final int GL_VERTEX_SHADER_INVARIANTS_EXT = 0x87D1;
	public static final int GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 0x87D2;
	public static final int GL_VERTEX_SHADER_LOCALS_EXT = 0x87D3;
	public static final int GL_VERTEX_SHADER_OPTIMIZED_EXT = 0x87D4;
	public static final int GL_X_EXT = 0x87D5;
	public static final int GL_Y_EXT = 0x87D6;
	public static final int GL_Z_EXT = 0x87D7;
	public static final int GL_W_EXT = 0x87D8;
	public static final int GL_NEGATIVE_X_EXT = 0x87D9;
	public static final int GL_NEGATIVE_Y_EXT = 0x87DA;
	public static final int GL_NEGATIVE_Z_EXT = 0x87DB;
	public static final int GL_NEGATIVE_W_EXT = 0x87DC;
	public static final int GL_ZERO_EXT = 0x87DD;
	public static final int GL_ONE_EXT = 0x87DE;
	public static final int GL_NEGATIVE_ONE_EXT = 0x87DF;
	public static final int GL_NORMALIZED_RANGE_EXT = 0x87E0;
	public static final int GL_FULL_RANGE_EXT = 0x87E1;
	public static final int GL_CURRENT_VERTEX_EXT = 0x87E2;
	public static final int GL_MVP_MATRIX_EXT = 0x87E3;
	public static final int GL_VARIANT_VALUE_EXT = 0x87E4;
	public static final int GL_VARIANT_DATATYPE_EXT = 0x87E5;
	public static final int GL_VARIANT_ARRAY_STRIDE_EXT = 0x87E6;
	public static final int GL_VARIANT_ARRAY_TYPE_EXT = 0x87E7;
	public static final int GL_VARIANT_ARRAY_EXT = 0x87E8;
	public static final int GL_VARIANT_ARRAY_POINTER_EXT = 0x87E9;
	public static final int GL_INVARIANT_VALUE_EXT = 0x87EA;
	public static final int GL_INVARIANT_DATATYPE_EXT = 0x87EB;
	public static final int GL_LOCAL_CONSTANT_VALUE_EXT = 0x87EC;
	public static final int GL_LOCAL_CONSTANT_DATATYPE_EXT = 0x87ED;
	public static final int GL_EXT_vertex_weighting = 1;
	public static final int GL_MODELVIEW0_STACK_DEPTH_EXT = 0x0BA3;
	public static final int GL_MODELVIEW0_MATRIX_EXT = 0x0BA6;
	public static final int GL_MODELVIEW0_EXT = 0x1700;
	public static final int GL_MODELVIEW1_STACK_DEPTH_EXT = 0x8502;
	public static final int GL_MODELVIEW1_MATRIX_EXT = 0x8506;
	public static final int GL_VERTEX_WEIGHTING_EXT = 0x8509;
	public static final int GL_MODELVIEW1_EXT = 0x850A;
	public static final int GL_CURRENT_VERTEX_WEIGHT_EXT = 0x850B;
	public static final int GL_VERTEX_WEIGHT_ARRAY_EXT = 0x850C;
	public static final int GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT = 0x850D;
	public static final int GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT = 0x850E;
	public static final int GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT = 0x850F;
	public static final int GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT = 0x8510;
	public static final int GL_EXT_x11_sync_object = 1;
	public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;
	public static final int GL_GREMEDY_frame_terminator = 1;
	public static final int GL_GREMEDY_string_marker = 1;
	public static final int GL_HP_convolution_border_modes = 1;
	public static final int GL_HP_image_transform = 1;
	public static final int GL_HP_occlusion_test = 1;
	public static final int GL_OCCLUSION_TEST_HP = 0x8165;
	public static final int GL_OCCLUSION_TEST_RESULT_HP = 0x8166;
	public static final int GL_HP_texture_lighting = 1;
	public static final int GL_IBM_cull_vertex = 1;
	public static final int GL_CULL_VERTEX_IBM = 103050;
	public static final int GL_IBM_multimode_draw_arrays = 1;
	public static final int GL_IBM_rasterpos_clip = 1;
	public static final int GL_RASTER_POSITION_UNCLIPPED_IBM = 103010;
	public static final int GL_IBM_static_data = 1;
	public static final int GL_ALL_STATIC_DATA_IBM = 103060;
	public static final int GL_STATIC_VERTEX_ARRAY_IBM = 103061;
	public static final int GL_IBM_texture_mirrored_repeat = 1;
	public static final int GL_MIRRORED_REPEAT_IBM = 0x8370;
	public static final int GL_IBM_vertex_array_lists = 1;
	public static final int GL_VERTEX_ARRAY_LIST_IBM = 103070;
	public static final int GL_NORMAL_ARRAY_LIST_IBM = 103071;
	public static final int GL_COLOR_ARRAY_LIST_IBM = 103072;
	public static final int GL_INDEX_ARRAY_LIST_IBM = 103073;
	public static final int GL_TEXTURE_COORD_ARRAY_LIST_IBM = 103074;
	public static final int GL_EDGE_FLAG_ARRAY_LIST_IBM = 103075;
	public static final int GL_FOG_COORDINATE_ARRAY_LIST_IBM = 103076;
	public static final int GL_SECONDARY_COLOR_ARRAY_LIST_IBM = 103077;
	public static final int GL_VERTEX_ARRAY_LIST_STRIDE_IBM = 103080;
	public static final int GL_NORMAL_ARRAY_LIST_STRIDE_IBM = 103081;
	public static final int GL_COLOR_ARRAY_LIST_STRIDE_IBM = 103082;
	public static final int GL_INDEX_ARRAY_LIST_STRIDE_IBM = 103083;
	public static final int GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM = 103084;
	public static final int GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM = 103085;
	public static final int GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM = 103086;
	public static final int GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM = 103087;
	public static final int GL_INGR_color_clamp = 1;
	public static final int GL_RED_MIN_CLAMP_INGR = 0x8560;
	public static final int GL_GREEN_MIN_CLAMP_INGR = 0x8561;
	public static final int GL_BLUE_MIN_CLAMP_INGR = 0x8562;
	public static final int GL_ALPHA_MIN_CLAMP_INGR = 0x8563;
	public static final int GL_RED_MAX_CLAMP_INGR = 0x8564;
	public static final int GL_GREEN_MAX_CLAMP_INGR = 0x8565;
	public static final int GL_BLUE_MAX_CLAMP_INGR = 0x8566;
	public static final int GL_ALPHA_MAX_CLAMP_INGR = 0x8567;
	public static final int GL_INGR_interlace_read = 1;
	public static final int GL_INTERLACE_READ_INGR = 0x8568;
	public static final int GL_INTEL_parallel_arrays = 1;
	public static final int GL_PARALLEL_ARRAYS_INTEL = 0x83F4;
	public static final int GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F5;
	public static final int GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F6;
	public static final int GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F7;
	public static final int GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F8;
	public static final int GL_INTEL_texture_scissor = 1;
	public static final int GL_KHR_debug = 1;
	public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
	public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
	public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
	public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
	public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
	public static final int GL_DEBUG_SOURCE_API = 0x8246;
	public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
	public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
	public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
	public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
	public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
	public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
	public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
	public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
	public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
	public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
	public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
	public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
	public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
	public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
	public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
	public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
	public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
	public static final int GL_BUFFER = 0x82E0;
	public static final int GL_SHADER = 0x82E1;
	public static final int GL_PROGRAM = 0x82E2;
	public static final int GL_QUERY = 0x82E3;
	public static final int GL_PROGRAM_PIPELINE = 0x82E4;
	public static final int GL_SAMPLER = 0x82E6;
	public static final int GL_DISPLAY_LIST = 0x82E7;
	public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
	public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
	public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
	public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
	public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
	public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
	public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
	public static final int GL_DEBUG_OUTPUT = 0x92E0;
	public static final int GL_KHR_texture_compression_astc_ldr = 1;
	public static final int GL_COMPRESSED_RGBA_ASTC_4x4_KHR = 0x93B0;
	public static final int GL_COMPRESSED_RGBA_ASTC_5x4_KHR = 0x93B1;
	public static final int GL_COMPRESSED_RGBA_ASTC_5x5_KHR = 0x93B2;
	public static final int GL_COMPRESSED_RGBA_ASTC_6x5_KHR = 0x93B3;
	public static final int GL_COMPRESSED_RGBA_ASTC_6x6_KHR = 0x93B4;
	public static final int GL_COMPRESSED_RGBA_ASTC_8x5_KHR = 0x93B5;
	public static final int GL_COMPRESSED_RGBA_ASTC_8x6_KHR = 0x93B6;
	public static final int GL_COMPRESSED_RGBA_ASTC_8x8_KHR = 0x93B7;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x5_KHR = 0x93B8;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x6_KHR = 0x93B9;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x8_KHR = 0x93BA;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x10_KHR = 0x93BB;
	public static final int GL_COMPRESSED_RGBA_ASTC_12x10_KHR = 0x93BC;
	public static final int GL_COMPRESSED_RGBA_ASTC_12x12_KHR = 0x93BD;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR = 0x93D0;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR = 0x93D1;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR = 0x93D2;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR = 0x93D3;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR = 0x93D4;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR = 0x93D5;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR = 0x93D6;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR = 0x93D7;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR = 0x93D8;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR = 0x93D9;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR = 0x93DA;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR = 0x93DB;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR = 0x93DC;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR = 0x93DD;
	public static final int GL_KTX_buffer_region = 1;
	public static final int GL_KTX_FRONT_REGION = 0x0;
	public static final int GL_KTX_BACK_REGION = 0x1;
	public static final int GL_KTX_Z_REGION = 0x2;
	public static final int GL_KTX_STENCIL_REGION = 0x3;
	public static final int GL_MESAX_texture_stack = 1;
	public static final int GL_TEXTURE_1D_STACK_MESAX = 0x8759;
	public static final int GL_TEXTURE_2D_STACK_MESAX = 0x875A;
	public static final int GL_PROXY_TEXTURE_1D_STACK_MESAX = 0x875B;
	public static final int GL_PROXY_TEXTURE_2D_STACK_MESAX = 0x875C;
	public static final int GL_TEXTURE_1D_STACK_BINDING_MESAX = 0x875D;
	public static final int GL_TEXTURE_2D_STACK_BINDING_MESAX = 0x875E;
	public static final int GL_MESA_pack_invert = 1;
	public static final int GL_PACK_INVERT_MESA = 0x8758;
	public static final int GL_MESA_resize_buffers = 1;
	public static final int GL_MESA_window_pos = 1;
	public static final int GL_MESA_ycbcr_texture = 1;
	public static final int GL_UNSIGNED_SHORT_8_8_MESA = 0x85BA;
	public static final int GL_UNSIGNED_SHORT_8_8_REV_MESA = 0x85BB;
	public static final int GL_YCBCR_MESA = 0x8757;
	public static final int GL_NVX_gpu_memory_info = 1;
	public static final int GL_GPU_MEMORY_INFO_DEDICATED_VIDMEM_NVX = 0x9047;
	public static final int GL_GPU_MEMORY_INFO_TOTAL_AVAILABLE_MEMORY_NVX = 0x9048;
	public static final int GL_GPU_MEMORY_INFO_CURRENT_AVAILABLE_VIDMEM_NVX = 0x9049;
	public static final int GL_GPU_MEMORY_INFO_EVICTION_COUNT_NVX = 0x904A;
	public static final int GL_GPU_MEMORY_INFO_EVICTED_MEMORY_NVX = 0x904B;
	public static final int GL_NV_bindless_texture = 1;
	public static final int GL_NV_blend_square = 1;
	public static final int GL_NV_conditional_render = 1;
	public static final int GL_QUERY_WAIT_NV = 0x8E13;
	public static final int GL_QUERY_NO_WAIT_NV = 0x8E14;
	public static final int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
	public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;
	public static final int GL_NV_copy_depth_to_color = 1;
	public static final int GL_DEPTH_STENCIL_TO_RGBA_NV = 0x886E;
	public static final int GL_DEPTH_STENCIL_TO_BGRA_NV = 0x886F;
	public static final int GL_NV_copy_image = 1;
	public static final int GL_NV_depth_buffer_float = 1;
	public static final int GL_DEPTH_COMPONENT32F_NV = 0x8DAB;
	public static final int GL_DEPTH32F_STENCIL8_NV = 0x8DAC;
	public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;
	public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;
	public static final int GL_NV_depth_clamp = 1;
	public static final int GL_DEPTH_CLAMP_NV = 0x864F;
	public static final int GL_NV_depth_range_unclamped = 1;
	public static final int GL_SAMPLE_COUNT_BITS_NV = 0x8864;
	public static final int GL_CURRENT_SAMPLE_COUNT_QUERY_NV = 0x8865;
	public static final int GL_QUERY_RESULT_NV = 0x8866;
	public static final int GL_QUERY_RESULT_AVAILABLE_NV = 0x8867;
	public static final int GL_SAMPLE_COUNT_NV = 0x8914;
	public static final int GL_NV_evaluators = 1;
	public static final int GL_EVAL_2D_NV = 0x86C0;
	public static final int GL_EVAL_TRIANGULAR_2D_NV = 0x86C1;
	public static final int GL_MAP_TESSELLATION_NV = 0x86C2;
	public static final int GL_MAP_ATTRIB_U_ORDER_NV = 0x86C3;
	public static final int GL_MAP_ATTRIB_V_ORDER_NV = 0x86C4;
	public static final int GL_EVAL_FRACTIONAL_TESSELLATION_NV = 0x86C5;
	public static final int GL_EVAL_VERTEX_ATTRIB0_NV = 0x86C6;
	public static final int GL_EVAL_VERTEX_ATTRIB1_NV = 0x86C7;
	public static final int GL_EVAL_VERTEX_ATTRIB2_NV = 0x86C8;
	public static final int GL_EVAL_VERTEX_ATTRIB3_NV = 0x86C9;
	public static final int GL_EVAL_VERTEX_ATTRIB4_NV = 0x86CA;
	public static final int GL_EVAL_VERTEX_ATTRIB5_NV = 0x86CB;
	public static final int GL_EVAL_VERTEX_ATTRIB6_NV = 0x86CC;
	public static final int GL_EVAL_VERTEX_ATTRIB7_NV = 0x86CD;
	public static final int GL_EVAL_VERTEX_ATTRIB8_NV = 0x86CE;
	public static final int GL_EVAL_VERTEX_ATTRIB9_NV = 0x86CF;
	public static final int GL_EVAL_VERTEX_ATTRIB10_NV = 0x86D0;
	public static final int GL_EVAL_VERTEX_ATTRIB11_NV = 0x86D1;
	public static final int GL_EVAL_VERTEX_ATTRIB12_NV = 0x86D2;
	public static final int GL_EVAL_VERTEX_ATTRIB13_NV = 0x86D3;
	public static final int GL_EVAL_VERTEX_ATTRIB14_NV = 0x86D4;
	public static final int GL_EVAL_VERTEX_ATTRIB15_NV = 0x86D5;
	public static final int GL_MAX_MAP_TESSELLATION_NV = 0x86D6;
	public static final int GL_MAX_RATIONAL_EVAL_ORDER_NV = 0x86D7;
	public static final int GL_NV_explicit_multisample = 1;
	public static final int GL_SAMPLE_POSITION_NV = 0x8E50;
	public static final int GL_SAMPLE_MASK_NV = 0x8E51;
	public static final int GL_SAMPLE_MASK_VALUE_NV = 0x8E52;
	public static final int GL_TEXTURE_BINDING_RENDERBUFFER_NV = 0x8E53;
	public static final int GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV = 0x8E54;
	public static final int GL_TEXTURE_RENDERBUFFER_NV = 0x8E55;
	public static final int GL_SAMPLER_RENDERBUFFER_NV = 0x8E56;
	public static final int GL_INT_SAMPLER_RENDERBUFFER_NV = 0x8E57;
	public static final int GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV = 0x8E58;
	public static final int GL_MAX_SAMPLE_MASK_WORDS_NV = 0x8E59;
	public static final int GL_NV_fence = 1;
	public static final int GL_ALL_COMPLETED_NV = 0x84F2;
	public static final int GL_FENCE_STATUS_NV = 0x84F3;
	public static final int GL_FENCE_CONDITION_NV = 0x84F4;
	public static final int GL_NV_float_buffer = 1;
	public static final int GL_FLOAT_R_NV = 0x8880;
	public static final int GL_FLOAT_RG_NV = 0x8881;
	public static final int GL_FLOAT_RGB_NV = 0x8882;
	public static final int GL_FLOAT_RGBA_NV = 0x8883;
	public static final int GL_FLOAT_R16_NV = 0x8884;
	public static final int GL_FLOAT_R32_NV = 0x8885;
	public static final int GL_FLOAT_RG16_NV = 0x8886;
	public static final int GL_FLOAT_RG32_NV = 0x8887;
	public static final int GL_FLOAT_RGB16_NV = 0x8888;
	public static final int GL_FLOAT_RGB32_NV = 0x8889;
	public static final int GL_FLOAT_RGBA16_NV = 0x888A;
	public static final int GL_FLOAT_RGBA32_NV = 0x888B;
	public static final int GL_TEXTURE_FLOAT_COMPONENTS_NV = 0x888C;
	public static final int GL_FLOAT_CLEAR_COLOR_VALUE_NV = 0x888D;
	public static final int GL_FLOAT_RGBA_MODE_NV = 0x888E;
	public static final int GL_NV_fog_distance = 1;
	public static final int GL_FOG_DISTANCE_MODE_NV = 0x855A;
	public static final int GL_EYE_RADIAL_NV = 0x855B;
	public static final int GL_EYE_PLANE_ABSOLUTE_NV = 0x855C;
	public static final int GL_NV_fragment_program = 1;
	public static final int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 0x8868;
	public static final int GL_FRAGMENT_PROGRAM_NV = 0x8870;
	public static final int GL_MAX_TEXTURE_COORDS_NV = 0x8871;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 0x8872;
	public static final int GL_FRAGMENT_PROGRAM_BINDING_NV = 0x8873;
	public static final int GL_PROGRAM_ERROR_STRING_NV = 0x8874;
	public static final int GL_NV_fragment_program2 = 1;
	public static final int GL_MAX_PROGRAM_EXEC_INSTRUCTIONS_NV = 0x88F4;
	public static final int GL_MAX_PROGRAM_CALL_DEPTH_NV = 0x88F5;
	public static final int GL_MAX_PROGRAM_IF_DEPTH_NV = 0x88F6;
	public static final int GL_MAX_PROGRAM_LOOP_DEPTH_NV = 0x88F7;
	public static final int GL_MAX_PROGRAM_LOOP_COUNT_NV = 0x88F8;
	public static final int GL_NV_fragment_program4 = 1;
	public static final int GL_NV_fragment_program_option = 1;
	public static final int GL_NV_framebuffer_multisample_coverage = 1;
	public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB;
	public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 0x8E10;
	public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11;
	public static final int GL_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E12;
	public static final int GL_NV_geometry_program4 = 1;
	public static final int GL_GEOMETRY_PROGRAM_NV = 0x8C26;
	public static final int GL_MAX_PROGRAM_OUTPUT_VERTICES_NV = 0x8C27;
	public static final int GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV = 0x8C28;
	public static final int GL_NV_geometry_shader4 = 1;
	public static final int GL_NV_gpu_program4 = 1;
	public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_NV = 0x8904;
	public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_NV = 0x8905;
	public static final int GL_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8906;
	public static final int GL_PROGRAM_RESULT_COMPONENTS_NV = 0x8907;
	public static final int GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8908;
	public static final int GL_MAX_PROGRAM_RESULT_COMPONENTS_NV = 0x8909;
	public static final int GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV = 0x8DA5;
	public static final int GL_MAX_PROGRAM_GENERIC_RESULTS_NV = 0x8DA6;
	public static final int GL_NV_gpu_program5 = 1;
	public static final int GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV = 0x8E5A;
	public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5B;
	public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5C;
	public static final int GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV = 0x8E5D;
	public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5E;
	public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5F;
	public static final int GL_NV_gpu_program_fp64 = 1;
	public static final int GL_NV_gpu_shader5 = 1;
	public static final int GL_INT64_NV = 0x140E;
	public static final int GL_UNSIGNED_INT64_NV = 0x140F;
	public static final int GL_INT8_NV = 0x8FE0;
	public static final int GL_INT8_VEC2_NV = 0x8FE1;
	public static final int GL_INT8_VEC3_NV = 0x8FE2;
	public static final int GL_INT8_VEC4_NV = 0x8FE3;
	public static final int GL_INT16_NV = 0x8FE4;
	public static final int GL_INT16_VEC2_NV = 0x8FE5;
	public static final int GL_INT16_VEC3_NV = 0x8FE6;
	public static final int GL_INT16_VEC4_NV = 0x8FE7;
	public static final int GL_INT64_VEC2_NV = 0x8FE9;
	public static final int GL_INT64_VEC3_NV = 0x8FEA;
	public static final int GL_INT64_VEC4_NV = 0x8FEB;
	public static final int GL_UNSIGNED_INT8_NV = 0x8FEC;
	public static final int GL_UNSIGNED_INT8_VEC2_NV = 0x8FED;
	public static final int GL_UNSIGNED_INT8_VEC3_NV = 0x8FEE;
	public static final int GL_UNSIGNED_INT8_VEC4_NV = 0x8FEF;
	public static final int GL_UNSIGNED_INT16_NV = 0x8FF0;
	public static final int GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1;
	public static final int GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2;
	public static final int GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3;
	public static final int GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5;
	public static final int GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6;
	public static final int GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7;
	public static final int GL_FLOAT16_NV = 0x8FF8;
	public static final int GL_FLOAT16_VEC2_NV = 0x8FF9;
	public static final int GL_FLOAT16_VEC3_NV = 0x8FFA;
	public static final int GL_FLOAT16_VEC4_NV = 0x8FFB;
	public static final int GL_NV_half_float = 1;
	public static final int GL_HALF_FLOAT_NV = 0x140B;
	public static final int GL_NV_light_max_exponent = 1;
	public static final int GL_MAX_SHININESS_NV = 0x8504;
	public static final int GL_MAX_SPOT_EXPONENT_NV = 0x8505;
	public static final int GL_NV_multisample_coverage = 1;
	public static final int GL_COVERAGE_SAMPLES_NV = 0x80A9;
	public static final int GL_COLOR_SAMPLES_NV = 0x8E20;
	public static final int GL_NV_multisample_filter_hint = 1;
	public static final int GL_MULTISAMPLE_FILTER_HINT_NV = 0x8534;
	public static final int GL_NV_occlusion_query = 1;
	public static final int GL_PIXEL_COUNTER_BITS_NV = 0x8864;
	public static final int GL_CURRENT_OCCLUSION_QUERY_ID_NV = 0x8865;
	public static final int GL_PIXEL_COUNT_NV = 0x8866;
	public static final int GL_PIXEL_COUNT_AVAILABLE_NV = 0x8867;
	public static final int GL_NV_packed_depth_stencil = 1;
	public static final int GL_DEPTH_STENCIL_NV = 0x84F9;
	public static final int GL_UNSIGNED_INT_24_8_NV = 0x84FA;
	public static final int GL_NV_parameter_buffer_object = 1;
	public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV = 0x8DA0;
	public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV = 0x8DA1;
	public static final int GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA2;
	public static final int GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA3;
	public static final int GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA4;
	public static final int GL_NV_parameter_buffer_object2 = 1;
	public static final int GL_NV_path_rendering = 1;
	public static final int GL_CLOSE_PATH_NV = 0x00;
	public static final int GL_BOLD_BIT_NV = 0x01;
	public static final int GL_GLYPH_WIDTH_BIT_NV = 0x01;
	public static final int GL_GLYPH_HEIGHT_BIT_NV = 0x02;
	public static final int GL_ITALIC_BIT_NV = 0x02;
	public static final int GL_MOVE_TO_NV = 0x02;
	public static final int GL_RELATIVE_MOVE_TO_NV = 0x03;
	public static final int GL_LINE_TO_NV = 0x04;
	public static final int GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV = 0x04;
	public static final int GL_RELATIVE_LINE_TO_NV = 0x05;
	public static final int GL_HORIZONTAL_LINE_TO_NV = 0x06;
	public static final int GL_RELATIVE_HORIZONTAL_LINE_TO_NV = 0x07;
	public static final int GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV = 0x08;
	public static final int GL_VERTICAL_LINE_TO_NV = 0x08;
	public static final int GL_RELATIVE_VERTICAL_LINE_TO_NV = 0x09;
	public static final int GL_QUADRATIC_CURVE_TO_NV = 0x0A;
	public static final int GL_RELATIVE_QUADRATIC_CURVE_TO_NV = 0x0B;
	public static final int GL_CUBIC_CURVE_TO_NV = 0x0C;
	public static final int GL_RELATIVE_CUBIC_CURVE_TO_NV = 0x0D;
	public static final int GL_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0E;
	public static final int GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0F;
	public static final int GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV = 0x10;
	public static final int GL_SMOOTH_CUBIC_CURVE_TO_NV = 0x10;
	public static final int GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV = 0x11;
	public static final int GL_SMALL_CCW_ARC_TO_NV = 0x12;
	public static final int GL_RELATIVE_SMALL_CCW_ARC_TO_NV = 0x13;
	public static final int GL_SMALL_CW_ARC_TO_NV = 0x14;
	public static final int GL_RELATIVE_SMALL_CW_ARC_TO_NV = 0x15;
	public static final int GL_LARGE_CCW_ARC_TO_NV = 0x16;
	public static final int GL_RELATIVE_LARGE_CCW_ARC_TO_NV = 0x17;
	public static final int GL_LARGE_CW_ARC_TO_NV = 0x18;
	public static final int GL_RELATIVE_LARGE_CW_ARC_TO_NV = 0x19;
	public static final int GL_GLYPH_VERTICAL_BEARING_X_BIT_NV = 0x20;
	public static final int GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV = 0x40;
	public static final int GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV = 0x80;
	public static final int GL_RESTART_PATH_NV = 0xF0;
	public static final int GL_DUP_FIRST_CUBIC_CURVE_TO_NV = 0xF2;
	public static final int GL_DUP_LAST_CUBIC_CURVE_TO_NV = 0xF4;
	public static final int GL_RECT_NV = 0xF6;
	public static final int GL_CIRCULAR_CCW_ARC_TO_NV = 0xF8;
	public static final int GL_CIRCULAR_CW_ARC_TO_NV = 0xFA;
	public static final int GL_CIRCULAR_TANGENT_ARC_TO_NV = 0xFC;
	public static final int GL_ARC_TO_NV = 0xFE;
	public static final int GL_RELATIVE_ARC_TO_NV = 0xFF;
	public static final int GL_GLYPH_HAS_KERNING_BIT_NV = 0x100;
	public static final int GL_PRIMARY_COLOR_NV = 0x852C;
	public static final int GL_SECONDARY_COLOR_NV = 0x852D;
	public static final int GL_PATH_FORMAT_SVG_NV = 0x9070;
	public static final int GL_PATH_FORMAT_PS_NV = 0x9071;
	public static final int GL_STANDARD_FONT_NAME_NV = 0x9072;
	public static final int GL_SYSTEM_FONT_NAME_NV = 0x9073;
	public static final int GL_FILE_NAME_NV = 0x9074;
	public static final int GL_PATH_STROKE_WIDTH_NV = 0x9075;
	public static final int GL_PATH_END_CAPS_NV = 0x9076;
	public static final int GL_PATH_INITIAL_END_CAP_NV = 0x9077;
	public static final int GL_PATH_TERMINAL_END_CAP_NV = 0x9078;
	public static final int GL_PATH_JOIN_STYLE_NV = 0x9079;
	public static final int GL_PATH_MITER_LIMIT_NV = 0x907A;
	public static final int GL_PATH_DASH_CAPS_NV = 0x907B;
	public static final int GL_PATH_INITIAL_DASH_CAP_NV = 0x907C;
	public static final int GL_PATH_TERMINAL_DASH_CAP_NV = 0x907D;
	public static final int GL_PATH_DASH_OFFSET_NV = 0x907E;
	public static final int GL_PATH_CLIENT_LENGTH_NV = 0x907F;
	public static final int GL_PATH_FILL_MODE_NV = 0x9080;
	public static final int GL_PATH_FILL_MASK_NV = 0x9081;
	public static final int GL_PATH_FILL_COVER_MODE_NV = 0x9082;
	public static final int GL_PATH_STROKE_COVER_MODE_NV = 0x9083;
	public static final int GL_PATH_STROKE_MASK_NV = 0x9084;
	public static final int GL_COUNT_UP_NV = 0x9088;
	public static final int GL_COUNT_DOWN_NV = 0x9089;
	public static final int GL_PATH_OBJECT_BOUNDING_BOX_NV = 0x908A;
	public static final int GL_CONVEX_HULL_NV = 0x908B;
	public static final int GL_BOUNDING_BOX_NV = 0x908D;
	public static final int GL_TRANSLATE_X_NV = 0x908E;
	public static final int GL_TRANSLATE_Y_NV = 0x908F;
	public static final int GL_TRANSLATE_2D_NV = 0x9090;
	public static final int GL_TRANSLATE_3D_NV = 0x9091;
	public static final int GL_AFFINE_2D_NV = 0x9092;
	public static final int GL_AFFINE_3D_NV = 0x9094;
	public static final int GL_TRANSPOSE_AFFINE_2D_NV = 0x9096;
	public static final int GL_TRANSPOSE_AFFINE_3D_NV = 0x9098;
	public static final int GL_UTF8_NV = 0x909A;
	public static final int GL_UTF16_NV = 0x909B;
	public static final int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 0x909C;
	public static final int GL_PATH_COMMAND_COUNT_NV = 0x909D;
	public static final int GL_PATH_COORD_COUNT_NV = 0x909E;
	public static final int GL_PATH_DASH_ARRAY_COUNT_NV = 0x909F;
	public static final int GL_PATH_COMPUTED_LENGTH_NV = 0x90A0;
	public static final int GL_PATH_FILL_BOUNDING_BOX_NV = 0x90A1;
	public static final int GL_PATH_STROKE_BOUNDING_BOX_NV = 0x90A2;
	public static final int GL_SQUARE_NV = 0x90A3;
	public static final int GL_ROUND_NV = 0x90A4;
	public static final int GL_TRIANGULAR_NV = 0x90A5;
	public static final int GL_BEVEL_NV = 0x90A6;
	public static final int GL_MITER_REVERT_NV = 0x90A7;
	public static final int GL_MITER_TRUNCATE_NV = 0x90A8;
	public static final int GL_SKIP_MISSING_GLYPH_NV = 0x90A9;
	public static final int GL_USE_MISSING_GLYPH_NV = 0x90AA;
	public static final int GL_PATH_ERROR_POSITION_NV = 0x90AB;
	public static final int GL_PATH_FOG_GEN_MODE_NV = 0x90AC;
	public static final int GL_ACCUM_ADJACENT_PAIRS_NV = 0x90AD;
	public static final int GL_ADJACENT_PAIRS_NV = 0x90AE;
	public static final int GL_FIRST_TO_REST_NV = 0x90AF;
	public static final int GL_PATH_GEN_MODE_NV = 0x90B0;
	public static final int GL_PATH_GEN_COEFF_NV = 0x90B1;
	public static final int GL_PATH_GEN_COLOR_FORMAT_NV = 0x90B2;
	public static final int GL_PATH_GEN_COMPONENTS_NV = 0x90B3;
	public static final int GL_PATH_DASH_OFFSET_RESET_NV = 0x90B4;
	public static final int GL_MOVE_TO_RESETS_NV = 0x90B5;
	public static final int GL_MOVE_TO_CONTINUES_NV = 0x90B6;
	public static final int GL_PATH_STENCIL_FUNC_NV = 0x90B7;
	public static final int GL_PATH_STENCIL_REF_NV = 0x90B8;
	public static final int GL_PATH_STENCIL_VALUE_MASK_NV = 0x90B9;
	public static final int GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 0x90BD;
	public static final int GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV = 0x90BE;
	public static final int GL_PATH_COVER_DEPTH_FUNC_NV = 0x90BF;
	public static final int GL_FONT_X_MIN_BOUNDS_BIT_NV = 0x00010000;
	public static final int GL_FONT_Y_MIN_BOUNDS_BIT_NV = 0x00020000;
	public static final int GL_FONT_X_MAX_BOUNDS_BIT_NV = 0x00040000;
	public static final int GL_FONT_Y_MAX_BOUNDS_BIT_NV = 0x00080000;
	public static final int GL_FONT_UNITS_PER_EM_BIT_NV = 0x00100000;
	public static final int GL_FONT_ASCENDER_BIT_NV = 0x00200000;
	public static final int GL_FONT_DESCENDER_BIT_NV = 0x00400000;
	public static final int GL_FONT_HEIGHT_BIT_NV = 0x00800000;
	public static final int GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV = 0x01000000;
	public static final int GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV = 0x02000000;
	public static final int GL_FONT_UNDERLINE_POSITION_BIT_NV = 0x04000000;
	public static final int GL_FONT_UNDERLINE_THICKNESS_BIT_NV = 0x08000000;
	public static final int GL_FONT_HAS_KERNING_BIT_NV = 0x10000000;
	public static final int GL_NV_pixel_data_range = 1;
	public static final int GL_WRITE_PIXEL_DATA_RANGE_NV = 0x8878;
	public static final int GL_READ_PIXEL_DATA_RANGE_NV = 0x8879;
	public static final int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 0x887A;
	public static final int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = 0x887B;
	public static final int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 0x887C;
	public static final int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = 0x887D;
	public static final int GL_NV_point_sprite = 1;
	public static final int GL_POINT_SPRITE_NV = 0x8861;
	public static final int GL_COORD_REPLACE_NV = 0x8862;
	public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;
	public static final int GL_NV_present_video = 1;
	public static final int GL_FRAME_NV = 0x8E26;
	public static final int GL_FIELDS_NV = 0x8E27;
	public static final int GL_CURRENT_TIME_NV = 0x8E28;
	public static final int GL_NUM_FILL_STREAMS_NV = 0x8E29;
	public static final int GL_PRESENT_TIME_NV = 0x8E2A;
	public static final int GL_PRESENT_DURATION_NV = 0x8E2B;
	public static final int GL_NV_primitive_restart = 1;
	public static final int GL_PRIMITIVE_RESTART_NV = 0x8558;
	public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 0x8559;
	public static final int GL_NV_register_combiners = 1;
	public static final int GL_REGISTER_COMBINERS_NV = 0x8522;
	public static final int GL_VARIABLE_A_NV = 0x8523;
	public static final int GL_VARIABLE_B_NV = 0x8524;
	public static final int GL_VARIABLE_C_NV = 0x8525;
	public static final int GL_VARIABLE_D_NV = 0x8526;
	public static final int GL_VARIABLE_E_NV = 0x8527;
	public static final int GL_VARIABLE_F_NV = 0x8528;
	public static final int GL_VARIABLE_G_NV = 0x8529;
	public static final int GL_CONSTANT_COLOR0_NV = 0x852A;
	public static final int GL_CONSTANT_COLOR1_NV = 0x852B;
	public static final int GL_SPARE0_NV = 0x852E;
	public static final int GL_SPARE1_NV = 0x852F;
	public static final int GL_DISCARD_NV = 0x8530;
	public static final int GL_E_TIMES_F_NV = 0x8531;
	public static final int GL_SPARE0_PLUS_SECONDARY_COLOR_NV = 0x8532;
	public static final int GL_UNSIGNED_IDENTITY_NV = 0x8536;
	public static final int GL_UNSIGNED_INVERT_NV = 0x8537;
	public static final int GL_EXPAND_NORMAL_NV = 0x8538;
	public static final int GL_EXPAND_NEGATE_NV = 0x8539;
	public static final int GL_HALF_BIAS_NORMAL_NV = 0x853A;
	public static final int GL_HALF_BIAS_NEGATE_NV = 0x853B;
	public static final int GL_SIGNED_IDENTITY_NV = 0x853C;
	public static final int GL_SIGNED_NEGATE_NV = 0x853D;
	public static final int GL_SCALE_BY_TWO_NV = 0x853E;
	public static final int GL_SCALE_BY_FOUR_NV = 0x853F;
	public static final int GL_SCALE_BY_ONE_HALF_NV = 0x8540;
	public static final int GL_BIAS_BY_NEGATIVE_ONE_HALF_NV = 0x8541;
	public static final int GL_COMBINER_INPUT_NV = 0x8542;
	public static final int GL_COMBINER_MAPPING_NV = 0x8543;
	public static final int GL_COMBINER_COMPONENT_USAGE_NV = 0x8544;
	public static final int GL_COMBINER_AB_DOT_PRODUCT_NV = 0x8545;
	public static final int GL_COMBINER_CD_DOT_PRODUCT_NV = 0x8546;
	public static final int GL_COMBINER_MUX_SUM_NV = 0x8547;
	public static final int GL_COMBINER_SCALE_NV = 0x8548;
	public static final int GL_COMBINER_BIAS_NV = 0x8549;
	public static final int GL_COMBINER_AB_OUTPUT_NV = 0x854A;
	public static final int GL_COMBINER_CD_OUTPUT_NV = 0x854B;
	public static final int GL_COMBINER_SUM_OUTPUT_NV = 0x854C;
	public static final int GL_MAX_GENERAL_COMBINERS_NV = 0x854D;
	public static final int GL_NUM_GENERAL_COMBINERS_NV = 0x854E;
	public static final int GL_COLOR_SUM_CLAMP_NV = 0x854F;
	public static final int GL_COMBINER0_NV = 0x8550;
	public static final int GL_COMBINER1_NV = 0x8551;
	public static final int GL_COMBINER2_NV = 0x8552;
	public static final int GL_COMBINER3_NV = 0x8553;
	public static final int GL_COMBINER4_NV = 0x8554;
	public static final int GL_COMBINER5_NV = 0x8555;
	public static final int GL_COMBINER6_NV = 0x8556;
	public static final int GL_COMBINER7_NV = 0x8557;
	public static final int GL_NV_register_combiners2 = 1;
	public static final int GL_PER_STAGE_CONSTANTS_NV = 0x8535;
	public static final int GL_NV_shader_atomic_float = 1;
	public static final int GL_NV_shader_buffer_load = 1;
	public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;
	public static final int GL_GPU_ADDRESS_NV = 0x8F34;
	public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;
	public static final int GL_NV_tessellation_program5 = 1;
	public static final int GL_MAX_PROGRAM_PATCH_ATTRIBS_NV = 0x86D8;
	public static final int GL_TESS_CONTROL_PROGRAM_NV = 0x891E;
	public static final int GL_TESS_EVALUATION_PROGRAM_NV = 0x891F;
	public static final int GL_TESS_CONTROL_PROGRAM_PARAMETER_BUFFER_NV = 0x8C74;
	public static final int GL_TESS_EVALUATION_PROGRAM_PARAMETER_BUFFER_NV = 0x8C75;
	public static final int GL_NV_texgen_emboss = 1;
	public static final int GL_EMBOSS_LIGHT_NV = 0x855D;
	public static final int GL_EMBOSS_CONSTANT_NV = 0x855E;
	public static final int GL_EMBOSS_MAP_NV = 0x855F;
	public static final int GL_NV_texgen_reflection = 1;
	public static final int GL_NORMAL_MAP_NV = 0x8511;
	public static final int GL_REFLECTION_MAP_NV = 0x8512;
	public static final int GL_NV_texture_barrier = 1;
	public static final int GL_NV_texture_compression_vtc = 1;
	public static final int GL_NV_texture_env_combine4 = 1;
	public static final int GL_COMBINE4_NV = 0x8503;
	public static final int GL_SOURCE3_RGB_NV = 0x8583;
	public static final int GL_SOURCE3_ALPHA_NV = 0x858B;
	public static final int GL_OPERAND3_RGB_NV = 0x8593;
	public static final int GL_OPERAND3_ALPHA_NV = 0x859B;
	public static final int GL_NV_texture_expand_normal = 1;
	public static final int GL_TEXTURE_UNSIGNED_REMAP_MODE_NV = 0x888F;
	public static final int GL_NV_texture_multisample = 1;
	public static final int GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045;
	public static final int GL_TEXTURE_COLOR_SAMPLES_NV = 0x9046;
	public static final int GL_NV_texture_rectangle = 1;
	public static final int GL_TEXTURE_RECTANGLE_NV = 0x84F5;
	public static final int GL_TEXTURE_BINDING_RECTANGLE_NV = 0x84F6;
	public static final int GL_PROXY_TEXTURE_RECTANGLE_NV = 0x84F7;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE_NV = 0x84F8;
	public static final int GL_NV_texture_shader = 1;
	public static final int GL_OFFSET_TEXTURE_RECTANGLE_NV = 0x864C;
	public static final int GL_OFFSET_TEXTURE_RECTANGLE_SCALE_NV = 0x864D;
	public static final int GL_DOT_PRODUCT_TEXTURE_RECTANGLE_NV = 0x864E;
	public static final int GL_RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV = 0x86D9;
	public static final int GL_UNSIGNED_INT_S8_S8_8_8_NV = 0x86DA;
	public static final int GL_UNSIGNED_INT_8_8_S8_S8_REV_NV = 0x86DB;
	public static final int GL_DSDT_MAG_INTENSITY_NV = 0x86DC;
	public static final int GL_SHADER_CONSISTENT_NV = 0x86DD;
	public static final int GL_TEXTURE_SHADER_NV = 0x86DE;
	public static final int GL_SHADER_OPERATION_NV = 0x86DF;
	public static final int GL_CULL_MODES_NV = 0x86E0;
	public static final int GL_OFFSET_TEXTURE_2D_MATRIX_NV = 0x86E1;
	public static final int GL_OFFSET_TEXTURE_MATRIX_NV = 0x86E1;
	public static final int GL_OFFSET_TEXTURE_2D_SCALE_NV = 0x86E2;
	public static final int GL_OFFSET_TEXTURE_SCALE_NV = 0x86E2;
	public static final int GL_OFFSET_TEXTURE_BIAS_NV = 0x86E3;
	public static final int GL_OFFSET_TEXTURE_2D_BIAS_NV = 0x86E3;
	public static final int GL_PREVIOUS_TEXTURE_INPUT_NV = 0x86E4;
	public static final int GL_CONST_EYE_NV = 0x86E5;
	public static final int GL_PASS_THROUGH_NV = 0x86E6;
	public static final int GL_CULL_FRAGMENT_NV = 0x86E7;
	public static final int GL_OFFSET_TEXTURE_2D_NV = 0x86E8;
	public static final int GL_DEPENDENT_AR_TEXTURE_2D_NV = 0x86E9;
	public static final int GL_DEPENDENT_GB_TEXTURE_2D_NV = 0x86EA;
	public static final int GL_DOT_PRODUCT_NV = 0x86EC;
	public static final int GL_DOT_PRODUCT_DEPTH_REPLACE_NV = 0x86ED;
	public static final int GL_DOT_PRODUCT_TEXTURE_2D_NV = 0x86EE;
	public static final int GL_DOT_PRODUCT_TEXTURE_CUBE_MAP_NV = 0x86F0;
	public static final int GL_DOT_PRODUCT_DIFFUSE_CUBE_MAP_NV = 0x86F1;
	public static final int GL_DOT_PRODUCT_REFLECT_CUBE_MAP_NV = 0x86F2;
	public static final int GL_DOT_PRODUCT_CONST_EYE_REFLECT_CUBE_MAP_NV = 0x86F3;
	public static final int GL_HILO_NV = 0x86F4;
	public static final int GL_DSDT_NV = 0x86F5;
	public static final int GL_DSDT_MAG_NV = 0x86F6;
	public static final int GL_DSDT_MAG_VIB_NV = 0x86F7;
	public static final int GL_HILO16_NV = 0x86F8;
	public static final int GL_SIGNED_HILO_NV = 0x86F9;
	public static final int GL_SIGNED_HILO16_NV = 0x86FA;
	public static final int GL_SIGNED_RGBA_NV = 0x86FB;
	public static final int GL_SIGNED_RGBA8_NV = 0x86FC;
	public static final int GL_SIGNED_RGB_NV = 0x86FE;
	public static final int GL_SIGNED_RGB8_NV = 0x86FF;
	public static final int GL_SIGNED_LUMINANCE_NV = 0x8701;
	public static final int GL_SIGNED_LUMINANCE8_NV = 0x8702;
	public static final int GL_SIGNED_LUMINANCE_ALPHA_NV = 0x8703;
	public static final int GL_SIGNED_LUMINANCE8_ALPHA8_NV = 0x8704;
	public static final int GL_SIGNED_ALPHA_NV = 0x8705;
	public static final int GL_SIGNED_ALPHA8_NV = 0x8706;
	public static final int GL_SIGNED_INTENSITY_NV = 0x8707;
	public static final int GL_SIGNED_INTENSITY8_NV = 0x8708;
	public static final int GL_DSDT8_NV = 0x8709;
	public static final int GL_DSDT8_MAG8_NV = 0x870A;
	public static final int GL_DSDT8_MAG8_INTENSITY8_NV = 0x870B;
	public static final int GL_SIGNED_RGB_UNSIGNED_ALPHA_NV = 0x870C;
	public static final int GL_SIGNED_RGB8_UNSIGNED_ALPHA8_NV = 0x870D;
	public static final int GL_HI_SCALE_NV = 0x870E;
	public static final int GL_LO_SCALE_NV = 0x870F;
	public static final int GL_DS_SCALE_NV = 0x8710;
	public static final int GL_DT_SCALE_NV = 0x8711;
	public static final int GL_MAGNITUDE_SCALE_NV = 0x8712;
	public static final int GL_VIBRANCE_SCALE_NV = 0x8713;
	public static final int GL_HI_BIAS_NV = 0x8714;
	public static final int GL_LO_BIAS_NV = 0x8715;
	public static final int GL_DS_BIAS_NV = 0x8716;
	public static final int GL_DT_BIAS_NV = 0x8717;
	public static final int GL_MAGNITUDE_BIAS_NV = 0x8718;
	public static final int GL_VIBRANCE_BIAS_NV = 0x8719;
	public static final int GL_TEXTURE_BORDER_VALUES_NV = 0x871A;
	public static final int GL_TEXTURE_HI_SIZE_NV = 0x871B;
	public static final int GL_TEXTURE_LO_SIZE_NV = 0x871C;
	public static final int GL_TEXTURE_DS_SIZE_NV = 0x871D;
	public static final int GL_TEXTURE_DT_SIZE_NV = 0x871E;
	public static final int GL_TEXTURE_MAG_SIZE_NV = 0x871F;
	public static final int GL_NV_texture_shader2 = 1;
	public static final int GL_DOT_PRODUCT_TEXTURE_3D_NV = 0x86EF;
	public static final int GL_NV_texture_shader3 = 1;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_2D_NV = 0x8850;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV = 0x8851;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV = 0x8852;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV = 0x8853;
	public static final int GL_OFFSET_HILO_TEXTURE_2D_NV = 0x8854;
	public static final int GL_OFFSET_HILO_TEXTURE_RECTANGLE_NV = 0x8855;
	public static final int GL_OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV = 0x8856;
	public static final int GL_OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV = 0x8857;
	public static final int GL_DEPENDENT_HILO_TEXTURE_2D_NV = 0x8858;
	public static final int GL_DEPENDENT_RGB_TEXTURE_3D_NV = 0x8859;
	public static final int GL_DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV = 0x885A;
	public static final int GL_DOT_PRODUCT_PASS_THROUGH_NV = 0x885B;
	public static final int GL_DOT_PRODUCT_TEXTURE_1D_NV = 0x885C;
	public static final int GL_DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV = 0x885D;
	public static final int GL_HILO8_NV = 0x885E;
	public static final int GL_SIGNED_HILO8_NV = 0x885F;
	public static final int GL_FORCE_BLUE_TO_ONE_NV = 0x8860;
	public static final int GL_NV_transform_feedback = 1;
	public static final int GL_BACK_PRIMARY_COLOR_NV = 0x8C77;
	public static final int GL_BACK_SECONDARY_COLOR_NV = 0x8C78;
	public static final int GL_TEXTURE_COORD_NV = 0x8C79;
	public static final int GL_CLIP_DISTANCE_NV = 0x8C7A;
	public static final int GL_VERTEX_ID_NV = 0x8C7B;
	public static final int GL_PRIMITIVE_ID_NV = 0x8C7C;
	public static final int GL_GENERIC_ATTRIB_NV = 0x8C7D;
	public static final int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = 0x8C7E;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 0x8C7F;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = 0x8C80;
	public static final int GL_ACTIVE_VARYINGS_NV = 0x8C81;
	public static final int GL_ACTIVE_VARYING_MAX_LENGTH_NV = 0x8C82;
	public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 0x8C83;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 0x8C84;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = 0x8C85;
	public static final int GL_TRANSFORM_FEEDBACK_RECORD_NV = 0x8C86;
	public static final int GL_PRIMITIVES_GENERATED_NV = 0x8C87;
	public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 0x8C88;
	public static final int GL_RASTERIZER_DISCARD_NV = 0x8C89;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 0x8C8A;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = 0x8C8B;
	public static final int GL_INTERLEAVED_ATTRIBS_NV = 0x8C8C;
	public static final int GL_SEPARATE_ATTRIBS_NV = 0x8C8D;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 0x8C8E;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 0x8C8F;
	public static final int GL_NV_transform_feedback2 = 1;
	public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24;
	public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 0x8E25;
	public static final int GL_NV_vdpau_interop = 1;
	public static final int GL_SURFACE_STATE_NV = 0x86EB;
	public static final int GL_SURFACE_REGISTERED_NV = 0x86FD;
	public static final int GL_SURFACE_MAPPED_NV = 0x8700;
	public static final int GL_WRITE_DISCARD_NV = 0x88BE;
	public static final int GL_NV_vertex_array_range = 1;
	public static final int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;
	public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 0x851E;
	public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = 0x851F;
	public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;
	public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;
	public static final int GL_NV_vertex_array_range2 = 1;
	public static final int GL_VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV = 0x8533;
	public static final int GL_NV_vertex_attrib_integer_64bit = 1;
	public static final int GL_NV_vertex_buffer_unified_memory = 1;
	public static final int GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 0x8F1E;
	public static final int GL_ELEMENT_ARRAY_UNIFIED_NV = 0x8F1F;
	public static final int GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 0x8F20;
	public static final int GL_VERTEX_ARRAY_ADDRESS_NV = 0x8F21;
	public static final int GL_NORMAL_ARRAY_ADDRESS_NV = 0x8F22;
	public static final int GL_COLOR_ARRAY_ADDRESS_NV = 0x8F23;
	public static final int GL_INDEX_ARRAY_ADDRESS_NV = 0x8F24;
	public static final int GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 0x8F25;
	public static final int GL_EDGE_FLAG_ARRAY_ADDRESS_NV = 0x8F26;
	public static final int GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 0x8F27;
	public static final int GL_FOG_COORD_ARRAY_ADDRESS_NV = 0x8F28;
	public static final int GL_ELEMENT_ARRAY_ADDRESS_NV = 0x8F29;
	public static final int GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 0x8F2A;
	public static final int GL_VERTEX_ARRAY_LENGTH_NV = 0x8F2B;
	public static final int GL_NORMAL_ARRAY_LENGTH_NV = 0x8F2C;
	public static final int GL_COLOR_ARRAY_LENGTH_NV = 0x8F2D;
	public static final int GL_INDEX_ARRAY_LENGTH_NV = 0x8F2E;
	public static final int GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 0x8F2F;
	public static final int GL_EDGE_FLAG_ARRAY_LENGTH_NV = 0x8F30;
	public static final int GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 0x8F31;
	public static final int GL_FOG_COORD_ARRAY_LENGTH_NV = 0x8F32;
	public static final int GL_ELEMENT_ARRAY_LENGTH_NV = 0x8F33;
	public static final int GL_DRAW_INDIRECT_UNIFIED_NV = 0x8F40;
	public static final int GL_DRAW_INDIRECT_ADDRESS_NV = 0x8F41;
	public static final int GL_DRAW_INDIRECT_LENGTH_NV = 0x8F42;
	public static final int GL_NV_vertex_program = 1;
	public static final int GL_VERTEX_PROGRAM_NV = 0x8620;
	public static final int GL_VERTEX_STATE_PROGRAM_NV = 0x8621;
	public static final int GL_ATTRIB_ARRAY_SIZE_NV = 0x8623;
	public static final int GL_ATTRIB_ARRAY_STRIDE_NV = 0x8624;
	public static final int GL_ATTRIB_ARRAY_TYPE_NV = 0x8625;
	public static final int GL_CURRENT_ATTRIB_NV = 0x8626;
	public static final int GL_PROGRAM_LENGTH_NV = 0x8627;
	public static final int GL_PROGRAM_STRING_NV = 0x8628;
	public static final int GL_MODELVIEW_PROJECTION_NV = 0x8629;
	public static final int GL_IDENTITY_NV = 0x862A;
	public static final int GL_INVERSE_NV = 0x862B;
	public static final int GL_TRANSPOSE_NV = 0x862C;
	public static final int GL_INVERSE_TRANSPOSE_NV = 0x862D;
	public static final int GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV = 0x862E;
	public static final int GL_MAX_TRACK_MATRICES_NV = 0x862F;
	public static final int GL_MATRIX0_NV = 0x8630;
	public static final int GL_MATRIX1_NV = 0x8631;
	public static final int GL_MATRIX2_NV = 0x8632;
	public static final int GL_MATRIX3_NV = 0x8633;
	public static final int GL_MATRIX4_NV = 0x8634;
	public static final int GL_MATRIX5_NV = 0x8635;
	public static final int GL_MATRIX6_NV = 0x8636;
	public static final int GL_MATRIX7_NV = 0x8637;
	public static final int GL_CURRENT_MATRIX_STACK_DEPTH_NV = 0x8640;
	public static final int GL_CURRENT_MATRIX_NV = 0x8641;
	public static final int GL_VERTEX_PROGRAM_POINT_SIZE_NV = 0x8642;
	public static final int GL_VERTEX_PROGRAM_TWO_SIDE_NV = 0x8643;
	public static final int GL_PROGRAM_PARAMETER_NV = 0x8644;
	public static final int GL_ATTRIB_ARRAY_POINTER_NV = 0x8645;
	public static final int GL_PROGRAM_TARGET_NV = 0x8646;
	public static final int GL_PROGRAM_RESIDENT_NV = 0x8647;
	public static final int GL_TRACK_MATRIX_NV = 0x8648;
	public static final int GL_TRACK_MATRIX_TRANSFORM_NV = 0x8649;
	public static final int GL_VERTEX_PROGRAM_BINDING_NV = 0x864A;
	public static final int GL_PROGRAM_ERROR_POSITION_NV = 0x864B;
	public static final int GL_VERTEX_ATTRIB_ARRAY0_NV = 0x8650;
	public static final int GL_VERTEX_ATTRIB_ARRAY1_NV = 0x8651;
	public static final int GL_VERTEX_ATTRIB_ARRAY2_NV = 0x8652;
	public static final int GL_VERTEX_ATTRIB_ARRAY3_NV = 0x8653;
	public static final int GL_VERTEX_ATTRIB_ARRAY4_NV = 0x8654;
	public static final int GL_VERTEX_ATTRIB_ARRAY5_NV = 0x8655;
	public static final int GL_VERTEX_ATTRIB_ARRAY6_NV = 0x8656;
	public static final int GL_VERTEX_ATTRIB_ARRAY7_NV = 0x8657;
	public static final int GL_VERTEX_ATTRIB_ARRAY8_NV = 0x8658;
	public static final int GL_VERTEX_ATTRIB_ARRAY9_NV = 0x8659;
	public static final int GL_VERTEX_ATTRIB_ARRAY10_NV = 0x865A;
	public static final int GL_VERTEX_ATTRIB_ARRAY11_NV = 0x865B;
	public static final int GL_VERTEX_ATTRIB_ARRAY12_NV = 0x865C;
	public static final int GL_VERTEX_ATTRIB_ARRAY13_NV = 0x865D;
	public static final int GL_VERTEX_ATTRIB_ARRAY14_NV = 0x865E;
	public static final int GL_VERTEX_ATTRIB_ARRAY15_NV = 0x865F;
	public static final int GL_MAP1_VERTEX_ATTRIB0_4_NV = 0x8660;
	public static final int GL_MAP1_VERTEX_ATTRIB1_4_NV = 0x8661;
	public static final int GL_MAP1_VERTEX_ATTRIB2_4_NV = 0x8662;
	public static final int GL_MAP1_VERTEX_ATTRIB3_4_NV = 0x8663;
	public static final int GL_MAP1_VERTEX_ATTRIB4_4_NV = 0x8664;
	public static final int GL_MAP1_VERTEX_ATTRIB5_4_NV = 0x8665;
	public static final int GL_MAP1_VERTEX_ATTRIB6_4_NV = 0x8666;
	public static final int GL_MAP1_VERTEX_ATTRIB7_4_NV = 0x8667;
	public static final int GL_MAP1_VERTEX_ATTRIB8_4_NV = 0x8668;
	public static final int GL_MAP1_VERTEX_ATTRIB9_4_NV = 0x8669;
	public static final int GL_MAP1_VERTEX_ATTRIB10_4_NV = 0x866A;
	public static final int GL_MAP1_VERTEX_ATTRIB11_4_NV = 0x866B;
	public static final int GL_MAP1_VERTEX_ATTRIB12_4_NV = 0x866C;
	public static final int GL_MAP1_VERTEX_ATTRIB13_4_NV = 0x866D;
	public static final int GL_MAP1_VERTEX_ATTRIB14_4_NV = 0x866E;
	public static final int GL_MAP1_VERTEX_ATTRIB15_4_NV = 0x866F;
	public static final int GL_MAP2_VERTEX_ATTRIB0_4_NV = 0x8670;
	public static final int GL_MAP2_VERTEX_ATTRIB1_4_NV = 0x8671;
	public static final int GL_MAP2_VERTEX_ATTRIB2_4_NV = 0x8672;
	public static final int GL_MAP2_VERTEX_ATTRIB3_4_NV = 0x8673;
	public static final int GL_MAP2_VERTEX_ATTRIB4_4_NV = 0x8674;
	public static final int GL_MAP2_VERTEX_ATTRIB5_4_NV = 0x8675;
	public static final int GL_MAP2_VERTEX_ATTRIB6_4_NV = 0x8676;
	public static final int GL_MAP2_VERTEX_ATTRIB7_4_NV = 0x8677;
	public static final int GL_MAP2_VERTEX_ATTRIB8_4_NV = 0x8678;
	public static final int GL_MAP2_VERTEX_ATTRIB9_4_NV = 0x8679;
	public static final int GL_MAP2_VERTEX_ATTRIB10_4_NV = 0x867A;
	public static final int GL_MAP2_VERTEX_ATTRIB11_4_NV = 0x867B;
	public static final int GL_MAP2_VERTEX_ATTRIB12_4_NV = 0x867C;
	public static final int GL_MAP2_VERTEX_ATTRIB13_4_NV = 0x867D;
	public static final int GL_MAP2_VERTEX_ATTRIB14_4_NV = 0x867E;
	public static final int GL_MAP2_VERTEX_ATTRIB15_4_NV = 0x867F;
	public static final int GL_NV_vertex_program1_1 = 1;
	public static final int GL_NV_vertex_program2 = 1;
	public static final int GL_NV_vertex_program2_option = 1;
	public static final int GL_NV_vertex_program3 = 1;
	public static final int GL_NV_vertex_program4 = 1;
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_NV = 0x88FD;
	public static final int GL_NV_video_capture = 1;
	public static final int GL_VIDEO_BUFFER_NV = 0x9020;
	public static final int GL_VIDEO_BUFFER_BINDING_NV = 0x9021;
	public static final int GL_FIELD_UPPER_NV = 0x9022;
	public static final int GL_FIELD_LOWER_NV = 0x9023;
	public static final int GL_NUM_VIDEO_CAPTURE_STREAMS_NV = 0x9024;
	public static final int GL_NEXT_VIDEO_CAPTURE_BUFFER_STATUS_NV = 0x9025;
	public static final int GL_VIDEO_CAPTURE_TO_422_SUPPORTED_NV = 0x9026;
	public static final int GL_LAST_VIDEO_CAPTURE_STATUS_NV = 0x9027;
	public static final int GL_VIDEO_BUFFER_PITCH_NV = 0x9028;
	public static final int GL_VIDEO_COLOR_CONVERSION_MATRIX_NV = 0x9029;
	public static final int GL_VIDEO_COLOR_CONVERSION_MAX_NV = 0x902A;
	public static final int GL_VIDEO_COLOR_CONVERSION_MIN_NV = 0x902B;
	public static final int GL_VIDEO_COLOR_CONVERSION_OFFSET_NV = 0x902C;
	public static final int GL_VIDEO_BUFFER_INTERNAL_FORMAT_NV = 0x902D;
	public static final int GL_PARTIAL_SUCCESS_NV = 0x902E;
	public static final int GL_SUCCESS_NV = 0x902F;
	public static final int GL_FAILURE_NV = 0x9030;
	public static final int GL_YCBYCR8_422_NV = 0x9031;
	public static final int GL_YCBAYCR8A_4224_NV = 0x9032;
	public static final int GL_Z6Y10Z6CB10Z6Y10Z6CR10_422_NV = 0x9033;
	public static final int GL_Z6Y10Z6CB10Z6A10Z6Y10Z6CR10Z6A10_4224_NV = 0x9034;
	public static final int GL_Z4Y12Z4CB12Z4Y12Z4CR12_422_NV = 0x9035;
	public static final int GL_Z4Y12Z4CB12Z4A12Z4Y12Z4CR12Z4A12_4224_NV = 0x9036;
	public static final int GL_Z4Y12Z4CB12Z4CR12_444_NV = 0x9037;
	public static final int GL_VIDEO_CAPTURE_FRAME_WIDTH_NV = 0x9038;
	public static final int GL_VIDEO_CAPTURE_FRAME_HEIGHT_NV = 0x9039;
	public static final int GL_VIDEO_CAPTURE_FIELD_UPPER_HEIGHT_NV = 0x903A;
	public static final int GL_VIDEO_CAPTURE_FIELD_LOWER_HEIGHT_NV = 0x903B;
	public static final int GL_VIDEO_CAPTURE_SURFACE_ORIGIN_NV = 0x903C;
	public static final int GL_OES_byte_coordinates = 1;
	public static final int GL_OES_compressed_paletted_texture = 1;
	public static final int GL_PALETTE4_RGB8_OES = 0x8B90;
	public static final int GL_PALETTE4_RGBA8_OES = 0x8B91;
	public static final int GL_PALETTE4_R5_G6_B5_OES = 0x8B92;
	public static final int GL_PALETTE4_RGBA4_OES = 0x8B93;
	public static final int GL_PALETTE4_RGB5_A1_OES = 0x8B94;
	public static final int GL_PALETTE8_RGB8_OES = 0x8B95;
	public static final int GL_PALETTE8_RGBA8_OES = 0x8B96;
	public static final int GL_PALETTE8_R5_G6_B5_OES = 0x8B97;
	public static final int GL_PALETTE8_RGBA4_OES = 0x8B98;
	public static final int GL_PALETTE8_RGB5_A1_OES = 0x8B99;
	public static final int GL_OES_read_format = 1;
	public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE_OES = 0x8B9A;
	public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES = 0x8B9B;
	public static final int GL_OES_single_precision = 1;
	public static final int GL_OML_interlace = 1;
	public static final int GL_INTERLACE_OML = 0x8980;
	public static final int GL_INTERLACE_READ_OML = 0x8981;
	public static final int GL_OML_resample = 1;
	public static final int GL_PACK_RESAMPLE_OML = 0x8984;
	public static final int GL_UNPACK_RESAMPLE_OML = 0x8985;
	public static final int GL_RESAMPLE_REPLICATE_OML = 0x8986;
	public static final int GL_RESAMPLE_ZERO_FILL_OML = 0x8987;
	public static final int GL_RESAMPLE_AVERAGE_OML = 0x8988;
	public static final int GL_RESAMPLE_DECIMATE_OML = 0x8989;
	public static final int GL_OML_subsample = 1;
	public static final int GL_FORMAT_SUBSAMPLE_24_24_OML = 0x8982;
	public static final int GL_FORMAT_SUBSAMPLE_244_244_OML = 0x8983;
	public static final int GL_PGI_misc_hints = 1;
	public static final int GL_PREFER_DOUBLEBUFFER_HINT_PGI = 107000;
	public static final int GL_CONSERVE_MEMORY_HINT_PGI = 107005;
	public static final int GL_RECLAIM_MEMORY_HINT_PGI = 107006;
	public static final int GL_NATIVE_GRAPHICS_HANDLE_PGI = 107010;
	public static final int GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI = 107011;
	public static final int GL_NATIVE_GRAPHICS_END_HINT_PGI = 107012;
	public static final int GL_ALWAYS_FAST_HINT_PGI = 107020;
	public static final int GL_ALWAYS_SOFT_HINT_PGI = 107021;
	public static final int GL_ALLOW_DRAW_OBJ_HINT_PGI = 107022;
	public static final int GL_ALLOW_DRAW_WIN_HINT_PGI = 107023;
	public static final int GL_ALLOW_DRAW_FRG_HINT_PGI = 107024;
	public static final int GL_ALLOW_DRAW_MEM_HINT_PGI = 107025;
	public static final int GL_STRICT_DEPTHFUNC_HINT_PGI = 107030;
	public static final int GL_STRICT_LIGHTING_HINT_PGI = 107031;
	public static final int GL_STRICT_SCISSOR_HINT_PGI = 107032;
	public static final int GL_FULL_STIPPLE_HINT_PGI = 107033;
	public static final int GL_CLIP_NEAR_HINT_PGI = 107040;
	public static final int GL_CLIP_FAR_HINT_PGI = 107041;
	public static final int GL_WIDE_LINE_HINT_PGI = 107042;
	public static final int GL_BACK_NORMALS_HINT_PGI = 107043;
	public static final int GL_PGI_vertex_hints = 1;
	public static final int GL_VERTEX23_BIT_PGI = 0x00000004;
	public static final int GL_VERTEX4_BIT_PGI = 0x00000008;
	public static final int GL_COLOR3_BIT_PGI = 0x00010000;
	public static final int GL_COLOR4_BIT_PGI = 0x00020000;
	public static final int GL_EDGEFLAG_BIT_PGI = 0x00040000;
	public static final int GL_INDEX_BIT_PGI = 0x00080000;
	public static final int GL_MAT_AMBIENT_BIT_PGI = 0x00100000;
	public static final int GL_VERTEX_DATA_HINT_PGI = 107050;
	public static final int GL_VERTEX_CONSISTENT_HINT_PGI = 107051;
	public static final int GL_MATERIAL_SIDE_HINT_PGI = 107052;
	public static final int GL_MAX_VERTEX_HINT_PGI = 107053;
	public static final int GL_MAT_AMBIENT_AND_DIFFUSE_BIT_PGI = 0x00200000;
	public static final int GL_MAT_DIFFUSE_BIT_PGI = 0x00400000;
	public static final int GL_MAT_EMISSION_BIT_PGI = 0x00800000;
	public static final int GL_MAT_COLOR_INDEXES_BIT_PGI = 0x01000000;
	public static final int GL_MAT_SHININESS_BIT_PGI = 0x02000000;
	public static final int GL_MAT_SPECULAR_BIT_PGI = 0x04000000;
	public static final int GL_NORMAL_BIT_PGI = 0x08000000;
	public static final int GL_TEXCOORD1_BIT_PGI = 0x10000000;
	public static final int GL_TEXCOORD2_BIT_PGI = 0x20000000;
	public static final int GL_TEXCOORD3_BIT_PGI = 0x40000000;
	public static final int GL_TEXCOORD4_BIT_PGI = 0x80000000;
	public static final int GL_REGAL_error_string = 1;
	public static final int GL_REGAL_extension_query = 1;
	public static final int GL_REGAL_log = 1;
	public static final int GL_LOG_ERROR_REGAL = 0x9319;
	public static final int GL_LOG_WARNING_REGAL = 0x931A;
	public static final int GL_LOG_INFO_REGAL = 0x931B;
	public static final int GL_LOG_APP_REGAL = 0x931C;
	public static final int GL_LOG_DRIVER_REGAL = 0x931D;
	public static final int GL_LOG_INTERNAL_REGAL = 0x931E;
	public static final int GL_LOG_DEBUG_REGAL = 0x931F;
	public static final int GL_LOG_STATUS_REGAL = 0x9320;
	public static final int GL_LOG_HTTP_REGAL = 0x9321;
	public static final int GL_REND_screen_coordinates = 1;
	public static final int GL_SCREEN_COORDINATES_REND = 0x8490;
	public static final int GL_INVERTED_SCREEN_W_REND = 0x8491;
	public static final int GL_S3_s3tc = 1;
	public static final int GL_RGB_S3TC = 0x83A0;
	public static final int GL_RGB4_S3TC = 0x83A1;
	public static final int GL_RGBA_S3TC = 0x83A2;
	public static final int GL_RGBA4_S3TC = 0x83A3;
	public static final int GL_RGBA_DXT5_S3TC = 0x83A4;
	public static final int GL_RGBA4_DXT5_S3TC = 0x83A5;
	public static final int GL_SGIS_color_range = 1;
	public static final int GL_EXTENDED_RANGE_SGIS = 0x85A5;
	public static final int GL_MIN_RED_SGIS = 0x85A6;
	public static final int GL_MAX_RED_SGIS = 0x85A7;
	public static final int GL_MIN_GREEN_SGIS = 0x85A8;
	public static final int GL_MAX_GREEN_SGIS = 0x85A9;
	public static final int GL_MIN_BLUE_SGIS = 0x85AA;
	public static final int GL_MAX_BLUE_SGIS = 0x85AB;
	public static final int GL_MIN_ALPHA_SGIS = 0x85AC;
	public static final int GL_MAX_ALPHA_SGIS = 0x85AD;
	public static final int GL_SGIS_detail_texture = 1;
	public static final int GL_SGIS_fog_function = 1;
	public static final int GL_SGIS_generate_mipmap = 1;
	public static final int GL_GENERATE_MIPMAP_SGIS = 0x8191;
	public static final int GL_GENERATE_MIPMAP_HINT_SGIS = 0x8192;
	public static final int GL_SGIS_multisample = 1;
	public static final int GL_MULTISAMPLE_SGIS = 0x809D;
	public static final int GL_SAMPLE_ALPHA_TO_MASK_SGIS = 0x809E;
	public static final int GL_SAMPLE_ALPHA_TO_ONE_SGIS = 0x809F;
	public static final int GL_SAMPLE_MASK_SGIS = 0x80A0;
	public static final int GL_1PASS_SGIS = 0x80A1;
	public static final int GL_2PASS_0_SGIS = 0x80A2;
	public static final int GL_2PASS_1_SGIS = 0x80A3;
	public static final int GL_4PASS_0_SGIS = 0x80A4;
	public static final int GL_4PASS_1_SGIS = 0x80A5;
	public static final int GL_4PASS_2_SGIS = 0x80A6;
	public static final int GL_4PASS_3_SGIS = 0x80A7;
	public static final int GL_SAMPLE_BUFFERS_SGIS = 0x80A8;
	public static final int GL_SAMPLES_SGIS = 0x80A9;
	public static final int GL_SAMPLE_MASK_VALUE_SGIS = 0x80AA;
	public static final int GL_SAMPLE_MASK_INVERT_SGIS = 0x80AB;
	public static final int GL_SAMPLE_PATTERN_SGIS = 0x80AC;
	public static final int GL_SGIS_pixel_texture = 1;
	public static final int GL_SGIS_point_line_texgen = 1;
	public static final int GL_EYE_DISTANCE_TO_POINT_SGIS = 0x81F0;
	public static final int GL_OBJECT_DISTANCE_TO_POINT_SGIS = 0x81F1;
	public static final int GL_EYE_DISTANCE_TO_LINE_SGIS = 0x81F2;
	public static final int GL_OBJECT_DISTANCE_TO_LINE_SGIS = 0x81F3;
	public static final int GL_EYE_POINT_SGIS = 0x81F4;
	public static final int GL_OBJECT_POINT_SGIS = 0x81F5;
	public static final int GL_EYE_LINE_SGIS = 0x81F6;
	public static final int GL_OBJECT_LINE_SGIS = 0x81F7;
	public static final int GL_SGIS_sharpen_texture = 1;
	public static final int GL_SGIS_texture4D = 1;
	public static final int GL_SGIS_texture_border_clamp = 1;
	public static final int GL_CLAMP_TO_BORDER_SGIS = 0x812D;
	public static final int GL_SGIS_texture_edge_clamp = 1;
	public static final int GL_CLAMP_TO_EDGE_SGIS = 0x812F;
	public static final int GL_SGIS_texture_filter4 = 1;
	public static final int GL_SGIS_texture_lod = 1;
	public static final int GL_TEXTURE_MIN_LOD_SGIS = 0x813A;
	public static final int GL_TEXTURE_MAX_LOD_SGIS = 0x813B;
	public static final int GL_TEXTURE_BASE_LEVEL_SGIS = 0x813C;
	public static final int GL_TEXTURE_MAX_LEVEL_SGIS = 0x813D;
	public static final int GL_SGIS_texture_select = 1;
	public static final int GL_SGIX_async = 1;
	public static final int GL_ASYNC_MARKER_SGIX = 0x8329;
	public static final int GL_SGIX_async_histogram = 1;
	public static final int GL_ASYNC_HISTOGRAM_SGIX = 0x832C;
	public static final int GL_MAX_ASYNC_HISTOGRAM_SGIX = 0x832D;
	public static final int GL_SGIX_async_pixel = 1;
	public static final int GL_ASYNC_TEX_IMAGE_SGIX = 0x835C;
	public static final int GL_ASYNC_DRAW_PIXELS_SGIX = 0x835D;
	public static final int GL_ASYNC_READ_PIXELS_SGIX = 0x835E;
	public static final int GL_MAX_ASYNC_TEX_IMAGE_SGIX = 0x835F;
	public static final int GL_MAX_ASYNC_DRAW_PIXELS_SGIX = 0x8360;
	public static final int GL_MAX_ASYNC_READ_PIXELS_SGIX = 0x8361;
	public static final int GL_SGIX_blend_alpha_minmax = 1;
	public static final int GL_ALPHA_MIN_SGIX = 0x8320;
	public static final int GL_ALPHA_MAX_SGIX = 0x8321;
	public static final int GL_SGIX_clipmap = 1;
	public static final int GL_SGIX_convolution_accuracy = 1;
	public static final int GL_CONVOLUTION_HINT_SGIX = 0x8316;
	public static final int GL_SGIX_depth_texture = 1;
	public static final int GL_DEPTH_COMPONENT16_SGIX = 0x81A5;
	public static final int GL_DEPTH_COMPONENT24_SGIX = 0x81A6;
	public static final int GL_DEPTH_COMPONENT32_SGIX = 0x81A7;
	public static final int GL_SGIX_flush_raster = 1;
	public static final int GL_SGIX_fog_offset = 1;
	public static final int GL_FOG_OFFSET_SGIX = 0x8198;
	public static final int GL_FOG_OFFSET_VALUE_SGIX = 0x8199;
	public static final int GL_SGIX_fog_texture = 1;
	public static final int GL_TEXTURE_FOG_SGIX = 0;
	public static final int GL_FOG_PATCHY_FACTOR_SGIX = 0;
	public static final int GL_FRAGMENT_FOG_SGIX = 0;
	public static final int GL_SGIX_fragment_specular_lighting = 1;
	public static final int GL_SGIX_framezoom = 1;
	public static final int GL_SGIX_interlace = 1;
	public static final int GL_INTERLACE_SGIX = 0x8094;
	public static final int GL_SGIX_ir_instrument1 = 1;
	public static final int GL_SGIX_list_priority = 1;
	public static final int GL_SGIX_pixel_texture = 1;
	public static final int GL_SGIX_pixel_texture_bits = 1;
	public static final int GL_SGIX_reference_plane = 1;
	public static final int GL_SGIX_resample = 1;
	public static final int GL_PACK_RESAMPLE_SGIX = 0x842E;
	public static final int GL_UNPACK_RESAMPLE_SGIX = 0x842F;
	public static final int GL_RESAMPLE_DECIMATE_SGIX = 0x8430;
	public static final int GL_RESAMPLE_REPLICATE_SGIX = 0x8433;
	public static final int GL_RESAMPLE_ZERO_FILL_SGIX = 0x8434;
	public static final int GL_SGIX_shadow = 1;
	public static final int GL_TEXTURE_COMPARE_SGIX = 0x819A;
	public static final int GL_TEXTURE_COMPARE_OPERATOR_SGIX = 0x819B;
	public static final int GL_TEXTURE_LEQUAL_R_SGIX = 0x819C;
	public static final int GL_TEXTURE_GEQUAL_R_SGIX = 0x819D;
	public static final int GL_SGIX_shadow_ambient = 1;
	public static final int GL_SHADOW_AMBIENT_SGIX = 0x80BF;
	public static final int GL_SGIX_sprite = 1;
	public static final int GL_SGIX_tag_sample_buffer = 1;
	public static final int GL_SGIX_texture_add_env = 1;
	public static final int GL_SGIX_texture_coordinate_clamp = 1;
	public static final int GL_TEXTURE_MAX_CLAMP_S_SGIX = 0x8369;
	public static final int GL_TEXTURE_MAX_CLAMP_T_SGIX = 0x836A;
	public static final int GL_TEXTURE_MAX_CLAMP_R_SGIX = 0x836B;
	public static final int GL_SGIX_texture_lod_bias = 1;
	public static final int GL_SGIX_texture_multi_buffer = 1;
	public static final int GL_TEXTURE_MULTI_BUFFER_HINT_SGIX = 0x812E;
	public static final int GL_SGIX_texture_range = 1;
	public static final int GL_RGB_SIGNED_SGIX = 0x85E0;
	public static final int GL_RGBA_SIGNED_SGIX = 0x85E1;
	public static final int GL_ALPHA_SIGNED_SGIX = 0x85E2;
	public static final int GL_LUMINANCE_SIGNED_SGIX = 0x85E3;
	public static final int GL_INTENSITY_SIGNED_SGIX = 0x85E4;
	public static final int GL_LUMINANCE_ALPHA_SIGNED_SGIX = 0x85E5;
	public static final int GL_RGB16_SIGNED_SGIX = 0x85E6;
	public static final int GL_RGBA16_SIGNED_SGIX = 0x85E7;
	public static final int GL_ALPHA16_SIGNED_SGIX = 0x85E8;
	public static final int GL_LUMINANCE16_SIGNED_SGIX = 0x85E9;
	public static final int GL_INTENSITY16_SIGNED_SGIX = 0x85EA;
	public static final int GL_LUMINANCE16_ALPHA16_SIGNED_SGIX = 0x85EB;
	public static final int GL_RGB_EXTENDED_RANGE_SGIX = 0x85EC;
	public static final int GL_RGBA_EXTENDED_RANGE_SGIX = 0x85ED;
	public static final int GL_ALPHA_EXTENDED_RANGE_SGIX = 0x85EE;
	public static final int GL_LUMINANCE_EXTENDED_RANGE_SGIX = 0x85EF;
	public static final int GL_INTENSITY_EXTENDED_RANGE_SGIX = 0x85F0;
	public static final int GL_LUMINANCE_ALPHA_EXTENDED_RANGE_SGIX = 0x85F1;
	public static final int GL_RGB16_EXTENDED_RANGE_SGIX = 0x85F2;
	public static final int GL_RGBA16_EXTENDED_RANGE_SGIX = 0x85F3;
	public static final int GL_ALPHA16_EXTENDED_RANGE_SGIX = 0x85F4;
	public static final int GL_LUMINANCE16_EXTENDED_RANGE_SGIX = 0x85F5;
	public static final int GL_INTENSITY16_EXTENDED_RANGE_SGIX = 0x85F6;
	public static final int GL_LUMINANCE16_ALPHA16_EXTENDED_RANGE_SGIX = 0x85F7;
	public static final int GL_MIN_LUMINANCE_SGIS = 0x85F8;
	public static final int GL_MAX_LUMINANCE_SGIS = 0x85F9;
	public static final int GL_MIN_INTENSITY_SGIS = 0x85FA;
	public static final int GL_MAX_INTENSITY_SGIS = 0x85FB;
	public static final int GL_SGIX_texture_scale_bias = 1;
	public static final int GL_POST_TEXTURE_FILTER_BIAS_SGIX = 0x8179;
	public static final int GL_POST_TEXTURE_FILTER_SCALE_SGIX = 0x817A;
	public static final int GL_POST_TEXTURE_FILTER_BIAS_RANGE_SGIX = 0x817B;
	public static final int GL_POST_TEXTURE_FILTER_SCALE_RANGE_SGIX = 0x817C;
	public static final int GL_SGIX_vertex_preclip = 1;
	public static final int GL_VERTEX_PRECLIP_SGIX = 0x83EE;
	public static final int GL_VERTEX_PRECLIP_HINT_SGIX = 0x83EF;
	public static final int GL_SGIX_vertex_preclip_hint = 1;
	public static final int GL_SGIX_ycrcb = 1;
	public static final int GL_SGI_color_matrix = 1;
	public static final int GL_COLOR_MATRIX_SGI = 0x80B1;
	public static final int GL_COLOR_MATRIX_STACK_DEPTH_SGI = 0x80B2;
	public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH_SGI = 0x80B3;
	public static final int GL_POST_COLOR_MATRIX_RED_SCALE_SGI = 0x80B4;
	public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE_SGI = 0x80B5;
	public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE_SGI = 0x80B6;
	public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE_SGI = 0x80B7;
	public static final int GL_POST_COLOR_MATRIX_RED_BIAS_SGI = 0x80B8;
	public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS_SGI = 0x80B9;
	public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS_SGI = 0x80BA;
	public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS_SGI = 0x80BB;
	public static final int GL_SGI_color_table = 1;
	public static final int GL_COLOR_TABLE_SGI = 0x80D0;
	public static final int GL_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D1;
	public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D2;
	public static final int GL_PROXY_COLOR_TABLE_SGI = 0x80D3;
	public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D4;
	public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D5;
	public static final int GL_COLOR_TABLE_SCALE_SGI = 0x80D6;
	public static final int GL_COLOR_TABLE_BIAS_SGI = 0x80D7;
	public static final int GL_COLOR_TABLE_FORMAT_SGI = 0x80D8;
	public static final int GL_COLOR_TABLE_WIDTH_SGI = 0x80D9;
	public static final int GL_COLOR_TABLE_RED_SIZE_SGI = 0x80DA;
	public static final int GL_COLOR_TABLE_GREEN_SIZE_SGI = 0x80DB;
	public static final int GL_COLOR_TABLE_BLUE_SIZE_SGI = 0x80DC;
	public static final int GL_COLOR_TABLE_ALPHA_SIZE_SGI = 0x80DD;
	public static final int GL_COLOR_TABLE_LUMINANCE_SIZE_SGI = 0x80DE;
	public static final int GL_COLOR_TABLE_INTENSITY_SIZE_SGI = 0x80DF;
	public static final int GL_SGI_texture_color_table = 1;
	public static final int GL_TEXTURE_COLOR_TABLE_SGI = 0x80BC;
	public static final int GL_PROXY_TEXTURE_COLOR_TABLE_SGI = 0x80BD;
	public static final int GL_SUNX_constant_data = 1;
	public static final int GL_UNPACK_CONSTANT_DATA_SUNX = 0x81D5;
	public static final int GL_TEXTURE_CONSTANT_DATA_SUNX = 0x81D6;
	public static final int GL_SUN_convolution_border_modes = 1;
	public static final int GL_WRAP_BORDER_SUN = 0x81D4;
	public static final int GL_SUN_global_alpha = 1;
	public static final int GL_GLOBAL_ALPHA_SUN = 0x81D9;
	public static final int GL_GLOBAL_ALPHA_FACTOR_SUN = 0x81DA;
	public static final int GL_SUN_mesh_array = 1;
	public static final int GL_QUAD_MESH_SUN = 0x8614;
	public static final int GL_TRIANGLE_MESH_SUN = 0x8615;
	public static final int GL_SUN_read_video_pixels = 1;
	public static final int GL_SUN_slice_accum = 1;
	public static final int GL_SLICE_ACCUM_SUN = 0x85CC;
	public static final int GL_SUN_triangle_list = 1;
	public static final int GL_RESTART_SUN = 0x01;
	public static final int GL_REPLACE_MIDDLE_SUN = 0x02;
	public static final int GL_REPLACE_OLDEST_SUN = 0x03;
	public static final int GL_TRIANGLE_LIST_SUN = 0x81D7;
	public static final int GL_REPLACEMENT_CODE_SUN = 0x81D8;
	public static final int GL_REPLACEMENT_CODE_ARRAY_SUN = 0x85C0;
	public static final int GL_REPLACEMENT_CODE_ARRAY_TYPE_SUN = 0x85C1;
	public static final int GL_REPLACEMENT_CODE_ARRAY_STRIDE_SUN = 0x85C2;
	public static final int GL_REPLACEMENT_CODE_ARRAY_POINTER_SUN = 0x85C3;
	public static final int GL_R1UI_V3F_SUN = 0x85C4;
	public static final int GL_R1UI_C4UB_V3F_SUN = 0x85C5;
	public static final int GL_R1UI_C3F_V3F_SUN = 0x85C6;
	public static final int GL_R1UI_N3F_V3F_SUN = 0x85C7;
	public static final int GL_R1UI_C4F_N3F_V3F_SUN = 0x85C8;
	public static final int GL_R1UI_T2F_V3F_SUN = 0x85C9;
	public static final int GL_R1UI_T2F_N3F_V3F_SUN = 0x85CA;
	public static final int GL_R1UI_T2F_C4F_N3F_V3F_SUN = 0x85CB;
	public static final int GL_SUN_vertex = 1;
	public static final int GL_WIN_phong_shading = 1;
	public static final int GL_PHONG_WIN = 0x80EA;
	public static final int GL_PHONG_HINT_WIN = 0x80EB;
	public static final int GL_WIN_specular_fog = 1;
	public static final int GL_FOG_SPECULAR_TEXTURE_WIN = 0x80EC;
	public static final int GL_WIN_swap_hint = 1;

	// @off
	/*JNI
	#include <GL/glfw3.h>
	#include <GL/glext.h>
	#if defined(_WIN32)
	#ifndef APIENTRY
	#define GLEW_APIENTRY_DEFINED
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define APIENTRY __stdcall
	#  elif (_MSC_VER >= 800) || defined(_STDCALL_SUPPORTED) || defined(__BORLANDC__)
	#    define APIENTRY __stdcall
	#  else
	#    define APIENTRY
	#  endif
	#endif
	#ifndef GLAPI
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define GLAPI extern
	#  endif
	#endif

	#ifndef CALLBACK
	#define GLEW_CALLBACK_DEFINED
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define CALLBACK __attribute__ ((__stdcall__))
	#  elif (defined(_M_MRX000) || defined(_M_IX86) || defined(_M_ALPHA) || defined(_M_PPC)) && !defined(MIDL_PASS)
	#    define CALLBACK __stdcall
	#  else
	#    define CALLBACK
	#  endif
	#endif

	#ifndef WINGDIAPI
	#define GLEW_WINGDIAPI_DEFINED
	#define WINGDIAPI __declspec(dllimport)
	#endif

	#if (defined(_MSC_VER) || defined(__BORLANDC__)) && !defined(_WCHAR_T_DEFINED)
	typedef unsigned short wchar_t;
	#  define _WCHAR_T_DEFINED
	#endif

	#if !defined(_W64)
	#  if !defined(__midl) && (defined(_X86_) || defined(_M_IX86)) && defined(_MSC_VER) && _MSC_VER >= 1300
	#    define _W64 __w64
	#  else
	#    define _W64
	#  endif
	#endif
	#if !defined(_PTRDIFF_T_DEFINED) && !defined(_PTRDIFF_T_) && !defined(__MINGW64__)
	#  ifdef _WIN64
	typedef __int64 ptrdiff_t;
	#  else
	typedef _W64 int ptrdiff_t;
	#  endif
	#  define _PTRDIFF_T_DEFINED
	#  define _PTRDIFF_T_
	#endif

	#ifndef GLAPI
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define GLAPI extern
	#  else
	#    define GLAPI WINGDIAPI
	#  endif
	#endif

	#ifndef GLAPIENTRY
	#define GLAPIENTRY APIENTRY
	#endif

	#ifndef GLEWAPIENTRY
	#define GLEWAPIENTRY APIENTRY
	#endif

	#ifdef GLEW_STATIC
	#  define GLEWAPI extern
	#else
	#  ifdef GLEW_BUILD
	#    define GLEWAPI extern __declspec(dllexport)
	#  else
	#    define GLEWAPI extern __declspec(dllimport)
	#  endif
	#endif

	#else

	#include <stddef.h>

	#if (defined(__sgi) || defined(__sun)) && !defined(__GNUC__)
	#include <inttypes.h>
	#else
	#include <stdint.h>
	#endif

	#define GLEW_APIENTRY_DEFINED
	#define APIENTRY

	#ifdef GLEW_STATIC
	#  define GLEWAPI extern
	#else
	#  if defined(__GNUC__) && __GNUC__>=4
	#   define GLEWAPI extern __attribute__ ((visibility("default")))
	#  elif defined(__SUNPRO_C) || defined(__SUNPRO_CC)
	#   define GLEWAPI extern __global
	#  else
	#   define GLEWAPI extern
	#  endif
	#endif

	#ifndef GLAPI
	#define GLAPI extern
	#endif

	#ifndef GLAPIENTRY
	#define GLAPIENTRY
	#endif

	#ifndef GLEWAPIENTRY
	#define GLEWAPIENTRY
	#endif

	#endif

	typedef unsigned int GLenum;
	typedef unsigned int GLbitfield;
	typedef unsigned int GLuint;
	typedef int GLint;
	typedef int GLsizei;
	typedef unsigned char GLboolean;
	typedef signed char GLbyte;
	typedef short GLshort;
	typedef unsigned char GLubyte;
	typedef unsigned short GLushort;
	typedef unsigned long GLulong;
	typedef float GLfloat;
	typedef float GLclampf;
	typedef double GLdouble;
	typedef double GLclampd;
	typedef void GLvoid;
	#if defined(_MSC_VER) && _MSC_VER < 1400
	typedef __int64 GLint64EXT;
	typedef unsigned __int64 GLuint64EXT;
	#elif defined(_MSC_VER) || defined(__BORLANDC__)
	typedef signed long long GLint64EXT;
	typedef unsigned long long GLuint64EXT;
	#else
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#include <inttypes.h>
	#  endif
	typedef int64_t GLint64EXT;
	typedef uint64_t GLuint64EXT;
	#endif
	typedef GLint64EXT  GLint64;
	typedef GLuint64EXT GLuint64;
	typedef struct __GLsync *GLsync;

	typedef char GLchar;
*/
	public static native void glAccum(int op, float value); /*
		glAccum((GLenum)op, (GLfloat)value);
	*/

	public static native void glAlphaFunc(int func, float ref); /*
		glAlphaFunc((GLenum)func, (GLclampf)ref);
	*/

	public static native boolean glAreTexturesResident(int n, Buffer textures, int texturesByteOffset, Buffer residences, int residencesByteOffset); /*
		return (GLboolean)glAreTexturesResident((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (GLboolean*)(residences + residencesByteOffset));
	*/

	public static native void glArrayElement(int i); /*
		glArrayElement((GLint)i);
	*/

	public static native void glBegin(int mode); /*
		glBegin((GLenum)mode);
	*/

	public static native void glBindTexture(int target, int texture); /*
		glBindTexture((GLenum)target, (GLuint)texture);
	*/

	public static native void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, Buffer bitmap, int bitmapByteOffset); /*
		glBitmap((GLsizei)width, (GLsizei)height, (GLfloat)xorig, (GLfloat)yorig, (GLfloat)xmove, (GLfloat)ymove, (const GLubyte*)(bitmap + bitmapByteOffset));
	*/

	public static native void glBlendFunc(int sfactor, int dfactor); /*
		glBlendFunc((GLenum)sfactor, (GLenum)dfactor);
	*/

	public static native void glCallList(int list); /*
		glCallList((GLuint)list);
	*/

	public static native void glCallLists(int n, int type, Buffer lists, int listsByteOffset); /*
		glCallLists((GLsizei)n, (GLenum)type, (const GLvoid*)(lists + listsByteOffset));
	*/

	public static native void glClear(int mask); /*
		glClear((GLbitfield)mask);
	*/

	public static native void glClearAccum(float red, float green, float blue, float alpha); /*
		glClearAccum((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	*/

	public static native void glClearColor(float red, float green, float blue, float alpha); /*
		glClearColor((GLclampf)red, (GLclampf)green, (GLclampf)blue, (GLclampf)alpha);
	*/

	public static native void glClearDepth(double depth); /*
		glClearDepth((GLclampd)depth);
	*/

	public static native void glClearIndex(float c); /*
		glClearIndex((GLfloat)c);
	*/

	public static native void glClearStencil(int s); /*
		glClearStencil((GLint)s);
	*/

	public static native void glClipPlane(int plane, Buffer equation, int equationByteOffset); /*
		glClipPlane((GLenum)plane, (const GLdouble*)(equation + equationByteOffset));
	*/

	public static native void glColor3b(byte red, byte green, byte blue); /*
		glColor3b((GLbyte)red, (GLbyte)green, (GLbyte)blue);
	*/

	public static native void glColor3bv(Buffer v, int vByteOffset); /*
		glColor3bv((const GLbyte*)(v + vByteOffset));
	*/

	public static native void glColor3d(double red, double green, double blue); /*
		glColor3d((GLdouble)red, (GLdouble)green, (GLdouble)blue);
	*/

	public static native void glColor3dv(Buffer v, int vByteOffset); /*
		glColor3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glColor3f(float red, float green, float blue); /*
		glColor3f((GLfloat)red, (GLfloat)green, (GLfloat)blue);
	*/

	public static native void glColor3fv(Buffer v, int vByteOffset); /*
		glColor3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glColor3i(int red, int green, int blue); /*
		glColor3i((GLint)red, (GLint)green, (GLint)blue);
	*/

	public static native void glColor3iv(Buffer v, int vByteOffset); /*
		glColor3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glColor3s(short red, short green, short blue); /*
		glColor3s((GLshort)red, (GLshort)green, (GLshort)blue);
	*/

	public static native void glColor3sv(Buffer v, int vByteOffset); /*
		glColor3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glColor3ub(byte red, byte green, byte blue); /*
		glColor3ub((GLubyte)red, (GLubyte)green, (GLubyte)blue);
	*/

	public static native void glColor3ubv(Buffer v, int vByteOffset); /*
		glColor3ubv((const GLubyte*)(v + vByteOffset));
	*/

	public static native void glColor3ui(int red, int green, int blue); /*
		glColor3ui((GLuint)red, (GLuint)green, (GLuint)blue);
	*/

	public static native void glColor3uiv(Buffer v, int vByteOffset); /*
		glColor3uiv((const GLuint*)(v + vByteOffset));
	*/

	public static native void glColor3us(short red, short green, short blue); /*
		glColor3us((GLushort)red, (GLushort)green, (GLushort)blue);
	*/

	public static native void glColor3usv(Buffer v, int vByteOffset); /*
		glColor3usv((const GLushort*)(v + vByteOffset));
	*/

	public static native void glColor4b(byte red, byte green, byte blue, byte alpha); /*
		glColor4b((GLbyte)red, (GLbyte)green, (GLbyte)blue, (GLbyte)alpha);
	*/

	public static native void glColor4bv(Buffer v, int vByteOffset); /*
		glColor4bv((const GLbyte*)(v + vByteOffset));
	*/

	public static native void glColor4d(double red, double green, double blue, double alpha); /*
		glColor4d((GLdouble)red, (GLdouble)green, (GLdouble)blue, (GLdouble)alpha);
	*/

	public static native void glColor4dv(Buffer v, int vByteOffset); /*
		glColor4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glColor4f(float red, float green, float blue, float alpha); /*
		glColor4f((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	*/

	public static native void glColor4fv(Buffer v, int vByteOffset); /*
		glColor4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glColor4i(int red, int green, int blue, int alpha); /*
		glColor4i((GLint)red, (GLint)green, (GLint)blue, (GLint)alpha);
	*/

	public static native void glColor4iv(Buffer v, int vByteOffset); /*
		glColor4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glColor4s(short red, short green, short blue, short alpha); /*
		glColor4s((GLshort)red, (GLshort)green, (GLshort)blue, (GLshort)alpha);
	*/

	public static native void glColor4sv(Buffer v, int vByteOffset); /*
		glColor4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glColor4ub(byte red, byte green, byte blue, byte alpha); /*
		glColor4ub((GLubyte)red, (GLubyte)green, (GLubyte)blue, (GLubyte)alpha);
	*/

	public static native void glColor4ubv(Buffer v, int vByteOffset); /*
		glColor4ubv((const GLubyte*)(v + vByteOffset));
	*/

	public static native void glColor4ui(int red, int green, int blue, int alpha); /*
		glColor4ui((GLuint)red, (GLuint)green, (GLuint)blue, (GLuint)alpha);
	*/

	public static native void glColor4uiv(Buffer v, int vByteOffset); /*
		glColor4uiv((const GLuint*)(v + vByteOffset));
	*/

	public static native void glColor4us(short red, short green, short blue, short alpha); /*
		glColor4us((GLushort)red, (GLushort)green, (GLushort)blue, (GLushort)alpha);
	*/

	public static native void glColor4usv(Buffer v, int vByteOffset); /*
		glColor4usv((const GLushort*)(v + vByteOffset));
	*/

	public static native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha); /*
		glColorMask((GLboolean)red, (GLboolean)green, (GLboolean)blue, (GLboolean)alpha);
	*/

	public static native void glColorMaterial(int face, int mode); /*
		glColorMaterial((GLenum)face, (GLenum)mode);
	*/

	public static native void glColorPointer(int size, int type, int stride, Buffer pointer, int pointerByteOffset); /*
		glColorPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

	public static native void glCopyPixels(int x, int y, int width, int height, int type); /*
		glCopyPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)type);
	*/

	public static native void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border); /*
		glCopyTexImage1D((GLenum)target, (GLint)level, (GLenum)internalFormat, (GLint)x, (GLint)y, (GLsizei)width, (GLint)border);
	*/

	public static native void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border); /*
		glCopyTexImage2D((GLenum)target, (GLint)level, (GLenum)internalFormat, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLint)border);
	*/

	public static native void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width); /*
		glCopyTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)x, (GLint)y, (GLsizei)width);
	*/

	public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height); /*
		glCopyTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	*/

	public static native void glCullFace(int mode); /*
		glCullFace((GLenum)mode);
	*/

	public static native void glDeleteLists(int list, int range); /*
		glDeleteLists((GLuint)list, (GLsizei)range);
	*/

	public static native void glDeleteTextures(int n, Buffer textures, int texturesByteOffset); /*
		glDeleteTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset));
	*/

	public static native void glDepthFunc(int func); /*
		glDepthFunc((GLenum)func);
	*/

	public static native void glDepthMask(boolean flag); /*
		glDepthMask((GLboolean)flag);
	*/

	public static native void glDepthRange(double zNear, double zFar); /*
		glDepthRange((GLclampd)zNear, (GLclampd)zFar);
	*/

	public static native void glDisable(int cap); /*
		glDisable((GLenum)cap);
	*/

	public static native void glDisableClientState(int array); /*
		glDisableClientState((GLenum)array);
	*/

	public static native void glDrawArrays(int mode, int first, int count); /*
		glDrawArrays((GLenum)mode, (GLint)first, (GLsizei)count);
	*/

	public static native void glDrawBuffer(int mode); /*
		glDrawBuffer((GLenum)mode);
	*/

	public static native void glDrawElements(int mode, int count, int type, Buffer indices, int indicesByteOffset); /*
		glDrawElements((GLenum)mode, (GLsizei)count, (GLenum)type, (const GLvoid*)(indices + indicesByteOffset));
	*/

	public static native void glDrawPixels(int width, int height, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glDrawPixels((GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glEdgeFlag(boolean flag); /*
		glEdgeFlag((GLboolean)flag);
	*/

	public static native void glEdgeFlagPointer(int stride, Buffer pointer, int pointerByteOffset); /*
		glEdgeFlagPointer((GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

	public static native void glEdgeFlagv(Buffer flag, int flagByteOffset); /*
		glEdgeFlagv((const GLboolean*)(flag + flagByteOffset));
	*/

	public static native void glEnable(int cap); /*
		glEnable((GLenum)cap);
	*/

	public static native void glEnableClientState(int array); /*
		glEnableClientState((GLenum)array);
	*/

	public static native void glEnd(); /*
		glEnd();
	*/

	public static native void glEndList(); /*
		glEndList();
	*/

	public static native void glEvalCoord1d(double u); /*
		glEvalCoord1d((GLdouble)u);
	*/

	public static native void glEvalCoord1dv(Buffer u, int uByteOffset); /*
		glEvalCoord1dv((const GLdouble*)(u + uByteOffset));
	*/

	public static native void glEvalCoord1f(float u); /*
		glEvalCoord1f((GLfloat)u);
	*/

	public static native void glEvalCoord1fv(Buffer u, int uByteOffset); /*
		glEvalCoord1fv((const GLfloat*)(u + uByteOffset));
	*/

	public static native void glEvalCoord2d(double u, double v); /*
		glEvalCoord2d((GLdouble)u, (GLdouble)v);
	*/

	public static native void glEvalCoord2dv(Buffer u, int uByteOffset); /*
		glEvalCoord2dv((const GLdouble*)(u + uByteOffset));
	*/

	public static native void glEvalCoord2f(float u, float v); /*
		glEvalCoord2f((GLfloat)u, (GLfloat)v);
	*/

	public static native void glEvalCoord2fv(Buffer u, int uByteOffset); /*
		glEvalCoord2fv((const GLfloat*)(u + uByteOffset));
	*/

	public static native void glEvalMesh1(int mode, int i1, int i2); /*
		glEvalMesh1((GLenum)mode, (GLint)i1, (GLint)i2);
	*/

	public static native void glEvalMesh2(int mode, int i1, int i2, int j1, int j2); /*
		glEvalMesh2((GLenum)mode, (GLint)i1, (GLint)i2, (GLint)j1, (GLint)j2);
	*/

	public static native void glEvalPoint1(int i); /*
		glEvalPoint1((GLint)i);
	*/

	public static native void glEvalPoint2(int i, int j); /*
		glEvalPoint2((GLint)i, (GLint)j);
	*/

	public static native void glFeedbackBuffer(int size, int type, Buffer buffer, int bufferByteOffset); /*
		glFeedbackBuffer((GLsizei)size, (GLenum)type, (GLfloat*)(buffer + bufferByteOffset));
	*/

	public static native void glFinish(); /*
		glFinish();
	*/

	public static native void glFlush(); /*
		glFlush();
	*/

	public static native void glFogf(int pname, float param); /*
		glFogf((GLenum)pname, (GLfloat)param);
	*/

	public static native void glFogfv(int pname, Buffer params, int paramsByteOffset); /*
		glFogfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glFogi(int pname, int param); /*
		glFogi((GLenum)pname, (GLint)param);
	*/

	public static native void glFogiv(int pname, Buffer params, int paramsByteOffset); /*
		glFogiv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glFrontFace(int mode); /*
		glFrontFace((GLenum)mode);
	*/

	public static native void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar); /*
		glFrustum((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)zNear, (GLdouble)zFar);
	*/

	public static native int glGenLists(int range); /*
		return (GLuint)glGenLists((GLsizei)range);
	*/

	public static native void glGenTextures(int n, Buffer textures, int texturesByteOffset); /*
		glGenTextures((GLsizei)n, (GLuint*)(textures + texturesByteOffset));
	*/

	public static native void glGetBooleanv(int pname, Buffer params, int paramsByteOffset); /*
		glGetBooleanv((GLenum)pname, (GLboolean*)(params + paramsByteOffset));
	*/

	public static native void glGetClipPlane(int plane, Buffer equation, int equationByteOffset); /*
		glGetClipPlane((GLenum)plane, (GLdouble*)(equation + equationByteOffset));
	*/

	public static native void glGetDoublev(int pname, Buffer params, int paramsByteOffset); /*
		glGetDoublev((GLenum)pname, (GLdouble*)(params + paramsByteOffset));
	*/

	public static native int glGetError(); /*
		return (GLenum)glGetError();
	*/

	public static native void glGetFloatv(int pname, Buffer params, int paramsByteOffset); /*
		glGetFloatv((GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetIntegerv(int pname, Buffer params, int paramsByteOffset); /*
		glGetIntegerv((GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetLightfv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glGetLightfv((GLenum)light, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetLightiv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glGetLightiv((GLenum)light, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetMapdv(int target, int query, Buffer v, int vByteOffset); /*
		glGetMapdv((GLenum)target, (GLenum)query, (GLdouble*)(v + vByteOffset));
	*/

	public static native void glGetMapfv(int target, int query, Buffer v, int vByteOffset); /*
		glGetMapfv((GLenum)target, (GLenum)query, (GLfloat*)(v + vByteOffset));
	*/

	public static native void glGetMapiv(int target, int query, Buffer v, int vByteOffset); /*
		glGetMapiv((GLenum)target, (GLenum)query, (GLint*)(v + vByteOffset));
	*/

	public static native void glGetMaterialfv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glGetMaterialfv((GLenum)face, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetMaterialiv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glGetMaterialiv((GLenum)face, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetPixelMapfv(int map, Buffer values, int valuesByteOffset); /*
		glGetPixelMapfv((GLenum)map, (GLfloat*)(values + valuesByteOffset));
	*/

	public static native void glGetPixelMapuiv(int map, Buffer values, int valuesByteOffset); /*
		glGetPixelMapuiv((GLenum)map, (GLuint*)(values + valuesByteOffset));
	*/

	public static native void glGetPixelMapusv(int map, Buffer values, int valuesByteOffset); /*
		glGetPixelMapusv((GLenum)map, (GLushort*)(values + valuesByteOffset));
	*/

	public static native void glGetPointerv(int pname, Buffer params, int paramsByteOffset); /*
		glGetPointerv((GLenum)pname, (GLvoid**)(params + paramsByteOffset));
	*/

	public static native void glGetPolygonStipple(Buffer mask, int maskByteOffset); /*
		glGetPolygonStipple((GLubyte*)(mask + maskByteOffset));
	*/

	public static native Buffer glGetString(int name); /*
		return env->NewStringUTF((const char*)glGetString((GLenum)name));
	*/

	public static native void glGetTexEnvfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexEnvfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetTexEnviv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexEnviv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetTexGendv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexGendv((GLenum)coord, (GLenum)pname, (GLdouble*)(params + paramsByteOffset));
	*/

	public static native void glGetTexGenfv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexGenfv((GLenum)coord, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetTexGeniv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexGeniv((GLenum)coord, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetTexImage(int target, int level, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glGetTexImage((GLenum)target, (GLint)level, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glGetTexLevelParameterfv(int target, int level, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexLevelParameterfv((GLenum)target, (GLint)level, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetTexLevelParameteriv(int target, int level, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexLevelParameteriv((GLenum)target, (GLint)level, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetTexParameterfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexParameterfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetTexParameteriv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexParameteriv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glHint(int target, int mode); /*
		glHint((GLenum)target, (GLenum)mode);
	*/

	public static native void glIndexMask(int mask); /*
		glIndexMask((GLuint)mask);
	*/

	public static native void glIndexPointer(int type, int stride, Buffer pointer, int pointerByteOffset); /*
		glIndexPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

	public static native void glIndexd(double c); /*
		glIndexd((GLdouble)c);
	*/

	public static native void glIndexdv(Buffer c, int cByteOffset); /*
		glIndexdv((const GLdouble*)(c + cByteOffset));
	*/

	public static native void glIndexf(float c); /*
		glIndexf((GLfloat)c);
	*/

	public static native void glIndexfv(Buffer c, int cByteOffset); /*
		glIndexfv((const GLfloat*)(c + cByteOffset));
	*/

	public static native void glIndexi(int c); /*
		glIndexi((GLint)c);
	*/

	public static native void glIndexiv(Buffer c, int cByteOffset); /*
		glIndexiv((const GLint*)(c + cByteOffset));
	*/

	public static native void glIndexs(short c); /*
		glIndexs((GLshort)c);
	*/

	public static native void glIndexsv(Buffer c, int cByteOffset); /*
		glIndexsv((const GLshort*)(c + cByteOffset));
	*/

	public static native void glIndexub(byte c); /*
		glIndexub((GLubyte)c);
	*/

	public static native void glIndexubv(Buffer c, int cByteOffset); /*
		glIndexubv((const GLubyte*)(c + cByteOffset));
	*/

	public static native void glInitNames(); /*
		glInitNames();
	*/

	public static native void glInterleavedArrays(int format, int stride, Buffer pointer, int pointerByteOffset); /*
		glInterleavedArrays((GLenum)format, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

	public static native boolean glIsEnabled(int cap); /*
		return (GLboolean)glIsEnabled((GLenum)cap);
	*/

	public static native boolean glIsList(int list); /*
		return (GLboolean)glIsList((GLuint)list);
	*/

	public static native boolean glIsTexture(int texture); /*
		return (GLboolean)glIsTexture((GLuint)texture);
	*/

	public static native void glLightModelf(int pname, float param); /*
		glLightModelf((GLenum)pname, (GLfloat)param);
	*/

	public static native void glLightModelfv(int pname, Buffer params, int paramsByteOffset); /*
		glLightModelfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glLightModeli(int pname, int param); /*
		glLightModeli((GLenum)pname, (GLint)param);
	*/

	public static native void glLightModeliv(int pname, Buffer params, int paramsByteOffset); /*
		glLightModeliv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glLightf(int light, int pname, float param); /*
		glLightf((GLenum)light, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glLightfv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glLightfv((GLenum)light, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glLighti(int light, int pname, int param); /*
		glLighti((GLenum)light, (GLenum)pname, (GLint)param);
	*/

	public static native void glLightiv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glLightiv((GLenum)light, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glLineStipple(int factor, short pattern); /*
		glLineStipple((GLint)factor, (GLushort)pattern);
	*/

	public static native void glLineWidth(float width); /*
		glLineWidth((GLfloat)width);
	*/

	public static native void glListBase(int base); /*
		glListBase((GLuint)base);
	*/

	public static native void glLoadIdentity(); /*
		glLoadIdentity();
	*/

	public static native void glLoadMatrixd(Buffer m, int mByteOffset); /*
		glLoadMatrixd((const GLdouble*)(m + mByteOffset));
	*/

	public static native void glLoadMatrixf(Buffer m, int mByteOffset); /*
		glLoadMatrixf((const GLfloat*)(m + mByteOffset));
	*/

	public static native void glLoadName(int name); /*
		glLoadName((GLuint)name);
	*/

	public static native void glLogicOp(int opcode); /*
		glLogicOp((GLenum)opcode);
	*/

	public static native void glMap1d(int target, double u1, double u2, int stride, int order, Buffer points, int pointsByteOffset); /*
		glMap1d((GLenum)target, (GLdouble)u1, (GLdouble)u2, (GLint)stride, (GLint)order, (const GLdouble*)(points + pointsByteOffset));
	*/

	public static native void glMap1f(int target, float u1, float u2, int stride, int order, Buffer points, int pointsByteOffset); /*
		glMap1f((GLenum)target, (GLfloat)u1, (GLfloat)u2, (GLint)stride, (GLint)order, (const GLfloat*)(points + pointsByteOffset));
	*/

	public static native void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, Buffer points, int pointsByteOffset); /*
		glMap2d((GLenum)target, (GLdouble)u1, (GLdouble)u2, (GLint)ustride, (GLint)uorder, (GLdouble)v1, (GLdouble)v2, (GLint)vstride, (GLint)vorder, (const GLdouble*)(points + pointsByteOffset));
	*/

	public static native void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, Buffer points, int pointsByteOffset); /*
		glMap2f((GLenum)target, (GLfloat)u1, (GLfloat)u2, (GLint)ustride, (GLint)uorder, (GLfloat)v1, (GLfloat)v2, (GLint)vstride, (GLint)vorder, (const GLfloat*)(points + pointsByteOffset));
	*/

	public static native void glMapGrid1d(int un, double u1, double u2); /*
		glMapGrid1d((GLint)un, (GLdouble)u1, (GLdouble)u2);
	*/

	public static native void glMapGrid1f(int un, float u1, float u2); /*
		glMapGrid1f((GLint)un, (GLfloat)u1, (GLfloat)u2);
	*/

	public static native void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2); /*
		glMapGrid2d((GLint)un, (GLdouble)u1, (GLdouble)u2, (GLint)vn, (GLdouble)v1, (GLdouble)v2);
	*/

	public static native void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2); /*
		glMapGrid2f((GLint)un, (GLfloat)u1, (GLfloat)u2, (GLint)vn, (GLfloat)v1, (GLfloat)v2);
	*/

	public static native void glMaterialf(int face, int pname, float param); /*
		glMaterialf((GLenum)face, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glMaterialfv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glMaterialfv((GLenum)face, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glMateriali(int face, int pname, int param); /*
		glMateriali((GLenum)face, (GLenum)pname, (GLint)param);
	*/

	public static native void glMaterialiv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glMaterialiv((GLenum)face, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glMatrixMode(int mode); /*
		glMatrixMode((GLenum)mode);
	*/

	public static native void glMultMatrixd(Buffer m, int mByteOffset); /*
		glMultMatrixd((const GLdouble*)(m + mByteOffset));
	*/

	public static native void glMultMatrixf(Buffer m, int mByteOffset); /*
		glMultMatrixf((const GLfloat*)(m + mByteOffset));
	*/

	public static native void glNewList(int list, int mode); /*
		glNewList((GLuint)list, (GLenum)mode);
	*/

	public static native void glNormal3b(byte nx, byte ny, byte nz); /*
		glNormal3b((GLbyte)nx, (GLbyte)ny, (GLbyte)nz);
	*/

	public static native void glNormal3bv(Buffer v, int vByteOffset); /*
		glNormal3bv((const GLbyte*)(v + vByteOffset));
	*/

	public static native void glNormal3d(double nx, double ny, double nz); /*
		glNormal3d((GLdouble)nx, (GLdouble)ny, (GLdouble)nz);
	*/

	public static native void glNormal3dv(Buffer v, int vByteOffset); /*
		glNormal3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glNormal3f(float nx, float ny, float nz); /*
		glNormal3f((GLfloat)nx, (GLfloat)ny, (GLfloat)nz);
	*/

	public static native void glNormal3fv(Buffer v, int vByteOffset); /*
		glNormal3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glNormal3i(int nx, int ny, int nz); /*
		glNormal3i((GLint)nx, (GLint)ny, (GLint)nz);
	*/

	public static native void glNormal3iv(Buffer v, int vByteOffset); /*
		glNormal3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glNormal3s(short nx, short ny, short nz); /*
		glNormal3s((GLshort)nx, (GLshort)ny, (GLshort)nz);
	*/

	public static native void glNormal3sv(Buffer v, int vByteOffset); /*
		glNormal3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glNormalPointer(int type, int stride, Buffer pointer, int pointerByteOffset); /*
		glNormalPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

	public static native void glOrtho(double left, double right, double bottom, double top, double zNear, double zFar); /*
		glOrtho((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)zNear, (GLdouble)zFar);
	*/

	public static native void glPassThrough(float token); /*
		glPassThrough((GLfloat)token);
	*/

	public static native void glPixelMapfv(int map, int mapsize, Buffer values, int valuesByteOffset); /*
		glPixelMapfv((GLenum)map, (GLsizei)mapsize, (const GLfloat*)(values + valuesByteOffset));
	*/

	public static native void glPixelMapuiv(int map, int mapsize, Buffer values, int valuesByteOffset); /*
		glPixelMapuiv((GLenum)map, (GLsizei)mapsize, (const GLuint*)(values + valuesByteOffset));
	*/

	public static native void glPixelMapusv(int map, int mapsize, Buffer values, int valuesByteOffset); /*
		glPixelMapusv((GLenum)map, (GLsizei)mapsize, (const GLushort*)(values + valuesByteOffset));
	*/

	public static native void glPixelStoref(int pname, float param); /*
		glPixelStoref((GLenum)pname, (GLfloat)param);
	*/

	public static native void glPixelStorei(int pname, int param); /*
		glPixelStorei((GLenum)pname, (GLint)param);
	*/

	public static native void glPixelTransferf(int pname, float param); /*
		glPixelTransferf((GLenum)pname, (GLfloat)param);
	*/

	public static native void glPixelTransferi(int pname, int param); /*
		glPixelTransferi((GLenum)pname, (GLint)param);
	*/

	public static native void glPixelZoom(float xfactor, float yfactor); /*
		glPixelZoom((GLfloat)xfactor, (GLfloat)yfactor);
	*/

	public static native void glPointSize(float size); /*
		glPointSize((GLfloat)size);
	*/

	public static native void glPolygonMode(int face, int mode); /*
		glPolygonMode((GLenum)face, (GLenum)mode);
	*/

	public static native void glPolygonOffset(float factor, float units); /*
		glPolygonOffset((GLfloat)factor, (GLfloat)units);
	*/

	public static native void glPolygonStipple(Buffer mask, int maskByteOffset); /*
		glPolygonStipple((const GLubyte*)(mask + maskByteOffset));
	*/

	public static native void glPopAttrib(); /*
		glPopAttrib();
	*/

	public static native void glPopClientAttrib(); /*
		glPopClientAttrib();
	*/

	public static native void glPopMatrix(); /*
		glPopMatrix();
	*/

	public static native void glPopName(); /*
		glPopName();
	*/

	public static native void glPrioritizeTextures(int n, Buffer textures, int texturesByteOffset, Buffer priorities, int prioritiesByteOffset); /*
		glPrioritizeTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (const GLclampf*)(priorities + prioritiesByteOffset));
	*/

	public static native void glPushAttrib(int mask); /*
		glPushAttrib((GLbitfield)mask);
	*/

	public static native void glPushClientAttrib(int mask); /*
		glPushClientAttrib((GLbitfield)mask);
	*/

	public static native void glPushMatrix(); /*
		glPushMatrix();
	*/

	public static native void glPushName(int name); /*
		glPushName((GLuint)name);
	*/

	public static native void glRasterPos2d(double x, double y); /*
		glRasterPos2d((GLdouble)x, (GLdouble)y);
	*/

	public static native void glRasterPos2dv(Buffer v, int vByteOffset); /*
		glRasterPos2dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glRasterPos2f(float x, float y); /*
		glRasterPos2f((GLfloat)x, (GLfloat)y);
	*/

	public static native void glRasterPos2fv(Buffer v, int vByteOffset); /*
		glRasterPos2fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glRasterPos2i(int x, int y); /*
		glRasterPos2i((GLint)x, (GLint)y);
	*/

	public static native void glRasterPos2iv(Buffer v, int vByteOffset); /*
		glRasterPos2iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glRasterPos2s(short x, short y); /*
		glRasterPos2s((GLshort)x, (GLshort)y);
	*/

	public static native void glRasterPos2sv(Buffer v, int vByteOffset); /*
		glRasterPos2sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glRasterPos3d(double x, double y, double z); /*
		glRasterPos3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glRasterPos3dv(Buffer v, int vByteOffset); /*
		glRasterPos3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glRasterPos3f(float x, float y, float z); /*
		glRasterPos3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native void glRasterPos3fv(Buffer v, int vByteOffset); /*
		glRasterPos3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glRasterPos3i(int x, int y, int z); /*
		glRasterPos3i((GLint)x, (GLint)y, (GLint)z);
	*/

	public static native void glRasterPos3iv(Buffer v, int vByteOffset); /*
		glRasterPos3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glRasterPos3s(short x, short y, short z); /*
		glRasterPos3s((GLshort)x, (GLshort)y, (GLshort)z);
	*/

	public static native void glRasterPos3sv(Buffer v, int vByteOffset); /*
		glRasterPos3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glRasterPos4d(double x, double y, double z, double w); /*
		glRasterPos4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	*/

	public static native void glRasterPos4dv(Buffer v, int vByteOffset); /*
		glRasterPos4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glRasterPos4f(float x, float y, float z, float w); /*
		glRasterPos4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	*/

	public static native void glRasterPos4fv(Buffer v, int vByteOffset); /*
		glRasterPos4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glRasterPos4i(int x, int y, int z, int w); /*
		glRasterPos4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	*/

	public static native void glRasterPos4iv(Buffer v, int vByteOffset); /*
		glRasterPos4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glRasterPos4s(short x, short y, short z, short w); /*
		glRasterPos4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	*/

	public static native void glRasterPos4sv(Buffer v, int vByteOffset); /*
		glRasterPos4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glReadBuffer(int mode); /*
		glReadBuffer((GLenum)mode);
	*/

	public static native void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glReadPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glRectd(double x1, double y1, double x2, double y2); /*
		glRectd((GLdouble)x1, (GLdouble)y1, (GLdouble)x2, (GLdouble)y2);
	*/

	public static native void glRectdv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectdv((const GLdouble*)(v1 + v1ByteOffset), (const GLdouble*)(v2 + v2ByteOffset));
	*/

	public static native void glRectf(float x1, float y1, float x2, float y2); /*
		glRectf((GLfloat)x1, (GLfloat)y1, (GLfloat)x2, (GLfloat)y2);
	*/

	public static native void glRectfv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectfv((const GLfloat*)(v1 + v1ByteOffset), (const GLfloat*)(v2 + v2ByteOffset));
	*/

	public static native void glRecti(int x1, int y1, int x2, int y2); /*
		glRecti((GLint)x1, (GLint)y1, (GLint)x2, (GLint)y2);
	*/

	public static native void glRectiv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectiv((const GLint*)(v1 + v1ByteOffset), (const GLint*)(v2 + v2ByteOffset));
	*/

	public static native void glRects(short x1, short y1, short x2, short y2); /*
		glRects((GLshort)x1, (GLshort)y1, (GLshort)x2, (GLshort)y2);
	*/

	public static native void glRectsv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectsv((const GLshort*)(v1 + v1ByteOffset), (const GLshort*)(v2 + v2ByteOffset));
	*/

	public static native int glRenderMode(int mode); /*
		return (GLint)glRenderMode((GLenum)mode);
	*/

	public static native void glRotated(double angle, double x, double y, double z); /*
		glRotated((GLdouble)angle, (GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glRotatef(float angle, float x, float y, float z); /*
		glRotatef((GLfloat)angle, (GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native void glScaled(double x, double y, double z); /*
		glScaled((GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glScalef(float x, float y, float z); /*
		glScalef((GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native void glScissor(int x, int y, int width, int height); /*
		glScissor((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	*/

	public static native void glSelectBuffer(int size, Buffer buffer, int bufferByteOffset); /*
		glSelectBuffer((GLsizei)size, (GLuint*)(buffer + bufferByteOffset));
	*/

	public static native void glShadeModel(int mode); /*
		glShadeModel((GLenum)mode);
	*/

	public static native void glStencilFunc(int func, int ref, int mask); /*
		glStencilFunc((GLenum)func, (GLint)ref, (GLuint)mask);
	*/

	public static native void glStencilMask(int mask); /*
		glStencilMask((GLuint)mask);
	*/

	public static native void glStencilOp(int fail, int zfail, int zpass); /*
		glStencilOp((GLenum)fail, (GLenum)zfail, (GLenum)zpass);
	*/

	public static native void glTexCoord1d(double s); /*
		glTexCoord1d((GLdouble)s);
	*/

	public static native void glTexCoord1dv(Buffer v, int vByteOffset); /*
		glTexCoord1dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord1f(float s); /*
		glTexCoord1f((GLfloat)s);
	*/

	public static native void glTexCoord1fv(Buffer v, int vByteOffset); /*
		glTexCoord1fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord1i(int s); /*
		glTexCoord1i((GLint)s);
	*/

	public static native void glTexCoord1iv(Buffer v, int vByteOffset); /*
		glTexCoord1iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord1s(short s); /*
		glTexCoord1s((GLshort)s);
	*/

	public static native void glTexCoord1sv(Buffer v, int vByteOffset); /*
		glTexCoord1sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glTexCoord2d(double s, double t); /*
		glTexCoord2d((GLdouble)s, (GLdouble)t);
	*/

	public static native void glTexCoord2dv(Buffer v, int vByteOffset); /*
		glTexCoord2dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord2f(float s, float t); /*
		glTexCoord2f((GLfloat)s, (GLfloat)t);
	*/

	public static native void glTexCoord2fv(Buffer v, int vByteOffset); /*
		glTexCoord2fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord2i(int s, int t); /*
		glTexCoord2i((GLint)s, (GLint)t);
	*/

	public static native void glTexCoord2iv(Buffer v, int vByteOffset); /*
		glTexCoord2iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord2s(short s, short t); /*
		glTexCoord2s((GLshort)s, (GLshort)t);
	*/

	public static native void glTexCoord2sv(Buffer v, int vByteOffset); /*
		glTexCoord2sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glTexCoord3d(double s, double t, double r); /*
		glTexCoord3d((GLdouble)s, (GLdouble)t, (GLdouble)r);
	*/

	public static native void glTexCoord3dv(Buffer v, int vByteOffset); /*
		glTexCoord3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord3f(float s, float t, float r); /*
		glTexCoord3f((GLfloat)s, (GLfloat)t, (GLfloat)r);
	*/

	public static native void glTexCoord3fv(Buffer v, int vByteOffset); /*
		glTexCoord3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord3i(int s, int t, int r); /*
		glTexCoord3i((GLint)s, (GLint)t, (GLint)r);
	*/

	public static native void glTexCoord3iv(Buffer v, int vByteOffset); /*
		glTexCoord3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord3s(short s, short t, short r); /*
		glTexCoord3s((GLshort)s, (GLshort)t, (GLshort)r);
	*/

	public static native void glTexCoord3sv(Buffer v, int vByteOffset); /*
		glTexCoord3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glTexCoord4d(double s, double t, double r, double q); /*
		glTexCoord4d((GLdouble)s, (GLdouble)t, (GLdouble)r, (GLdouble)q);
	*/

	public static native void glTexCoord4dv(Buffer v, int vByteOffset); /*
		glTexCoord4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord4f(float s, float t, float r, float q); /*
		glTexCoord4f((GLfloat)s, (GLfloat)t, (GLfloat)r, (GLfloat)q);
	*/

	public static native void glTexCoord4fv(Buffer v, int vByteOffset); /*
		glTexCoord4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord4i(int s, int t, int r, int q); /*
		glTexCoord4i((GLint)s, (GLint)t, (GLint)r, (GLint)q);
	*/

	public static native void glTexCoord4iv(Buffer v, int vByteOffset); /*
		glTexCoord4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord4s(short s, short t, short r, short q); /*
		glTexCoord4s((GLshort)s, (GLshort)t, (GLshort)r, (GLshort)q);
	*/

	public static native void glTexCoord4sv(Buffer v, int vByteOffset); /*
		glTexCoord4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glTexCoordPointer(int size, int type, int stride, Buffer pointer, int pointerByteOffset); /*
		glTexCoordPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

	public static native void glTexEnvf(int target, int pname, float param); /*
		glTexEnvf((GLenum)target, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glTexEnvfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexEnvfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glTexEnvi(int target, int pname, int param); /*
		glTexEnvi((GLenum)target, (GLenum)pname, (GLint)param);
	*/

	public static native void glTexEnviv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexEnviv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glTexGend(int coord, int pname, double param); /*
		glTexGend((GLenum)coord, (GLenum)pname, (GLdouble)param);
	*/

	public static native void glTexGendv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glTexGendv((GLenum)coord, (GLenum)pname, (const GLdouble*)(params + paramsByteOffset));
	*/

	public static native void glTexGenf(int coord, int pname, float param); /*
		glTexGenf((GLenum)coord, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glTexGenfv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glTexGenfv((GLenum)coord, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glTexGeni(int coord, int pname, int param); /*
		glTexGeni((GLenum)coord, (GLenum)pname, (GLint)param);
	*/

	public static native void glTexGeniv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glTexGeniv((GLenum)coord, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexImage1D((GLenum)target, (GLint)level, (GLint)internalformat, (GLsizei)width, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexImage2D((GLenum)target, (GLint)level, (GLint)internalformat, (GLsizei)width, (GLsizei)height, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glTexParameterf(int target, int pname, float param); /*
		glTexParameterf((GLenum)target, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glTexParameterfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexParameterfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glTexParameteri(int target, int pname, int param); /*
		glTexParameteri((GLenum)target, (GLenum)pname, (GLint)param);
	*/

	public static native void glTexParameteriv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexParameteriv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLsizei)width, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glTranslated(double x, double y, double z); /*
		glTranslated((GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glTranslatef(float x, float y, float z); /*
		glTranslatef((GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native void glVertex2d(double x, double y); /*
		glVertex2d((GLdouble)x, (GLdouble)y);
	*/

	public static native void glVertex2dv(Buffer v, int vByteOffset); /*
		glVertex2dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glVertex2f(float x, float y); /*
		glVertex2f((GLfloat)x, (GLfloat)y);
	*/

	public static native void glVertex2fv(Buffer v, int vByteOffset); /*
		glVertex2fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glVertex2i(int x, int y); /*
		glVertex2i((GLint)x, (GLint)y);
	*/

	public static native void glVertex2iv(Buffer v, int vByteOffset); /*
		glVertex2iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glVertex2s(short x, short y); /*
		glVertex2s((GLshort)x, (GLshort)y);
	*/

	public static native void glVertex2sv(Buffer v, int vByteOffset); /*
		glVertex2sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glVertex3d(double x, double y, double z); /*
		glVertex3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glVertex3dv(Buffer v, int vByteOffset); /*
		glVertex3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glVertex3f(float x, float y, float z); /*
		glVertex3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native void glVertex3fv(Buffer v, int vByteOffset); /*
		glVertex3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glVertex3i(int x, int y, int z); /*
		glVertex3i((GLint)x, (GLint)y, (GLint)z);
	*/

	public static native void glVertex3iv(Buffer v, int vByteOffset); /*
		glVertex3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glVertex3s(short x, short y, short z); /*
		glVertex3s((GLshort)x, (GLshort)y, (GLshort)z);
	*/

	public static native void glVertex3sv(Buffer v, int vByteOffset); /*
		glVertex3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glVertex4d(double x, double y, double z, double w); /*
		glVertex4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	*/

	public static native void glVertex4dv(Buffer v, int vByteOffset); /*
		glVertex4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glVertex4f(float x, float y, float z, float w); /*
		glVertex4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	*/

	public static native void glVertex4fv(Buffer v, int vByteOffset); /*
		glVertex4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glVertex4i(int x, int y, int z, int w); /*
		glVertex4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	*/

	public static native void glVertex4iv(Buffer v, int vByteOffset); /*
		glVertex4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glVertex4s(short x, short y, short z, short w); /*
		glVertex4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	*/

	public static native void glVertex4sv(Buffer v, int vByteOffset); /*
		glVertex4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glVertexPointer(int size, int type, int stride, Buffer pointer, int pointerByteOffset); /*
		glVertexPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

	public static native void glViewport(int x, int y, int width, int height); /*
		glViewport((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	*/

}