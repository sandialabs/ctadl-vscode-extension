package pa;

import kotlinx.serialization.SerializationException;
import na.g;
import sa.d;
import ua.k1;

/* loaded from: classes.dex */
public final class c implements qa.b<na.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16789a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f16790b = kotlinx.serialization.descriptors.a.a("FixedOffsetTimeZone", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16790b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        na.b bVar = (na.b) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(bVar, "value");
        String id = bVar.f16151a.getId();
        v7.g.e(id, "zoneId.id");
        dVar.l0(id);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        g.a aVar = na.g.Companion;
        String c0 = cVar.c0();
        aVar.getClass();
        na.g b5 = g.a.b(c0);
        if (b5 instanceof na.b) {
            return (na.b) b5;
        }
        throw new SerializationException("Timezone identifier '" + b5 + "' does not correspond to a fixed-offset timezone");
    }
}
