package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
final class N1 implements P1, InterfaceC0358g2 {

    /* renamed from: a  reason: collision with root package name */
    private long f12357a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f12358b;
    final /* synthetic */ InterfaceC0270b0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N1(long j2, InterfaceC0270b0 interfaceC0270b0) {
        this.f12358b = j2;
        this.c = interfaceC0270b0;
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
        this.f12357a = this.c.applyAsLong(this.f12357a, j2);
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
        this.f12357a = this.f12358b;
    }

    @Override // j$.util.function.K0
    public final Object get() {
        return Long.valueOf(this.f12357a);
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
        accept(((N1) p12).f12357a);
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }
}
