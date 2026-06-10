package ea;

import fa.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        g.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final c b(ArrayList arrayList) {
        c cVar = new c();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            MemberScope memberScope = (MemberScope) next;
            if ((memberScope == null || memberScope == MemberScope.a.f14741b) ? false : true) {
                cVar.add(next);
            }
        }
        return cVar;
    }
}
