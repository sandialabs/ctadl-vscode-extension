package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import u7.l;

/* loaded from: classes.dex */
final class LazyJavaClassMemberScope$computeNonDeclaredProperties$2 extends Lambda implements l<e, Collection<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13750j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$computeNonDeclaredProperties$2(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.f13750j = lazyJavaClassMemberScope;
    }

    @Override // u7.l
    public final Collection<? extends g> U(e eVar) {
        e eVar2 = eVar;
        v7.g.f(eVar2, "it");
        return LazyJavaClassMemberScope.w(this.f13750j, eVar2);
    }
}
