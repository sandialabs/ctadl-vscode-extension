package j$.util.stream;

import j$.util.AbstractC0261c;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class P2 implements j$.util.N {

    /* renamed from: a  reason: collision with root package name */
    int f12364a;

    /* renamed from: b  reason: collision with root package name */
    final int f12365b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    final int f12366d;

    /* renamed from: e  reason: collision with root package name */
    Object f12367e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Q2 f12368f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(Q2 q22, int i10, int i11, int i12, int i13) {
        this.f12368f = q22;
        this.f12364a = i10;
        this.f12365b = i11;
        this.c = i12;
        this.f12366d = i13;
        Object[] objArr = q22.f12372f;
        this.f12367e = objArr == null ? q22.f12371e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    abstract void e(int i10, Object obj, Object obj2);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f12364a;
        int i11 = this.f12366d;
        int i12 = this.f12365b;
        if (i10 == i12) {
            return i11 - this.c;
        }
        long[] jArr = this.f12368f.f12457d;
        return ((jArr[i12] + i11) - jArr[i10]) - this.c;
    }

    @Override // j$.util.N
    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        Q2 q22;
        obj.getClass();
        int i10 = this.f12364a;
        int i11 = this.f12366d;
        int i12 = this.f12365b;
        if (i10 < i12 || (i10 == i12 && this.c < i11)) {
            int i13 = this.c;
            while (true) {
                q22 = this.f12368f;
                if (i10 >= i12) {
                    break;
                }
                Object obj2 = q22.f12372f[i10];
                q22.s(obj2, i13, q22.t(obj2), obj);
                i10++;
                i13 = 0;
            }
            q22.s(this.f12364a == i12 ? this.f12367e : q22.f12372f[i12], i13, i11, obj);
            this.f12364a = i12;
            this.c = i11;
        }
    }

    abstract j$.util.N g(Object obj, int i10, int i11);

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0261c.i(this);
    }

    abstract j$.util.N h(int i10, int i11, int i12, int i13);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    @Override // j$.util.N
    /* renamed from: tryAdvance */
    public final boolean p(Object obj) {
        obj.getClass();
        int i10 = this.f12364a;
        int i11 = this.f12365b;
        if (i10 >= i11 && (i10 != i11 || this.c >= this.f12366d)) {
            return false;
        }
        Object obj2 = this.f12367e;
        int i12 = this.c;
        this.c = i12 + 1;
        e(i12, obj2, obj);
        int i13 = this.c;
        Object obj3 = this.f12367e;
        Q2 q22 = this.f12368f;
        if (i13 == q22.t(obj3)) {
            this.c = 0;
            int i14 = this.f12364a + 1;
            this.f12364a = i14;
            Object[] objArr = q22.f12372f;
            if (objArr != null && i14 <= i11) {
                this.f12367e = objArr[i14];
            }
        }
        return true;
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) trySplit();
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final j$.util.N trySplit() {
        int i10 = this.f12364a;
        int i11 = this.f12365b;
        if (i10 < i11) {
            int i12 = this.c;
            Q2 q22 = this.f12368f;
            j$.util.N h10 = h(i10, i11 - 1, i12, q22.t(q22.f12372f[i11 - 1]));
            this.f12364a = i11;
            this.c = 0;
            this.f12367e = q22.f12372f[i11];
            return h10;
        } else if (i10 == i11) {
            int i13 = this.c;
            int i14 = (this.f12366d - i13) / 2;
            if (i14 == 0) {
                return null;
            }
            j$.util.N g10 = g(this.f12367e, i13, i14);
            this.c += i14;
            return g10;
        } else {
            return null;
        }
    }
}
