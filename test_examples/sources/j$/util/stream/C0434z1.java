package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0285j;
import j$.util.function.InterfaceC0293n;

/* renamed from: j$.util.stream.z1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0434z1 implements P1, InterfaceC0348e2 {

    /* renamed from: a  reason: collision with root package name */
    private double f12585a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f12586b;
    final /* synthetic */ InterfaceC0285j c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0434z1(double d5, InterfaceC0285j interfaceC0285j) {
        this.f12586b = d5;
        this.c = interfaceC0285j;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.f12585a = this.c.applyAsDouble(this.f12585a, d5);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        q((Double) obj);
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
        this.f12585a = this.f12586b;
    }

    @Override // j$.util.function.K0
    public final Object get() {
        return Double.valueOf(this.f12585a);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void l(P1 p12) {
        accept(((C0434z1) p12).f12585a);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    @Override // j$.util.stream.InterfaceC0348e2
    public final /* synthetic */ void q(Double d5) {
        AbstractC0421w0.q0(this, d5);
    }
}
