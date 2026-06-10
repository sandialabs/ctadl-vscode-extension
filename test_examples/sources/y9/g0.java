package y9;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public abstract class g0 implements f0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return d() == f0Var.d() && a() == f0Var.a() && b().equals(f0Var.b());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = a().hashCode() * 31;
        if (kotlin.reflect.jvm.internal.impl.types.r.q(b())) {
            return hashCode + 19;
        }
        return hashCode + (d() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (d()) {
            return "*";
        }
        if (a() == Variance.INVARIANT) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
