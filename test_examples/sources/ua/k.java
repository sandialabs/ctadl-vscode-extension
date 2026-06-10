package ua;

import sa.d;

/* loaded from: classes.dex */
public final class k implements qa.b<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final k f17982a = new k();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f17983b = new k1("kotlin.Byte", d.b.f17519a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17983b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        v7.g.f(dVar, "encoder");
        dVar.B(byteValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Byte.valueOf(cVar.T());
    }
}
