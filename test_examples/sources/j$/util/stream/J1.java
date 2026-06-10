package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class J1 implements P1, InterfaceC0353f2 {

    /* renamed from: a  reason: collision with root package name */
    private int f12339a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f12340b;
    final /* synthetic */ j$.util.function.G c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(int i10, j$.util.function.G g10) {
        this.f12340b = i10;
        this.c = g10;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        this.f12339a = this.c.applyAsInt(this.f12339a, i10);
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
        this.f12339a = this.f12340b;
    }

    @Override // j$.util.function.K0
    public final Object get() {
        return Integer.valueOf(this.f12339a);
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
        accept(((J1) p12).f12339a);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
