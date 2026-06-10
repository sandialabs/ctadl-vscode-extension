package y9;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public abstract class r implements m8.a, ba.f {

    /* renamed from: i  reason: collision with root package name */
    public int f18964i;

    public abstract List<f0> S0();

    public abstract kotlin.reflect.jvm.internal.impl.types.l T0();

    public abstract e0 U0();

    public abstract boolean V0();

    public abstract r W0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar);

    public abstract m0 X0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (V0() == rVar.V0()) {
            m0 X0 = X0();
            m0 X02 = rVar.X0();
            v7.g.f(X0, "a");
            v7.g.f(X02, "b");
            if (v8.b.K(kotlin.reflect.jvm.internal.impl.types.checker.h.f15004a, X0, X02)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.types.d.a(T0());
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f18964i;
        if (i10 != 0) {
            return i10;
        }
        if (m0.b.D0(this)) {
            hashCode = super.hashCode();
        } else {
            int hashCode2 = S0().hashCode();
            hashCode = (V0() ? 1 : 0) + ((hashCode2 + (U0().hashCode() * 31)) * 31);
        }
        this.f18964i = hashCode;
        return hashCode;
    }

    public abstract MemberScope w();
}
