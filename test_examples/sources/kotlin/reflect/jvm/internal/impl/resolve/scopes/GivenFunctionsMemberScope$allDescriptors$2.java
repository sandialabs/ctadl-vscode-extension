package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import l8.f;
import n7.n;
import r9.d;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public final class GivenFunctionsMemberScope$allDescriptors$2 extends Lambda implements u7.a<List<? extends f>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ GivenFunctionsMemberScope f14734j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        super(0);
        this.f14734j = givenFunctionsMemberScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    @Override // u7.a
    public final List<? extends f> k0() {
        ?? r72;
        GivenFunctionsMemberScope givenFunctionsMemberScope = this.f14734j;
        List<e> h10 = givenFunctionsMemberScope.h();
        ArrayList arrayList = new ArrayList(3);
        Collection<r> f10 = givenFunctionsMemberScope.f14733b.o().f();
        g.e(f10, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (r rVar : f10) {
            n.f2(c.a.a(rVar.w(), null, 3), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof CallableMemberDescriptor) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            h9.e name = ((CallableMemberDescriptor) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            h9.e eVar = (h9.e) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) obj2) instanceof e);
                Object obj3 = linkedHashMap2.get(valueOf);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj3);
                }
                ((List) obj3).add(obj2);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.f14687f;
                if (booleanValue) {
                    r72 = new ArrayList();
                    for (Object obj4 : h10) {
                        if (g.a(((e) obj4).getName(), eVar)) {
                            r72.add(obj4);
                        }
                    }
                } else {
                    r72 = EmptyList.f12981i;
                }
                overridingUtil.h(eVar, list, r72, givenFunctionsMemberScope.f14733b, new d(arrayList, givenFunctionsMemberScope));
            }
        }
        return kotlin.collections.c.z2(m0.b.G(arrayList), h10);
    }
}
