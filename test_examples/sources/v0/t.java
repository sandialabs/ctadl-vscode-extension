package v0;

/* loaded from: classes.dex */
public final class t implements Comparable<t> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f18137i = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final float f18138j;

    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        a(1.0f);
        a(-1.0f);
        f18138j = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f10) {
        int i10;
        f18137i.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = floatToRawIntBits & 8388607;
        int i14 = 31;
        int i15 = 0;
        if (i12 == 255) {
            if (i13 != 0) {
                i15 = 512;
            }
        } else {
            int i16 = (i12 - 127) + 15;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 <= 0) {
                if (i16 >= -10) {
                    int i17 = (i13 | 8388608) >> (1 - i16);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i15 = i17 >> 13;
                }
                i14 = 0;
            } else {
                i15 = i13 >> 13;
                if ((i13 & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    return (short) i10;
                }
                i14 = i16;
            }
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i10;
    }

    public static final float b(short s10) {
        int i10;
        int i11;
        int i12 = s10 & 65535;
        int i13 = 32768 & i12;
        int i14 = (i12 >>> 10) & 31;
        int i15 = i12 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                if (i16 != 0) {
                    i16 |= 4194304;
                }
                i10 = i16;
                i11 = 255;
            } else {
                int i17 = (i14 - 15) + 127;
                i10 = i16;
                i11 = i17;
            }
        } else if (i15 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - f18138j;
            return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i13 << 16) | i10);
    }
}
