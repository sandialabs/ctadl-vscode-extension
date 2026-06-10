package ua;

/* loaded from: classes.dex */
public final class w0 extends j1<Long, long[], v0> {
    public static final w0 c = new w0();

    public w0() {
        super(x0.f18029a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        v7.g.f(jArr, "<this>");
        return jArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        v0 v0Var = (v0) obj;
        v7.g.f(v0Var, "builder");
        long y10 = aVar.y(this.f17981b, i10);
        v0Var.b(v0Var.d() + 1);
        long[] jArr = v0Var.f18021a;
        int i11 = v0Var.f18022b;
        v0Var.f18022b = i11 + 1;
        jArr[i11] = y10;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        v7.g.f(jArr, "<this>");
        return new v0(jArr);
    }

    @Override // ua.j1
    public final long[] o() {
        return new long[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, long[] jArr, int i10) {
        long[] jArr2 = jArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(jArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.h(this.f17981b, i11, jArr2[i11]);
        }
    }
}
