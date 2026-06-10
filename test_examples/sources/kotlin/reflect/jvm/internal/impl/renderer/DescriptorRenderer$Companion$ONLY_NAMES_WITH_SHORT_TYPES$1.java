package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.a;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 extends Lambda implements l<b, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 f14603j = new DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1();

    public DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(b bVar) {
        b bVar2 = bVar;
        g.f(bVar2, "$this$withOptions");
        bVar2.g();
        bVar2.d(EmptySet.f12983i);
        bVar2.o(a.b.f14672a);
        bVar2.l();
        bVar2.e(ParameterNameRenderingPolicy.NONE);
        bVar2.a();
        bVar2.c();
        bVar2.n();
        bVar2.f();
        return n.f16010a;
    }
}
