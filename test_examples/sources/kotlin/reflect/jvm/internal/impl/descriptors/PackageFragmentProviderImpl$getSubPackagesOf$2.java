package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import u7.l;

/* loaded from: classes.dex */
public final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends Lambda implements l<h9.c, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h9.c f13456j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageFragmentProviderImpl$getSubPackagesOf$2(h9.c cVar) {
        super(1);
        this.f13456j = cVar;
    }

    @Override // u7.l
    public final Boolean U(h9.c cVar) {
        boolean z10;
        h9.c cVar2 = cVar;
        v7.g.f(cVar2, "it");
        if (!cVar2.d() && v7.g.a(cVar2.e(), this.f13456j)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
