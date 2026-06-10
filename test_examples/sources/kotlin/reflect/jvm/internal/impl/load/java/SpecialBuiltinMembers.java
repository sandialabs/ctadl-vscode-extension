package kotlin.reflect.jvm.internal.impl.load.java;

import d9.j;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.o;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import l8.z;
import u7.l;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class SpecialBuiltinMembers {
    public static final String a(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2;
        h9.e eVar;
        h9.e eVar2;
        if (kotlin.reflect.jvm.internal.impl.builtins.e.A(callableMemberDescriptor)) {
            callableMemberDescriptor2 = b(callableMemberDescriptor);
        } else {
            callableMemberDescriptor2 = null;
        }
        if (callableMemberDescriptor2 == null) {
            return null;
        }
        CallableMemberDescriptor l2 = DescriptorUtilsKt.l(callableMemberDescriptor2);
        if (l2 instanceof z) {
            kotlin.reflect.jvm.internal.impl.builtins.e.A(l2);
            CallableMemberDescriptor b5 = DescriptorUtilsKt.b(DescriptorUtilsKt.l(l2), ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1.f13615j);
            if (b5 == null || (eVar2 = u8.c.f17841a.get(DescriptorUtilsKt.g(b5))) == null) {
                return null;
            }
            return eVar2.b();
        } else if (!(l2 instanceof g)) {
            return null;
        } else {
            int i10 = b.f13657m;
            LinkedHashMap linkedHashMap = SpecialGenericSignatures.f13641j;
            String b10 = j.b((g) l2);
            if (b10 == null) {
                eVar = null;
            } else {
                eVar = (h9.e) linkedHashMap.get(b10);
            }
            if (eVar == null) {
                return null;
            }
            return eVar.b();
        }
    }

    public static final <T extends CallableMemberDescriptor> T b(T t10) {
        boolean z10;
        l lVar;
        v7.g.f(t10, "<this>");
        if (!SpecialGenericSignatures.f13642k.contains(t10.getName()) && !u8.c.f17843d.contains(DescriptorUtilsKt.l(t10).getName())) {
            return null;
        }
        if (t10 instanceof z) {
            z10 = true;
        } else {
            z10 = t10 instanceof f;
        }
        if (z10) {
            lVar = SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1.f13630j;
        } else if (!(t10 instanceof g)) {
            return null;
        } else {
            lVar = SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2.f13631j;
        }
        return (T) DescriptorUtilsKt.b(t10, lVar);
    }

    public static final <T extends CallableMemberDescriptor> T c(T t10) {
        v7.g.f(t10, "<this>");
        T t11 = (T) b(t10);
        if (t11 != null) {
            return t11;
        }
        int i10 = BuiltinMethodsWithSpecialGenericSignature.f13612m;
        h9.e name = t10.getName();
        v7.g.e(name, "name");
        if (BuiltinMethodsWithSpecialGenericSignature.b(name)) {
            return (T) DescriptorUtilsKt.b(t10, SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.f13632j);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
        if (r0 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
        return !kotlin.reflect.jvm.internal.impl.builtins.e.A(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(l8.b bVar, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        boolean z11;
        v7.g.f(bVar, "<this>");
        v7.g.f(callableMemberDescriptor, "specialCallableDescriptor");
        l8.f c = callableMemberDescriptor.c();
        v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        v r3 = ((l8.b) c).r();
        v7.g.e(r3, "specialCallableDescripto…ssDescriptor).defaultType");
        while (true) {
            bVar = k9.d.j(bVar);
            boolean z12 = false;
            if (bVar == null) {
                return false;
            }
            if (!(bVar instanceof w8.c)) {
                v r10 = bVar.r();
                if (r10 != null) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    m0 m0Var = null;
                    arrayDeque.add(new z9.e(r10, null));
                    e0 U0 = r3.U0();
                    while (true) {
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        z9.e eVar = (z9.e) arrayDeque.poll();
                        r rVar = eVar.f19189a;
                        e0 U02 = rVar.U0();
                        if (U02 != null) {
                            if (U0 != null) {
                                if (U02.equals(U0)) {
                                    boolean V0 = rVar.V0();
                                    while (true) {
                                        eVar = eVar.f19190b;
                                        if (eVar == null) {
                                            break;
                                        }
                                        r rVar2 = eVar.f19189a;
                                        List<f0> S0 = rVar2.S0();
                                        boolean z13 = S0 instanceof Collection;
                                        Variance variance = Variance.INVARIANT;
                                        if (!z13 || !S0.isEmpty()) {
                                            for (f0 f0Var : S0) {
                                                if (f0Var.a() != variance) {
                                                    z10 = true;
                                                    continue;
                                                } else {
                                                    z10 = false;
                                                    continue;
                                                }
                                                if (z10) {
                                                    z11 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z11) {
                                            rVar = CapturedTypeApproximationKt.a(TypeSubstitutor.d(CapturedTypeConstructorKt.b(o.f15066b.a(rVar2))).i(rVar, variance)).f6584b;
                                        } else {
                                            rVar = TypeSubstitutor.d(o.f15066b.a(rVar2)).i(rVar, variance);
                                        }
                                        if (!V0 && !rVar2.V0()) {
                                            V0 = false;
                                        }
                                        V0 = true;
                                    }
                                    e0 U03 = rVar.U0();
                                    if (U03 != null) {
                                        if (U03.equals(U0)) {
                                            m0Var = kotlin.reflect.jvm.internal.impl.types.r.j(rVar, V0);
                                        } else {
                                            throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + z9.f.a(U03) + ", \n\nsupertype: " + z9.f.a(U0) + " \n" + U03.equals(U0));
                                        }
                                    } else {
                                        m0.b.i(3);
                                        throw null;
                                    }
                                } else {
                                    for (r rVar3 : U02.f()) {
                                        v7.g.e(rVar3, "immediateSupertype");
                                        arrayDeque.add(new z9.e(rVar3, eVar));
                                    }
                                }
                            } else {
                                m0.b.i(4);
                                throw null;
                            }
                        } else {
                            m0.b.i(3);
                            throw null;
                        }
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
            }
        }
    }
}
