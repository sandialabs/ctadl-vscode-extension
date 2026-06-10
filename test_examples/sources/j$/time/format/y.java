package j$.time.format;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;

/* loaded from: classes2.dex */
final class y implements j$.time.temporal.l {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChronoLocalDate f11990a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.l f11991b;
    final /* synthetic */ j$.time.chrono.d c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f11992d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(LocalDate localDate, j$.time.temporal.l lVar, j$.time.chrono.d dVar, ZoneId zoneId) {
        this.f11990a = localDate;
        this.f11991b = lVar;
        this.c = dVar;
        this.f11992d = zoneId;
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        ChronoLocalDate chronoLocalDate = this.f11990a;
        return (chronoLocalDate == null || !oVar.isDateBased()) ? this.f11991b.c(oVar) : chronoLocalDate.c(oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int f(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.t i(j$.time.temporal.o oVar) {
        ChronoLocalDate chronoLocalDate = this.f11990a;
        return (chronoLocalDate == null || !oVar.isDateBased()) ? this.f11991b.i(oVar) : chronoLocalDate.i(oVar);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        ChronoLocalDate chronoLocalDate = this.f11990a;
        return (chronoLocalDate == null || !oVar.isDateBased()) ? this.f11991b.o(oVar) : chronoLocalDate.o(oVar);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.n.d() ? this.c : qVar == j$.time.temporal.n.k() ? this.f11992d : qVar == j$.time.temporal.n.i() ? this.f11991b.r(qVar) : qVar.d(this);
    }
}
