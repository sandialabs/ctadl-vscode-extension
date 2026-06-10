package ua;

/* loaded from: classes.dex */
public final class q1 extends j1<Short, short[], p1> {
    public static final q1 c = new q1();

    public q1() {
        super(r1.f18008a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        v7.g.f(sArr, "<this>");
        return sArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        p1 p1Var = (p1) obj;
        v7.g.f(p1Var, "builder");
        short F = aVar.F(this.f17981b, i10);
        p1Var.b(p1Var.d() + 1);
        short[] sArr = p1Var.f18002a;
        int i11 = p1Var.f18003b;
        p1Var.f18003b = i11 + 1;
        sArr[i11] = F;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        v7.g.f(sArr, "<this>");
        return new p1(sArr);
    }

    @Override // ua.j1
    public final short[] o() {
        return new short[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, short[] sArr, int i10) {
        short[] sArr2 = sArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(sArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.k0(this.f17981b, i11, sArr2[i11]);
        }
    }
}
