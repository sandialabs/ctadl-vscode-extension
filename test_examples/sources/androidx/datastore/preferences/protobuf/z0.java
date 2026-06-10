package androidx.datastore.preferences.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class z0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f4957o = 0;

    /* renamed from: i  reason: collision with root package name */
    public final int f4958i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4961l;

    /* renamed from: m  reason: collision with root package name */
    public volatile z0<K, V>.d f4962m;

    /* renamed from: j  reason: collision with root package name */
    public List<z0<K, V>.b> f4959j = Collections.emptyList();

    /* renamed from: k  reason: collision with root package name */
    public Map<K, V> f4960k = Collections.emptyMap();
    public Map<K, V> n = Collections.emptyMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0036a f4963a = new C0036a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f4964b = new b();

        /* renamed from: androidx.datastore.preferences.protobuf.z0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0036a implements Iterator<Object>, j$.util.Iterator {
            @Override // j$.util.Iterator
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
                Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final java.util.Iterator<Object> iterator() {
                return a.f4963a;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Map.Entry<K, V>, Comparable<z0<K, V>.b> {

        /* renamed from: i  reason: collision with root package name */
        public final K f4965i;

        /* renamed from: j  reason: collision with root package name */
        public V f4966j;

        public b() {
            throw null;
        }

        public b(K k3, V v3) {
            this.f4965i = k3;
            this.f4966j = v3;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f4965i.compareTo(((b) obj).f4965i);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k3 = this.f4965i;
            if (k3 == null) {
                if (key == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = k3.equals(key);
            }
            if (equals) {
                V v3 = this.f4966j;
                Object value = entry.getValue();
                if (v3 == null) {
                    if (value == null) {
                        equals2 = true;
                    } else {
                        equals2 = false;
                    }
                } else {
                    equals2 = v3.equals(value);
                }
                if (equals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f4965i;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f4966j;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int i10 = 0;
            K k3 = this.f4965i;
            int hashCode = k3 == null ? 0 : k3.hashCode();
            V v3 = this.f4966j;
            if (v3 != null) {
                i10 = v3.hashCode();
            }
            return i10 ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            int i10 = z0.f4957o;
            z0.this.b();
            V v10 = this.f4966j;
            this.f4966j = v3;
            return v10;
        }

        public final String toString() {
            return this.f4965i + "=" + this.f4966j;
        }
    }

    /* loaded from: classes.dex */
    public class c implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f4968i = -1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4969j;

        /* renamed from: k  reason: collision with root package name */
        public java.util.Iterator<Map.Entry<K, V>> f4970k;

        public c() {
        }

        public final java.util.Iterator<Map.Entry<K, V>> a() {
            if (this.f4970k == null) {
                this.f4970k = z0.this.f4960k.entrySet().iterator();
            }
            return this.f4970k;
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
            int i10 = this.f4968i + 1;
            z0 z0Var = z0.this;
            if (i10 < z0Var.f4959j.size()) {
                return true;
            }
            if (!z0Var.f4960k.isEmpty() && a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Map.Entry<K, V> next;
            this.f4969j = true;
            int i10 = this.f4968i + 1;
            this.f4968i = i10;
            z0 z0Var = z0.this;
            if (i10 < z0Var.f4959j.size()) {
                next = z0Var.f4959j.get(this.f4968i);
            } else {
                next = a().next();
            }
            return next;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f4969j) {
                this.f4969j = false;
                int i10 = z0.f4957o;
                z0 z0Var = z0.this;
                z0Var.b();
                if (this.f4968i < z0Var.f4959j.size()) {
                    int i11 = this.f4968i;
                    this.f4968i = i11 - 1;
                    z0Var.j(i11);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                Object value = entry.getValue();
                z0.this.put((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            z0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = z0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                z0.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return z0.this.size();
        }
    }

    public z0(int i10) {
        this.f4958i = i10;
    }

    public final int a(K k3) {
        int size = this.f4959j.size() - 1;
        if (size >= 0) {
            int compareTo = k3.compareTo(this.f4959j.get(size).f4965i);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k3.compareTo(this.f4959j.get(i11).f4965i);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public final void b() {
        if (this.f4961l) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i10) {
        return this.f4959j.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4959j.isEmpty()) {
            this.f4959j.clear();
        }
        if (this.f4960k.isEmpty()) {
            return;
        }
        this.f4960k.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f4960k.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int d() {
        return this.f4959j.size();
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f4960k.isEmpty() ? a.f4964b : this.f4960k.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f4962m == null) {
            this.f4962m = new d();
        }
        return this.f4962m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            int size = size();
            if (size != z0Var.size()) {
                return false;
            }
            int d5 = d();
            if (d5 != z0Var.d()) {
                return entrySet().equals(z0Var.entrySet());
            }
            for (int i10 = 0; i10 < d5; i10++) {
                if (!c(i10).equals(z0Var.c(i10))) {
                    return false;
                }
            }
            if (d5 != size) {
                return this.f4960k.equals(z0Var.f4960k);
            }
            return true;
        }
        return super.equals(obj);
    }

    public final SortedMap<K, V> f() {
        b();
        if (this.f4960k.isEmpty() && !(this.f4960k instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4960k = treeMap;
            this.n = treeMap.descendingMap();
        }
        return (SortedMap) this.f4960k;
    }

    public void g() {
        if (this.f4961l) {
            return;
        }
        this.f4960k = this.f4960k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4960k);
        this.n = this.n.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.n);
        this.f4961l = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f4959j.get(a10).f4966j;
        }
        return this.f4960k.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int d5 = d();
        int i10 = 0;
        for (int i11 = 0; i11 < d5; i11++) {
            i10 += this.f4959j.get(i11).hashCode();
        }
        if (this.f4960k.size() > 0) {
            return i10 + this.f4960k.hashCode();
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i */
    public final V put(K k3, V v3) {
        b();
        int a10 = a(k3);
        if (a10 >= 0) {
            return this.f4959j.get(a10).setValue(v3);
        }
        b();
        boolean isEmpty = this.f4959j.isEmpty();
        int i10 = this.f4958i;
        if (isEmpty && !(this.f4959j instanceof ArrayList)) {
            this.f4959j = new ArrayList(i10);
        }
        int i11 = -(a10 + 1);
        if (i11 >= i10) {
            return f().put(k3, v3);
        }
        if (this.f4959j.size() == i10) {
            z0<K, V>.b remove = this.f4959j.remove(i10 - 1);
            f().put(remove.f4965i, remove.f4966j);
        }
        this.f4959j.add(i11, new b(k3, v3));
        return null;
    }

    public final V j(int i10) {
        b();
        V v3 = this.f4959j.remove(i10).f4966j;
        if (!this.f4960k.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<z0<K, V>.b> list = this.f4959j;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return (V) j(a10);
        }
        if (this.f4960k.isEmpty()) {
            return null;
        }
        return this.f4960k.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4960k.size() + this.f4959j.size();
    }
}
