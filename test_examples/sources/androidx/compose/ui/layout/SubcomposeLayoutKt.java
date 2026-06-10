package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import g0.d;
import g0.g0;
import g0.r0;
import g0.s;
import g0.t0;
import g0.z0;
import j1.f0;
import j1.r;
import m7.n;
import q0.d;
import u7.l;
import u7.p;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class SubcomposeLayoutKt {
    public static final void a(c cVar, d dVar, p<? super f0, ? super b2.a, ? extends r> pVar, g0.d dVar2, int i10, int i11) {
        g.f(cVar, "state");
        g.f(pVar, "measurePolicy");
        ComposerImpl p10 = dVar2.p(-511989831);
        if ((i11 & 2) != 0) {
            dVar = d.a.f16824i;
        }
        d dVar3 = dVar;
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        p10.f(-1165786124);
        ComposerImpl.b F = p10.F();
        p10.u();
        d b5 = ComposedModifierKt.b(p10, dVar3);
        b2.b bVar = (b2.b) p10.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
        u7.a<LayoutNode> aVar = LayoutNode.T;
        p10.f(1886828752);
        if (p10.f2640a instanceof g0.c) {
            p10.w0();
            if (p10.L) {
                p10.m(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(aVar));
            } else {
                p10.n();
            }
            a1.c.s1(p10, cVar, cVar.c);
            a1.c.s1(p10, F, cVar.f3365d);
            a1.c.s1(p10, pVar, cVar.f3366e);
            ComposeUiNode.f3400a.getClass();
            a1.c.s1(p10, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
            a1.c.s1(p10, b5, ComposeUiNode.Companion.c);
            p10.Q(true);
            p10.Q(false);
            p10.f(-607848778);
            if (!p10.s()) {
                s.d(new SubcomposeLayoutKt$SubcomposeLayout$4(cVar), p10);
            }
            p10.Q(false);
            g0 l12 = a1.c.l1(cVar, p10);
            n nVar = n.f16010a;
            p10.f(1157296644);
            boolean z10 = p10.z(l12);
            Object a02 = p10.a0();
            if (z10 || a02 == d.a.f11039a) {
                a02 = new SubcomposeLayoutKt$SubcomposeLayout$5$1(l12);
                p10.I0(a02);
            }
            p10.Q(false);
            s.a(nVar, (l) a02, p10);
            r0 T = p10.T();
            if (T != null) {
                T.f11073d = new SubcomposeLayoutKt$SubcomposeLayout$6(cVar, dVar3, pVar, i10, i11);
                return;
            }
            return;
        }
        a1.c.L0();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        r7 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q0.d dVar, p<? super f0, ? super b2.a, ? extends r> pVar, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        r0 T;
        g.f(pVar, "measurePolicy");
        ComposerImpl p10 = dVar2.p(-1298353104);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (p10.z(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T == null) {
                T.f11073d = new SubcomposeLayoutKt$SubcomposeLayout$2(dVar, pVar, i10, i11);
                return;
            }
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        p10.f(-492369756);
        Object a02 = p10.a0();
        if (a02 == d.a.f11039a) {
            a02 = new c();
            p10.I0(a02);
        }
        p10.Q(false);
        int i16 = i12 << 3;
        a((c) a02, dVar, pVar, p10, (i16 & 112) | 8 | (i16 & 896), 0);
        T = p10.T();
        if (T == null) {
        }
    }
}
