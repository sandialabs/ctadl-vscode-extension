package u8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f17845a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<h9.c, h9.c> f17846b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f17845a = linkedHashMap;
        b(h9.h.f11596r, a("java.util.ArrayList", "java.util.LinkedList"));
        b(h9.h.f11597s, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(h9.h.f11598t, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(h9.b.l(new h9.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(h9.b.l(new h9.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((h9.b) entry.getKey()).b(), ((h9.b) entry.getValue()).b()));
        }
        f17846b = kotlin.collections.d.N1(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h9.b.l(new h9.c(str)));
        }
        return arrayList;
    }

    public static void b(h9.b bVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            h9.b bVar2 = (h9.b) next;
            f17845a.put(next, bVar);
        }
    }
}
