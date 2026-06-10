package p2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k  reason: collision with root package name */
    public static final l f16740k;

    /* renamed from: a  reason: collision with root package name */
    public final float f16741a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16742b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16743d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16744e;

    /* renamed from: f  reason: collision with root package name */
    public final float f16745f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f16746g;

    /* renamed from: h  reason: collision with root package name */
    public final float f16747h;

    /* renamed from: i  reason: collision with root package name */
    public final float f16748i;

    /* renamed from: j  reason: collision with root package name */
    public final float f16749j;

    static {
        float f10;
        float f11;
        float[] fArr = ma.i.f16043j;
        float Z = (float) ((ma.i.Z() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = ma.i.f16041h;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr[1];
        float f14 = fArr3[1] * f13;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14 + (fArr3[0] * f12);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f12 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.100000046f;
            f11 = 0.59f;
        } else {
            f10 = 0.12999998f;
            f11 = 0.525f;
        }
        float f19 = f10 + f11;
        float exp = (1.0f - (((float) Math.exp(((-Z) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f20 = 1.0f / ((5.0f * Z) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float cbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(Z * 5.0d))) + (f21 * Z);
        float Z2 = ma.i.Z() / fArr[1];
        double d10 = Z2;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f18) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f17) / 100.0d, 0.42d), pow2};
        float f23 = fArr7[0];
        float f24 = fArr7[1];
        f16740k = new l(Z2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f23 * 400.0f) / (f23 + 27.13f)) * 2.0f) + ((f24 * 400.0f) / (f24 + 27.13f))) * pow, pow, pow, f19, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f16745f = f10;
        this.f16741a = f11;
        this.f16742b = f12;
        this.c = f13;
        this.f16743d = f14;
        this.f16744e = f15;
        this.f16746g = fArr;
        this.f16747h = f16;
        this.f16748i = f17;
        this.f16749j = f18;
    }
}
