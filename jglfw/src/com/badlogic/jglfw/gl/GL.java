package com.badlogic.jglfw.gl;

import java.nio.Buffer;

public class GL {
	public static final int GL_VERSION_1_1 = 1;
	public static final int GL_VERSION_1_2 = 1;
	public static final int GL_VERSION_1_3 = 1;
	public static final int GL_ARB_imaging = 1;
	public static final int GL_FALSE = 0x0;
	public static final int GL_TRUE = 0x1;
	public static final int GL_BYTE = 0x1400;
	public static final int GL_UNSIGNED_BYTE = 0x1401;
	public static final int GL_SHORT = 0x1402;
	public static final int GL_UNSIGNED_SHORT = 0x1403;
	public static final int GL_INT = 0x1404;
	public static final int GL_UNSIGNED_INT = 0x1405;
	public static final int GL_FLOAT = 0x1406;
	public static final int GL_DOUBLE = 0x140A;
	public static final int GL_2_BYTES = 0x1407;
	public static final int GL_3_BYTES = 0x1408;
	public static final int GL_4_BYTES = 0x1409;
	public static final int GL_POINTS = 0x0000;
	public static final int GL_LINES = 0x0001;
	public static final int GL_LINE_LOOP = 0x0002;
	public static final int GL_LINE_STRIP = 0x0003;
	public static final int GL_TRIANGLES = 0x0004;
	public static final int GL_TRIANGLE_STRIP = 0x0005;
	public static final int GL_TRIANGLE_FAN = 0x0006;
	public static final int GL_QUADS = 0x0007;
	public static final int GL_QUAD_STRIP = 0x0008;
	public static final int GL_POLYGON = 0x0009;
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
	public static final int GL_MATRIX_MODE = 0x0BA0;
	public static final int GL_MODELVIEW = 0x1700;
	public static final int GL_PROJECTION = 0x1701;
	public static final int GL_TEXTURE = 0x1702;
	public static final int GL_POINT_SMOOTH = 0x0B10;
	public static final int GL_POINT_SIZE = 0x0B11;
	public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
	public static final int GL_POINT_SIZE_RANGE = 0x0B12;
	public static final int GL_LINE_SMOOTH = 0x0B20;
	public static final int GL_LINE_STIPPLE = 0x0B24;
	public static final int GL_LINE_STIPPLE_PATTERN = 0x0B25;
	public static final int GL_LINE_STIPPLE_REPEAT = 0x0B26;
	public static final int GL_LINE_WIDTH = 0x0B21;
	public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
	public static final int GL_LINE_WIDTH_RANGE = 0x0B22;
	public static final int GL_POINT = 0x1B00;
	public static final int GL_LINE = 0x1B01;
	public static final int GL_FILL = 0x1B02;
	public static final int GL_CW = 0x0900;
	public static final int GL_CCW = 0x0901;
	public static final int GL_FRONT = 0x0404;
	public static final int GL_BACK = 0x0405;
	public static final int GL_POLYGON_MODE = 0x0B40;
	public static final int GL_POLYGON_SMOOTH = 0x0B41;
	public static final int GL_POLYGON_STIPPLE = 0x0B42;
	public static final int GL_EDGE_FLAG = 0x0B43;
	public static final int GL_CULL_FACE = 0x0B44;
	public static final int GL_CULL_FACE_MODE = 0x0B45;
	public static final int GL_FRONT_FACE = 0x0B46;
	public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
	public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
	public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
	public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
	public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
	public static final int GL_COMPILE = 0x1300;
	public static final int GL_COMPILE_AND_EXECUTE = 0x1301;
	public static final int GL_LIST_BASE = 0x0B32;
	public static final int GL_LIST_INDEX = 0x0B33;
	public static final int GL_LIST_MODE = 0x0B30;
	public static final int GL_NEVER = 0x0200;
	public static final int GL_LESS = 0x0201;
	public static final int GL_EQUAL = 0x0202;
	public static final int GL_LEQUAL = 0x0203;
	public static final int GL_GREATER = 0x0204;
	public static final int GL_NOTEQUAL = 0x0205;
	public static final int GL_GEQUAL = 0x0206;
	public static final int GL_ALWAYS = 0x0207;
	public static final int GL_DEPTH_TEST = 0x0B71;
	public static final int GL_DEPTH_BITS = 0x0D56;
	public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
	public static final int GL_DEPTH_FUNC = 0x0B74;
	public static final int GL_DEPTH_RANGE = 0x0B70;
	public static final int GL_DEPTH_WRITEMASK = 0x0B72;
	public static final int GL_DEPTH_COMPONENT = 0x1902;
	public static final int GL_LIGHTING = 0x0B50;
	public static final int GL_LIGHT0 = 0x4000;
	public static final int GL_LIGHT1 = 0x4001;
	public static final int GL_LIGHT2 = 0x4002;
	public static final int GL_LIGHT3 = 0x4003;
	public static final int GL_LIGHT4 = 0x4004;
	public static final int GL_LIGHT5 = 0x4005;
	public static final int GL_LIGHT6 = 0x4006;
	public static final int GL_LIGHT7 = 0x4007;
	public static final int GL_SPOT_EXPONENT = 0x1205;
	public static final int GL_SPOT_CUTOFF = 0x1206;
	public static final int GL_CONSTANT_ATTENUATION = 0x1207;
	public static final int GL_LINEAR_ATTENUATION = 0x1208;
	public static final int GL_QUADRATIC_ATTENUATION = 0x1209;
	public static final int GL_AMBIENT = 0x1200;
	public static final int GL_DIFFUSE = 0x1201;
	public static final int GL_SPECULAR = 0x1202;
	public static final int GL_SHININESS = 0x1601;
	public static final int GL_EMISSION = 0x1600;
	public static final int GL_POSITION = 0x1203;
	public static final int GL_SPOT_DIRECTION = 0x1204;
	public static final int GL_AMBIENT_AND_DIFFUSE = 0x1602;
	public static final int GL_COLOR_INDEXES = 0x1603;
	public static final int GL_LIGHT_MODEL_TWO_SIDE = 0x0B52;
	public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 0x0B51;
	public static final int GL_LIGHT_MODEL_AMBIENT = 0x0B53;
	public static final int GL_FRONT_AND_BACK = 0x0408;
	public static final int GL_SHADE_MODEL = 0x0B54;
	public static final int GL_FLAT = 0x1D00;
	public static final int GL_SMOOTH = 0x1D01;
	public static final int GL_COLOR_MATERIAL = 0x0B57;
	public static final int GL_COLOR_MATERIAL_FACE = 0x0B55;
	public static final int GL_COLOR_MATERIAL_PARAMETER = 0x0B56;
	public static final int GL_NORMALIZE = 0x0BA1;
	public static final int GL_CLIP_PLANE0 = 0x3000;
	public static final int GL_CLIP_PLANE1 = 0x3001;
	public static final int GL_CLIP_PLANE2 = 0x3002;
	public static final int GL_CLIP_PLANE3 = 0x3003;
	public static final int GL_CLIP_PLANE4 = 0x3004;
	public static final int GL_CLIP_PLANE5 = 0x3005;
	public static final int GL_ACCUM_RED_BITS = 0x0D58;
	public static final int GL_ACCUM_GREEN_BITS = 0x0D59;
	public static final int GL_ACCUM_BLUE_BITS = 0x0D5A;
	public static final int GL_ACCUM_ALPHA_BITS = 0x0D5B;
	public static final int GL_ACCUM_CLEAR_VALUE = 0x0B80;
	public static final int GL_ACCUM = 0x0100;
	public static final int GL_ADD = 0x0104;
	public static final int GL_LOAD = 0x0101;
	public static final int GL_MULT = 0x0103;
	public static final int GL_RETURN = 0x0102;
	public static final int GL_ALPHA_TEST = 0x0BC0;
	public static final int GL_ALPHA_TEST_REF = 0x0BC2;
	public static final int GL_ALPHA_TEST_FUNC = 0x0BC1;
	public static final int GL_BLEND = 0x0BE2;
	public static final int GL_BLEND_SRC = 0x0BE1;
	public static final int GL_BLEND_DST = 0x0BE0;
	public static final int GL_ZERO = 0x0;
	public static final int GL_ONE = 0x1;
	public static final int GL_SRC_COLOR = 0x0300;
	public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
	public static final int GL_SRC_ALPHA = 0x0302;
	public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
	public static final int GL_DST_ALPHA = 0x0304;
	public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
	public static final int GL_DST_COLOR = 0x0306;
	public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
	public static final int GL_SRC_ALPHA_SATURATE = 0x0308;
	public static final int GL_CONSTANT_COLOR = 0x8001;
	public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
	public static final int GL_CONSTANT_ALPHA = 0x8003;
	public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
	public static final int GL_FEEDBACK = 0x1C01;
	public static final int GL_RENDER = 0x1C00;
	public static final int GL_SELECT = 0x1C02;
	public static final int GL_2D = 0x0600;
	public static final int GL_3D = 0x0601;
	public static final int GL_3D_COLOR = 0x0602;
	public static final int GL_3D_COLOR_TEXTURE = 0x0603;
	public static final int GL_4D_COLOR_TEXTURE = 0x0604;
	public static final int GL_POINT_TOKEN = 0x0701;
	public static final int GL_LINE_TOKEN = 0x0702;
	public static final int GL_LINE_RESET_TOKEN = 0x0707;
	public static final int GL_POLYGON_TOKEN = 0x0703;
	public static final int GL_BITMAP_TOKEN = 0x0704;
	public static final int GL_DRAW_PIXEL_TOKEN = 0x0705;
	public static final int GL_COPY_PIXEL_TOKEN = 0x0706;
	public static final int GL_PASS_THROUGH_TOKEN = 0x0700;
	public static final int GL_FEEDBACK_BUFFER_POINTER = 0x0DF0;
	public static final int GL_FEEDBACK_BUFFER_SIZE = 0x0DF1;
	public static final int GL_FEEDBACK_BUFFER_TYPE = 0x0DF2;
	public static final int GL_SELECTION_BUFFER_POINTER = 0x0DF3;
	public static final int GL_SELECTION_BUFFER_SIZE = 0x0DF4;
	public static final int GL_FOG = 0x0B60;
	public static final int GL_FOG_MODE = 0x0B65;
	public static final int GL_FOG_DENSITY = 0x0B62;
	public static final int GL_FOG_COLOR = 0x0B66;
	public static final int GL_FOG_INDEX = 0x0B61;
	public static final int GL_FOG_START = 0x0B63;
	public static final int GL_FOG_END = 0x0B64;
	public static final int GL_LINEAR = 0x2601;
	public static final int GL_EXP = 0x0800;
	public static final int GL_EXP2 = 0x0801;
	public static final int GL_LOGIC_OP = 0x0BF1;
	public static final int GL_INDEX_LOGIC_OP = 0x0BF1;
	public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
	public static final int GL_LOGIC_OP_MODE = 0x0BF0;
	public static final int GL_CLEAR = 0x1500;
	public static final int GL_SET = 0x150F;
	public static final int GL_COPY = 0x1503;
	public static final int GL_COPY_INVERTED = 0x150C;
	public static final int GL_NOOP = 0x1505;
	public static final int GL_INVERT = 0x150A;
	public static final int GL_AND = 0x1501;
	public static final int GL_NAND = 0x150E;
	public static final int GL_OR = 0x1507;
	public static final int GL_NOR = 0x1508;
	public static final int GL_XOR = 0x1506;
	public static final int GL_EQUIV = 0x1509;
	public static final int GL_AND_REVERSE = 0x1502;
	public static final int GL_AND_INVERTED = 0x1504;
	public static final int GL_OR_REVERSE = 0x150B;
	public static final int GL_OR_INVERTED = 0x150D;
	public static final int GL_STENCIL_TEST = 0x0B90;
	public static final int GL_STENCIL_WRITEMASK = 0x0B98;
	public static final int GL_STENCIL_BITS = 0x0D57;
	public static final int GL_STENCIL_FUNC = 0x0B92;
	public static final int GL_STENCIL_VALUE_MASK = 0x0B93;
	public static final int GL_STENCIL_REF = 0x0B97;
	public static final int GL_STENCIL_FAIL = 0x0B94;
	public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
	public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
	public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;
	public static final int GL_STENCIL_INDEX = 0x1901;
	public static final int GL_KEEP = 0x1E00;
	public static final int GL_REPLACE = 0x1E01;
	public static final int GL_INCR = 0x1E02;
	public static final int GL_DECR = 0x1E03;
	public static final int GL_NONE = 0x0;
	public static final int GL_LEFT = 0x0406;
	public static final int GL_RIGHT = 0x0407;
	public static final int GL_FRONT_LEFT = 0x0400;
	public static final int GL_FRONT_RIGHT = 0x0401;
	public static final int GL_BACK_LEFT = 0x0402;
	public static final int GL_BACK_RIGHT = 0x0403;
	public static final int GL_AUX0 = 0x0409;
	public static final int GL_AUX1 = 0x040A;
	public static final int GL_AUX2 = 0x040B;
	public static final int GL_AUX3 = 0x040C;
	public static final int GL_COLOR_INDEX = 0x1900;
	public static final int GL_RED = 0x1903;
	public static final int GL_GREEN = 0x1904;
	public static final int GL_BLUE = 0x1905;
	public static final int GL_ALPHA = 0x1906;
	public static final int GL_LUMINANCE = 0x1909;
	public static final int GL_LUMINANCE_ALPHA = 0x190A;
	public static final int GL_ALPHA_BITS = 0x0D55;
	public static final int GL_RED_BITS = 0x0D52;
	public static final int GL_GREEN_BITS = 0x0D53;
	public static final int GL_BLUE_BITS = 0x0D54;
	public static final int GL_INDEX_BITS = 0x0D51;
	public static final int GL_SUBPIXEL_BITS = 0x0D50;
	public static final int GL_AUX_BUFFERS = 0x0C00;
	public static final int GL_READ_BUFFER = 0x0C02;
	public static final int GL_DRAW_BUFFER = 0x0C01;
	public static final int GL_DOUBLEBUFFER = 0x0C32;
	public static final int GL_STEREO = 0x0C33;
	public static final int GL_BITMAP = 0x1A00;
	public static final int GL_COLOR = 0x1800;
	public static final int GL_DEPTH = 0x1801;
	public static final int GL_STENCIL = 0x1802;
	public static final int GL_DITHER = 0x0BD0;
	public static final int GL_RGB = 0x1907;
	public static final int GL_RGBA = 0x1908;
	public static final int GL_MAX_LIST_NESTING = 0x0B31;
	public static final int GL_MAX_ATTRIB_STACK_DEPTH = 0x0D35;
	public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 0x0D36;
	public static final int GL_MAX_NAME_STACK_DEPTH = 0x0D37;
	public static final int GL_MAX_PROJECTION_STACK_DEPTH = 0x0D38;
	public static final int GL_MAX_TEXTURE_STACK_DEPTH = 0x0D39;
	public static final int GL_MAX_EVAL_ORDER = 0x0D30;
	public static final int GL_MAX_LIGHTS = 0x0D31;
	public static final int GL_MAX_CLIP_PLANES = 0x0D32;
	public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;
	public static final int GL_MAX_PIXEL_MAP_TABLE = 0x0D34;
	public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;
	public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0x0D3B;
	public static final int GL_ATTRIB_STACK_DEPTH = 0x0BB0;
	public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 0x0BB1;
	public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;
	public static final int GL_COLOR_WRITEMASK = 0x0C23;
	public static final int GL_CURRENT_INDEX = 0x0B01;
	public static final int GL_CURRENT_COLOR = 0x0B00;
	public static final int GL_CURRENT_NORMAL = 0x0B02;
	public static final int GL_CURRENT_RASTER_COLOR = 0x0B04;
	public static final int GL_CURRENT_RASTER_DISTANCE = 0x0B09;
	public static final int GL_CURRENT_RASTER_INDEX = 0x0B05;
	public static final int GL_CURRENT_RASTER_POSITION = 0x0B07;
	public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 0x0B06;
	public static final int GL_CURRENT_RASTER_POSITION_VALID = 0x0B08;
	public static final int GL_CURRENT_TEXTURE_COORDS = 0x0B03;
	public static final int GL_INDEX_CLEAR_VALUE = 0x0C20;
	public static final int GL_INDEX_MODE = 0x0C30;
	public static final int GL_INDEX_WRITEMASK = 0x0C21;
	public static final int GL_MODELVIEW_MATRIX = 0x0BA6;
	public static final int GL_MODELVIEW_STACK_DEPTH = 0x0BA3;
	public static final int GL_NAME_STACK_DEPTH = 0x0D70;
	public static final int GL_PROJECTION_MATRIX = 0x0BA7;
	public static final int GL_PROJECTION_STACK_DEPTH = 0x0BA4;
	public static final int GL_RENDER_MODE = 0x0C40;
	public static final int GL_RGBA_MODE = 0x0C31;
	public static final int GL_TEXTURE_MATRIX = 0x0BA8;
	public static final int GL_TEXTURE_STACK_DEPTH = 0x0BA5;
	public static final int GL_VIEWPORT = 0x0BA2;
	public static final int GL_AUTO_NORMAL = 0x0D80;
	public static final int GL_MAP1_COLOR_4 = 0x0D90;
	public static final int GL_MAP1_GRID_DOMAIN = 0x0DD0;
	public static final int GL_MAP1_GRID_SEGMENTS = 0x0DD1;
	public static final int GL_MAP1_INDEX = 0x0D91;
	public static final int GL_MAP1_NORMAL = 0x0D92;
	public static final int GL_MAP1_TEXTURE_COORD_1 = 0x0D93;
	public static final int GL_MAP1_TEXTURE_COORD_2 = 0x0D94;
	public static final int GL_MAP1_TEXTURE_COORD_3 = 0x0D95;
	public static final int GL_MAP1_TEXTURE_COORD_4 = 0x0D96;
	public static final int GL_MAP1_VERTEX_3 = 0x0D97;
	public static final int GL_MAP1_VERTEX_4 = 0x0D98;
	public static final int GL_MAP2_COLOR_4 = 0x0DB0;
	public static final int GL_MAP2_GRID_DOMAIN = 0x0DD2;
	public static final int GL_MAP2_GRID_SEGMENTS = 0x0DD3;
	public static final int GL_MAP2_INDEX = 0x0DB1;
	public static final int GL_MAP2_NORMAL = 0x0DB2;
	public static final int GL_MAP2_TEXTURE_COORD_1 = 0x0DB3;
	public static final int GL_MAP2_TEXTURE_COORD_2 = 0x0DB4;
	public static final int GL_MAP2_TEXTURE_COORD_3 = 0x0DB5;
	public static final int GL_MAP2_TEXTURE_COORD_4 = 0x0DB6;
	public static final int GL_MAP2_VERTEX_3 = 0x0DB7;
	public static final int GL_MAP2_VERTEX_4 = 0x0DB8;
	public static final int GL_COEFF = 0x0A00;
	public static final int GL_DOMAIN = 0x0A02;
	public static final int GL_ORDER = 0x0A01;
	public static final int GL_FOG_HINT = 0x0C54;
	public static final int GL_LINE_SMOOTH_HINT = 0x0C52;
	public static final int GL_PERSPECTIVE_CORRECTION_HINT = 0x0C50;
	public static final int GL_POINT_SMOOTH_HINT = 0x0C51;
	public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;
	public static final int GL_DONT_CARE = 0x1100;
	public static final int GL_FASTEST = 0x1101;
	public static final int GL_NICEST = 0x1102;
	public static final int GL_SCISSOR_TEST = 0x0C11;
	public static final int GL_SCISSOR_BOX = 0x0C10;
	public static final int GL_MAP_COLOR = 0x0D10;
	public static final int GL_MAP_STENCIL = 0x0D11;
	public static final int GL_INDEX_SHIFT = 0x0D12;
	public static final int GL_INDEX_OFFSET = 0x0D13;
	public static final int GL_RED_SCALE = 0x0D14;
	public static final int GL_RED_BIAS = 0x0D15;
	public static final int GL_GREEN_SCALE = 0x0D18;
	public static final int GL_GREEN_BIAS = 0x0D19;
	public static final int GL_BLUE_SCALE = 0x0D1A;
	public static final int GL_BLUE_BIAS = 0x0D1B;
	public static final int GL_ALPHA_SCALE = 0x0D1C;
	public static final int GL_ALPHA_BIAS = 0x0D1D;
	public static final int GL_DEPTH_SCALE = 0x0D1E;
	public static final int GL_DEPTH_BIAS = 0x0D1F;
	public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 0x0CB1;
	public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 0x0CB0;
	public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 0x0CB2;
	public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 0x0CB3;
	public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 0x0CB4;
	public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 0x0CB5;
	public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 0x0CB6;
	public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 0x0CB7;
	public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 0x0CB8;
	public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 0x0CB9;
	public static final int GL_PIXEL_MAP_S_TO_S = 0x0C71;
	public static final int GL_PIXEL_MAP_I_TO_I = 0x0C70;
	public static final int GL_PIXEL_MAP_I_TO_R = 0x0C72;
	public static final int GL_PIXEL_MAP_I_TO_G = 0x0C73;
	public static final int GL_PIXEL_MAP_I_TO_B = 0x0C74;
	public static final int GL_PIXEL_MAP_I_TO_A = 0x0C75;
	public static final int GL_PIXEL_MAP_R_TO_R = 0x0C76;
	public static final int GL_PIXEL_MAP_G_TO_G = 0x0C77;
	public static final int GL_PIXEL_MAP_B_TO_B = 0x0C78;
	public static final int GL_PIXEL_MAP_A_TO_A = 0x0C79;
	public static final int GL_PACK_ALIGNMENT = 0x0D05;
	public static final int GL_PACK_LSB_FIRST = 0x0D01;
	public static final int GL_PACK_ROW_LENGTH = 0x0D02;
	public static final int GL_PACK_SKIP_PIXELS = 0x0D04;
	public static final int GL_PACK_SKIP_ROWS = 0x0D03;
	public static final int GL_PACK_SWAP_BYTES = 0x0D00;
	public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
	public static final int GL_UNPACK_LSB_FIRST = 0x0CF1;
	public static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;
	public static final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
	public static final int GL_UNPACK_SKIP_ROWS = 0x0CF3;
	public static final int GL_UNPACK_SWAP_BYTES = 0x0CF0;
	public static final int GL_ZOOM_X = 0x0D16;
	public static final int GL_ZOOM_Y = 0x0D17;
	public static final int GL_TEXTURE_ENV = 0x2300;
	public static final int GL_TEXTURE_ENV_MODE = 0x2200;
	public static final int GL_TEXTURE_1D = 0x0DE0;
	public static final int GL_TEXTURE_2D = 0x0DE1;
	public static final int GL_TEXTURE_WRAP_S = 0x2802;
	public static final int GL_TEXTURE_WRAP_T = 0x2803;
	public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
	public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
	public static final int GL_TEXTURE_ENV_COLOR = 0x2201;
	public static final int GL_TEXTURE_GEN_S = 0x0C60;
	public static final int GL_TEXTURE_GEN_T = 0x0C61;
	public static final int GL_TEXTURE_GEN_MODE = 0x2500;
	public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
	public static final int GL_TEXTURE_WIDTH = 0x1000;
	public static final int GL_TEXTURE_HEIGHT = 0x1001;
	public static final int GL_TEXTURE_BORDER = 0x1005;
	public static final int GL_TEXTURE_COMPONENTS = 0x1003;
	public static final int GL_TEXTURE_RED_SIZE = 0x805C;
	public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
	public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
	public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
	public static final int GL_TEXTURE_LUMINANCE_SIZE = 0x8060;
	public static final int GL_TEXTURE_INTENSITY_SIZE = 0x8061;
	public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
	public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
	public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
	public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
	public static final int GL_OBJECT_LINEAR = 0x2401;
	public static final int GL_OBJECT_PLANE = 0x2501;
	public static final int GL_EYE_LINEAR = 0x2400;
	public static final int GL_EYE_PLANE = 0x2502;
	public static final int GL_SPHERE_MAP = 0x2402;
	public static final int GL_DECAL = 0x2101;
	public static final int GL_MODULATE = 0x2100;
	public static final int GL_NEAREST = 0x2600;
	public static final int GL_REPEAT = 0x2901;
	public static final int GL_CLAMP = 0x2900;
	public static final int GL_S = 0x2000;
	public static final int GL_T = 0x2001;
	public static final int GL_R = 0x2002;
	public static final int GL_Q = 0x2003;
	public static final int GL_TEXTURE_GEN_R = 0x0C62;
	public static final int GL_TEXTURE_GEN_Q = 0x0C63;
	public static final int GL_VENDOR = 0x1F00;
	public static final int GL_RENDERER = 0x1F01;
	public static final int GL_VERSION = 0x1F02;
	public static final int GL_EXTENSIONS = 0x1F03;
	public static final int GL_NO_ERROR = 0x0;
	public static final int GL_INVALID_VALUE = 0x0501;
	public static final int GL_INVALID_ENUM = 0x0500;
	public static final int GL_INVALID_OPERATION = 0x0502;
	public static final int GL_STACK_OVERFLOW = 0x0503;
	public static final int GL_STACK_UNDERFLOW = 0x0504;
	public static final int GL_OUT_OF_MEMORY = 0x0505;
	public static final int GL_CURRENT_BIT = 0x00000001;
	public static final int GL_POINT_BIT = 0x00000002;
	public static final int GL_LINE_BIT = 0x00000004;
	public static final int GL_POLYGON_BIT = 0x00000008;
	public static final int GL_POLYGON_STIPPLE_BIT = 0x00000010;
	public static final int GL_PIXEL_MODE_BIT = 0x00000020;
	public static final int GL_LIGHTING_BIT = 0x00000040;
	public static final int GL_FOG_BIT = 0x00000080;
	public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
	public static final int GL_ACCUM_BUFFER_BIT = 0x00000200;
	public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
	public static final int GL_VIEWPORT_BIT = 0x00000800;
	public static final int GL_TRANSFORM_BIT = 0x00001000;
	public static final int GL_ENABLE_BIT = 0x00002000;
	public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
	public static final int GL_HINT_BIT = 0x00008000;
	public static final int GL_EVAL_BIT = 0x00010000;
	public static final int GL_LIST_BIT = 0x00020000;
	public static final int GL_TEXTURE_BIT = 0x00040000;
	public static final int GL_SCISSOR_BIT = 0x00080000;
	public static final int GL_ALL_ATTRIB_BITS = 0x000FFFFF;
	public static final int GL_PROXY_TEXTURE_1D = 0x8063;
	public static final int GL_PROXY_TEXTURE_2D = 0x8064;
	public static final int GL_TEXTURE_PRIORITY = 0x8066;
	public static final int GL_TEXTURE_RESIDENT = 0x8067;
	public static final int GL_TEXTURE_BINDING_1D = 0x8068;
	public static final int GL_TEXTURE_BINDING_2D = 0x8069;
	public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
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
	public static final int GL_R3_G3_B2 = 0x2A10;
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
	public static final int GL_CLIENT_PIXEL_STORE_BIT = 0x00000001;
	public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 0x00000002;
	public static final int GL_ALL_CLIENT_ATTRIB_BITS = 0xFFFFFFFF;
	public static final int GL_CLIENT_ALL_ATTRIB_BITS = 0xFFFFFFFF;

