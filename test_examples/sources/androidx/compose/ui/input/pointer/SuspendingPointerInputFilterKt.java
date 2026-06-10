package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import g1.k;
import g1.v;
import kotlin.collections.EmptyList;
import m7.n;
import p7.c;
import q0.d;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {

    /* renamed from: a  reason: collision with root package name */
    public static final k f3292a = new k(EmptyList.f12981i);

    public static final d a(d dVar, Object obj, Object obj2, p<? super v, ? super c<? super n>, ? extends Object> pVar) {
        g.f(dVar, "<this>");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new SuspendingPointerInputFilterKt$pointerInput$4(obj, obj2, pVar));
    }

    public static final d b(d dVar, Object obj, p<? super v, ? super c<? super n>, ? extends Object> pVar) {
        g.f(dVar, "<this>");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new SuspendingPointerInputFilterKt$pointerInput$2(obj, pVar));
    }

    public static final d c(Object[] objArr, p pVar) {
        return ComposedModifierKt.a(d.a.f16824i, InspectableValueKt.f3744a, new SuspendingPointerInputFilterKt$pointerInput$6(objArr, pVar));
    }
}
