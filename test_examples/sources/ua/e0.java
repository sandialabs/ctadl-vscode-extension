package ua;

import sa.d;

/* loaded from: classes.dex */
public final class e0 implements qa.b<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f17964a = new e0();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f17965b = new k1("kotlin.Float", d.e.f17522a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17965b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        v7.g.f(dVar, "encoder");
        dVar.M(floatValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Float.valueOf(cVar.d0());
    }
}
