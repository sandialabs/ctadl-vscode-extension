package j$.util.stream;

import j$.util.C0320n;
import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
final class O1 implements P1, InterfaceC0358g2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f12361a;

    /* renamed from: b  reason: collision with root package name */
    private long f12362b;
    final /* synthetic */ InterfaceC0270b0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O1(InterfaceC0270b0 interfaceC0270b0) {
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
        if (this.f12361a) {
            this.f12361a = false;
        } else {
            j2 = this.c.applyAsLong(this.f12362b, j2);
        }
        this.f12362b = j2;
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
        this.f12361a = true;
        this.f12362b = 0L;
    }

    @Override // j$.util.function.K0
    public final Object get() {
        return this.f12361a ? C0320n.a() : C0320n.d(this.f12362b);
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
        O1 o12 = (O1) p12;
        if (o12.f12361a) {
            return;
        }
        accept(o12.f12362b);
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }
}
