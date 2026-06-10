package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
final class u3 extends x3 implements j$.util.E, InterfaceC0293n {

    /* renamed from: e  reason: collision with root package name */
    double f12554e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u3(j$.util.E e10, long j2, long j10) {
        super(e10, j2, j10);
    }

    u3(j$.util.E e10, u3 u3Var) {
        super(e10, u3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.l(this, consumer);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.f12554e = d5;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.e(this, consumer);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator s(Spliterator spliterator) {
        return new u3((j$.util.E) spliterator, this);
    }

    @Override // j$.util.stream.x3
    protected final void u(Object obj) {
        ((InterfaceC0293n) obj).accept(this.f12554e);
    }

    @Override // j$.util.stream.x3
    protected final AbstractC0334b3 v() {
        return new Y2();
    }
}
