package m7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k implements Collection<j>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final long[] f16003i;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<j>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final long[] f16004i;

        /* renamed from: j  reason: collision with root package name */
        public int f16005j;

        public a(long[] jArr) {
            v7.g.f(jArr, "array");
            this.f16004i = jArr;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super j> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f16005j < this.f16004i.length;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            int i10 = this.f16005j;
            long[] jArr = this.f16004i;
            if (i10 < jArr.length) {
                this.f16005j = i10 + 1;
                return new j(jArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f16005j));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends j> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return kotlin.collections.b.j2(((j) obj).f16002i, this.f16003i);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        boolean z10;
        v7.g.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if ((obj instanceof j) && kotlin.collections.b.j2(((j) obj).f16002i, this.f16003i)) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (!v7.g.a(this.f16003i, ((k) obj).f16003i)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f16003i);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16003i.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<j> iterator() {
        return new a(this.f16003i);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16003i.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ma.i.O(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        v7.g.f(tArr, "array");
        return (T[]) ma.i.P(this, tArr);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f16003i) + ')';
    }
}
