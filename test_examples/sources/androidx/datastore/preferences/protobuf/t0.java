package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t0<E> extends c<E> implements RandomAccess {

    /* renamed from: l  reason: collision with root package name */
    public static final t0<Object> f4939l;

    /* renamed from: j  reason: collision with root package name */
    public E[] f4940j;

    /* renamed from: k  reason: collision with root package name */
    public int f4941k;

    static {
        t0<Object> t0Var = new t0<>(0, new Object[0]);
        f4939l = t0Var;
        t0Var.f4845i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(int i10, Object[] objArr) {
        this.f4940j = objArr;
        this.f4941k = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f4941k)) {
            E[] eArr = this.f4940j;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f4940j, i10, eArr2, i10 + 1, this.f4941k - i10);
                this.f4940j = eArr2;
            }
            this.f4940j[i10] = e10;
            this.f4941k++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
        o10.append(this.f4941k);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        c();
        int i10 = this.f4941k;
        E[] eArr = this.f4940j;
        if (i10 == eArr.length) {
            this.f4940j = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4940j;
        int i11 = this.f4941k;
        this.f4941k = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i10) {
        if (i10 >= 0 && i10 < this.f4941k) {
            return;
        }
        StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
        o10.append(this.f4941k);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        d(i10);
        return this.f4940j[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.u.c
    public final u.c k(int i10) {
        if (i10 >= this.f4941k) {
            return new t0(this.f4941k, Arrays.copyOf(this.f4940j, i10));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        c();
        d(i10);
        E[] eArr = this.f4940j;
        E e10 = eArr[i10];
        if (i10 < this.f4941k - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f4941k--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        c();
        d(i10);
        E[] eArr = this.f4940j;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4941k;
    }
}
