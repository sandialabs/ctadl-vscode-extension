package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.q;
import h9.e;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import u7.l;
import v8.f;

/* loaded from: classes.dex */
public final class LazyJavaScope$declaredFunctions$1 extends Lambda implements l<e, Collection<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f13805j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredFunctions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.f13805j = lazyJavaScope;
    }

    @Override // u7.l
    public final Collection<? extends g> U(e eVar) {
        e eVar2 = eVar;
        v7.g.f(eVar2, "name");
        LazyJavaScope lazyJavaScope = this.f13805j;
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.c;
        if (lazyJavaScope2 != null) {
            return (Collection) ((LockBasedStorageManager.k) lazyJavaScope2.f13788f).U(eVar2);
        }
        ArrayList arrayList = new ArrayList();
        for (q qVar : lazyJavaScope.f13787e.k0().c(eVar2)) {
            JavaMethodDescriptor t10 = lazyJavaScope.t(qVar);
            if (lazyJavaScope.r(t10)) {
                ((f.a) lazyJavaScope.f13785b.f18762a.f18744g).getClass();
                arrayList.add(t10);
            }
        }
        lazyJavaScope.j(arrayList, eVar2);
        return arrayList;
    }
}
