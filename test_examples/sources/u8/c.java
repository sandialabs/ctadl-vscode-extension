package u8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<h9.c, h9.e> f17841a;

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f17842b;
    public static final Set<h9.c> c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<h9.e> f17843d;

    static {
        h9.d dVar = g.a.f13368j;
        h9.c cVar = g.a.F;
        Map<h9.c, h9.e> M1 = kotlin.collections.d.M1(new Pair(m0.b.p(dVar, "name"), h9.e.k("name")), new Pair(m0.b.p(dVar, "ordinal"), h9.e.k("ordinal")), new Pair(g.a.B.c(h9.e.k("size")), h9.e.k("size")), new Pair(cVar.c(h9.e.k("size")), h9.e.k("size")), new Pair(m0.b.p(g.a.f13363e, "length"), h9.e.k("length")), new Pair(cVar.c(h9.e.k("keys")), h9.e.k("keySet")), new Pair(cVar.c(h9.e.k("values")), h9.e.k("values")), new Pair(cVar.c(h9.e.k("entries")), h9.e.k("entrySet")));
        f17841a = M1;
        Set<Map.Entry<h9.c, h9.e>> entrySet = M1.entrySet();
        ArrayList arrayList = new ArrayList(n7.l.Z1(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((h9.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            h9.e eVar = (h9.e) pair.f12963j;
            Object obj = linkedHashMap.get(eVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(eVar, obj);
            }
            ((List) obj).add((h9.e) pair.f12962i);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.b.O0(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            v7.g.f(iterable, "<this>");
            linkedHashMap2.put(key, kotlin.collections.c.L2(kotlin.collections.c.P2(iterable)));
        }
        f17842b = linkedHashMap2;
        Set<h9.c> keySet = f17841a.keySet();
        c = keySet;
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(keySet, 10));
        for (h9.c cVar2 : keySet) {
            arrayList2.add(cVar2.f());
        }
        f17843d = kotlin.collections.c.Q2(arrayList2);
    }
}
