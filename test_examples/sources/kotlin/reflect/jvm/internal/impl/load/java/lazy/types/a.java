package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import aa.f;
import aa.h;
import b9.a0;
import b9.i;
import b9.j;
import b9.w;
import b9.x;
import ga.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.r;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.b;
import l8.d;
import l8.i0;
import m8.e;
import n7.s;
import n7.t;
import r8.u;
import u8.m;
import v7.g;
import x8.c;
import y9.e0;
import y9.f0;
import y9.g0;
import y9.h0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f13839a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.a f13840b;
    public final z8.c c;

    /* renamed from: d  reason: collision with root package name */
    public final p f13841d;

    public a(c cVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.a aVar) {
        g.f(cVar, "c");
        g.f(aVar, "typeParameterResolver");
        this.f13839a = cVar;
        this.f13840b = aVar;
        z8.c cVar2 = new z8.c();
        this.c = cVar2;
        this.f13841d = new p(cVar2);
    }

    public static final f d(j jVar) {
        return h.c(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, jVar.y());
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v a(j jVar, z8.a aVar, v vVar) {
        i c;
        e0 e0Var;
        e0 o10;
        b r02;
        a0 a0Var;
        boolean z10;
        Variance t10;
        boolean z11;
        b bVar;
        boolean z12;
        boolean z13;
        e0 e0Var2;
        boolean z14;
        List L2;
        Iterator it;
        List<i0> list;
        Variance variance;
        g0 h0Var;
        Variance variance2;
        boolean z15;
        boolean z16;
        Object obj;
        e fVar;
        boolean z17;
        ?? r12;
        Iterator it2;
        f0 s10;
        z8.a aVar2 = aVar;
        c cVar = this.f13839a;
        if (vVar != null && (r2 = vVar.T0()) != null) {
            l lVar = r2;
            c = jVar.c();
            Variance variance3 = Variance.OUT_VARIANCE;
            TypeUsage typeUsage = TypeUsage.SUPERTYPE;
            JavaTypeFlexibility javaTypeFlexibility = JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND;
            TypeUsage typeUsage2 = aVar2.f19177b;
            JavaTypeFlexibility javaTypeFlexibility2 = aVar2.c;
            boolean z18 = aVar2.f19179e;
            if (c != null) {
                if (c instanceof b9.g) {
                    b9.g gVar = (b9.g) c;
                    h9.c e10 = gVar.e();
                    if (e10 != null) {
                        if (z18 && g.a(e10, z8.b.f19182a)) {
                            kotlin.reflect.jvm.internal.impl.builtins.f fVar2 = cVar.f18762a.f18752p;
                            fVar2.getClass();
                            c8.j<Object> jVar2 = kotlin.reflect.jvm.internal.impl.builtins.f.f13331e[0];
                            fVar2.c.getClass();
                            g.f(jVar2, "property");
                            h9.e k3 = h9.e.k(m0.b.B(jVar2.getName()));
                            d e11 = ((MemberScope) fVar2.f13333b.getValue()).e(k3, NoLookupLocation.FROM_REFLECTION);
                            if (e11 instanceof b) {
                                bVar = (b) e11;
                            } else {
                                bVar = null;
                            }
                            r02 = bVar == null ? fVar2.f13332a.a(new h9.b(kotlin.reflect.jvm.internal.impl.builtins.g.f13351h, k3), a1.c.N0(1)) : bVar;
                        } else {
                            r02 = a1.b.r0(a1.b.N0, e10, cVar.f18762a.f18751o.u());
                            if (r02 == null) {
                                r02 = null;
                            } else {
                                String str = k8.c.f12921a;
                                h9.d g10 = k9.d.g(r02);
                                HashMap<h9.d, h9.c> hashMap = k8.c.f12930k;
                                if (hashMap.containsKey(g10)) {
                                    if (javaTypeFlexibility2 != javaTypeFlexibility && typeUsage2 != typeUsage) {
                                        w wVar = (w) kotlin.collections.c.w2(jVar.v());
                                        if (wVar instanceof a0) {
                                            a0Var = (a0) wVar;
                                        } else {
                                            a0Var = null;
                                        }
                                        if (a0Var != null && a0Var.H() != null && !a0Var.E()) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            h9.d g11 = k9.d.g(r02);
                                            String str2 = k8.c.f12921a;
                                            h9.c cVar2 = hashMap.get(g11);
                                            if (cVar2 != null) {
                                                List<i0> e12 = DescriptorUtilsKt.e(r02).j(cVar2).o().e();
                                                g.e(e12, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                                                i0 i0Var = (i0) kotlin.collections.c.w2(e12);
                                                if (i0Var != null && (t10 = i0Var.t()) != null && t10 != variance3) {
                                                    z11 = true;
                                                    if (z11) {
                                                    }
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Given class " + r02 + " is not a read-only collection");
                                            }
                                        }
                                        z11 = false;
                                        if (z11) {
                                        }
                                    }
                                    r02 = a1.b.G(r02);
                                }
                            }
                        }
                        if (r02 == null) {
                            r02 = cVar.f18762a.f18748k.a(gVar);
                        }
                        if (r02 != null) {
                            o10 = r02.o();
                        }
                    } else {
                        throw new AssertionError("Class type should have a FQ name: " + c);
                    }
                } else if (c instanceof x) {
                    i0 a10 = this.f13840b.a((x) c);
                    if (a10 != null) {
                        o10 = a10.o();
                    } else {
                        e0Var = null;
                        if (e0Var != null) {
                            return null;
                        }
                        if (javaTypeFlexibility2 == javaTypeFlexibility) {
                            z13 = false;
                        } else {
                            if (!z18 && typeUsage2 != typeUsage) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = z12;
                        }
                        if (vVar != null) {
                            e0Var2 = vVar.U0();
                        } else {
                            e0Var2 = null;
                        }
                        if (g.a(e0Var2, e0Var) && !jVar.P() && z13) {
                            return vVar.Y0(true);
                        }
                        if (!jVar.P()) {
                            if (jVar.v().isEmpty()) {
                                List<i0> e13 = e0Var.e();
                                g.e(e13, "constructor.parameters");
                                if (!e13.isEmpty()) {
                                }
                            }
                            z14 = false;
                            List<i0> e14 = e0Var.e();
                            g.e(e14, "constructor.parameters");
                            if (!z14) {
                                r12 = new ArrayList(n7.l.Z1(e14, 10));
                                Iterator it3 = e14.iterator();
                                while (it3.hasNext()) {
                                    i0 i0Var2 = (i0) it3.next();
                                    if (TypeUtilsKt.i(i0Var2, null, aVar2.f19180f)) {
                                        s10 = r.n(i0Var2, aVar2);
                                        it2 = it3;
                                    } else {
                                        it2 = it3;
                                        s10 = this.c.s(i0Var2, z8.a.e(aVar, null, jVar.P(), null, null, 59), this.f13841d, new kotlin.reflect.jvm.internal.impl.types.g(cVar.f18762a.f18739a, new JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(this, i0Var2, aVar, e0Var, jVar)));
                                    }
                                    r12.add(s10);
                                    aVar2 = aVar;
                                    it3 = it2;
                                }
                            } else {
                                if (e14.size() != jVar.v().size()) {
                                    ArrayList arrayList = new ArrayList(n7.l.Z1(e14, 10));
                                    for (i0 i0Var3 : e14) {
                                        ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                                        String b5 = i0Var3.getName().b();
                                        g.e(b5, "p.name.asString()");
                                        arrayList.add(new h0(h.c(errorTypeKind, b5)));
                                    }
                                    L2 = kotlin.collections.c.L2(arrayList);
                                } else {
                                    s R2 = kotlin.collections.c.R2(jVar.v());
                                    ArrayList arrayList2 = new ArrayList(n7.l.Z1(R2, 10));
                                    Iterator it4 = R2.iterator();
                                    while (true) {
                                        t tVar = (t) it4;
                                        if (tVar.hasNext()) {
                                            n7.r rVar = (n7.r) tVar.next();
                                            w wVar2 = (w) rVar.f16129b;
                                            e14.size();
                                            i0 i0Var4 = e14.get(rVar.f16128a);
                                            TypeUsage typeUsage3 = TypeUsage.COMMON;
                                            z8.a r1 = m0.b.r1(typeUsage3, false, false, null, 7);
                                            g.e(i0Var4, "parameter");
                                            boolean z19 = wVar2 instanceof a0;
                                            Variance variance4 = Variance.INVARIANT;
                                            if (z19) {
                                                a0 a0Var2 = (a0) wVar2;
                                                u H = a0Var2.H();
                                                if (a0Var2.E()) {
                                                    variance2 = variance3;
                                                } else {
                                                    variance2 = Variance.IN_VARIANCE;
                                                }
                                                it = it4;
                                                if (H != null) {
                                                    if (i0Var4.t() != variance4 && variance2 != i0Var4.t()) {
                                                        z15 = true;
                                                        if (z15) {
                                                            g.f(cVar, "c");
                                                            if (a0Var2.H() != null) {
                                                                z16 = true;
                                                            } else {
                                                                z16 = false;
                                                            }
                                                            if (z16) {
                                                                Iterator<m8.c> it5 = new LazyJavaAnnotations(cVar, a0Var2, false).iterator();
                                                                while (true) {
                                                                    e.a aVar3 = (e.a) it5;
                                                                    if (aVar3.hasNext()) {
                                                                        obj = aVar3.next();
                                                                        m8.c cVar3 = (m8.c) obj;
                                                                        h9.c[] cVarArr = m.f17856b;
                                                                        Iterator<m8.c> it6 = it5;
                                                                        int length = cVarArr.length;
                                                                        list = e14;
                                                                        int i10 = 0;
                                                                        while (true) {
                                                                            if (i10 < length) {
                                                                                int i11 = length;
                                                                                variance = variance3;
                                                                                if (g.a(cVar3.e(), cVarArr[i10])) {
                                                                                    z17 = true;
                                                                                    break;
                                                                                }
                                                                                i10++;
                                                                                length = i11;
                                                                                variance3 = variance;
                                                                            } else {
                                                                                variance = variance3;
                                                                                z17 = false;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (z17) {
                                                                            break;
                                                                        }
                                                                        it5 = it6;
                                                                        e14 = list;
                                                                        variance3 = variance;
                                                                    } else {
                                                                        list = e14;
                                                                        variance = variance3;
                                                                        obj = null;
                                                                        break;
                                                                    }
                                                                }
                                                                m8.c cVar4 = (m8.c) obj;
                                                                y9.r e15 = e(H, m0.b.r1(typeUsage3, false, false, null, 7));
                                                                if (cVar4 != null) {
                                                                    ArrayList y22 = kotlin.collections.c.y2(e15.getAnnotations(), cVar4);
                                                                    if (y22.isEmpty()) {
                                                                        fVar = e.a.f16014a;
                                                                    } else {
                                                                        fVar = new m8.f(y22);
                                                                    }
                                                                    e15 = TypeUtilsKt.l(e15, fVar);
                                                                }
                                                                h0Var = TypeUtilsKt.e(e15, variance2, i0Var4);
                                                            } else {
                                                                throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
                                                            }
                                                        }
                                                    }
                                                    z15 = false;
                                                    if (z15) {
                                                    }
                                                }
                                                list = e14;
                                                variance = variance3;
                                                h0Var = r.n(i0Var4, r1);
                                            } else {
                                                it = it4;
                                                list = e14;
                                                variance = variance3;
                                                h0Var = new h0(e(wVar2, r1), variance4);
                                            }
                                            arrayList2.add(h0Var);
                                            it4 = it;
                                            e14 = list;
                                            variance3 = variance;
                                        } else {
                                            L2 = kotlin.collections.c.L2(arrayList2);
                                            break;
                                        }
                                    }
                                }
                                r12 = L2;
                            }
                            return KotlinTypeFactory.f(lVar, e0Var, r12, z13, null);
                        }
                        z14 = true;
                        List<i0> e142 = e0Var.e();
                        g.e(e142, "constructor.parameters");
                        if (!z14) {
                        }
                        return KotlinTypeFactory.f(lVar, e0Var, r12, z13, null);
                    }
                } else {
                    throw new IllegalStateException("Unknown classifier kind: " + c);
                }
                e0Var = o10;
                if (e0Var != null) {
                }
            }
            o10 = b(jVar);
            e0Var = o10;
            if (e0Var != null) {
            }
        }
        l Q = ma.i.Q(new LazyJavaAnnotations(cVar, jVar, false));
        l lVar2 = Q;
        c = jVar.c();
        Variance variance32 = Variance.OUT_VARIANCE;
        TypeUsage typeUsage4 = TypeUsage.SUPERTYPE;
        JavaTypeFlexibility javaTypeFlexibility3 = JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND;
        TypeUsage typeUsage22 = aVar2.f19177b;
        JavaTypeFlexibility javaTypeFlexibility22 = aVar2.c;
        boolean z182 = aVar2.f19179e;
        if (c != null) {
        }
        o10 = b(jVar);
        e0Var = o10;
        if (e0Var != null) {
        }
    }

    public final e0 b(j jVar) {
        h9.b l2 = h9.b.l(new h9.c(jVar.Q()));
        u9.e c = this.f13839a.f18762a.f18741d.c();
        e0 o10 = c.f17911l.a(l2, a1.c.N0(0)).o();
        g.e(o10, "c.components.deserialize…istOf(0)).typeConstructor");
        return o10;
    }

    public final m0 c(b9.f fVar, z8.a aVar, boolean z10) {
        b9.u uVar;
        PrimitiveType primitiveType;
        m8.e fVar2;
        g.f(fVar, "arrayType");
        u I = fVar.I();
        if (I instanceof b9.u) {
            uVar = (b9.u) I;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            primitiveType = uVar.b();
        } else {
            primitiveType = null;
        }
        c cVar = this.f13839a;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(cVar, fVar, true);
        x8.a aVar2 = cVar.f18762a;
        boolean z11 = aVar.f19179e;
        if (primitiveType != null) {
            v r3 = aVar2.f18751o.u().r(primitiveType);
            ArrayList x22 = kotlin.collections.c.x2(lazyJavaAnnotations, r3.getAnnotations());
            if (x22.isEmpty()) {
                fVar2 = e.a.f16014a;
            } else {
                fVar2 = new m8.f(x22);
            }
            TypeUtilsKt.l(r3, fVar2);
            if (!z11) {
                return KotlinTypeFactory.c(r3, r3.Y0(true));
            }
            return r3;
        }
        y9.r e10 = e(I, m0.b.r1(TypeUsage.COMMON, z11, false, null, 6));
        Variance variance = Variance.OUT_VARIANCE;
        Variance variance2 = Variance.INVARIANT;
        if (z11) {
            if (!z10) {
                variance = variance2;
            }
            return aVar2.f18751o.u().h(variance, e10, lazyJavaAnnotations);
        }
        return KotlinTypeFactory.c(aVar2.f18751o.u().h(variance2, e10, lazyJavaAnnotations), aVar2.f18751o.u().h(variance, e10, lazyJavaAnnotations).Y0(true));
    }

    public final y9.r e(w wVar, z8.a aVar) {
        v a10;
        v x3;
        boolean z10 = wVar instanceof b9.u;
        c cVar = this.f13839a;
        if (z10) {
            PrimitiveType b5 = ((b9.u) wVar).b();
            if (b5 != null) {
                x3 = cVar.f18762a.f18751o.u().t(b5);
            } else {
                x3 = cVar.f18762a.f18751o.u().x();
            }
            g.e(x3, "{\n                val pr…ns.unitType\n            }");
            return x3;
        }
        boolean z11 = false;
        if (wVar instanceof j) {
            j jVar = (j) wVar;
            if (!aVar.f19179e) {
                if (aVar.f19177b != TypeUsage.SUPERTYPE) {
                    z11 = true;
                }
            }
            boolean P = jVar.P();
            if (!P && !z11) {
                v a11 = a(jVar, aVar, null);
                if (a11 != null) {
                    return a11;
                }
            } else {
                v a12 = a(jVar, aVar.f(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
                if (a12 != null && (a10 = a(jVar, aVar.f(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), a12)) != null) {
                    if (P) {
                        return new RawTypeImpl(a12, a10);
                    }
                    return KotlinTypeFactory.c(a12, a10);
                }
            }
            return d(jVar);
        } else if (wVar instanceof b9.f) {
            return c((b9.f) wVar, aVar, false);
        } else {
            if (wVar instanceof a0) {
                u H = ((a0) wVar).H();
                if (H != null) {
                    return e(H, aVar);
                }
            } else if (wVar != null) {
                throw new UnsupportedOperationException("Unsupported type: " + wVar);
            }
            return cVar.f18762a.f18751o.u().n();
        }
    }
}
