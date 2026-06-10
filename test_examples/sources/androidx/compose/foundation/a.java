package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import f0.i;
import v0.h0;
import v0.i0;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final q0.d a(q0.d dVar, i0 i0Var, h0 h0Var) {
        float f10 = i.f10820a;
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new BorderKt$border$2(i0Var, h0Var));
    }

    public static final ScrollState b(g0.d dVar) {
        dVar.f(-1464256199);
        ScrollState scrollState = (ScrollState) androidx.compose.runtime.saveable.a.a(new Object[0], ScrollState.f1580f, new ScrollKt$rememberScrollState$1(0), dVar);
        dVar.u();
        return scrollState;
    }

    public static final long c(float f10, long j2) {
        return a1.c.m(Math.max(0.0f, u0.a.b(j2) - f10), Math.max(0.0f, u0.a.c(j2) - f10));
    }

    public static q0.d d(q0.d dVar, ScrollState scrollState) {
        g.f(dVar, "<this>");
        g.f(scrollState, "state");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new ScrollKt$scroll$2(scrollState, null, true, false));
    }
}
