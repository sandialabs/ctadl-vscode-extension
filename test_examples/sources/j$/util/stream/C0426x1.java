package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0277f;
import j$.util.function.InterfaceC0278f0;

/* renamed from: j$.util.stream.x1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0426x1 extends Q1 implements P1, InterfaceC0358g2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.K0 f12577b;
    final /* synthetic */ j$.util.function.E0 c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0277f f12578d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0426x1(j$.util.function.K0 k02, j$.util.function.E0 e02, InterfaceC0277f interfaceC0277f) {
        this.f12577b = k02;
        this.c = e02;
        this.f12578d = interfaceC0277f;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        this.c.accept(this.f12370a, j2);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Long) obj);
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
        this.f12370a = this.f12577b.get();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.stream.P1
    public final void l(P1 p12) {
        this.f12370a = this.f12578d.apply(this.f12370a, ((C0426x1) p12).f12370a);
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }
}
