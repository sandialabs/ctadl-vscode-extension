package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q extends k {

    /* renamed from: i  reason: collision with root package name */
    static final LocalDate f11961i = LocalDate.of(2000, 1, 1);

    /* renamed from: g  reason: collision with root package name */
    private final int f11962g;

    /* renamed from: h  reason: collision with root package name */
    private final ChronoLocalDate f11963h;

    private q(j$.time.temporal.o oVar, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
        super(oVar, i10, i11, F.NOT_NEGATIVE, i13);
        this.f11962g = i12;
        this.f11963h = chronoLocalDate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(j$.time.temporal.o oVar, LocalDate localDate) {
        this(oVar, 2, 2, 0, localDate, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(j$.time.temporal.o oVar, LocalDate localDate, int i10) {
        this(oVar, 2, 2, 0, localDate, 0);
    }

    @Override // j$.time.format.k
    final long b(z zVar, long j2) {
        int i10;
        long abs = Math.abs(j2);
        ChronoLocalDate chronoLocalDate = this.f11963h;
        if (chronoLocalDate != null) {
            ((j$.time.chrono.e) j$.time.chrono.b.b(zVar.d())).getClass();
            i10 = LocalDate.u(chronoLocalDate).f(this.f11943a);
        } else {
            i10 = this.f11962g;
        }
        long j10 = i10;
        long[] jArr = k.f11942f;
        if (j2 >= j10) {
            long j11 = jArr[this.f11944b];
            if (j2 < j10 + j11) {
                return abs % j11;
            }
        }
        return abs % jArr[this.c];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final boolean c(x xVar) {
        if (xVar.l()) {
            return super.c(xVar);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.p] */
    @Override // j$.time.format.k
    public final int d(final x xVar, final long j2, final int i10, final int i11) {
        int i12;
        ChronoLocalDate chronoLocalDate = this.f11963h;
        if (chronoLocalDate != null) {
            ((j$.time.chrono.e) xVar.h()).getClass();
            i12 = LocalDate.u(chronoLocalDate).f(this.f11943a);
            xVar.a(new Consumer() { // from class: j$.time.format.p
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    j$.time.chrono.d dVar = (j$.time.chrono.d) obj;
                    q.this.d(xVar, j2, i10, i11);
                }

                @Override // j$.util.function.Consumer
                public final Consumer e(Consumer consumer) {
                    consumer.getClass();
                    return new j$.util.concurrent.u(3, this, consumer);
                }
            });
        } else {
            i12 = this.f11962g;
        }
        int i13 = i11 - i10;
        int i14 = this.f11944b;
        if (i13 == i14 && j2 >= 0) {
            long j10 = k.f11942f[i14];
            long j11 = i12;
            long j12 = j11 - (j11 % j10);
            j2 = i12 > 0 ? j12 + j2 : j12 - j2;
            if (j2 < j11) {
                j2 += j10;
            }
        }
        return xVar.o(this.f11943a, j2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k g() {
        return this.f11946e == -1 ? this : new q(this.f11943a, this.f11944b, this.c, this.f11962g, this.f11963h, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k h(int i10) {
        return new q(this.f11943a, this.f11944b, this.c, this.f11962g, this.f11963h, this.f11946e + i10);
    }

    @Override // j$.time.format.k
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReducedValue(");
        sb.append(this.f11943a);
        sb.append(",");
        sb.append(this.f11944b);
        sb.append(",");
        sb.append(this.c);
        sb.append(",");
        Object obj = this.f11963h;
        if (obj == null) {
            obj = Integer.valueOf(this.f11962g);
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
