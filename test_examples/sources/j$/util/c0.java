package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class c0 implements K {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f12109a;

    /* renamed from: b  reason: collision with root package name */
    private int f12110b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12111d;

    public c0(long[] jArr, int i10, int i11, int i12) {
        this.f12109a = jArr;
        this.f12110b = i10;
        this.c = i11;
        this.f12111d = i12 | 64 | 16384;
    }

    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.n(this, consumer);
    }

    @Override // j$.util.N
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC0278f0 interfaceC0278f0) {
        int i10;
        interfaceC0278f0.getClass();
        long[] jArr = this.f12109a;
        int length = jArr.length;
        int i11 = this.c;
        if (length < i11 || (i10 = this.f12110b) < 0) {
            return;
        }
        this.f12110b = i11;
        if (i10 < i11) {
            do {
                interfaceC0278f0.accept(jArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f12111d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.f12110b;
    }

    @Override // j$.util.N
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        int i10 = this.f12110b;
        if (i10 < 0 || i10 >= this.c) {
            return false;
        }
        this.f12110b = i10 + 1;
        interfaceC0278f0.accept(this.f12109a[i10]);
        return true;
    }

    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.h(this, consumer);
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

    @Override // j$.util.K, j$.util.N, j$.util.Spliterator
    public final K trySplit() {
        int i10 = this.f12110b;
        int i11 = (this.c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f12110b = i11;
        return new c0(this.f12109a, i10, i11, this.f12111d);
    }
}
