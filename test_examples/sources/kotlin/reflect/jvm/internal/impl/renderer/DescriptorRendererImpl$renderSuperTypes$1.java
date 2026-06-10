package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
final class DescriptorRendererImpl$renderSuperTypes$1 extends Lambda implements l<r, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererImpl f14613j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$renderSuperTypes$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.f14613j = descriptorRendererImpl;
    }

    @Override // u7.l
    public final CharSequence U(r rVar) {
        r rVar2 = rVar;
        g.e(rVar2, "it");
        return this.f14613j.u(rVar2);
    }
}
