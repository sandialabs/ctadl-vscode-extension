package w0;

/* loaded from: classes.dex */
public final class e extends c {
    public e() {
        super("Generic L*a*b*", b.c, 15);
    }

    @Override // w0.c
    public final float[] a(float[] fArr) {
        v7.g.f(fArr, "v");
        float f10 = fArr[0];
        float[] fArr2 = v8.b.f18178e;
        float f11 = f10 / fArr2[0];
        float f12 = fArr[1] / fArr2[1];
        float f13 = fArr[2] / fArr2[2];
        float pow = f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        float pow2 = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float pow3 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        fArr[0] = a1.c.b0((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = a1.c.b0((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = a1.c.b0((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // w0.c
    public final float b(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // w0.c
    public final float c(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // w0.c
    public final float[] e(float[] fArr) {
        fArr[0] = a1.c.b0(fArr[0], 0.0f, 100.0f);
        fArr[1] = a1.c.b0(fArr[1], -128.0f, 128.0f);
        float b02 = a1.c.b0(fArr[2], -128.0f, 128.0f);
        fArr[2] = b02;
        float f10 = (fArr[0] + 16.0f) / 116.0f;
        float f11 = (fArr[1] * 0.002f) + f10;
        float f12 = f10 - (b02 * 0.005f);
        float f13 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f14 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = v8.b.f18178e;
        fArr[0] = f13 * fArr2[0];
        fArr[1] = f14 * fArr2[1];
        fArr[2] = f15 * fArr2[2];
        return fArr;
    }
}
