package ua;

/* loaded from: classes.dex */
public final class f2 implements qa.b<m7.l> {

    /* renamed from: a  reason: collision with root package name */
    public static final f2 f17971a = new f2();

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f17972b = ma.i.e("kotlin.UShort", r1.f18008a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17972b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        short s10 = ((m7.l) obj).f16006i;
        v7.g.f(dVar, "encoder");
        dVar.k(f17972b).w(s10);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return new m7.l(cVar.m(f17972b).b0());
    }
}
