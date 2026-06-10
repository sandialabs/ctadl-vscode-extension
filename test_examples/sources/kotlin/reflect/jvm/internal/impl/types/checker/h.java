package kotlin.reflect.jvm.internal.impl.types.checker;

import ba.i;
import ba.j;
import ba.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import l8.i0;
import y9.e0;
import y9.f0;
import y9.h0;
import y9.l;
import y9.m0;
import y9.n;
import y9.v;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f15004a = new h();

    @Override // ba.l
    public final boolean A(ba.g gVar) {
        v7.g.f(gVar, "<this>");
        return b.a.L(b.a.g0(gVar));
    }

    @Override // ba.l
    public final i B(ba.h hVar, int i10) {
        v7.g.f(hVar, "<this>");
        if (hVar instanceof ba.g) {
            return b.a.n((ba.f) hVar, i10);
        }
        if (hVar instanceof ArgumentList) {
            i iVar = ((ArgumentList) hVar).get(i10);
            v7.g.e(iVar, "get(index)");
            return iVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + v7.i.a(hVar.getClass())).toString());
    }

    @Override // ba.l
    public final void C(ba.g gVar, j jVar) {
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
    public final boolean E(j jVar) {
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
    public final c H(ba.g gVar) {
        return b.a.d0(this, gVar);
    }

    @Override // ba.l
    public final v I(ba.f fVar) {
        v W;
        v7.g.f(fVar, "<this>");
        n g10 = b.a.g(fVar);
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

    @Override // ba.l
    public final boolean N(j jVar, j jVar2) {
        return b.a.a(jVar, jVar2);
    }

    @Override // ba.l
    public final y9.g O(ba.g gVar) {
        return b.a.e(gVar);
    }

    @Override // ba.l
    public final boolean P(j jVar) {
        return b.a.H(jVar);
    }

    @Override // ba.l
    public final boolean Q(j jVar) {
        return b.a.M(jVar);
    }

    @Override // ba.l
    public final boolean R(ba.g gVar) {
        return b.a.T(gVar);
    }

    @Override // ba.l
    public final boolean S(j jVar) {
        return b.a.G(jVar);
    }

    @Override // ba.l
    public final NewCapturedTypeConstructor T(ba.b bVar) {
        return b.a.f0(bVar);
    }

    @Override // ba.l
    public final TypeVariance U(i iVar) {
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
    public final boolean b0(j jVar) {
        return b.a.L(jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final v c(ba.d dVar) {
        return b.a.h0(dVar);
    }

    @Override // ba.l
    public final n c0(ba.f fVar) {
        return b.a.g(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ba.l
    public final e0 d(ba.g gVar) {
        return b.a.g0(gVar);
    }

    @Override // ba.l
    public final i d0(ba.g gVar, int i10) {
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
    public final boolean g0(j jVar) {
        return b.a.O(jVar);
    }

    @Override // ba.l
    public final boolean h(i iVar) {
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
    public final boolean i0(k kVar, j jVar) {
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
    public final m0 k(i iVar) {
        return b.a.v(iVar);
    }

    @Override // ba.l
    public final i0 k0(ba.n nVar) {
        return b.a.w(nVar);
    }

    @Override // ba.l
    public final boolean l(ba.f fVar) {
        l lVar;
        v7.g.f(fVar, "<this>");
        n g10 = b.a.g(fVar);
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
        n g10 = b.a.g(fVar);
        if (g10 == null || (h02 = b.a.h0(g10)) == null) {
            v i10 = b.a.i(fVar);
            v7.g.c(i10);
            return i10;
        }
        return h02;
    }

    @Override // ba.l
    public final i m(ba.f fVar, int i10) {
        return b.a.n(fVar, i10);
    }

    public final boolean m0(ba.f fVar) {
        v7.g.f(fVar, "<this>");
        if ((fVar instanceof ba.g) && b.a.N((ba.g) fVar)) {
            return true;
        }
        return false;
    }

    @Override // ba.l
    public final ba.h n(ba.g gVar) {
        return b.a.c(gVar);
    }

    public final ba.f n0(ba.f fVar) {
        v j02;
        v7.g.f(fVar, "<this>");
        v i10 = b.a.i(fVar);
        if (i10 != null && (j02 = b.a.j0(i10, true)) != null) {
            return j02;
        }
        return fVar;
    }

    @Override // ba.l
    public final TypeVariance o(k kVar) {
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
    public final k r(j jVar, int i10) {
        return b.a.q(jVar, i10);
    }

    @Override // ba.l
    public final int s(j jVar) {
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
    public final boolean v(j jVar) {
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
    public final Collection<ba.f> y(j jVar) {
        return b.a.e0(jVar);
    }

    @Override // ba.l
    public final ba.f z(ba.f fVar) {
        return b.a.i0(this, fVar);
    }
}
