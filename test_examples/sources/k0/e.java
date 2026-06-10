package k0;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e<K, V> extends AbstractMap<Object, Object> implements Map<Object, Object>, w7.c, j$.util.Map {

    /* renamed from: i  reason: collision with root package name */
    public c<K, V> f12839i;

    /* renamed from: j  reason: collision with root package name */
    public m0.b f12840j;

    /* renamed from: k  reason: collision with root package name */
    public s<K, V> f12841k;

    /* renamed from: l  reason: collision with root package name */
    public V f12842l;

    /* renamed from: m  reason: collision with root package name */
    public int f12843m;
    public int n;

    public e(c<K, V> cVar) {
        v7.g.f(cVar, "map");
        this.f12839i = cVar;
        this.f12840j = new m0.b();
        this.f12841k = cVar.f12834i;
        this.n = cVar.f12835j;
    }

    public final c<K, V> a() {
        s<K, V> sVar = this.f12841k;
        c<K, V> cVar = this.f12839i;
        if (sVar != cVar.f12834i) {
            this.f12840j = new m0.b();
            cVar = new c<>(this.f12841k, this.n);
        }
        this.f12839i = cVar;
        return cVar;
    }

    public final void b(int i10) {
        this.n = i10;
        this.f12843m++;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void clear() {
        s sVar = s.f12855e;
        s<K, V> sVar2 = s.f12855e;
        v7.g.d(sVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f12841k = sVar2;
        b(0);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function<? super Object, ? extends Object> function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return this.f12841k.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<Map.Entry<Object, Object>> entrySet() {
        return new g(this);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer<? super Object, ? super Object> biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V get(Object obj) {
        return (V) this.f12841k.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<Object> keySet() {
        return new i(this);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V put(K k3, V v3) {
        this.f12842l = null;
        this.f12841k = this.f12841k.l(k3 != null ? k3.hashCode() : 0, k3, v3, 0, this);
        return this.f12842l;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        c<K, V> cVar;
        e eVar;
        v7.g.f(map, "from");
        c<K, V> cVar2 = null;
        if (map instanceof c) {
            cVar = (c) map;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            if (map instanceof e) {
                eVar = (e) map;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                cVar2 = eVar.a();
            }
        } else {
            cVar2 = cVar;
        }
        if (cVar2 != null) {
            m0.a aVar = new m0.a(0);
            int i10 = this.n;
            s<K, V> sVar = this.f12841k;
            s<K, V> sVar2 = cVar2.f12834i;
            v7.g.d(sVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f12841k = sVar.m(sVar2, 0, aVar, this);
            int i11 = (cVar2.f12835j + i10) - aVar.f15889a;
            if (i10 != i11) {
                b(i11);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V remove(Object obj) {
        this.f12842l = null;
        s<K, V> n = this.f12841k.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            s sVar = s.f12855e;
            n = s.f12855e;
            v7.g.d(n, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f12841k = n;
        return this.f12842l;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int size() {
        return this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Collection<Object> values() {
        return new k(this);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.n;
        s<K, V> o10 = this.f12841k.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o10 == null) {
            s sVar = s.f12855e;
            o10 = s.f12855e;
            v7.g.d(o10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f12841k = o10;
        return i10 != this.n;
    }
}
