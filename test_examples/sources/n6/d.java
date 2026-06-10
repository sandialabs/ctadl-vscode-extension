package n6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import n6.c;
import v7.g;

/* loaded from: classes.dex */
public final class d {
    public static final Object a(c cVar, EmptyList emptyList) {
        g.f(cVar, "<this>");
        if (cVar instanceof c.a) {
            return emptyList;
        }
        if (cVar instanceof c.b) {
            return ((c.b) cVar).f16111a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
