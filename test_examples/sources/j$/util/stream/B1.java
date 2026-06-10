package j$.util.stream;

import j$.util.C0318l;
import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0285j;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
final class B1 implements P1, InterfaceC0348e2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f12290a;

    /* renamed from: b  reason: collision with root package name */
    private double f12291b;
    final /* synthetic */ InterfaceC0285j c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B1(InterfaceC0285j interfaceC0285j) {
        this.c = interfaceC0285j;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        if (this.f12290a) {
            this.f12290a = false;
        } else {
            d5 = this.c.applyAsDouble(this.f12291b, d5);
        }
        this.f12291b = d5;
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
        this.f12290a = true;
        this.f12291b = 0.0d;
    }

    @Override // j$.util.function.K0
    public final Object get() {
        return this.f12290a ? C0318l.a() : C0318l.d(this.f12291b);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void l(P1 p12) {
        B1 b12 = (B1) p12;
        if (b12.f12290a) {
            return;
        }
        accept(b12.f12291b);
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
