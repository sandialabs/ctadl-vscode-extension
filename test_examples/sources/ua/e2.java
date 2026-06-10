package ua;

/* loaded from: classes.dex */
public final class e2 extends j1<m7.l, m7.m, d2> {
    public static final e2 c = new e2();

    public e2() {
        super(f2.f17971a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        short[] sArr = ((m7.m) obj).f16007i;
        v7.g.f(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        d2 d2Var = (d2) obj;
        v7.g.f(d2Var, "builder");
        short b02 = aVar.p0(this.f17981b, i10).b0();
        d2Var.b(d2Var.d() + 1);
        short[] sArr = d2Var.f17961a;
        int i11 = d2Var.f17962b;
        d2Var.f17962b = i11 + 1;
        sArr[i11] = b02;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        short[] sArr = ((m7.m) obj).f16007i;
        v7.g.f(sArr, "$this$toBuilder");
        return new d2(sArr);
    }

    @Override // ua.j1
    public final m7.m o() {
        return new m7.m(new short[0]);
    }

    @Override // ua.j1
    public final void p(ta.b bVar, m7.m mVar, int i10) {
        short[] sArr = mVar.f16007i;
        v7.g.f(bVar, "encoder");
        v7.g.f(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.f0(this.f17981b, i11).w(sArr[i11]);
        }
    }
}
