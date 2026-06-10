package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import fa.b;
import ga.n;
import java.util.Collection;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public final class b implements b.InterfaceC0118b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f13823b = new b();

    @Override // fa.b.InterfaceC0118b
    public final Iterable c(Object obj) {
        int i10 = c.f13824p;
        Collection<r> f10 = ((l8.b) obj).o().f();
        g.e(f10, "it.typeConstructor.supertypes");
        return new n(kotlin.sequences.a.X0(kotlin.collections.c.g2(f10), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1.f13821j));
    }
}
