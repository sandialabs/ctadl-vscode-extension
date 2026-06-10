package ua;

/* loaded from: classes.dex */
public final class w1 implements qa.b<m7.f> {

    /* renamed from: a  reason: collision with root package name */
    public static final w1 f18025a = new w1();

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f18026b = ma.i.e("kotlin.UByte", k.f17982a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18026b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        byte b5 = ((m7.f) obj).f15994i;
        v7.g.f(dVar, "encoder");
        dVar.k(f18026b).B(b5);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return new m7.f(cVar.m(f18026b).T());
    }
}
