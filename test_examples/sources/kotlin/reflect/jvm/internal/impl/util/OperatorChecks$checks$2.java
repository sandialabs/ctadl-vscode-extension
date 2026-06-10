package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import u7.l;

/* loaded from: classes.dex */
public final class OperatorChecks$checks$2 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> {

    /* renamed from: j  reason: collision with root package name */
    public static final OperatorChecks$checks$2 f15086j = new OperatorChecks$checks$2();

    public OperatorChecks$checks$2() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String U(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = eVar;
        v7.g.f(eVar2, "$this$$receiver");
        OperatorChecks operatorChecks = OperatorChecks.f15083a;
        l8.f c = eVar2.c();
        v7.g.e(c, "containingDeclaration");
        boolean z13 = true;
        if (c instanceof l8.b) {
            h9.e eVar3 = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
            if (kotlin.reflect.jvm.internal.impl.builtins.e.c((l8.b) c, g.a.f13358a)) {
                z10 = true;
                if (!z10) {
                    Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> f10 = eVar2.f();
                    v7.g.e(f10, "overriddenDescriptors");
                    if (!f10.isEmpty()) {
                        for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar4 : f10) {
                            l8.f c10 = eVar4.c();
                            v7.g.e(c10, "it.containingDeclaration");
                            if (c10 instanceof l8.b) {
                                h9.e eVar5 = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
                                if (kotlin.reflect.jvm.internal.impl.builtins.e.c((l8.b) c10, g.a.f13358a)) {
                                    z11 = true;
                                    continue;
                                    if (z11) {
                                        z12 = true;
                                        break;
                                    }
                                }
                            }
                            z11 = false;
                            continue;
                            if (z11) {
                            }
                        }
                    }
                    z12 = false;
                    if (!z12) {
                        z13 = false;
                    }
                }
                if (z13) {
                    return "must override ''equals()'' in Any";
                }
                return null;
            }
        }
        z10 = false;
        if (!z10) {
        }
        if (z13) {
        }
    }
}
