package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import w9.f;

/* loaded from: classes.dex */
public final class JvmPackageScope$kotlinScopes$2 extends Lambda implements u7.a<MemberScope[]> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JvmPackageScope f13713j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmPackageScope$kotlinScopes$2(JvmPackageScope jvmPackageScope) {
        super(0);
        this.f13713j = jvmPackageScope;
    }

    @Override // u7.a
    public final MemberScope[] k0() {
        JvmPackageScope jvmPackageScope = this.f13713j;
        LazyJavaPackageFragment lazyJavaPackageFragment = jvmPackageScope.c;
        lazyJavaPackageFragment.getClass();
        Collection<h> values = ((Map) m0.b.u0(lazyJavaPackageFragment.f13765q, LazyJavaPackageFragment.f13762u[0])).values();
        ArrayList arrayList = new ArrayList();
        for (h hVar : values) {
            f a10 = jvmPackageScope.f13710b.f18762a.f18741d.a(jvmPackageScope.c, hVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return (MemberScope[]) ea.a.b(arrayList).toArray(new MemberScope[0]);
    }
}
