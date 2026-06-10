package j$.util.stream;

import j$.util.AbstractC0261c;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class r3 extends t3 implements j$.util.N {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r3(j$.util.N n, long j2, long j10) {
        super(n, j2, j10, 0L, Math.min(n.estimateSize(), j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r3(j$.util.N n, long j2, long j10, long j11, long j12) {
        super(n, j2, j10, j11, j12);
    }

    @Override // j$.util.N
    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        obj.getClass();
        long j2 = this.f12548e;
        long j10 = this.f12545a;
        if (j10 >= j2) {
            return;
        }
        long j11 = this.f12547d;
        if (j11 >= j2) {
            return;
        }
        if (j11 >= j10 && ((j$.util.N) this.c).estimateSize() + j11 <= this.f12546b) {
            ((j$.util.N) this.c).forEachRemaining(obj);
            this.f12547d = this.f12548e;
            return;
        }
        while (j10 > this.f12547d) {
            ((j$.util.N) this.c).tryAdvance(g());
            this.f12547d++;
        }
        while (this.f12547d < this.f12548e) {
            ((j$.util.N) this.c).tryAdvance(obj);
            this.f12547d++;
        }
    }

    protected abstract Object g();

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

    @Override // j$.util.N
    /* renamed from: tryAdvance */
    public final boolean p(Object obj) {
        long j2;
        obj.getClass();
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
            ((j$.util.N) this.c).tryAdvance(g());
            this.f12547d++;
        }
        if (j2 >= this.f12548e) {
            return false;
        }
        this.f12547d = j2 + 1;
        return ((j$.util.N) this.c).tryAdvance(obj);
    }
}
