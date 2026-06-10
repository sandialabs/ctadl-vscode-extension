package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.c0;
import l8.h0;
import u7.l;
import y9.r;

/* loaded from: classes.dex */
public final class OperatorChecks$checks$3 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> {

    /* renamed from: j  reason: collision with root package name */
    public static final OperatorChecks$checks$3 f15087j = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r8 == false) goto L32;
     */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String U(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        boolean z10;
        h9.b f10;
        r k3;
        boolean j2;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = eVar;
        v7.g.f(eVar2, "$this$$receiver");
        c0 E = eVar2.E();
        if (E == null) {
            E = eVar2.R();
        }
        OperatorChecks operatorChecks = OperatorChecks.f15083a;
        boolean z11 = false;
        if (E != null) {
            r k10 = eVar2.k();
            if (k10 != null) {
                r b5 = E.b();
                v7.g.e(b5, "receiver.type");
                z10 = TypeUtilsKt.j(k10, b5);
            } else {
                z10 = false;
            }
            if (!z10) {
                operatorChecks.getClass();
                s9.g value = E.getValue();
                v7.g.e(value, "receiver.value");
                if (value instanceof s9.e) {
                    l8.b bVar = ((s9.e) value).f17506a;
                    if (bVar.l0() && (f10 = DescriptorUtilsKt.f(bVar)) != null) {
                        l8.d b10 = FindClassInModuleKt.b(DescriptorUtilsKt.j(bVar), f10);
                        if (!(b10 instanceof h0)) {
                            b10 = null;
                        }
                        h0 h0Var = (h0) b10;
                        if (h0Var != null && (k3 = eVar2.k()) != null) {
                            j2 = TypeUtilsKt.j(k3, h0Var.H0());
                        }
                    }
                }
                j2 = false;
            }
            z11 = true;
        }
        if (z11) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}
