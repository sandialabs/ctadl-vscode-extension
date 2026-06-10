package m9;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* loaded from: classes.dex */
public final class h extends g<Double> {
    public h(double d5) {
        super(Double.valueOf(d5));
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        v7.g.f(sVar, "module");
        kotlin.reflect.jvm.internal.impl.builtins.e u10 = sVar.u();
        u10.getClass();
        y9.v t10 = u10.t(PrimitiveType.f13303u);
        if (t10 != null) {
            return t10;
        }
        kotlin.reflect.jvm.internal.impl.builtins.e.a(61);
        throw null;
    }

    @Override // m9.g
    public final String toString() {
        return ((Number) this.f16022a).doubleValue() + ".toDouble()";
    }
}
