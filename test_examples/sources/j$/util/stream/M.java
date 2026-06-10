package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class M implements F3 {

    /* renamed from: a  reason: collision with root package name */
    boolean f12349a;

    /* renamed from: b  reason: collision with root package name */
    Object f12350b;

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        if (this.f12349a) {
            return;
        }
        this.f12349a = true;
        this.f12350b = obj;
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
    public final /* synthetic */ void g(long j2) {
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final boolean i() {
        return this.f12349a;
    }
}
