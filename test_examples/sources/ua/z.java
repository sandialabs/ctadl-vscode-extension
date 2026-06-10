package ua;

import sa.d;

/* loaded from: classes.dex */
public final class z implements qa.b<Double> {

    /* renamed from: a  reason: collision with root package name */
    public static final z f18036a = new z();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f18037b = new k1("kotlin.Double", d.C0222d.f17521a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18037b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        v7.g.f(dVar, "encoder");
        dVar.v(doubleValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Double.valueOf(cVar.m0());
    }
}
