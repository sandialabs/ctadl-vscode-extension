package ua;

/* loaded from: classes.dex */
public final class b2 extends j1<m7.j, m7.k, a2> {
    public static final b2 c = new b2();

    public b2() {
        super(c2.f17957a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        long[] jArr = ((m7.k) obj).f16003i;
        v7.g.f(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        a2 a2Var = (a2) obj;
        v7.g.f(a2Var, "builder");
        long f10 = aVar.p0(this.f17981b, i10).f();
        a2Var.b(a2Var.d() + 1);
        long[] jArr = a2Var.f17947a;
        int i11 = a2Var.f17948b;
        a2Var.f17948b = i11 + 1;
        jArr[i11] = f10;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        long[] jArr = ((m7.k) obj).f16003i;
        v7.g.f(jArr, "$this$toBuilder");
        return new a2(jArr);
    }

    @Override // ua.j1
    public final m7.k o() {
        return new m7.k(new long[0]);
    }

    @Override // ua.j1
    public final void p(ta.b bVar, m7.k kVar, int i10) {
        long[] jArr = kVar.f16003i;
        v7.g.f(bVar, "encoder");
        v7.g.f(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.f0(this.f17981b, i11).S(jArr[i11]);
        }
    }
}
