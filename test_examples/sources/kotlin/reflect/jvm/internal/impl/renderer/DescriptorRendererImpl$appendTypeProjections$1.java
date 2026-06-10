package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import u7.l;
import v7.g;
import y9.f0;
import y9.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements l<f0, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DescriptorRendererImpl f14608j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.f14608j = descriptorRendererImpl;
    }

    @Override // u7.l
    public final CharSequence U(f0 f0Var) {
        f0 f0Var2 = f0Var;
        g.f(f0Var2, "it");
        if (f0Var2.d()) {
            return "*";
        }
        r b5 = f0Var2.b();
        g.e(b5, "it.type");
        String u10 = this.f14608j.u(b5);
        if (f0Var2.a() == Variance.INVARIANT) {
            return u10;
        }
        return f0Var2.a() + ' ' + u10;
    }
}
