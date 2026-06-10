package h0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import ma.i;
import v7.g;

/* loaded from: classes.dex */
public final class e<T> implements RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    public T[] f11332i;

    /* renamed from: j  reason: collision with root package name */
    public a f11333j;

    /* renamed from: k  reason: collision with root package name */
    public int f11334k = 0;

    /* loaded from: classes.dex */
    public static final class a<T> implements List<T>, w7.b {

        /* renamed from: i  reason: collision with root package name */
        public final e<T> f11335i;

        public a(e<T> eVar) {
            g.f(eVar, "vector");
            this.f11335i = eVar;
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f11335i.a(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            this.f11335i.b(t10);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            g.f(collection, "elements");
            return this.f11335i.d(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            g.f(collection, "elements");
            e<T> eVar = this.f11335i;
            eVar.getClass();
            return eVar.d(eVar.f11334k, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f11335i.g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f11335i.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            g.f(collection, "elements");
            e<T> eVar = this.f11335i;
            eVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!eVar.h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            a1.c.x(i10, this);
            return this.f11335i.f11332i[i10];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            e<T> eVar = this.f11335i;
            int i10 = eVar.f11334k;
            if (i10 > 0) {
                T[] tArr = eVar.f11332i;
                g.d(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                while (!g.a(obj, tArr[i11])) {
                    i11++;
                    if (i11 >= i10) {
                        return -1;
                    }
                }
                return i11;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f11335i.f11334k == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            e<T> eVar = this.f11335i;
            int i10 = eVar.f11334k;
            if (i10 <= 0) {
                return -1;
            }
            int i11 = i10 - 1;
            T[] tArr = eVar.f11332i;
            g.d(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            while (!g.a(obj, tArr[i11])) {
                i11--;
                if (i11 < 0) {
                    return -1;
                }
            }
            return i11;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new c(i10, this);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            a1.c.x(i10, this);
            return this.f11335i.n(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f11335i.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            g.f(collection, "elements");
            e<T> eVar = this.f11335i;
            eVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i10 = eVar.f11334k;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                eVar.l(it.next());
            }
            if (i10 == eVar.f11334k) {
                return false;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            g.f(collection, "elements");
            e<T> eVar = this.f11335i;
            eVar.getClass();
            int i10 = eVar.f11334k;
            for (int i11 = i10 - 1; -1 < i11; i11--) {
                if (!collection.contains(eVar.f11332i[i11])) {
                    eVar.n(i11);
                }
            }
            if (i10 != eVar.f11334k) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            a1.c.x(i10, this);
            T[] tArr = this.f11335i.f11332i;
            T t11 = tArr[i10];
            tArr[i10] = t10;
            return t11;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f11335i.f11334k;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            a1.c.y(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return i.O(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            g.f(tArr, "array");
            return (T[]) i.P(this, tArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements List<T>, w7.b {

        /* renamed from: i  reason: collision with root package name */
        public final List<T> f11336i;

        /* renamed from: j  reason: collision with root package name */
        public final int f11337j;

        /* renamed from: k  reason: collision with root package name */
        public int f11338k;

        public b(List<T> list, int i10, int i11) {
            g.f(list, "list");
            this.f11336i = list;
            this.f11337j = i10;
            this.f11338k = i11;
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f11336i.add(i10 + this.f11337j, t10);
            this.f11338k++;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            int i10 = this.f11338k;
            this.f11338k = i10 + 1;
            this.f11336i.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            g.f(collection, "elements");
            this.f11336i.addAll(i10 + this.f11337j, collection);
            this.f11338k = collection.size() + this.f11338k;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            g.f(collection, "elements");
            this.f11336i.addAll(this.f11338k, collection);
            this.f11338k = collection.size() + this.f11338k;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f11338k - 1;
            int i11 = this.f11337j;
            if (i11 <= i10) {
                while (true) {
                    this.f11336i.remove(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10--;
                }
            }
            this.f11338k = i11;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f11338k;
            for (int i11 = this.f11337j; i11 < i10; i11++) {
                if (g.a(this.f11336i.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            g.f(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            a1.c.x(i10, this);
            return this.f11336i.get(i10 + this.f11337j);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f11338k;
            int i11 = this.f11337j;
            for (int i12 = i11; i12 < i10; i12++) {
                if (g.a(this.f11336i.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f11338k == this.f11337j;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f11338k - 1;
            int i11 = this.f11337j;
            if (i11 <= i10) {
                while (!g.a(this.f11336i.get(i10), obj)) {
                    if (i10 == i11) {
                        return -1;
                    }
                    i10--;
                }
                return i10 - i11;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new c(i10, this);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            a1.c.x(i10, this);
            this.f11338k--;
            return this.f11336i.remove(i10 + this.f11337j);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f11338k;
            for (int i11 = this.f11337j; i11 < i10; i11++) {
                List<T> list = this.f11336i;
                if (g.a(list.get(i11), obj)) {
                    list.remove(i11);
                    this.f11338k--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            g.f(collection, "elements");
            int i10 = this.f11338k;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f11338k;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            g.f(collection, "elements");
            int i10 = this.f11338k;
            int i11 = i10 - 1;
            int i12 = this.f11337j;
            if (i12 <= i11) {
                while (true) {
                    List<T> list = this.f11336i;
                    if (!collection.contains(list.get(i11))) {
                        list.remove(i11);
                        this.f11338k--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f11338k;
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            a1.c.x(i10, this);
            return this.f11336i.set(i10 + this.f11337j, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f11338k - this.f11337j;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            a1.c.y(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return i.O(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            g.f(tArr, "array");
            return (T[]) i.P(this, tArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements ListIterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final List<T> f11339i;

        /* renamed from: j  reason: collision with root package name */
        public int f11340j;

        public c(int i10, List list) {
            g.f(list, "list");
            this.f11339i = list;
            this.f11340j = i10;
        }

        @Override // java.util.ListIterator
        public final void add(T t10) {
            this.f11339i.add(this.f11340j, t10);
            this.f11340j++;
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
            return this.f11340j < this.f11339i.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f11340j > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final T next() {
            int i10 = this.f11340j;
            this.f11340j = i10 + 1;
            return this.f11339i.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f11340j;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f11340j - 1;
            this.f11340j = i10;
            return this.f11339i.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f11340j - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            int i10 = this.f11340j - 1;
            this.f11340j = i10;
            this.f11339i.remove(i10);
        }

        @Override // java.util.ListIterator
        public final void set(T t10) {
            this.f11339i.set(this.f11340j, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Object[] objArr) {
        this.f11332i = objArr;
    }

    public final void a(int i10, T t10) {
        i(this.f11334k + 1);
        T[] tArr = this.f11332i;
        int i11 = this.f11334k;
        if (i10 != i11) {
            n7.i.b2(tArr, tArr, i10 + 1, i10, i11);
        }
        tArr[i10] = t10;
        this.f11334k++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        i(this.f11334k + 1);
        int i10 = this.f11334k;
        this.f11332i[i10] = obj;
        this.f11334k = i10 + 1;
    }

    public final void c(int i10, e eVar) {
        boolean z10;
        g.f(eVar, "elements");
        int i11 = eVar.f11334k;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        i(this.f11334k + i11);
        T[] tArr = this.f11332i;
        int i12 = this.f11334k;
        if (i10 != i12) {
            n7.i.b2(tArr, tArr, eVar.f11334k + i10, i10, i12);
        }
        n7.i.b2(eVar.f11332i, tArr, i10, 0, eVar.f11334k);
        this.f11334k += eVar.f11334k;
    }

    public final boolean d(int i10, Collection<? extends T> collection) {
        g.f(collection, "elements");
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f11334k);
        T[] tArr = this.f11332i;
        if (i10 != this.f11334k) {
            n7.i.b2(tArr, tArr, collection.size() + i10, i10, this.f11334k);
        }
        for (T t10 : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a1.c.F1();
                throw null;
            }
            tArr[i11 + i10] = t10;
            i11 = i12;
        }
        this.f11334k = collection.size() + this.f11334k;
        return true;
    }

    public final List<T> e() {
        a aVar = this.f11333j;
        if (aVar == null) {
            a aVar2 = new a(this);
            this.f11333j = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final void g() {
        T[] tArr = this.f11332i;
        for (int i10 = this.f11334k - 1; -1 < i10; i10--) {
            tArr[i10] = null;
        }
        this.f11334k = 0;
    }

    public final boolean h(T t10) {
        int i10 = this.f11334k - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !g.a(this.f11332i[i11], t10); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i10) {
        T[] tArr = this.f11332i;
        if (tArr.length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            g.e(tArr2, "copyOf(this, newSize)");
            this.f11332i = tArr2;
        }
    }

    public final boolean j() {
        return this.f11334k != 0;
    }

    public final boolean l(T t10) {
        int i10;
        int i11 = this.f11334k;
        if (i11 > 0) {
            T[] tArr = this.f11332i;
            g.d(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            i10 = 0;
            while (!g.a(t10, tArr[i10])) {
                i10++;
                if (i10 >= i11) {
                    i10 = -1;
                    break;
                }
            }
        } else {
            i10 = -1;
            break;
        }
        if (i10 < 0) {
            return false;
        }
        n(i10);
        return true;
    }

    public final void m(e eVar) {
        g.f(eVar, "elements");
        int i10 = eVar.f11334k - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                l(eVar.f11332i[i11]);
                if (i11 != i10) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final T n(int i10) {
        T[] tArr = this.f11332i;
        T t10 = tArr[i10];
        int i11 = this.f11334k;
        if (i10 != i11 - 1) {
            n7.i.b2(tArr, tArr, i10, i10 + 1, i11);
        }
        int i12 = this.f11334k - 1;
        this.f11334k = i12;
        tArr[i12] = null;
        return t10;
    }

    public final void o(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f11334k;
            if (i11 < i12) {
                T[] tArr = this.f11332i;
                n7.i.b2(tArr, tArr, i10, i11, i12);
            }
            int i13 = this.f11334k;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f11332i[i16] = null;
                    if (i16 == i15) {
                        break;
                    }
                    i16++;
                }
            }
            this.f11334k = i14;
        }
    }

    public final void p(Comparator<T> comparator) {
        g.f(comparator, "comparator");
        T[] tArr = this.f11332i;
        g.d(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        Arrays.sort(tArr, 0, this.f11334k, comparator);
    }
}
