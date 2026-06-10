package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k0.m;
import k0.o;
import k0.q;
import v7.g;

/* loaded from: classes.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, w7.a {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (g.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new m((k0.c) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005a A[SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        k0.c cVar = (k0.c) this;
        Map map = (Map) obj;
        if (cVar.f12835j != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = cVar.get(key);
                if (g.a(value, obj2) && (obj2 != null || cVar.containsKey(key))) {
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

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((k0.c) this).f12835j == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new o((k0.c) this);
    }

    @Override // java.util.Map
    public final V put(K k3, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((k0.c) this).f12835j;
    }

    public final String toString() {
        return c.t2(entrySet(), ", ", "{", "}", new AbstractMap$toString$1(this), 24);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new q((k0.c) this);
    }
}
