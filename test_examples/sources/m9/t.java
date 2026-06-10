package m9;

import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* loaded from: classes.dex */
public final class t extends l {
    public t(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        v7.g.f(sVar, "module");
        l8.b a10 = FindClassInModuleKt.a(sVar, g.a.T);
        y9.v r3 = a10 != null ? a10.r() : null;
        return r3 == null ? aa.h.c(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : r3;
    }

    @Override // m9.g
    public final String toString() {
        return ((Number) this.f16022a).intValue() + ".toUInt()";
    }
}
