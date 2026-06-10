package ua;

import sa.d;

/* loaded from: classes.dex */
public final class s1 implements qa.b<String> {

    /* renamed from: a  reason: collision with root package name */
    public static final s1 f18010a = new s1();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f18011b = new k1("kotlin.String", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18011b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        String str = (String) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(str, "value");
        dVar.l0(str);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return cVar.c0();
    }
}
