package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Lambda;
import l8.f;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
final class DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1 extends Lambda implements p<f, f, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f14675j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f14676k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        super(2);
        this.f14675j = aVar;
        this.f14676k = aVar2;
    }

    @Override // u7.p
    public final Boolean R(f fVar, f fVar2) {
        boolean z10;
        f fVar3 = fVar2;
        if (g.a(fVar, this.f14675j) && g.a(fVar3, this.f14676k)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
