package ua;

import sa.d;

/* loaded from: classes.dex */
public final class r1 implements qa.b<Short> {

    /* renamed from: a  reason: collision with root package name */
    public static final r1 f18008a = new r1();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f18009b = new k1("kotlin.Short", d.h.f17525a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18009b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        v7.g.f(dVar, "encoder");
        dVar.w(shortValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Short.valueOf(cVar.b0());
    }
}
