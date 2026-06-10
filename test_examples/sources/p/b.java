package p;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p.g;

/* loaded from: classes.dex */
public final class b<K, V> extends h<K, V> implements Map<K, V>, j$.util.Map {

    /* renamed from: p  reason: collision with root package name */
    public a f16541p;

    public b() {
    }

    public b(b bVar) {
        if (bVar != null) {
            int i10 = bVar.f16580k;
            b(this.f16580k + i10);
            if (this.f16580k != 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    put(bVar.i(i11), bVar.k(i11));
                }
            } else if (i10 > 0) {
                System.arraycopy(bVar.f16578i, 0, this.f16578i, 0, i10);
                System.arraycopy(bVar.f16579j, 0, this.f16579j, 0, i10 << 1);
                this.f16580k = i10;
            }
        }
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f16541p == null) {
            this.f16541p = new a(this);
        }
        a aVar = this.f16541p;
        if (aVar.f16561a == null) {
            aVar.f16561a = new g.b();
        }
        return aVar.f16561a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<K> keySet() {
        if (this.f16541p == null) {
            this.f16541p = new a(this);
        }
        a aVar = this.f16541p;
        if (aVar.f16562b == null) {
            aVar.f16562b = new g.c();
        }
        return aVar.f16562b;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        b(map.size() + this.f16580k);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection<V> values() {
        if (this.f16541p == null) {
            this.f16541p = new a(this);
        }
        a aVar = this.f16541p;
        if (aVar.c == null) {
            aVar.c = new g.e();
        }
        return aVar.c;
    }
}
