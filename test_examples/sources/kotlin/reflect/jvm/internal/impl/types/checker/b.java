package kotlin.reflect.jvm.internal.impl.types.checker;

import ba.i;
import ba.j;
import ba.k;
import ba.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.i0;
import l8.o;
import y9.b0;
import y9.e0;
import y9.f0;
import y9.h0;
import y9.m0;
import y9.n;
import y9.r;
import y9.u;
import y9.v;
import y9.x;
import y9.y;

/* loaded from: classes.dex */
public interface b extends l {

    /* loaded from: classes.dex */
    public static final class a {
        public static TypeVariance A(i iVar) {
            v7.g.f(iVar, "$receiver");
            if (iVar instanceof f0) {
                Variance a10 = ((f0) iVar).a();
                v7.g.e(a10, "this.projectionKind");
                return a1.c.l0(a10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + v7.i.a(iVar.getClass())).toString());
        }

        public static TypeVariance B(k kVar) {
            v7.g.f(kVar, "$receiver");
            if (kVar instanceof i0) {
                Variance t10 = ((i0) kVar).t();
                v7.g.e(t10, "this.variance");
                return a1.c.l0(t10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + v7.i.a(kVar.getClass())).toString());
        }

        public static boolean C(ba.f fVar, h9.c cVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return ((r) fVar).getAnnotations().i(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static boolean D(k kVar, j jVar) {
            boolean z10;
            if (kVar instanceof i0) {
                if (jVar == null) {
                    z10 = true;
                } else {
                    z10 = jVar instanceof e0;
                }
                if (z10) {
                    return TypeUtilsKt.i((i0) kVar, (e0) jVar, null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + v7.i.a(kVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + v7.i.a(kVar.getClass())).toString());
        }

        public static boolean E(ba.g gVar, ba.g gVar2) {
            v7.g.f(gVar, "a");
            v7.g.f(gVar2, "b");
            if (!(gVar instanceof v)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
            } else if (gVar2 instanceof v) {
                return ((v) gVar).S0() == ((v) gVar2).S0();
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar2 + ", " + v7.i.a(gVar2.getClass())).toString());
            }
        }

        public static boolean F(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                return kotlin.reflect.jvm.internal.impl.builtins.e.K((e0) jVar, g.a.f13358a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean G(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                return ((e0) jVar).c() instanceof l8.b;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean H(j jVar) {
            l8.b bVar;
            boolean z10;
            if (jVar instanceof e0) {
                l8.d c = ((e0) jVar).c();
                if (c instanceof l8.b) {
                    bVar = (l8.b) c;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    return false;
                }
                if (bVar.p() == Modality.FINAL && bVar.h() != ClassKind.f13433k) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || bVar.h() == ClassKind.f13434l || bVar.h() == ClassKind.f13435m) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean I(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                return ((e0) jVar).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean J(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return m0.b.D0((r) fVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static boolean K(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                l8.d c = ((e0) jVar).c();
                l8.b bVar = c instanceof l8.b ? (l8.b) c : null;
                return (bVar != null ? bVar.x0() : null) instanceof o;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean L(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                return jVar instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean M(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                return jVar instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean N(ba.g gVar) {
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                return ((v) gVar).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static boolean O(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                return kotlin.reflect.jvm.internal.impl.builtins.e.K((e0) jVar, g.a.f13360b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static boolean P(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return kotlin.reflect.jvm.internal.impl.types.r.g((r) fVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static boolean Q(ba.g gVar) {
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof r) {
                return kotlin.reflect.jvm.internal.impl.builtins.e.H((r) gVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static boolean R(ba.b bVar) {
            if (bVar instanceof z9.b) {
                return ((z9.b) bVar).f19188o;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + v7.i.a(bVar.getClass())).toString());
        }

        public static boolean S(i iVar) {
            v7.g.f(iVar, "$receiver");
            if (iVar instanceof f0) {
                return ((f0) iVar).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + v7.i.a(iVar.getClass())).toString());
        }

        public static boolean T(ba.g gVar) {
            boolean z10;
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                r rVar = (r) gVar;
                if (rVar instanceof kotlin.reflect.jvm.internal.impl.types.b) {
                    return true;
                }
                if ((rVar instanceof y9.g) && (((y9.g) rVar).f18947j instanceof kotlin.reflect.jvm.internal.impl.types.b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static boolean U(ba.g gVar) {
            boolean z10;
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                r rVar = (r) gVar;
                if (rVar instanceof b0) {
                    return true;
                }
                if ((rVar instanceof y9.g) && (((y9.g) rVar).f18947j instanceof b0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static boolean V(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                l8.d c = ((e0) jVar).c();
                return c != null && kotlin.reflect.jvm.internal.impl.builtins.e.L(c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static v W(ba.d dVar) {
            if (dVar instanceof n) {
                return ((n) dVar).f18958j;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + v7.i.a(dVar.getClass())).toString());
        }

        public static m0 X(ba.b bVar) {
            if (bVar instanceof z9.b) {
                return ((z9.b) bVar).f19186l;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + v7.i.a(bVar.getClass())).toString());
        }

        public static m0 Y(ba.f fVar) {
            if (fVar instanceof m0) {
                return y.a((m0) fVar, false);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static v Z(ba.c cVar) {
            if (cVar instanceof y9.g) {
                return ((y9.g) cVar).f18947j;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + v7.i.a(cVar.getClass())).toString());
        }

        public static boolean a(j jVar, j jVar2) {
            v7.g.f(jVar, "c1");
            v7.g.f(jVar2, "c2");
            if (!(jVar instanceof e0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
            } else if (jVar2 instanceof e0) {
                return v7.g.a(jVar, jVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar2 + ", " + v7.i.a(jVar2.getClass())).toString());
            }
        }

        public static int a0(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                return ((e0) jVar).e().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static int b(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return ((r) fVar).S0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static Set b0(b bVar, ba.g gVar) {
            v7.g.f(gVar, "$receiver");
            e0 d5 = bVar.d(gVar);
            if (d5 instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) d5).c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static ba.h c(ba.g gVar) {
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                return (ba.h) gVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static f0 c0(ba.a aVar) {
            v7.g.f(aVar, "$receiver");
            if (aVar instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) aVar).f14980a;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + aVar + ", " + v7.i.a(aVar.getClass())).toString());
        }

        public static ba.b d(b bVar, ba.g gVar) {
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                if (gVar instanceof x) {
                    return bVar.b(((x) gVar).f18966j);
                }
                if (gVar instanceof z9.b) {
                    return (z9.b) gVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static c d0(b bVar, ba.g gVar) {
            if (gVar instanceof v) {
                return new c(bVar, TypeSubstitutor.d(kotlin.reflect.jvm.internal.impl.types.o.f15066b.a((r) gVar)));
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static y9.g e(ba.g gVar) {
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                if (gVar instanceof y9.g) {
                    return (y9.g) gVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static Collection e0(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                Collection<r> f10 = ((e0) jVar).f();
                v7.g.e(f10, "this.supertypes");
                return f10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static y9.l f(n nVar) {
            if (nVar instanceof y9.l) {
                return (y9.l) nVar;
            }
            return null;
        }

        public static NewCapturedTypeConstructor f0(ba.b bVar) {
            v7.g.f(bVar, "$receiver");
            if (bVar instanceof z9.b) {
                return ((z9.b) bVar).f19185k;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + v7.i.a(bVar.getClass())).toString());
        }

        public static n g(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                m0 X0 = ((r) fVar).X0();
                if (X0 instanceof n) {
                    return (n) X0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static e0 g0(ba.g gVar) {
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                return ((v) gVar).U0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        public static u h(n nVar) {
            if (nVar instanceof u) {
                return (u) nVar;
            }
            return null;
        }

        public static v h0(ba.d dVar) {
            if (dVar instanceof n) {
                return ((n) dVar).f18959k;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + v7.i.a(dVar.getClass())).toString());
        }

        public static v i(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                m0 X0 = ((r) fVar).X0();
                if (X0 instanceof v) {
                    return (v) X0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static ba.f i0(b bVar, ba.f fVar) {
            if (fVar instanceof ba.g) {
                return bVar.a((ba.g) fVar, true);
            }
            if (fVar instanceof ba.d) {
                ba.d dVar = (ba.d) fVar;
                return bVar.f0(bVar.a(bVar.e(dVar), true), bVar.a(bVar.c(dVar), true));
            }
            throw new IllegalStateException("sealed".toString());
        }

        public static h0 j(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return TypeUtilsKt.a((r) fVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static v j0(ba.g gVar, boolean z10) {
            v7.g.f(gVar, "$receiver");
            if (gVar instanceof v) {
                return ((v) gVar).Y0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static v k(ba.g gVar) {
            boolean z10;
            ArrayList arrayList;
            m0 m0Var;
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            if (gVar instanceof v) {
                v vVar = (v) gVar;
                if (vVar.S0().size() == vVar.U0().e().size()) {
                    List<f0> S0 = vVar.S0();
                    boolean z11 = S0 instanceof Collection;
                    Variance variance = Variance.INVARIANT;
                    boolean z12 = true;
                    if (!z11 || !S0.isEmpty()) {
                        Iterator<T> it = S0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((f0) it.next()).a() == variance) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (!z10) {
                                z12 = false;
                                break;
                            }
                        }
                    }
                    if (!z12) {
                        List<i0> e10 = vVar.U0().e();
                        v7.g.e(e10, "type.constructor.parameters");
                        ArrayList S2 = kotlin.collections.c.S2(S0, e10);
                        arrayList = new ArrayList(n7.l.Z1(S2, 10));
                        Iterator it2 = S2.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            f0 f0Var = (f0) pair.f12962i;
                            i0 i0Var = (i0) pair.f12963j;
                            if (f0Var.a() != variance) {
                                if (!f0Var.d() && f0Var.a() == Variance.IN_VARIANCE) {
                                    m0Var = f0Var.b().X0();
                                } else {
                                    m0Var = null;
                                }
                                v7.g.e(i0Var, "parameter");
                                f0Var = TypeUtilsKt.a(new z9.b(captureStatus, new NewCapturedTypeConstructor(f0Var, null, null, i0Var, 6), m0Var, (kotlin.reflect.jvm.internal.impl.types.l) null, false, 56));
                            }
                            arrayList.add(f0Var);
                        }
                        TypeSubstitutor d5 = TypeSubstitutor.d(kotlin.reflect.jvm.internal.impl.types.o.f15066b.b(vVar.U0(), arrayList));
                        int size = S0.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            f0 f0Var2 = S0.get(i10);
                            f0 f0Var3 = (f0) arrayList.get(i10);
                            if (f0Var2.a() != variance) {
                                List<r> upperBounds = vVar.U0().e().get(i10).getUpperBounds();
                                v7.g.e(upperBounds, "type.constructor.parameters[index].upperBounds");
                                ArrayList arrayList2 = new ArrayList();
                                for (r rVar : upperBounds) {
                                    arrayList2.add(KotlinTypePreparator.a.f14979i.G0(d5.i(rVar, variance).X0()));
                                }
                                if (!f0Var2.d() && f0Var2.a() == Variance.OUT_VARIANCE) {
                                    arrayList2.add(KotlinTypePreparator.a.f14979i.G0(f0Var2.b().X0()));
                                }
                                r b5 = f0Var3.b();
                                v7.g.d(b5, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                NewCapturedTypeConstructor newCapturedTypeConstructor = ((z9.b) b5).f19185k;
                                newCapturedTypeConstructor.getClass();
                                newCapturedTypeConstructor.f14981b = new NewCapturedTypeConstructor$initializeSupertypes$2(arrayList2);
                            }
                        }
                        if (arrayList != null) {
                            return null;
                        }
                        return KotlinTypeFactory.f(vVar.T0(), vVar.U0(), arrayList, vVar.V0(), null);
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                }
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v7.i.a(gVar.getClass())).toString());
            }
        }

        public static CaptureStatus l(ba.b bVar) {
            v7.g.f(bVar, "$receiver");
            if (bVar instanceof z9.b) {
                return ((z9.b) bVar).f19184j;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + v7.i.a(bVar.getClass())).toString());
        }

        public static m0 m(b bVar, ba.g gVar, ba.g gVar2) {
            v7.g.f(gVar, "lowerBound");
            v7.g.f(gVar2, "upperBound");
            if (!(gVar instanceof v)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + v7.i.a(bVar.getClass())).toString());
            } else if (gVar2 instanceof v) {
                return KotlinTypeFactory.c((v) gVar, (v) gVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + v7.i.a(bVar.getClass())).toString());
            }
        }

        public static i n(ba.f fVar, int i10) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return ((r) fVar).S0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static List o(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return ((r) fVar).S0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static h9.d p(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                l8.d c = ((e0) jVar).c();
                v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.h((l8.b) c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static k q(j jVar, int i10) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                i0 i0Var = ((e0) jVar).e().get(i10);
                v7.g.e(i0Var, "this.parameters[index]");
                return i0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static List r(e0 e0Var) {
            List<i0> e10 = e0Var.e();
            v7.g.e(e10, "this.parameters");
            return e10;
        }

        public static PrimitiveType s(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                l8.d c = ((e0) jVar).c();
                v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return kotlin.reflect.jvm.internal.impl.builtins.e.s((l8.b) c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static PrimitiveType t(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                l8.d c = ((e0) jVar).c();
                v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return kotlin.reflect.jvm.internal.impl.builtins.e.u((l8.b) c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static r u(k kVar) {
            if (kVar instanceof i0) {
                return TypeUtilsKt.h((i0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + v7.i.a(kVar.getClass())).toString());
        }

        public static m0 v(i iVar) {
            v7.g.f(iVar, "$receiver");
            if (iVar instanceof f0) {
                return ((f0) iVar).b().X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + v7.i.a(iVar.getClass())).toString());
        }

        public static i0 w(ba.n nVar) {
            if (nVar instanceof z9.c) {
                return ((z9.c) nVar).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + v7.i.a(nVar.getClass())).toString());
        }

        public static i0 x(j jVar) {
            v7.g.f(jVar, "$receiver");
            if (jVar instanceof e0) {
                l8.d c = ((e0) jVar).c();
                if (c instanceof i0) {
                    return (i0) c;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + v7.i.a(jVar.getClass())).toString());
        }

        public static v y(ba.f fVar) {
            v7.g.f(fVar, "$receiver");
            if (fVar instanceof r) {
                return k9.e.e((r) fVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + v7.i.a(fVar.getClass())).toString());
        }

        public static List z(k kVar) {
            if (kVar instanceof i0) {
                List<r> upperBounds = ((i0) kVar).getUpperBounds();
                v7.g.e(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + v7.i.a(kVar.getClass())).toString());
        }
    }

    @Override // ba.l
    v a(ba.g gVar, boolean z10);

    @Override // ba.l
    ba.b b(ba.g gVar);

    @Override // ba.l
    v c(ba.d dVar);

    @Override // ba.l
    e0 d(ba.g gVar);

    @Override // ba.l
    v e(ba.d dVar);

    @Override // ba.l
    v f(ba.f fVar);

    m0 f0(ba.g gVar, ba.g gVar2);
}
