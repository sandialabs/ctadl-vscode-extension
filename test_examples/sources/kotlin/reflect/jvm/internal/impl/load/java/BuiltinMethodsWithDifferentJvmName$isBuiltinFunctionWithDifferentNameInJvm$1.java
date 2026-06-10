package kotlin.reflect.jvm.internal.impl.load.java;

import d9.j;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import u7.l;

/* loaded from: classes.dex */
final class BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1 extends Lambda implements l<CallableMemberDescriptor, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g f13611j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1(g gVar) {
        super(1);
        this.f13611j = gVar;
    }

    @Override // u7.l
    public final Boolean U(CallableMemberDescriptor callableMemberDescriptor) {
        v7.g.f(callableMemberDescriptor, "it");
        return Boolean.valueOf(SpecialGenericSignatures.f13641j.containsKey(j.b(this.f13611j)));
    }
}
