package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a0 extends c<Long> implements RandomAccess, r0 {

    /* renamed from: j  reason: collision with root package name */
    public long[] f4840j;

    /* renamed from: k  reason: collision with root package name */
    public int f4841k;

    static {
        new a0(new long[0], 0).f4845i = false;
    }

    public a0() {
        this(new long[10], 0);
    }

    public a0(long[] jArr, int i10) {
        this.f4840j = jArr;
        this.f4841k = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f4841k)) {
            StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
            o10.append(this.f4841k);
            throw new IndexOutOfBoundsException(o10.toString());
        }
        long[] jArr = this.f4840j;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f4840j, i10, jArr2, i10 + 1, this.f4841k - i10);
            this.f4840j = jArr2;
        }
        this.f4840j[i10] = longValue;
        this.f4841k++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        Charset charset = u.f4942a;
        collection.getClass();
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i10 = a0Var.f4841k;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4841k;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f4840j;
            if (i12 > jArr.length) {
                this.f4840j = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(a0Var.f4840j, 0, this.f4840j, this.f4841k, a0Var.f4841k);
            this.f4841k = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(long j2) {
        c();
        int i10 = this.f4841k;
        long[] jArr = this.f4840j;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f4840j = jArr2;
        }
        long[] jArr3 = this.f4840j;
        int i11 = this.f4841k;
        this.f4841k = i11 + 1;
        jArr3[i11] = j2;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f4841k != a0Var.f4841k) {
                return false;
            }
            long[] jArr = a0Var.f4840j;
            for (int i10 = 0; i10 < this.f4841k; i10++) {
                if (this.f4840j[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(int i10) {
        if (i10 >= 0 && i10 < this.f4841k) {
            return;
        }
        StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
        o10.append(this.f4841k);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f4840j[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4841k; i11++) {
            i10 = (i10 * 31) + u.b(this.f4840j[i11]);
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.u.c
    public final u.c k(int i10) {
        if (i10 >= this.f4841k) {
            return new a0(Arrays.copyOf(this.f4840j, i10), this.f4841k);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        g(i10);
        long[] jArr = this.f4840j;
        long j2 = jArr[i10];
        if (i10 < this.f4841k - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f4841k--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f4841k; i10++) {
            if (obj.equals(Long.valueOf(this.f4840j[i10]))) {
                long[] jArr = this.f4840j;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f4841k - i10) - 1);
                this.f4841k--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4840j;
        System.arraycopy(jArr, i11, jArr, i10, this.f4841k - i11);
        this.f4841k -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        g(i10);
        long[] jArr = this.f4840j;
        long j2 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4841k;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
