package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import g0.d;
import g0.r0;
import g0.v0;
import j1.b0;
import j1.p;
import j1.q;
import q0.a;
import q0.d;
import v7.g;

/* loaded from: classes.dex */
public final class BoxKt {

    /* renamed from: a  reason: collision with root package name */
    public static final BoxKt$boxMeasurePolicy$1 f1886a = new BoxKt$boxMeasurePolicy$1(a.C0210a.f16812a, false);

    /* renamed from: b  reason: collision with root package name */
    public static final BoxKt$EmptyBoxMeasurePolicy$1 f1887b = BoxKt$EmptyBoxMeasurePolicy$1.f1890a;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(d dVar, g0.d dVar2, int i10) {
        int i11;
        r0 T;
        int i12;
        g.f(dVar, "modifier");
        ComposerImpl p10 = dVar2.p(-211209833);
        if ((i10 & 14) == 0) {
            if (p10.z(dVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T == null) {
                T.f11073d = new BoxKt$Box$3(dVar, i10);
                return;
            }
            return;
        }
        p10.f(-1323940314);
        b2.b bVar = (b2.b) p10.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(dVar);
        int i13 = (((((i11 << 3) & 112) | 384) << 9) & 7168) | 6;
        if (p10.f2640a instanceof g0.c) {
            p10.r();
            if (p10.L) {
                p10.m(aVar);
            } else {
                p10.n();
            }
            p10.f2661x = false;
            a1.c.s1(p10, f1887b, ComposeUiNode.Companion.f3404e);
            a1.c.s1(p10, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
            p10.h();
            a10.O(new v0(p10), p10, Integer.valueOf((i13 >> 3) & 112));
            p10.f(2058660585);
            p10.f(1021196736);
            if (((i13 >> 9) & 14 & 11) == 2 && p10.s()) {
                p10.e();
            }
            p10.Q(false);
            p10.Q(false);
            p10.Q(true);
            p10.Q(false);
            T = p10.T();
            if (T == null) {
            }
        } else {
            a1.c.L0();
            throw null;
        }
    }

    public static final void b(b0.a aVar, b0 b0Var, p pVar, LayoutDirection layoutDirection, int i10, int i11, q0.a aVar2) {
        v.b bVar;
        q0.a aVar3;
        q0.a aVar4;
        Object n = pVar.n();
        if (n instanceof v.b) {
            bVar = (v.b) n;
        } else {
            bVar = null;
        }
        if (bVar != null && (aVar4 = bVar.f18045j) != null) {
            aVar3 = aVar4;
            long a10 = aVar3.a(v8.b.f(b0Var.f12640i, b0Var.f12641j), v8.b.f(i10, i11), layoutDirection);
            b0.a.C0134a c0134a = b0.a.f12644a;
            aVar.getClass();
            b0.a.d(b0Var, a10, 0.0f);
        }
        aVar3 = aVar2;
        long a102 = aVar3.a(v8.b.f(b0Var.f12640i, b0Var.f12641j), v8.b.f(i10, i11), layoutDirection);
        b0.a.C0134a c0134a2 = b0.a.f12644a;
        aVar.getClass();
        b0.a.d(b0Var, a102, 0.0f);
    }

    public static final q c(q0.b bVar, boolean z10, g0.d dVar) {
        q qVar;
        dVar.f(56522820);
        if (g.a(bVar, a.C0210a.f16812a) && !z10) {
            qVar = f1886a;
        } else {
            Boolean valueOf = Boolean.valueOf(z10);
            dVar.f(511388516);
            boolean z11 = dVar.z(valueOf) | dVar.z(bVar);
            Object g10 = dVar.g();
            if (z11 || g10 == d.a.f11039a) {
                g10 = new BoxKt$boxMeasurePolicy$1(bVar, z10);
                dVar.q(g10);
            }
            dVar.u();
            qVar = (q) g10;
        }
        dVar.u();
        return qVar;
    }
}
