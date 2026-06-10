package y9;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public abstract class i extends v {
    @Override // y9.r
    public final List<f0> S0() {
        return d1().S0();
    }

    @Override // y9.r
    public kotlin.reflect.jvm.internal.impl.types.l T0() {
        return d1().T0();
    }

    @Override // y9.r
    public final e0 U0() {
        return d1().U0();
    }

    @Override // y9.r
    public boolean V0() {
        return d1().V0();
    }

    public abstract v d1();

    @Override // y9.m0
    /* renamed from: e1 */
    public v Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        r P0 = eVar.P0(d1());
        v7.g.d(P0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return f1((v) P0);
    }

    public abstract i f1(v vVar);

    @Override // y9.r
    public final MemberScope w() {
        return d1().w();
    }
}
