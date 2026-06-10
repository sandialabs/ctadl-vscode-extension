package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class T implements E3, F3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12382a;

    /* JADX INFO: Access modifiers changed from: protected */
    public T(boolean z10) {
        this.f12382a = z10;
    }

    @Override // j$.util.stream.E3
    public final int P() {
        if (this.f12382a) {
            return 0;
        }
        return V2.f12409r;
    }

    public /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

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

    @Override // j$.util.function.K0
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.E3
    public final Object n0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        abstractC0421w0.w1(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.E3
    public final Object y(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        (this.f12382a ? new U(abstractC0421w0, spliterator, this) : new V(abstractC0421w0, spliterator, abstractC0421w0.x1(this))).invoke();
        return null;
    }
}
