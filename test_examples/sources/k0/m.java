package k0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m<K, V> extends n7.e<Map.Entry<? extends K, ? extends V>> implements i0.b<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: i  reason: collision with root package name */
    public final c<K, V> f12852i;

    public m(c<K, V> cVar) {
        v7.g.f(cVar, "map");
        this.f12852i = cVar;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        c<K, V> cVar = this.f12852i;
        cVar.getClass();
        return cVar.f12835j;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        v7.g.f(entry, "element");
        Object key = entry.getKey();
        c<K, V> cVar = this.f12852i;
        V v3 = cVar.get(key);
        if (v3 != null) {
            return v7.g.a(v3, entry.getValue());
        }
        if (entry.getValue() != null || !cVar.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new n(this.f12852i.f12834i);
    }
}
