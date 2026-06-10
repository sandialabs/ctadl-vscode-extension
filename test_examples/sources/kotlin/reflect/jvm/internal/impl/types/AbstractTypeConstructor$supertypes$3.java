package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes.dex */
public final class AbstractTypeConstructor$supertypes$3 extends Lambda implements u7.l<AbstractTypeConstructor.a, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractTypeConstructor f14938j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.f14938j = abstractTypeConstructor;
    }

    @Override // u7.l
    public final m7.n U(AbstractTypeConstructor.a aVar) {
        AbstractTypeConstructor.a aVar2 = aVar;
        v7.g.f(aVar2, "supertypes");
        AbstractTypeConstructor abstractTypeConstructor = this.f14938j;
        Collection a10 = abstractTypeConstructor.k().a(abstractTypeConstructor, aVar2.f14934a, new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(abstractTypeConstructor), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(abstractTypeConstructor));
        List<y9.r> list = null;
        if (a10.isEmpty()) {
            y9.r i10 = abstractTypeConstructor.i();
            if (i10 != null) {
                a10 = a1.c.N0(i10);
            } else {
                a10 = null;
            }
            if (a10 == null) {
                a10 = EmptyList.f12981i;
            }
        }
        if (a10 instanceof List) {
            list = (List) a10;
        }
        if (list == null) {
            list = kotlin.collections.c.L2(a10);
        }
        List<y9.r> m10 = abstractTypeConstructor.m(list);
        v7.g.f(m10, "<set-?>");
        aVar2.f14935b = m10;
        return m7.n.f16010a;
    }
}
