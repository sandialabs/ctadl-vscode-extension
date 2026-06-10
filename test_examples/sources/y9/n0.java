package y9;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public abstract class n0 extends r {
    @Override // y9.r
    public final List<f0> S0() {
        return Y0().S0();
    }

    @Override // y9.r
    public final kotlin.reflect.jvm.internal.impl.types.l T0() {
        return Y0().T0();
    }

    @Override // y9.r
    public final e0 U0() {
        return Y0().U0();
    }

    @Override // y9.r
    public final boolean V0() {
        return Y0().V0();
    }

    @Override // y9.r
    public final m0 X0() {
        r Y0 = Y0();
        while (Y0 instanceof n0) {
            Y0 = ((n0) Y0).Y0();
        }
        v7.g.d(Y0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (m0) Y0;
    }

    public abstract r Y0();

    public boolean Z0() {
        return true;
    }

    public final String toString() {
        return Z0() ? Y0().toString() : "<Not computed yet>";
    }

    @Override // y9.r
    public final MemberScope w() {
        return Y0().w();
    }
}
