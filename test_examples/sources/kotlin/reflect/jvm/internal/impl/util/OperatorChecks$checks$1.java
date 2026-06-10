package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import u7.l;

/* loaded from: classes.dex */
public final class OperatorChecks$checks$1 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> {

    /* renamed from: j  reason: collision with root package name */
    public static final OperatorChecks$checks$1 f15085j = new OperatorChecks$checks$1();

    public OperatorChecks$checks$1() {
        super(1);
    }

    @Override // u7.l
    public final String U(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        boolean z10;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = eVar;
        v7.g.f(eVar2, "$this$$receiver");
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = eVar2.m();
        v7.g.e(m10, "valueParameters");
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) kotlin.collections.c.w2(m10);
        boolean z11 = false;
        if (hVar != null) {
            if (!DescriptorUtilsKt.a(hVar) && hVar.N() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        OperatorChecks operatorChecks = OperatorChecks.f15083a;
        if (!z11) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
