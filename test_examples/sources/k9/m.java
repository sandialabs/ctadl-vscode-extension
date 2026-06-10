package k9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.checker.d;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import l8.i0;
import u7.p;
import y9.e0;
import y9.f0;
import y9.h0;
import y9.m0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class m implements kotlin.reflect.jvm.internal.impl.types.checker.b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<e0, e0> f12946a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f12947b;
    public final kotlin.reflect.jvm.internal.impl.types.checker.e c;

    /* renamed from: d  reason: collision with root package name */
    public final KotlinTypePreparator f12948d;

    /* renamed from: e  reason: collision with root package name */
    public final p<r, r, Boolean> f12949e;

    public m(HashMap hashMap, d.a aVar, kotlin.reflect.jvm.internal.impl.types.checker.e eVar, KotlinTypePreparator kotlinTypePreparator, p pVar) {
        v7.g.f(aVar, "equalityAxioms");
        v7.g.f(eVar, "kotlinTypeRefiner");
        v7.g.f(kotlinTypePreparator, "kotlinTypePreparator");
        this.f12946a = hashMap;
        this.f12947b = aVar;
        this.c = eVar;
        this.f12948d = kotlinTypePreparator;
        this.f12949e = pVar;
    }

    @Override // ba.l
    public final boolean A(ba.g gVar) {
        v7.g.f(gVar, "<this>");
        return b.a.L(b.a.g0(gVar));
    }

    @Override // ba.l
    public final ba.i B(ba.h hVar, int i10) {
        v7.g.f(hVar, "<this>");
        if (hVar instanceof ba.g) {
            return b.a.n((ba.f) hVar, i10);
        }
        if (hVar instanceof ArgumentList) {
            ba.i iVar = ((ArgumentList) hVar).get(i10);
            v7.g.e(iVar, "get(index)");
            return iVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + v7.i.a(hVar.getClass())).toString());
    }

    @Override // ba.l
    public final void C(ba.g gVar, ba.j jVar) {
    }

    @Override // ba.l
    public final boolean D(ba.f fVar) {
        v7.g.f(fVar, "<this>");
        if (b.a.O(J(fVar)) && !b.a.P(fVar)) {
            return true;
        }
        return false;
    }

    @Override // ba.l
    public final boolean E(ba.j jVar) {
        return b.a.F(jVar);
    }

    @Override // ba.l
    public final m0 F(ba.b bVar) {
        return b.a.X(bVar);
    }

    @Override // ba.m
    public final boolean G(ba.g gVar, ba.g gVar2) {
        return b.a.E(gVar, gVar2);
    }

    @Override // ba.l
    public final kotlin.reflect.jvm.internal.impl.types.checker.c H(ba.g gVar) {
        return b.a.d0(this, gVar);
    }

    @Override // ba.l
    public final v I(ba.f fVar) {
        v W;
        v7.g.f(fVar, "<this>");
        y9.n g10 = b.a.g(fVar);
        if (g10 == null || (W = b.a.W(g10)) == null) {
            v i10 = b.a.i(fVar);
            v7.g.c(i10);
            return i10;
        }
        return W;
    }

    @Override // ba.l
    public final e0 J(ba.f fVar) {
        v7.g.f(fVar, "<this>");
        v i10 = b.a.i(fVar);
        if (i10 == null) {
            i10 = I(fVar);
        }
        return b.a.g0(i10);
    }

    @Override // ba.l
    public final Set K(ba.g gVar) {
        return b.a.b0(this, gVar);
    }

    @Override // ba.l
    public final boolean L(ba.g gVar) {
        return b.a.J(gVar);
    }

    @Override // ba.l
    public final boolean M(ba.f fVar) {
        v7.g.f(fVar, "<this>");
        if (b.a.N(I(fVar)) != b.a.N(l0(fVar))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (v7.g.a(r3, r6) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (v7.g.a(r0, r5) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[ORIG_RETURN, RETURN] */
    @Override // ba.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(ba.j jVar, ba.j jVar2) {
        boolean z10;
        v7.g.f(jVar, "c1");
        v7.g.f(jVar2, "c2");
        if (jVar instanceof e0) {
            if (jVar2 instanceof e0) {
                if (b.a.a(jVar, jVar2)) {
                    return true;
                }
                e0 e0Var = (e0) jVar;
                e0 e0Var2 = (e0) jVar2;
                if (!this.f12947b.a(e0Var, e0Var2)) {
                    Map<e0, e0> map = this.f12946a;
                    if (map != null) {
                        e0 e0Var3 = map.get(e0Var);
                        e0 e0Var4 = map.get(e0Var2);
                        if (e0Var3 != null) {
                        }
                        if (e0Var4 != null) {
                        }
                    }
                    z10 = false;
                    if (!z10) {
                        return true;
                    }
                    return false;
                }
                z10 = true;
                if (!z10) {
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // ba.l
    public final y9.g O(ba.g gVar) {
        return b.a.e(gVar);
    }

    @Override // ba.l
    public final boolean P(ba.j jVar) {
        return b.a.H(jVar);
    }

    @Override // ba.l
    public final boolean Q(ba.j jVar) {
        return b.a.M(jVar);
    }

    @Override // ba.l
    public final boolean R(ba.g gVar) {
        return b.a.T(gVar);
    }

    @Override // ba.l
    public final boolean S(ba.j jVar) {
        return b.a.G(jVar);
    }

    @Override // ba.l
    public final NewCapturedTypeConstructor T(ba.b bVar) {
        return b.a.f0(bVar);
    }

    @Override // ba.l
    public final TypeVariance U(ba.i iVar) {
        return b.a.A(iVar);
    }

    @Override // ba.l
    public final boolean V(ba.f fVar) {
        y9.g gVar;
        v7.g.f(fVar, "<this>");
        v i10 = b.a.i(fVar);
        if (i10 != null) {
            gVar = b.a.e(i10);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            return true;
        }
        return false;
    }

    @Override // ba.l
    public final h0 W(ba.f fVar) {
        return b.a.j(fVar);
    }

    @Override // ba.l
    public final boolean X(ba.g gVar) {
        v7.g.f(gVar, "<this>");
        return b.a.G(b.a.g0(gVar));
    }

    @Override // ba.l
    public final boolean Y(ba.g gVar) {
        return b.a.U(gVar);
    }

    @Override // ba.l
    public final CaptureStatus Z(ba.b bVar) {
        return b.a.l(bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final v a(ba.g gVar, boolean z10) {
        return b.a.j0(gVar, z10);
    }

    @Override // ba.l
    public final boolean a0(ba.g gVar) {
        return b.a.N(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final ba.b b(ba.g gVar) {
        return b.a.d(this, gVar);
    }

    @Override // ba.l
    public final boolean b0(ba.j jVar) {
        return b.a.L(jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final v c(ba.d dVar) {
        return b.a.h0(dVar);
    }

    @Override // ba.l
    public final y9.n c0(ba.f fVar) {
        return b.a.g(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final e0 d(ba.g gVar) {
        return b.a.g0(gVar);
    }

    @Override // ba.l
    public final ba.i d0(ba.g gVar, int i10) {
        boolean z10;
        v7.g.f(gVar, "<this>");
        if (i10 >= 0 && i10 < b.a.b(gVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return b.a.n(gVar, i10);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final v e(ba.d dVar) {
        return b.a.W(dVar);
    }

    @Override // ba.l
    public final v e0(ba.c cVar) {
        return b.a.Z(cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final v f(ba.f fVar) {
        return b.a.i(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    public final m0 f0(ba.g gVar, ba.g gVar2) {
        return b.a.m(this, gVar, gVar2);
    }

    @Override // ba.l
    public final m0 g(ba.f fVar) {
        return b.a.Y(fVar);
    }

    @Override // ba.l
    public final boolean g0(ba.j jVar) {
        return b.a.O(jVar);
    }

    @Override // ba.l
    public final boolean h(ba.i iVar) {
        return b.a.S(iVar);
    }

    @Override // ba.l
    public final boolean h0(ba.f fVar) {
        v7.g.f(fVar, "$receiver");
        return fVar instanceof c9.d;
    }

    @Override // ba.l
    public final int i(ba.f fVar) {
        return b.a.b(fVar);
    }

    @Override // ba.l
    public final boolean i0(ba.k kVar, ba.j jVar) {
        return b.a.D(kVar, jVar);
    }

    @Override // ba.l
    public final boolean j(ba.b bVar) {
        v7.g.f(bVar, "$receiver");
        return bVar instanceof l9.a;
    }

    @Override // ba.l
    public final boolean j0(ba.g gVar) {
        ba.b bVar;
        v7.g.f(gVar, "<this>");
        v i10 = b.a.i(gVar);
        if (i10 != null) {
            bVar = b.a.d(this, i10);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return true;
        }
        return false;
    }

    @Override // ba.l
    public final m0 k(ba.i iVar) {
        return b.a.v(iVar);
    }

    @Override // ba.l
    public final i0 k0(ba.n nVar) {
        return b.a.w(nVar);
    }

    @Override // ba.l
    public final boolean l(ba.f fVar) {
        y9.l lVar;
        v7.g.f(fVar, "<this>");
        y9.n g10 = b.a.g(fVar);
        if (g10 != null) {
            lVar = b.a.f(g10);
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return true;
        }
        return false;
    }

    @Override // ba.l
    public final v l0(ba.f fVar) {
        v h02;
        v7.g.f(fVar, "<this>");
        y9.n g10 = b.a.g(fVar);
        if (g10 == null || (h02 = b.a.h0(g10)) == null) {
            v i10 = b.a.i(fVar);
            v7.g.c(i10);
            return i10;
        }
        return h02;
    }

    @Override // ba.l
    public final ba.i m(ba.f fVar, int i10) {
        return b.a.n(fVar, i10);
    }

    @Override // ba.l
    public final ba.h n(ba.g gVar) {
        return b.a.c(gVar);
    }

    @Override // ba.l
    public final TypeVariance o(ba.k kVar) {
        return b.a.B(kVar);
    }

    @Override // ba.l
    public final f0 p(ba.a aVar) {
        return b.a.c0(aVar);
    }

    @Override // ba.l
    public final int q(ba.h hVar) {
        v7.g.f(hVar, "<this>");
        if (hVar instanceof ba.g) {
            return b.a.b((ba.f) hVar);
        }
        if (hVar instanceof ArgumentList) {
            return ((ArgumentList) hVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + v7.i.a(hVar.getClass())).toString());
    }

    @Override // ba.l
    public final ba.k r(ba.j jVar, int i10) {
        return b.a.q(jVar, i10);
    }

    @Override // ba.l
    public final int s(ba.j jVar) {
        return b.a.a0(jVar);
    }

    @Override // ba.l
    public final boolean t(ba.b bVar) {
        return b.a.R(bVar);
    }

    @Override // ba.l
    public final v u(ba.g gVar) {
        return b.a.k(gVar);
    }

    @Override // ba.l
    public final boolean v(ba.j jVar) {
        return b.a.I(jVar);
    }

    @Override // ba.l
    public final m0 w(ArrayList arrayList) {
        return m0.b.z0(arrayList);
    }

    @Override // ba.l
    public final ba.g x(ba.g gVar) {
        v Z;
        v7.g.f(gVar, "<this>");
        y9.g e10 = b.a.e(gVar);
        if (e10 != null && (Z = b.a.Z(e10)) != null) {
            return Z;
        }
        return gVar;
    }

    @Override // ba.l
    public final Collection<ba.f> y(ba.j jVar) {
        return b.a.e0(jVar);
    }

    @Override // ba.l
    public final ba.f z(ba.f fVar) {
        return b.a.i0(this, fVar);
    }
}
