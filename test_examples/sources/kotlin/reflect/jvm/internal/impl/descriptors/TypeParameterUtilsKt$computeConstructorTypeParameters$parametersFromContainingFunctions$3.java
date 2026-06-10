package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import l8.i0;
import u7.l;

/* loaded from: classes.dex */
public final class TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 extends Lambda implements l<l8.f, ga.h<? extends i0>> {

    /* renamed from: j  reason: collision with root package name */
    public static final TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 f13465j = new TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3();

    public TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3() {
        super(1);
    }

    @Override // u7.l
    public final ga.h<? extends i0> U(l8.f fVar) {
        l8.f fVar2 = fVar;
        v7.g.f(fVar2, "it");
        List<i0> typeParameters = ((a) fVar2).getTypeParameters();
        v7.g.e(typeParameters, "it as CallableDescriptor).typeParameters");
        return kotlin.collections.c.g2(typeParameters);
    }
}
