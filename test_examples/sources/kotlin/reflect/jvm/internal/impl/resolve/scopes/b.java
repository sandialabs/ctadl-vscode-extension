package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import h9.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n7.n;
import v7.g;

/* loaded from: classes.dex */
public final class b {
    public static final HashSet a(Iterable iterable) {
        g.f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<e> g10 = ((MemberScope) it.next()).g();
            if (g10 == null) {
                return null;
            }
            n.f2(g10, hashSet);
        }
        return hashSet;
    }
}
