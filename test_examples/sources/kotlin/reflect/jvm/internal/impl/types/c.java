package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.m;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import l8.i0;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14978a = new c();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(ba.l lVar, ba.g gVar) {
        boolean z10;
        if (lVar.A(gVar)) {
            return true;
        }
        if (gVar instanceof ba.b) {
            f0 p10 = lVar.p(lVar.T((ba.b) gVar));
            if (!lVar.h(p10) && lVar.A(lVar.l0(lVar.k(p10)))) {
                z10 = true;
                if (!z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(ba.l lVar, m mVar, ba.g gVar, ba.g gVar2, boolean z10) {
        boolean z11;
        Set<ba.f> K = lVar.K(gVar);
        if ((K instanceof Collection) && K.isEmpty()) {
            return false;
        }
        for (ba.f fVar : K) {
            if (!v7.g.a(lVar.J(fVar), lVar.d(gVar2)) && (!z10 || !i(f14978a, mVar, gVar2, fVar))) {
                z11 = false;
                continue;
                if (z11) {
                    return true;
                }
            }
            z11 = true;
            if (z11) {
            }
        }
        return false;
    }

    public static List c(m mVar, ba.g gVar, ba.j jVar) {
        m.b H;
        ba.l lVar = mVar.c;
        lVar.C(gVar, jVar);
        if (!lVar.S(jVar) && lVar.X(gVar)) {
            return EmptyList.f12981i;
        }
        if (lVar.P(jVar)) {
            if (lVar.N(lVar.d(gVar), jVar)) {
                v u10 = lVar.u(gVar);
                if (u10 != null) {
                    gVar = u10;
                }
                return a1.c.N0(gVar);
            }
            return EmptyList.f12981i;
        }
        fa.c cVar = new fa.c();
        mVar.c();
        ArrayDeque<ba.g> arrayDeque = mVar.f15052g;
        v7.g.c(arrayDeque);
        fa.d dVar = mVar.f15053h;
        v7.g.c(dVar);
        arrayDeque.push(gVar);
        while (!arrayDeque.isEmpty()) {
            if (dVar.f11019j <= 1000) {
                ba.g pop = arrayDeque.pop();
                v7.g.e(pop, "current");
                if (dVar.add(pop)) {
                    v u11 = lVar.u(pop);
                    if (u11 == null) {
                        u11 = pop;
                    }
                    boolean N = lVar.N(lVar.d(u11), jVar);
                    ba.l lVar2 = mVar.c;
                    if (N) {
                        cVar.add(u11);
                        H = m.b.c.f15056a;
                    } else if (lVar.i(u11) == 0) {
                        H = m.b.C0169b.f15055a;
                    } else {
                        H = lVar2.H(u11);
                    }
                    if (!(!v7.g.a(H, m.b.c.f15056a))) {
                        H = null;
                    }
                    if (H != null) {
                        for (ba.f fVar : lVar2.y(lVar2.d(pop))) {
                            arrayDeque.add(H.a(mVar, fVar));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + gVar + ". Supertypes = " + kotlin.collections.c.t2(dVar, null, null, null, null, 63)).toString());
            }
        }
        mVar.a();
        return cVar;
    }

    public static List d(m mVar, ba.g gVar, ba.j jVar) {
        boolean z10;
        List c = c(mVar, gVar, jVar);
        if (c.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c.iterator();
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ba.l lVar = mVar.c;
                ba.h n = lVar.n((ba.g) next);
                int q10 = lVar.q(n);
                int i10 = 0;
                while (true) {
                    if (i10 >= q10) {
                        break;
                    }
                    if (lVar.c0(lVar.k(lVar.B(n, i10))) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = false;
                        break;
                    }
                    i10++;
                }
                if (z11) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return c;
        }
        return c;
    }

    public static boolean e(m mVar, ba.f fVar, ba.f fVar2) {
        v7.g.f(mVar, "state");
        v7.g.f(fVar, "a");
        v7.g.f(fVar2, "b");
        if (fVar == fVar2) {
            return true;
        }
        c cVar = f14978a;
        ba.l lVar = mVar.c;
        if (g(lVar, fVar) && g(lVar, fVar2)) {
            androidx.datastore.preferences.protobuf.k kVar = mVar.f15050e;
            ba.f d5 = mVar.d(kVar.H0(fVar));
            ba.f d10 = mVar.d(kVar.H0(fVar2));
            v I = lVar.I(d5);
            if (!lVar.N(lVar.J(d5), lVar.J(d10))) {
                return false;
            }
            if (lVar.i(I) == 0) {
                if (lVar.M(d5) || lVar.M(d10) || lVar.a0(I) == lVar.a0(lVar.I(d10))) {
                    return true;
                }
                return false;
            }
        }
        if (i(cVar, mVar, fVar, fVar2) && i(cVar, mVar, fVar2, fVar)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        return r7.r(r7.J(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ba.k f(ba.l lVar, ba.f fVar, ba.g gVar) {
        m0 k3;
        int i10 = lVar.i(fVar);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                return null;
            }
            ba.i m10 = lVar.m(fVar, i11);
            boolean z10 = true;
            ba.i iVar = lVar.h(m10) ^ true ? m10 : null;
            if (iVar != null && (k3 = lVar.k(iVar)) != null) {
                if (!lVar.j0(lVar.x(lVar.I(k3))) || !lVar.j0(lVar.x(lVar.I(gVar)))) {
                    z10 = false;
                }
                if (v7.g.a(k3, gVar) || (z10 && v7.g.a(lVar.J(k3), lVar.J(gVar)))) {
                    break;
                }
                ba.k f10 = f(lVar, k3, gVar);
                if (f10 != null) {
                    return f10;
                }
            }
            i11++;
        }
    }

    public static boolean g(ba.l lVar, ba.f fVar) {
        return (!lVar.v(lVar.J(fVar)) || lVar.l(fVar) || lVar.V(fVar) || lVar.h0(fVar) || !v7.g.a(lVar.d(lVar.I(fVar)), lVar.d(lVar.l0(fVar)))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(m mVar, ba.h hVar, ba.g gVar) {
        boolean z10;
        boolean i10;
        v7.g.f(mVar, "<this>");
        v7.g.f(hVar, "capturedSubArguments");
        v7.g.f(gVar, "superType");
        ba.l lVar = mVar.c;
        e0 d5 = lVar.d(gVar);
        int q10 = lVar.q(hVar);
        int s10 = lVar.s(d5);
        if (q10 == s10 && q10 == lVar.i(gVar)) {
            for (int i11 = 0; i11 < s10; i11++) {
                ba.i m10 = lVar.m(gVar, i11);
                if (!lVar.h(m10)) {
                    m0 k3 = lVar.k(m10);
                    ba.i B = lVar.B(hVar, i11);
                    lVar.U(B);
                    m0 k10 = lVar.k(B);
                    TypeVariance o10 = lVar.o(lVar.r(d5, i11));
                    TypeVariance U = lVar.U(m10);
                    v7.g.f(o10, "declared");
                    v7.g.f(U, "useSite");
                    TypeVariance typeVariance = TypeVariance.f15062l;
                    if (o10 == typeVariance) {
                        o10 = U;
                    } else if (U != typeVariance && o10 != U) {
                        o10 = null;
                    }
                    if (o10 == null) {
                        return mVar.f15047a;
                    }
                    c cVar = f14978a;
                    if (o10 == typeVariance && (j(lVar, k10, k3, d5) || j(lVar, k3, k10, d5))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i12 = mVar.f15051f;
                        if (i12 <= 100) {
                            mVar.f15051f = i12 + 1;
                            int ordinal = o10.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        i10 = e(mVar, k10, k3);
                                        mVar.f15051f--;
                                        if (i10) {
                                            return false;
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    k10 = k3;
                                    k3 = k10;
                                }
                            }
                            i10 = i(cVar, mVar, k3, k10);
                            mVar.f15051f--;
                            if (i10) {
                            }
                        } else {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + k10).toString());
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0163, code lost:
        if (r10 != false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x034c, code lost:
        if (b(r6, r25, r11, r3, true) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Type inference failed for: r10v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(c cVar, m mVar, ba.f fVar, ba.f fVar2) {
        boolean K;
        Boolean bool;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Boolean bool2;
        List<ba.g> list;
        m.b bVar;
        m0 k3;
        v vVar;
        boolean z14;
        ba.f g10;
        v vVar2;
        v vVar3;
        boolean z15;
        cVar.getClass();
        v7.g.f(mVar, "state");
        v7.g.f(fVar, "subType");
        v7.g.f(fVar2, "superType");
        if (fVar != fVar2) {
            if (mVar.b(fVar, fVar2)) {
                androidx.datastore.preferences.protobuf.k kVar = mVar.f15050e;
                ba.f d5 = mVar.d(kVar.H0(fVar));
                ba.f d10 = mVar.d(kVar.H0(fVar2));
                ba.l lVar = mVar.c;
                v I = lVar.I(d5);
                v l02 = lVar.l0(d10);
                boolean L = lVar.L(I);
                c cVar2 = f14978a;
                if (!L && !lVar.L(l02)) {
                    boolean Y = lVar.Y(I);
                    boolean z16 = mVar.f15048b;
                    if (Y && lVar.Y(l02)) {
                        y9.g O = lVar.O(I);
                        if (O == null || (vVar2 = lVar.e0(O)) == null) {
                            vVar2 = I;
                        }
                        y9.g O2 = lVar.O(l02);
                        if (O2 == null || (vVar3 = lVar.e0(O2)) == null) {
                            vVar3 = l02;
                        }
                        if (lVar.d(vVar2) == lVar.d(vVar3) && ((lVar.V(I) || !lVar.V(l02)) && (!lVar.a0(I) || lVar.a0(l02)))) {
                            z15 = true;
                            if (!z15) {
                                if (!z16) {
                                }
                                K = false;
                                break;
                            }
                            K = true;
                        }
                        z15 = false;
                        if (!z15) {
                        }
                        K = true;
                    } else {
                        if (!lVar.R(I) && !lVar.R(l02)) {
                            y9.g O3 = lVar.O(l02);
                            if (O3 == null || (vVar = lVar.e0(O3)) == null) {
                                vVar = l02;
                            }
                            ba.b b5 = lVar.b(vVar);
                            m0 F = b5 != null ? lVar.F(b5) : null;
                            if (b5 != null && F != null) {
                                if (lVar.a0(l02)) {
                                    g10 = lVar.z(F);
                                } else {
                                    if (lVar.V(l02)) {
                                        g10 = lVar.g(F);
                                    }
                                    v7.g.f(I, "subType");
                                    if (i(cVar2, mVar, I, F)) {
                                        bool = Boolean.TRUE;
                                        if (bool != null) {
                                            boolean booleanValue = bool.booleanValue();
                                            v7.g.f(d5, "subType");
                                            v7.g.f(d10, "superType");
                                            return booleanValue;
                                        }
                                        v7.g.f(d5, "subType");
                                        v7.g.f(d10, "superType");
                                        v I2 = lVar.I(d5);
                                        v l03 = lVar.l0(d10);
                                        v7.g.f(I2, "subType");
                                        v7.g.f(l03, "superType");
                                        if (!lVar.a0(l03) && !lVar.V(I2) && !lVar.h0(I2) && ((!(I2 instanceof ba.b) || !lVar.t((ba.b) I2)) && !a.a(mVar, I2, m.b.C0169b.f15055a))) {
                                            if (!lVar.V(l03) && !a.a(mVar, l03, m.b.d.f15057a) && !lVar.X(I2)) {
                                                e0 d11 = lVar.d(l03);
                                                v7.g.f(d11, "end");
                                                if (!a.b(mVar, I2, d11)) {
                                                    mVar.c();
                                                    ArrayDeque<ba.g> arrayDeque = mVar.f15052g;
                                                    v7.g.c(arrayDeque);
                                                    fa.d dVar = mVar.f15053h;
                                                    v7.g.c(dVar);
                                                    arrayDeque.push(I2);
                                                    loop9: while (!arrayDeque.isEmpty()) {
                                                        if (dVar.f11019j > 1000) {
                                                            throw new IllegalStateException(("Too many supertypes for type: " + I2 + ". Supertypes = " + kotlin.collections.c.t2(dVar, null, null, null, null, 63)).toString());
                                                        }
                                                        ba.g pop = arrayDeque.pop();
                                                        v7.g.e(pop, "current");
                                                        if (dVar.add(pop)) {
                                                            m.b bVar2 = lVar.a0(pop) ? m.b.c.f15056a : m.b.C0169b.f15055a;
                                                            if (!(!v7.g.a(bVar2, m.b.c.f15056a))) {
                                                                bVar2 = null;
                                                            }
                                                            if (bVar2 != null) {
                                                                for (ba.f fVar3 : lVar.y(lVar.d(pop))) {
                                                                    ba.g a10 = bVar2.a(mVar, fVar3);
                                                                    if (a.b(mVar, a10, d11)) {
                                                                        mVar.a();
                                                                    } else {
                                                                        arrayDeque.add(a10);
                                                                    }
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    mVar.a();
                                                }
                                            }
                                            z10 = false;
                                            if (!z10) {
                                                v I3 = lVar.I(I2);
                                                v l04 = lVar.l0(l03);
                                                if (lVar.A(I3) || lVar.A(l04)) {
                                                    if (!a(lVar, I3) || !a(lVar, l04)) {
                                                        if (lVar.A(I3)) {
                                                            if (b(lVar, mVar, I3, l04, false)) {
                                                            }
                                                        } else if (lVar.A(l04)) {
                                                            e0 d12 = lVar.d(I3);
                                                            if (d12 instanceof ba.e) {
                                                                Collection<ba.f> y10 = lVar.y(d12);
                                                                if (!(y10 instanceof Collection) || !y10.isEmpty()) {
                                                                    for (ba.f fVar4 : y10) {
                                                                        v f10 = lVar.f(fVar4);
                                                                        if (f10 == null || !lVar.A(f10)) {
                                                                            z12 = false;
                                                                            continue;
                                                                        } else {
                                                                            z12 = true;
                                                                            continue;
                                                                        }
                                                                        if (z12) {
                                                                            z13 = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                z13 = false;
                                                                if (z13) {
                                                                    z11 = true;
                                                                    if (!z11) {
                                                                    }
                                                                }
                                                            }
                                                            z11 = false;
                                                            if (!z11) {
                                                            }
                                                        }
                                                        if (bool2 != null) {
                                                            return bool2.booleanValue();
                                                        }
                                                        e0 d13 = lVar.d(l03);
                                                        if ((!lVar.N(lVar.d(I2), d13) || lVar.s(d13) != 0) && !lVar.E(lVar.d(l03))) {
                                                            v7.g.f(d13, "superConstructor");
                                                            if (lVar.X(I2)) {
                                                                list = d(mVar, I2, d13);
                                                            } else if (lVar.S(d13) || lVar.b0(d13)) {
                                                                fa.c cVar3 = new fa.c();
                                                                mVar.c();
                                                                ArrayDeque<ba.g> arrayDeque2 = mVar.f15052g;
                                                                v7.g.c(arrayDeque2);
                                                                fa.d dVar2 = mVar.f15053h;
                                                                v7.g.c(dVar2);
                                                                arrayDeque2.push(I2);
                                                                while (!arrayDeque2.isEmpty()) {
                                                                    if (dVar2.f11019j > 1000) {
                                                                        throw new IllegalStateException(("Too many supertypes for type: " + I2 + ". Supertypes = " + kotlin.collections.c.t2(dVar2, null, null, null, null, 63)).toString());
                                                                    }
                                                                    ba.g pop2 = arrayDeque2.pop();
                                                                    v7.g.e(pop2, "current");
                                                                    if (dVar2.add(pop2)) {
                                                                        if (lVar.X(pop2)) {
                                                                            cVar3.add(pop2);
                                                                            bVar = m.b.c.f15056a;
                                                                        } else {
                                                                            bVar = m.b.C0169b.f15055a;
                                                                        }
                                                                        if (!(!v7.g.a(bVar, m.b.c.f15056a))) {
                                                                            bVar = null;
                                                                        }
                                                                        if (bVar != null) {
                                                                            for (ba.f fVar5 : lVar.y(lVar.d(pop2))) {
                                                                                arrayDeque2.add(bVar.a(mVar, fVar5));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                mVar.a();
                                                                ArrayList arrayList = new ArrayList();
                                                                Iterator it = cVar3.iterator();
                                                                while (it.hasNext()) {
                                                                    ba.g gVar = (ba.g) it.next();
                                                                    v7.g.e(gVar, "it");
                                                                    n7.n.f2(d(mVar, gVar, d13), arrayList);
                                                                }
                                                                list = arrayList;
                                                            } else {
                                                                list = c(mVar, I2, d13);
                                                            }
                                                            int i10 = 10;
                                                            ArrayList arrayList2 = new ArrayList(n7.l.Z1(list, 10));
                                                            for (ba.g gVar2 : list) {
                                                                v f11 = lVar.f(mVar.d(gVar2));
                                                                if (f11 != null) {
                                                                    gVar2 = f11;
                                                                }
                                                                arrayList2.add(gVar2);
                                                            }
                                                            int size = arrayList2.size();
                                                            if (size == 0) {
                                                                e0 d14 = lVar.d(I2);
                                                                if (lVar.S(d14)) {
                                                                    return lVar.g0(d14);
                                                                }
                                                                if (!lVar.g0(lVar.d(I2))) {
                                                                    mVar.c();
                                                                    ArrayDeque<ba.g> arrayDeque3 = mVar.f15052g;
                                                                    v7.g.c(arrayDeque3);
                                                                    fa.d dVar3 = mVar.f15053h;
                                                                    v7.g.c(dVar3);
                                                                    arrayDeque3.push(I2);
                                                                    while (!arrayDeque3.isEmpty()) {
                                                                        if (dVar3.f11019j > 1000) {
                                                                            throw new IllegalStateException(("Too many supertypes for type: " + I2 + ". Supertypes = " + kotlin.collections.c.t2(dVar3, null, null, null, null, 63)).toString());
                                                                        }
                                                                        ba.g pop3 = arrayDeque3.pop();
                                                                        v7.g.e(pop3, "current");
                                                                        if (dVar3.add(pop3)) {
                                                                            m.b bVar3 = lVar.X(pop3) ? m.b.c.f15056a : m.b.C0169b.f15055a;
                                                                            if (!(!v7.g.a(bVar3, m.b.c.f15056a))) {
                                                                                bVar3 = null;
                                                                            }
                                                                            if (bVar3 != null) {
                                                                                for (ba.f fVar6 : lVar.y(lVar.d(pop3))) {
                                                                                    ba.g a11 = bVar3.a(mVar, fVar6);
                                                                                    if (lVar.g0(lVar.d(a11))) {
                                                                                        mVar.a();
                                                                                        return true;
                                                                                    }
                                                                                    arrayDeque3.add(a11);
                                                                                }
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }
                                                                    mVar.a();
                                                                }
                                                            } else if (size == 1) {
                                                                return h(mVar, lVar.n((ba.g) kotlin.collections.c.n2(arrayList2)), l03);
                                                            } else {
                                                                ArgumentList argumentList = new ArgumentList(lVar.s(d13));
                                                                int s10 = lVar.s(d13);
                                                                int i11 = 0;
                                                                boolean z17 = false;
                                                                while (i11 < s10) {
                                                                    if (!z17 && lVar.o(lVar.r(d13, i11)) == TypeVariance.f15061k) {
                                                                        z17 = false;
                                                                        if (z17) {
                                                                            ArrayList arrayList3 = new ArrayList(n7.l.Z1(arrayList2, i10));
                                                                            Iterator it2 = arrayList2.iterator();
                                                                            while (it2.hasNext()) {
                                                                                ba.g gVar3 = (ba.g) it2.next();
                                                                                ba.i d02 = lVar.d0(gVar3, i11);
                                                                                if (d02 != null) {
                                                                                    if (!(lVar.U(d02) == TypeVariance.f15062l)) {
                                                                                        d02 = null;
                                                                                    }
                                                                                    if (d02 != null && (k3 = lVar.k(d02)) != null) {
                                                                                        arrayList3.add(k3);
                                                                                    }
                                                                                }
                                                                                throw new IllegalStateException(("Incorrect type: " + gVar3 + ", subType: " + I2 + ", superType: " + l03).toString());
                                                                            }
                                                                            argumentList.add(lVar.W(lVar.w(arrayList3)));
                                                                        }
                                                                        i11++;
                                                                        i10 = 10;
                                                                    }
                                                                    z17 = true;
                                                                    if (z17) {
                                                                    }
                                                                    i11++;
                                                                    i10 = 10;
                                                                }
                                                                if (z17 || !h(mVar, argumentList, l03)) {
                                                                    AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4 abstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4 = new AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4(arrayList2, mVar, lVar, l03);
                                                                    m.a.C0168a c0168a = new m.a.C0168a();
                                                                    abstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.U(c0168a);
                                                                    return c0168a.f15054a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    bool2 = Boolean.TRUE;
                                                    if (bool2 != null) {
                                                    }
                                                }
                                                bool2 = null;
                                                if (bool2 != null) {
                                                }
                                            }
                                        }
                                        z10 = true;
                                        if (!z10) {
                                        }
                                    }
                                }
                                F = g10;
                                v7.g.f(I, "subType");
                                if (i(cVar2, mVar, I, F)) {
                                }
                            }
                            e0 d15 = lVar.d(l02);
                            if (lVar.Q(d15)) {
                                lVar.a0(l02);
                                Collection<ba.f> y11 = lVar.y(d15);
                                if (!(y11 instanceof Collection) || !y11.isEmpty()) {
                                    for (ba.f fVar7 : y11) {
                                        if (!i(cVar2, mVar, I, fVar7)) {
                                            K = false;
                                            break;
                                        }
                                    }
                                }
                                K = true;
                            } else {
                                e0 d16 = lVar.d(I);
                                if (!(I instanceof ba.b)) {
                                    if (lVar.Q(d16)) {
                                        Collection<ba.f> y12 = lVar.y(d16);
                                        if (!(y12 instanceof Collection) || !y12.isEmpty()) {
                                            for (ba.f fVar8 : y12) {
                                                if (!(fVar8 instanceof ba.b)) {
                                                    z14 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        z14 = true;
                                    }
                                    bool = null;
                                    if (bool != null) {
                                    }
                                }
                                ba.k f12 = f(lVar, l02, I);
                                if (f12 != null && lVar.i0(f12, lVar.d(l02))) {
                                    bool = Boolean.TRUE;
                                    if (bool != null) {
                                    }
                                }
                                bool = null;
                                if (bool != null) {
                                }
                            }
                        }
                        bool = Boolean.valueOf(z16);
                        if (bool != null) {
                        }
                    }
                    bool = Boolean.valueOf(K);
                    if (bool != null) {
                    }
                }
                if (!mVar.f15047a) {
                    if (!lVar.a0(I) || lVar.a0(l02)) {
                        v a12 = lVar.a(I, false);
                        v a13 = lVar.a(l02, false);
                        v7.g.f(a12, "a");
                        v7.g.f(a13, "b");
                        K = v8.b.K(lVar, a12, a13);
                        bool = Boolean.valueOf(K);
                        if (bool != null) {
                        }
                    } else {
                        bool = Boolean.FALSE;
                        if (bool != null) {
                        }
                    }
                }
                bool = Boolean.TRUE;
                if (bool != null) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean j(ba.l lVar, ba.f fVar, ba.f fVar2, ba.j jVar) {
        i0 k02;
        v f10 = lVar.f(fVar);
        if (f10 instanceof ba.b) {
            ba.b bVar = (ba.b) f10;
            if (!lVar.j(bVar) && lVar.h(lVar.p(lVar.T(bVar))) && lVar.Z(bVar) == CaptureStatus.FOR_SUBTYPING) {
                e0 J = lVar.J(fVar2);
                ba.n nVar = J instanceof ba.n ? (ba.n) J : null;
                return (nVar == null || (k02 = lVar.k0(nVar)) == null || !lVar.i0(k02, jVar)) ? false : true;
            }
            return false;
        }
        return false;
    }
}
