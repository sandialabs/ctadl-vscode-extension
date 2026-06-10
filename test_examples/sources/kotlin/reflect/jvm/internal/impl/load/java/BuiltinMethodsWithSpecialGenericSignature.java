package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import v7.g;

/* loaded from: classes.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f13612m = 0;

    public static final kotlin.reflect.jvm.internal.impl.descriptors.e a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        g.f(eVar, "functionDescriptor");
        h9.e name = eVar.getName();
        g.e(name, "functionDescriptor.name");
        if (b(name)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) DescriptorUtilsKt.b(eVar, BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1.f13613j);
        }
        return null;
    }

    public static boolean b(h9.e eVar) {
        g.f(eVar, "<this>");
        return SpecialGenericSignatures.f13637f.contains(eVar);
    }
}
