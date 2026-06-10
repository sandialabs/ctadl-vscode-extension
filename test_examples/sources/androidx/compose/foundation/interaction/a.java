package androidx.compose.foundation.interaction;

import a1.c;
import g0.d;
import g0.g0;
import g0.s;
import u.i;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final g0 a(i iVar, d dVar, int i10) {
        g.f(iVar, "<this>");
        dVar.f(-1805515472);
        dVar.f(-492369756);
        Object g10 = dVar.g();
        if (g10 == d.a.f11039a) {
            g10 = c.V0(Boolean.FALSE);
            dVar.q(g10);
        }
        dVar.u();
        g0 g0Var = (g0) g10;
        s.c(iVar, new FocusInteractionKt$collectIsFocusedAsState$1(iVar, g0Var, null), dVar);
        dVar.u();
        return g0Var;
    }

    public static final g0 b(i iVar, d dVar, int i10) {
        g.f(iVar, "<this>");
        dVar.f(-1692965168);
        dVar.f(-492369756);
        Object g10 = dVar.g();
        if (g10 == d.a.f11039a) {
            g10 = c.V0(Boolean.FALSE);
            dVar.q(g10);
        }
        dVar.u();
        g0 g0Var = (g0) g10;
        s.c(iVar, new PressInteractionKt$collectIsPressedAsState$1(iVar, g0Var, null), dVar);
        dVar.u();
        return g0Var;
    }
}
