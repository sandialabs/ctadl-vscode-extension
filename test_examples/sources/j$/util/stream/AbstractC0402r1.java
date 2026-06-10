package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0402r1 extends CountedCompleter implements InterfaceC0363h2 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f12524a;

    /* renamed from: b  reason: collision with root package name */
    protected final AbstractC0421w0 f12525b;
    protected final long c;

    /* renamed from: d  reason: collision with root package name */
    protected long f12526d;

    /* renamed from: e  reason: collision with root package name */
    protected long f12527e;

    /* renamed from: f  reason: collision with root package name */
    protected int f12528f;

    /* renamed from: g  reason: collision with root package name */
    protected int f12529g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0402r1(int i10, Spliterator spliterator, AbstractC0421w0 abstractC0421w0) {
        this.f12524a = spliterator;
        this.f12525b = abstractC0421w0;
        this.c = AbstractC0350f.f(spliterator.estimateSize());
        this.f12526d = 0L;
        this.f12527e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0402r1(AbstractC0402r1 abstractC0402r1, Spliterator spliterator, long j2, long j10, int i10) {
        super(abstractC0402r1);
        this.f12524a = spliterator;
        this.f12525b = abstractC0402r1.f12525b;
        this.c = abstractC0402r1.c;
        this.f12526d = j2;
        this.f12527e = j10;
        if (j2 < 0 || j10 < 0 || (j2 + j10) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j2), Long.valueOf(j2), Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    abstract AbstractC0402r1 a(Spliterator spliterator, long j2, long j10);

    public /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

    public /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f12524a;
        AbstractC0402r1 abstractC0402r1 = this;
        while (spliterator.estimateSize() > abstractC0402r1.c && (trySplit = spliterator.trySplit()) != null) {
            abstractC0402r1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC0402r1.a(trySplit, abstractC0402r1.f12526d, estimateSize).fork();
            abstractC0402r1 = abstractC0402r1.a(spliterator, abstractC0402r1.f12526d + estimateSize, abstractC0402r1.f12527e - estimateSize);
        }
        abstractC0402r1.f12525b.w1(spliterator, abstractC0402r1);
        abstractC0402r1.propagateCompletion();
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        long j10 = this.f12527e;
        if (j2 > j10) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i10 = (int) this.f12526d;
        this.f12528f = i10;
        this.f12529g = i10 + ((int) j10);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }
}
