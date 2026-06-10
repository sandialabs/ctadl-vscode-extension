package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import h9.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.f;
import n7.l;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public final class TypeIntersectionScope extends r9.a {

    /* renamed from: b  reason: collision with root package name */
    public final MemberScope f14752b;

    /* loaded from: classes.dex */
    public static final class a {
        public static MemberScope a(String str, Collection collection) {
            MemberScope memberScope;
            g.f(str, "message");
            g.f(collection, "types");
            ArrayList arrayList = new ArrayList(l.Z1(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((r) it.next()).w());
            }
            fa.c b5 = ea.a.b(arrayList);
            int i10 = b5.f11011i;
            if (i10 != 0) {
                if (i10 != 1) {
                    memberScope = new kotlin.reflect.jvm.internal.impl.resolve.scopes.a(str, (MemberScope[]) b5.toArray(new MemberScope[0]));
                } else {
                    memberScope = (MemberScope) b5.get(0);
                }
            } else {
                memberScope = MemberScope.a.f14741b;
            }
            if (b5.f11011i <= 1) {
                return memberScope;
            }
            return new TypeIntersectionScope(memberScope);
        }
    }

    public TypeIntersectionScope(MemberScope memberScope) {
        this.f14752b = memberScope;
    }

    @Override // r9.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return OverridingUtilsKt.a(super.a(eVar, noLookupLocation), TypeIntersectionScope$getContributedFunctions$1.f14754j);
    }

    @Override // r9.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return OverridingUtilsKt.a(super.b(eVar, noLookupLocation), TypeIntersectionScope$getContributedVariables$1.f14755j);
    }

    @Override // r9.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection<f> f(r9.c cVar, u7.l<? super e, Boolean> lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        Collection<f> f10 = super.f(cVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f10) {
            if (((f) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return kotlin.collections.c.z2(arrayList2, OverridingUtilsKt.a(arrayList, TypeIntersectionScope$getContributedDescriptors$2.f14753j));
    }

    @Override // r9.a
    public final MemberScope i() {
        return this.f14752b;
    }
}
