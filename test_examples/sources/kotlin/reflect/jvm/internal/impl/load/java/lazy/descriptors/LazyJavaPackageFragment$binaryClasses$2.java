package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;

/* loaded from: classes.dex */
public final class LazyJavaPackageFragment$binaryClasses$2 extends Lambda implements u7.a<Map<String, ? extends h>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaPackageFragment f13769j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.f13769j = lazyJavaPackageFragment;
    }

    @Override // u7.a
    public final Map<String, ? extends h> k0() {
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f13769j;
        EmptyList a10 = lazyJavaPackageFragment.f13764p.f18762a.f18749l.a(lazyJavaPackageFragment.f16379m.b());
        ArrayList arrayList = new ArrayList();
        a10.getClass();
        return kotlin.collections.d.N1(arrayList);
    }
}
