package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Collection;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import u7.l;
import v7.i;

/* loaded from: classes.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends FunctionReference implements l<e, Collection<? extends g>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(Object obj) {
        super(1, obj);
    }

    @Override // u7.l
    public final Collection<? extends g> U(e eVar) {
        e eVar2 = eVar;
        v7.g.f(eVar2, "p0");
        return LazyJavaClassMemberScope.w((LazyJavaClassMemberScope) this.f13048j, eVar2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return i.a(LazyJavaClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }
}
