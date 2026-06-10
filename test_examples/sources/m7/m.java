package m7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m implements Collection<l>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final short[] f16007i;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<l>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final short[] f16008i;

        /* renamed from: j  reason: collision with root package name */
        public int f16009j;

        public a(short[] sArr) {
            v7.g.f(sArr, "array");
            this.f16008i = sArr;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super l> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f16009j < this.f16008i.length;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            int i10 = this.f16009j;
            short[] sArr = this.f16008i;
            if (i10 < sArr.length) {
                this.f16009j = i10 + 1;
                return new l(sArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f16009j));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends l> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        short s10 = ((l) obj).f16006i;
        short[] sArr = this.f16007i;
        v7.g.f(sArr, "<this>");
        int length = sArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (s10 == sArr[i10]) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
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
            if (obj instanceof l) {
                short s10 = ((l) obj).f16006i;
                short[] sArr = this.f16007i;
                v7.g.f(sArr, "<this>");
                int length = sArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (s10 == sArr[i10]) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
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
        if (!(obj instanceof m)) {
            return false;
        }
        if (!v7.g.a(this.f16007i, ((m) obj).f16007i)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f16007i);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16007i.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<l> iterator() {
        return new a(this.f16007i);
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
        return this.f16007i.length;
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
        return "UShortArray(storage=" + Arrays.toString(this.f16007i) + ')';
    }
}
