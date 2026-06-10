package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 extends Lambda implements l<h, String> {

    /* renamed from: j  reason: collision with root package name */
    public static final DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 f14656j = new DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2();

    public DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2() {
        super(1);
    }

    @Override // u7.l
    public final String U(h hVar) {
        g.f(hVar, "it");
        return "...";
    }
}
