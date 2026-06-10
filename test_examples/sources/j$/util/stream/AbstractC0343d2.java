package j$.util.stream;

import j$.util.function.Consumer;

/* renamed from: j$.util.stream.d2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0343d2 implements InterfaceC0363h2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0363h2 f12453a;

    public AbstractC0343d2(InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        this.f12453a = interfaceC0363h2;
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
    public final /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public void end() {
        this.f12453a.end();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public boolean i() {
        return this.f12453a.i();
    }
}
