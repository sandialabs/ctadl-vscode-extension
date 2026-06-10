package androidx.compose.foundation.selection;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.state.ToggleableState;
import m7.n;
import o1.g;
import q0.d;
import u.j;
import u7.l;

/* loaded from: classes.dex */
public final class b {
    public static final d a(boolean z10, j jVar, boolean z11, g gVar, l lVar) {
        ToggleableState toggleableState;
        d.a aVar = d.a.f16824i;
        v7.g.f(jVar, "interactionSource");
        v7.g.f(lVar, "onValueChange");
        l<n0, n> lVar2 = InspectableValueKt.f3744a;
        if (z10) {
            toggleableState = ToggleableState.On;
        } else {
            toggleableState = ToggleableState.Off;
        }
        return InspectableValueKt.a(aVar, lVar2, ComposedModifierKt.a(aVar, lVar2, new ToggleableKt$toggleableImpl$1(new ToggleableKt$toggleable$4$1(lVar, z10), z11, jVar, gVar, toggleableState)));
    }
}