	// @off
	/*JNI
	#include <GL/glfw3.h>
	#include "GL/glext.h"
	*/
	// @off
	/*JNI
	*/

	public static native void init(); /*
	*/

	public static native void glClearIndex(float c); /*
		glClearIndex((GLfloat)c);
	*/

	public static native void glClearColor(float red, float green, float blue, float alpha); /*
		glClearColor((GLclampf)red, (GLclampf)green, (GLclampf)blue, (GLclampf)alpha);
	*/

	public static native void glClear(int mask); /*
		glClear((GLbitfield)mask);
	*/

	public static native void glIndexMask(int mask); /*
		glIndexMask((GLuint)mask);
	*/

	public static native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha); /*
		glColorMask((GLboolean)red, (GLboolean)green, (GLboolean)blue, (GLboolean)alpha);
	*/

	public static native void glAlphaFunc(int func, float ref); /*
		glAlphaFunc((GLenum)func, (GLclampf)ref);
	*/

	public static native void glBlendFunc(int sfactor, int dfactor); /*
		glBlendFunc((GLenum)sfactor, (GLenum)dfactor);
	*/

	public static native void glLogicOp(int opcode); /*
		glLogicOp((GLenum)opcode);
	*/

	public static native void glCullFace(int mode); /*
		glCullFace((GLenum)mode);
	*/

	public static native void glFrontFace(int mode); /*
		glFrontFace((GLenum)mode);
	*/

	public static native void glPointSize(float size); /*
		glPointSize((GLfloat)size);
	*/

	public static native void glLineWidth(float width); /*
		glLineWidth((GLfloat)width);
	*/

	public static native void glLineStipple(int factor, short pattern); /*
		glLineStipple((GLint)factor, (GLushort)pattern);
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

	public static native void glGetPolygonStipple(Buffer mask, int maskByteOffset); /*
		glGetPolygonStipple((GLubyte*)(mask + maskByteOffset));
	*/

	public static native void glEdgeFlag(boolean flag); /*
		glEdgeFlag((GLboolean)flag);
	*/

	public static native void glEdgeFlagv(Buffer flag, int flagByteOffset); /*
		glEdgeFlagv((const GLboolean*)(flag + flagByteOffset));
	*/

	public static native void glScissor(int x, int y, int width, int height); /*
		glScissor((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	*/

	public static native void glClipPlane(int plane, Buffer equation, int equationByteOffset); /*
		glClipPlane((GLenum)plane, (const GLdouble*)(equation + equationByteOffset));
	*/

	public static native void glGetClipPlane(int plane, Buffer equation, int equationByteOffset); /*
		glGetClipPlane((GLenum)plane, (GLdouble*)(equation + equationByteOffset));
	*/

	public static native void glDrawBuffer(int mode); /*
		glDrawBuffer((GLenum)mode);
	*/

	public static native void glReadBuffer(int mode); /*
		glReadBuffer((GLenum)mode);
	*/

	public static native void glEnable(int cap); /*
		glEnable((GLenum)cap);
	*/

	public static native void glDisable(int cap); /*
		glDisable((GLenum)cap);
	*/

	public static native boolean glIsEnabled(int cap); /*
		return (GLboolean)glIsEnabled((GLenum)cap);
	*/

	public static native void glEnableClientState(int cap); /*
		glEnableClientState((GLenum)cap);
	*/

	public static native void glDisableClientState(int cap); /*
		glDisableClientState((GLenum)cap);
	*/

	public static native void glGetBooleanv(int pname, Buffer params, int paramsByteOffset); /*
		glGetBooleanv((GLenum)pname, (GLboolean*)(params + paramsByteOffset));
	*/

	public static native void glGetDoublev(int pname, Buffer params, int paramsByteOffset); /*
		glGetDoublev((GLenum)pname, (GLdouble*)(params + paramsByteOffset));
	*/

	public static native void glGetFloatv(int pname, Buffer params, int paramsByteOffset); /*
		glGetFloatv((GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetIntegerv(int pname, Buffer params, int paramsByteOffset); /*
		glGetIntegerv((GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glPushAttrib(int mask); /*
		glPushAttrib((GLbitfield)mask);
	*/

	public static native void glPopAttrib(); /*
		glPopAttrib();
	*/

	public static native void glPushClientAttrib(int mask); /*
		glPushClientAttrib((GLbitfield)mask);
	*/

	public static native void glPopClientAttrib(); /*
		glPopClientAttrib();
	*/

	public static native int glRenderMode(int mode); /*
		return (GLint)glRenderMode((GLenum)mode);
	*/

	public static native int glGetError(); /*
		return (GLenum)glGetError();
	*/

	public static native Buffer glGetString(int name); /*
		return env->NewStringUTF((const char*)glGetString((GLenum)name));
	*/

	public static native void glFinish(); /*
		glFinish();
	*/

	public static native void glFlush(); /*
		glFlush();
	*/

	public static native void glHint(int target, int mode); /*
		glHint((GLenum)target, (GLenum)mode);
	*/

	public static native void glClearDepth(double depth); /*
		glClearDepth((GLclampd)depth);
	*/

	public static native void glDepthFunc(int func); /*
		glDepthFunc((GLenum)func);
	*/

	public static native void glDepthMask(boolean flag); /*
		glDepthMask((GLboolean)flag);
	*/

	public static native void glDepthRange(double near_val, double far_val); /*
		glDepthRange((GLclampd)near_val, (GLclampd)far_val);
	*/

	public static native void glClearAccum(float red, float green, float blue, float alpha); /*
		glClearAccum((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	*/

	public static native void glAccum(int op, float value); /*
		glAccum((GLenum)op, (GLfloat)value);
	*/

	public static native void glMatrixMode(int mode); /*
		glMatrixMode((GLenum)mode);
	*/

	public static native void glOrtho(double left, double right, double bottom, double top, double near_val, double far_val); /*
		glOrtho((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)near_val, (GLdouble)far_val);
	*/

	public static native void glFrustum(double left, double right, double bottom, double top, double near_val, double far_val); /*
		glFrustum((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)near_val, (GLdouble)far_val);
	*/

	public static native void glViewport(int x, int y, int width, int height); /*
		glViewport((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	*/

	public static native void glPushMatrix(); /*
		glPushMatrix();
	*/

	public static native void glPopMatrix(); /*
		glPopMatrix();
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

	public static native void glMultMatrixd(Buffer m, int mByteOffset); /*
		glMultMatrixd((const GLdouble*)(m + mByteOffset));
	*/

	public static native void glMultMatrixf(Buffer m, int mByteOffset); /*
		glMultMatrixf((const GLfloat*)(m + mByteOffset));
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

	public static native void glTranslated(double x, double y, double z); /*
		glTranslated((GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glTranslatef(float x, float y, float z); /*
		glTranslatef((GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native boolean glIsList(int list); /*
		return (GLboolean)glIsList((GLuint)list);
	*/

	public static native void glDeleteLists(int list, int range); /*
		glDeleteLists((GLuint)list, (GLsizei)range);
	*/

	public static native int glGenLists(int range); /*
		return (GLuint)glGenLists((GLsizei)range);
	*/

	public static native void glNewList(int list, int mode); /*
		glNewList((GLuint)list, (GLenum)mode);
	*/

	public static native void glEndList(); /*
		glEndList();
	*/

	public static native void glCallList(int list); /*
		glCallList((GLuint)list);
	*/

	public static native void glCallLists(int n, int type, Buffer lists, int listsByteOffset); /*
		glCallLists((GLsizei)n, (GLenum)type, (const GLvoid*)(lists + listsByteOffset));
	*/

	public static native void glListBase(int base); /*
		glListBase((GLuint)base);
	*/

	public static native void glBegin(int mode); /*
		glBegin((GLenum)mode);
	*/

	public static native void glEnd(); /*
		glEnd();
	*/

	public static native void glVertex2d(double x, double y); /*
		glVertex2d((GLdouble)x, (GLdouble)y);
	*/

	public static native void glVertex2f(float x, float y); /*
		glVertex2f((GLfloat)x, (GLfloat)y);
	*/

	public static native void glVertex2i(int x, int y); /*
		glVertex2i((GLint)x, (GLint)y);
	*/

	public static native void glVertex2s(short x, short y); /*
		glVertex2s((GLshort)x, (GLshort)y);
	*/

	public static native void glVertex3d(double x, double y, double z); /*
		glVertex3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glVertex3f(float x, float y, float z); /*
		glVertex3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native void glVertex3i(int x, int y, int z); /*
		glVertex3i((GLint)x, (GLint)y, (GLint)z);
	*/

	public static native void glVertex3s(short x, short y, short z); /*
		glVertex3s((GLshort)x, (GLshort)y, (GLshort)z);
	*/

	public static native void glVertex4d(double x, double y, double z, double w); /*
		glVertex4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	*/

	public static native void glVertex4f(float x, float y, float z, float w); /*
		glVertex4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	*/

	public static native void glVertex4i(int x, int y, int z, int w); /*
		glVertex4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	*/

	public static native void glVertex4s(short x, short y, short z, short w); /*
		glVertex4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	*/

	public static native void glVertex2dv(Buffer v, int vByteOffset); /*
		glVertex2dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glVertex2fv(Buffer v, int vByteOffset); /*
		glVertex2fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glVertex2iv(Buffer v, int vByteOffset); /*
		glVertex2iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glVertex2sv(Buffer v, int vByteOffset); /*
		glVertex2sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glVertex3dv(Buffer v, int vByteOffset); /*
		glVertex3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glVertex3fv(Buffer v, int vByteOffset); /*
		glVertex3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glVertex3iv(Buffer v, int vByteOffset); /*
		glVertex3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glVertex3sv(Buffer v, int vByteOffset); /*
		glVertex3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glVertex4dv(Buffer v, int vByteOffset); /*
		glVertex4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glVertex4fv(Buffer v, int vByteOffset); /*
		glVertex4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glVertex4iv(Buffer v, int vByteOffset); /*
		glVertex4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glVertex4sv(Buffer v, int vByteOffset); /*
		glVertex4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glNormal3b(byte nx, byte ny, byte nz); /*
		glNormal3b((GLbyte)nx, (GLbyte)ny, (GLbyte)nz);
	*/

	public static native void glNormal3d(double nx, double ny, double nz); /*
		glNormal3d((GLdouble)nx, (GLdouble)ny, (GLdouble)nz);
	*/

	public static native void glNormal3f(float nx, float ny, float nz); /*
		glNormal3f((GLfloat)nx, (GLfloat)ny, (GLfloat)nz);
	*/

	public static native void glNormal3i(int nx, int ny, int nz); /*
		glNormal3i((GLint)nx, (GLint)ny, (GLint)nz);
	*/

	public static native void glNormal3s(short nx, short ny, short nz); /*
		glNormal3s((GLshort)nx, (GLshort)ny, (GLshort)nz);
	*/

	public static native void glNormal3bv(Buffer v, int vByteOffset); /*
		glNormal3bv((const GLbyte*)(v + vByteOffset));
	*/

	public static native void glNormal3dv(Buffer v, int vByteOffset); /*
		glNormal3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glNormal3fv(Buffer v, int vByteOffset); /*
		glNormal3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glNormal3iv(Buffer v, int vByteOffset); /*
		glNormal3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glNormal3sv(Buffer v, int vByteOffset); /*
		glNormal3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glIndexd(double c); /*
		glIndexd((GLdouble)c);
	*/

	public static native void glIndexf(float c); /*
		glIndexf((GLfloat)c);
	*/

	public static native void glIndexi(int c); /*
		glIndexi((GLint)c);
	*/

	public static native void glIndexs(short c); /*
		glIndexs((GLshort)c);
	*/

	public static native void glIndexub(byte c); /*
		glIndexub((GLubyte)c);
	*/

	public static native void glIndexdv(Buffer c, int cByteOffset); /*
		glIndexdv((const GLdouble*)(c + cByteOffset));
	*/

	public static native void glIndexfv(Buffer c, int cByteOffset); /*
		glIndexfv((const GLfloat*)(c + cByteOffset));
	*/

	public static native void glIndexiv(Buffer c, int cByteOffset); /*
		glIndexiv((const GLint*)(c + cByteOffset));
	*/

	public static native void glIndexsv(Buffer c, int cByteOffset); /*
		glIndexsv((const GLshort*)(c + cByteOffset));
	*/

	public static native void glIndexubv(Buffer c, int cByteOffset); /*
		glIndexubv((const GLubyte*)(c + cByteOffset));
	*/

	public static native void glColor3b(byte red, byte green, byte blue); /*
		glColor3b((GLbyte)red, (GLbyte)green, (GLbyte)blue);
	*/

	public static native void glColor3d(double red, double green, double blue); /*
		glColor3d((GLdouble)red, (GLdouble)green, (GLdouble)blue);
	*/

	public static native void glColor3f(float red, float green, float blue); /*
		glColor3f((GLfloat)red, (GLfloat)green, (GLfloat)blue);
	*/

	public static native void glColor3i(int red, int green, int blue); /*
		glColor3i((GLint)red, (GLint)green, (GLint)blue);
	*/

	public static native void glColor3s(short red, short green, short blue); /*
		glColor3s((GLshort)red, (GLshort)green, (GLshort)blue);
	*/

	public static native void glColor3ub(byte red, byte green, byte blue); /*
		glColor3ub((GLubyte)red, (GLubyte)green, (GLubyte)blue);
	*/

	public static native void glColor3ui(int red, int green, int blue); /*
		glColor3ui((GLuint)red, (GLuint)green, (GLuint)blue);
	*/

	public static native void glColor3us(short red, short green, short blue); /*
		glColor3us((GLushort)red, (GLushort)green, (GLushort)blue);
	*/

	public static native void glColor4b(byte red, byte green, byte blue, byte alpha); /*
		glColor4b((GLbyte)red, (GLbyte)green, (GLbyte)blue, (GLbyte)alpha);
	*/

	public static native void glColor4d(double red, double green, double blue, double alpha); /*
		glColor4d((GLdouble)red, (GLdouble)green, (GLdouble)blue, (GLdouble)alpha);
	*/

	public static native void glColor4f(float red, float green, float blue, float alpha); /*
		glColor4f((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	*/

	public static native void glColor4i(int red, int green, int blue, int alpha); /*
		glColor4i((GLint)red, (GLint)green, (GLint)blue, (GLint)alpha);
	*/

	public static native void glColor4s(short red, short green, short blue, short alpha); /*
		glColor4s((GLshort)red, (GLshort)green, (GLshort)blue, (GLshort)alpha);
	*/

	public static native void glColor4ub(byte red, byte green, byte blue, byte alpha); /*
		glColor4ub((GLubyte)red, (GLubyte)green, (GLubyte)blue, (GLubyte)alpha);
	*/

	public static native void glColor4ui(int red, int green, int blue, int alpha); /*
		glColor4ui((GLuint)red, (GLuint)green, (GLuint)blue, (GLuint)alpha);
	*/

	public static native void glColor4us(short red, short green, short blue, short alpha); /*
		glColor4us((GLushort)red, (GLushort)green, (GLushort)blue, (GLushort)alpha);
	*/

	public static native void glColor3bv(Buffer v, int vByteOffset); /*
		glColor3bv((const GLbyte*)(v + vByteOffset));
	*/

	public static native void glColor3dv(Buffer v, int vByteOffset); /*
		glColor3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glColor3fv(Buffer v, int vByteOffset); /*
		glColor3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glColor3iv(Buffer v, int vByteOffset); /*
		glColor3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glColor3sv(Buffer v, int vByteOffset); /*
		glColor3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glColor3ubv(Buffer v, int vByteOffset); /*
		glColor3ubv((const GLubyte*)(v + vByteOffset));
	*/

	public static native void glColor3uiv(Buffer v, int vByteOffset); /*
		glColor3uiv((const GLuint*)(v + vByteOffset));
	*/

	public static native void glColor3usv(Buffer v, int vByteOffset); /*
		glColor3usv((const GLushort*)(v + vByteOffset));
	*/

	public static native void glColor4bv(Buffer v, int vByteOffset); /*
		glColor4bv((const GLbyte*)(v + vByteOffset));
	*/

	public static native void glColor4dv(Buffer v, int vByteOffset); /*
		glColor4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glColor4fv(Buffer v, int vByteOffset); /*
		glColor4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glColor4iv(Buffer v, int vByteOffset); /*
		glColor4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glColor4sv(Buffer v, int vByteOffset); /*
		glColor4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glColor4ubv(Buffer v, int vByteOffset); /*
		glColor4ubv((const GLubyte*)(v + vByteOffset));
	*/

	public static native void glColor4uiv(Buffer v, int vByteOffset); /*
		glColor4uiv((const GLuint*)(v + vByteOffset));
	*/

	public static native void glColor4usv(Buffer v, int vByteOffset); /*
		glColor4usv((const GLushort*)(v + vByteOffset));
	*/

	public static native void glTexCoord1d(double s); /*
		glTexCoord1d((GLdouble)s);
	*/

	public static native void glTexCoord1f(float s); /*
		glTexCoord1f((GLfloat)s);
	*/

	public static native void glTexCoord1i(int s); /*
		glTexCoord1i((GLint)s);
	*/

	public static native void glTexCoord1s(short s); /*
		glTexCoord1s((GLshort)s);
	*/

	public static native void glTexCoord2d(double s, double t); /*
		glTexCoord2d((GLdouble)s, (GLdouble)t);
	*/

	public static native void glTexCoord2f(float s, float t); /*
		glTexCoord2f((GLfloat)s, (GLfloat)t);
	*/

	public static native void glTexCoord2i(int s, int t); /*
		glTexCoord2i((GLint)s, (GLint)t);
	*/

	public static native void glTexCoord2s(short s, short t); /*
		glTexCoord2s((GLshort)s, (GLshort)t);
	*/

	public static native void glTexCoord3d(double s, double t, double r); /*
		glTexCoord3d((GLdouble)s, (GLdouble)t, (GLdouble)r);
	*/

	public static native void glTexCoord3f(float s, float t, float r); /*
		glTexCoord3f((GLfloat)s, (GLfloat)t, (GLfloat)r);
	*/

	public static native void glTexCoord3i(int s, int t, int r); /*
		glTexCoord3i((GLint)s, (GLint)t, (GLint)r);
	*/

	public static native void glTexCoord3s(short s, short t, short r); /*
		glTexCoord3s((GLshort)s, (GLshort)t, (GLshort)r);
	*/

	public static native void glTexCoord4d(double s, double t, double r, double q); /*
		glTexCoord4d((GLdouble)s, (GLdouble)t, (GLdouble)r, (GLdouble)q);
	*/

	public static native void glTexCoord4f(float s, float t, float r, float q); /*
		glTexCoord4f((GLfloat)s, (GLfloat)t, (GLfloat)r, (GLfloat)q);
	*/

	public static native void glTexCoord4i(int s, int t, int r, int q); /*
		glTexCoord4i((GLint)s, (GLint)t, (GLint)r, (GLint)q);
	*/

	public static native void glTexCoord4s(short s, short t, short r, short q); /*
		glTexCoord4s((GLshort)s, (GLshort)t, (GLshort)r, (GLshort)q);
	*/

	public static native void glTexCoord1dv(Buffer v, int vByteOffset); /*
		glTexCoord1dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord1fv(Buffer v, int vByteOffset); /*
		glTexCoord1fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord1iv(Buffer v, int vByteOffset); /*
		glTexCoord1iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord1sv(Buffer v, int vByteOffset); /*
		glTexCoord1sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glTexCoord2dv(Buffer v, int vByteOffset); /*
		glTexCoord2dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord2fv(Buffer v, int vByteOffset); /*
		glTexCoord2fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord2iv(Buffer v, int vByteOffset); /*
		glTexCoord2iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord2sv(Buffer v, int vByteOffset); /*
		glTexCoord2sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glTexCoord3dv(Buffer v, int vByteOffset); /*
		glTexCoord3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord3fv(Buffer v, int vByteOffset); /*
		glTexCoord3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord3iv(Buffer v, int vByteOffset); /*
		glTexCoord3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord3sv(Buffer v, int vByteOffset); /*
		glTexCoord3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glTexCoord4dv(Buffer v, int vByteOffset); /*
		glTexCoord4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glTexCoord4fv(Buffer v, int vByteOffset); /*
		glTexCoord4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glTexCoord4iv(Buffer v, int vByteOffset); /*
		glTexCoord4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glTexCoord4sv(Buffer v, int vByteOffset); /*
		glTexCoord4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glRasterPos2d(double x, double y); /*
		glRasterPos2d((GLdouble)x, (GLdouble)y);
	*/

	public static native void glRasterPos2f(float x, float y); /*
		glRasterPos2f((GLfloat)x, (GLfloat)y);
	*/

	public static native void glRasterPos2i(int x, int y); /*
		glRasterPos2i((GLint)x, (GLint)y);
	*/

	public static native void glRasterPos2s(short x, short y); /*
		glRasterPos2s((GLshort)x, (GLshort)y);
	*/

	public static native void glRasterPos3d(double x, double y, double z); /*
		glRasterPos3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	*/

	public static native void glRasterPos3f(float x, float y, float z); /*
		glRasterPos3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	*/

	public static native void glRasterPos3i(int x, int y, int z); /*
		glRasterPos3i((GLint)x, (GLint)y, (GLint)z);
	*/

	public static native void glRasterPos3s(short x, short y, short z); /*
		glRasterPos3s((GLshort)x, (GLshort)y, (GLshort)z);
	*/

	public static native void glRasterPos4d(double x, double y, double z, double w); /*
		glRasterPos4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	*/

	public static native void glRasterPos4f(float x, float y, float z, float w); /*
		glRasterPos4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	*/

	public static native void glRasterPos4i(int x, int y, int z, int w); /*
		glRasterPos4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	*/

	public static native void glRasterPos4s(short x, short y, short z, short w); /*
		glRasterPos4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	*/

	public static native void glRasterPos2dv(Buffer v, int vByteOffset); /*
		glRasterPos2dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glRasterPos2fv(Buffer v, int vByteOffset); /*
		glRasterPos2fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glRasterPos2iv(Buffer v, int vByteOffset); /*
		glRasterPos2iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glRasterPos2sv(Buffer v, int vByteOffset); /*
		glRasterPos2sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glRasterPos3dv(Buffer v, int vByteOffset); /*
		glRasterPos3dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glRasterPos3fv(Buffer v, int vByteOffset); /*
		glRasterPos3fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glRasterPos3iv(Buffer v, int vByteOffset); /*
		glRasterPos3iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glRasterPos3sv(Buffer v, int vByteOffset); /*
		glRasterPos3sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glRasterPos4dv(Buffer v, int vByteOffset); /*
		glRasterPos4dv((const GLdouble*)(v + vByteOffset));
	*/

	public static native void glRasterPos4fv(Buffer v, int vByteOffset); /*
		glRasterPos4fv((const GLfloat*)(v + vByteOffset));
	*/

	public static native void glRasterPos4iv(Buffer v, int vByteOffset); /*
		glRasterPos4iv((const GLint*)(v + vByteOffset));
	*/

	public static native void glRasterPos4sv(Buffer v, int vByteOffset); /*
		glRasterPos4sv((const GLshort*)(v + vByteOffset));
	*/

	public static native void glRectd(double x1, double y1, double x2, double y2); /*
		glRectd((GLdouble)x1, (GLdouble)y1, (GLdouble)x2, (GLdouble)y2);
	*/

	public static native void glRectf(float x1, float y1, float x2, float y2); /*
		glRectf((GLfloat)x1, (GLfloat)y1, (GLfloat)x2, (GLfloat)y2);
	*/

	public static native void glRecti(int x1, int y1, int x2, int y2); /*
		glRecti((GLint)x1, (GLint)y1, (GLint)x2, (GLint)y2);
	*/

	public static native void glRects(short x1, short y1, short x2, short y2); /*
		glRects((GLshort)x1, (GLshort)y1, (GLshort)x2, (GLshort)y2);
	*/

	public static native void glRectdv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectdv((const GLdouble*)(v1 + v1ByteOffset), (const GLdouble*)(v2 + v2ByteOffset));
	*/

	public static native void glRectfv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectfv((const GLfloat*)(v1 + v1ByteOffset), (const GLfloat*)(v2 + v2ByteOffset));
	*/

	public static native void glRectiv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectiv((const GLint*)(v1 + v1ByteOffset), (const GLint*)(v2 + v2ByteOffset));
	*/

	public static native void glRectsv(Buffer v1, int v1ByteOffset, Buffer v2, int v2ByteOffset); /*
		glRectsv((const GLshort*)(v1 + v1ByteOffset), (const GLshort*)(v2 + v2ByteOffset));
	*/

	public static native void glShadeModel(int mode); /*
		glShadeModel((GLenum)mode);
	*/

	public static native void glLightf(int light, int pname, float param); /*
		glLightf((GLenum)light, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glLighti(int light, int pname, int param); /*
		glLighti((GLenum)light, (GLenum)pname, (GLint)param);
	*/

	public static native void glLightfv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glLightfv((GLenum)light, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glLightiv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glLightiv((GLenum)light, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetLightfv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glGetLightfv((GLenum)light, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetLightiv(int light, int pname, Buffer params, int paramsByteOffset); /*
		glGetLightiv((GLenum)light, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glLightModelf(int pname, float param); /*
		glLightModelf((GLenum)pname, (GLfloat)param);
	*/

	public static native void glLightModeli(int pname, int param); /*
		glLightModeli((GLenum)pname, (GLint)param);
	*/

	public static native void glLightModelfv(int pname, Buffer params, int paramsByteOffset); /*
		glLightModelfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glLightModeliv(int pname, Buffer params, int paramsByteOffset); /*
		glLightModeliv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glMaterialf(int face, int pname, float param); /*
		glMaterialf((GLenum)face, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glMateriali(int face, int pname, int param); /*
		glMateriali((GLenum)face, (GLenum)pname, (GLint)param);
	*/

	public static native void glMaterialfv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glMaterialfv((GLenum)face, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glMaterialiv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glMaterialiv((GLenum)face, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetMaterialfv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glGetMaterialfv((GLenum)face, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetMaterialiv(int face, int pname, Buffer params, int paramsByteOffset); /*
		glGetMaterialiv((GLenum)face, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glColorMaterial(int face, int mode); /*
		glColorMaterial((GLenum)face, (GLenum)mode);
	*/

	public static native void glPixelZoom(float xfactor, float yfactor); /*
		glPixelZoom((GLfloat)xfactor, (GLfloat)yfactor);
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

	public static native void glPixelMapfv(int map, int mapsize, Buffer values, int valuesByteOffset); /*
		glPixelMapfv((GLenum)map, (GLint)mapsize, (const GLfloat*)(values + valuesByteOffset));
	*/

	public static native void glPixelMapuiv(int map, int mapsize, Buffer values, int valuesByteOffset); /*
		glPixelMapuiv((GLenum)map, (GLint)mapsize, (const GLuint*)(values + valuesByteOffset));
	*/

	public static native void glPixelMapusv(int map, int mapsize, Buffer values, int valuesByteOffset); /*
		glPixelMapusv((GLenum)map, (GLint)mapsize, (const GLushort*)(values + valuesByteOffset));
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

	public static native void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, Buffer bitmap, int bitmapByteOffset); /*
		glBitmap((GLsizei)width, (GLsizei)height, (GLfloat)xorig, (GLfloat)yorig, (GLfloat)xmove, (GLfloat)ymove, (const GLubyte*)(bitmap + bitmapByteOffset));
	*/

	public static native void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glReadPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glDrawPixels(int width, int height, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glDrawPixels((GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glCopyPixels(int x, int y, int width, int height, int type); /*
		glCopyPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)type);
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

	public static native void glClearStencil(int s); /*
		glClearStencil((GLint)s);
	*/

	public static native void glTexGend(int coord, int pname, double param); /*
		glTexGend((GLenum)coord, (GLenum)pname, (GLdouble)param);
	*/

	public static native void glTexGenf(int coord, int pname, float param); /*
		glTexGenf((GLenum)coord, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glTexGeni(int coord, int pname, int param); /*
		glTexGeni((GLenum)coord, (GLenum)pname, (GLint)param);
	*/

	public static native void glTexGendv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glTexGendv((GLenum)coord, (GLenum)pname, (const GLdouble*)(params + paramsByteOffset));
	*/

	public static native void glTexGenfv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glTexGenfv((GLenum)coord, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glTexGeniv(int coord, int pname, Buffer params, int paramsByteOffset); /*
		glTexGeniv((GLenum)coord, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
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

	public static native void glTexEnvf(int target, int pname, float param); /*
		glTexEnvf((GLenum)target, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glTexEnvi(int target, int pname, int param); /*
		glTexEnvi((GLenum)target, (GLenum)pname, (GLint)param);
	*/

	public static native void glTexEnvfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexEnvfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glTexEnviv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexEnviv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetTexEnvfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexEnvfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetTexEnviv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexEnviv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glTexParameterf(int target, int pname, float param); /*
		glTexParameterf((GLenum)target, (GLenum)pname, (GLfloat)param);
	*/

	public static native void glTexParameteri(int target, int pname, int param); /*
		glTexParameteri((GLenum)target, (GLenum)pname, (GLint)param);
	*/

	public static native void glTexParameterfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexParameterfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glTexParameteriv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glTexParameteriv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetTexParameterfv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexParameterfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetTexParameteriv(int target, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexParameteriv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glGetTexLevelParameterfv(int target, int level, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexLevelParameterfv((GLenum)target, (GLint)level, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glGetTexLevelParameteriv(int target, int level, int pname, Buffer params, int paramsByteOffset); /*
		glGetTexLevelParameteriv((GLenum)target, (GLint)level, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	*/

	public static native void glTexImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexImage1D((GLenum)target, (GLint)level, (GLint)internalFormat, (GLsizei)width, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexImage2D((GLenum)target, (GLint)level, (GLint)internalFormat, (GLsizei)width, (GLsizei)height, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glGetTexImage(int target, int level, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glGetTexImage((GLenum)target, (GLint)level, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
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

	public static native void glGetMapdv(int target, int query, Buffer v, int vByteOffset); /*
		glGetMapdv((GLenum)target, (GLenum)query, (GLdouble*)(v + vByteOffset));
	*/

	public static native void glGetMapfv(int target, int query, Buffer v, int vByteOffset); /*
		glGetMapfv((GLenum)target, (GLenum)query, (GLfloat*)(v + vByteOffset));
	*/

	public static native void glGetMapiv(int target, int query, Buffer v, int vByteOffset); /*
		glGetMapiv((GLenum)target, (GLenum)query, (GLint*)(v + vByteOffset));
	*/

	public static native void glEvalCoord1d(double u); /*
		glEvalCoord1d((GLdouble)u);
	*/

	public static native void glEvalCoord1f(float u); /*
		glEvalCoord1f((GLfloat)u);
	*/

	public static native void glEvalCoord1dv(Buffer u, int uByteOffset); /*
		glEvalCoord1dv((const GLdouble*)(u + uByteOffset));
	*/

	public static native void glEvalCoord1fv(Buffer u, int uByteOffset); /*
		glEvalCoord1fv((const GLfloat*)(u + uByteOffset));
	*/

	public static native void glEvalCoord2d(double u, double v); /*
		glEvalCoord2d((GLdouble)u, (GLdouble)v);
	*/

	public static native void glEvalCoord2f(float u, float v); /*
		glEvalCoord2f((GLfloat)u, (GLfloat)v);
	*/

	public static native void glEvalCoord2dv(Buffer u, int uByteOffset); /*
		glEvalCoord2dv((const GLdouble*)(u + uByteOffset));
	*/

	public static native void glEvalCoord2fv(Buffer u, int uByteOffset); /*
		glEvalCoord2fv((const GLfloat*)(u + uByteOffset));
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

	public static native void glEvalPoint1(int i); /*
		glEvalPoint1((GLint)i);
	*/

	public static native void glEvalPoint2(int i, int j); /*
		glEvalPoint2((GLint)i, (GLint)j);
	*/

	public static native void glEvalMesh1(int mode, int i1, int i2); /*
		glEvalMesh1((GLenum)mode, (GLint)i1, (GLint)i2);
	*/

	public static native void glEvalMesh2(int mode, int i1, int i2, int j1, int j2); /*
		glEvalMesh2((GLenum)mode, (GLint)i1, (GLint)i2, (GLint)j1, (GLint)j2);
	*/

	public static native void glFogf(int pname, float param); /*
		glFogf((GLenum)pname, (GLfloat)param);
	*/

	public static native void glFogi(int pname, int param); /*
		glFogi((GLenum)pname, (GLint)param);
	*/

	public static native void glFogfv(int pname, Buffer params, int paramsByteOffset); /*
		glFogfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	*/

	public static native void glFogiv(int pname, Buffer params, int paramsByteOffset); /*
		glFogiv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	*/

	public static native void glFeedbackBuffer(int size, int type, Buffer buffer, int bufferByteOffset); /*
		glFeedbackBuffer((GLsizei)size, (GLenum)type, (GLfloat*)(buffer + bufferByteOffset));
	*/

	public static native void glPassThrough(float token); /*
		glPassThrough((GLfloat)token);
	*/

	public static native void glSelectBuffer(int size, Buffer buffer, int bufferByteOffset); /*
		glSelectBuffer((GLsizei)size, (GLuint*)(buffer + bufferByteOffset));
	*/

	public static native void glInitNames(); /*
		glInitNames();
	*/

	public static native void glLoadName(int name); /*
		glLoadName((GLuint)name);
	*/

	public static native void glPushName(int name); /*
		glPushName((GLuint)name);
	*/

	public static native void glPopName(); /*
		glPopName();
	*/

	public static native void glGenTextures(int n, Buffer textures, int texturesByteOffset); /*
		glGenTextures((GLsizei)n, (GLuint*)(textures + texturesByteOffset));
	*/

	public static native void glDeleteTextures(int n, Buffer textures, int texturesByteOffset); /*
		glDeleteTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset));
	*/

	public static native void glBindTexture(int target, int texture); /*
		glBindTexture((GLenum)target, (GLuint)texture);
	*/

	public static native void glPrioritizeTextures(int n, Buffer textures, int texturesByteOffset, Buffer priorities, int prioritiesByteOffset); /*
		glPrioritizeTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (const GLclampf*)(priorities + prioritiesByteOffset));
	*/

	public static native boolean glAreTexturesResident(int n, Buffer textures, int texturesByteOffset, Buffer residences, int residencesByteOffset); /*
		return (GLboolean)glAreTexturesResident((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (GLboolean*)(residences + residencesByteOffset));
	*/

	public static native boolean glIsTexture(int texture); /*
		return (GLboolean)glIsTexture((GLuint)texture);
	*/

	public static native void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLsizei)width, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels, int pixelsByteOffset); /*
		glTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	*/

	public static native void glCopyTexImage1D(int target, int level, int internalformat, int x, int y, int width, int border); /*
		glCopyTexImage1D((GLenum)target, (GLint)level, (GLenum)internalformat, (GLint)x, (GLint)y, (GLsizei)width, (GLint)border);
	*/

	public static native void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border); /*
		glCopyTexImage2D((GLenum)target, (GLint)level, (GLenum)internalformat, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLint)border);
	*/

	public static native void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width); /*
		glCopyTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)x, (GLint)y, (GLsizei)width);
	*/

	public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height); /*
		glCopyTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	*/

	public static native void glVertexPointer(int size, int type, int stride, Buffer ptr, int ptrByteOffset); /*
		glVertexPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	*/

	public static native void glNormalPointer(int type, int stride, Buffer ptr, int ptrByteOffset); /*
		glNormalPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	*/

	public static native void glColorPointer(int size, int type, int stride, Buffer ptr, int ptrByteOffset); /*
		glColorPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	*/

	public static native void glIndexPointer(int type, int stride, Buffer ptr, int ptrByteOffset); /*
		glIndexPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	*/

	public static native void glTexCoordPointer(int size, int type, int stride, Buffer ptr, int ptrByteOffset); /*
		glTexCoordPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	*/

	public static native void glEdgeFlagPointer(int stride, Buffer ptr, int ptrByteOffset); /*
		glEdgeFlagPointer((GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	*/

	public static native void glArrayElement(int i); /*
		glArrayElement((GLint)i);
	*/

	public static native void glDrawArrays(int mode, int first, int count); /*
		glDrawArrays((GLenum)mode, (GLint)first, (GLsizei)count);
	*/

	public static native void glDrawElements(int mode, int count, int type, Buffer indices, int indicesByteOffset); /*
		glDrawElements((GLenum)mode, (GLsizei)count, (GLenum)type, (const GLvoid*)(indices + indicesByteOffset));
	*/

	public static native void glInterleavedArrays(int format, int stride, Buffer pointer, int pointerByteOffset); /*
		glInterleavedArrays((GLenum)format, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	*/

}