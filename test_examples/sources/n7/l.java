package n7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class l extends a1.c {
    public static final int Z1(Iterable iterable, int i10) {
        v7.g.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final ArrayList a2(Collection collection) {
        v7.g.f(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n.f2((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    public static final LinkedHashSet b2(Set set, Object obj) {
        v7.g.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.b.O0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final LinkedHashSet c2(Set set, Collection collection) {
        int size;
        v7.g.f(set, "<this>");
        v7.g.f(collection, "elements");
        Integer valueOf = Integer.valueOf(collection.size());
        if (valueOf != null) {
            size = set.size() + valueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.b.O0(size));
        linkedHashSet.addAll(set);
        n.f2(collection, linkedHashSet);
        return linkedHashSet;
    }
}
