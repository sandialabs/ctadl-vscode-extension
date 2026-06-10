package ua;

import sa.d;

/* loaded from: classes.dex */
public final class n0 implements qa.b<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f17993a = new n0();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f17994b = new k1("kotlin.Int", d.f.f17523a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17994b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        int intValue = ((Number) obj).intValue();
        v7.g.f(dVar, "encoder");
        dVar.I(intValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Integer.valueOf(cVar.O());
    }
}
