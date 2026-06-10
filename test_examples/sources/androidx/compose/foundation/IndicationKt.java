package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import g0.h1;
import s.m;
import u.i;
import v7.g;

/* loaded from: classes.dex */
public final class IndicationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f1540a = CompositionLocalKt.c(IndicationKt$LocalIndication$1.f1541j);

    public static final q0.d a(q0.d dVar, i iVar, m mVar) {
        g.f(dVar, "<this>");
        g.f(iVar, "interactionSource");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new IndicationKt$indication$2(mVar, iVar));
    }
}
