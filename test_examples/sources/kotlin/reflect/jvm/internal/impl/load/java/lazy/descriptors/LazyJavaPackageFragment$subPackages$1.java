package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import n7.l;

/* loaded from: classes.dex */
public final class LazyJavaPackageFragment$subPackages$1 extends Lambda implements u7.a<List<? extends h9.c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaPackageFragment f13771j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$subPackages$1(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.f13771j = lazyJavaPackageFragment;
    }

    @Override // u7.a
    public final List<? extends h9.c> k0() {
        return new ArrayList(l.Z1(this.f13771j.f13763o.n(), 10));
    }
}
