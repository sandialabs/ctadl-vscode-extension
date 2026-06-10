package l1;

import j$.lang.Iterable$CC;
import j$.util.AbstractC0261c;
import j$.util.Collection;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.AbstractC0421w0;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class f<T> implements List<T>, w7.a, j$.util.List {

    /* renamed from: i  reason: collision with root package name */
    public Object[] f15729i = new Object[16];

    /* renamed from: j  reason: collision with root package name */
    public long[] f15730j = new long[16];

    /* renamed from: k  reason: collision with root package name */
    public int f15731k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f15732l;

    /* loaded from: classes.dex */
    public final class a implements ListIterator<T>, w7.a, Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f15733i;

        /* renamed from: j  reason: collision with root package name */
        public final int f15734j;

        /* renamed from: k  reason: collision with root package name */
        public final int f15735k;

        public a(f fVar, int i10, int i11) {
            this((i11 & 1) != 0 ? 0 : i10, 0, (i11 & 4) != 0 ? fVar.f15732l : 0);
        }

        public a(int i10, int i11, int i12) {
            this.f15733i = i10;
            this.f15734j = i11;
            this.f15735k = i12;
        }

        @Override // java.util.ListIterator
        public final void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
            return this.f15733i < this.f15735k;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f15733i > this.f15734j;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final T next() {
            Object[] objArr = f.this.f15729i;
            int i10 = this.f15733i;
            this.f15733i = i10 + 1;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f15733i - this.f15734j;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Object[] objArr = f.this.f15729i;
            int i10 = this.f15733i - 1;
            this.f15733i = i10;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f15733i - this.f15734j) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes.dex */
    public final class b implements List<T>, w7.a, j$.util.List {

        /* renamed from: i  reason: collision with root package name */
        public final int f15737i;

        /* renamed from: j  reason: collision with root package name */
        public final int f15738j;

        public b(int i10, int i11) {
            this.f15737i = i10;
            this.f15738j = i11;
        }

        @Override // java.util.List, j$.util.List
        public final void add(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection
        public final boolean add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, j$.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            v7.g.f(collection, "elements");
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // j$.util.Collection
        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable
        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.List, j$.util.List
        public final T get(int i10) {
            return (T) f.this.f15729i[i10 + this.f15737i];
        }

        @Override // java.util.List, j$.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f15737i;
            int i11 = this.f15738j;
            if (i10 <= i11) {
                int i12 = i10;
                while (!v7.g.a(f.this.f15729i[i12], obj)) {
                    if (i12 != i11) {
                        i12++;
                    } else {
                        return -1;
                    }
                }
                return i12 - i10;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean isEmpty() {
            return this.f15738j - this.f15737i == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, java.util.AbstractCollection, j$.util.Collection
        public final java.util.Iterator<T> iterator() {
            int i10 = this.f15737i;
            return new a(i10, i10, this.f15738j);
        }

        @Override // java.util.List, j$.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f15738j;
            int i11 = this.f15737i;
            if (i11 <= i10) {
                while (!v7.g.a(f.this.f15729i[i10], obj)) {
                    if (i10 != i11) {
                        i10--;
                    } else {
                        return -1;
                    }
                }
                return i10 - i11;
            }
            return -1;
        }

        @Override // java.util.List, j$.util.List
        public final ListIterator<T> listIterator() {
            int i10 = this.f15737i;
            return new a(i10, i10, this.f15738j);
        }

        @Override // java.util.List, j$.util.List
        public final ListIterator<T> listIterator(int i10) {
            int i11 = this.f15737i;
            int i12 = this.f15738j;
            return new a(i10 + i11, i11, i12);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            Stream v12;
            v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
            return v12;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ java.util.stream.Stream parallelStream() {
            Stream v12;
            v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
            return Stream.Wrapper.convert(v12);
        }

        @Override // java.util.List, j$.util.List
        public final T remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // j$.util.List
        public final void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
            replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
            throw null;
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean retainAll(java.util.Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, j$.util.List
        public final T set(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final int size() {
            return this.f15738j - this.f15737i;
        }

        @Override // java.util.List, j$.util.List
        public final void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
        public final /* synthetic */ Spliterator spliterator() {
            return getClass();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(getClass());
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            Stream v12;
            v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
            return v12;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            Stream v12;
            v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
            return Stream.Wrapper.convert(v12);
        }

        @Override // java.util.List, j$.util.List
        public final List<T> subList(int i10, int i11) {
            int i12 = this.f15737i;
            return new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final Object[] toArray() {
            return ma.i.O(this);
        }

        @Override // j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) intFunction.apply(0));
            return array;
        }

        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
            return array;
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            v7.g.f(tArr, "array");
            return (T[]) ma.i.P(this, tArr);
        }
    }

    @Override // java.util.List, j$.util.List
    public final void add(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final boolean addAll(int i10, java.util.Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long c() {
        long n = m0.b.n(Float.POSITIVE_INFINITY, false);
        int i10 = this.f15731k + 1;
        int B0 = a1.c.B0(this);
        if (i10 <= B0) {
            while (true) {
                long j2 = this.f15730j[i10];
                if (m0.b.I(j2, n) < 0) {
                    n = j2;
                }
                if (Float.intBitsToFloat((int) (n >> 32)) < 0.0f && m0.b.E0(n)) {
                    return n;
                }
                if (i10 == B0) {
                    break;
                }
                i10++;
            }
        }
        return n;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final void clear() {
        this.f15731k = -1;
        g();
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean containsAll(java.util.Collection<? extends Object> collection) {
        v7.g.f(collection, "elements");
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(T t10, float f10, boolean z10, u7.a<m7.n> aVar) {
        int i10 = this.f15731k;
        int i11 = i10 + 1;
        this.f15731k = i11;
        Object[] objArr = this.f15729i;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f15729i = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f15730j, length);
            v7.g.e(copyOf2, "copyOf(this, newSize)");
            this.f15730j = copyOf2;
        }
        Object[] objArr2 = this.f15729i;
        int i12 = this.f15731k;
        objArr2[i12] = t10;
        this.f15730j[i12] = m0.b.n(f10, z10);
        g();
        aVar.k0();
        this.f15731k = i10;
    }

    @Override // j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final void g() {
        int i10 = this.f15731k + 1;
        int B0 = a1.c.B0(this);
        if (i10 <= B0) {
            while (true) {
                this.f15729i[i10] = null;
                if (i10 == B0) {
                    break;
                }
                i10++;
            }
        }
        this.f15732l = this.f15731k + 1;
    }

    @Override // java.util.List, j$.util.List
    public final T get(int i10) {
        return (T) this.f15729i[i10];
    }

    @Override // java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        int B0 = a1.c.B0(this);
        if (B0 >= 0) {
            int i10 = 0;
            while (!v7.g.a(this.f15729i[i10], obj)) {
                if (i10 == B0) {
                    return -1;
                }
                i10++;
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean isEmpty() {
        return this.f15732l == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final java.util.Iterator<T> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List, j$.util.List
    public final int lastIndexOf(Object obj) {
        for (int B0 = a1.c.B0(this); -1 < B0; B0--) {
            if (v7.g.a(this.f15729i[B0], obj)) {
                return B0;
            }
        }
        return -1;
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new a(this, i10, 6);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
        return v12;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
        return Stream.Wrapper.convert(v12);
    }

    @Override // java.util.List, j$.util.List
    public final T remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean removeAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // j$.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final T set(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final int size() {
        return this.f15732l;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return getClass();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(getClass());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
        return v12;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
        return Stream.Wrapper.convert(v12);
    }

    @Override // java.util.List, j$.util.List
    public final List<T> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final Object[] toArray() {
        return ma.i.O(this);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
        return array;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        v7.g.f(tArr, "array");
        return (T[]) ma.i.P(this, tArr);
    }
}
