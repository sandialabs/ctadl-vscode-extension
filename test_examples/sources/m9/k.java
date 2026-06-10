package m9;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* loaded from: classes.dex */
public final class k extends l {
    public k(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        v7.g.f(sVar, "module");
        kotlin.reflect.jvm.internal.impl.builtins.e u10 = sVar.u();
        u10.getClass();
        y9.v t10 = u10.t(PrimitiveType.f13300r);
        if (t10 != null) {
            return t10;
        }
        kotlin.reflect.jvm.internal.impl.builtins.e.a(58);
        throw null;
    }
}
