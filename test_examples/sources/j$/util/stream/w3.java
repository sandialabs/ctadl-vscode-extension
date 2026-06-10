package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
final class w3 extends x3 implements j$.util.K, InterfaceC0278f0 {

    /* renamed from: e  reason: collision with root package name */
    long f12574e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w3(j$.util.K k3, long j2, long j10) {
        super(k3, j2, j10);
    }

    w3(j$.util.K k3, w3 w3Var) {
        super(k3, w3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.n(this, consumer);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final void accept(long j2) {
        this.f12574e = j2;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.h(this, consumer);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator s(Spliterator spliterator) {
        return new w3((j$.util.K) spliterator, this);
    }

    @Override // j$.util.stream.x3
    protected final void u(Object obj) {
        ((InterfaceC0278f0) obj).accept(this.f12574e);
    }

    @Override // j$.util.stream.x3
    protected final AbstractC0334b3 v() {
        return new C0329a3();
    }
}
