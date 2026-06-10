package q;

import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f16801a;

    /* renamed from: q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0209a {

        /* renamed from: a  reason: collision with root package name */
        public final float f16802a;

        /* renamed from: b  reason: collision with root package name */
        public final float f16803b;

        public C0209a(float f10, float f11) {
            this.f16802a = f10;
            this.f16803b = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0209a) {
                C0209a c0209a = (C0209a) obj;
                return g.a(Float.valueOf(this.f16802a), Float.valueOf(c0209a.f16802a)) && g.a(Float.valueOf(this.f16803b), Float.valueOf(c0209a.f16803b));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f16803b) + (Float.floatToIntBits(this.f16802a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.f16802a);
            sb.append(", velocityCoefficient=");
            return a4.b.n(sb, this.f16803b, ')');
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float[] fArr = new float[101];
        f16801a = fArr;
        float[] fArr2 = new float[101];
        float f20 = 0.0f;
        float f21 = 0.0f;
        int i10 = 0;
        while (true) {
            float f22 = 1.0f;
            if (i10 < 100) {
                float f23 = i10 / 100;
                float f24 = 1.0f;
                while (true) {
                    f10 = 2.0f;
                    f11 = ((f24 - f20) / 2.0f) + f20;
                    f12 = 3.0f;
                    f13 = f22 - f11;
                    f14 = f11 * 3.0f * f13;
                    f15 = f11 * f11 * f11;
                    float f25 = (((f11 * 0.35000002f) + (f13 * 0.175f)) * f14) + f15;
                    float f26 = f24;
                    if (Math.abs(f25 - f23) < 1.0E-5d) {
                        break;
                    }
                    if (f25 > f23) {
                        f24 = f11;
                    } else {
                        f20 = f11;
                        f24 = f26;
                    }
                    f22 = 1.0f;
                }
                float f27 = 0.5f;
                fArr[i10] = (((f13 * 0.5f) + f11) * f14) + f15;
                float f28 = 1.0f;
                while (true) {
                    f16 = ((f28 - f21) / f10) + f21;
                    f17 = 1.0f - f16;
                    f18 = f16 * f12 * f17;
                    f19 = f16 * f16 * f16;
                    float f29 = (((f17 * f27) + f16) * f18) + f19;
                    if (Math.abs(f29 - f23) >= 1.0E-5d) {
                        if (f29 > f23) {
                            f28 = f16;
                        } else {
                            f21 = f16;
                        }
                        f27 = 0.5f;
                        f10 = 2.0f;
                        f12 = 3.0f;
                    }
                }
                fArr2[i10] = (((f16 * 0.35000002f) + (f17 * 0.175f)) * f18) + f19;
                i10++;
            } else {
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static C0209a a(float f10) {
        float f11;
        float f12;
        float f13 = 100;
        int i10 = (int) (f13 * f10);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f16801a;
            float f16 = fArr[i10];
            f12 = (fArr[i11] - f16) / (f15 - f14);
            f11 = a4.b.f(f10, f14, f12, f16);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        return new C0209a(f11, f12);
    }
}
