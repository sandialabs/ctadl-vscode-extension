package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.b;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final g f15107a = new g();

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String a() {
        return "should not have varargs or parameters with default values";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        boolean z10;
        v7.g.f(eVar, "functionDescriptor");
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = eVar.m();
        v7.g.e(m10, "functionDescriptor.valueParameters");
        if (m10.isEmpty()) {
            return true;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : m10) {
            v7.g.e(hVar, "it");
            if (DescriptorUtilsKt.a(hVar) || hVar.N() != null) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
