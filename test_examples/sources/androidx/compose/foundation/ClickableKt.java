package androidx.compose.foundation;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import g0.d;
import g0.g0;
import g0.g1;
import g0.r0;
import g0.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import q0.d;
import u.j;
import u.m;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class ClickableKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(j jVar, g0<m> g0Var, g0.d dVar, int i10) {
        int i11;
        r0 T;
        int i12;
        int i13;
        g.f(jVar, "interactionSource");
        g.f(g0Var, "pressedInteraction");
        ComposerImpl p10 = dVar.p(1761107222);
        if ((i10 & 14) == 0) {
            if (p10.z(jVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (p10.z(g0Var)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T == null) {
                T.f11073d = new ClickableKt$PressedInteractionSourceDisposableEffect$2(jVar, g0Var, i10);
                return;
            }
            return;
        }
        p10.f(511388516);
        boolean z10 = p10.z(g0Var) | p10.z(jVar);
        Object a02 = p10.a0();
        if (z10 || a02 == d.a.f11039a) {
            a02 = new ClickableKt$PressedInteractionSourceDisposableEffect$1$1(g0Var, jVar);
            p10.I0(a02);
        }
        p10.Q(false);
        s.a(jVar, (l) a02, p10);
        T = p10.T();
        if (T == null) {
        }
    }

    public static final q0.d b(q0.d dVar, j jVar, s.m mVar, boolean z10, String str, o1.g gVar, u7.a<n> aVar) {
        g.f(dVar, "$this$clickable");
        g.f(jVar, "interactionSource");
        g.f(aVar, "onClick");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new ClickableKt$clickable$4(mVar, jVar, gVar, str, aVar, z10));
    }

    public static /* synthetic */ q0.d c(q0.d dVar, j jVar, d0.b bVar, boolean z10, o1.g gVar, u7.a aVar, int i10) {
        boolean z11 = (i10 & 4) != 0 ? true : z10;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return b(dVar, jVar, bVar, z11, null, gVar, aVar);
    }

    public static q0.d d(u7.a aVar) {
        d.a aVar2 = d.a.f16824i;
        g.f(aVar, "onClick");
        return ComposedModifierKt.a(aVar2, InspectableValueKt.f3744a, new ClickableKt$clickable$2(true, null, null, aVar));
    }

    public static final Object e(t.g gVar, long j2, j jVar, g0<m> g0Var, g1<? extends u7.a<Boolean>> g1Var, p7.c<? super n> cVar) {
        Object H = a1.b.H(new ClickableKt$handlePressInteraction$2(gVar, j2, jVar, g0Var, g1Var, null), cVar);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : n.f16010a;
    }
}
