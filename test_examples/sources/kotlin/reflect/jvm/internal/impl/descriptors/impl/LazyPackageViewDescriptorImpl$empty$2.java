package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;
import o8.m;

/* loaded from: classes.dex */
public final class LazyPackageViewDescriptorImpl$empty$2 extends Lambda implements u7.a<Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyPackageViewDescriptorImpl f13519j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$empty$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.f13519j = lazyPackageViewDescriptorImpl;
    }

    @Override // u7.a
    public final Boolean k0() {
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f13519j;
        c cVar = lazyPackageViewDescriptorImpl.f13515k;
        cVar.z0();
        return Boolean.valueOf(m0.b.C0((m) cVar.f13571s.getValue(), lazyPackageViewDescriptorImpl.f13516l));
    }
}
