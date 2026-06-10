package y9;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m8.e;

/* loaded from: classes.dex */
public final class j0 {
    public static final v a(r rVar) {
        v7.g.f(rVar, "<this>");
        m0 X0 = rVar.X0();
        v vVar = X0 instanceof v ? (v) X0 : null;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException(("This is should be simple type: " + rVar).toString());
    }

    public static final v b(v vVar, List<? extends f0> list, kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(vVar, "<this>");
        v7.g.f(list, "newArguments");
        v7.g.f(lVar, "newAttributes");
        if (list.isEmpty() && lVar == vVar.T0()) {
            return vVar;
        }
        if (list.isEmpty()) {
            return vVar.a1(lVar);
        }
        return KotlinTypeFactory.f(lVar, vVar.U0(), list, vVar.V0(), null);
    }

    public static r c(r rVar, List list, m8.e eVar, int i10) {
        List list2;
        if ((i10 & 1) != 0) {
            list = rVar.S0();
        }
        if ((i10 & 2) != 0) {
            eVar = rVar.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        } else {
            list2 = null;
        }
        v7.g.f(rVar, "<this>");
        v7.g.f(list, "newArguments");
        v7.g.f(eVar, "newAnnotations");
        v7.g.f(list2, "newArgumentsForUpperBound");
        if ((!list.isEmpty() && list != rVar.S0()) || eVar != rVar.getAnnotations()) {
            kotlin.reflect.jvm.internal.impl.types.l T0 = rVar.T0();
            if ((eVar instanceof m8.g) && eVar.isEmpty()) {
                eVar = e.a.f16014a;
            }
            kotlin.reflect.jvm.internal.impl.types.l J = ma.i.J(T0, eVar);
            m0 X0 = rVar.X0();
            if (X0 instanceof n) {
                n nVar = (n) X0;
                return KotlinTypeFactory.c(b(nVar.f18958j, list, J), b(nVar.f18959k, list2, J));
            } else if (X0 instanceof v) {
                return b((v) X0, list, J);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return rVar;
    }

    public static /* synthetic */ v d(v vVar, List list, kotlin.reflect.jvm.internal.impl.types.l lVar, int i10) {
        if ((i10 & 1) != 0) {
            list = vVar.S0();
        }
        if ((i10 & 2) != 0) {
            lVar = vVar.T0();
        }
        return b(vVar, list, lVar);
    }
}
