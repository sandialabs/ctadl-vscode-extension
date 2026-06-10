package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class i3 extends X2 implements j$.util.H {
    i3(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        super(abstractC0421w0, spliterator, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i3(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        super(abstractC0421w0, c0325a, z10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.N
    /* renamed from: c */
    public final void forEachRemaining(j$.util.function.K k3) {
        if (this.f12428h != null || this.f12429i) {
            do {
            } while (tryAdvance(k3));
            return;
        }
        k3.getClass();
        h();
        C0364h3 c0364h3 = new C0364h3(k3, 1);
        this.f12423b.w1(this.f12424d, c0364h3);
        this.f12429i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void i() {
        M2 m22 = new M2();
        this.f12428h = m22;
        this.f12425e = this.f12423b.x1(new C0364h3(m22, 0));
        this.f12426f = new C0325a(5, this);
    }

    @Override // j$.util.stream.X2
    final X2 j(Spliterator spliterator) {
        return new i3(this.f12423b, spliterator, this.f12422a);
    }

    @Override // j$.util.N
    /* renamed from: k */
    public final boolean tryAdvance(j$.util.function.K k3) {
        k3.getClass();
        boolean e10 = e();
        if (e10) {
            M2 m22 = (M2) this.f12428h;
            long j2 = this.f12427g;
            int u10 = m22.u(j2);
            k3.accept((m22.c == 0 && u10 == 0) ? ((int[]) m22.f12371e)[(int) j2] : ((int[][]) m22.f12372f)[u10][(int) (j2 - m22.f12457d[u10])]);
        }
        return e10;
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.H trySplit() {
        return (j$.util.H) super.trySplit();
    }
}
