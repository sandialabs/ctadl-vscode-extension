package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import k9.d;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import l8.f;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class JvmBuiltInsCustomizer$isMutabilityViolation$2 extends Lambda implements l<CallableMemberDescriptor, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JvmBuiltInsCustomizer f13410j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$isMutabilityViolation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.f13410j = jvmBuiltInsCustomizer;
    }

    @Override // u7.l
    public final Boolean U(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        if (callableMemberDescriptor2.h() == CallableMemberDescriptor.Kind.DECLARATION) {
            a1.b bVar = this.f13410j.f13394b;
            f c = callableMemberDescriptor2.c();
            g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            bVar.getClass();
            String str = k8.c.f12921a;
            if (k8.c.f12929j.containsKey(d.g((l8.b) c))) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
