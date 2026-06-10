package kotlin.reflect.jvm.internal.impl.resolve;

import fa.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.c;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, l<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        g.f(collection, "<this>");
        g.f(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        d dVar = new d();
        while (!linkedList.isEmpty()) {
            Object n22 = c.n2(linkedList);
            d dVar2 = new d();
            ArrayList g10 = OverridingUtil.g(n22, linkedList, lVar, new OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(dVar2));
            if (g10.size() == 1 && dVar2.isEmpty()) {
                Object B2 = c.B2(g10);
                g.e(B2, "overridableGroup.single()");
                dVar.add(B2);
            } else {
                Object obj = (Object) OverridingUtil.s(g10, lVar);
                kotlin.reflect.jvm.internal.impl.descriptors.a U = lVar.U(obj);
                Iterator it = g10.iterator();
                while (it.hasNext()) {
                    Object obj2 = (Object) it.next();
                    g.e(obj2, "it");
                    if (!OverridingUtil.k(U, lVar.U(obj2))) {
                        dVar2.add(obj2);
                    }
                }
                if (!dVar2.isEmpty()) {
                    dVar.addAll(dVar2);
                }
                dVar.add(obj);
            }
        }
        return dVar;
    }
}
