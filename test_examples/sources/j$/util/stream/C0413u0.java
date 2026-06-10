package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0413u0 implements E3 {

    /* renamed from: a  reason: collision with root package name */
    final EnumC0409t0 f12550a;

    /* renamed from: b  reason: collision with root package name */
    final j$.util.function.K0 f12551b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0413u0(W2 w22, EnumC0409t0 enumC0409t0, C0389o c0389o) {
        this.f12550a = enumC0409t0;
        this.f12551b = c0389o;
    }

    @Override // j$.util.stream.E3
    public final int P() {
        return V2.f12412u | V2.f12409r;
    }

    @Override // j$.util.stream.E3
    public final Object n0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        AbstractC0405s0 abstractC0405s0 = (AbstractC0405s0) this.f12551b.get();
        abstractC0421w0.w1(spliterator, abstractC0405s0);
        return Boolean.valueOf(abstractC0405s0.f12538b);
    }

    @Override // j$.util.stream.E3
    public final Object y(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        return (Boolean) new C0417v0(this, abstractC0421w0, spliterator).invoke();
    }
}
