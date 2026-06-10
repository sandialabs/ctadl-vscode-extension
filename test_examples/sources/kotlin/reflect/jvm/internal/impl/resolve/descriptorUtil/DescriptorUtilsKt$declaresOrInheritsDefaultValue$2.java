package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import c8.d;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import u7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements l<h, Boolean> {

    /* renamed from: r  reason: collision with root package name */
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 f14714r = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(h hVar) {
        h hVar2 = hVar;
        g.f(hVar2, "p0");
        return Boolean.valueOf(hVar2.j0());
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(h.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "declaresDefaultValue()Z";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "declaresDefaultValue";
    }
}
