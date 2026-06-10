package j$.util.stream;

import j$.util.function.Consumer;

/* renamed from: j$.util.stream.b2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0333b2 implements InterfaceC0353f2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0363h2 f12437a;

    public AbstractC0333b2(InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        this.f12437a = interfaceC0363h2;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
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
    public void end() {
        this.f12437a.end();
    }

    @Override // j$.util.stream.InterfaceC0353f2
    public final /* synthetic */ void h(Integer num) {
        AbstractC0421w0.s0(this, num);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public boolean i() {
        return this.f12437a.i();
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
