package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0277f;

/* loaded from: classes2.dex */
final class G1 extends Q1 implements P1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.K0 f12314b;
    final /* synthetic */ BiConsumer c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0277f f12315d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(j$.util.function.K0 k02, BiConsumer biConsumer, InterfaceC0277f interfaceC0277f) {
        this.f12314b = k02;
        this.c = biConsumer;
        this.f12315d = interfaceC0277f;
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
        this.c.accept(this.f12370a, obj);
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
        this.f12370a = this.f12314b.get();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void l(P1 p12) {
        this.f12370a = this.f12315d.apply(this.f12370a, ((G1) p12).f12370a);
    }
}
