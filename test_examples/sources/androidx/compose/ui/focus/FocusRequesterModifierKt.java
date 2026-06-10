package androidx.compose.ui.focus;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import k1.h;
import m0.b;
import q0.d;
import t0.j;
import v7.g;

/* loaded from: classes.dex */
public final class FocusRequesterModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h<j> f3057a = b.R0(FocusRequesterModifierKt$ModifierLocalFocusRequester$1.f3058j);

    public static final d a(d dVar, FocusRequester focusRequester) {
        g.f(dVar, "<this>");
        g.f(focusRequester, "focusRequester");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new FocusRequesterModifierKt$focusRequester$2(focusRequester));
    }
}
