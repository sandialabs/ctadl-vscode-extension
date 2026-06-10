package ua;

/* loaded from: classes.dex */
public final class g extends j1<Boolean, boolean[], f> {
    public static final g c = new g();

    public g() {
        super(h.f17975a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        v7.g.f(zArr, "<this>");
        return zArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        f fVar = (f) obj;
        v7.g.f(fVar, "builder");
        boolean e02 = aVar.e0(this.f17981b, i10);
        fVar.b(fVar.d() + 1);
        boolean[] zArr = fVar.f17968a;
        int i11 = fVar.f17969b;
        fVar.f17969b = i11 + 1;
        zArr[i11] = e02;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        v7.g.f(zArr, "<this>");
        return new f(zArr);
    }

    @Override // ua.j1
    public final boolean[] o() {
        return new boolean[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, boolean[] zArr, int i10) {
        boolean[] zArr2 = zArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(zArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.h0(this.f17981b, i11, zArr2[i11]);
        }
    }
}
