package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.u;

/* loaded from: classes.dex */
public class t<T extends u & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f15497a;

    public final void a(c.AbstractRunnableC0171c abstractRunnableC0171c) {
        abstractRunnableC0171c.i((c.d) this);
        T[] tArr = this.f15497a;
        if (tArr == null) {
            tArr = (T[]) new u[4];
            this.f15497a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((u[]) copyOf);
            this.f15497a = tArr;
        }
        int i10 = this._size;
        this._size = i10 + 1;
        tArr[i10] = abstractRunnableC0171c;
        abstractRunnableC0171c.f15175j = i10;
        g(i10);
    }

    public final boolean b() {
        return this._size == 0;
    }

    public final T c() {
        T t10;
        synchronized (this) {
            try {
                T[] tArr = this.f15497a;
                if (tArr != null) {
                    t10 = tArr[0];
                } else {
                    t10 = null;
                }
            } finally {
            }
        }
        return t10;
    }

    public final void d(u uVar) {
        synchronized (this) {
            if (uVar.b() != null) {
                e(uVar.getIndex());
            }
        }
    }

    public final T e(int i10) {
        T[] tArr = this.f15497a;
        v7.g.c(tArr);
        this._size--;
        if (i10 < this._size) {
            h(i10, this._size);
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                v7.g.c(t10);
                T t11 = tArr[i11];
                v7.g.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    h(i10, i11);
                    g(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f15497a;
                v7.g.c(tArr2);
                int i13 = i12 + 1;
                if (i13 < this._size) {
                    T t12 = tArr2[i13];
                    v7.g.c(t12);
                    T t13 = tArr2[i12];
                    v7.g.c(t13);
                    if (((Comparable) t12).compareTo(t13) < 0) {
                        i12 = i13;
                    }
                }
                T t14 = tArr2[i10];
                v7.g.c(t14);
                T t15 = tArr2[i12];
                v7.g.c(t15);
                if (((Comparable) t14).compareTo(t15) <= 0) {
                    break;
                }
                h(i10, i12);
                i10 = i12;
            }
        }
        T t16 = tArr[this._size];
        v7.g.c(t16);
        t16.i(null);
        t16.setIndex(-1);
        tArr[this._size] = null;
        return t16;
    }

    public final T f() {
        T t10;
        synchronized (this) {
            if (this._size > 0) {
                t10 = e(0);
            } else {
                t10 = null;
            }
        }
        return t10;
    }

    public final void g(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f15497a;
            v7.g.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            v7.g.c(t10);
            T t11 = tArr[i10];
            v7.g.c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            h(i10, i11);
            i10 = i11;
        }
    }

    public final void h(int i10, int i11) {
        T[] tArr = this.f15497a;
        v7.g.c(tArr);
        T t10 = tArr[i11];
        v7.g.c(t10);
        T t11 = tArr[i10];
        v7.g.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
