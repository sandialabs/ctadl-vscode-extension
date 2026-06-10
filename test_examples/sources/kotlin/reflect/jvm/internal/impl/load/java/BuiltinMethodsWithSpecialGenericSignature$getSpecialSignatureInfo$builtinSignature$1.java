package kotlin.reflect.jvm.internal.impl.load.java;

import d9.j;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 extends Lambda implements l<CallableMemberDescriptor, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 f13614j = new BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1();

    public BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        g.f(callableMemberDescriptor2, "it");
        if (callableMemberDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            int i10 = BuiltinMethodsWithSpecialGenericSignature.f13612m;
            if (kotlin.collections.c.h2(SpecialGenericSignatures.f13638g, j.b(callableMemberDescriptor2))) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
