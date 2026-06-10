package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0350f extends CountedCompleter {

    /* renamed from: g  reason: collision with root package name */
    static final int f12463g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC0421w0 f12464a;

    /* renamed from: b  reason: collision with root package name */
    protected Spliterator f12465b;
    protected long c;

    /* renamed from: d  reason: collision with root package name */
    protected AbstractC0350f f12466d;

    /* renamed from: e  reason: collision with root package name */
    protected AbstractC0350f f12467e;

    /* renamed from: f  reason: collision with root package name */
    private Object f12468f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0350f(AbstractC0350f abstractC0350f, Spliterator spliterator) {
        super(abstractC0350f);
        this.f12465b = spliterator;
        this.f12464a = abstractC0350f.f12464a;
        this.c = abstractC0350f.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0350f(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        super(null);
        this.f12464a = abstractC0421w0;
        this.f12465b = spliterator;
        this.c = 0L;
    }

    public static long f(long j2) {
        long j10 = j2 / f12463g;
        if (j10 > 0) {
            return j10;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b() {
        return this.f12468f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC0350f c() {
        return (AbstractC0350f) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f12465b;
        long estimateSize = spliterator.estimateSize();
        long j2 = this.c;
        if (j2 == 0) {
            j2 = f(estimateSize);
            this.c = j2;
        }
        boolean z10 = false;
        AbstractC0350f abstractC0350f = this;
        while (estimateSize > j2 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC0350f d5 = abstractC0350f.d(trySplit);
            abstractC0350f.f12466d = d5;
            AbstractC0350f d10 = abstractC0350f.d(spliterator);
            abstractC0350f.f12467e = d10;
            abstractC0350f.setPendingCount(1);
            if (z10) {
                spliterator = trySplit;
                abstractC0350f = d5;
                d5 = d10;
            } else {
                abstractC0350f = d10;
            }
            z10 = !z10;
            d5.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC0350f.e(abstractC0350f.a());
        abstractC0350f.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC0350f d(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(Object obj) {
        this.f12468f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f12468f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f12465b = null;
        this.f12467e = null;
        this.f12466d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
