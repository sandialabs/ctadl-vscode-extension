package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* renamed from: j$.util.stream.a2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0328a2 implements InterfaceC0348e2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0363h2 f12433a;

    public AbstractC0328a2(InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        this.f12433a = interfaceC0363h2;
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
    public void end() {
        this.f12433a.end();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public boolean i() {
        return this.f12433a.i();
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
