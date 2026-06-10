package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class a0 implements H {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f12100a;

    /* renamed from: b  reason: collision with root package name */
    private int f12101b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12102d;

    public a0(int[] iArr, int i10, int i11, int i12) {
        this.f12100a = iArr;
        this.f12101b = i10;
        this.c = i11;
        this.f12102d = i12 | 64 | 16384;
    }

    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.N
    /* renamed from: c */
    public final void forEachRemaining(j$.util.function.K k3) {
        int i10;
        k3.getClass();
        int[] iArr = this.f12100a;
        int length = iArr.length;
        int i11 = this.c;
        if (length < i11 || (i10 = this.f12101b) < 0) {
            return;
        }
        this.f12101b = i11;
        if (i10 < i11) {
            do {
                k3.accept(iArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f12102d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.f12101b;
    }

    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0261c.j(this, 4)) {
            return null;
        }
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
    /* renamed from: k */
    public final boolean tryAdvance(j$.util.function.K k3) {
        k3.getClass();
        int i10 = this.f12101b;
        if (i10 < 0 || i10 >= this.c) {
            return false;
        }
        this.f12101b = i10 + 1;
        k3.accept(this.f12100a[i10]);
        return true;
    }

    @Override // j$.util.H, j$.util.N, j$.util.Spliterator
    public final H trySplit() {
        int i10 = this.f12101b;
        int i11 = (this.c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f12101b = i11;
        return new a0(this.f12100a, i10, i11, this.f12102d);
    }
}
