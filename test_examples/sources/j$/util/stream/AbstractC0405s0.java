package j$.util.stream;

import j$.util.function.Consumer;

/* renamed from: j$.util.stream.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0405s0 implements InterfaceC0363h2 {

    /* renamed from: a  reason: collision with root package name */
    boolean f12537a;

    /* renamed from: b  reason: collision with root package name */
    boolean f12538b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0405s0(EnumC0409t0 enumC0409t0) {
        boolean z10;
        z10 = enumC0409t0.f12543b;
        this.f12538b = !z10;
    }

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
        return this.f12537a;
    }
}
