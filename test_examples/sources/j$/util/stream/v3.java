package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class v3 extends x3 implements j$.util.H, j$.util.function.K {

    /* renamed from: e  reason: collision with root package name */
    int f12561e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v3(j$.util.H h10, long j2, long j10) {
        super(h10, j2, j10);
    }

    v3(j$.util.H h10, v3 v3Var) {
        super(h10, v3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.function.K
    public final void accept(int i10) {
        this.f12561e = i10;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator s(Spliterator spliterator) {
        return new v3((j$.util.H) spliterator, this);
    }

    @Override // j$.util.stream.x3
    protected final void u(Object obj) {
        ((j$.util.function.K) obj).accept(this.f12561e);
    }

    @Override // j$.util.stream.x3
    protected final AbstractC0334b3 v() {
        return new Z2();
    }
}
