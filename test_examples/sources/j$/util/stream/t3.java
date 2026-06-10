package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
abstract class t3 {

    /* renamed from: a  reason: collision with root package name */
    final long f12545a;

    /* renamed from: b  reason: collision with root package name */
    final long f12546b;
    Spliterator c;

    /* renamed from: d  reason: collision with root package name */
    long f12547d;

    /* renamed from: e  reason: collision with root package name */
    long f12548e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t3(Spliterator spliterator, long j2, long j10, long j11, long j12) {
        this.c = spliterator;
        this.f12545a = j2;
        this.f12546b = j10;
        this.f12547d = j11;
        this.f12548e = j12;
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    protected abstract Spliterator e(Spliterator spliterator, long j2, long j10, long j11, long j12);

    public final long estimateSize() {
        long j2 = this.f12548e;
        long j10 = this.f12545a;
        if (j10 < j2) {
            return j2 - Math.max(j10, this.f12547d);
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) m7trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m4trySplit() {
        return (j$.util.H) m7trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m5trySplit() {
        return (j$.util.K) m7trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m6trySplit() {
        return (j$.util.N) m7trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final Spliterator m7trySplit() {
        long j2 = this.f12548e;
        if (this.f12545a >= j2 || this.f12547d >= j2) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f12547d;
            long min = Math.min(estimateSize, this.f12546b);
            long j10 = this.f12545a;
            if (j10 >= min) {
                this.f12547d = min;
            } else {
                long j11 = this.f12546b;
                if (min < j11) {
                    long j12 = this.f12547d;
                    if (j12 < j10 || estimateSize > j11) {
                        this.f12547d = min;
                        return e(trySplit, j10, j11, j12, min);
                    }
                    this.f12547d = min;
                    return trySplit;
                }
                this.c = trySplit;
                this.f12548e = min;
            }
        }
    }
}
