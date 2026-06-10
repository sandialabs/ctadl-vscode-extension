package kotlinx.serialization.json;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import qa.d;
import v7.g;
import va.o;

@d(with = o.class)
/* loaded from: classes.dex */
public final class JsonObject extends b implements Map<String, b>, w7.a, j$.util.Map {
    public static final a Companion = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, b> f15674i;

    /* loaded from: classes.dex */
    public static final class a {
        public final qa.b<JsonObject> serializer() {
            return o.f18229a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(Map<String, ? extends b> map) {
        g.f(map, "content");
        this.f15674i = map;
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ b compute(String str, java.util.function.BiFunction<? super String, ? super b, ? extends b> biFunction) {
        compute(str, BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ b computeIfAbsent(String str, java.util.function.Function<? super String, ? extends b> function) {
        computeIfAbsent(str, Function.VivifiedWrapper.convert(function));
        throw null;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ b computeIfPresent(String str, java.util.function.BiFunction<? super String, ? super b, ? extends b> biFunction) {
        computeIfPresent(str, BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        g.f(str, "key");
        return this.f15674i.containsKey(str);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        g.f(bVar, "value");
        return this.f15674i.containsValue(bVar);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<Map.Entry<String, b>> entrySet() {
        return this.f15674i.entrySet();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        return g.a(this.f15674i, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer<? super String, ? super b> biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        g.f(str, "key");
        return this.f15674i.get(str);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return this.f15674i.hashCode();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return this.f15674i.isEmpty();
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<String> keySet() {
        return this.f15674i.keySet();
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ b merge(String str, b bVar, java.util.function.BiFunction<? super b, ? super b, ? extends b> biFunction) {
        merge(str, bVar, BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map<? extends String, ? extends b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction<? super String, ? super b, ? extends b> biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.f15674i.size();
    }

    public final String toString() {
        return kotlin.collections.c.t2(this.f15674i.entrySet(), ",", "{", "}", JsonObject$toString$1.f15675j, 24);
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection<b> values() {
        return this.f15674i.values();
    }
}
