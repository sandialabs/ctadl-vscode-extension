package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* renamed from: j$.util.stream.g3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0359g3 extends X2 implements j$.util.E {
    C0359g3(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        super(abstractC0421w0, spliterator, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0359g3(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        super(abstractC0421w0, c0325a, z10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.l(this, consumer);
    }

    @Override // j$.util.N
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC0293n interfaceC0293n) {
        if (this.f12428h != null || this.f12429i) {
            do {
            } while (tryAdvance(interfaceC0293n));
            return;
        }
        interfaceC0293n.getClass();
        h();
        C0354f3 c0354f3 = new C0354f3(interfaceC0293n, 1);
        this.f12423b.w1(this.f12424d, c0354f3);
        this.f12429i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.e(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void i() {
        K2 k22 = new K2();
        this.f12428h = k22;
        this.f12425e = this.f12423b.x1(new C0354f3(k22, 0));
        this.f12426f = new C0325a(4, this);
    }

    @Override // j$.util.stream.X2
    final X2 j(Spliterator spliterator) {
        return new C0359g3(this.f12423b, spliterator, this.f12422a);
    }

    @Override // j$.util.N
    /* renamed from: p */
    public final boolean tryAdvance(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        boolean e10 = e();
        if (e10) {
            K2 k22 = (K2) this.f12428h;
            long j2 = this.f12427g;
            int u10 = k22.u(j2);
            interfaceC0293n.accept((k22.c == 0 && u10 == 0) ? ((double[]) k22.f12371e)[(int) j2] : ((double[][]) k22.f12372f)[u10][(int) (j2 - k22.f12457d[u10])]);
        }
        return e10;
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.E trySplit() {
        return (j$.util.E) super.trySplit();
    }
}
