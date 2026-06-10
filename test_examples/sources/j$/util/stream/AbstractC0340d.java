package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0340d extends AbstractC0350f {

    /* renamed from: h  reason: collision with root package name */
    protected final AtomicReference f12451h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f12452i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0340d(AbstractC0340d abstractC0340d, Spliterator spliterator) {
        super(abstractC0340d, spliterator);
        this.f12451h = abstractC0340d.f12451h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0340d(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        super(abstractC0421w0, spliterator);
        this.f12451h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0350f
    public final Object b() {
        if (c() == null) {
            Object obj = this.f12451h.get();
            return obj == null ? i() : obj;
        }
        return super.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        r8 = r7.a();
     */
    @Override // j$.util.stream.AbstractC0350f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f12465b;
        long estimateSize = spliterator.estimateSize();
        long j2 = this.c;
        if (j2 == 0) {
            j2 = AbstractC0350f.f(estimateSize);
            this.c = j2;
        }
        AtomicReference atomicReference = this.f12451h;
        boolean z10 = false;
        AbstractC0340d abstractC0340d = this;
        while (true) {
            obj = atomicReference.get();
            if (obj == null) {
                boolean z11 = abstractC0340d.f12452i;
                if (!z11) {
                    AbstractC0350f c = abstractC0340d.c();
                    while (true) {
                        AbstractC0340d abstractC0340d2 = (AbstractC0340d) c;
                        if (z11 || abstractC0340d2 == null) {
                            break;
                        }
                        z11 = abstractC0340d2.f12452i;
                        c = abstractC0340d2.c();
                    }
                }
                if (!z11) {
                    if (estimateSize <= j2 || (trySplit = spliterator.trySplit()) == null) {
                        break;
                    }
                    AbstractC0340d abstractC0340d3 = (AbstractC0340d) abstractC0340d.d(trySplit);
                    abstractC0340d.f12466d = abstractC0340d3;
                    AbstractC0340d abstractC0340d4 = (AbstractC0340d) abstractC0340d.d(spliterator);
                    abstractC0340d.f12467e = abstractC0340d4;
                    abstractC0340d.setPendingCount(1);
                    if (z10) {
                        spliterator = trySplit;
                        abstractC0340d = abstractC0340d3;
                        abstractC0340d3 = abstractC0340d4;
                    } else {
                        abstractC0340d = abstractC0340d4;
                    }
                    z10 = !z10;
                    abstractC0340d3.fork();
                    estimateSize = spliterator.estimateSize();
                } else {
                    obj = abstractC0340d.i();
                    break;
                }
            } else {
                break;
            }
        }
        abstractC0340d.e(obj);
        abstractC0340d.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final void e(Object obj) {
        if (!(c() == null)) {
            super.e(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f12451h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    protected void g() {
        this.f12452i = true;
    }

    @Override // j$.util.stream.AbstractC0350f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        AbstractC0340d abstractC0340d = this;
        for (AbstractC0340d abstractC0340d2 = (AbstractC0340d) c(); abstractC0340d2 != null; abstractC0340d2 = (AbstractC0340d) abstractC0340d2.c()) {
            if (abstractC0340d2.f12466d == abstractC0340d) {
                AbstractC0340d abstractC0340d3 = (AbstractC0340d) abstractC0340d2.f12467e;
                if (!abstractC0340d3.f12452i) {
                    abstractC0340d3.g();
                }
            }
            abstractC0340d = abstractC0340d2;
        }
    }

    protected abstract Object i();
}
