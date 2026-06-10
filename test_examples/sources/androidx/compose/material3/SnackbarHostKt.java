package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import e0.h;
import e0.m;
import g0.d;
import g0.k0;
import g0.r0;
import g0.s;
import g0.t0;
import g0.v0;
import g0.z0;
import java.util.ArrayList;
import java.util.Iterator;
import m7.n;
import n7.l;
import q0.a;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class SnackbarHostKt {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
        r6 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(m mVar, q0.d dVar, q<? super m, ? super g0.d, ? super Integer, n> qVar, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        Object obj;
        int i14;
        int i15;
        Object a02;
        boolean a10;
        boolean z10;
        q0.d dVar3;
        r0 T;
        ComposerImpl p10 = dVar2.p(-1316639904);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (p10.z(mVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj = dVar;
            if (p10.z(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i11 & 4) == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                if (p10.z(qVar)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
            }
            if ((i12 & 731) == 146 && p10.s()) {
                p10.e();
                dVar3 = obj;
                T = p10.T();
                if (T != null) {
                    T.f11073d = new SnackbarHostKt$FadeInFadeOutWithScale$3(mVar, dVar3, qVar, i10, i11);
                    return;
                }
                return;
            }
            q0.d dVar4 = obj;
            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            p10.f(-492369756);
            a02 = p10.a0();
            if (a02 == d.a.f11039a) {
                a02 = new h();
                p10.I0(a02);
            }
            p10.Q(false);
            h hVar = (h) a02;
            a10 = g.a(mVar, hVar.f10544a);
            ArrayList arrayList = hVar.f10545b;
            if (!a10) {
                hVar.f10544a = mVar;
                ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((m) ((e0.g) it.next()).f10542a);
                }
                ArrayList N2 = kotlin.collections.c.N2(arrayList2);
                if (!N2.contains(mVar)) {
                    N2.add(mVar);
                }
                arrayList.clear();
                Iterator it2 = kotlin.collections.c.l2(N2).iterator();
                while (it2.hasNext()) {
                    m mVar2 = (m) it2.next();
                    arrayList.add(new e0.g(mVar2, a1.c.i0(p10, 1365430839, new SnackbarHostKt$FadeInFadeOutWithScale$1$1(mVar2, mVar, N2, hVar))));
                }
            }
            int i17 = (i12 >> 3) & 14;
            p10.f(733328855);
            j1.q c = BoxKt.c(a.C0210a.f16812a, false, p10);
            p10.f(-1323940314);
            b2.b bVar = (b2.b) p10.w(CompositionLocalsKt.f3703e);
            LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
            j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
            ComposeUiNode.f3400a.getClass();
            u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
            ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(dVar4);
            int i18 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
            if (!(p10.f2640a instanceof g0.c)) {
                p10.r();
                if (p10.L) {
                    p10.m(aVar);
                } else {
                    p10.n();
                }
                p10.f2661x = false;
                a1.c.s1(p10, c, ComposeUiNode.Companion.f3404e);
                a1.c.s1(p10, bVar, ComposeUiNode.Companion.f3403d);
                a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
                a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
                p10.h();
                a11.O(new v0(p10), p10, Integer.valueOf((i18 >> 3) & 112));
                p10.f(2058660585);
                p10.f(-2137368960);
                if (((i18 >> 9) & 14 & 11) == 2 && p10.s()) {
                    p10.e();
                    z10 = false;
                    p10.Q(z10);
                    p10.Q(z10);
                    p10.Q(true);
                    p10.Q(z10);
                    p10.Q(z10);
                    q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                    dVar3 = dVar4;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                p10.f(393759974);
                if (((((i17 >> 6) & 112) | 6) & 81) == 16 && p10.s()) {
                    p10.e();
                    z10 = false;
                    p10.Q(false);
                    p10.Q(z10);
                    p10.Q(z10);
                    p10.Q(true);
                    p10.Q(z10);
                    p10.Q(z10);
                    q<g0.c<?>, z0, t0, n> qVar32 = ComposerKt.f2737a;
                    dVar3 = dVar4;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
                r0 W = p10.W();
                if (W != null) {
                    p10.A(W);
                    hVar.c = W;
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        e0.g gVar = (e0.g) it3.next();
                        m mVar3 = (m) gVar.f10542a;
                        p10.v0(870027402, mVar3);
                        gVar.f10543b.O(a1.c.i0(p10, -1462081411, new SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(qVar, mVar3, i12)), p10, 6);
                        p10.Q(false);
                    }
                    z10 = false;
                    p10.Q(false);
                    p10.Q(z10);
                    p10.Q(z10);
                    p10.Q(true);
                    p10.Q(z10);
                    p10.Q(z10);
                    q<g0.c<?>, z0, t0, n> qVar322 = ComposerKt.f2737a;
                    dVar3 = dVar4;
                    T = p10.T();
                    if (T != null) {
                    }
                } else {
                    throw new IllegalStateException("no recompose scope found".toString());
                }
            } else {
                a1.c.L0();
                throw null;
            }
        }
        obj = dVar;
        if ((i11 & 4) == 0) {
        }
        if ((i12 & 731) == 146) {
            p10.e();
            dVar3 = obj;
            T = p10.T();
            if (T != null) {
            }
        }
        q0.d dVar42 = obj;
        q<g0.c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
        p10.f(-492369756);
        a02 = p10.a0();
        if (a02 == d.a.f11039a) {
        }
        p10.Q(false);
        h hVar2 = (h) a02;
        a10 = g.a(mVar, hVar2.f10544a);
        ArrayList arrayList3 = hVar2.f10545b;
        if (!a10) {
        }
        int i172 = (i12 >> 3) & 14;
        p10.f(733328855);
        j1.q c10 = BoxKt.c(a.C0210a.f16812a, false, p10);
        p10.f(-1323940314);
        b2.b bVar2 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
        j1 j1Var2 = (j1) p10.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a112 = androidx.compose.ui.layout.a.a(dVar42);
        int i182 = ((((i172 << 3) & 112) << 9) & 7168) | 6;
        if (!(p10.f2640a instanceof g0.c)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
        r3 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(d dVar, q0.d dVar2, q<? super m, ? super g0.d, ? super Integer, n> qVar, g0.d dVar3, int i10, int i11) {
        int i12;
        int i13;
        q0.d dVar4;
        int i14;
        int i15;
        q<? super m, ? super g0.d, ? super Integer, n> qVar2;
        int i16;
        ComposableLambdaImpl composableLambdaImpl;
        q0.d dVar5;
        q<? super m, ? super g0.d, ? super Integer, n> qVar3;
        r0 T;
        g.f(dVar, "hostState");
        ComposerImpl p10 = dVar3.p(464178177);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (p10.z(dVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            dVar4 = dVar2;
            if (p10.z(dVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                qVar2 = qVar;
                if (p10.z(qVar)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                if ((i12 & 731) == 146 && p10.s()) {
                    p10.e();
                    dVar5 = dVar4;
                    qVar3 = qVar2;
                    T = p10.T();
                    if (T != null) {
                        T.f11073d = new SnackbarHostKt$SnackbarHost$2(dVar, dVar5, qVar3, i10, i11);
                        return;
                    }
                    return;
                }
                q0.d dVar6 = dVar4;
                if (i15 != 0) {
                    composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f2301a;
                } else {
                    composableLambdaImpl = qVar2;
                }
                q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
                k0 k0Var = dVar.f2607b;
                m mVar = (m) k0Var.getValue();
                s.c(mVar, new SnackbarHostKt$SnackbarHost$1(mVar, (androidx.compose.ui.platform.h) p10.w(CompositionLocalsKt.f3700a), null), p10);
                a((m) k0Var.getValue(), dVar6, composableLambdaImpl, p10, (i12 & 112) | (i12 & 896), 0);
                dVar5 = dVar6;
                qVar3 = composableLambdaImpl;
                T = p10.T();
                if (T != null) {
                }
            }
            qVar2 = qVar;
            if ((i12 & 731) == 146) {
                p10.e();
                dVar5 = dVar4;
                qVar3 = qVar2;
                T = p10.T();
                if (T != null) {
                }
            }
            q0.d dVar62 = dVar4;
            if (i15 != 0) {
            }
            q<g0.c<?>, z0, t0, n> qVar42 = ComposerKt.f2737a;
            k0 k0Var2 = dVar.f2607b;
            m mVar2 = (m) k0Var2.getValue();
            s.c(mVar2, new SnackbarHostKt$SnackbarHost$1(mVar2, (androidx.compose.ui.platform.h) p10.w(CompositionLocalsKt.f3700a), null), p10);
            a((m) k0Var2.getValue(), dVar62, composableLambdaImpl, p10, (i12 & 112) | (i12 & 896), 0);
            dVar5 = dVar62;
            qVar3 = composableLambdaImpl;
            T = p10.T();
            if (T != null) {
            }
        }
        dVar4 = dVar2;
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        qVar2 = qVar;
        if ((i12 & 731) == 146) {
        }
        q0.d dVar622 = dVar4;
        if (i15 != 0) {
        }
        q<g0.c<?>, z0, t0, n> qVar422 = ComposerKt.f2737a;
        k0 k0Var22 = dVar.f2607b;
        m mVar22 = (m) k0Var22.getValue();
        s.c(mVar22, new SnackbarHostKt$SnackbarHost$1(mVar22, (androidx.compose.ui.platform.h) p10.w(CompositionLocalsKt.f3700a), null), p10);
        a((m) k0Var22.getValue(), dVar622, composableLambdaImpl, p10, (i12 & 112) | (i12 & 896), 0);
        dVar5 = dVar622;
        qVar3 = composableLambdaImpl;
        T = p10.T();
        if (T != null) {
        }
    }
}
