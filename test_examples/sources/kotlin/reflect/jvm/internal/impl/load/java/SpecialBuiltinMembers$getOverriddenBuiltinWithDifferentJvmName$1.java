package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 extends Lambda implements l<CallableMemberDescriptor, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 f13630j = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        g.f(callableMemberDescriptor2, "it");
        return Boolean.valueOf(c.b(DescriptorUtilsKt.l(callableMemberDescriptor2)));
    }
}
