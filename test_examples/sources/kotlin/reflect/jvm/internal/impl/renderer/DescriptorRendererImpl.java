package kotlin.reflect.jvm.internal.impl.renderer;

import c8.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k9.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import l8.a0;
import l8.b0;
import l8.c0;
import l8.f;
import l8.h;
import l8.h0;
import l8.i;
import l8.i0;
import l8.l;
import l8.l0;
import l8.m;
import l8.s;
import l8.u;
import l8.x;
import l8.z;
import m7.e;
import m7.n;
import m9.n;
import o8.d0;
import v7.g;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.n0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements b {
    public final DescriptorRendererOptionsImpl c;

    /* renamed from: d  reason: collision with root package name */
    public final e f14606d = kotlin.a.b(new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));

    /* loaded from: classes.dex */
    public final class a implements h<n, StringBuilder> {
        public a() {
        }

        @Override // l8.h
        public final n a(u uVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(uVar, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.Y(uVar.e(), "package-fragment", sb2);
            if (descriptorRendererImpl.j()) {
                sb2.append(" in ");
                descriptorRendererImpl.U(uVar.c(), sb2, false);
            }
            return n.f16010a;
        }

        @Override // l8.h
        public final n b(z zVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(zVar, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl.w(DescriptorRendererImpl.this, zVar, sb2);
            return n.f16010a;
        }

        @Override // l8.h
        public final /* bridge */ /* synthetic */ n c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
            n(eVar, sb);
            return n.f16010a;
        }

        @Override // l8.h
        public final n d(b0 b0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(b0Var, "descriptor");
            g.f(sb2, "builder");
            o(b0Var, sb2, "setter");
            return n.f16010a;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
        @Override // l8.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final n e(c cVar, StringBuilder sb) {
            boolean z10;
            boolean z11;
            kotlin.reflect.jvm.internal.impl.descriptors.b A0;
            ArrayList arrayList;
            boolean z12;
            StringBuilder sb2 = sb;
            g.f(cVar, "constructorDescriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.G(sb2, cVar, null);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
            descriptorRendererOptionsImpl.getClass();
            j<?>[] jVarArr = DescriptorRendererOptionsImpl.W;
            if (((Boolean) descriptorRendererOptionsImpl.f14644o.b(descriptorRendererOptionsImpl, jVarArr[13])).booleanValue() || cVar.P().p() != Modality.SEALED) {
                m g10 = cVar.g();
                g.e(g10, "constructor.visibility");
                if (descriptorRendererImpl.l0(g10, sb2)) {
                    z10 = true;
                    descriptorRendererImpl.P(cVar, sb2);
                    if (!((Boolean) descriptorRendererOptionsImpl.O.b(descriptorRendererOptionsImpl, jVarArr[39])).booleanValue() && cVar.O() && !z10) {
                        z11 = false;
                        if (z11) {
                            sb2.append(descriptorRendererImpl.O("constructor"));
                        }
                        l8.e c = cVar.c();
                        g.e(c, "constructor.containingDeclaration");
                        if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, jVarArr[24])).booleanValue()) {
                            if (z11) {
                                sb2.append(" ");
                            }
                            descriptorRendererImpl.U(c, sb2, true);
                            List<i0> typeParameters = cVar.getTypeParameters();
                            g.e(typeParameters, "constructor.typeParameters");
                            descriptorRendererImpl.h0(typeParameters, sb2, false);
                        }
                        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = cVar.m();
                        g.e(m10, "constructor.valueParameters");
                        descriptorRendererImpl.k0(m10, cVar.Z(), sb2);
                        if (((Boolean) descriptorRendererOptionsImpl.f14646q.b(descriptorRendererOptionsImpl, jVarArr[15])).booleanValue() && !cVar.O() && (c instanceof l8.b) && (A0 = ((l8.b) c).A0()) != null) {
                            List<kotlin.reflect.jvm.internal.impl.descriptors.h> m11 = A0.m();
                            g.e(m11, "primaryConstructor.valueParameters");
                            arrayList = new ArrayList();
                            for (Object obj : m11) {
                                kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) obj;
                                if (!hVar.j0() && hVar.N() == null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    arrayList.add(obj);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                sb2.append(" : ");
                                sb2.append(descriptorRendererImpl.O("this"));
                                sb2.append(kotlin.collections.c.t2(arrayList, ", ", "(", ")", DescriptorRendererImpl$renderConstructor$1.f14612j, 24));
                            }
                        }
                        if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[24])).booleanValue()) {
                            List<i0> typeParameters2 = cVar.getTypeParameters();
                            g.e(typeParameters2, "constructor.typeParameters");
                            descriptorRendererImpl.m0(sb2, typeParameters2);
                        }
                        return n.f16010a;
                    }
                    z11 = true;
                    if (z11) {
                    }
                    l8.e c10 = cVar.c();
                    g.e(c10, "constructor.containingDeclaration");
                    if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, jVarArr[24])).booleanValue()) {
                    }
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m102 = cVar.m();
                    g.e(m102, "constructor.valueParameters");
                    descriptorRendererImpl.k0(m102, cVar.Z(), sb2);
                    if (((Boolean) descriptorRendererOptionsImpl.f14646q.b(descriptorRendererOptionsImpl, jVarArr[15])).booleanValue()) {
                        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m112 = A0.m();
                        g.e(m112, "primaryConstructor.valueParameters");
                        arrayList = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                    }
                    if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[24])).booleanValue()) {
                    }
                    return n.f16010a;
                }
            }
            z10 = false;
            descriptorRendererImpl.P(cVar, sb2);
            if (!((Boolean) descriptorRendererOptionsImpl.O.b(descriptorRendererOptionsImpl, jVarArr[39])).booleanValue()) {
                z11 = false;
                if (z11) {
                }
                l8.e c102 = cVar.c();
                g.e(c102, "constructor.containingDeclaration");
                if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, jVarArr[24])).booleanValue()) {
                }
                List<kotlin.reflect.jvm.internal.impl.descriptors.h> m1022 = cVar.m();
                g.e(m1022, "constructor.valueParameters");
                descriptorRendererImpl.k0(m1022, cVar.Z(), sb2);
                if (((Boolean) descriptorRendererOptionsImpl.f14646q.b(descriptorRendererOptionsImpl, jVarArr[15])).booleanValue()) {
                }
                if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[24])).booleanValue()) {
                }
                return n.f16010a;
            }
            z11 = true;
            if (z11) {
            }
            l8.e c1022 = cVar.c();
            g.e(c1022, "constructor.containingDeclaration");
            if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, jVarArr[24])).booleanValue()) {
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10222 = cVar.m();
            g.e(m10222, "constructor.valueParameters");
            descriptorRendererImpl.k0(m10222, cVar.Z(), sb2);
            if (((Boolean) descriptorRendererOptionsImpl.f14646q.b(descriptorRendererOptionsImpl, jVarArr[15])).booleanValue()) {
            }
            if (((Boolean) descriptorRendererOptionsImpl.f14655z.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[24])).booleanValue()) {
            }
            return n.f16010a;
        }

        @Override // l8.h
        public final n f(c0 c0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(c0Var, "descriptor");
            g.f(sb2, "builder");
            sb2.append(c0Var.getName());
            return n.f16010a;
        }

        @Override // l8.h
        public final n g(s sVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(sVar, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl.this.U(sVar, sb2, true);
            return n.f16010a;
        }

        @Override // l8.h
        public final n h(h0 h0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(h0Var, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.G(sb2, h0Var, null);
            m g10 = h0Var.g();
            g.e(g10, "typeAlias.visibility");
            descriptorRendererImpl.l0(g10, sb2);
            descriptorRendererImpl.Q(h0Var, sb2);
            sb2.append(descriptorRendererImpl.O("typealias"));
            sb2.append(" ");
            descriptorRendererImpl.U(h0Var, sb2, true);
            List<i0> x3 = h0Var.x();
            g.e(x3, "typeAlias.declaredTypeParameters");
            descriptorRendererImpl.h0(x3, sb2, false);
            descriptorRendererImpl.H(h0Var, sb2);
            sb2.append(" = ");
            sb2.append(descriptorRendererImpl.u(h0Var.F()));
            return n.f16010a;
        }

        @Override // l8.h
        public final n i(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(hVar, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl.this.j0(hVar, true, sb2, true);
            return n.f16010a;
        }

        @Override // l8.h
        public final n j(l8.b bVar, StringBuilder sb) {
            boolean z10;
            kotlin.reflect.jvm.internal.impl.descriptors.b A0;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            String str;
            StringBuilder sb2 = sb;
            g.f(bVar, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            if (bVar.h() == ClassKind.f13434l) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!descriptorRendererImpl.A()) {
                descriptorRendererImpl.G(sb2, bVar, null);
                List<c0> N0 = bVar.N0();
                g.e(N0, "klass.contextReceivers");
                descriptorRendererImpl.J(sb2, N0);
                if (!z10) {
                    m g10 = bVar.g();
                    g.e(g10, "klass.visibility");
                    descriptorRendererImpl.l0(g10, sb2);
                }
                if ((bVar.h() != ClassKind.f13432j || bVar.p() != Modality.ABSTRACT) && (!bVar.h().a() || bVar.p() != Modality.FINAL)) {
                    Modality p10 = bVar.p();
                    g.e(p10, "klass.modality");
                    descriptorRendererImpl.R(p10, sb2, DescriptorRendererImpl.E(bVar));
                }
                descriptorRendererImpl.Q(bVar, sb2);
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.INNER) && bVar.m0()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                descriptorRendererImpl.T(sb2, z11, "inner");
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.DATA) && bVar.Q0()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                descriptorRendererImpl.T(sb2, z12, "data");
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.INLINE) && bVar.i()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                descriptorRendererImpl.T(sb2, z13, "inline");
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.VALUE) && bVar.i0()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                descriptorRendererImpl.T(sb2, z14, "value");
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.FUN) && bVar.T()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                descriptorRendererImpl.T(sb2, z15, "fun");
                if (bVar instanceof h0) {
                    str = "typealias";
                } else if (bVar.H()) {
                    str = "companion object";
                } else {
                    int ordinal = bVar.h().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        if (ordinal == 5) {
                                            str = "object";
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        str = "annotation class";
                                    }
                                } else {
                                    str = "enum entry";
                                }
                            } else {
                                str = "enum class";
                            }
                        } else {
                            str = "interface";
                        }
                    } else {
                        str = "class";
                    }
                }
                sb2.append(descriptorRendererImpl.O(str));
            }
            boolean l2 = d.l(bVar);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
            if (!l2) {
                if (!descriptorRendererImpl.A()) {
                    DescriptorRendererImpl.c0(sb2);
                }
                descriptorRendererImpl.U(bVar, sb2, true);
            } else {
                if (((Boolean) descriptorRendererOptionsImpl.F.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[30])).booleanValue()) {
                    if (descriptorRendererImpl.A()) {
                        sb2.append("companion object");
                    }
                    DescriptorRendererImpl.c0(sb2);
                    f c = bVar.c();
                    if (c != null) {
                        sb2.append("of ");
                        h9.e name = c.getName();
                        g.e(name, "containingDeclaration.name");
                        sb2.append(descriptorRendererImpl.t(name, false));
                    }
                }
                if (descriptorRendererImpl.D() || !g.a(bVar.getName(), h9.g.f11576b)) {
                    if (!descriptorRendererImpl.A()) {
                        DescriptorRendererImpl.c0(sb2);
                    }
                    h9.e name2 = bVar.getName();
                    g.e(name2, "descriptor.name");
                    sb2.append(descriptorRendererImpl.t(name2, true));
                }
            }
            if (!z10) {
                List<i0> x3 = bVar.x();
                g.e(x3, "klass.declaredTypeParameters");
                descriptorRendererImpl.h0(x3, sb2, false);
                descriptorRendererImpl.H(bVar, sb2);
                if (!bVar.h().a() && ((Boolean) descriptorRendererOptionsImpl.f14639i.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[7])).booleanValue() && (A0 = bVar.A0()) != null) {
                    sb2.append(" ");
                    descriptorRendererImpl.G(sb2, A0, null);
                    m g11 = A0.g();
                    g.e(g11, "primaryConstructor.visibility");
                    descriptorRendererImpl.l0(g11, sb2);
                    sb2.append(descriptorRendererImpl.O("constructor"));
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = A0.m();
                    g.e(m10, "primaryConstructor.valueParameters");
                    descriptorRendererImpl.k0(m10, A0.Z(), sb2);
                }
                if (!((Boolean) descriptorRendererOptionsImpl.f14652w.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[21])).booleanValue() && !kotlin.reflect.jvm.internal.impl.builtins.e.F(bVar.r())) {
                    Collection<r> f10 = bVar.o().f();
                    g.e(f10, "klass.typeConstructor.supertypes");
                    if (!f10.isEmpty() && (f10.size() != 1 || !kotlin.reflect.jvm.internal.impl.builtins.e.y(f10.iterator().next()))) {
                        DescriptorRendererImpl.c0(sb2);
                        sb2.append(": ");
                        kotlin.collections.c.s2(f10, sb2, ", ", null, null, new DescriptorRendererImpl$renderSuperTypes$1(descriptorRendererImpl), 60);
                    }
                }
                descriptorRendererImpl.m0(sb2, x3);
            }
            return n.f16010a;
        }

        @Override // l8.h
        public final n k(a0 a0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(a0Var, "descriptor");
            g.f(sb2, "builder");
            o(a0Var, sb2, "getter");
            return n.f16010a;
        }

        @Override // l8.h
        public final n l(i0 i0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(i0Var, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl.this.f0(i0Var, sb2, true);
            return n.f16010a;
        }

        @Override // l8.h
        public final n m(x xVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            g.f(xVar, "descriptor");
            g.f(sb2, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.Y(xVar.e(), "package", sb2);
            if (descriptorRendererImpl.j()) {
                sb2.append(" in context of ");
                descriptorRendererImpl.U(xVar.o0(), sb2, false);
            }
            return n.f16010a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x01ad, code lost:
            if (kotlin.reflect.jvm.internal.impl.builtins.e.E(r1, kotlin.reflect.jvm.internal.impl.builtins.g.a.f13362d) == false) goto L65;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb) {
            String u10;
            boolean z10;
            boolean z11;
            boolean z12;
            g.f(eVar, "descriptor");
            g.f(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            boolean A = descriptorRendererImpl.A();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
            if (!A) {
                j9.a aVar = descriptorRendererOptionsImpl.f14637g;
                j<?>[] jVarArr = DescriptorRendererOptionsImpl.W;
                if (!((Boolean) aVar.b(descriptorRendererOptionsImpl, jVarArr[5])).booleanValue()) {
                    descriptorRendererImpl.G(sb, eVar, null);
                    List<c0> b02 = eVar.b0();
                    g.e(b02, "function.contextReceiverParameters");
                    descriptorRendererImpl.J(sb, b02);
                    m g10 = eVar.g();
                    g.e(g10, "function.visibility");
                    descriptorRendererImpl.l0(g10, sb);
                    descriptorRendererImpl.S(eVar, sb);
                    if (((Boolean) descriptorRendererOptionsImpl.R.b(descriptorRendererOptionsImpl, jVarArr[42])).booleanValue()) {
                        descriptorRendererImpl.Q(eVar, sb);
                    }
                    descriptorRendererImpl.X(eVar, sb);
                    if (((Boolean) descriptorRendererOptionsImpl.R.b(descriptorRendererOptionsImpl, jVarArr[42])).booleanValue()) {
                        boolean z13 = false;
                        if (eVar.v0()) {
                            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> f10 = eVar.f();
                            g.e(f10, "functionDescriptor.overriddenDescriptors");
                            if (!f10.isEmpty()) {
                                for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 : f10) {
                                    if (eVar2.v0()) {
                                        z12 = false;
                                        break;
                                    }
                                }
                            }
                            z12 = true;
                            if (z12 || ((Boolean) descriptorRendererOptionsImpl.N.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[38])).booleanValue()) {
                                z10 = true;
                                if (eVar.O0()) {
                                    Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> f11 = eVar.f();
                                    g.e(f11, "functionDescriptor.overriddenDescriptors");
                                    if (!f11.isEmpty()) {
                                        for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar3 : f11) {
                                            if (eVar3.O0()) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                    }
                                    z11 = true;
                                    if (z11 || ((Boolean) descriptorRendererOptionsImpl.N.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[38])).booleanValue()) {
                                        z13 = true;
                                    }
                                }
                                descriptorRendererImpl.T(sb, eVar.u0(), "tailrec");
                                descriptorRendererImpl.T(sb, eVar.r0(), "suspend");
                                descriptorRendererImpl.T(sb, eVar.i(), "inline");
                                descriptorRendererImpl.T(sb, z13, "infix");
                                descriptorRendererImpl.T(sb, z10, "operator");
                            }
                        }
                        z10 = false;
                        if (eVar.O0()) {
                        }
                        descriptorRendererImpl.T(sb, eVar.u0(), "tailrec");
                        descriptorRendererImpl.T(sb, eVar.r0(), "suspend");
                        descriptorRendererImpl.T(sb, eVar.i(), "inline");
                        descriptorRendererImpl.T(sb, z13, "infix");
                        descriptorRendererImpl.T(sb, z10, "operator");
                    } else {
                        descriptorRendererImpl.T(sb, eVar.r0(), "suspend");
                    }
                    descriptorRendererImpl.P(eVar, sb);
                    if (descriptorRendererImpl.D()) {
                        if (eVar.q0()) {
                            sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                        }
                        if (eVar.G0()) {
                            sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                        }
                    }
                }
                sb.append(descriptorRendererImpl.O("fun"));
                sb.append(" ");
                List<i0> typeParameters = eVar.getTypeParameters();
                g.e(typeParameters, "function.typeParameters");
                descriptorRendererImpl.h0(typeParameters, sb, true);
                descriptorRendererImpl.a0(sb, eVar);
            }
            descriptorRendererImpl.U(eVar, sb, true);
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = eVar.m();
            g.e(m10, "function.valueParameters");
            descriptorRendererImpl.k0(m10, eVar.Z(), sb);
            descriptorRendererImpl.b0(sb, eVar);
            r k3 = eVar.k();
            j9.a aVar2 = descriptorRendererOptionsImpl.f14642l;
            j<?>[] jVarArr2 = DescriptorRendererOptionsImpl.W;
            if (!((Boolean) aVar2.b(descriptorRendererOptionsImpl, jVarArr2[10])).booleanValue()) {
                if (!((Boolean) descriptorRendererOptionsImpl.f14641k.b(descriptorRendererOptionsImpl, jVarArr2[9])).booleanValue() && k3 != null) {
                    h9.e eVar4 = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
                }
                sb.append(": ");
                if (k3 == null) {
                    u10 = "[NULL]";
                } else {
                    u10 = descriptorRendererImpl.u(k3);
                }
                sb.append(u10);
            }
            List<i0> typeParameters2 = eVar.getTypeParameters();
            g.e(typeParameters2, "function.typeParameters");
            descriptorRendererImpl.m0(sb, typeParameters2);
        }

        public final void o(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, StringBuilder sb, String str) {
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
            int ordinal = ((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.G.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[31])).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n(fVar, sb);
                    return;
                }
                return;
            }
            descriptorRendererImpl.Q(fVar, sb);
            sb.append(str.concat(" for "));
            z C0 = fVar.C0();
            g.e(C0, "descriptor.correspondingProperty");
            DescriptorRendererImpl.w(descriptorRendererImpl, C0, sb);
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.c = descriptorRendererOptionsImpl;
    }

    public static Modality E(l8.r rVar) {
        boolean z10 = rVar instanceof l8.b;
        Modality modality = Modality.ABSTRACT;
        ClassKind classKind = ClassKind.f13432j;
        Modality modality2 = Modality.FINAL;
        if (z10) {
            return ((l8.b) rVar).h() == classKind ? modality : modality2;
        }
        f c = rVar.c();
        l8.b bVar = c instanceof l8.b ? (l8.b) c : null;
        if (bVar != null && (rVar instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) rVar;
            Collection<? extends CallableMemberDescriptor> f10 = callableMemberDescriptor.f();
            g.e(f10, "this.overriddenDescriptors");
            boolean z11 = !f10.isEmpty();
            Modality modality3 = Modality.OPEN;
            return (!z11 || bVar.p() == modality2) ? (bVar.h() != classKind || g.a(callableMemberDescriptor.g(), l.f15839a)) ? modality2 : callableMemberDescriptor.p() == modality ? modality : modality3 : modality3;
        }
        return modality2;
    }

    public static void c0(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean n0(r rVar) {
        boolean z10;
        if (kotlin.reflect.jvm.internal.impl.builtins.c.h(rVar)) {
            List<f0> S0 = rVar.S0();
            if (!(S0 instanceof Collection) || !S0.isEmpty()) {
                for (f0 f0Var : S0) {
                    if (f0Var.d()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            return z10;
        }
        return false;
    }

    public static final void w(DescriptorRendererImpl descriptorRendererImpl, z zVar, StringBuilder sb) {
        boolean z10;
        boolean z11;
        if (!descriptorRendererImpl.A()) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
            j9.a aVar = descriptorRendererOptionsImpl.f14637g;
            j<?>[] jVarArr = DescriptorRendererOptionsImpl.W;
            if (!((Boolean) aVar.b(descriptorRendererOptionsImpl, jVarArr[5])).booleanValue()) {
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.G(sb, zVar, null);
                    l8.n a02 = zVar.a0();
                    if (a02 != null) {
                        descriptorRendererImpl.G(sb, a02, AnnotationUseSiteTarget.f13466j);
                    }
                    l8.n U = zVar.U();
                    if (U != null) {
                        descriptorRendererImpl.G(sb, U, AnnotationUseSiteTarget.f13473r);
                    }
                    if (((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.G.b(descriptorRendererOptionsImpl, jVarArr[31])) == PropertyAccessorRenderingPolicy.NONE) {
                        d0 s10 = zVar.s();
                        if (s10 != null) {
                            descriptorRendererImpl.G(sb, s10, AnnotationUseSiteTarget.f13469m);
                        }
                        b0 l2 = zVar.l();
                        if (l2 != null) {
                            descriptorRendererImpl.G(sb, l2, AnnotationUseSiteTarget.n);
                            List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = l2.m();
                            g.e(m10, "setter.valueParameters");
                            kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) kotlin.collections.c.C2(m10);
                            g.e(hVar, "it");
                            descriptorRendererImpl.G(sb, hVar, AnnotationUseSiteTarget.f13472q);
                        }
                    }
                }
                List<c0> b02 = zVar.b0();
                g.e(b02, "property.contextReceiverParameters");
                descriptorRendererImpl.J(sb, b02);
                m g10 = zVar.g();
                g.e(g10, "property.visibility");
                descriptorRendererImpl.l0(g10, sb);
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.CONST) && zVar.I()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                descriptorRendererImpl.T(sb, z10, "const");
                descriptorRendererImpl.Q(zVar, sb);
                descriptorRendererImpl.S(zVar, sb);
                descriptorRendererImpl.X(zVar, sb);
                if (descriptorRendererImpl.z().contains(DescriptorRendererModifier.LATEINIT) && zVar.f0()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                descriptorRendererImpl.T(sb, z11, "lateinit");
                descriptorRendererImpl.P(zVar, sb);
            }
            descriptorRendererImpl.i0(zVar, sb, false);
            List<i0> typeParameters = zVar.getTypeParameters();
            g.e(typeParameters, "property.typeParameters");
            descriptorRendererImpl.h0(typeParameters, sb, true);
            descriptorRendererImpl.a0(sb, zVar);
        }
        descriptorRendererImpl.U(zVar, sb, true);
        sb.append(": ");
        r b5 = zVar.b();
        g.e(b5, "property.type");
        sb.append(descriptorRendererImpl.u(b5));
        descriptorRendererImpl.b0(sb, zVar);
        descriptorRendererImpl.N(zVar, sb);
        List<i0> typeParameters2 = zVar.getTypeParameters();
        g.e(typeParameters2, "property.typeParameters");
        descriptorRendererImpl.m0(sb, typeParameters2);
    }

    public final boolean A() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.f14636f.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[4])).booleanValue();
    }

    public final RenderingFormat B() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (RenderingFormat) descriptorRendererOptionsImpl.C.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[27]);
    }

    public final DescriptorRenderer.b C() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (DescriptorRenderer.b) descriptorRendererOptionsImpl.B.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[26]);
    }

    public final boolean D() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.f14640j.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[8])).booleanValue();
    }

    public final String F(f fVar) {
        f c;
        String str;
        String s10;
        g.f(fVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        fVar.n0(new a(), sb);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        j9.a aVar = descriptorRendererOptionsImpl.c;
        j<?>[] jVarArr = DescriptorRendererOptionsImpl.W;
        if (((Boolean) aVar.b(descriptorRendererOptionsImpl, jVarArr[1])).booleanValue() && !(fVar instanceof u) && !(fVar instanceof x) && (c = fVar.c()) != null && !(c instanceof s)) {
            sb.append(" ");
            int ordinal = B().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "<i>defined in</i>";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "defined in";
            }
            sb.append(str);
            sb.append(" ");
            h9.d g10 = d.g(c);
            g.e(g10, "getFqName(containingDeclaration)");
            if (g10.d()) {
                s10 = "root package";
            } else {
                s10 = s(g10);
            }
            sb.append(s10);
            if (((Boolean) descriptorRendererOptionsImpl.f14634d.b(descriptorRendererOptionsImpl, jVarArr[2])).booleanValue() && (c instanceof u) && (fVar instanceof i)) {
                ((i) fVar).j().a();
            }
        }
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void G(StringBuilder sb, m8.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<h9.c> set;
        if (!z().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            return;
        }
        boolean z10 = aVar instanceof r;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (z10) {
            set = i();
        } else {
            set = (Set) descriptorRendererOptionsImpl.J.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[34]);
        }
        u7.l lVar = (u7.l) descriptorRendererOptionsImpl.L.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[36]);
        for (m8.c cVar : aVar.getAnnotations()) {
            if (!kotlin.collections.c.h2(set, cVar.e()) && !g.a(cVar.e(), g.a.f13375r) && (lVar == null || ((Boolean) lVar.U(cVar)).booleanValue())) {
                sb.append(p(cVar, annotationUseSiteTarget));
                if (((Boolean) descriptorRendererOptionsImpl.I.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[33])).booleanValue()) {
                    sb.append('\n');
                } else {
                    sb.append(" ");
                }
            }
        }
    }

    public final void H(l8.e eVar, StringBuilder sb) {
        List<i0> x3 = eVar.x();
        v7.g.e(x3, "classifier.declaredTypeParameters");
        List<i0> e10 = eVar.o().e();
        v7.g.e(e10, "classifier.typeConstructor.parameters");
        if (D() && eVar.m0() && e10.size() > x3.size()) {
            sb.append(" /*captured type parameters: ");
            g0(sb, e10.subList(x3.size(), e10.size()));
            sb.append("*/");
        }
    }

    public final String I(m9.g<?> gVar) {
        String p10;
        if (gVar instanceof m9.b) {
            return kotlin.collections.c.t2((Iterable) ((m9.b) gVar).f16022a, ", ", "{", "}", new DescriptorRendererImpl$renderConstant$1(this), 24);
        }
        if (gVar instanceof m9.a) {
            p10 = p((m8.c) ((m9.a) gVar).f16022a, null);
            return kotlin.text.b.k1("@", p10);
        } else if (gVar instanceof m9.n) {
            n.a aVar = (n.a) ((m9.n) gVar).f16022a;
            if (aVar instanceof n.a.C0188a) {
                return ((n.a.C0188a) aVar).f16025a + "::class";
            } else if (aVar instanceof n.a.b) {
                n.a.b bVar = (n.a.b) aVar;
                String b5 = bVar.f16026a.f16020a.b().b();
                for (int i10 = 0; i10 < bVar.f16026a.f16021b; i10++) {
                    b5 = "kotlin.Array<" + b5 + '>';
                }
                return a4.b.l(b5, "::class");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            return gVar.toString();
        }
    }

    public final void J(StringBuilder sb, List list) {
        if (!list.isEmpty()) {
            sb.append("context(");
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                c0 c0Var = (c0) it.next();
                G(sb, c0Var, AnnotationUseSiteTarget.f13470o);
                r b5 = c0Var.b();
                v7.g.e(b5, "contextReceiver.type");
                sb.append(M(b5));
                sb.append(i10 == a1.c.B0(list) ? ") " : ", ");
                i10 = i11;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(StringBuilder sb, v vVar) {
        y9.g gVar;
        v vVar2;
        z9.c cVar;
        String obj;
        boolean z10;
        String obj2;
        l8.e eVar = null;
        G(sb, vVar, null);
        if (vVar instanceof y9.g) {
            gVar = (y9.g) vVar;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            vVar2 = gVar.f18947j;
        } else {
            vVar2 = null;
        }
        if (m0.b.D0(vVar)) {
            boolean z11 = vVar instanceof aa.f;
            if (z11 && ((aa.f) vVar).f399l.f15031j) {
                z10 = true;
            } else {
                z10 = false;
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
            if (z10 && ((Boolean) descriptorRendererOptionsImpl.T.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[45])).booleanValue()) {
                aa.h hVar = aa.h.f405a;
                if (z11) {
                    boolean z12 = ((aa.f) vVar).f399l.f15031j;
                }
                e0 U0 = vVar.U0();
                if (U0 != null) {
                    obj = L(((aa.g) U0).f404b[0]);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                }
            } else {
                if (z11 && !((Boolean) descriptorRendererOptionsImpl.V.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[47])).booleanValue()) {
                    obj2 = ((aa.f) vVar).f402p;
                } else {
                    obj2 = vVar.U0().toString();
                }
                sb.append(obj2);
                obj = d0(vVar.S0());
            }
        } else {
            if (vVar instanceof y9.b0) {
                cVar = ((y9.b0) vVar).f14975j;
            } else if (vVar2 instanceof y9.b0) {
                cVar = ((y9.b0) vVar2).f14975j;
            } else {
                e0 U02 = vVar.U0();
                l8.d c = vVar.U0().c();
                if (c instanceof l8.e) {
                    eVar = (l8.e) c;
                }
                m4.c a10 = TypeParameterUtilsKt.a(vVar, eVar, 0);
                if (a10 == null) {
                    sb.append(e0(U02));
                    sb.append(d0(vVar.S0()));
                } else {
                    Z(sb, a10);
                }
                if (vVar.V0()) {
                    sb.append("?");
                }
                if (!(vVar instanceof y9.g)) {
                    sb.append(" & Any");
                    return;
                }
                return;
            }
            obj = cVar.toString();
        }
        sb.append(obj);
        if (vVar.V0()) {
        }
        if (!(vVar instanceof y9.g)) {
        }
    }

    public final String L(String str) {
        int ordinal = B().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return a4.b.m("<font color=red><b>", str, "</b></font>");
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final String M(r rVar) {
        String u10 = u(rVar);
        if (!n0(rVar) || kotlin.reflect.jvm.internal.impl.types.r.g(rVar)) {
            return u10;
        }
        return "(" + u10 + ')';
    }

    public final void N(l0 l0Var, StringBuilder sb) {
        m9.g<?> J0;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (((Boolean) descriptorRendererOptionsImpl.f14650u.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[19])).booleanValue() && (J0 = l0Var.J0()) != null) {
            sb.append(" = ");
            sb.append(x(I(J0)));
        }
    }

    public final String O(String str) {
        int ordinal = B().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
                if (!((Boolean) descriptorRendererOptionsImpl.U.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[46])).booleanValue()) {
                    return a4.b.m("<b>", str, "</b>");
                }
                return str;
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final void P(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (z().contains(DescriptorRendererModifier.MEMBER_KIND) && D() && callableMemberDescriptor.h() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(m0.b.z1(callableMemberDescriptor.h().name()));
            sb.append("*/ ");
        }
    }

    public final void Q(l8.r rVar, StringBuilder sb) {
        T(sb, rVar.D(), "external");
        boolean z10 = true;
        T(sb, z().contains(DescriptorRendererModifier.EXPECT) && rVar.l0(), "expect");
        if (!z().contains(DescriptorRendererModifier.ACTUAL) || !rVar.L0()) {
            z10 = false;
        }
        T(sb, z10, "actual");
    }

    public final void R(Modality modality, StringBuilder sb, Modality modality2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (!((Boolean) descriptorRendererOptionsImpl.f14645p.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[14])).booleanValue() && modality == modality2) {
            return;
        }
        T(sb, z().contains(DescriptorRendererModifier.MODALITY), m0.b.z1(modality.name()));
    }

    public final void S(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (!d.t(callableMemberDescriptor) || callableMemberDescriptor.p() != Modality.FINAL) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
            if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.A.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[25])) == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.p() == Modality.OPEN && (!callableMemberDescriptor.f().isEmpty())) {
                return;
            }
            Modality p10 = callableMemberDescriptor.p();
            v7.g.e(p10, "callable.modality");
            R(p10, sb, E(callableMemberDescriptor));
        }
    }

    public final void T(StringBuilder sb, boolean z10, String str) {
        if (z10) {
            sb.append(O(str));
            sb.append(" ");
        }
    }

    public final void U(f fVar, StringBuilder sb, boolean z10) {
        h9.e name = fVar.getName();
        v7.g.e(name, "descriptor.name");
        sb.append(t(name, z10));
    }

    public final void V(StringBuilder sb, r rVar) {
        y9.a aVar;
        m0 X0 = rVar.X0();
        if (X0 instanceof y9.a) {
            aVar = (y9.a) X0;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
            j9.a aVar2 = descriptorRendererOptionsImpl.Q;
            j<?>[] jVarArr = DescriptorRendererOptionsImpl.W;
            boolean booleanValue = ((Boolean) aVar2.b(descriptorRendererOptionsImpl, jVarArr[41])).booleanValue();
            v vVar = aVar.f18940j;
            if (booleanValue) {
                W(sb, vVar);
                return;
            }
            W(sb, aVar.f18941k);
            if (((Boolean) descriptorRendererOptionsImpl.P.b(descriptorRendererOptionsImpl, jVarArr[40])).booleanValue()) {
                RenderingFormat B = B();
                RenderingFormat renderingFormat = RenderingFormat.f14669j;
                if (B == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* = ");
                W(sb, vVar);
                sb.append(" */");
                if (B() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        W(sb, rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(StringBuilder sb, r rVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        h9.e eVar;
        int ordinal;
        String x3;
        boolean z15;
        boolean z16;
        boolean z17;
        if ((rVar instanceof n0) && j() && !((n0) rVar).Z0()) {
            sb.append("<Not computed yet>");
            return;
        }
        m0 X0 = rVar.X0();
        if (X0 instanceof y9.n) {
            sb.append(((y9.n) X0).c1(this, this));
        } else if (X0 instanceof v) {
            v vVar = (v) X0;
            if (!v7.g.a(vVar, kotlin.reflect.jvm.internal.impl.types.r.f15074b)) {
                if (vVar != null && vVar.U0() == kotlin.reflect.jvm.internal.impl.types.r.f15073a.f397j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (vVar != null) {
                        e0 U0 = vVar.U0();
                        if ((U0 instanceof aa.g) && ((aa.g) U0).f403a == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE) {
                            z11 = true;
                            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
                            if (!z11) {
                                if (((Boolean) descriptorRendererOptionsImpl.f14649t.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[18])).booleanValue()) {
                                    e0 U02 = vVar.U0();
                                    v7.g.d(U02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                                    sb.append(L(((aa.g) U02).f404b[0]));
                                    return;
                                }
                            } else {
                                if (!m0.b.D0(vVar) && n0(vVar)) {
                                    int length = sb.length();
                                    ((DescriptorRendererImpl) this.f14606d.getValue()).G(sb, vVar, null);
                                    if (sb.length() != length) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    r f10 = kotlin.reflect.jvm.internal.impl.builtins.c.f(vVar);
                                    List<r> d5 = kotlin.reflect.jvm.internal.impl.builtins.c.d(vVar);
                                    if (!d5.isEmpty()) {
                                        sb.append("context(");
                                        for (r rVar2 : d5.subList(0, a1.c.B0(d5))) {
                                            V(sb, rVar2);
                                            sb.append(", ");
                                        }
                                        V(sb, (r) kotlin.collections.c.v2(d5));
                                        sb.append(") ");
                                    }
                                    boolean i10 = kotlin.reflect.jvm.internal.impl.builtins.c.i(vVar);
                                    boolean V0 = vVar.V0();
                                    if (!V0 && (!z12 || f10 == null)) {
                                        z13 = false;
                                        if (z13) {
                                            if (i10) {
                                                sb.insert(length, '(');
                                            } else {
                                                if (z12) {
                                                    a1.b.o0(ha.j.y1(sb));
                                                    if (sb.charAt(kotlin.text.b.a1(sb) - 1) != ')') {
                                                        sb.insert(kotlin.text.b.a1(sb), "()");
                                                    }
                                                }
                                                sb.append("(");
                                            }
                                        }
                                        T(sb, i10, "suspend");
                                        if (f10 != null) {
                                            if (!n0(f10) || f10.V0()) {
                                                if (!kotlin.reflect.jvm.internal.impl.builtins.c.i(f10) && f10.getAnnotations().isEmpty()) {
                                                    z16 = false;
                                                    if (!z16) {
                                                        z17 = false;
                                                        if (z17) {
                                                            sb.append("(");
                                                        }
                                                        V(sb, f10);
                                                        if (z17) {
                                                            sb.append(")");
                                                        }
                                                        sb.append(".");
                                                    }
                                                }
                                                z16 = true;
                                                if (!z16) {
                                                }
                                            }
                                            z17 = true;
                                            if (z17) {
                                            }
                                            V(sb, f10);
                                            if (z17) {
                                            }
                                            sb.append(".");
                                        }
                                        sb.append("(");
                                        if (kotlin.reflect.jvm.internal.impl.builtins.c.h(vVar)) {
                                            if (vVar.getAnnotations().j(g.a.f13373p) != null) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (z15) {
                                                z14 = true;
                                                if (!z14 && vVar.S0().size() <= 1) {
                                                    sb.append("???");
                                                } else {
                                                    int i11 = 0;
                                                    for (f0 f0Var : kotlin.reflect.jvm.internal.impl.builtins.c.g(vVar)) {
                                                        int i12 = i11 + 1;
                                                        if (i11 > 0) {
                                                            sb.append(", ");
                                                        }
                                                        if (((Boolean) descriptorRendererOptionsImpl.S.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[43])).booleanValue()) {
                                                            r b5 = f0Var.b();
                                                            v7.g.e(b5, "typeProjection.type");
                                                            eVar = kotlin.reflect.jvm.internal.impl.builtins.c.c(b5);
                                                        } else {
                                                            eVar = null;
                                                        }
                                                        if (eVar != null) {
                                                            sb.append(t(eVar, false));
                                                            sb.append(": ");
                                                        }
                                                        sb.append(v(f0Var));
                                                        i11 = i12;
                                                    }
                                                }
                                                sb.append(") ");
                                                ordinal = B().ordinal();
                                                if (ordinal != 0) {
                                                    if (ordinal == 1) {
                                                        x3 = "&rarr;";
                                                    } else {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                } else {
                                                    x3 = x("->");
                                                }
                                                sb.append(x3);
                                                sb.append(" ");
                                                kotlin.reflect.jvm.internal.impl.builtins.c.h(vVar);
                                                r b10 = ((f0) kotlin.collections.c.v2(vVar.S0())).b();
                                                v7.g.e(b10, "arguments.last().type");
                                                V(sb, b10);
                                                if (z13) {
                                                    sb.append(")");
                                                }
                                                if (V0) {
                                                    sb.append("?");
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        z14 = false;
                                        if (!z14) {
                                        }
                                        int i112 = 0;
                                        while (r4.hasNext()) {
                                        }
                                        sb.append(") ");
                                        ordinal = B().ordinal();
                                        if (ordinal != 0) {
                                        }
                                        sb.append(x3);
                                        sb.append(" ");
                                        kotlin.reflect.jvm.internal.impl.builtins.c.h(vVar);
                                        r b102 = ((f0) kotlin.collections.c.v2(vVar.S0())).b();
                                        v7.g.e(b102, "arguments.last().type");
                                        V(sb, b102);
                                        if (z13) {
                                        }
                                        if (V0) {
                                        }
                                    }
                                    z13 = true;
                                    if (z13) {
                                    }
                                    T(sb, i10, "suspend");
                                    if (f10 != null) {
                                    }
                                    sb.append("(");
                                    if (kotlin.reflect.jvm.internal.impl.builtins.c.h(vVar)) {
                                    }
                                    z14 = false;
                                    if (!z14) {
                                    }
                                    int i1122 = 0;
                                    while (r4.hasNext()) {
                                    }
                                    sb.append(") ");
                                    ordinal = B().ordinal();
                                    if (ordinal != 0) {
                                    }
                                    sb.append(x3);
                                    sb.append(" ");
                                    kotlin.reflect.jvm.internal.impl.builtins.c.h(vVar);
                                    r b1022 = ((f0) kotlin.collections.c.v2(vVar.S0())).b();
                                    v7.g.e(b1022, "arguments.last().type");
                                    V(sb, b1022);
                                    if (z13) {
                                    }
                                    if (V0) {
                                    }
                                }
                                K(sb, vVar);
                                return;
                            }
                        }
                    }
                    z11 = false;
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.c;
                    if (!z11) {
                    }
                }
            }
            sb.append("???");
        }
    }

    public final void X(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (z().contains(DescriptorRendererModifier.OVERRIDE) && (!callableMemberDescriptor.f().isEmpty())) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
            if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.A.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[25])) != OverrideRenderingPolicy.RENDER_OPEN) {
                T(sb, true, "override");
                if (D()) {
                    sb.append("/*");
                    sb.append(callableMemberDescriptor.f().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void Y(h9.c cVar, String str, StringBuilder sb) {
        sb.append(O(str));
        h9.d i10 = cVar.i();
        v7.g.e(i10, "fqName.toUnsafe()");
        String s10 = s(i10);
        if (s10.length() > 0) {
            sb.append(" ");
            sb.append(s10);
        }
    }

    public final void Z(StringBuilder sb, m4.c cVar) {
        String e02;
        m4.c cVar2 = (m4.c) cVar.c;
        Object obj = cVar.f15979a;
        if (cVar2 != null) {
            Z(sb, cVar2);
            sb.append('.');
            h9.e name = ((l8.e) obj).getName();
            v7.g.e(name, "possiblyInnerType.classifierDescriptor.name");
            e02 = t(name, false);
        } else {
            e0 o10 = ((l8.e) obj).o();
            v7.g.e(o10, "possiblyInnerType.classi…escriptor.typeConstructor");
            e02 = e0(o10);
        }
        sb.append(e02);
        sb.append(d0((List) cVar.f15980b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void a() {
        this.c.a();
    }

    public final void a0(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        c0 R = aVar.R();
        if (R != null) {
            G(sb, R, AnnotationUseSiteTarget.f13470o);
            r b5 = R.b();
            v7.g.e(b5, "receiver.type");
            sb.append(M(b5));
            sb.append(".");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void b() {
        this.c.b();
    }

    public final void b0(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        c0 R;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (((Boolean) descriptorRendererOptionsImpl.E.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[29])).booleanValue() && (R = aVar.R()) != null) {
            sb.append(" on ");
            r b5 = R.b();
            v7.g.e(b5, "receiver.type");
            sb.append(u(b5));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void c() {
        this.c.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void d(Set<? extends DescriptorRendererModifier> set) {
        v7.g.f(set, "<set-?>");
        this.c.d(set);
    }

    public final String d0(List<? extends f0> list) {
        v7.g.f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x("<"));
        kotlin.collections.c.s2(list, sb, ", ", null, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        sb.append(x(">"));
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void e(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.c.e(parameterNameRenderingPolicy);
    }

    public final String e0(e0 e0Var) {
        boolean z10;
        v7.g.f(e0Var, "typeConstructor");
        l8.d c = e0Var.c();
        boolean z11 = true;
        if (c instanceof i0) {
            z10 = true;
        } else {
            z10 = c instanceof l8.b;
        }
        if (!z10) {
            z11 = c instanceof h0;
        }
        if (z11) {
            v7.g.f(c, "klass");
            if (aa.h.f(c)) {
                return c.o().toString();
            }
            return y().a(c, this);
        } else if (c == null) {
            if (e0Var instanceof IntersectionTypeConstructor) {
                return ((IntersectionTypeConstructor) e0Var).h(DescriptorRendererImpl$renderTypeConstructor$1.f14614j);
            }
            return e0Var.toString();
        } else {
            throw new IllegalStateException(("Unexpected classifier: " + c.getClass()).toString());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void f() {
        this.c.f();
    }

    public final void f0(i0 i0Var, StringBuilder sb, boolean z10) {
        boolean z11;
        boolean z12;
        if (z10) {
            sb.append(x("<"));
        }
        if (D()) {
            sb.append("/*");
            sb.append(i0Var.getIndex());
            sb.append("*/ ");
        }
        T(sb, i0Var.X(), "reified");
        String str = i0Var.t().f14973i;
        boolean z13 = false;
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        T(sb, z11, str);
        G(sb, i0Var, null);
        U(i0Var, sb, z10);
        int size = i0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            r next = i0Var.getUpperBounds().iterator().next();
            if (next != null) {
                if (kotlin.reflect.jvm.internal.impl.builtins.e.y(next) && next.V0()) {
                    z13 = true;
                }
                if (!z13) {
                    sb.append(" : ");
                    sb.append(u(next));
                }
            } else {
                kotlin.reflect.jvm.internal.impl.builtins.e.a(141);
                throw null;
            }
        } else if (z10) {
            boolean z14 = true;
            for (r rVar : i0Var.getUpperBounds()) {
                if (rVar != null) {
                    if (kotlin.reflect.jvm.internal.impl.builtins.e.y(rVar) && rVar.V0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (z14) {
                            sb.append(" : ");
                        } else {
                            sb.append(" & ");
                        }
                        sb.append(u(rVar));
                        z14 = false;
                    }
                } else {
                    kotlin.reflect.jvm.internal.impl.builtins.e.a(141);
                    throw null;
                }
            }
        }
        if (z10) {
            sb.append(x(">"));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void g() {
        this.c.g();
    }

    public final void g0(StringBuilder sb, List<? extends i0> list) {
        Iterator<? extends i0> it = list.iterator();
        while (it.hasNext()) {
            f0(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final boolean h() {
        return this.c.h();
    }

    public final void h0(List<? extends i0> list, StringBuilder sb, boolean z10) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (!((Boolean) descriptorRendererOptionsImpl.f14651v.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[20])).booleanValue() && (!list.isEmpty())) {
            sb.append(x("<"));
            g0(sb, list);
            sb.append(x(">"));
            if (z10) {
                sb.append(" ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final Set<h9.c> i() {
        return this.c.i();
    }

    public final void i0(l0 l0Var, StringBuilder sb, boolean z10) {
        if (z10 || !(l0Var instanceof kotlin.reflect.jvm.internal.impl.descriptors.h)) {
            sb.append(O(l0Var.M() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final boolean j() {
        return this.c.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, boolean z10, StringBuilder sb, boolean z11) {
        boolean z12;
        r b5;
        r N;
        r rVar;
        boolean z13;
        boolean a10;
        boolean z14;
        if (z11) {
            sb.append(O("value-parameter"));
            sb.append(" ");
        }
        if (D()) {
            sb.append("/*");
            sb.append(hVar.getIndex());
            sb.append("*/ ");
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = null;
        G(sb, hVar, null);
        T(sb, hVar.A(), "crossinline");
        T(sb, hVar.K0(), "noinline");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        j9.a aVar = descriptorRendererOptionsImpl.f14647r;
        j<?>[] jVarArr = DescriptorRendererOptionsImpl.W;
        boolean z15 = false;
        if (((Boolean) aVar.b(descriptorRendererOptionsImpl, jVarArr[16])).booleanValue()) {
            kotlin.reflect.jvm.internal.impl.descriptors.a c = hVar.c();
            if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) c;
            }
            if (bVar != null && bVar.O()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                z12 = true;
                if (z12) {
                    T(sb, ((Boolean) descriptorRendererOptionsImpl.f14648s.b(descriptorRendererOptionsImpl, jVarArr[17])).booleanValue(), "actual");
                }
                b5 = hVar.b();
                v7.g.e(b5, "variable.type");
                N = hVar.N();
                if (N != null) {
                    rVar = b5;
                } else {
                    rVar = N;
                }
                if (N == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                T(sb, z13, "vararg");
                if (!z12 || (z11 && !A())) {
                    i0(hVar, sb, z12);
                }
                if (z10) {
                    U(hVar, sb, z11);
                    sb.append(": ");
                }
                sb.append(u(rVar));
                N(hVar, sb);
                if (D() && N != null) {
                    sb.append(" /*");
                    sb.append(u(b5));
                    sb.append("*/");
                }
                if (((u7.l) descriptorRendererOptionsImpl.f14654y.b(descriptorRendererOptionsImpl, jVarArr[23])) != null) {
                    if (j()) {
                        a10 = hVar.j0();
                    } else {
                        a10 = DescriptorUtilsKt.a(hVar);
                    }
                    if (a10) {
                        z15 = true;
                    }
                }
                if (!z15) {
                    StringBuilder sb2 = new StringBuilder(" = ");
                    u7.l lVar = (u7.l) descriptorRendererOptionsImpl.f14654y.b(descriptorRendererOptionsImpl, jVarArr[23]);
                    v7.g.c(lVar);
                    sb2.append((String) lVar.U(hVar));
                    sb.append(sb2.toString());
                    return;
                }
                return;
            }
        }
        z12 = false;
        if (z12) {
        }
        b5 = hVar.b();
        v7.g.e(b5, "variable.type");
        N = hVar.N();
        if (N != null) {
        }
        if (N == null) {
        }
        T(sb, z13, "vararg");
        if (!z12) {
        }
        i0(hVar, sb, z12);
        if (z10) {
        }
        sb.append(u(rVar));
        N(hVar, sb);
        if (D()) {
            sb.append(" /*");
            sb.append(u(b5));
            sb.append("*/");
        }
        if (((u7.l) descriptorRendererOptionsImpl.f14654y.b(descriptorRendererOptionsImpl, jVarArr[23])) != null) {
        }
        if (!z15) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void k(LinkedHashSet linkedHashSet) {
        this.c.k(linkedHashSet);
    }

    public final void k0(List list, boolean z10, StringBuilder sb) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        int ordinal = ((ParameterNameRenderingPolicy) descriptorRendererOptionsImpl.D.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[28])).ordinal();
        boolean z11 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z10) {
            }
            z11 = false;
        }
        int size = list.size();
        C().a(sb);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) it.next();
            C().c(hVar, sb);
            j0(hVar, z11, sb, false);
            C().d(hVar, i10, size, sb);
            i10++;
        }
        C().b(sb);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void l() {
        this.c.l();
    }

    public final boolean l0(m mVar, StringBuilder sb) {
        if (!z().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        j9.a aVar = descriptorRendererOptionsImpl.n;
        j<?>[] jVarArr = DescriptorRendererOptionsImpl.W;
        if (((Boolean) aVar.b(descriptorRendererOptionsImpl, jVarArr[12])).booleanValue()) {
            mVar = mVar.d();
        }
        if (!((Boolean) descriptorRendererOptionsImpl.f14644o.b(descriptorRendererOptionsImpl, jVarArr[13])).booleanValue() && v7.g.a(mVar, l.f15849l)) {
            return false;
        }
        sb.append(O(mVar.b()));
        sb.append(" ");
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void m() {
        this.c.m();
    }

    public final void m0(StringBuilder sb, List list) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (((Boolean) descriptorRendererOptionsImpl.f14651v.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[20])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            List<r> upperBounds = i0Var.getUpperBounds();
            v7.g.e(upperBounds, "typeParameter.upperBounds");
            for (r rVar : kotlin.collections.c.i2(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                h9.e name = i0Var.getName();
                v7.g.e(name, "typeParameter.name");
                sb2.append(t(name, false));
                sb2.append(" : ");
                v7.g.e(rVar, "it");
                sb2.append(u(rVar));
                arrayList.add(sb2.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(" ");
            sb.append(O("where"));
            sb.append(" ");
            kotlin.collections.c.s2(arrayList, sb, ", ", null, null, null, 124);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void n() {
        this.c.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.b
    public final void o(kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        this.c.o(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final String p(m8.c cVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        l8.b bVar;
        String str;
        h9.e eVar;
        kotlin.reflect.jvm.internal.impl.descriptors.b A0;
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10;
        v7.g.f(cVar, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.f13475i + ':');
        }
        r b5 = cVar.b();
        sb.append(u(b5));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (descriptorRendererOptionsImpl.p().f14591i) {
            Map<h9.e, m9.g<?>> a10 = cVar.a();
            EmptyList emptyList = null;
            if (((Boolean) descriptorRendererOptionsImpl.H.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[32])).booleanValue()) {
                bVar = DescriptorUtilsKt.d(cVar);
            } else {
                bVar = null;
            }
            if (bVar != null && (A0 = bVar.A0()) != null && (m10 = A0.m()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m10) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.h) obj).j0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kotlin.reflect.jvm.internal.impl.descriptors.h) it.next()).getName());
                }
                emptyList = arrayList2;
            }
            if (emptyList == null) {
                emptyList = EmptyList.f12981i;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : emptyList) {
                v7.g.e((h9.e) obj2, "it");
                if (!a10.containsKey(eVar)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(n7.l.Z1(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((h9.e) it2.next()).b() + " = ...");
            }
            Set<Map.Entry<h9.e, m9.g<?>>> entrySet = a10.entrySet();
            ArrayList arrayList5 = new ArrayList(n7.l.Z1(entrySet, 10));
            Iterator<T> it3 = entrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                h9.e eVar2 = (h9.e) entry.getKey();
                m9.g<?> gVar = (m9.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar2.b());
                sb2.append(" = ");
                if (!emptyList.contains(eVar2)) {
                    str = I(gVar);
                } else {
                    str = "...";
                }
                sb2.append(str);
                arrayList5.add(sb2.toString());
            }
            List F2 = kotlin.collections.c.F2(kotlin.collections.c.z2(arrayList5, arrayList4));
            if (descriptorRendererOptionsImpl.p().f14592j || (!F2.isEmpty())) {
                kotlin.collections.c.s2(F2, sb, ", ", "(", ")", null, 112);
            }
        }
        if (D() && (m0.b.D0(b5) || (b5.U0().c() instanceof NotFoundClasses.b))) {
            sb.append(" /* annotation class not found */");
        }
        String sb3 = sb.toString();
        v7.g.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final String r(String str, String str2, kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
        v7.g.f(str, "lowerRendered");
        v7.g.f(str2, "upperRendered");
        if (m0.b.F1(str, str2)) {
            if (ha.i.X0(str2, "(", false)) {
                return a4.b.m("(", str, ")!");
            }
            return str.concat("!");
        }
        String v12 = kotlin.text.b.v1(y().a(eVar.j(g.a.B), this), "Collection");
        String a12 = m0.b.a1(str, v12.concat("Mutable"), str2, v12, v12.concat("(Mutable)"));
        if (a12 != null) {
            return a12;
        }
        String a13 = m0.b.a1(str, v12.concat("MutableMap.MutableEntry"), str2, v12.concat("Map.Entry"), v12.concat("(Mutable)Map.(Mutable)Entry"));
        if (a13 != null) {
            return a13;
        }
        kotlin.reflect.jvm.internal.impl.renderer.a y10 = y();
        l8.b k3 = eVar.k("Array");
        v7.g.e(k3, "builtIns.array");
        String v13 = kotlin.text.b.v1(y10.a(k3, this), "Array");
        String a14 = m0.b.a1(str, v13 + x("Array<"), str2, v13 + x("Array<out "), v13 + x("Array<(out) "));
        if (a14 != null) {
            return a14;
        }
        return "(" + str + ".." + str2 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final String s(h9.d dVar) {
        return x(m0.b.Z0(dVar.f()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final String t(h9.e eVar, boolean z10) {
        String x3 = x(m0.b.Y0(eVar));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (((Boolean) descriptorRendererOptionsImpl.U.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[46])).booleanValue() && B() == RenderingFormat.f14669j && z10) {
            return a4.b.m("<b>", x3, "</b>");
        }
        return x3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final String u(r rVar) {
        v7.g.f(rVar, "type");
        StringBuilder sb = new StringBuilder();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        V(sb, (r) ((u7.l) descriptorRendererOptionsImpl.f14653x.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[22])).U(rVar));
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final String v(f0 f0Var) {
        v7.g.f(f0Var, "typeProjection");
        StringBuilder sb = new StringBuilder();
        kotlin.collections.c.s2(a1.c.N0(f0Var), sb, ", ", null, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String x(String str) {
        return B().a(str);
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.a y() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (kotlin.reflect.jvm.internal.impl.renderer.a) descriptorRendererOptionsImpl.f14633b.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[0]);
    }

    public final Set<DescriptorRendererModifier> z() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (Set) descriptorRendererOptionsImpl.f14635e.b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[3]);
    }
}
