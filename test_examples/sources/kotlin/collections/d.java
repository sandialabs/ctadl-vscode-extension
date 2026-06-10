package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import n7.w;
import v7.g;

/* loaded from: classes.dex */
public class d extends m0.b {
    public static final Map K1() {
        EmptyMap emptyMap = EmptyMap.f12982i;
        g.d(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final Object L1(Object obj, Map map) {
        g.f(map, "<this>");
        if (map instanceof w) {
            return ((w) map).h();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static final Map M1(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(m0.b.O0(pairArr.length));
            for (Pair pair : pairArr) {
                linkedHashMap.put(pair.f12962i, pair.f12963j);
            }
            return linkedHashMap;
        }
        return K1();
    }

    public static final Map N1(List list) {
        g.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(m0.b.O0(list.size()));
                O1(list, linkedHashMap);
                return linkedHashMap;
            }
            return m0.b.P0((Pair) list.get(0));
        }
        return K1();
    }

    public static final void O1(List list, LinkedHashMap linkedHashMap) {
        g.f(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f12962i, pair.f12963j);
        }
    }

    public static final LinkedHashMap P1(Map map) {
        g.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
