package pa;

import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import na.d;
import sa.d;
import ua.k1;

/* loaded from: classes.dex */
public final class e implements qa.b<na.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f16793a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f16794b = kotlinx.serialization.descriptors.a.a("LocalDate", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16794b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        na.d dVar2 = (na.d) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(dVar2, "value");
        dVar.l0(dVar2.toString());
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        d.a aVar = na.d.Companion;
        String c0 = cVar.c0();
        aVar.getClass();
        v7.g.f(c0, "isoString");
        try {
            return new na.d(LocalDate.parse(c0));
        } catch (DateTimeParseException e10) {
            throw new DateTimeFormatException(e10);
        }
    }
}
