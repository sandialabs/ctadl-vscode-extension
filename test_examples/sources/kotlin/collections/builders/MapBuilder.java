package kotlin.collections.builders;

import b8.h;
import b8.i;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k0.g;
import kotlin.Metadata;
import w7.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\b\t\n\u000b\f\rB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, w7.c {

    /* renamed from: i  reason: collision with root package name */
    public K[] f13000i;

    /* renamed from: j  reason: collision with root package name */
    public V[] f13001j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f13002k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f13003l;

    /* renamed from: m  reason: collision with root package name */
    public int f13004m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f13005o;

    /* renamed from: p  reason: collision with root package name */
    public int f13006p;

    /* renamed from: q  reason: collision with root package name */
    public o7.a<K> f13007q;

    /* renamed from: r  reason: collision with root package name */
    public o7.b<V> f13008r;

    /* renamed from: s  reason: collision with root package name */
    public g f13009s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f13010t;

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, w7.a, j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            v7.g.f(mapBuilder, "map");
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
        public final Object next() {
            int i10 = this.f13014j;
            MapBuilder<K, V> mapBuilder = this.f13013i;
            if (i10 < mapBuilder.n) {
                this.f13014j = i10 + 1;
                this.f13015k = i10;
                c cVar = new c(mapBuilder, i10);
                a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, c.a {

        /* renamed from: i  reason: collision with root package name */
        public final MapBuilder<K, V> f13011i;

        /* renamed from: j  reason: collision with root package name */
        public final int f13012j;

        public c(MapBuilder<K, V> mapBuilder, int i10) {
            v7.g.f(mapBuilder, "map");
            this.f13011i = mapBuilder;
            this.f13012j = i10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (v7.g.a(entry.getKey(), getKey()) && v7.g.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f13011i.f13000i[this.f13012j];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V[] vArr = this.f13011i.f13001j;
            v7.g.c(vArr);
            return vArr[this.f13012j];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            MapBuilder<K, V> mapBuilder = this.f13011i;
            mapBuilder.b();
            V[] vArr = mapBuilder.f13001j;
            if (vArr == null) {
                vArr = (V[]) m0.b.v(mapBuilder.f13000i.length);
                mapBuilder.f13001j = vArr;
            }
            int i10 = this.f13012j;
            V v10 = vArr[i10];
            vArr[i10] = v3;
            return v10;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class d<K, V> {

        /* renamed from: i  reason: collision with root package name */
        public final MapBuilder<K, V> f13013i;

        /* renamed from: j  reason: collision with root package name */
        public int f13014j;

        /* renamed from: k  reason: collision with root package name */
        public int f13015k;

        public d(MapBuilder<K, V> mapBuilder) {
            v7.g.f(mapBuilder, "map");
            this.f13013i = mapBuilder;
            this.f13015k = -1;
            a();
        }

        public final void a() {
            while (true) {
                int i10 = this.f13014j;
                MapBuilder<K, V> mapBuilder = this.f13013i;
                if (i10 < mapBuilder.n && mapBuilder.f13002k[i10] < 0) {
                    this.f13014j = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            if (this.f13014j < this.f13013i.n) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z10;
            if (this.f13015k != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                MapBuilder<K, V> mapBuilder = this.f13013i;
                mapBuilder.b();
                mapBuilder.n(this.f13015k);
                this.f13015k = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class e<K, V> extends d<K, V> implements java.util.Iterator<K>, w7.a, j$.util.Iterator {
        public e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
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
        public final K next() {
            int i10 = this.f13014j;
            MapBuilder<K, V> mapBuilder = this.f13013i;
            if (i10 < mapBuilder.n) {
                this.f13014j = i10 + 1;
                this.f13015k = i10;
                K k3 = mapBuilder.f13000i[i10];
                a();
                return k3;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static final class f<K, V> extends d<K, V> implements java.util.Iterator<V>, w7.a, j$.util.Iterator {
        public f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
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
        public final V next() {
            int i10 = this.f13014j;
            MapBuilder<K, V> mapBuilder = this.f13013i;
            if (i10 < mapBuilder.n) {
                this.f13014j = i10 + 1;
                this.f13015k = i10;
                V[] vArr = mapBuilder.f13001j;
                v7.g.c(vArr);
                V v3 = vArr[this.f13015k];
                a();
                return v3;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new a();
    }

    public MapBuilder() {
        int highestOneBit = Integer.highestOneBit(24);
        this.f13000i = (K[]) m0.b.v(8);
        this.f13001j = null;
        this.f13002k = new int[8];
        this.f13003l = new int[highestOneBit];
        this.f13004m = 2;
        this.n = 0;
        this.f13005o = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(K k3) {
        b();
        while (true) {
            int k10 = k(k3);
            int i10 = this.f13004m * 2;
            int length = this.f13003l.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f13003l;
                int i12 = iArr[k10];
                if (i12 <= 0) {
                    int i13 = this.n;
                    K[] kArr = this.f13000i;
                    if (i13 >= kArr.length) {
                        f(1);
                    } else {
                        int i14 = i13 + 1;
                        this.n = i14;
                        kArr[i13] = k3;
                        this.f13002k[i13] = k10;
                        iArr[k10] = i14;
                        this.f13006p++;
                        if (i11 > this.f13004m) {
                            this.f13004m = i11;
                        }
                        return i13;
                    }
                } else if (v7.g.a(this.f13000i[i12 - 1], k3)) {
                    return -i12;
                } else {
                    i11++;
                    if (i11 > i10) {
                        m(this.f13003l.length * 2);
                        break;
                    }
                    int i15 = k10 - 1;
                    if (k10 == 0) {
                        k10 = this.f13003l.length - 1;
                    } else {
                        k10 = i15;
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.f13010t) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean c(Collection<?> collection) {
        v7.g.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!d((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        h it = new i(0, this.n - 1).iterator();
        while (it.f6502k) {
            int nextInt = it.nextInt();
            int[] iArr = this.f13002k;
            int i10 = iArr[nextInt];
            if (i10 >= 0) {
                this.f13003l[i10] = 0;
                iArr[nextInt] = -1;
            }
        }
        m0.b.d1(0, this.n, this.f13000i);
        V[] vArr = this.f13001j;
        if (vArr != null) {
            m0.b.d1(0, this.n, vArr);
        }
        this.f13006p = 0;
        this.n = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i10;
        int i11 = this.n;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            } else if (this.f13002k[i11] >= 0) {
                V[] vArr = this.f13001j;
                v7.g.c(vArr);
                if (v7.g.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        return i10 >= 0;
    }

    public final boolean d(Map.Entry<? extends K, ? extends V> entry) {
        v7.g.f(entry, "entry");
        int g10 = g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        V[] vArr = this.f13001j;
        v7.g.c(vArr);
        return v7.g.a(vArr[g10], entry.getValue());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        g gVar = this.f13009s;
        if (gVar == null) {
            g gVar2 = new g(this);
            this.f13009s = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f13006p == map.size() && c(map.entrySet())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        int length;
        V[] vArr;
        int i11 = this.n;
        int i12 = i10 + i11;
        if (i12 >= 0) {
            K[] kArr = this.f13000i;
            if (i12 > kArr.length) {
                int length2 = (kArr.length * 3) / 2;
                if (i12 <= length2) {
                    i12 = length2;
                }
                K[] kArr2 = (K[]) Arrays.copyOf(kArr, i12);
                v7.g.e(kArr2, "copyOf(this, newSize)");
                this.f13000i = kArr2;
                V[] vArr2 = this.f13001j;
                if (vArr2 != null) {
                    vArr = (V[]) Arrays.copyOf(vArr2, i12);
                    v7.g.e(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.f13001j = vArr;
                int[] copyOf = Arrays.copyOf(this.f13002k, i12);
                v7.g.e(copyOf, "copyOf(this, newSize)");
                this.f13002k = copyOf;
                if (i12 < 1) {
                    i12 = 1;
                }
                length = Integer.highestOneBit(i12 * 3);
                if (length <= this.f13003l.length) {
                    return;
                }
            } else if ((i11 + i12) - this.f13006p > kArr.length) {
                length = this.f13003l.length;
            } else {
                return;
            }
            m(length);
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(K k3) {
        int k10 = k(k3);
        int i10 = this.f13004m;
        while (true) {
            int i11 = this.f13003l[k10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (v7.g.a(this.f13000i[i12], k3)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = k10 - 1;
            if (k10 == 0) {
                k10 = this.f13003l.length - 1;
            } else {
                k10 = i13;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        V[] vArr = this.f13001j;
        v7.g.c(vArr);
        return vArr[g10];
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i10;
        int i11;
        b bVar = new b(this);
        int i12 = 0;
        while (bVar.hasNext()) {
            int i13 = bVar.f13014j;
            MapBuilder<K, V> mapBuilder = bVar.f13013i;
            if (i13 < mapBuilder.n) {
                bVar.f13014j = i13 + 1;
                bVar.f13015k = i13;
                K k3 = mapBuilder.f13000i[i13];
                if (k3 != null) {
                    i10 = k3.hashCode();
                } else {
                    i10 = 0;
                }
                V[] vArr = mapBuilder.f13001j;
                v7.g.c(vArr);
                V v3 = vArr[bVar.f13015k];
                if (v3 != null) {
                    i11 = v3.hashCode();
                } else {
                    i11 = 0;
                }
                bVar.a();
                i12 += i10 ^ i11;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i12;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13006p == 0;
    }

    public final int k(K k3) {
        return ((k3 != null ? k3.hashCode() : 0) * (-1640531527)) >>> this.f13005o;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        o7.a<K> aVar = this.f13007q;
        if (aVar == null) {
            o7.a<K> aVar2 = new o7.a<>(this);
            this.f13007q = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final void m(int i10) {
        boolean z10;
        int i11;
        if (this.n > this.f13006p) {
            V[] vArr = this.f13001j;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i11 = this.n;
                if (i12 >= i11) {
                    break;
                }
                if (this.f13002k[i12] >= 0) {
                    K[] kArr = this.f13000i;
                    kArr[i13] = kArr[i12];
                    if (vArr != null) {
                        vArr[i13] = vArr[i12];
                    }
                    i13++;
                }
                i12++;
            }
            m0.b.d1(i13, i11, this.f13000i);
            if (vArr != null) {
                m0.b.d1(i13, this.n, vArr);
            }
            this.n = i13;
        }
        int[] iArr = this.f13003l;
        if (i10 != iArr.length) {
            this.f13003l = new int[i10];
            this.f13005o = Integer.numberOfLeadingZeros(i10) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i14 = 0;
        while (i14 < this.n) {
            int i15 = i14 + 1;
            int k3 = k(this.f13000i[i14]);
            int i16 = this.f13004m;
            while (true) {
                int[] iArr2 = this.f13003l;
                if (iArr2[k3] == 0) {
                    iArr2[k3] = i15;
                    this.f13002k[i14] = k3;
                    z10 = true;
                    break;
                }
                i16--;
                if (i16 < 0) {
                    z10 = false;
                    break;
                }
                int i17 = k3 - 1;
                if (k3 == 0) {
                    k3 = iArr2.length - 1;
                } else {
                    k3 = i17;
                }
            }
            if (z10) {
                i14 = i15;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10) {
        K[] kArr = this.f13000i;
        v7.g.f(kArr, "<this>");
        kArr[i10] = null;
        int i11 = this.f13002k[i10];
        int i12 = this.f13004m * 2;
        int length = this.f13003l.length / 2;
        if (i12 > length) {
            i12 = length;
        }
        int i13 = i12;
        int i14 = 0;
        int i15 = i11;
        while (true) {
            int i16 = i11 - 1;
            if (i11 == 0) {
                i11 = this.f13003l.length - 1;
            } else {
                i11 = i16;
            }
            i14++;
            if (i14 > this.f13004m) {
                this.f13003l[i15] = 0;
                break;
            }
            int[] iArr = this.f13003l;
            int i17 = iArr[i11];
            if (i17 == 0) {
                iArr[i15] = 0;
                break;
            }
            if (i17 < 0) {
                iArr[i15] = -1;
            } else {
                int i18 = i17 - 1;
                int[] iArr2 = this.f13003l;
                if (((k(this.f13000i[i18]) - i11) & (iArr2.length - 1)) >= i14) {
                    iArr2[i15] = i17;
                    this.f13002k[i18] = i15;
                }
                i13--;
                if (i13 < 0) {
                    this.f13003l[i15] = -1;
                    break;
                }
            }
            i15 = i11;
            i14 = 0;
            i13--;
            if (i13 < 0) {
            }
        }
        this.f13002k[i10] = -1;
        this.f13006p--;
    }

    @Override // java.util.Map
    public final V put(K k3, V v3) {
        b();
        int a10 = a(k3);
        V[] vArr = this.f13001j;
        if (vArr == null) {
            vArr = (V[]) m0.b.v(this.f13000i.length);
            this.f13001j = vArr;
        }
        if (a10 < 0) {
            int i10 = (-a10) - 1;
            V v10 = vArr[i10];
            vArr[i10] = v3;
            return v10;
        }
        vArr[a10] = v3;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        v7.g.f(map, "from");
        b();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
                int a10 = a(entry.getKey());
                V[] vArr = this.f13001j;
                if (vArr == null) {
                    vArr = (V[]) m0.b.v(this.f13000i.length);
                    this.f13001j = vArr;
                }
                if (a10 >= 0) {
                    vArr[a10] = entry.getValue();
                } else {
                    int i10 = (-a10) - 1;
                    if (!v7.g.a(entry.getValue(), vArr[i10])) {
                        vArr[i10] = entry.getValue();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        b();
        int g10 = g(obj);
        if (g10 < 0) {
            g10 = -1;
        } else {
            n(g10);
        }
        if (g10 < 0) {
            return null;
        }
        V[] vArr = this.f13001j;
        v7.g.c(vArr);
        V v3 = vArr[g10];
        vArr[g10] = null;
        return v3;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13006p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f13006p * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i10 = 0;
        while (bVar.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            int i11 = bVar.f13014j;
            MapBuilder<K, V> mapBuilder = bVar.f13013i;
            if (i11 < mapBuilder.n) {
                bVar.f13014j = i11 + 1;
                bVar.f13015k = i11;
                K k3 = mapBuilder.f13000i[i11];
                if (v7.g.a(k3, mapBuilder)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(k3);
                }
                sb.append('=');
                V[] vArr = mapBuilder.f13001j;
                v7.g.c(vArr);
                V v3 = vArr[bVar.f13015k];
                if (v7.g.a(v3, mapBuilder)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(v3);
                }
                bVar.a();
                i10++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        v7.g.e(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        o7.b<V> bVar = this.f13008r;
        if (bVar == null) {
            o7.b<V> bVar2 = new o7.b<>(this);
            this.f13008r = bVar2;
            return bVar2;
        }
        return bVar;
    }
}
