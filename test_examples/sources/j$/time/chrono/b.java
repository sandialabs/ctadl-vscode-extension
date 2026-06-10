package j$.time.chrono;

import j$.time.temporal.l;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.s;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static int a(ChronoZonedDateTime chronoZonedDateTime, o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = c.f11894a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? chronoZonedDateTime.g().f(oVar) : chronoZonedDateTime.d().v();
            }
            throw new s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return n.a(chronoZonedDateTime, oVar);
    }

    public static d b(l lVar) {
        if (lVar != null) {
            d dVar = (d) lVar.r(n.d());
            return dVar != null ? dVar : e.f11895a;
        }
        throw new NullPointerException("temporal");
    }
}
