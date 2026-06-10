package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a;
import l8.s;
import l8.v;
import n7.l;
import n8.c;
import u9.e;
import u9.j;
import u9.k;
import v7.g;
import v9.b;
import x9.h;

/* loaded from: classes.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* renamed from: b  reason: collision with root package name */
    public final b f14822b = new b();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public v a(h hVar, s sVar, Iterable<? extends n8.b> iterable, c cVar, n8.a aVar, boolean z10) {
        g.f(hVar, "storageManager");
        g.f(sVar, "builtInsModule");
        g.f(iterable, "classDescriptorFactories");
        g.f(cVar, "platformDependentDeclarationFilter");
        g.f(aVar, "additionalClassPartsProvider");
        Set<h9.c> set = kotlin.reflect.jvm.internal.impl.builtins.g.f13357o;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f14822b);
        g.f(set, "packageFqNames");
        ArrayList arrayList = new ArrayList(l.Z1(set, 10));
        for (h9.c cVar2 : set) {
            v9.a.f18189m.getClass();
            String a10 = v9.a.a(cVar2);
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.U(a10);
            if (inputStream != null) {
                arrayList.add(a.C0167a.a(cVar2, hVar, sVar, inputStream, z10));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + a10);
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(hVar, sVar);
        u9.h hVar2 = new u9.h(packageFragmentProviderImpl);
        v9.a aVar2 = v9.a.f18189m;
        e eVar = new e(hVar, sVar, hVar2, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.c(sVar, notFoundClasses, aVar2), packageFragmentProviderImpl, j.f17929a, k.a.f17930a, iterable, notFoundClasses, aVar, cVar, aVar2.f17697a, null, new q9.b(hVar, EmptyList.f12981i), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).S0(eVar);
        }
        return packageFragmentProviderImpl;
    }
}
