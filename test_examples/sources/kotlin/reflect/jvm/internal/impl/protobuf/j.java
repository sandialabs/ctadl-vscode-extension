package kotlin.reflect.jvm.internal.impl.protobuf;

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
public class j<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int n = 0;

    /* renamed from: i  reason: collision with root package name */
    public final int f14574i;

    /* renamed from: j  reason: collision with root package name */
    public List<j<K, V>.b> f14575j = Collections.emptyList();

    /* renamed from: k  reason: collision with root package name */
    public Map<K, V> f14576k = Collections.emptyMap();

    /* renamed from: l  reason: collision with root package name */
    public boolean f14577l;

    /* renamed from: m  reason: collision with root package name */
    public volatile j<K, V>.d f14578m;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0164a f14579a = new C0164a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f14580b = new b();

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0164a implements Iterator<Object>, j$.util.Iterator {
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
                return a.f14579a;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Comparable<j<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: i  reason: collision with root package name */
        public final K f14581i;

        /* renamed from: j  reason: collision with root package name */
        public V f14582j;

        public b() {
            throw null;
        }

        public b(K k3, V v3) {
            this.f14581i = k3;
            this.f14582j = v3;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f14581i.compareTo(((b) obj).f14581i);
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
            K k3 = this.f14581i;
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
                V v3 = this.f14582j;
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
            return this.f14581i;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f14582j;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int i10 = 0;
            K k3 = this.f14581i;
            int hashCode = k3 == null ? 0 : k3.hashCode();
            V v3 = this.f14582j;
            if (v3 != null) {
                i10 = v3.hashCode();
            }
            return i10 ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            int i10 = j.n;
            j.this.b();
            V v10 = this.f14582j;
            this.f14582j = v3;
            return v10;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f14581i);
            String valueOf2 = String.valueOf(this.f14582j);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public class c implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f14584i = -1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f14585j;

        /* renamed from: k  reason: collision with root package name */
        public java.util.Iterator<Map.Entry<K, V>> f14586k;

        public c() {
        }

        public final java.util.Iterator<Map.Entry<K, V>> a() {
            if (this.f14586k == null) {
                this.f14586k = j.this.f14576k.entrySet().iterator();
            }
            return this.f14586k;
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
            if (this.f14584i + 1 < j.this.f14575j.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Map.Entry<K, V> next;
            this.f14585j = true;
            int i10 = this.f14584i + 1;
            this.f14584i = i10;
            j jVar = j.this;
            if (i10 < jVar.f14575j.size()) {
                next = jVar.f14575j.get(this.f14584i);
            } else {
                next = a().next();
            }
            return next;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f14585j) {
                this.f14585j = false;
                int i10 = j.n;
                j jVar = j.this;
                jVar.b();
                if (this.f14584i < jVar.f14575j.size()) {
                    int i11 = this.f14584i;
                    this.f14584i = i11 - 1;
                    jVar.f(i11);
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
                j.this.e((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                j.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return j.this.size();
        }
    }

    public j(int i10) {
        this.f14574i = i10;
    }

    public final int a(K k3) {
        int size = this.f14575j.size() - 1;
        if (size >= 0) {
            int compareTo = k3.compareTo(this.f14575j.get(size).f14581i);
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
            int compareTo2 = k3.compareTo(this.f14575j.get(i11).f14581i);
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
        if (this.f14577l) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable<Map.Entry<K, V>> c() {
        return this.f14576k.isEmpty() ? a.f14580b : this.f14576k.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f14575j.isEmpty()) {
            this.f14575j.clear();
        }
        if (this.f14576k.isEmpty()) {
            return;
        }
        this.f14576k.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f14576k.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final SortedMap<K, V> d() {
        b();
        if (this.f14576k.isEmpty() && !(this.f14576k instanceof TreeMap)) {
            this.f14576k = new TreeMap();
        }
        return (SortedMap) this.f14576k;
    }

    public final V e(K k3, V v3) {
        b();
        int a10 = a(k3);
        if (a10 >= 0) {
            return this.f14575j.get(a10).setValue(v3);
        }
        b();
        boolean isEmpty = this.f14575j.isEmpty();
        int i10 = this.f14574i;
        if (isEmpty && !(this.f14575j instanceof ArrayList)) {
            this.f14575j = new ArrayList(i10);
        }
        int i11 = -(a10 + 1);
        if (i11 >= i10) {
            return d().put(k3, v3);
        }
        if (this.f14575j.size() == i10) {
            j<K, V>.b remove = this.f14575j.remove(i10 - 1);
            d().put(remove.f14581i, remove.f14582j);
        }
        this.f14575j.add(i11, new b(k3, v3));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f14578m == null) {
            this.f14578m = new d();
        }
        return this.f14578m;
    }

    public final V f(int i10) {
        b();
        V v3 = this.f14575j.remove(i10).f14582j;
        if (!this.f14576k.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = d().entrySet().iterator();
            List<j<K, V>.b> list = this.f14575j;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f14575j.get(a10).f14582j;
        }
        return this.f14576k.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return (V) f(a10);
        }
        if (this.f14576k.isEmpty()) {
            return null;
        }
        return this.f14576k.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14576k.size() + this.f14575j.size();
    }
}
