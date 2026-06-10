package kotlin.reflect.jvm.internal;

import g9.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.b;
import kotlin.reflect.jvm.internal.calls.b;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.r;
import kotlin.text.Regex;
import l8.l;
import l8.z;

/* loaded from: classes.dex */
public final class f {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a2, code lost:
        if (k9.d.n(r4, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.f13435m) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0221, code lost:
        if (r7.f() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0223, code lost:
        r8 = new kotlin.reflect.jvm.internal.calls.b.e.a(r0, c(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022e, code lost:
        r8 = new kotlin.reflect.jvm.internal.calls.b.e.c(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.reflect.jvm.internal.calls.a a(KPropertyImpl.a aVar, boolean z10) {
        JvmFunctionSignature.c cVar;
        Method method;
        kotlin.reflect.jvm.internal.calls.a dVar;
        Field field;
        kotlin.reflect.jvm.internal.calls.a aVar2;
        l8.f c;
        boolean z11;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature;
        boolean z12;
        Regex regex = KDeclarationContainerImpl.f13142i;
        String str = aVar.h().f13201l;
        regex.getClass();
        v7.g.f(str, "input");
        if (regex.f15129i.matcher(str).matches()) {
            return kotlin.reflect.jvm.internal.calls.e.f13281a;
        }
        h9.b bVar = i.f13291a;
        b b5 = i.b(aVar.h().d());
        boolean z13 = true;
        if (b5 instanceof b.c) {
            b.c cVar2 = (b.c) b5;
            Method method2 = null;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = cVar2.c;
            if (z10) {
                if ((jvmPropertySignature.f14470j & 4) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jvmMethodSignature = jvmPropertySignature.f14473m;
                    if (jvmMethodSignature != null) {
                        KDeclarationContainerImpl kDeclarationContainerImpl = aVar.h().f13199j;
                        int i10 = jvmMethodSignature.f14461k;
                        f9.c cVar3 = cVar2.f13242d;
                        method2 = kDeclarationContainerImpl.g(cVar3.getString(i10), cVar3.getString(jvmMethodSignature.f14462l));
                    }
                    if (method2 != null) {
                        if (k9.e.d(aVar.h().d()) && v7.g.a(aVar.h().d().g(), l.f15841d)) {
                            Class K1 = a1.c.K1(aVar.h().d().c());
                            if (K1 != null) {
                                Method G0 = a1.c.G0(K1, aVar.h().d());
                                if (aVar.f()) {
                                    dVar = new d.a(G0, c(aVar));
                                } else {
                                    dVar = new d.b(G0);
                                }
                            } else {
                                throw new KotlinReflectionInternalError("Underlying property of inline class " + aVar.h() + " should have a field");
                            }
                        } else {
                            field = aVar.h().n.k0();
                            if (field == null) {
                                throw new KotlinReflectionInternalError("No accessors or field is found for property " + aVar.h());
                            }
                            z d5 = aVar.h().d();
                            c = d5.c();
                            v7.g.e(c, "containingDeclaration");
                            if (!k9.d.l(c)) {
                                l8.f c10 = c.c();
                                if (!k9.d.n(c10, ClassKind.f13432j)) {
                                }
                                if ((d5 instanceof w9.g) && g9.h.d(((w9.g) d5).J)) {
                                    if (!z13 && Modifier.isStatic(field.getModifiers())) {
                                        if (!aVar.h().d().getAnnotations().i(f8.i.f10969a)) {
                                            if (z10) {
                                                if (aVar.f()) {
                                                    aVar2 = new b.e.C0144b(field);
                                                } else {
                                                    aVar2 = new b.e.d(field);
                                                }
                                            } else if (aVar.f()) {
                                                aVar2 = new b.f.C0146b(field, b(aVar));
                                            } else {
                                                aVar2 = new b.f.d(field, b(aVar));
                                            }
                                        } else if (z10) {
                                            aVar2 = new b.e.C0145e(field);
                                        } else {
                                            aVar2 = new b.f.e(field, b(aVar));
                                        }
                                    }
                                    if (aVar.f()) {
                                        aVar2 = new b.f.a(field, b(aVar), c(aVar));
                                    } else {
                                        aVar2 = new b.f.c(field, b(aVar));
                                    }
                                }
                            }
                            z13 = false;
                            if (!z13) {
                                if (!aVar.h().d().getAnnotations().i(f8.i.f10969a)) {
                                }
                            }
                            if (aVar.f()) {
                            }
                        }
                    } else if (!Modifier.isStatic(method2.getModifiers())) {
                        if (aVar.f()) {
                            aVar2 = new b.g.a(method2, c(aVar));
                        } else {
                            aVar2 = new b.g.d(method2);
                        }
                    } else if (aVar.h().d().getAnnotations().i(f8.i.f10969a)) {
                        if (aVar.f()) {
                            aVar2 = new b.g.C0147b(method2);
                        } else {
                            aVar2 = new b.g.e(method2);
                        }
                    } else if (aVar.f()) {
                        aVar2 = new b.g.c(method2, c(aVar));
                    } else {
                        aVar2 = new b.g.f(method2);
                    }
                }
                jvmMethodSignature = null;
                if (jvmMethodSignature != null) {
                }
                if (method2 != null) {
                }
            } else {
                if ((jvmPropertySignature.f14470j & 8) == 8) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    jvmMethodSignature = jvmPropertySignature.n;
                    if (jvmMethodSignature != null) {
                    }
                    if (method2 != null) {
                    }
                }
                jvmMethodSignature = null;
                if (jvmMethodSignature != null) {
                }
                if (method2 != null) {
                }
            }
            return a1.c.r0(dVar, aVar.g(), false);
        } else if (b5 instanceof b.a) {
            field = ((b.a) b5).f13237a;
            z d52 = aVar.h().d();
            c = d52.c();
            v7.g.e(c, "containingDeclaration");
            if (!k9.d.l(c)) {
            }
            z13 = false;
            if (!z13) {
            }
            if (aVar.f()) {
            }
        } else if (b5 instanceof b.C0141b) {
            b.C0141b c0141b = (b.C0141b) b5;
            if (z10) {
                method = c0141b.f13238a;
            } else {
                method = c0141b.f13239b;
                if (method == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + c0141b.f13238a);
                }
            }
            if (aVar.f()) {
                dVar = new b.g.a(method, c(aVar));
            } else {
                dVar = new b.g.d(method);
            }
            return a1.c.r0(dVar, aVar.g(), false);
        } else if (b5 instanceof b.d) {
            b.d dVar2 = (b.d) b5;
            if (z10) {
                cVar = dVar2.f13245a;
            } else {
                cVar = dVar2.f13246b;
                if (cVar == null) {
                    throw new KotlinReflectionInternalError("No setter found for property " + aVar.h());
                }
            }
            KDeclarationContainerImpl kDeclarationContainerImpl2 = aVar.h().f13199j;
            d.b bVar2 = cVar.f13091a;
            Method g10 = kDeclarationContainerImpl2.g(bVar2.f11272a, bVar2.f11273b);
            if (g10 != null) {
                Modifier.isStatic(g10.getModifiers());
                if (aVar.f()) {
                    return new b.g.a(g10, c(aVar));
                }
                return new b.g.d(g10);
            }
            throw new KotlinReflectionInternalError("No accessor found for property " + aVar.h());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        dVar = aVar2;
        return a1.c.r0(dVar, aVar.g(), false);
    }

    public static final boolean b(KPropertyImpl.a<?, ?> aVar) {
        return !r.g(aVar.h().d().b());
    }

    public static final Object c(KPropertyImpl.a<?, ?> aVar) {
        v7.g.f(aVar, "<this>");
        KPropertyImpl<?> h10 = aVar.h();
        return a1.c.e0(h10.f13202m, h10.d());
    }
}
