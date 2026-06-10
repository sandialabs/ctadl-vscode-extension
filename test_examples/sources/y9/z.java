package y9;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public final class z extends g0 {

    /* renamed from: a  reason: collision with root package name */
    public final v f18968a;

    public z(kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
        v7.g.f(eVar, "kotlinBuiltIns");
        v p10 = eVar.p();
        v7.g.e(p10, "kotlinBuiltIns.nullableAnyType");
        this.f18968a = p10;
    }

    @Override // y9.f0
    public final Variance a() {
        return Variance.OUT_VARIANCE;
    }

    @Override // y9.f0
    public final r b() {
        return this.f18968a;
    }

    @Override // y9.f0
    public final f0 c(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // y9.f0
    public final boolean d() {
        return true;
    }
}
