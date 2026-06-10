package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.util.AbstractC0261c;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private j$.time.temporal.l f11993a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f11994b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r3 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.temporal.a[] values;
        j$.time.chrono.d b5 = dateTimeFormatter.b();
        ZoneId e10 = dateTimeFormatter.e();
        if (b5 != null || e10 != null) {
            j$.time.chrono.d dVar = (j$.time.chrono.d) lVar.r(j$.time.temporal.n.d());
            ZoneId zoneId = (ZoneId) lVar.r(j$.time.temporal.n.k());
            LocalDate localDate = null;
            b5 = AbstractC0261c.o(b5, dVar) ? null : b5;
            e10 = AbstractC0261c.o(e10, zoneId) ? null : e10;
            if (b5 != null || e10 != null) {
                j$.time.chrono.e eVar = b5 != null ? b5 : dVar;
                if (e10 != null) {
                    if (lVar.c(j$.time.temporal.a.INSTANT_SECONDS)) {
                        if (eVar == null) {
                            eVar = j$.time.chrono.e.f11895a;
                        }
                        Instant u10 = Instant.u(lVar);
                        eVar.getClass();
                        lVar = ZonedDateTime.u(u10, e10);
                    } else if (e10.normalized() instanceof ZoneOffset) {
                        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                        if (lVar.c(aVar) && lVar.f(aVar) != e10.getRules().d(Instant.EPOCH).v()) {
                            throw new DateTimeException("Unable to apply override zone '" + e10 + "' because the temporal object being formatted has a different offset but does not represent an instant: " + lVar);
                        }
                    }
                }
                if (b5 != null) {
                    if (lVar.c(j$.time.temporal.a.EPOCH_DAY)) {
                        ((j$.time.chrono.e) eVar).getClass();
                        localDate = LocalDate.u(lVar);
                    } else if (b5 != j$.time.chrono.e.f11895a || dVar != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.isDateBased() && lVar.c(aVar2)) {
                                throw new DateTimeException("Unable to apply override chronology '" + b5 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                            }
                        }
                    }
                }
                lVar = new y(localDate, lVar, eVar, zoneId);
            }
        }
        this.f11993a = lVar;
        this.f11994b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C b() {
        return this.f11994b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.f11994b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.temporal.l d() {
        return this.f11993a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.o oVar) {
        try {
            return Long.valueOf(this.f11993a.o(oVar));
        } catch (DateTimeException e10) {
            if (this.c > 0) {
                return null;
            }
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(j$.time.temporal.q qVar) {
        Object r3 = this.f11993a.r(qVar);
        if (r3 == null && this.c == 0) {
            throw new DateTimeException("Unable to extract value: " + this.f11993a.getClass());
        }
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.c++;
    }

    public final String toString() {
        return this.f11993a.toString();
    }
}
