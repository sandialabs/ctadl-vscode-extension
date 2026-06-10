package f8;

import androidx.appcompat.widget.m;
import d9.k;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import l8.g0;
import m7.n;
import n8.a;
import n8.c;
import t8.b;
import u8.i;
import v8.e;
import v8.g;
import x8.b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f10968a = new ConcurrentHashMap();

    public static final q8.h a(Class<?> cls) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.b bVar;
        n8.a aVar;
        n8.c cVar;
        v7.g.f(cls, "<this>");
        ClassLoader d5 = ReflectClassUtilKt.d(cls);
        j jVar = new j(d5);
        ConcurrentHashMap concurrentHashMap = f10968a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(jVar);
        if (weakReference != null) {
            q8.h hVar = (q8.h) weakReference.get();
            if (hVar != null) {
                return hVar;
            }
            concurrentHashMap.remove(jVar, weakReference);
        }
        q8.f fVar = new q8.f(d5);
        ClassLoader classLoader = n.class.getClassLoader();
        v7.g.e(classLoader, "Unit::class.java.classLoader");
        q8.f fVar2 = new q8.f(classLoader);
        q8.d dVar = new q8.d(d5);
        String str = "runtime module for " + d5;
        m0.b bVar2 = m0.b.f15892e;
        q8.i iVar = q8.i.f16957a;
        v7.g.f(str, "moduleName");
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
        kotlin.reflect.jvm.internal.impl.builtins.jvm.b bVar3 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.b(lockBasedStorageManager);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.c(h9.e.m("<" + str + '>'), lockBasedStorageManager, bVar3, 56);
        lockBasedStorageManager.j(new i8.e(bVar3, cVar2));
        bVar3.N(cVar2);
        kotlin.reflect.jvm.internal.impl.load.kotlin.g gVar = new kotlin.reflect.jvm.internal.impl.load.kotlin.g();
        x8.e eVar = new x8.e();
        j jVar2 = jVar;
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, cVar2);
        k.a aVar2 = k.a.f10463a;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        g.a aVar3 = v8.g.f18188a;
        e.a aVar4 = e.a.f18186a;
        EmptyList emptyList = EmptyList.f12981i;
        q9.b bVar4 = new q9.b(lockBasedStorageManager, emptyList);
        g0.a aVar5 = g0.a.f15837a;
        b.a aVar6 = b.a.f17696a;
        kotlin.reflect.jvm.internal.impl.builtins.f fVar3 = new kotlin.reflect.jvm.internal.impl.builtins.f(cVar2, notFoundClasses);
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.f13618d;
        u8.b bVar5 = new u8.b(javaTypeEnhancementState);
        b.a aVar7 = b.a.f18761a;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c cVar3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b());
        i.a aVar8 = i.a.f17849a;
        kotlin.reflect.jvm.internal.impl.types.checker.f.f14999b.getClass();
        kotlin.reflect.jvm.internal.impl.types.checker.g gVar2 = f.a.f15001b;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(new x8.a(lockBasedStorageManager, dVar, fVar, gVar, aVar3, bVar2, aVar4, bVar4, iVar, eVar, aVar2, aVar5, aVar6, cVar2, fVar3, bVar5, cVar3, aVar8, aVar7, gVar2, javaTypeEnhancementState, new a1.c()));
        d9.a aVar9 = new d9.a(fVar, gVar);
        kotlin.reflect.jvm.internal.impl.load.kotlin.e eVar2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e(cVar2, notFoundClasses, lockBasedStorageManager, fVar);
        List N0 = a1.c.N0(kotlin.reflect.jvm.internal.impl.types.e.f15007a);
        kotlin.reflect.jvm.internal.impl.builtins.e eVar3 = cVar2.f13565l;
        if (eVar3 instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.b) {
            bVar = (kotlin.reflect.jvm.internal.impl.builtins.jvm.b) eVar3;
        } else {
            bVar = null;
        }
        d9.b bVar6 = d9.b.f10446a;
        if (bVar == null || (aVar = bVar.M()) == null) {
            aVar = a.C0194a.f16134a;
        }
        n8.a aVar10 = aVar;
        if (bVar == null || (cVar = bVar.M()) == null) {
            cVar = c.b.f16136a;
        }
        u9.e eVar4 = new u9.e(lockBasedStorageManager, cVar2, aVar9, eVar2, lazyJavaPackageFragmentProvider, bVar2, bVar6, emptyList, notFoundClasses, aVar10, cVar, g9.h.f11279a, gVar2, new q9.b(lockBasedStorageManager, emptyList), N0, 262144);
        gVar.f13952a = eVar4;
        eVar.f18766a = new m(lazyJavaPackageFragmentProvider);
        k8.e eVar5 = new k8.e(lockBasedStorageManager, fVar2, cVar2, notFoundClasses, bVar3.M(), bVar3.M(), gVar2, new q9.b(lockBasedStorageManager, emptyList));
        cVar2.M0(cVar2);
        cVar2.f13568p = new o8.m("CompositeProvider@RuntimeModuleData for " + cVar2, a1.c.O0(lazyJavaPackageFragmentProvider, eVar5));
        q8.h hVar2 = new q8.h(eVar4, new q8.a(gVar, fVar));
        while (true) {
            j jVar3 = jVar2;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(jVar3, new WeakReference(hVar2));
            if (weakReference2 == null) {
                return hVar2;
            }
            q8.h hVar3 = (q8.h) weakReference2.get();
            if (hVar3 != null) {
                return hVar3;
            }
            concurrentHashMap3.remove(jVar3, weakReference2);
            jVar2 = jVar3;
            concurrentHashMap2 = concurrentHashMap3;
        }
    }
}
