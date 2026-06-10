package m7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Collection<h>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final int[] f15999i;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<h>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final int[] f16000i;

        /* renamed from: j  reason: collision with root package name */
        public int f16001j;

        public a(int[] iArr) {
            v7.g.f(iArr, "array");
            this.f16000i = iArr;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super h> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f16001j < this.f16000i.length;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            int i10 = this.f16001j;
            int[] iArr = this.f16000i;
            if (i10 < iArr.length) {
                this.f16001j = i10 + 1;
                return new h(iArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f16001j));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        int i10 = ((h) obj).f15998i;
        int[] iArr = this.f15999i;
        v7.g.f(iArr, "<this>");
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (i10 == iArr[i11]) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsAll(Collection<? extends Object> collection) {
        boolean z10;
        boolean z11;
        v7.g.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof h) {
                int i10 = ((h) obj).f15998i;
                int[] iArr = this.f15999i;
                v7.g.f(iArr, "<this>");
                int length = iArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (i10 == iArr[i11]) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z10 = true;
                    continue;
                    if (!z10) {
                        return false;
                    }
                }
            }
            z10 = false;
            continue;
            if (!z10) {
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (!v7.g.a(this.f15999i, ((i) obj).f15999i)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f15999i);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f15999i.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<h> iterator() {
        return new a(this.f15999i);
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
        return this.f15999i.length;
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
        return "UIntArray(storage=" + Arrays.toString(this.f15999i) + ')';
    }
}
