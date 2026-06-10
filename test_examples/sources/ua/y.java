package ua;

/* loaded from: classes.dex */
public final class y extends j1<Double, double[], x> {
    public static final y c = new y();

    public y() {
        super(z.f18036a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        v7.g.f(dArr, "<this>");
        return dArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        x xVar = (x) obj;
        v7.g.f(xVar, "builder");
        double g10 = aVar.g(this.f17981b, i10);
        xVar.b(xVar.d() + 1);
        double[] dArr = xVar.f18027a;
        int i11 = xVar.f18028b;
        xVar.f18028b = i11 + 1;
        dArr[i11] = g10;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        v7.g.f(dArr, "<this>");
        return new x(dArr);
    }

    @Override // ua.j1
    public final double[] o() {
        return new double[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, double[] dArr, int i10) {
        double[] dArr2 = dArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(dArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.G(this.f17981b, i11, dArr2[i11]);
        }
    }
}
