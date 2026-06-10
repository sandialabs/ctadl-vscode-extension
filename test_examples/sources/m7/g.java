package m7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Collection<f>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f15995i;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<f>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final byte[] f15996i;

        /* renamed from: j  reason: collision with root package name */
        public int f15997j;

        public a(byte[] bArr) {
            v7.g.f(bArr, "array");
            this.f15996i = bArr;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super f> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f15997j < this.f15996i.length;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            int i10 = this.f15997j;
            byte[] bArr = this.f15996i;
            if (i10 < bArr.length) {
                this.f15997j = i10 + 1;
                return new f(bArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f15997j));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends f> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        byte b5 = ((f) obj).f15994i;
        byte[] bArr = this.f15995i;
        v7.g.f(bArr, "<this>");
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (b5 == bArr[i10]) {
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
            if (obj instanceof f) {
                byte b5 = ((f) obj).f15994i;
                byte[] bArr = this.f15995i;
                v7.g.f(bArr, "<this>");
                int length = bArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (b5 == bArr[i10]) {
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
        if (!(obj instanceof g)) {
            return false;
        }
        if (!v7.g.a(this.f15995i, ((g) obj).f15995i)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f15995i);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f15995i.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<f> iterator() {
        return new a(this.f15995i);
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
        return this.f15995i.length;
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
        return "UByteArray(storage=" + Arrays.toString(this.f15995i) + ')';
    }
}
