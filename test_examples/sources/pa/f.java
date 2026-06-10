package pa;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import na.e;
import sa.d;
import ua.k1;

/* loaded from: classes.dex */
public final class f implements qa.b<na.e> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f16795a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f16796b = kotlinx.serialization.descriptors.a.a("LocalDateTime", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16796b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        na.e eVar = (na.e) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(eVar, "value");
        dVar.l0(eVar.toString());
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        e.a aVar = na.e.Companion;
        String c0 = cVar.c0();
        aVar.getClass();
        v7.g.f(c0, "isoString");
        try {
            return new na.e(LocalDateTime.parse(c0));
        } catch (DateTimeParseException e10) {
            throw new DateTimeFormatException(e10);
        }
    }
}
