package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.r2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0403r2 extends AbstractC0340d {

    /* renamed from: j  reason: collision with root package name */
    private final AbstractC0335c f12530j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f12531k;

    /* renamed from: l  reason: collision with root package name */
    private final long f12532l;

    /* renamed from: m  reason: collision with root package name */
    private final long f12533m;
    private long n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f12534o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0403r2(AbstractC0335c abstractC0335c, AbstractC0335c abstractC0335c2, Spliterator spliterator, IntFunction intFunction, long j2, long j10) {
        super(abstractC0335c2, spliterator);
        this.f12530j = abstractC0335c;
        this.f12531k = intFunction;
        this.f12532l = j2;
        this.f12533m = j10;
    }

    C0403r2(C0403r2 c0403r2, Spliterator spliterator) {
        super(c0403r2, spliterator);
        this.f12530j = c0403r2.f12530j;
        this.f12531k = c0403r2.f12531k;
        this.f12532l = c0403r2.f12532l;
        this.f12533m = c0403r2.f12533m;
    }

    private long j(long j2) {
        if (this.f12534o) {
            return this.n;
        }
        C0403r2 c0403r2 = (C0403r2) this.f12466d;
        C0403r2 c0403r22 = (C0403r2) this.f12467e;
        if (c0403r2 != null && c0403r22 != null) {
            long j10 = c0403r2.j(j2);
            return j10 >= j2 ? j10 : j10 + c0403r22.j(j2);
        }
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final Object a() {
        if (c() == null) {
            A0 r1 = this.f12530j.r1(V2.SIZED.j(this.f12530j.f12441j) ? this.f12530j.a1(this.f12465b) : -1L, this.f12531k);
            InterfaceC0363h2 K1 = this.f12530j.K1(this.f12464a.g1(), r1);
            AbstractC0421w0 abstractC0421w0 = this.f12464a;
            abstractC0421w0.W0(this.f12465b, abstractC0421w0.x1(K1));
            return r1.build();
        }
        AbstractC0421w0 abstractC0421w02 = this.f12464a;
        A0 r12 = abstractC0421w02.r1(-1L, this.f12531k);
        abstractC0421w02.w1(this.f12465b, r12);
        F0 build = r12.build();
        this.n = build.count();
        this.f12534o = true;
        this.f12465b = null;
        return build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final AbstractC0350f d(Spliterator spliterator) {
        return new C0403r2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0340d
    protected final void g() {
        this.f12452i = true;
        if (this.f12534o) {
            e(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0340d
    /* renamed from: k */
    public final Z0 i() {
        return AbstractC0421w0.Z0(this.f12530j.D1());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @Override // j$.util.stream.AbstractC0350f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        C0403r2 c0403r2;
        F0 U0;
        AbstractC0350f abstractC0350f = this.f12466d;
        boolean z10 = true;
        if (!(abstractC0350f == null)) {
            this.n = ((C0403r2) abstractC0350f).n + ((C0403r2) this.f12467e).n;
            if (this.f12452i) {
                this.n = 0L;
            } else if (this.n != 0) {
                U0 = ((C0403r2) this.f12466d).n == 0 ? (F0) ((C0403r2) this.f12467e).b() : AbstractC0421w0.U0(this.f12530j.D1(), (F0) ((C0403r2) this.f12466d).b(), (F0) ((C0403r2) this.f12467e).b());
                F0 f02 = U0;
                if (c() != null) {
                    f02 = f02.r(this.f12532l, this.f12533m >= 0 ? Math.min(f02.count(), this.f12532l + this.f12533m) : this.n, this.f12531k);
                }
                e(f02);
                this.f12534o = true;
            }
            U0 = i();
            F0 f022 = U0;
            if (c() != null) {
            }
            e(f022);
            this.f12534o = true;
        }
        if (this.f12533m >= 0) {
            if (!(c() == null)) {
                long j2 = this.f12532l + this.f12533m;
                long j10 = this.f12534o ? this.n : j(j2);
                if (j10 < j2) {
                    C0403r2 c0403r22 = (C0403r2) c();
                    C0403r2 c0403r23 = this;
                    while (true) {
                        if (c0403r22 != null) {
                            if (c0403r23 == c0403r22.f12467e && (c0403r2 = (C0403r2) c0403r22.f12466d) != null) {
                                j10 += c0403r2.j(j2);
                                if (j10 >= j2) {
                                    break;
                                }
                            }
                            c0403r23 = c0403r22;
                            c0403r22 = (C0403r2) c0403r22.c();
                        } else if (j10 < j2) {
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    h();
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
