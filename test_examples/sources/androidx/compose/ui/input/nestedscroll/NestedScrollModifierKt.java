package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import f1.a;
import q0.d;
import v7.g;

/* loaded from: classes.dex */
public final class NestedScrollModifierKt {
    public static final d a(d dVar, a aVar, NestedScrollDispatcher nestedScrollDispatcher) {
        g.f(dVar, "<this>");
        g.f(aVar, "connection");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new NestedScrollModifierKt$nestedScroll$2(aVar, nestedScrollDispatcher));
    }
}
