package k8;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.n;
import kotlin.reflect.jvm.internal.impl.types.o;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.i0;
import n7.l;
import y9.v;

/* loaded from: classes.dex */
public final class g {
    public static final n a(l8.b bVar, o8.b bVar2) {
        v7.g.f(bVar2, "to");
        bVar.x().size();
        bVar2.x().size();
        o.a aVar = o.f15066b;
        List<i0> x3 = bVar.x();
        v7.g.e(x3, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(l.Z1(x3, 10));
        for (i0 i0Var : x3) {
            arrayList.add(i0Var.o());
        }
        List<i0> x10 = bVar2.x();
        v7.g.e(x10, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(l.Z1(x10, 10));
        for (i0 i0Var2 : x10) {
            v r3 = i0Var2.r();
            v7.g.e(r3, "it.defaultType");
            arrayList2.add(TypeUtilsKt.a(r3));
        }
        return new n(kotlin.collections.d.N1(kotlin.collections.c.S2(arrayList, arrayList2)), false);
    }
}
