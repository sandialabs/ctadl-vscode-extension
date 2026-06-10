package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
final class k3 extends X2 implements j$.util.K {
    k3(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        super(abstractC0421w0, spliterator, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        super(abstractC0421w0, c0325a, z10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.n(this, consumer);
    }

    @Override // j$.util.N
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC0278f0 interfaceC0278f0) {
        if (this.f12428h != null || this.f12429i) {
            do {
            } while (tryAdvance(interfaceC0278f0));
            return;
        }
        interfaceC0278f0.getClass();
        h();
        j3 j3Var = new j3(interfaceC0278f0, 1);
        this.f12423b.w1(this.f12424d, j3Var);
        this.f12429i = true;
    }

    @Override // j$.util.N
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        boolean e10 = e();
        if (e10) {
            O2 o22 = (O2) this.f12428h;
            long j2 = this.f12427g;
            int u10 = o22.u(j2);
            interfaceC0278f0.accept((o22.c == 0 && u10 == 0) ? ((long[]) o22.f12371e)[(int) j2] : ((long[][]) o22.f12372f)[u10][(int) (j2 - o22.f12457d[u10])]);
        }
        return e10;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.h(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void i() {
        O2 o22 = new O2();
        this.f12428h = o22;
        this.f12425e = this.f12423b.x1(new j3(o22, 0));
        this.f12426f = new C0325a(6, this);
    }

    @Override // j$.util.stream.X2
    final X2 j(Spliterator spliterator) {
        return new k3(this.f12423b, spliterator, this.f12422a);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.K trySplit() {
        return (j$.util.K) super.trySplit();
    }
}
