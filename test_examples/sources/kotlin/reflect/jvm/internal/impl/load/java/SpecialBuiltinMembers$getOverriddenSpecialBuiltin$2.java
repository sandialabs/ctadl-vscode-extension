package kotlin.reflect.jvm.internal.impl.load.java;

import d9.j;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 extends Lambda implements l<CallableMemberDescriptor, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 f13632j = new SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2();

    public SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean U(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        CallableMemberDescriptor b5;
        String b10;
        SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo;
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        g.f(callableMemberDescriptor2, "it");
        if (kotlin.reflect.jvm.internal.impl.builtins.e.A(callableMemberDescriptor2)) {
            int i10 = BuiltinMethodsWithSpecialGenericSignature.f13612m;
            if (SpecialGenericSignatures.f13637f.contains(callableMemberDescriptor2.getName()) && (b5 = DescriptorUtilsKt.b(callableMemberDescriptor2, BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1.f13614j)) != null && (b10 = j.b(b5)) != null) {
                if (SpecialGenericSignatures.c.contains(b10)) {
                    specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
                } else if (((SpecialGenericSignatures.TypeSafeBarrierDescription) kotlin.collections.d.L1(b10, SpecialGenericSignatures.f13636e)) == SpecialGenericSignatures.TypeSafeBarrierDescription.f13648j) {
                    specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
                } else {
                    specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                }
                if (specialSignatureInfo != null) {
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
            }
            specialSignatureInfo = null;
            if (specialSignatureInfo != null) {
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
