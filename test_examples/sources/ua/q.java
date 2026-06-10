package ua;

import sa.d;

/* loaded from: classes.dex */
public final class q implements qa.b<Character> {

    /* renamed from: a  reason: collision with root package name */
    public static final q f18004a = new q();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f18005b = new k1("kotlin.Char", d.c.f17520a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18005b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        char charValue = ((Character) obj).charValue();
        v7.g.f(dVar, "encoder");
        dVar.U(charValue);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return Character.valueOf(cVar.q());
    }
}
