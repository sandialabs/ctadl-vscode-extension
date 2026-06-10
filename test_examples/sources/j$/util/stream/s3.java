package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s3 extends t3 implements Spliterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s3(Spliterator spliterator, long j2, long j10) {
        super(spliterator, j2, j10, 0L, Math.min(spliterator.estimateSize(), j10));
    }

    private s3(Spliterator spliterator, long j2, long j10, long j11, long j12) {
        super(spliterator, j2, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        long j2;
        consumer.getClass();
        long j10 = this.f12548e;
        long j11 = this.f12545a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j2 = this.f12547d;
            if (j11 <= j2) {
                break;
            }
            this.c.a(new S1(7));
            this.f12547d++;
        }
        if (j2 >= this.f12548e) {
            return false;
        }
        this.f12547d = j2 + 1;
        return this.c.a(consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator e(Spliterator spliterator, long j2, long j10, long j11, long j12) {
        return new s3(spliterator, j2, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j2 = this.f12548e;
        long j10 = this.f12545a;
        if (j10 >= j2) {
            return;
        }
        long j11 = this.f12547d;
        if (j11 >= j2) {
            return;
        }
        if (j11 >= j10 && this.c.estimateSize() + j11 <= this.f12546b) {
            this.c.forEachRemaining(consumer);
            this.f12547d = this.f12548e;
            return;
        }
        while (j10 > this.f12547d) {
            this.c.a(new S1(6));
            this.f12547d++;
        }
        while (this.f12547d < this.f12548e) {
            this.c.a(consumer);
            this.f12547d++;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0261c.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }
}
