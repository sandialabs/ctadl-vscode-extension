package j$.util.stream;

import j$.util.C0316j;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0277f;

/* loaded from: classes2.dex */
final class E1 implements P1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f12304a;

    /* renamed from: b  reason: collision with root package name */
    private Object f12305b;
    final /* synthetic */ InterfaceC0277f c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E1(InterfaceC0277f interfaceC0277f) {
        this.c = interfaceC0277f;
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
    public final void accept(Object obj) {
        if (this.f12304a) {
            this.f12304a = false;
        } else {
            obj = this.c.apply(this.f12305b, obj);
        }
        this.f12305b = obj;
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
        this.f12304a = true;
        this.f12305b = null;
    }

    @Override // j$.util.function.K0
    public final Object get() {
        return this.f12304a ? C0316j.a() : C0316j.d(this.f12305b);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void l(P1 p12) {
        E1 e12 = (E1) p12;
        if (e12.f12304a) {
            return;
        }
        accept(e12.f12305b);
    }
}
