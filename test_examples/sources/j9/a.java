package j9;

import c8.j;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import v7.g;

/* loaded from: classes.dex */
public final class a extends y7.a<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererOptionsImpl f12752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj);
        this.f12752b = descriptorRendererOptionsImpl;
    }

    @Override // y7.a
    public final void a(j jVar) {
        g.f(jVar, "property");
        if (!this.f12752b.f14632a) {
            return;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
