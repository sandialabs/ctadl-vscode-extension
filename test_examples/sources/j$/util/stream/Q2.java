package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class Q2 extends AbstractC0345e implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    Object f12371e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f12372f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q2() {
        this.f12371e = newArray(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q2(int i10) {
        super(i10);
        this.f12371e = newArray(1 << this.f12455a);
    }

    public Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void c(int i10, Object obj) {
        long j2 = i10;
        long count = count() + j2;
        if (count > t(obj) || count < j2) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.f12371e, 0, obj, i10, this.f12456b);
            return;
        }
        for (int i11 = 0; i11 < this.c; i11++) {
            Object obj2 = this.f12372f[i11];
            System.arraycopy(obj2, 0, obj, i10, t(obj2));
            i10 += t(this.f12372f[i11]);
        }
        int i12 = this.f12456b;
        if (i12 > 0) {
            System.arraycopy(this.f12371e, 0, obj, i10, i12);
        }
    }

    @Override // j$.util.stream.AbstractC0345e
    public final void clear() {
        Object[] objArr = this.f12372f;
        if (objArr != null) {
            this.f12371e = objArr[0];
            this.f12372f = null;
            this.f12457d = null;
        }
        this.f12456b = 0;
        this.c = 0;
    }

    public void d(Object obj) {
        for (int i10 = 0; i10 < this.c; i10++) {
            Object obj2 = this.f12372f[i10];
            s(obj2, 0, t(obj2), obj);
        }
        s(this.f12371e, 0, this.f12456b, obj);
    }

    public abstract Object newArray(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void s(Object obj, int i10, int i11, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int t(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int u(long j2) {
        if (this.c == 0) {
            if (j2 < this.f12456b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        } else if (j2 < count()) {
            for (int i10 = 0; i10 <= this.c; i10++) {
                if (j2 < this.f12457d[i10] + t(this.f12372f[i10])) {
                    return i10;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(long j2) {
        long t10;
        int i10;
        int i11 = this.c;
        if (i11 == 0) {
            t10 = t(this.f12371e);
        } else {
            t10 = t(this.f12372f[i11]) + this.f12457d[i11];
        }
        if (j2 <= t10) {
            return;
        }
        if (this.f12372f == null) {
            Object[] w10 = w();
            this.f12372f = w10;
            this.f12457d = new long[8];
            w10[0] = this.f12371e;
        }
        int i12 = this.c;
        while (true) {
            i12++;
            if (j2 <= t10) {
                return;
            }
            Object[] objArr = this.f12372f;
            if (i12 >= objArr.length) {
                int length = objArr.length * 2;
                this.f12372f = Arrays.copyOf(objArr, length);
                this.f12457d = Arrays.copyOf(this.f12457d, length);
            }
            int i13 = this.f12455a;
            if (i12 != 0 && i12 != 1) {
                i13 = Math.min((i13 + i12) - 1, 30);
            }
            int i14 = 1 << i13;
            this.f12372f[i12] = newArray(i14);
            long[] jArr = this.f12457d;
            jArr[i12] = jArr[i12 - 1] + t(this.f12372f[i10]);
            t10 += i14;
        }
    }

    protected abstract Object[] w();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        long t10;
        if (this.f12456b == t(this.f12371e)) {
            if (this.f12372f == null) {
                Object[] w10 = w();
                this.f12372f = w10;
                this.f12457d = new long[8];
                w10[0] = this.f12371e;
            }
            int i10 = this.c;
            int i11 = i10 + 1;
            Object[] objArr = this.f12372f;
            if (i11 >= objArr.length || objArr[i11] == null) {
                if (i10 == 0) {
                    t10 = t(this.f12371e);
                } else {
                    t10 = t(objArr[i10]) + this.f12457d[i10];
                }
                v(t10 + 1);
            }
            this.f12456b = 0;
            int i12 = this.c + 1;
            this.c = i12;
            this.f12371e = this.f12372f[i12];
        }
    }
}
