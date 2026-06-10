package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b9.t;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* loaded from: classes.dex */
public final class LazyJavaPackageFragmentProvider$getPackageFragment$1 extends Lambda implements u7.a<LazyJavaPackageFragment> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaPackageFragmentProvider f13695j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t f13696k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragmentProvider$getPackageFragment$1(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, t tVar) {
        super(0);
        this.f13695j = lazyJavaPackageFragmentProvider;
        this.f13696k = tVar;
    }

    @Override // u7.a
    public final LazyJavaPackageFragment k0() {
        return new LazyJavaPackageFragment(this.f13695j.f13693a, this.f13696k);
    }
}
