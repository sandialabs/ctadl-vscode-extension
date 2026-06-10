package z8;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.p;
import l8.i0;
import ma.i;
import v7.g;
import y9.f0;
import y9.h0;
import y9.m;
import y9.r;

/* loaded from: classes.dex */
public final class c extends i {
    @Override // ma.i
    public final f0 s(i0 i0Var, m mVar, p pVar, r rVar) {
        g.f(mVar, "typeAttr");
        g.f(pVar, "typeParameterUpperBoundEraser");
        g.f(rVar, "erasedUpperBound");
        if (!(mVar instanceof a)) {
            return super.s(i0Var, mVar, pVar, rVar);
        }
        a aVar = (a) mVar;
        if (!aVar.f19178d) {
            aVar = aVar.f(JavaTypeFlexibility.INFLEXIBLE);
        }
        int ordinal = aVar.c.ordinal();
        Variance variance = Variance.INVARIANT;
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return new h0(rVar, variance);
            }
            throw new NoWhenBranchMatchedException();
        } else if (!i0Var.t().f14974j) {
            return new h0(DescriptorUtilsKt.e(i0Var).o(), variance);
        } else {
            List<i0> e10 = rVar.U0().e();
            g.e(e10, "erasedUpperBound.constructor.parameters");
            if (!e10.isEmpty()) {
                return new h0(rVar, Variance.OUT_VARIANCE);
            }
            return kotlin.reflect.jvm.internal.impl.types.r.n(i0Var, aVar);
        }
    }
}
