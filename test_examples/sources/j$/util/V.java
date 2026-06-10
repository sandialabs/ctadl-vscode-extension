package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class V implements E {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f12095a;

    /* renamed from: b  reason: collision with root package name */
    private int f12096b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12097d;

    public V(double[] dArr, int i10, int i11, int i12) {
        this.f12095a = dArr;
        this.f12096b = i10;
        this.c = i11;
        this.f12097d = i12 | 64 | 16384;
    }

    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f12097d;
    }

    @Override // j$.util.N
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC0293n interfaceC0293n) {
        int i10;
        interfaceC0293n.getClass();
        double[] dArr = this.f12095a;
        int length = dArr.length;
        int i11 = this.c;
        if (length < i11 || (i10 = this.f12096b) < 0) {
            return;
        }
        this.f12096b = i11;
        if (i10 < i11) {
            do {
                interfaceC0293n.accept(dArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.f12096b;
    }

    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.e(this, consumer);
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
    /* renamed from: p */
    public final boolean tryAdvance(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        int i10 = this.f12096b;
        if (i10 < 0 || i10 >= this.c) {
            return false;
        }
        this.f12096b = i10 + 1;
        interfaceC0293n.accept(this.f12095a[i10]);
        return true;
    }

    @Override // j$.util.E, j$.util.N, j$.util.Spliterator
    public final E trySplit() {
        int i10 = this.f12096b;
        int i11 = (this.c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f12096b = i11;
        return new V(this.f12095a, i10, i11, this.f12097d);
    }
}
