package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import d9.j;
import h9.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import u7.l;

/* loaded from: classes.dex */
public final class LazyJavaScope$functions$1 extends Lambda implements l<e, Collection<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f13808j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.f13808j = lazyJavaScope;
    }

    @Override // u7.l
    public final Collection<? extends g> U(e eVar) {
        e eVar2 = eVar;
        v7.g.f(eVar2, "name");
        LazyJavaScope lazyJavaScope = this.f13808j;
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((LockBasedStorageManager.k) lazyJavaScope.f13788f).U(eVar2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : linkedHashSet) {
            String a10 = j.a((g) obj, 2);
            Object obj2 = linkedHashMap.get(a10);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(a10, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection a11 = OverridingUtilsKt.a(list, LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1.f13817j);
                linkedHashSet.removeAll(list);
                linkedHashSet.addAll(a11);
            }
        }
        lazyJavaScope.m(linkedHashSet, eVar2);
        x8.c cVar = lazyJavaScope.f13785b;
        return kotlin.collections.c.L2(cVar.f18762a.f18754r.c(cVar, linkedHashSet));
    }
}
