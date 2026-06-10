package r9;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public abstract class f implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<h9.e> c() {
        Collection<l8.f> f10 = f(c.f17184p, FunctionsKt.f15113a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f10) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                h9.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName();
                g.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<h9.e> d() {
        Collection<l8.f> f10 = f(c.f17185q, FunctionsKt.f15113a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f10) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                h9.e name = ((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName();
                g.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public Collection<l8.f> f(c cVar, l<? super h9.e, Boolean> lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<h9.e> g() {
        return null;
    }
}
