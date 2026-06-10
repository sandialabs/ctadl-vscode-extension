package ua;

import sa.d;

/* loaded from: classes.dex */
public final class h implements qa.b<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f17975a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f17976b = new k1("kotlin.Boolean", d.a.f17518a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17976b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        v7.g.f(dVar, "encoder");
        dVar.D(booleanValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Boolean.valueOf(cVar.l());
    }
}
