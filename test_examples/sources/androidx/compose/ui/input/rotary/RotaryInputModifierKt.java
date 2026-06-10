package androidx.compose.ui.input.rotary;

import androidx.compose.ui.platform.InspectableValueKt;
import d1.a;
import k1.h;
import m0.b;
import q0.d;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class RotaryInputModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h<a<i1.a>> f3309a = b.R0(RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1.f3310j);

    public static final d a(l lVar) {
        d.a aVar = d.a.f16824i;
        g.f(lVar, "onRotaryScrollEvent");
        return InspectableValueKt.a(aVar, InspectableValueKt.f3744a, new a(new RotaryInputModifierKt$focusAwareCallback$1(lVar), f3309a));
    }
}
