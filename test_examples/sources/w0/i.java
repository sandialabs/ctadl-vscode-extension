package w0;

/* loaded from: classes.dex */
public final class i extends c {
    public i() {
        super("Generic XYZ", b.f18238b, 14);
    }

    public static float f(float f10) {
        return a1.c.b0(f10, -2.0f, 2.0f);
    }

    @Override // w0.c
    public final float[] a(float[] fArr) {
        v7.g.f(fArr, "v");
        fArr[0] = f(fArr[0]);
        fArr[1] = f(fArr[1]);
        fArr[2] = f(fArr[2]);
        return fArr;
    }

    @Override // w0.c
    public final float b(int i10) {
        return 2.0f;
    }

    @Override // w0.c
    public final float c(int i10) {
        return -2.0f;
    }

    @Override // w0.c
    public final float[] e(float[] fArr) {
        fArr[0] = f(fArr[0]);
        fArr[1] = f(fArr[1]);
        fArr[2] = f(fArr[2]);
        return fArr;
    }
}
