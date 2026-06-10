package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* renamed from: j$.util.stream.c2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0338c2 implements InterfaceC0358g2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0363h2 f12449a;

    public AbstractC0338c2(InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        this.f12449a = interfaceC0363h2;
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
    public void end() {
        this.f12449a.end();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public boolean i() {
        return this.f12449a.i();
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }
}
