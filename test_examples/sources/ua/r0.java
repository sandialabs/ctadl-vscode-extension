package ua;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r0<K, V> extends z0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final q0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(qa.b<K> bVar, qa.b<V> bVar2) {
        super(bVar, bVar2);
        v7.g.f(bVar, "kSerializer");
        v7.g.f(bVar2, "vSerializer");
        this.c = new q0(bVar.a(), bVar2.a());
    }

    @Override // ua.z0, qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.c;
    }

    @Override // ua.a
    public final Object f() {
        return new LinkedHashMap();
    }

    @Override // ua.a
    public final int g(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        v7.g.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // ua.a
    public final Iterator h(Object obj) {
        Map map = (Map) obj;
        v7.g.f(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // ua.a
    public final int i(Object obj) {
        Map map = (Map) obj;
        v7.g.f(map, "<this>");
        return map.size();
    }

    @Override // ua.a
    public final Object l(Object obj) {
        v7.g.f(null, "<this>");
        throw null;
    }

    @Override // ua.a
    public final Object m(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        v7.g.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
