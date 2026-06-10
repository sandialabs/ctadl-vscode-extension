package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import y9.e0;

/* loaded from: classes.dex */
final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1 extends Lambda implements u7.l<e0, Iterable<? extends y9.r>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractTypeConstructor f14939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.f14939j = abstractTypeConstructor;
    }

    @Override // u7.l
    public final Iterable<? extends y9.r> U(e0 e0Var) {
        AbstractTypeConstructor abstractTypeConstructor;
        e0 e0Var2 = e0Var;
        v7.g.f(e0Var2, "it");
        this.f14939j.getClass();
        if (e0Var2 instanceof AbstractTypeConstructor) {
            abstractTypeConstructor = (AbstractTypeConstructor) e0Var2;
        } else {
            abstractTypeConstructor = null;
        }
        if (abstractTypeConstructor != null) {
            return kotlin.collections.c.z2(abstractTypeConstructor.j(), abstractTypeConstructor.f14933b.k0().f14934a);
        }
        Collection<y9.r> f10 = e0Var2.f();
        v7.g.e(f10, "supertypes");
        return f10;
    }
}
