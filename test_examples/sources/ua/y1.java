package ua;

/* loaded from: classes.dex */
public final class y1 extends j1<m7.h, m7.i, x1> {
    public static final y1 c = new y1();

    public y1() {
        super(z1.f18040a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        int[] iArr = ((m7.i) obj).f15999i;
        v7.g.f(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        x1 x1Var = (x1) obj;
        v7.g.f(x1Var, "builder");
        int O = aVar.p0(this.f17981b, i10).O();
        x1Var.b(x1Var.d() + 1);
        int[] iArr = x1Var.f18031a;
        int i11 = x1Var.f18032b;
        x1Var.f18032b = i11 + 1;
        iArr[i11] = O;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        int[] iArr = ((m7.i) obj).f15999i;
        v7.g.f(iArr, "$this$toBuilder");
        return new x1(iArr);
    }

    @Override // ua.j1
    public final m7.i o() {
        return new m7.i(new int[0]);
    }

    @Override // ua.j1
    public final void p(ta.b bVar, m7.i iVar, int i10) {
        int[] iArr = iVar.f15999i;
        v7.g.f(bVar, "encoder");
        v7.g.f(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.f0(this.f17981b, i11).I(iArr[i11]);
        }
    }
}
