package d9;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import l8.d0;

/* loaded from: classes.dex */
public final class h implements d0 {

    /* renamed from: b  reason: collision with root package name */
    public final LazyJavaPackageFragment f10461b;

    public h(LazyJavaPackageFragment lazyJavaPackageFragment) {
        v7.g.f(lazyJavaPackageFragment, "packageFragment");
        this.f10461b = lazyJavaPackageFragment;
    }

    @Override // l8.d0
    public final void a() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f10461b;
        sb.append(lazyJavaPackageFragment);
        sb.append(": ");
        lazyJavaPackageFragment.getClass();
        sb.append(((Map) m0.b.u0(lazyJavaPackageFragment.f13765q, LazyJavaPackageFragment.f13762u[0])).keySet());
        return sb.toString();
    }
}
