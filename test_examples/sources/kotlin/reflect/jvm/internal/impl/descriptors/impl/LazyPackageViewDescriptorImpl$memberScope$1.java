package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a;
import l8.u;
import n7.l;
import o8.h0;

/* loaded from: classes.dex */
public final class LazyPackageViewDescriptorImpl$memberScope$1 extends Lambda implements u7.a<MemberScope> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyPackageViewDescriptorImpl f13521j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.f13521j = lazyPackageViewDescriptorImpl;
    }

    @Override // u7.a
    public final MemberScope k0() {
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f13521j;
        if (lazyPackageViewDescriptorImpl.isEmpty()) {
            return MemberScope.a.f14741b;
        }
        List<u> d02 = lazyPackageViewDescriptorImpl.d0();
        ArrayList arrayList = new ArrayList(l.Z1(d02, 10));
        for (u uVar : d02) {
            arrayList.add(uVar.w());
        }
        c cVar = lazyPackageViewDescriptorImpl.f13515k;
        h9.c cVar2 = lazyPackageViewDescriptorImpl.f13516l;
        ArrayList A2 = kotlin.collections.c.A2(arrayList, new h0(cVar, cVar2));
        return a.C0166a.a("package view scope for " + cVar2 + " in " + cVar.getName(), A2);
    }
}
