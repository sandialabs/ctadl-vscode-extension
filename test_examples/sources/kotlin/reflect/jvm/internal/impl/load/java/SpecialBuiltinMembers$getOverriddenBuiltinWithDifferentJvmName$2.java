package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 extends Lambda implements l<CallableMemberDescriptor, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 f13631j = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        g.f(callableMemberDescriptor2, "it");
        int i10 = b.f13657m;
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) callableMemberDescriptor2;
        if (kotlin.reflect.jvm.internal.impl.builtins.e.A(gVar) && DescriptorUtilsKt.b(gVar, new BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1(gVar)) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
