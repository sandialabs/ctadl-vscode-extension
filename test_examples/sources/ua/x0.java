package ua;

import sa.d;

/* loaded from: classes.dex */
public final class x0 implements qa.b<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f18029a = new x0();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f18030b = new k1("kotlin.Long", d.g.f17524a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18030b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        long longValue = ((Number) obj).longValue();
        v7.g.f(dVar, "encoder");
        dVar.S(longValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Long.valueOf(cVar.f());
    }
}
