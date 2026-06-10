package n7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class x extends kotlin.collections.d {
    public static final List Q1(LinkedHashMap linkedHashMap) {
        if (linkedHashMap.size() == 0) {
            return EmptyList.f12981i;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            return EmptyList.f12981i;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return a1.c.N0(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
