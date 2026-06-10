package kotlin.reflect.jvm.internal;

import m7.n;

/* loaded from: classes.dex */
public final class c extends f8.c {
    public c(KDeclarationContainerImpl kDeclarationContainerImpl) {
        super(kDeclarationContainerImpl);
    }

    @Override // f8.c, l8.h
    public final KCallableImpl<?> e(kotlin.reflect.jvm.internal.impl.descriptors.c cVar, n nVar) {
        v7.g.f(cVar, "descriptor");
        v7.g.f(nVar, "data");
        throw new IllegalStateException("No constructors should appear here: " + cVar);
    }
}
