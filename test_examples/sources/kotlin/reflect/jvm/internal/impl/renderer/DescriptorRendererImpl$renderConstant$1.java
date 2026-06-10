package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import m9.g;
import u7.l;

/* loaded from: classes.dex */
public final class DescriptorRendererImpl$renderConstant$1 extends Lambda implements l<g<?>, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererImpl f14611j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$renderConstant$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.f14611j = descriptorRendererImpl;
    }

    @Override // u7.l
    public final CharSequence U(g<?> gVar) {
        g<?> gVar2 = gVar;
        v7.g.f(gVar2, "it");
        return this.f14611j.I(gVar2);
    }
}
