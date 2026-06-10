package kotlin.reflect.jvm.internal.impl.load.java;

import d9.d;
import d9.j;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.f;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public final class d implements ExternalOverridabilityCondition {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            g.f(aVar, "superDescriptor");
            g.f(aVar2, "subDescriptor");
            if ((aVar2 instanceof JavaMethodDescriptor) && (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
                javaMethodDescriptor.m().size();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) aVar;
                eVar.m().size();
                List<h> m10 = javaMethodDescriptor.z0().m();
                g.e(m10, "subDescriptor.original.valueParameters");
                List<h> m11 = eVar.a().m();
                g.e(m11, "superDescriptor.original.valueParameters");
                Iterator it = kotlin.collections.c.S2(m10, m11).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    h hVar = (h) pair.f12962i;
                    h hVar2 = (h) pair.f12963j;
                    g.e(hVar, "subParameter");
                    boolean z10 = b((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar2, hVar) instanceof d.c;
                    g.e(hVar2, "superParameter");
                    if (z10 != (b(eVar, hVar2) instanceof d.c)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static d9.d b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, h hVar) {
            boolean z10;
            r k3;
            l8.b bVar;
            boolean z11;
            boolean z12;
            d.c cVar;
            JvmPrimitiveType jvmPrimitiveType;
            kotlin.reflect.jvm.internal.impl.descriptors.e a10;
            g.f(eVar, "f");
            l8.b bVar2 = null;
            boolean z13 = false;
            if (g.a(eVar.getName().b(), "remove") && eVar.m().size() == 1) {
                if (!(DescriptorUtilsKt.l(eVar).c() instanceof w8.c) && !kotlin.reflect.jvm.internal.impl.builtins.e.A(eVar)) {
                    z12 = false;
                    if (z12) {
                        List<h> m10 = eVar.a().m();
                        g.e(m10, "f.original.valueParameters");
                        r b5 = ((h) kotlin.collections.c.C2(m10)).b();
                        g.e(b5, "f.original.valueParameters.single().type");
                        d9.d c = j.c(b5);
                        if (c instanceof d.c) {
                            cVar = (d.c) c;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            jvmPrimitiveType = cVar.f10458i;
                        } else {
                            jvmPrimitiveType = null;
                        }
                        if (jvmPrimitiveType == JvmPrimitiveType.INT && (a10 = BuiltinMethodsWithSpecialGenericSignature.a(eVar)) != null) {
                            List<h> m11 = a10.a().m();
                            g.e(m11, "overridden.original.valueParameters");
                            r b10 = ((h) kotlin.collections.c.C2(m11)).b();
                            g.e(b10, "overridden.original.valueParameters.single().type");
                            d9.d c10 = j.c(b10);
                            f c11 = a10.c();
                            g.e(c11, "overridden.containingDeclaration");
                            if (g.a(DescriptorUtilsKt.h(c11), g.a.J.i()) && (c10 instanceof d.b) && v7.g.a(((d.b) c10).f10457i, "java/lang/Object")) {
                                z10 = true;
                                if (!z10) {
                                    if (eVar.m().size() == 1) {
                                        f c12 = eVar.c();
                                        if (c12 instanceof l8.b) {
                                            bVar = (l8.b) c12;
                                        } else {
                                            bVar = null;
                                        }
                                        if (bVar != null) {
                                            List<h> m12 = eVar.m();
                                            v7.g.e(m12, "f.valueParameters");
                                            l8.d c13 = ((h) kotlin.collections.c.C2(m12)).b().U0().c();
                                            if (c13 instanceof l8.b) {
                                                bVar2 = (l8.b) c13;
                                            }
                                            if (bVar2 != null) {
                                                if (kotlin.reflect.jvm.internal.impl.builtins.e.u(bVar) != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11 && v7.g.a(DescriptorUtilsKt.g(bVar), DescriptorUtilsKt.g(bVar2))) {
                                                    z13 = true;
                                                }
                                            }
                                        }
                                    }
                                    if (!z13) {
                                        k3 = hVar.b();
                                        v7.g.e(k3, "valueParameterDescriptor.type");
                                        return j.c(k3);
                                    }
                                }
                                r b11 = hVar.b();
                                v7.g.e(b11, "valueParameterDescriptor.type");
                                k3 = TypeUtilsKt.k(b11);
                                return j.c(k3);
                            }
                        }
                    }
                }
                z12 = true;
                if (z12) {
                }
            }
            z10 = false;
            if (!z10) {
            }
            r b112 = hVar.b();
            v7.g.e(b112, "valueParameterDescriptor.type");
            k3 = TypeUtilsKt.k(b112);
            return j.c(k3);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, l8.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar;
        boolean z10;
        v7.g.f(aVar, "superDescriptor");
        v7.g.f(aVar2, "subDescriptor");
        boolean z11 = false;
        if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && !kotlin.reflect.jvm.internal.impl.builtins.e.A(aVar2)) {
            int i10 = BuiltinMethodsWithSpecialGenericSignature.f13612m;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) aVar2;
            h9.e name = eVar2.getName();
            v7.g.e(name, "subDescriptor.name");
            if (!BuiltinMethodsWithSpecialGenericSignature.b(name)) {
                SpecialGenericSignatures.a aVar3 = SpecialGenericSignatures.f13633a;
                h9.e name2 = eVar2.getName();
                v7.g.e(name2, "subDescriptor.name");
                if (!SpecialGenericSignatures.f13642k.contains(name2)) {
                }
            }
            CallableMemberDescriptor c = SpecialBuiltinMembers.c((CallableMemberDescriptor) aVar);
            boolean z12 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            if (z12) {
                eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) aVar;
            } else {
                eVar = null;
            }
            if (eVar != null && eVar2.q0() == eVar.q0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10) || (c != null && eVar2.q0())) {
                if ((bVar instanceof w8.c) && eVar2.C() == null && c != null && !SpecialBuiltinMembers.d(bVar, c)) {
                    if ((c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && z12 && BuiltinMethodsWithSpecialGenericSignature.a((kotlin.reflect.jvm.internal.impl.descriptors.e) c) != null) {
                        String a10 = j.a(eVar2, 2);
                        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar).a();
                        v7.g.e(a11, "superDescriptor.original");
                        if (v7.g.a(a10, j.a(a11, 2))) {
                        }
                    }
                }
            }
            z11 = true;
        }
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        if (z11) {
            return result;
        }
        if (a.a(aVar, aVar2)) {
            return result;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract b() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }
}
