package kotlin.reflect.jvm.internal;

import g9.d;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.b;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import l8.a0;
import l8.b0;
import l8.d0;
import l8.z;
import r8.k;
import r8.l;
import r8.n;
import r8.q;
import u8.p;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final h9.b f13291a = h9.b.l(new h9.c("java.lang.Void"));

    public static JvmFunctionSignature.c a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        String a10 = SpecialBuiltinMembers.a(eVar);
        if (a10 == null) {
            if (eVar instanceof a0) {
                String b5 = DescriptorUtilsKt.l(eVar).getName().b();
                v7.g.e(b5, "descriptor.propertyIfAccessor.name.asString()");
                a10 = p.a(b5);
            } else if (eVar instanceof b0) {
                String b10 = DescriptorUtilsKt.l(eVar).getName().b();
                v7.g.e(b10, "descriptor.propertyIfAccessor.name.asString()");
                a10 = p.b(b10);
            } else {
                a10 = eVar.getName().b();
                v7.g.e(a10, "descriptor.name.asString()");
            }
        }
        return new JvmFunctionSignature.c(new d.b(a10, d9.j.a(eVar, 1)));
    }

    public static b b(z zVar) {
        a9.a aVar;
        l lVar;
        d0 d0Var;
        a9.a aVar2;
        l lVar2;
        q qVar;
        v7.g.f(zVar, "possiblyOverriddenProperty");
        z a10 = ((z) k9.d.u(zVar)).a();
        v7.g.e(a10, "unwrapFakeOverride(possi…rriddenProperty).original");
        Method method = null;
        JvmFunctionSignature.c cVar = null;
        if (a10 instanceof w9.g) {
            w9.g gVar = (w9.g) a10;
            GeneratedMessageLite.d<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> dVar = JvmProtoBuf.f14437d;
            v7.g.e(dVar, "propertySignature");
            ProtoBuf$Property protoBuf$Property = gVar.J;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) f9.e.a(protoBuf$Property, dVar);
            if (jvmPropertySignature != null) {
                return new b.c(a10, protoBuf$Property, jvmPropertySignature, gVar.K, gVar.L);
            }
        } else if (a10 instanceof w8.e) {
            d0 j2 = ((w8.e) a10).j();
            if (j2 instanceof a9.a) {
                aVar = (a9.a) j2;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                lVar = aVar.c();
            } else {
                lVar = null;
            }
            if (lVar instanceof n) {
                return new b.a(((n) lVar).f17157a);
            }
            if (lVar instanceof q) {
                Method method2 = ((q) lVar).f17159a;
                b0 l2 = a10.l();
                if (l2 != null) {
                    d0Var = l2.j();
                } else {
                    d0Var = null;
                }
                if (d0Var instanceof a9.a) {
                    aVar2 = (a9.a) d0Var;
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    lVar2 = aVar2.c();
                } else {
                    lVar2 = null;
                }
                if (lVar2 instanceof q) {
                    qVar = (q) lVar2;
                } else {
                    qVar = null;
                }
                if (qVar != null) {
                    method = qVar.f17159a;
                }
                return new b.C0141b(method2, method);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + a10 + " (source = " + lVar + ')');
        }
        o8.d0 s10 = a10.s();
        v7.g.c(s10);
        JvmFunctionSignature.c a11 = a(s10);
        b0 l4 = a10.l();
        if (l4 != null) {
            cVar = a(l4);
        }
        return new b.d(a11, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0158, code lost:
        if (r0.m().isEmpty() != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JvmFunctionSignature c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        boolean z10;
        boolean z11;
        a9.a aVar;
        a9.a aVar2;
        l lVar;
        Method method;
        v7.g.f(eVar, "possiblySubstitutedFunction");
        kotlin.reflect.jvm.internal.impl.descriptors.e a10 = ((kotlin.reflect.jvm.internal.impl.descriptors.e) k9.d.u(eVar)).a();
        v7.g.e(a10, "unwrapFakeOverride(possi…titutedFunction).original");
        if (a10 instanceof w9.b) {
            w9.b bVar = (w9.b) a10;
            kotlin.reflect.jvm.internal.impl.protobuf.h V = bVar.V();
            if (V instanceof ProtoBuf$Function) {
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = g9.h.f11279a;
                d.b c = g9.h.c((ProtoBuf$Function) V, bVar.P0(), bVar.D0());
                if (c != null) {
                    return new JvmFunctionSignature.c(c);
                }
            }
            if (V instanceof ProtoBuf$Constructor) {
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar2 = g9.h.f11279a;
                d.b a11 = g9.h.a((ProtoBuf$Constructor) V, bVar.P0(), bVar.D0());
                if (a11 != null) {
                    l8.f c10 = eVar.c();
                    v7.g.e(c10, "possiblySubstitutedFunction.containingDeclaration");
                    if (k9.e.b(c10)) {
                        return new JvmFunctionSignature.c(a11);
                    }
                    return new JvmFunctionSignature.b(a11);
                }
            }
            return a(a10);
        }
        l lVar2 = null;
        q qVar = null;
        if (a10 instanceof JavaMethodDescriptor) {
            d0 j2 = ((JavaMethodDescriptor) a10).j();
            if (j2 instanceof a9.a) {
                aVar2 = (a9.a) j2;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                lVar = aVar2.c();
            } else {
                lVar = null;
            }
            if (lVar instanceof q) {
                qVar = (q) lVar;
            }
            if (qVar != null && (method = qVar.f17159a) != null) {
                return new JvmFunctionSignature.a(method);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + a10);
        } else if (a10 instanceof w8.b) {
            d0 j10 = ((w8.b) a10).j();
            if (j10 instanceof a9.a) {
                aVar = (a9.a) j10;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                lVar2 = aVar.c();
            }
            if (lVar2 instanceof k) {
                return new JvmFunctionSignature.JavaConstructor(((k) lVar2).f17155a);
            }
            if (lVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a aVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a) lVar2;
                if (aVar3.z()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(aVar3.f13595a);
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + a10 + " (" + lVar2 + ')');
        } else {
            boolean z12 = false;
            if (a10.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.g.c) && k9.c.k(a10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (a10.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.g.f13345a) && k9.c.k(a10)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (v7.g.a(a10.getName(), k8.a.f12919e)) {
                    }
                    if (!z12) {
                        return a(a10);
                    }
                    throw new KotlinReflectionInternalError("Unknown origin of " + a10 + " (" + a10.getClass() + ')');
                }
            }
            z12 = true;
            if (!z12) {
            }
        }
    }
}
