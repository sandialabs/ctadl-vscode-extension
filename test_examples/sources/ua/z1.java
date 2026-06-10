package ua;

/* loaded from: classes.dex */
public final class z1 implements qa.b<m7.h> {

    /* renamed from: a  reason: collision with root package name */
    public static final z1 f18040a = new z1();

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f18041b = ma.i.e("kotlin.UInt", n0.f17993a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18041b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        int i10 = ((m7.h) obj).f15998i;
        v7.g.f(dVar, "encoder");
        dVar.k(f18041b).I(i10);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return new m7.h(cVar.m(f18041b).O());
    }
}
