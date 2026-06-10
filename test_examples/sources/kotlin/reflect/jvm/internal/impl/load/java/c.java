package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import l8.a0;
import v7.g;

/* loaded from: classes.dex */
public final class c {
    public static String a(a0 a0Var) {
        h9.e eVar;
        kotlin.reflect.jvm.internal.impl.builtins.e.A(a0Var);
        CallableMemberDescriptor b5 = DescriptorUtilsKt.b(DescriptorUtilsKt.l(a0Var), ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1.f13615j);
        if (b5 == null || (eVar = u8.c.f17841a.get(DescriptorUtilsKt.g(b5))) == null) {
            return null;
        }
        return eVar.b();
    }

    public static boolean b(CallableMemberDescriptor callableMemberDescriptor) {
        g.f(callableMemberDescriptor, "callableMemberDescriptor");
        if (!u8.c.f17843d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!kotlin.collections.c.h2(u8.c.c, DescriptorUtilsKt.c(callableMemberDescriptor)) || !callableMemberDescriptor.m().isEmpty()) {
            if (!kotlin.reflect.jvm.internal.impl.builtins.e.A(callableMemberDescriptor)) {
                return false;
            }
            Collection<? extends CallableMemberDescriptor> f10 = callableMemberDescriptor.f();
            g.e(f10, "overriddenDescriptors");
            if (f10.isEmpty()) {
                return false;
            }
            for (CallableMemberDescriptor callableMemberDescriptor2 : f10) {
                g.e(callableMemberDescriptor2, "it");
                if (b(callableMemberDescriptor2)) {
                }
            }
            return false;
        }
        return true;
    }
}
