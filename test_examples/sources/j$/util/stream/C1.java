package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0277f;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
final class C1 extends Q1 implements P1, InterfaceC0348e2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.K0 f12294b;
    final /* synthetic */ j$.util.function.y0 c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0277f f12295d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(j$.util.function.K0 k02, j$.util.function.y0 y0Var, InterfaceC0277f interfaceC0277f) {
        this.f12294b = k02;
        this.c = y0Var;
        this.f12295d = interfaceC0277f;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.c.accept(this.f12370a, d5);
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
        this.f12370a = this.f12294b.get();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void l(P1 p12) {
        this.f12370a = this.f12295d.apply(this.f12370a, ((C1) p12).f12370a);
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
