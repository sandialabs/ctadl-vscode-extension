package m9;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;

/* loaded from: classes.dex */
public class b extends g<List<? extends g<?>>> {

    /* renamed from: b  reason: collision with root package name */
    public final u7.l<l8.s, y9.r> f16018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends g<?>> list, u7.l<? super l8.s, ? extends y9.r> lVar) {
        super(list);
        v7.g.f(list, "value");
        v7.g.f(lVar, "computeType");
        this.f16018b = lVar;
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        v7.g.f(sVar, "module");
        y9.r U = this.f16018b.U(sVar);
        if (!kotlin.reflect.jvm.internal.impl.builtins.e.z(U) && !kotlin.reflect.jvm.internal.impl.builtins.e.G(U) && !kotlin.reflect.jvm.internal.impl.builtins.e.C(U, g.a.V.i()) && !kotlin.reflect.jvm.internal.impl.builtins.e.C(U, g.a.W.i()) && !kotlin.reflect.jvm.internal.impl.builtins.e.C(U, g.a.X.i())) {
            kotlin.reflect.jvm.internal.impl.builtins.e.C(U, g.a.Y.i());
        }
        return U;
    }
}
