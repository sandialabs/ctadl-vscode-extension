package h0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import n7.i;
import v7.g;

/* loaded from: classes.dex */
public final class c<T> implements Set<T>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public int f11325i;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f11326j = new Object[16];

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f11327i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c<T> f11328j;

        public a(c<T> cVar) {
            this.f11328j = cVar;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f11327i < this.f11328j.f11325i) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            Object[] objArr = this.f11328j.f11326j;
            int i10 = this.f11327i;
            this.f11327i = i10 + 1;
            T t10 = (T) objArr[i10];
            g.d(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t10;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t10) {
        int i10;
        g.f(t10, "value");
        if (this.f11325i > 0) {
            i10 = c(t10);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i11 = -(i10 + 1);
        int i12 = this.f11325i;
        Object[] objArr = this.f11326j;
        if (i12 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            i.b2(objArr, objArr2, i11 + 1, i11, i12);
            i.d2(this.f11326j, objArr2, 0, 0, i11, 6);
            this.f11326j = objArr2;
        } else {
            i.b2(objArr, objArr, i11 + 1, i11, i12);
        }
        this.f11326j[i11] = t10;
        this.f11325i++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int c(Object obj) {
        int i10 = this.f11325i - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            T t10 = get(i12);
            int identityHashCode2 = System.identityHashCode(t10);
            if (identityHashCode2 < identityHashCode) {
                i11 = i12 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                if (t10 == obj) {
                    return i12;
                } else {
                    for (int i13 = i12 - 1; -1 < i13; i13--) {
                        Object obj2 = this.f11326j[i13];
                        if (obj2 != obj) {
                            if (System.identityHashCode(obj2) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i13;
                        }
                    }
                    int i14 = i12 + 1;
                    int i15 = this.f11325i;
                    while (true) {
                        if (i14 < i15) {
                            Object obj3 = this.f11326j[i14];
                            if (obj3 == obj) {
                                return i14;
                            }
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                            i14++;
                        } else {
                            i14 = this.f11325i;
                            break;
                        }
                    }
                    return -(i14 + 1);
                }
            } else {
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        i.h2(this.f11326j, null);
        this.f11325i = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && c(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final T get(int i10) {
        T t10 = (T) this.f11326j[i10];
        g.d(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f11325i == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t10) {
        int c;
        if (t10 == null || (c = c(t10)) < 0) {
            return false;
        }
        int i10 = this.f11325i;
        if (c < i10 - 1) {
            Object[] objArr = this.f11326j;
            i.b2(objArr, objArr, c, c + 1, i10);
        }
        int i11 = this.f11325i - 1;
        this.f11325i = i11;
        this.f11326j[i11] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f11325i;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ma.i.O(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        g.f(tArr, "array");
        return (T[]) ma.i.P(this, tArr);
    }
}
