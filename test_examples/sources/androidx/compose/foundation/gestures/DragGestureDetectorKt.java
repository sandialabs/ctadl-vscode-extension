package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.platform.j1;
import g1.k;
import g1.n;
import g1.o;
import g1.v;
import ja.o1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import u7.l;
import v0.p;
import v7.g;

/* loaded from: classes.dex */
public final class DragGestureDetectorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f1622a = ((float) 0.125d) / 18;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(v vVar, o oVar, p7.c cVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i10;
        Ref$ObjectRef ref$ObjectRef;
        o oVar2;
        o oVar3;
        if (cVar instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) cVar;
            int i11 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1635o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1635o = i11 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1635o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ref$ObjectRef = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1634m;
                        o oVar4 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1633l;
                        try {
                            m0.b.n1(obj);
                        } catch (TimeoutCancellationException unused) {
                            oVar2 = oVar4;
                            oVar3 = (o) ref$ObjectRef.f13060i;
                            if (oVar3 != null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef3.f13060i = oVar;
                    long a10 = vVar.getViewConfiguration().a();
                    try {
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(vVar, ref$ObjectRef3, ref$ObjectRef2, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1633l = oVar;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1634m = ref$ObjectRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1635o = 1;
                        if (a10 > 0) {
                            if (TimeoutKt.a(new o1(a10, dragGestureDetectorKt$awaitLongPressOrCancellation$1), dragGestureDetectorKt$awaitLongPressOrCancellation$2) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            throw new TimeoutCancellationException("Timed out immediately", null);
                        }
                    } catch (TimeoutCancellationException unused2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        oVar2 = oVar;
                        oVar3 = (o) ref$ObjectRef.f13060i;
                        if (oVar3 != null) {
                            return oVar2;
                        }
                        return oVar3;
                    }
                }
                return null;
            }
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(cVar);
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f1635o;
        if (i10 == 0) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
        if ((!u0.c.a(v0.p.C(r11, true), u0.c.f17721b)) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0061 -> B:22:0x0066). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g1.c cVar, long j2, p7.c<? super o> cVar2) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i10;
        Ref$LongRef ref$LongRef;
        g1.c cVar3;
        Object A;
        o oVar;
        o oVar2;
        if (cVar2 instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) cVar2;
            int i11 = dragGestureDetectorKt$awaitDragOrCancellation$1.f1625o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.f1625o = i11 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragGestureDetectorKt$awaitDragOrCancellation$1.f1625o;
                boolean z10 = true;
                if (i10 == 0) {
                    if (i10 == 1) {
                        Ref$LongRef ref$LongRef2 = dragGestureDetectorKt$awaitDragOrCancellation$1.f1624m;
                        g1.c cVar4 = dragGestureDetectorKt$awaitDragOrCancellation$1.f1623l;
                        m0.b.n1(obj);
                        Ref$LongRef ref$LongRef3 = ref$LongRef2;
                        cVar3 = cVar4;
                        k kVar = (k) obj;
                        List<o> list = kVar.f11159a;
                        int size = list.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                oVar = list.get(i12);
                                if (n.a(oVar.f11162a, ref$LongRef3.f13059i)) {
                                    break;
                                }
                                i12++;
                            } else {
                                oVar = null;
                                break;
                            }
                        }
                        o oVar3 = oVar;
                        if (oVar3 == null) {
                            if (p.g(oVar3)) {
                                List<o> list2 = kVar.f11159a;
                                int size2 = list2.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        oVar2 = list2.get(i13);
                                        if (oVar2.f11164d) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        oVar2 = null;
                                        break;
                                    }
                                }
                                o oVar4 = oVar2;
                                if (oVar4 != null) {
                                    ref$LongRef3.f13059i = oVar4.f11162a;
                                    ref$LongRef = ref$LongRef3;
                                }
                            }
                            dragGestureDetectorKt$awaitDragOrCancellation$1.f1623l = cVar3;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.f1624m = ref$LongRef;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.f1625o = 1;
                            A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                            if (A != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Ref$LongRef ref$LongRef4 = ref$LongRef;
                            obj = A;
                            ref$LongRef3 = ref$LongRef4;
                            k kVar2 = (k) obj;
                            List<o> list3 = kVar2.f11159a;
                            int size3 = list3.size();
                            int i122 = 0;
                            while (true) {
                                if (i122 >= size3) {
                                }
                                i122++;
                            }
                            o oVar32 = oVar;
                            if (oVar32 == null) {
                                oVar32 = null;
                            }
                        }
                        if (oVar32 == null || oVar32.b()) {
                            z10 = false;
                        }
                        if (!z10) {
                            return null;
                        }
                        return oVar32;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0.b.n1(obj);
                if (h(cVar.C(), j2)) {
                    return null;
                }
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.f13059i = j2;
                cVar3 = cVar;
                dragGestureDetectorKt$awaitDragOrCancellation$1.f1623l = cVar3;
                dragGestureDetectorKt$awaitDragOrCancellation$1.f1624m = ref$LongRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.f1625o = 1;
                A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                if (A != coroutineSingletons) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(cVar2);
        Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragGestureDetectorKt$awaitDragOrCancellation$1.f1625o;
        boolean z102 = true;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
        if (r5.b() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0106 -> B:65:0x0142). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0137 -> B:62:0x013a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0161 -> B:66:0x0145). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(g1.c cVar, long j2, int i10, u7.p<? super o, ? super Float, m7.n> pVar, p7.c<? super o> cVar2) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i11;
        boolean z10;
        g1.c cVar3;
        u7.p<? super o, ? super Float, m7.n> pVar2;
        Ref$LongRef ref$LongRef;
        CoroutineSingletons coroutineSingletons;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f10;
        float f11;
        u7.p<? super o, ? super Float, m7.n> pVar3;
        g1.c cVar4;
        float f12;
        float f13;
        o oVar;
        o oVar2;
        o oVar3;
        Object A;
        if (cVar2 instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) cVar2;
            int i12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1632s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1632s = i12 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1631r;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1632s;
                o oVar4 = null;
                int i13 = 1;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            f13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1630q;
                            f12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1629p;
                            oVar2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1628o;
                            ref$LongRef = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.n;
                            cVar4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1627m;
                            pVar3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1626l;
                            m0.b.n1(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1630q;
                        f12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1629p;
                        Ref$LongRef ref$LongRef2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.n;
                        g1.c cVar5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1627m;
                        u7.p<? super o, ? super Float, m7.n> pVar4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1626l;
                        m0.b.n1(obj);
                        pVar3 = pVar4;
                        cVar4 = cVar5;
                        ref$LongRef = ref$LongRef2;
                        k kVar = (k) obj;
                        List<o> list = kVar.f11159a;
                        int size = list.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size) {
                                oVar = list.get(i14);
                                if (n.a(oVar.f11162a, ref$LongRef.f13059i)) {
                                    break;
                                }
                                i14++;
                            } else {
                                oVar = null;
                                break;
                            }
                        }
                        oVar2 = oVar;
                        if (oVar2 != null && !oVar2.b()) {
                            if (!p.g(oVar2)) {
                                List<o> list2 = kVar.f11159a;
                                int size2 = list2.size();
                                int i15 = 0;
                                while (true) {
                                    if (i15 < size2) {
                                        oVar3 = list2.get(i15);
                                        if (oVar3.f11164d) {
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        oVar3 = null;
                                        break;
                                    }
                                }
                                o oVar5 = oVar3;
                                if (oVar5 != null) {
                                    ref$LongRef.f13059i = oVar5.f11162a;
                                    f11 = f13;
                                    coroutineSingletons = coroutineSingletons2;
                                    cVar3 = cVar4;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                                    f10 = f12;
                                    pVar2 = pVar3;
                                    oVar4 = null;
                                    i13 = 1;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1626l = pVar2;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1627m = cVar3;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.n = ref$LongRef;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1628o = oVar4;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1629p = f10;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1630q = f11;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1632s = i13;
                                    A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12);
                                    if (A == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    pVar3 = pVar2;
                                    f12 = f10;
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                                    coroutineSingletons2 = coroutineSingletons;
                                    cVar4 = cVar3;
                                    f13 = f11;
                                    obj = A;
                                    k kVar2 = (k) obj;
                                    List<o> list3 = kVar2.f11159a;
                                    int size3 = list3.size();
                                    int i142 = 0;
                                    while (true) {
                                        if (i142 >= size3) {
                                        }
                                        i142++;
                                    }
                                    oVar2 = oVar;
                                    if (oVar2 != null) {
                                        if (!p.g(oVar2)) {
                                            f13 += u0.c.b(oVar2.c) - u0.c.b(oVar2.f11166f);
                                            if (Math.abs(f13) < f12) {
                                                PointerEventPass pointerEventPass = PointerEventPass.Final;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1626l = pVar3;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1627m = cVar4;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.n = ref$LongRef;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1628o = oVar2;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1629p = f12;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1630q = f13;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1632s = 2;
                                                if (cVar4.A(pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) == coroutineSingletons2) {
                                                    return coroutineSingletons2;
                                                }
                                            } else {
                                                pVar3.R(oVar2, new Float(f13 - (Math.signum(f13) * f12)));
                                                if (oVar2.b()) {
                                                    return oVar2;
                                                }
                                                coroutineSingletons = coroutineSingletons2;
                                                cVar3 = cVar4;
                                                f11 = 0.0f;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                                                f10 = f12;
                                                pVar2 = pVar3;
                                                oVar4 = null;
                                                i13 = 1;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1626l = pVar2;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1627m = cVar3;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.n = ref$LongRef;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1628o = oVar4;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1629p = f10;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1630q = f11;
                                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1632s = i13;
                                                A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12);
                                                if (A == coroutineSingletons) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    }
                } else {
                    m0.b.n1(obj);
                    if (h(cVar.C(), j2)) {
                        return null;
                    }
                    j1 viewConfiguration = cVar.getViewConfiguration();
                    g.f(viewConfiguration, "$this$pointerSlop");
                    if (i10 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float b5 = viewConfiguration.b();
                    if (z10) {
                        b5 *= f1622a;
                    }
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.f13059i = j2;
                    cVar3 = cVar;
                    pVar2 = pVar;
                    ref$LongRef = ref$LongRef3;
                    coroutineSingletons = coroutineSingletons2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f10 = b5;
                    f11 = 0.0f;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1626l = pVar2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1627m = cVar3;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.n = ref$LongRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1628o = oVar4;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1629p = f10;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1630q = f11;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f1632s = i13;
                    A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12);
                    if (A == coroutineSingletons) {
                    }
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(cVar2);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1631r;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f1632s;
        o oVar42 = null;
        int i132 = 1;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
        if (r5.b() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0106 -> B:65:0x0142). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0137 -> B:62:0x013a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0161 -> B:66:0x0145). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(g1.c cVar, long j2, int i10, u7.p<? super o, ? super Float, m7.n> pVar, p7.c<? super o> cVar2) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i11;
        boolean z10;
        g1.c cVar3;
        u7.p<? super o, ? super Float, m7.n> pVar2;
        Ref$LongRef ref$LongRef;
        CoroutineSingletons coroutineSingletons;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        float f10;
        float f11;
        u7.p<? super o, ? super Float, m7.n> pVar3;
        g1.c cVar4;
        float f12;
        float f13;
        o oVar;
        o oVar2;
        o oVar3;
        Object A;
        if (cVar2 instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) cVar2;
            int i12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1650s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1650s = i12 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1649r;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1650s;
                o oVar4 = null;
                int i13 = 1;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            f13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1648q;
                            f12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1647p;
                            oVar2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1646o;
                            ref$LongRef = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.n;
                            cVar4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1645m;
                            pVar3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1644l;
                            m0.b.n1(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1648q;
                        f12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1647p;
                        Ref$LongRef ref$LongRef2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.n;
                        g1.c cVar5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1645m;
                        u7.p<? super o, ? super Float, m7.n> pVar4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1644l;
                        m0.b.n1(obj);
                        pVar3 = pVar4;
                        cVar4 = cVar5;
                        ref$LongRef = ref$LongRef2;
                        k kVar = (k) obj;
                        List<o> list = kVar.f11159a;
                        int size = list.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size) {
                                oVar = list.get(i14);
                                if (n.a(oVar.f11162a, ref$LongRef.f13059i)) {
                                    break;
                                }
                                i14++;
                            } else {
                                oVar = null;
                                break;
                            }
                        }
                        oVar2 = oVar;
                        if (oVar2 != null && !oVar2.b()) {
                            if (!p.g(oVar2)) {
                                List<o> list2 = kVar.f11159a;
                                int size2 = list2.size();
                                int i15 = 0;
                                while (true) {
                                    if (i15 < size2) {
                                        oVar3 = list2.get(i15);
                                        if (oVar3.f11164d) {
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        oVar3 = null;
                                        break;
                                    }
                                }
                                o oVar5 = oVar3;
                                if (oVar5 != null) {
                                    ref$LongRef.f13059i = oVar5.f11162a;
                                    f11 = f13;
                                    coroutineSingletons = coroutineSingletons2;
                                    cVar3 = cVar4;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                                    f10 = f12;
                                    pVar2 = pVar3;
                                    oVar4 = null;
                                    i13 = 1;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1644l = pVar2;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1645m = cVar3;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.n = ref$LongRef;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1646o = oVar4;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1647p = f10;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1648q = f11;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1650s = i13;
                                    A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12);
                                    if (A == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    pVar3 = pVar2;
                                    f12 = f10;
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                                    coroutineSingletons2 = coroutineSingletons;
                                    cVar4 = cVar3;
                                    f13 = f11;
                                    obj = A;
                                    k kVar2 = (k) obj;
                                    List<o> list3 = kVar2.f11159a;
                                    int size3 = list3.size();
                                    int i142 = 0;
                                    while (true) {
                                        if (i142 >= size3) {
                                        }
                                        i142++;
                                    }
                                    oVar2 = oVar;
                                    if (oVar2 != null) {
                                        if (!p.g(oVar2)) {
                                            f13 += u0.c.c(oVar2.c) - u0.c.c(oVar2.f11166f);
                                            if (Math.abs(f13) < f12) {
                                                PointerEventPass pointerEventPass = PointerEventPass.Final;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1644l = pVar3;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1645m = cVar4;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.n = ref$LongRef;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1646o = oVar2;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1647p = f12;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1648q = f13;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1650s = 2;
                                                if (cVar4.A(pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) == coroutineSingletons2) {
                                                    return coroutineSingletons2;
                                                }
                                            } else {
                                                pVar3.R(oVar2, new Float(f13 - (Math.signum(f13) * f12)));
                                                if (oVar2.b()) {
                                                    return oVar2;
                                                }
                                                coroutineSingletons = coroutineSingletons2;
                                                cVar3 = cVar4;
                                                f11 = 0.0f;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                                                f10 = f12;
                                                pVar2 = pVar3;
                                                oVar4 = null;
                                                i13 = 1;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1644l = pVar2;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1645m = cVar3;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.n = ref$LongRef;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1646o = oVar4;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1647p = f10;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1648q = f11;
                                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1650s = i13;
                                                A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12);
                                                if (A == coroutineSingletons) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    }
                } else {
                    m0.b.n1(obj);
                    if (h(cVar.C(), j2)) {
                        return null;
                    }
                    j1 viewConfiguration = cVar.getViewConfiguration();
                    g.f(viewConfiguration, "$this$pointerSlop");
                    if (i10 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float b5 = viewConfiguration.b();
                    if (z10) {
                        b5 *= f1622a;
                    }
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.f13059i = j2;
                    cVar3 = cVar;
                    pVar2 = pVar;
                    ref$LongRef = ref$LongRef3;
                    coroutineSingletons = coroutineSingletons2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    f10 = b5;
                    f11 = 0.0f;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1644l = pVar2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1645m = cVar3;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.n = ref$LongRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1646o = oVar4;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1647p = f10;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1648q = f11;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f1650s = i13;
                    A = cVar3.A(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12);
                    if (A == coroutineSingletons) {
                    }
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(cVar2);
        Object obj2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1649r;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f1650s;
        o oVar42 = null;
        int i132 = 1;
        if (i11 == 0) {
        }
    }

    public static final Object e(v vVar, l<? super u0.c, m7.n> lVar, u7.a<m7.n> aVar, u7.a<m7.n> aVar2, u7.p<? super o, ? super u0.c, m7.n> pVar, p7.c<? super m7.n> cVar) {
        Object b5 = ForEachGestureKt.b(vVar, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(lVar, aVar2, aVar, pVar, null), cVar);
        return b5 == CoroutineSingletons.COROUTINE_SUSPENDED ? b5 : m7.n.f16010a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(g1.c cVar, long j2, l<? super o, m7.n> lVar, p7.c<? super Boolean> cVar2) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i10;
        o oVar;
        if (cVar2 instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) cVar2;
            int i11 = dragGestureDetectorKt$drag$1.f1666o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.f1666o = i11 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragGestureDetectorKt$drag$1.f1666o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        l<? super o, m7.n> lVar2 = dragGestureDetectorKt$drag$1.f1665m;
                        g1.c cVar3 = dragGestureDetectorKt$drag$1.f1664l;
                        m0.b.n1(obj);
                        lVar = lVar2;
                        cVar = cVar3;
                        oVar = (o) obj;
                        if (oVar == null) {
                            if (p.g(oVar)) {
                                return Boolean.TRUE;
                            }
                            lVar.U(oVar);
                            j2 = oVar.f11162a;
                            dragGestureDetectorKt$drag$1.f1664l = cVar;
                            dragGestureDetectorKt$drag$1.f1665m = lVar;
                            dragGestureDetectorKt$drag$1.f1666o = 1;
                            obj = b(cVar, j2, dragGestureDetectorKt$drag$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            oVar = (o) obj;
                            if (oVar == null) {
                                return Boolean.FALSE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    dragGestureDetectorKt$drag$1.f1664l = cVar;
                    dragGestureDetectorKt$drag$1.f1665m = lVar;
                    dragGestureDetectorKt$drag$1.f1666o = 1;
                    obj = b(cVar, j2, dragGestureDetectorKt$drag$1);
                    if (obj == coroutineSingletons) {
                    }
                    oVar = (o) obj;
                    if (oVar == null) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(cVar2);
        Object obj2 = dragGestureDetectorKt$drag$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragGestureDetectorKt$drag$1.f1666o;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if ((r10 ^ 1) != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:23:0x0078). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(g1.c cVar, long j2, l<? super o, m7.n> lVar, p7.c<? super Boolean> cVar2) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i10;
        long j10;
        g1.c cVar3;
        CoroutineSingletons coroutineSingletons;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        l<? super o, m7.n> lVar2;
        g1.c cVar4;
        CoroutineSingletons coroutineSingletons2;
        Ref$LongRef ref$LongRef;
        Object A;
        o oVar;
        o oVar2;
        o oVar3;
        if (cVar2 instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) cVar2;
            int i11 = dragGestureDetectorKt$horizontalDrag$1.f1671q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.f1671q = i11 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$horizontalDrag$1.f1670p;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragGestureDetectorKt$horizontalDrag$1.f1671q;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ref$LongRef = dragGestureDetectorKt$horizontalDrag$1.f1669o;
                        g1.c cVar5 = dragGestureDetectorKt$horizontalDrag$1.n;
                        g1.c cVar6 = dragGestureDetectorKt$horizontalDrag$1.f1668m;
                        l<? super o, m7.n> lVar3 = dragGestureDetectorKt$horizontalDrag$1.f1667l;
                        m0.b.n1(obj);
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        lVar2 = lVar3;
                        g1.c cVar7 = cVar5;
                        coroutineSingletons2 = coroutineSingletons3;
                        k kVar = (k) obj;
                        List<o> list = kVar.f11159a;
                        int size = list.size();
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size) {
                                o oVar4 = list.get(i13);
                                if (n.a(oVar4.f11162a, ref$LongRef.f13059i)) {
                                    oVar = oVar4;
                                    break;
                                }
                                i13++;
                            } else {
                                oVar = null;
                                break;
                            }
                        }
                        o oVar5 = oVar;
                        if (oVar5 == null) {
                            if (p.g(oVar5)) {
                                List<o> list2 = kVar.f11159a;
                                int size2 = list2.size();
                                while (true) {
                                    if (i12 < size2) {
                                        o oVar6 = list2.get(i12);
                                        if (oVar6.f11164d) {
                                            oVar3 = oVar6;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        oVar3 = null;
                                        break;
                                    }
                                }
                                o oVar7 = oVar3;
                                if (oVar7 != null) {
                                    ref$LongRef.f13059i = oVar7.f11162a;
                                    cVar3 = cVar6;
                                    cVar4 = cVar7;
                                } else {
                                    oVar2 = oVar5;
                                }
                            } else if (u0.c.b(p.C(oVar5, true)) == 0.0f) {
                                i12 = 1;
                            }
                            dragGestureDetectorKt$horizontalDrag$12.f1667l = lVar2;
                            dragGestureDetectorKt$horizontalDrag$12.f1668m = cVar3;
                            dragGestureDetectorKt$horizontalDrag$12.n = cVar4;
                            dragGestureDetectorKt$horizontalDrag$12.f1669o = ref$LongRef;
                            dragGestureDetectorKt$horizontalDrag$12.f1671q = 1;
                            A = cVar4.A(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$12);
                            if (A == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            g1.c cVar8 = cVar4;
                            cVar6 = cVar3;
                            obj = A;
                            cVar7 = cVar8;
                            k kVar2 = (k) obj;
                            List<o> list3 = kVar2.f11159a;
                            int size3 = list3.size();
                            int i122 = 0;
                            int i132 = 0;
                            while (true) {
                                if (i132 >= size3) {
                                }
                                i132++;
                            }
                            o oVar52 = oVar;
                            if (oVar52 == null) {
                                oVar2 = null;
                            }
                        }
                        if (oVar2 != null && !oVar2.b()) {
                            if (p.g(oVar2)) {
                                return Boolean.TRUE;
                            }
                            lVar2.U(oVar2);
                            coroutineSingletons = coroutineSingletons2;
                            cVar3 = cVar6;
                            j10 = oVar2.f11162a;
                            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                            ref$LongRef2.f13059i = j10;
                            cVar4 = cVar3;
                            coroutineSingletons2 = coroutineSingletons;
                            ref$LongRef = ref$LongRef2;
                            dragGestureDetectorKt$horizontalDrag$12.f1667l = lVar2;
                            dragGestureDetectorKt$horizontalDrag$12.f1668m = cVar3;
                            dragGestureDetectorKt$horizontalDrag$12.n = cVar4;
                            dragGestureDetectorKt$horizontalDrag$12.f1669o = ref$LongRef;
                            dragGestureDetectorKt$horizontalDrag$12.f1671q = 1;
                            A = cVar4.A(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$12);
                            if (A == coroutineSingletons2) {
                            }
                        }
                        return Boolean.FALSE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0.b.n1(obj);
                j10 = j2;
                if (!h(cVar.C(), j10)) {
                    cVar3 = cVar;
                    coroutineSingletons = coroutineSingletons3;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                    lVar2 = lVar;
                    Ref$LongRef ref$LongRef22 = new Ref$LongRef();
                    ref$LongRef22.f13059i = j10;
                    cVar4 = cVar3;
                    coroutineSingletons2 = coroutineSingletons;
                    ref$LongRef = ref$LongRef22;
                    dragGestureDetectorKt$horizontalDrag$12.f1667l = lVar2;
                    dragGestureDetectorKt$horizontalDrag$12.f1668m = cVar3;
                    dragGestureDetectorKt$horizontalDrag$12.n = cVar4;
                    dragGestureDetectorKt$horizontalDrag$12.f1669o = ref$LongRef;
                    dragGestureDetectorKt$horizontalDrag$12.f1671q = 1;
                    A = cVar4.A(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$12);
                    if (A == coroutineSingletons2) {
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(cVar2);
        Object obj2 = dragGestureDetectorKt$horizontalDrag$1.f1670p;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragGestureDetectorKt$horizontalDrag$1.f1671q;
        if (i10 == 0) {
        }
    }

    public static final boolean h(k kVar, long j2) {
        o oVar;
        List<o> list = kVar.f11159a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                oVar = list.get(i10);
                if (n.a(oVar.f11162a, j2)) {
                    break;
                }
                i10++;
            } else {
                oVar = null;
                break;
            }
        }
        o oVar2 = oVar;
        if (oVar2 != null && oVar2.f11164d) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if ((r10 ^ 1) != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:23:0x0078). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(g1.c cVar, long j2, l<? super o, m7.n> lVar, p7.c<? super Boolean> cVar2) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i10;
        long j10;
        g1.c cVar3;
        CoroutineSingletons coroutineSingletons;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        l<? super o, m7.n> lVar2;
        g1.c cVar4;
        CoroutineSingletons coroutineSingletons2;
        Ref$LongRef ref$LongRef;
        Object A;
        o oVar;
        o oVar2;
        o oVar3;
        if (cVar2 instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) cVar2;
            int i11 = dragGestureDetectorKt$verticalDrag$1.f1676q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.f1676q = i11 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$verticalDrag$1.f1675p;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragGestureDetectorKt$verticalDrag$1.f1676q;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ref$LongRef = dragGestureDetectorKt$verticalDrag$1.f1674o;
                        g1.c cVar5 = dragGestureDetectorKt$verticalDrag$1.n;
                        g1.c cVar6 = dragGestureDetectorKt$verticalDrag$1.f1673m;
                        l<? super o, m7.n> lVar3 = dragGestureDetectorKt$verticalDrag$1.f1672l;
                        m0.b.n1(obj);
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        lVar2 = lVar3;
                        g1.c cVar7 = cVar5;
                        coroutineSingletons2 = coroutineSingletons3;
                        k kVar = (k) obj;
                        List<o> list = kVar.f11159a;
                        int size = list.size();
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size) {
                                o oVar4 = list.get(i13);
                                if (n.a(oVar4.f11162a, ref$LongRef.f13059i)) {
                                    oVar = oVar4;
                                    break;
                                }
                                i13++;
                            } else {
                                oVar = null;
                                break;
                            }
                        }
                        o oVar5 = oVar;
                        if (oVar5 == null) {
                            if (p.g(oVar5)) {
                                List<o> list2 = kVar.f11159a;
                                int size2 = list2.size();
                                while (true) {
                                    if (i12 < size2) {
                                        o oVar6 = list2.get(i12);
                                        if (oVar6.f11164d) {
                                            oVar3 = oVar6;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        oVar3 = null;
                                        break;
                                    }
                                }
                                o oVar7 = oVar3;
                                if (oVar7 != null) {
                                    ref$LongRef.f13059i = oVar7.f11162a;
                                    cVar3 = cVar6;
                                    cVar4 = cVar7;
                                } else {
                                    oVar2 = oVar5;
                                }
                            } else if (u0.c.c(p.C(oVar5, true)) == 0.0f) {
                                i12 = 1;
                            }
                            dragGestureDetectorKt$verticalDrag$12.f1672l = lVar2;
                            dragGestureDetectorKt$verticalDrag$12.f1673m = cVar3;
                            dragGestureDetectorKt$verticalDrag$12.n = cVar4;
                            dragGestureDetectorKt$verticalDrag$12.f1674o = ref$LongRef;
                            dragGestureDetectorKt$verticalDrag$12.f1676q = 1;
                            A = cVar4.A(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$12);
                            if (A == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            g1.c cVar8 = cVar4;
                            cVar6 = cVar3;
                            obj = A;
                            cVar7 = cVar8;
                            k kVar2 = (k) obj;
                            List<o> list3 = kVar2.f11159a;
                            int size3 = list3.size();
                            int i122 = 0;
                            int i132 = 0;
                            while (true) {
                                if (i132 >= size3) {
                                }
                                i132++;
                            }
                            o oVar52 = oVar;
                            if (oVar52 == null) {
                                oVar2 = null;
                            }
                        }
                        if (oVar2 != null && !oVar2.b()) {
                            if (p.g(oVar2)) {
                                return Boolean.TRUE;
                            }
                            lVar2.U(oVar2);
                            coroutineSingletons = coroutineSingletons2;
                            cVar3 = cVar6;
                            j10 = oVar2.f11162a;
                            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                            ref$LongRef2.f13059i = j10;
                            cVar4 = cVar3;
                            coroutineSingletons2 = coroutineSingletons;
                            ref$LongRef = ref$LongRef2;
                            dragGestureDetectorKt$verticalDrag$12.f1672l = lVar2;
                            dragGestureDetectorKt$verticalDrag$12.f1673m = cVar3;
                            dragGestureDetectorKt$verticalDrag$12.n = cVar4;
                            dragGestureDetectorKt$verticalDrag$12.f1674o = ref$LongRef;
                            dragGestureDetectorKt$verticalDrag$12.f1676q = 1;
                            A = cVar4.A(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$12);
                            if (A == coroutineSingletons2) {
                            }
                        }
                        return Boolean.FALSE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0.b.n1(obj);
                j10 = j2;
                if (!h(cVar.C(), j10)) {
                    cVar3 = cVar;
                    coroutineSingletons = coroutineSingletons3;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                    lVar2 = lVar;
                    Ref$LongRef ref$LongRef22 = new Ref$LongRef();
                    ref$LongRef22.f13059i = j10;
                    cVar4 = cVar3;
                    coroutineSingletons2 = coroutineSingletons;
                    ref$LongRef = ref$LongRef22;
                    dragGestureDetectorKt$verticalDrag$12.f1672l = lVar2;
                    dragGestureDetectorKt$verticalDrag$12.f1673m = cVar3;
                    dragGestureDetectorKt$verticalDrag$12.n = cVar4;
                    dragGestureDetectorKt$verticalDrag$12.f1674o = ref$LongRef;
                    dragGestureDetectorKt$verticalDrag$12.f1676q = 1;
                    A = cVar4.A(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$12);
                    if (A == coroutineSingletons2) {
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(cVar2);
        Object obj2 = dragGestureDetectorKt$verticalDrag$1.f1675p;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragGestureDetectorKt$verticalDrag$1.f1676q;
        if (i10 == 0) {
        }
    }
}
