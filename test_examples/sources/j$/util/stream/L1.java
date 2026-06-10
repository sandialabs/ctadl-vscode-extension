package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0277f;

/* loaded from: classes2.dex */
final class L1 extends Q1 implements P1, InterfaceC0353f2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.K0 f12346b;
    final /* synthetic */ j$.util.function.B0 c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0277f f12347d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(j$.util.function.K0 k02, j$.util.function.B0 b02, InterfaceC0277f interfaceC0277f) {
        this.f12346b = k02;
        this.c = b02;
        this.f12347d = interfaceC0277f;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        this.c.accept(this.f12370a, i10);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        h((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        this.f12370a = this.f12346b.get();
    }

    @Override // j$.util.stream.InterfaceC0353f2
    public final /* synthetic */ void h(Integer num) {
        AbstractC0421w0.s0(this, num);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void l(P1 p12) {
        this.f12370a = this.f12347d.apply(this.f12370a, ((L1) p12).f12370a);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
