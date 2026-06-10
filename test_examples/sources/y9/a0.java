package y9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends kotlin.reflect.jvm.internal.impl.types.o {
    public final /* synthetic */ List<e0> c;

    public a0(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public final f0 g(e0 e0Var) {
        v7.g.f(e0Var, "key");
        if (this.c.contains(e0Var)) {
            l8.d c = e0Var.c();
            v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return kotlin.reflect.jvm.internal.impl.types.r.m((l8.i0) c);
        }
        return null;
    }
}
