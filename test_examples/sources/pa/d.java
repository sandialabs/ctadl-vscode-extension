package pa;

import na.c;
import sa.d;
import ua.k1;

/* loaded from: classes.dex */
public final class d implements qa.b<na.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16791a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f16792b = kotlinx.serialization.descriptors.a.a("Instant", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16792b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        na.c cVar = (na.c) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(cVar, "value");
        dVar.l0(cVar.toString());
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        c.a aVar = na.c.Companion;
        String c0 = cVar.c0();
        aVar.getClass();
        return c.a.a(c0);
    }
}
