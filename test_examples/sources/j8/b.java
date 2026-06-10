package j8;

import j8.c;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import v7.g;
import x9.h;

/* loaded from: classes.dex */
public final class b extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, a aVar) {
        super(hVar, aVar);
        g.f(hVar, "storageManager");
        g.f(aVar, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List<e> h() {
        c a10;
        l8.b bVar = this.f14733b;
        g.d(bVar, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        a aVar = (a) bVar;
        int ordinal = aVar.f12747o.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return EmptyList.f12981i;
            }
            a10 = c.a.a(aVar, true);
        } else {
            a10 = c.a.a(aVar, false);
        }
        return a1.c.N0(a10);
    }
}
