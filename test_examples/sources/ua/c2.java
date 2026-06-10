package ua;

/* loaded from: classes.dex */
public final class c2 implements qa.b<m7.j> {

    /* renamed from: a  reason: collision with root package name */
    public static final c2 f17957a = new c2();

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f17958b = ma.i.e("kotlin.ULong", x0.f18029a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17958b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        long j2 = ((m7.j) obj).f16002i;
        v7.g.f(dVar, "encoder");
        dVar.k(f17958b).S(j2);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return new m7.j(cVar.m(f17958b).f());
    }
}
