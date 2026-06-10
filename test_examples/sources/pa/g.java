package pa;

import na.g;
import sa.d;
import ua.k1;

/* loaded from: classes.dex */
public final class g implements qa.b<na.g> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f16797a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f16798b = kotlinx.serialization.descriptors.a.a("TimeZone", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16798b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        na.g gVar = (na.g) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(gVar, "value");
        String id = gVar.f16151a.getId();
        v7.g.e(id, "zoneId.id");
        dVar.l0(id);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        g.a aVar = na.g.Companion;
        String c0 = cVar.c0();
        aVar.getClass();
        return g.a.b(c0);
    }
}
