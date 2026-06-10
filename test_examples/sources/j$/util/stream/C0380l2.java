package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0380l2 extends AbstractC0331b0 {

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ long f12495s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ long f12496t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0380l2(AbstractC0335c abstractC0335c, int i10, long j2, long j10) {
        super(abstractC0335c, i10);
        this.f12495s = j2;
        this.f12496t = j10;
    }

    static j$.util.H R1(j$.util.H h10, long j2, long j10, long j11) {
        long j12;
        long j13;
        if (j2 <= j11) {
            long j14 = j11 - j2;
            j13 = j10 >= 0 ? Math.min(j10, j14) : j14;
            j12 = 0;
        } else {
            j12 = j2;
            j13 = j10;
        }
        return new v3(h10, j12, j13);
    }

    @Override // j$.util.stream.AbstractC0335c
    final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC0335c abstractC0335c) {
        long a12 = abstractC0335c.a1(spliterator);
        return (a12 <= 0 || !spliterator.hasCharacteristics(16384)) ? !V2.ORDERED.i(abstractC0335c.g1()) ? AbstractC0421w0.S0(this, R1((j$.util.H) abstractC0335c.O1(spliterator), this.f12495s, this.f12496t, a12), true) : (F0) new C0403r2(this, abstractC0335c, spliterator, intFunction, this.f12495s, this.f12496t).invoke() : AbstractC0421w0.S0(abstractC0335c, AbstractC0421w0.K0(abstractC0335c.E1(), spliterator, this.f12495s, this.f12496t), true);
    }

    @Override // j$.util.stream.AbstractC0335c
    final Spliterator I1(AbstractC0335c abstractC0335c, Spliterator spliterator) {
        long a12 = abstractC0335c.a1(spliterator);
        if (a12 <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !V2.ORDERED.i(abstractC0335c.g1()) ? R1((j$.util.H) abstractC0335c.O1(spliterator), this.f12495s, this.f12496t, a12) : ((F0) new C0403r2(this, abstractC0335c, spliterator, new S1(3), this.f12495s, this.f12496t).invoke()).spliterator();
        }
        long j2 = this.f12495s;
        return new o3((j$.util.H) abstractC0335c.O1(spliterator), j2, AbstractC0421w0.J0(j2, this.f12496t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        return new C0376k2(this, interfaceC0363h2);
    }
}
