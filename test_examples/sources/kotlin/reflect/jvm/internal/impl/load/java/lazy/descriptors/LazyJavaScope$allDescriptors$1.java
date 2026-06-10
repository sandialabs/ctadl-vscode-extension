package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.f;
import r9.b;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class LazyJavaScope$allDescriptors$1 extends Lambda implements u7.a<Collection<? extends f>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f13800j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$allDescriptors$1(LazyJavaScope lazyJavaScope) {
        super(0);
        this.f13800j = lazyJavaScope;
    }

    @Override // u7.a
    public final Collection<? extends f> k0() {
        r9.c cVar = r9.c.f17182m;
        MemberScope.f14737a.getClass();
        l<e, Boolean> lVar = MemberScope.Companion.f14739b;
        LazyJavaScope lazyJavaScope = this.f13800j;
        lazyJavaScope.getClass();
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (cVar.a(r9.c.f17181l)) {
            for (e eVar : lazyJavaScope.h(cVar, lVar)) {
                if (lVar.U(eVar).booleanValue()) {
                    m0.b.u(linkedHashSet, lazyJavaScope.e(eVar, noLookupLocation));
                }
            }
        }
        boolean a10 = cVar.a(r9.c.f17178i);
        List<r9.b> list = cVar.f17188a;
        if (a10 && !list.contains(b.a.f17170a)) {
            for (e eVar2 : lazyJavaScope.i(cVar, lVar)) {
                if (lVar.U(eVar2).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.a(eVar2, noLookupLocation));
                }
            }
        }
        if (cVar.a(r9.c.f17179j) && !list.contains(b.a.f17170a)) {
            for (e eVar3 : lazyJavaScope.o(cVar)) {
                if (lVar.U(eVar3).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.b(eVar3, noLookupLocation));
                }
            }
        }
        return kotlin.collections.c.L2(linkedHashSet);
    }
}
