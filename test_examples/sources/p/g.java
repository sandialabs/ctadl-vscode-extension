package p;

import j$.util.Iterator;
import j$.util.Map;
import j$.util.function.Consumer;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f16561a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f16562b;
    public g<K, V>.e c;

    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final int f16563i;

        /* renamed from: j  reason: collision with root package name */
        public int f16564j;

        /* renamed from: k  reason: collision with root package name */
        public int f16565k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16566l = false;

        public a(int i10) {
            this.f16563i = i10;
            this.f16564j = g.this.d();
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
            return this.f16565k < this.f16564j;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t10 = (T) g.this.b(this.f16565k, this.f16563i);
                this.f16565k++;
                this.f16566l = true;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (!this.f16566l) {
                throw new IllegalStateException();
            }
            int i10 = this.f16565k - 1;
            this.f16565k = i10;
            this.f16564j--;
            this.f16566l = false;
            g.this.h(i10);
        }
    }

    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            g gVar = g.this;
            int d5 = gVar.d();
            for (Map.Entry<K, V> entry : collection) {
                gVar.g(entry.getKey(), entry.getValue());
            }
            return d5 != gVar.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            g gVar = g.this;
            int e10 = gVar.e(key);
            if (e10 < 0) {
                return false;
            }
            Object b5 = gVar.b(e10, 1);
            Object value = entry.getValue();
            if (b5 != value && (b5 == null || !b5.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            g gVar = g.this;
            int i10 = 0;
            for (int d5 = gVar.d() - 1; d5 >= 0; d5--) {
                Object b5 = gVar.b(d5, 0);
                Object b10 = gVar.b(d5, 1);
                i10 += (b5 == null ? 0 : b5.hashCode()) ^ (b10 == null ? 0 : b10.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> c = g.this.c();
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            g gVar = g.this;
            int i10 = 0;
            for (int d5 = gVar.d() - 1; d5 >= 0; d5--) {
                Object b5 = gVar.b(d5, 0);
                i10 += b5 == null ? 0 : b5.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            g gVar = g.this;
            int e10 = gVar.e(obj);
            if (e10 >= 0) {
                gVar.h(e10);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> c = g.this.c();
            int size = c.size();
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c.remove(it.next());
            }
            if (size != c.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d5 = gVar.d();
            Object[] objArr = new Object[d5];
            for (int i10 = 0; i10 < d5; i10++) {
                objArr[i10] = gVar.b(i10, 0);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(0, tArr);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, j$.util.Iterator, Map.Entry {

        /* renamed from: i  reason: collision with root package name */
        public int f16570i;

        /* renamed from: k  reason: collision with root package name */
        public boolean f16572k = false;

        /* renamed from: j  reason: collision with root package name */
        public int f16571j = -1;

        public d() {
            this.f16570i = g.this.d() - 1;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        @Override // java.util.Map.Entry, j$.util.Map.Entry
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            if (this.f16572k) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i10 = this.f16571j;
                g gVar = g.this;
                Object b5 = gVar.b(i10, 0);
                if (key != b5 && (key == null || !key.equals(b5))) {
                    z10 = false;
                    if (z10) {
                        return false;
                    }
                    Object value = entry.getValue();
                    Object b10 = gVar.b(this.f16571j, 1);
                    if (value != b10 && (value == null || !value.equals(b10))) {
                        z11 = false;
                        if (z11) {
                            return false;
                        }
                        return true;
                    }
                    z11 = true;
                    if (z11) {
                    }
                }
                z10 = true;
                if (z10) {
                }
            } else {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final K getKey() {
            if (this.f16572k) {
                return (K) g.this.b(this.f16571j, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final V getValue() {
            if (this.f16572k) {
                return (V) g.this.b(this.f16571j, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f16571j < this.f16570i;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final int hashCode() {
            if (this.f16572k) {
                int i10 = this.f16571j;
                g gVar = g.this;
                int i11 = 0;
                Object b5 = gVar.b(i10, 0);
                Object b10 = gVar.b(this.f16571j, 1);
                int hashCode = b5 == null ? 0 : b5.hashCode();
                if (b10 != null) {
                    i11 = b10.hashCode();
                }
                return hashCode ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f16571j++;
                this.f16572k = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (!this.f16572k) {
                throw new IllegalStateException();
            }
            g.this.h(this.f16571j);
            this.f16571j--;
            this.f16570i--;
            this.f16572k = false;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final V setValue(V v3) {
            if (this.f16572k) {
                return (V) g.this.i(this.f16571j, v3);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            g gVar = g.this;
            int f10 = gVar.f(obj);
            if (f10 >= 0) {
                gVar.h(f10);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            g gVar = g.this;
            int d5 = gVar.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d5) {
                if (collection.contains(gVar.b(i10, 1))) {
                    gVar.h(i10);
                    i10--;
                    d5--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            g gVar = g.this;
            int d5 = gVar.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d5) {
                if (!collection.contains(gVar.b(i10, 1))) {
                    gVar.h(i10);
                    i10--;
                    d5--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d5 = gVar.d();
            Object[] objArr = new Object[d5];
            for (int i10 = 0; i10 < d5; i10++) {
                objArr[i10] = gVar.b(i10, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(1, tArr);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract java.util.Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k3, V v3);

    public abstract void h(int i10);

    public abstract V i(int i10, V v3);

    public final Object[] l(int i10, Object[] objArr) {
        int d5 = d();
        if (objArr.length < d5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d5);
        }
        for (int i11 = 0; i11 < d5; i11++) {
            objArr[i11] = b(i11, i10);
        }
        if (objArr.length > d5) {
            objArr[d5] = null;
        }
        return objArr;
    }
}
