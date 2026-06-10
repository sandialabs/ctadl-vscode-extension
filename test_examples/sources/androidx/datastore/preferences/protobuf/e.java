package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e extends c<Boolean> implements RandomAccess, r0 {

    /* renamed from: j  reason: collision with root package name */
    public boolean[] f4858j;

    /* renamed from: k  reason: collision with root package name */
    public int f4859k;

    static {
        new e(new boolean[0], 0).f4845i = false;
    }

    public e() {
        this(new boolean[10], 0);
    }

    public e(boolean[] zArr, int i10) {
        this.f4858j = zArr;
        this.f4859k = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f4859k)) {
            StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
            o10.append(this.f4859k);
            throw new IndexOutOfBoundsException(o10.toString());
        }
        boolean[] zArr = this.f4858j;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f4858j, i10, zArr2, i10 + 1, this.f4859k - i10);
            this.f4858j = zArr2;
        }
        this.f4858j[i10] = booleanValue;
        this.f4859k++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        Charset charset = u.f4942a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i10 = eVar.f4859k;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4859k;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f4858j;
            if (i12 > zArr.length) {
                this.f4858j = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(eVar.f4858j, 0, this.f4858j, this.f4859k, eVar.f4859k);
            this.f4859k = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(boolean z10) {
        c();
        int i10 = this.f4859k;
        boolean[] zArr = this.f4858j;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f4858j = zArr2;
        }
        boolean[] zArr3 = this.f4858j;
        int i11 = this.f4859k;
        this.f4859k = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f4859k != eVar.f4859k) {
                return false;
            }
            boolean[] zArr = eVar.f4858j;
            for (int i10 = 0; i10 < this.f4859k; i10++) {
                if (this.f4858j[i10] != zArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(int i10) {
        if (i10 >= 0 && i10 < this.f4859k) {
            return;
        }
        StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
        o10.append(this.f4859k);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f4858j[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4859k; i11++) {
            i10 = (i10 * 31) + u.a(this.f4858j[i11]);
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.u.c
    public final u.c k(int i10) {
        if (i10 >= this.f4859k) {
            return new e(Arrays.copyOf(this.f4858j, i10), this.f4859k);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        g(i10);
        boolean[] zArr = this.f4858j;
        boolean z10 = zArr[i10];
        if (i10 < this.f4859k - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f4859k--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f4859k; i10++) {
            if (obj.equals(Boolean.valueOf(this.f4858j[i10]))) {
                boolean[] zArr = this.f4858j;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f4859k - i10) - 1);
                this.f4859k--;
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
        boolean[] zArr = this.f4858j;
        System.arraycopy(zArr, i11, zArr, i10, this.f4859k - i11);
        this.f4859k -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        g(i10);
        boolean[] zArr = this.f4858j;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4859k;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
