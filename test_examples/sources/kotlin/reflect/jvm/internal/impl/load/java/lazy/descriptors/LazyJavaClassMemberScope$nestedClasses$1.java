package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.n;
import h9.e;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import o8.q;
import u7.l;
import u8.h;
import v7.g;

/* loaded from: classes.dex */
public final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements l<e, l8.b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13759j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ x8.c f13760k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(x8.c cVar, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.f13759j = lazyJavaClassMemberScope;
        this.f13760k = cVar;
    }

    @Override // u7.l
    public final l8.b U(e eVar) {
        e eVar2 = eVar;
        g.f(eVar2, "name");
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f13759j;
        boolean contains = lazyJavaClassMemberScope.f13744r.k0().contains(eVar2);
        l8.b bVar = lazyJavaClassMemberScope.n;
        x8.c cVar = this.f13760k;
        if (contains) {
            h hVar = cVar.f18762a.f18740b;
            h9.b f10 = DescriptorUtilsKt.f(bVar);
            g.c(f10);
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a b5 = hVar.b(new h.a(f10.d(eVar2), lazyJavaClassMemberScope.f13741o, 2));
            if (b5 == null) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(cVar, bVar, b5, null);
            cVar.f18762a.f18755s.a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        } else if (lazyJavaClassMemberScope.f13745s.k0().contains(eVar2)) {
            ListBuilder listBuilder = new ListBuilder();
            cVar.f18762a.f18760x.f(cVar, bVar, eVar2, listBuilder);
            a1.c.S(listBuilder);
            int c = listBuilder.c();
            if (c == 0) {
                return null;
            }
            if (c == 1) {
                return (l8.b) kotlin.collections.c.C2(listBuilder);
            }
            throw new IllegalStateException(("Multiple classes with same name are generated: " + listBuilder).toString());
        } else {
            n nVar = lazyJavaClassMemberScope.f13746t.k0().get(eVar2);
            if (nVar == null) {
                return null;
            }
            LockBasedStorageManager.h a10 = cVar.f18762a.f18739a.a(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(lazyJavaClassMemberScope));
            x8.a aVar = cVar.f18762a;
            return q.S0(aVar.f18739a, lazyJavaClassMemberScope.n, eVar2, a10, m0.b.e1(cVar, nVar), aVar.f18747j.a(nVar));
        }
    }
}
