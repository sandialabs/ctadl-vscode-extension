package androidx.compose.foundation;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import g0.d;
import g0.r0;
import g0.v0;
import j1.c;
import q0.a;
import q0.d;
import u7.l;
import v0.s;
import v7.g;

/* loaded from: classes.dex */
public final class ImageKt {
    public static final void a(y0.b bVar, String str, q0.d dVar, q0.a aVar, j1.c cVar, float f10, s sVar, g0.d dVar2, int i10, int i11) {
        g.f(bVar, "painter");
        ComposerImpl p10 = dVar2.p(1142754848);
        int i12 = i11 & 4;
        q0.d dVar3 = d.a.f16824i;
        q0.d dVar4 = i12 != 0 ? dVar3 : dVar;
        q0.b bVar2 = (i11 & 8) != 0 ? a.C0210a.c : aVar;
        c.a.C0135a c0135a = (i11 & 16) != 0 ? c.a.f12647a : cVar;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        s sVar2 = (i11 & 64) != 0 ? null : sVar;
        p10.f(-816794123);
        if (str != null) {
            p10.f(1157296644);
            boolean z10 = p10.z(str);
            Object a02 = p10.a0();
            if (z10 || a02 == d.a.f11039a) {
                a02 = new ImageKt$Image$semantics$1$1(str);
                p10.I0(a02);
            }
            p10.Q(false);
            dVar3 = m0.b.j1(dVar3, false, (l) a02);
        }
        p10.Q(false);
        q0.d f12 = a1.c.f1(a1.c.Z(dVar4.Z(dVar3)), bVar, bVar2, c0135a, f11, sVar2, 2);
        ImageKt$Image$2 imageKt$Image$2 = ImageKt$Image$2.f1529a;
        p10.f(-1323940314);
        b2.b bVar3 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(f12);
        if (p10.f2640a instanceof g0.c) {
            p10.r();
            if (p10.L) {
                p10.m(aVar2);
            } else {
                p10.n();
            }
            p10.f2661x = false;
            a1.c.s1(p10, imageKt$Image$2, ComposeUiNode.Companion.f3404e);
            a1.c.s1(p10, bVar3, ComposeUiNode.Companion.f3403d);
            a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
            p10.h();
            androidx.activity.e.o(0, a10, new v0(p10), p10, 2058660585, -2077995625);
            p10.Q(false);
            p10.Q(false);
            p10.Q(true);
            p10.Q(false);
            r0 T = p10.T();
            if (T == null) {
                return;
            }
            T.f11073d = new ImageKt$Image$3(bVar, str, dVar4, bVar2, c0135a, f11, sVar2, i10, i11);
            return;
        }
        a1.c.L0();
        throw null;
    }
}
