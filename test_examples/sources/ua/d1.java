package ua;

import kotlinx.serialization.SerializationException;

/* loaded from: classes.dex */
public final class d1 implements qa.b {

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f17959a = new d1();

    /* renamed from: b  reason: collision with root package name */
    public static final c1 f17960b = c1.f17955a;

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17960b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        v7.g.f(dVar, "encoder");
        v7.g.f((Void) obj, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }
}
