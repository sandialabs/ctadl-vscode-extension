package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
abstract class A3 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f12287a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f12288b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f12289d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A3(Spliterator spliterator, long j2, long j10) {
        this.f12287a = spliterator;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        this.f12288b = i10 < 0;
        this.c = i10 >= 0 ? j10 : 0L;
        this.f12289d = new AtomicLong(i10 >= 0 ? j2 + j10 : j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A3(Spliterator spliterator, A3 a32) {
        this.f12287a = spliterator;
        this.f12288b = a32.f12288b;
        this.f12289d = a32.f12289d;
        this.c = a32.c;
    }

    public final int characteristics() {
        return this.f12287a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f12287a.estimateSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long r(long j2) {
        AtomicLong atomicLong;
        long j10;
        boolean z10;
        long min;
        do {
            atomicLong = this.f12289d;
            j10 = atomicLong.get();
            z10 = this.f12288b;
            if (j10 != 0) {
                min = Math.min(j10, j2);
                if (min <= 0) {
                    break;
                }
            } else if (z10) {
                return j2;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j10, j10 - min));
        if (z10) {
            return Math.max(j2 - min, 0L);
        }
        long j11 = this.c;
        return j10 > j11 ? Math.max(min - (j10 - j11), 0L) : min;
    }

    protected abstract Spliterator s(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public final z3 t() {
        return this.f12289d.get() > 0 ? z3.MAYBE_MORE : this.f12288b ? z3.UNLIMITED : z3.NO_MORE;
    }

    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) m3trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m0trySplit() {
        return (j$.util.H) m3trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m1trySplit() {
        return (j$.util.K) m3trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m2trySplit() {
        return (j$.util.N) m3trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final Spliterator m3trySplit() {
        Spliterator trySplit;
        if (this.f12289d.get() != 0 && (trySplit = this.f12287a.trySplit()) != null) {
            return s(trySplit);
        }
        return null;
    }
}
