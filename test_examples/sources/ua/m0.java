package ua;

/* loaded from: classes.dex */
public final class m0 extends j1<Integer, int[], l0> {
    public static final m0 c = new m0();

    public m0() {
        super(n0.f17993a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        v7.g.f(iArr, "<this>");
        return iArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        l0 l0Var = (l0) obj;
        v7.g.f(l0Var, "builder");
        int u10 = aVar.u(this.f17981b, i10);
        l0Var.b(l0Var.d() + 1);
        int[] iArr = l0Var.f17988a;
        int i11 = l0Var.f17989b;
        l0Var.f17989b = i11 + 1;
        iArr[i11] = u10;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        v7.g.f(iArr, "<this>");
        return new l0(iArr);
    }

    @Override // ua.j1
    public final int[] o() {
        return new int[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, int[] iArr, int i10) {
        int[] iArr2 = iArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(iArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.r(i11, iArr2[i11], this.f17981b);
        }
    }
}
