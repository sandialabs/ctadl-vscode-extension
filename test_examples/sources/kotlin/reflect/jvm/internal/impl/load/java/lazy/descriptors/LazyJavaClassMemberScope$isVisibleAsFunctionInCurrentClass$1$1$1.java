package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import u7.l;

/* loaded from: classes.dex */
public final class LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 extends Lambda implements l<e, Collection<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g f13756j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13757k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1(g gVar, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.f13756j = gVar;
        this.f13757k = lazyJavaClassMemberScope;
    }

    @Override // u7.l
    public final Collection<? extends g> U(e eVar) {
        e eVar2 = eVar;
        v7.g.f(eVar2, "accessorName");
        g gVar = this.f13756j;
        if (v7.g.a(gVar.getName(), eVar2)) {
            return a1.c.N0(gVar);
        }
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f13757k;
        return kotlin.collections.c.z2(LazyJavaClassMemberScope.w(lazyJavaClassMemberScope, eVar2), LazyJavaClassMemberScope.v(lazyJavaClassMemberScope, eVar2));
    }
}
