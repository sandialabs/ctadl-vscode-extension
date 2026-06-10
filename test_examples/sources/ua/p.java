package ua;

/* loaded from: classes.dex */
public final class p extends j1<Character, char[], o> {
    public static final p c = new p();

    public p() {
        super(q.f18004a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        v7.g.f(cArr, "<this>");
        return cArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        o oVar = (o) obj;
        v7.g.f(oVar, "builder");
        char Q = aVar.Q(this.f17981b, i10);
        oVar.b(oVar.d() + 1);
        char[] cArr = oVar.f17997a;
        int i11 = oVar.f17998b;
        oVar.f17998b = i11 + 1;
        cArr[i11] = Q;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        v7.g.f(cArr, "<this>");
        return new o(cArr);
    }

    @Override // ua.j1
    public final char[] o() {
        return new char[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, char[] cArr, int i10) {
        char[] cArr2 = cArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(cArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.x(this.f17981b, i11, cArr2[i11]);
        }
    }
}
