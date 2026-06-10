package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.a;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 extends Lambda implements l<b, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 f14604j = new DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1();

    public DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(b bVar) {
        b bVar2 = bVar;
        g.f(bVar2, "$this$withOptions");
        bVar2.o(a.b.f14672a);
        bVar2.e(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return n.f16010a;
    }
}
