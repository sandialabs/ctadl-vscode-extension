package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.m0;
import k1.h;
import u.j;
import v7.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f1598a = new m0(InspectableValueKt.f3744a);

    public static final q0.d a() {
        m0 m0Var = f1598a;
        g.f(m0Var, "other");
        FocusableKt$focusGroup$1 focusableKt$focusGroup$1 = FocusableKt$focusGroup$1.f1468j;
        h<t0.h> hVar = FocusPropertiesKt.f3049a;
        g.f(focusableKt$focusGroup$1, "scope");
        return FocusModifierKt.a(m0Var.Z(new t0.h(focusableKt$focusGroup$1, InspectableValueKt.f3744a)));
    }

    public static final q0.d b(j jVar, q0.d dVar, boolean z10) {
        g.f(dVar, "<this>");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new FocusableKt$focusableInNonTouchMode$2(jVar, z10));
    }
}
