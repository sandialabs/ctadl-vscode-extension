package ua;

/* loaded from: classes.dex */
public final class v1 extends j1<m7.f, m7.g, u1> {
    public static final v1 c = new v1();

    public v1() {
        super(w1.f18025a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        byte[] bArr = ((m7.g) obj).f15995i;
        v7.g.f(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        u1 u1Var = (u1) obj;
        v7.g.f(u1Var, "builder");
        byte T = aVar.p0(this.f17981b, i10).T();
        u1Var.b(u1Var.d() + 1);
        byte[] bArr = u1Var.f18017a;
        int i11 = u1Var.f18018b;
        u1Var.f18018b = i11 + 1;
        bArr[i11] = T;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        byte[] bArr = ((m7.g) obj).f15995i;
        v7.g.f(bArr, "$this$toBuilder");
        return new u1(bArr);
    }

    @Override // ua.j1
    public final m7.g o() {
        return new m7.g(new byte[0]);
    }

    @Override // ua.j1
    public final void p(ta.b bVar, m7.g gVar, int i10) {
        byte[] bArr = gVar.f15995i;
        v7.g.f(bVar, "encoder");
        v7.g.f(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.f0(this.f17981b, i11).B(bArr[i11]);
        }
    }
}
