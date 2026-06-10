package pa;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import kotlinx.datetime.DateTimeFormatException;
import na.h;
import sa.d;
import ua.k1;

/* loaded from: classes.dex */
public final class h implements qa.b<na.h> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f16799a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f16800b = kotlinx.serialization.descriptors.a.a("UtcOffset", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16800b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        na.h hVar = (na.h) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(hVar, "value");
        dVar.l0(hVar.toString());
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        h.a aVar = na.h.Companion;
        String c0 = cVar.c0();
        aVar.getClass();
        v7.g.f(c0, "offsetString");
        try {
            return new na.h(ZoneOffset.of(c0));
        } catch (DateTimeException e10) {
            throw new DateTimeFormatException(e10);
        }
    }
}
