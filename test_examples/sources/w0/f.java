package w0;

import v0.p;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f18243d;

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f18244e;

    /* renamed from: f  reason: collision with root package name */
    public static final float[] f18245f;

    /* renamed from: g  reason: collision with root package name */
    public static final float[] f18246g;

    static {
        float[] y10 = p.y(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, p.h(a.f18235b.f18236a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f18243d = y10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f18244e = fArr;
        f18245f = p.s(y10);
        f18246g = p.s(fArr);
    }

    public f() {
        super("Oklab", b.c, 17);
    }

    @Override // w0.c
    public final float[] a(float[] fArr) {
        v7.g.f(fArr, "v");
        p.A(f18243d, fArr);
        double d5 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d5));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d5));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d5));
        p.A(f18244e, fArr);
        return fArr;
    }

    @Override // w0.c
    public final float b(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // w0.c
    public final float c(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // w0.c
    public final float[] e(float[] fArr) {
        fArr[0] = a1.c.b0(fArr[0], 0.0f, 1.0f);
        fArr[1] = a1.c.b0(fArr[1], -0.5f, 0.5f);
        fArr[2] = a1.c.b0(fArr[2], -0.5f, 0.5f);
        p.A(f18246g, fArr);
        float f10 = fArr[0];
        fArr[0] = f10 * f10 * f10;
        float f11 = fArr[1];
        fArr[1] = f11 * f11 * f11;
        float f12 = fArr[2];
        fArr[2] = f12 * f12 * f12;
        p.A(f18245f, fArr);
        return fArr;
    }
}
