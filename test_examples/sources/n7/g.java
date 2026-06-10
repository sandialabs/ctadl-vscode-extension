package n7;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g<E> extends c<E> {

    /* renamed from: l  reason: collision with root package name */
    public static final Object[] f16120l = new Object[0];

    /* renamed from: i  reason: collision with root package name */
    public int f16121i;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f16122j = f16120l;

    /* renamed from: k  reason: collision with root package name */
    public int f16123k;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11 = this.f16123k;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            addLast(e10);
        } else if (i10 == 0) {
            addFirst(e10);
        } else {
            s(i11 + 1);
            int u10 = u(this.f16121i + i10);
            int i12 = this.f16123k;
            if (i10 < ((i12 + 1) >> 1)) {
                if (u10 == 0) {
                    Object[] objArr = this.f16122j;
                    v7.g.f(objArr, "<this>");
                    u10 = objArr.length;
                }
                int i13 = u10 - 1;
                int i14 = this.f16121i;
                if (i14 == 0) {
                    Object[] objArr2 = this.f16122j;
                    v7.g.f(objArr2, "<this>");
                    i14 = objArr2.length;
                }
                int i15 = i14 - 1;
                int i16 = this.f16121i;
                Object[] objArr3 = this.f16122j;
                if (i13 >= i16) {
                    objArr3[i15] = objArr3[i16];
                    i.b2(objArr3, objArr3, i16, i16 + 1, i13 + 1);
                } else {
                    i.b2(objArr3, objArr3, i16 - 1, i16, objArr3.length);
                    Object[] objArr4 = this.f16122j;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    i.b2(objArr4, objArr4, 0, 1, i13 + 1);
                }
                this.f16122j[i13] = e10;
                this.f16121i = i15;
            } else {
                int u11 = u(i12 + this.f16121i);
                Object[] objArr5 = this.f16122j;
                if (u10 < u11) {
                    i.b2(objArr5, objArr5, u10 + 1, u10, u11);
                } else {
                    i.b2(objArr5, objArr5, 1, 0, u11);
                    Object[] objArr6 = this.f16122j;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    i.b2(objArr6, objArr6, u10 + 1, u10, objArr6.length - 1);
                }
                this.f16122j[u10] = e10;
            }
            this.f16123k++;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        v7.g.f(collection, "elements");
        int i11 = this.f16123k;
        if (i10 >= 0 && i10 <= i11) {
            if (collection.isEmpty()) {
                return false;
            }
            int i12 = this.f16123k;
            if (i10 == i12) {
                return addAll(collection);
            }
            s(collection.size() + i12);
            int u10 = u(this.f16123k + this.f16121i);
            int u11 = u(this.f16121i + i10);
            int size = collection.size();
            if (i10 < ((this.f16123k + 1) >> 1)) {
                int i13 = this.f16121i;
                int i14 = i13 - size;
                if (u11 < i13) {
                    Object[] objArr = this.f16122j;
                    i.b2(objArr, objArr, i14, i13, objArr.length);
                    Object[] objArr2 = this.f16122j;
                    int length = objArr2.length - size;
                    if (size >= u11) {
                        i.b2(objArr2, objArr2, length, 0, u11);
                    } else {
                        i.b2(objArr2, objArr2, length, 0, size);
                        Object[] objArr3 = this.f16122j;
                        i.b2(objArr3, objArr3, 0, size, u11);
                    }
                } else if (i14 >= 0) {
                    Object[] objArr4 = this.f16122j;
                    i.b2(objArr4, objArr4, i14, i13, u11);
                } else {
                    Object[] objArr5 = this.f16122j;
                    i14 += objArr5.length;
                    int i15 = u11 - i13;
                    int length2 = objArr5.length - i14;
                    if (length2 >= i15) {
                        i.b2(objArr5, objArr5, i14, i13, u11);
                    } else {
                        i.b2(objArr5, objArr5, i14, i13, i13 + length2);
                        Object[] objArr6 = this.f16122j;
                        i.b2(objArr6, objArr6, 0, this.f16121i + length2, u11);
                    }
                }
                this.f16121i = i14;
                u11 -= size;
                if (u11 < 0) {
                    u11 += this.f16122j.length;
                }
            } else {
                int i16 = u11 + size;
                if (u11 < u10) {
                    int i17 = size + u10;
                    Object[] objArr7 = this.f16122j;
                    if (i17 > objArr7.length) {
                        if (i16 >= objArr7.length) {
                            i16 -= objArr7.length;
                        } else {
                            int length3 = u10 - (i17 - objArr7.length);
                            i.b2(objArr7, objArr7, 0, length3, u10);
                            Object[] objArr8 = this.f16122j;
                            i.b2(objArr8, objArr8, i16, u11, length3);
                        }
                    }
                    i.b2(objArr7, objArr7, i16, u11, u10);
                } else {
                    Object[] objArr9 = this.f16122j;
                    i.b2(objArr9, objArr9, size, 0, u10);
                    Object[] objArr10 = this.f16122j;
                    if (i16 >= objArr10.length) {
                        i.b2(objArr10, objArr10, i16 - objArr10.length, u11, objArr10.length);
                    } else {
                        i.b2(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                        Object[] objArr11 = this.f16122j;
                        i.b2(objArr11, objArr11, i16, u11, objArr11.length - size);
                    }
                }
            }
            g(u11, collection);
            return true;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    public final void addFirst(E e10) {
        s(this.f16123k + 1);
        int i10 = this.f16121i;
        if (i10 == 0) {
            Object[] objArr = this.f16122j;
            v7.g.f(objArr, "<this>");
            i10 = objArr.length;
        }
        int i11 = i10 - 1;
        this.f16121i = i11;
        this.f16122j[i11] = e10;
        this.f16123k++;
    }

    public final void addLast(E e10) {
        s(c() + 1);
        this.f16122j[u(c() + this.f16121i)] = e10;
        this.f16123k = c() + 1;
    }

    @Override // n7.c
    public final int c() {
        return this.f16123k;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int u10 = u(this.f16123k + this.f16121i);
        int i10 = this.f16121i;
        if (i10 < u10) {
            i.g2(i10, u10, this.f16122j);
        } else if (!isEmpty()) {
            Object[] objArr = this.f16122j;
            i.g2(this.f16121i, objArr.length, objArr);
            i.g2(0, u10, this.f16122j);
        }
        this.f16121i = 0;
        this.f16123k = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // n7.c
    public final E d(int i10) {
        int i11 = this.f16123k;
        if (i10 >= 0 && i10 < i11) {
            if (i10 == a1.c.B0(this)) {
                return removeLast();
            }
            if (i10 == 0) {
                return removeFirst();
            }
            int u10 = u(this.f16121i + i10);
            Object[] objArr = this.f16122j;
            E e10 = (E) objArr[u10];
            if (i10 < (this.f16123k >> 1)) {
                int i12 = this.f16121i;
                if (u10 >= i12) {
                    i.b2(objArr, objArr, i12 + 1, i12, u10);
                } else {
                    i.b2(objArr, objArr, 1, 0, u10);
                    Object[] objArr2 = this.f16122j;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.f16121i;
                    i.b2(objArr2, objArr2, i13 + 1, i13, objArr2.length - 1);
                }
                Object[] objArr3 = this.f16122j;
                int i14 = this.f16121i;
                objArr3[i14] = null;
                this.f16121i = t(i14);
            } else {
                int u11 = u(a1.c.B0(this) + this.f16121i);
                Object[] objArr4 = this.f16122j;
                int i15 = u10 + 1;
                if (u10 <= u11) {
                    i.b2(objArr4, objArr4, u10, i15, u11 + 1);
                } else {
                    i.b2(objArr4, objArr4, u10, i15, objArr4.length);
                    Object[] objArr5 = this.f16122j;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    i.b2(objArr5, objArr5, 0, 1, u11 + 1);
                }
                this.f16122j[u11] = null;
            }
            this.f16123k--;
            return e10;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    public final void g(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f16122j.length;
        while (i10 < length && it.hasNext()) {
            this.f16122j[i10] = it.next();
            i10++;
        }
        int i11 = this.f16121i;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f16122j[i12] = it.next();
        }
        this.f16123k = collection.size() + c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int c = c();
        if (i10 >= 0 && i10 < c) {
            return (E) this.f16122j[u(this.f16121i + i10)];
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", c));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int u10 = u(c() + this.f16121i);
        int i10 = this.f16121i;
        if (i10 < u10) {
            while (i10 < u10) {
                if (!v7.g.a(obj, this.f16122j[i10])) {
                    i10++;
                }
            }
            return -1;
        } else if (i10 >= u10) {
            int length = this.f16122j.length;
            while (true) {
                if (i10 < length) {
                    if (v7.g.a(obj, this.f16122j[i10])) {
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < u10; i11++) {
                        if (v7.g.a(obj, this.f16122j[i11])) {
                            i10 = i11 + this.f16122j.length;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - this.f16121i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int u10 = u(this.f16123k + this.f16121i);
        int i10 = this.f16121i;
        if (i10 < u10) {
            length = u10 - 1;
            if (i10 <= length) {
                while (!v7.g.a(obj, this.f16122j[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                return length - this.f16121i;
            }
            return -1;
        }
        if (i10 > u10) {
            int i11 = u10 - 1;
            while (true) {
                if (-1 < i11) {
                    if (v7.g.a(obj, this.f16122j[i11])) {
                        length = i11 + this.f16122j.length;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f16122j;
                    v7.g.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f16121i;
                    if (i12 <= length) {
                        while (!v7.g.a(obj, this.f16122j[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                    }
                }
            }
            return length - this.f16121i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        boolean z10;
        int u10;
        v7.g.f(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f16122j.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int u11 = u(this.f16123k + this.f16121i);
                int i10 = this.f16121i;
                if (i10 < u11) {
                    u10 = i10;
                    while (i10 < u11) {
                        Object obj = this.f16122j[i10];
                        if (!collection.contains(obj)) {
                            this.f16122j[u10] = obj;
                            u10++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    i.g2(u10, u11, this.f16122j);
                } else {
                    int length = this.f16122j.length;
                    int i11 = i10;
                    boolean z12 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f16122j;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f16122j[i11] = obj2;
                            i11++;
                        } else {
                            z12 = true;
                        }
                        i10++;
                    }
                    u10 = u(i11);
                    for (int i12 = 0; i12 < u11; i12++) {
                        Object[] objArr2 = this.f16122j;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f16122j[u10] = obj3;
                            u10 = t(u10);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    int i13 = u10 - this.f16121i;
                    if (i13 < 0) {
                        i13 += this.f16122j.length;
                    }
                    this.f16123k = i13;
                }
            }
        }
        return z11;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f16122j;
            int i10 = this.f16121i;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f16121i = t(i10);
            this.f16123k = c() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int u10 = u(a1.c.B0(this) + this.f16121i);
            Object[] objArr = this.f16122j;
            E e10 = (E) objArr[u10];
            objArr[u10] = null;
            this.f16123k = c() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        boolean z10;
        int u10;
        v7.g.f(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f16122j.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int u11 = u(this.f16123k + this.f16121i);
                int i10 = this.f16121i;
                if (i10 < u11) {
                    u10 = i10;
                    while (i10 < u11) {
                        Object obj = this.f16122j[i10];
                        if (collection.contains(obj)) {
                            this.f16122j[u10] = obj;
                            u10++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    i.g2(u10, u11, this.f16122j);
                } else {
                    int length = this.f16122j.length;
                    int i11 = i10;
                    boolean z12 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f16122j;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f16122j[i11] = obj2;
                            i11++;
                        } else {
                            z12 = true;
                        }
                        i10++;
                    }
                    u10 = u(i11);
                    for (int i12 = 0; i12 < u11; i12++) {
                        Object[] objArr2 = this.f16122j;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f16122j[u10] = obj3;
                            u10 = t(u10);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    int i13 = u10 - this.f16121i;
                    if (i13 < 0) {
                        i13 += this.f16122j.length;
                    }
                    this.f16123k = i13;
                }
            }
        }
        return z11;
    }

    public final void s(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f16122j;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f16120l) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f16122j = new Object[i10];
                return;
            }
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                if (i10 > 2147483639) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i11];
            i.b2(objArr, objArr2, 0, this.f16121i, objArr.length);
            Object[] objArr3 = this.f16122j;
            int length2 = objArr3.length;
            int i12 = this.f16121i;
            i.b2(objArr3, objArr2, length2 - i12, 0, i12);
            this.f16121i = 0;
            this.f16122j = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        int c = c();
        if (i10 >= 0 && i10 < c) {
            int u10 = u(this.f16121i + i10);
            Object[] objArr = this.f16122j;
            E e11 = (E) objArr[u10];
            objArr[u10] = e10;
            return e11;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", c));
    }

    public final int t(int i10) {
        Object[] objArr = this.f16122j;
        v7.g.f(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    public final int u(int i10) {
        Object[] objArr = this.f16122j;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        v7.g.f(tArr, "array");
        int length = tArr.length;
        int i10 = this.f16123k;
        if (length < i10) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
            v7.g.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) newInstance);
        }
        int u10 = u(this.f16123k + this.f16121i);
        int i11 = this.f16121i;
        if (i11 < u10) {
            i.d2(this.f16122j, tArr, 0, i11, u10, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f16122j;
            i.b2(objArr, tArr, 0, this.f16121i, objArr.length);
            Object[] objArr2 = this.f16122j;
            i.b2(objArr2, tArr, objArr2.length - this.f16121i, 0, u10);
        }
        int length2 = tArr.length;
        int i12 = this.f16123k;
        if (length2 > i12) {
            tArr[i12] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        v7.g.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size() + c());
        g(u(c() + this.f16121i), collection);
        return true;
    }
}
