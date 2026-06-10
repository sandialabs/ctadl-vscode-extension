package t3;

import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import v7.g;

/* loaded from: classes.dex */
public final class b implements k0.b {

    /* renamed from: a  reason: collision with root package name */
    public final d<?>[] f17564a;

    public b(d<?>... dVarArr) {
        g.f(dVarArr, "initializers");
        this.f17564a = dVarArr;
    }

    @Override // androidx.lifecycle.k0.b
    public final i0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.k0.b
    public final i0 b(Class cls, c cVar) {
        d<?>[] dVarArr;
        i0 i0Var = null;
        for (d<?> dVar : this.f17564a) {
            if (g.a(dVar.f17565a, cls)) {
                Object U = dVar.f17566b.U(cVar);
                if (U instanceof i0) {
                    i0Var = (i0) U;
                } else {
                    i0Var = null;
                }
            }
        }
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
