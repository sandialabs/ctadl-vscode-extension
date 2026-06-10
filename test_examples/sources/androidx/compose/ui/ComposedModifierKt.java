package androidx.compose.ui;

import androidx.compose.ui.platform.n0;
import g0.d;
import m7.n;
import q0.c;
import q0.d;
import t0.b;
import t0.i;
import u7.l;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class ComposedModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final q<b, d, Integer, q0.d> f2988a = ComposedModifierKt$WrapFocusEventModifier$1.f2990j;

    /* renamed from: b  reason: collision with root package name */
    public static final q<i, d, Integer, q0.d> f2989b = ComposedModifierKt$WrapFocusRequesterModifier$1.f2992j;

    public static final q0.d a(q0.d dVar, l<? super n0, n> lVar, q<? super q0.d, ? super d, ? super Integer, ? extends q0.d> qVar) {
        g.f(dVar, "<this>");
        g.f(lVar, "inspectorInfo");
        g.f(qVar, "factory");
        return dVar.Z(new c(lVar, qVar));
    }

    public static final q0.d b(d dVar, q0.d dVar2) {
        g.f(dVar, "<this>");
        g.f(dVar2, "modifier");
        if (dVar2.x(ComposedModifierKt$materialize$1.f2993j)) {
            return dVar2;
        }
        dVar.f(1219399079);
        int i10 = q0.d.f16823g;
        q0.d dVar3 = (q0.d) dVar2.h0(d.a.f16824i, new ComposedModifierKt$materialize$result$1(dVar));
        dVar.u();
        return dVar3;
    }
}
