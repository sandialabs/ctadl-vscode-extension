package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class j extends c<Double> implements RandomAccess, r0 {

    /* renamed from: j  reason: collision with root package name */
    public double[] f4898j;

    /* renamed from: k  reason: collision with root package name */
    public int f4899k;

    static {
        new j(0, new double[0]).f4845i = false;
    }

    public j() {
        this(0, new double[10]);
    }

    public j(int i10, double[] dArr) {
        this.f4898j = dArr;
        this.f4899k = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f4899k)) {
            StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
            o10.append(this.f4899k);
            throw new IndexOutOfBoundsException(o10.toString());
        }
        double[] dArr = this.f4898j;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f4898j, i10, dArr2, i10 + 1, this.f4899k - i10);
            this.f4898j = dArr2;
        }
        this.f4898j[i10] = doubleValue;
        this.f4899k++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        Charset charset = u.f4942a;
        collection.getClass();
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i10 = jVar.f4899k;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4899k;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f4898j;
            if (i12 > dArr.length) {
                this.f4898j = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(jVar.f4898j, 0, this.f4898j, this.f4899k, jVar.f4899k);
            this.f4899k = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(double d5) {
        c();
        int i10 = this.f4899k;
        double[] dArr = this.f4898j;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f4898j = dArr2;
        }
        double[] dArr3 = this.f4898j;
        int i11 = this.f4899k;
        this.f4899k = i11 + 1;
        dArr3[i11] = d5;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4899k != jVar.f4899k) {
                return false;
            }
            double[] dArr = jVar.f4898j;
            for (int i10 = 0; i10 < this.f4899k; i10++) {
                if (Double.doubleToLongBits(this.f4898j[i10]) != Double.doubleToLongBits(dArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(int i10) {
        if (i10 >= 0 && i10 < this.f4899k) {
            return;
        }
        StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
        o10.append(this.f4899k);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f4898j[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4899k; i11++) {
            i10 = (i10 * 31) + u.b(Double.doubleToLongBits(this.f4898j[i11]));
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.u.c
    public final u.c k(int i10) {
        if (i10 >= this.f4899k) {
            return new j(this.f4899k, Arrays.copyOf(this.f4898j, i10));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        g(i10);
        double[] dArr = this.f4898j;
        double d5 = dArr[i10];
        if (i10 < this.f4899k - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f4899k--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f4899k; i10++) {
            if (obj.equals(Double.valueOf(this.f4898j[i10]))) {
                double[] dArr = this.f4898j;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f4899k - i10) - 1);
                this.f4899k--;
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
        double[] dArr = this.f4898j;
        System.arraycopy(dArr, i11, dArr, i10, this.f4899k - i11);
        this.f4899k -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        g(i10);
        double[] dArr = this.f4898j;
        double d5 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4899k;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
