package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import n7.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f13321a;

    static {
        Set<PrimitiveType> set = PrimitiveType.f13296m;
        ArrayList arrayList = new ArrayList(l.Z1(set, 10));
        for (PrimitiveType primitiveType : set) {
            v7.g.f(primitiveType, "primitiveType");
            arrayList.add(g.f13354k.c(primitiveType.f13305i));
        }
        h9.c h10 = g.a.f13364f.h();
        v7.g.e(h10, "string.toSafe()");
        ArrayList A2 = kotlin.collections.c.A2(arrayList, h10);
        h9.c h11 = g.a.f13366h.h();
        v7.g.e(h11, "_boolean.toSafe()");
        ArrayList A22 = kotlin.collections.c.A2(A2, h11);
        h9.c h12 = g.a.f13368j.h();
        v7.g.e(h12, "_enum.toSafe()");
        ArrayList A23 = kotlin.collections.c.A2(A22, h12);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = A23.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h9.b.l((h9.c) it.next()));
        }
        f13321a = linkedHashSet;
    }
}
