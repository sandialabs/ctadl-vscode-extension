package kotlin.collections.builders;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import m0.b;
import n7.a;
import n7.c;
import n7.i;
import v7.g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001\nB\t\b\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ln7/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ListBuilder<E> extends c<E> implements RandomAccess, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public E[] f12992i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12993j;

    /* renamed from: k  reason: collision with root package name */
    public int f12994k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12995l;

    /* renamed from: m  reason: collision with root package name */
    public final ListBuilder<E> f12996m;
    public final ListBuilder<E> n;

    /* loaded from: classes.dex */
    public static final class a<E> implements ListIterator<E>, w7.a, Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final ListBuilder<E> f12997i;

        /* renamed from: j  reason: collision with root package name */
        public int f12998j;

        /* renamed from: k  reason: collision with root package name */
        public int f12999k;

        public a(ListBuilder<E> listBuilder, int i10) {
            g.f(listBuilder, "list");
            this.f12997i = listBuilder;
            this.f12998j = i10;
            this.f12999k = -1;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            int i10 = this.f12998j;
            this.f12998j = i10 + 1;
            this.f12997i.add(i10, e10);
            this.f12999k = -1;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f12998j < this.f12997i.f12994k) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f12998j > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final E next() {
            int i10 = this.f12998j;
            ListBuilder<E> listBuilder = this.f12997i;
            if (i10 < listBuilder.f12994k) {
                this.f12998j = i10 + 1;
                this.f12999k = i10;
                return listBuilder.f12992i[listBuilder.f12993j + i10];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f12998j;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            int i10 = this.f12998j;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f12998j = i11;
                this.f12999k = i11;
                ListBuilder<E> listBuilder = this.f12997i;
                return listBuilder.f12992i[listBuilder.f12993j + i11];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f12998j - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            boolean z10;
            int i10 = this.f12999k;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f12997i.d(i10);
                this.f12998j = this.f12999k;
                this.f12999k = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            int i10 = this.f12999k;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f12997i.set(i10, e10);
        }
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i10) {
        this(b.v(i10), 0, 0, false, null, null);
    }

    public ListBuilder(E[] eArr, int i10, int i11, boolean z10, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f12992i = eArr;
        this.f12993j = i10;
        this.f12994k = i11;
        this.f12995l = z10;
        this.f12996m = listBuilder;
        this.n = listBuilder2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        t();
        int i11 = this.f12994k;
        if (i10 >= 0 && i10 <= i11) {
            s(this.f12993j + i10, e10);
            return;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        t();
        s(this.f12993j + this.f12994k, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        g.f(collection, "elements");
        t();
        int i11 = this.f12994k;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            g(this.f12993j + i10, size, collection);
            if (size > 0) {
                return true;
            }
            return false;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        g.f(collection, "elements");
        t();
        int size = collection.size();
        g(this.f12993j + this.f12994k, size, collection);
        return size > 0;
    }

    @Override // n7.c
    public final int c() {
        return this.f12994k;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        t();
        w(this.f12993j, this.f12994k);
    }

    @Override // n7.c
    public final E d(int i10) {
        t();
        int i11 = this.f12994k;
        if (i10 >= 0 && i10 < i11) {
            return v(this.f12993j + i10);
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.f12992i;
            int i10 = this.f12994k;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (g.a(eArr[this.f12993j + i11], list.get(i11))) {
                    }
                }
                z10 = true;
                if (z10) {
                    return true;
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return false;
    }

    public final void g(int i10, int i11, Collection collection) {
        ListBuilder<E> listBuilder = this.f12996m;
        if (listBuilder != null) {
            listBuilder.g(i10, i11, collection);
            this.f12992i = listBuilder.f12992i;
            this.f12994k += i11;
            return;
        }
        u(i10, i11);
        java.util.Iterator<E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12992i[i10 + i12] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int i11 = this.f12994k;
        if (i10 >= 0 && i10 < i11) {
            return this.f12992i[this.f12993j + i10];
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10;
        E[] eArr = this.f12992i;
        int i11 = this.f12994k;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            E e10 = eArr[this.f12993j + i13];
            int i14 = i12 * 31;
            if (e10 != null) {
                i10 = e10.hashCode();
            } else {
                i10 = 0;
            }
            i12 = i14 + i10;
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f12994k; i10++) {
            if (g.a(this.f12992i[this.f12993j + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12994k == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f12994k - 1; i10 >= 0; i10--) {
            if (g.a(this.f12992i[this.f12993j + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        int i11 = this.f12994k;
        if (i10 >= 0 && i10 <= i11) {
            return new a(this, i10);
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        t();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            d(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        t();
        return x(this.f12993j, this.f12994k, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        t();
        return x(this.f12993j, this.f12994k, collection, true) > 0;
    }

    public final void s(int i10, E e10) {
        ListBuilder<E> listBuilder = this.f12996m;
        if (listBuilder == null) {
            u(i10, 1);
            this.f12992i[i10] = e10;
            return;
        }
        listBuilder.s(i10, e10);
        this.f12992i = listBuilder.f12992i;
        this.f12994k++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        t();
        int i11 = this.f12994k;
        if (i10 >= 0 && i10 < i11) {
            E[] eArr = this.f12992i;
            int i12 = this.f12993j;
            E e11 = eArr[i12 + i10];
            eArr[i12 + i10] = e10;
            return e11;
        }
        throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i10, int i11) {
        a.C0193a.a(i10, i11, this.f12994k);
        E[] eArr = this.f12992i;
        int i12 = this.f12993j + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f12995l;
        ListBuilder<E> listBuilder = this.n;
        return new ListBuilder(eArr, i12, i13, z10, this, listBuilder == null ? this : listBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0012 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        boolean z10;
        ListBuilder<E> listBuilder;
        if (!this.f12995l && ((listBuilder = this.n) == null || !listBuilder.f12995l)) {
            z10 = false;
            if (z10) {
                return;
            }
            throw new UnsupportedOperationException();
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.f12992i;
        int i10 = this.f12994k;
        int i11 = this.f12993j;
        return i.f2(i11, i10 + i11, eArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        g.f(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f12994k;
        int i11 = this.f12993j;
        if (length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.f12992i, i11, i10 + i11, tArr.getClass());
            g.e(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        i.b2(this.f12992i, tArr, 0, i11, i10 + i11);
        int length2 = tArr.length;
        int i12 = this.f12994k;
        if (length2 > i12) {
            tArr[i12] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        E[] eArr = this.f12992i;
        int i10 = this.f12994k;
        StringBuilder sb = new StringBuilder((i10 * 3) + 2);
        sb.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[this.f12993j + i11]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        g.e(sb2, "sb.toString()");
        return sb2;
    }

    public final void u(int i10, int i11) {
        int i12 = this.f12994k + i11;
        if (this.f12996m == null) {
            if (i12 >= 0) {
                E[] eArr = this.f12992i;
                if (i12 > eArr.length) {
                    int length = eArr.length;
                    int i13 = length + (length >> 1);
                    if (i13 - i12 < 0) {
                        i13 = i12;
                    }
                    if (i13 - 2147483639 > 0) {
                        if (i12 > 2147483639) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 2147483639;
                        }
                    }
                    E[] eArr2 = (E[]) Arrays.copyOf(eArr, i13);
                    g.e(eArr2, "copyOf(this, newSize)");
                    this.f12992i = eArr2;
                }
                E[] eArr3 = this.f12992i;
                i.b2(eArr3, eArr3, i10 + i11, i10, this.f12993j + this.f12994k);
                this.f12994k += i11;
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    public final E v(int i10) {
        int i11;
        ListBuilder<E> listBuilder = this.f12996m;
        if (listBuilder != null) {
            this.f12994k--;
            return listBuilder.v(i10);
        }
        E[] eArr = this.f12992i;
        E e10 = eArr[i10];
        i.b2(eArr, eArr, i10, i10 + 1, this.f12994k + this.f12993j);
        E[] eArr2 = this.f12992i;
        g.f(eArr2, "<this>");
        eArr2[(i11 + this.f12994k) - 1] = null;
        this.f12994k--;
        return e10;
    }

    public final void w(int i10, int i11) {
        ListBuilder<E> listBuilder = this.f12996m;
        if (listBuilder != null) {
            listBuilder.w(i10, i11);
        } else {
            E[] eArr = this.f12992i;
            i.b2(eArr, eArr, i10, i10 + i11, this.f12994k);
            E[] eArr2 = this.f12992i;
            int i12 = this.f12994k;
            b.d1(i12 - i11, i12, eArr2);
        }
        this.f12994k -= i11;
    }

    public final int x(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        ListBuilder<E> listBuilder = this.f12996m;
        if (listBuilder != null) {
            int x3 = listBuilder.x(i10, i11, collection, z10);
            this.f12994k -= x3;
            return x3;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f12992i[i14]) == z10) {
                E[] eArr = this.f12992i;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f12992i;
        i.b2(eArr2, eArr2, i10 + i13, i11 + i10, this.f12994k);
        E[] eArr3 = this.f12992i;
        int i16 = this.f12994k;
        b.d1(i16 - i15, i16, eArr3);
        this.f12994k -= i15;
        return i15;
    }
}
