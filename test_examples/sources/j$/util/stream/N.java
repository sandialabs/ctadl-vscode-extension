package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class N extends AbstractC0340d {

    /* renamed from: j  reason: collision with root package name */
    private final H f12356j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(H h10, AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        super(abstractC0421w0, spliterator);
        this.f12356j = h10;
    }

    N(N n, Spliterator spliterator) {
        super(n, spliterator);
        this.f12356j = n.f12356j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final Object a() {
        boolean z10;
        AbstractC0421w0 abstractC0421w0 = this.f12464a;
        F3 f32 = (F3) this.f12356j.f12319d.get();
        abstractC0421w0.w1(this.f12465b, f32);
        Object obj = f32.get();
        if (!this.f12356j.f12317a) {
            if (obj != null) {
                AtomicReference atomicReference = this.f12451h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj != null) {
            N n = this;
            while (true) {
                if (n != null) {
                    AbstractC0350f c = n.c();
                    if (c != null && c.f12466d != n) {
                        z10 = false;
                        break;
                    }
                    n = c;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                AtomicReference atomicReference2 = this.f12451h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            } else {
                h();
            }
            return obj;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final AbstractC0350f d(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0340d
    protected final Object i() {
        return this.f12356j.f12318b;
    }

    @Override // j$.util.stream.AbstractC0350f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z10;
        if (this.f12356j.f12317a) {
            N n = (N) this.f12466d;
            N n10 = null;
            while (true) {
                if (n == n10) {
                    break;
                }
                Object b5 = n.b();
                if (b5 == null || !this.f12356j.c.test(b5)) {
                    n10 = n;
                    n = (N) this.f12467e;
                } else {
                    e(b5);
                    N n11 = this;
                    while (true) {
                        if (n11 != null) {
                            AbstractC0350f c = n11.c();
                            if (c != null && c.f12466d != n11) {
                                z10 = false;
                                break;
                            }
                            n11 = c;
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        AtomicReference atomicReference = this.f12451h;
                        while (!atomicReference.compareAndSet(null, b5) && atomicReference.get() == null) {
                        }
                    } else {
                        h();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
