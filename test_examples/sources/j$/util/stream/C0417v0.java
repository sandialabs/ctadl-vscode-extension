package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0417v0 extends AbstractC0340d {

    /* renamed from: j  reason: collision with root package name */
    private final C0413u0 f12557j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0417v0(C0413u0 c0413u0, AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        super(abstractC0421w0, spliterator);
        this.f12557j = c0413u0;
    }

    C0417v0(C0417v0 c0417v0, Spliterator spliterator) {
        super(c0417v0, spliterator);
        this.f12557j = c0417v0.f12557j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final Object a() {
        boolean z10;
        Boolean valueOf;
        AbstractC0421w0 abstractC0421w0 = this.f12464a;
        AbstractC0405s0 abstractC0405s0 = (AbstractC0405s0) this.f12557j.f12551b.get();
        abstractC0421w0.w1(this.f12465b, abstractC0405s0);
        boolean z11 = abstractC0405s0.f12538b;
        z10 = this.f12557j.f12550a.f12543b;
        if (z11 == z10 && (valueOf = Boolean.valueOf(z11)) != null) {
            AtomicReference atomicReference = this.f12451h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final AbstractC0350f d(Spliterator spliterator) {
        return new C0417v0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0340d
    protected final Object i() {
        boolean z10;
        z10 = this.f12557j.f12550a.f12543b;
        return Boolean.valueOf(!z10);
    }
}
