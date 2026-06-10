package androidx.compose.foundation.gestures;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.platform.InspectableValueKt;
import g0.g1;
import g1.o;
import h1.e;
import ja.x;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import m7.n;
import q0.d;
import t.a;
import t.f;
import u.j;
import u7.l;
import u7.q;
import v0.p;
import v7.g;

/* loaded from: classes.dex */
public final class DraggableKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(g1.c cVar, g1 g1Var, g1 g1Var2, e eVar, Orientation orientation, p7.c cVar2) {
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$1;
        int i10;
        o oVar;
        g1.c cVar3;
        e eVar2;
        Orientation orientation2;
        Object c;
        Ref$FloatRef ref$FloatRef;
        o oVar2;
        if (cVar2 instanceof DraggableKt$awaitDownAndSlop$1) {
            draggableKt$awaitDownAndSlop$1 = (DraggableKt$awaitDownAndSlop$1) cVar2;
            int i11 = draggableKt$awaitDownAndSlop$1.f1700r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                draggableKt$awaitDownAndSlop$1.f1700r = i11 - Integer.MIN_VALUE;
                DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                Object obj = draggableKt$awaitDownAndSlop$12.f1699q;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = draggableKt$awaitDownAndSlop$12.f1700r;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3 && i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ref$FloatRef = (Ref$FloatRef) draggableKt$awaitDownAndSlop$12.f1695l;
                            m0.b.n1(obj);
                            oVar2 = (o) obj;
                            if (oVar2 != null) {
                                return new Pair(oVar2, new Float(ref$FloatRef.f13057i));
                            }
                            return null;
                        }
                        orientation2 = (Orientation) draggableKt$awaitDownAndSlop$12.n;
                        eVar2 = (e) draggableKt$awaitDownAndSlop$12.f1696m;
                        cVar3 = (g1.c) draggableKt$awaitDownAndSlop$12.f1695l;
                        m0.b.n1(obj);
                        o oVar3 = (o) obj;
                        p.e(eVar2, oVar3);
                        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$1 = new DraggableKt$awaitDownAndSlop$postPointerSlop$1(eVar2, ref$FloatRef2);
                        if (orientation2 != Orientation.Vertical) {
                            long j2 = oVar3.f11162a;
                            int i12 = oVar3.f11168h;
                            draggableKt$awaitDownAndSlop$12.f1695l = ref$FloatRef2;
                            draggableKt$awaitDownAndSlop$12.f1696m = null;
                            draggableKt$awaitDownAndSlop$12.n = null;
                            draggableKt$awaitDownAndSlop$12.f1700r = 3;
                            c = DragGestureDetectorKt.d(cVar3, j2, i12, draggableKt$awaitDownAndSlop$postPointerSlop$1, draggableKt$awaitDownAndSlop$12);
                            if (c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            long j10 = oVar3.f11162a;
                            int i13 = oVar3.f11168h;
                            draggableKt$awaitDownAndSlop$12.f1695l = ref$FloatRef2;
                            draggableKt$awaitDownAndSlop$12.f1696m = null;
                            draggableKt$awaitDownAndSlop$12.n = null;
                            draggableKt$awaitDownAndSlop$12.f1700r = 4;
                            c = DragGestureDetectorKt.c(cVar3, j10, i13, draggableKt$awaitDownAndSlop$postPointerSlop$1, draggableKt$awaitDownAndSlop$12);
                            if (c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        obj = c;
                        ref$FloatRef = ref$FloatRef2;
                        oVar2 = (o) obj;
                        if (oVar2 != null) {
                        }
                        return null;
                    }
                    orientation = draggableKt$awaitDownAndSlop$12.f1698p;
                    eVar = draggableKt$awaitDownAndSlop$12.f1697o;
                    g1Var2 = (g1) draggableKt$awaitDownAndSlop$12.n;
                    g1Var = (g1) draggableKt$awaitDownAndSlop$12.f1696m;
                    cVar = (g1.c) draggableKt$awaitDownAndSlop$12.f1695l;
                    m0.b.n1(obj);
                } else {
                    m0.b.n1(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    draggableKt$awaitDownAndSlop$12.f1695l = cVar;
                    draggableKt$awaitDownAndSlop$12.f1696m = g1Var;
                    draggableKt$awaitDownAndSlop$12.n = g1Var2;
                    draggableKt$awaitDownAndSlop$12.f1697o = eVar;
                    draggableKt$awaitDownAndSlop$12.f1698p = orientation;
                    draggableKt$awaitDownAndSlop$12.f1700r = 1;
                    obj = TapGestureDetectorKt.a(cVar, pointerEventPass, false, draggableKt$awaitDownAndSlop$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                oVar = (o) obj;
                if (!((Boolean) ((l) g1Var.getValue()).U(oVar)).booleanValue()) {
                    return null;
                }
                if (((Boolean) ((u7.a) g1Var2.getValue()).k0()).booleanValue()) {
                    oVar.a();
                    p.e(eVar, oVar);
                    return new Pair(oVar, new Float(0.0f));
                }
                draggableKt$awaitDownAndSlop$12.f1695l = cVar;
                draggableKt$awaitDownAndSlop$12.f1696m = eVar;
                draggableKt$awaitDownAndSlop$12.n = orientation;
                draggableKt$awaitDownAndSlop$12.f1697o = null;
                draggableKt$awaitDownAndSlop$12.f1698p = null;
                draggableKt$awaitDownAndSlop$12.f1700r = 2;
                obj = TapGestureDetectorKt.a(cVar, PointerEventPass.Main, false, draggableKt$awaitDownAndSlop$12);
                if (obj != coroutineSingletons) {
                    cVar3 = cVar;
                    eVar2 = eVar;
                    orientation2 = orientation;
                    o oVar32 = (o) obj;
                    p.e(eVar2, oVar32);
                    Ref$FloatRef ref$FloatRef22 = new Ref$FloatRef();
                    DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$12 = new DraggableKt$awaitDownAndSlop$postPointerSlop$1(eVar2, ref$FloatRef22);
                    if (orientation2 != Orientation.Vertical) {
                    }
                    obj = c;
                    ref$FloatRef = ref$FloatRef22;
                    oVar2 = (o) obj;
                    if (oVar2 != null) {
                    }
                    return null;
                }
                return coroutineSingletons;
            }
        }
        draggableKt$awaitDownAndSlop$1 = new DraggableKt$awaitDownAndSlop$1(cVar2);
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$122 = draggableKt$awaitDownAndSlop$1;
        Object obj2 = draggableKt$awaitDownAndSlop$122.f1699q;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = draggableKt$awaitDownAndSlop$122.f1700r;
        if (i10 == 0) {
        }
        oVar = (o) obj2;
        if (!((Boolean) ((l) g1Var.getValue()).U(oVar)).booleanValue()) {
        }
    }

    public static final Object b(g1.c cVar, Pair pair, e eVar, la.c cVar2, boolean z10, Orientation orientation, p7.c cVar3) {
        long s10;
        float b5;
        float floatValue = ((Number) pair.f12963j).floatValue();
        o oVar = (o) pair.f12962i;
        Orientation orientation2 = Orientation.Vertical;
        if (orientation == orientation2) {
            s10 = a1.c.s(0.0f, floatValue);
        } else {
            s10 = a1.c.s(floatValue, 0.0f);
        }
        long j2 = oVar.c;
        if (orientation == orientation2) {
            b5 = u0.c.c(j2);
        } else {
            b5 = u0.c.b(j2);
        }
        long e10 = u0.c.e(j2, u0.c.g(Math.signum(b5), s10));
        cVar2.F(new a.c(e10));
        if (z10) {
            floatValue *= -1;
        }
        cVar2.F(new a.b(floatValue, e10));
        DraggableKt$awaitDrag$dragTick$1 draggableKt$awaitDrag$dragTick$1 = new DraggableKt$awaitDrag$dragTick$1(eVar, orientation, cVar2, z10);
        long j10 = oVar.f11162a;
        if (orientation == orientation2) {
            return DragGestureDetectorKt.i(cVar, j10, draggableKt$awaitDrag$dragTick$1, cVar3);
        }
        return DragGestureDetectorKt.g(cVar, j10, draggableKt$awaitDrag$dragTick$1, cVar3);
    }

    public static final d c(d dVar, u7.p<? super g0.d, ? super Integer, ? extends f> pVar, l<? super o, Boolean> lVar, Orientation orientation, boolean z10, j jVar, u7.a<Boolean> aVar, q<? super x, ? super u0.c, ? super p7.c<? super n>, ? extends Object> qVar, q<? super x, ? super Float, ? super p7.c<? super n>, ? extends Object> qVar2, boolean z11) {
        g.f(dVar, "<this>");
        g.f(lVar, "canDrag");
        g.f(qVar, "onDragStarted");
        g.f(qVar2, "onDragStopped");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, new DraggableKt$draggable$9(orientation, jVar, aVar, lVar, pVar, qVar, qVar2, z10, z11));
    }
}
