package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class U implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f12092a;

    /* renamed from: b  reason: collision with root package name */
    private int f12093b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12094d;

    public U(Object[] objArr, int i10, int i11, int i12) {
        this.f12092a = objArr;
        this.f12093b = i10;
        this.c = i11;
        this.f12094d = i12 | 64 | 16384;
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f12093b;
        if (i10 < 0 || i10 >= this.c) {
            return false;
        }
        this.f12093b = i10 + 1;
        consumer.accept(this.f12092a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f12094d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.f12093b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        Object[] objArr = this.f12092a;
        int length = objArr.length;
        int i11 = this.c;
        if (length < i11 || (i10 = this.f12093b) < 0) {
            return;
        }
        this.f12093b = i11;
        if (i10 < i11) {
            do {
                consumer.accept(objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
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

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f12093b;
        int i11 = (this.c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f12093b = i11;
        return new U(this.f12092a, i10, i11, this.f12094d);
    }
}
