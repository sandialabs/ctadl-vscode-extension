package ua;

/* loaded from: classes.dex */
public final class d0 extends j1<Float, float[], c0> {
    public static final d0 c = new d0();

    public d0() {
        super(e0.f17964a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        v7.g.f(fArr, "<this>");
        return fArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        c0 c0Var = (c0) obj;
        v7.g.f(c0Var, "builder");
        float R = aVar.R(this.f17981b, i10);
        c0Var.b(c0Var.d() + 1);
        float[] fArr = c0Var.f17953a;
        int i11 = c0Var.f17954b;
        c0Var.f17954b = i11 + 1;
        fArr[i11] = R;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        v7.g.f(fArr, "<this>");
        return new c0(fArr);
    }

    @Override // ua.j1
    public final float[] o() {
        return new float[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, float[] fArr, int i10) {
        float[] fArr2 = fArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(fArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.s(this.f17981b, i11, fArr2[i11]);
        }
    }
}
