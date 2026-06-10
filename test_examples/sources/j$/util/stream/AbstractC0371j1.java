package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.j1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0371j1 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    F0 f12480a;

    /* renamed from: b  reason: collision with root package name */
    int f12481b;
    Spliterator c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f12482d;

    /* renamed from: e  reason: collision with root package name */
    ArrayDeque f12483e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0371j1(F0 f02) {
        this.f12480a = f02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static F0 e(ArrayDeque arrayDeque) {
        while (true) {
            F0 f02 = (F0) arrayDeque.pollFirst();
            if (f02 == null) {
                return null;
            }
            if (f02.k() != 0) {
                int k3 = f02.k();
                while (true) {
                    k3--;
                    if (k3 >= 0) {
                        arrayDeque.addFirst(f02.a(k3));
                    }
                }
            } else if (f02.count() > 0) {
                return f02;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j2 = 0;
        if (this.f12480a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f12481b; i10 < this.f12480a.k(); i10++) {
            j2 += this.f12480a.a(i10).count();
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque g() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int k3 = this.f12480a.k();
        while (true) {
            k3--;
            if (k3 < this.f12481b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f12480a.a(k3));
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h() {
        if (this.f12480a == null) {
            return false;
        }
        if (this.f12482d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque g10 = g();
                this.f12483e = g10;
                F0 e10 = e(g10);
                if (e10 == null) {
                    this.f12480a = null;
                    return false;
                }
                spliterator = e10.spliterator();
            }
            this.f12482d = spliterator;
            return true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        F0 f02 = this.f12480a;
        if (f02 != null && this.f12482d == null) {
            Spliterator spliterator = this.c;
            if (spliterator != null) {
                return spliterator.trySplit();
            }
            if (this.f12481b < f02.k() - 1) {
                F0 f03 = this.f12480a;
                int i10 = this.f12481b;
                this.f12481b = i10 + 1;
                return f03.a(i10).spliterator();
            }
            F0 a10 = this.f12480a.a(this.f12481b);
            this.f12480a = a10;
            if (a10.k() == 0) {
                Spliterator spliterator2 = this.f12480a.spliterator();
                this.c = spliterator2;
                return spliterator2.trySplit();
            }
            F0 f04 = this.f12480a;
            this.f12481b = 0 + 1;
            return f04.a(0).spliterator();
        }
        return null;
    }
}
