package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t extends c<Integer> implements RandomAccess, r0 {

    /* renamed from: j  reason: collision with root package name */
    public int[] f4937j;

    /* renamed from: k  reason: collision with root package name */
    public int f4938k;

    static {
        new t(new int[0], 0).f4845i = false;
    }

    public t() {
        this(new int[10], 0);
    }

    public t(int[] iArr, int i10) {
        this.f4937j = iArr;
        this.f4938k = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f4938k)) {
            StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
            o10.append(this.f4938k);
            throw new IndexOutOfBoundsException(o10.toString());
        }
        int[] iArr = this.f4937j;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f4937j, i10, iArr2, i10 + 1, this.f4938k - i10);
            this.f4937j = iArr2;
        }
        this.f4937j[i10] = intValue;
        this.f4938k++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        Charset charset = u.f4942a;
        collection.getClass();
        if (!(collection instanceof t)) {
            return super.addAll(collection);
        }
        t tVar = (t) collection;
        int i10 = tVar.f4938k;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4938k;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f4937j;
            if (i12 > iArr.length) {
                this.f4937j = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(tVar.f4937j, 0, this.f4937j, this.f4938k, tVar.f4938k);
            this.f4938k = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(int i10) {
        c();
        int i11 = this.f4938k;
        int[] iArr = this.f4937j;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f4937j = iArr2;
        }
        int[] iArr3 = this.f4937j;
        int i12 = this.f4938k;
        this.f4938k = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f4938k != tVar.f4938k) {
                return false;
            }
            int[] iArr = tVar.f4937j;
            for (int i10 = 0; i10 < this.f4938k; i10++) {
                if (this.f4937j[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(int i10) {
        if (i10 >= 0 && i10 < this.f4938k) {
            return;
        }
        StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
        o10.append(this.f4938k);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Integer.valueOf(this.f4937j[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4938k; i11++) {
            i10 = (i10 * 31) + this.f4937j[i11];
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.u.c
    public final u.c k(int i10) {
        if (i10 >= this.f4938k) {
            return new t(Arrays.copyOf(this.f4937j, i10), this.f4938k);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        g(i10);
        int[] iArr = this.f4937j;
        int i12 = iArr[i10];
        if (i10 < this.f4938k - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f4938k--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f4938k; i10++) {
            if (obj.equals(Integer.valueOf(this.f4937j[i10]))) {
                int[] iArr = this.f4937j;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f4938k - i10) - 1);
                this.f4938k--;
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
        int[] iArr = this.f4937j;
        System.arraycopy(iArr, i11, iArr, i10, this.f4938k - i11);
        this.f4938k -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        g(i10);
        int[] iArr = this.f4937j;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4938k;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
