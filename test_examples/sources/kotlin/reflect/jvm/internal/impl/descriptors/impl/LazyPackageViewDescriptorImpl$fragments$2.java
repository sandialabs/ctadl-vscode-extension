package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import l8.u;
import o8.m;

/* loaded from: classes.dex */
public final class LazyPackageViewDescriptorImpl$fragments$2 extends Lambda implements u7.a<List<? extends u>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyPackageViewDescriptorImpl f13520j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$fragments$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.f13520j = lazyPackageViewDescriptorImpl;
    }

    @Override // u7.a
    public final List<? extends u> k0() {
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f13520j;
        c cVar = lazyPackageViewDescriptorImpl.f13515k;
        cVar.z0();
        return m0.b.T0((m) cVar.f13571s.getValue(), lazyPackageViewDescriptorImpl.f13516l);
    }
}
