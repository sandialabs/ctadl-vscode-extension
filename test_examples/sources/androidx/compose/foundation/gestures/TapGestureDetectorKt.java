package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import g1.k;
import g1.o;
import g1.v;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import t.g;
import u7.l;
import u7.q;
import v0.p;

/* loaded from: classes.dex */
public final class TapGestureDetectorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final q<g, u0.c, p7.c<? super n>, Object> f1836a = new TapGestureDetectorKt$NoPressGesture$1(null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(g1.c r10, androidx.compose.ui.input.pointer.PointerEventPass r11, boolean r12, p7.c<? super g1.o> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1) r0
            int r1 = r0.f1840p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1840p = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f1839o
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f1840p
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r10 = r0.n
            androidx.compose.ui.input.pointer.PointerEventPass r11 = r0.f1838m
            g1.c r12 = r0.f1837l
            m0.b.n1(r13)
            r9 = r12
            r12 = r10
            r10 = r9
            goto L4a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            m0.b.n1(r13)
        L3b:
            r0.f1837l = r10
            r0.f1838m = r11
            r0.n = r12
            r0.f1840p = r3
            java.lang.Object r13 = r10.A(r11, r0)
            if (r13 != r1) goto L4a
            return r1
        L4a:
            g1.k r13 = (g1.k) r13
            java.util.List<g1.o> r2 = r13.f11159a
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L54:
            if (r6 >= r4) goto L80
            java.lang.Object r7 = r2.get(r6)
            g1.o r7 = (g1.o) r7
            if (r12 == 0) goto L75
            java.lang.String r8 = "<this>"
            v7.g.f(r7, r8)
            boolean r8 = r7.b()
            if (r8 != 0) goto L73
            boolean r8 = r7.f11167g
            if (r8 != 0) goto L73
            boolean r7 = r7.f11164d
            if (r7 == 0) goto L73
            r7 = 1
            goto L79
        L73:
            r7 = 0
            goto L79
        L75:
            boolean r7 = v0.p.f(r7)
        L79:
            if (r7 != 0) goto L7d
            r2 = 0
            goto L81
        L7d:
            int r6 = r6 + 1
            goto L54
        L80:
            r2 = 1
        L81:
            if (r2 == 0) goto L3b
            java.util.List<g1.o> r10 = r13.f11159a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.a(g1.c, androidx.compose.ui.input.pointer.PointerEventPass, boolean, p7.c):java.lang.Object");
    }

    public static final Object b(v vVar, q<? super g, ? super u0.c, ? super p7.c<? super n>, ? extends Object> qVar, l<? super u0.c, n> lVar, p7.c<? super n> cVar) {
        Object b5 = ForEachGestureKt.b(vVar, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(vVar), qVar, lVar, null), cVar);
        return b5 == CoroutineSingletons.COROUTINE_SUSPENDED ? b5 : n.f16010a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[LOOP:2: B:39:0x008a->B:49:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00bf -> B:56:0x00c2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(g1.c cVar, p7.c<? super o> cVar2) {
        TapGestureDetectorKt$waitForUpOrCancellation$1 tapGestureDetectorKt$waitForUpOrCancellation$1;
        int i10;
        int size;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (cVar2 instanceof TapGestureDetectorKt$waitForUpOrCancellation$1) {
            tapGestureDetectorKt$waitForUpOrCancellation$1 = (TapGestureDetectorKt$waitForUpOrCancellation$1) cVar2;
            int i12 = tapGestureDetectorKt$waitForUpOrCancellation$1.n;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$1.n = i12 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$waitForUpOrCancellation$1.f1859m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = tapGestureDetectorKt$waitForUpOrCancellation$1.n;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            cVar = tapGestureDetectorKt$waitForUpOrCancellation$1.f1858l;
                            m0.b.n1(obj);
                            List<o> list = ((k) obj).f11159a;
                            int size2 = list.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    if (list.get(i13).b()) {
                                        z14 = true;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    z14 = false;
                                    break;
                                }
                            }
                            if (z14) {
                                return null;
                            }
                            PointerEventPass pointerEventPass = PointerEventPass.Main;
                            tapGestureDetectorKt$waitForUpOrCancellation$1.f1858l = cVar;
                            tapGestureDetectorKt$waitForUpOrCancellation$1.n = 1;
                            obj = cVar.A(pointerEventPass, tapGestureDetectorKt$waitForUpOrCancellation$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            k kVar = (k) obj;
                            List<o> list2 = kVar.f11159a;
                            size = list2.size();
                            i11 = 0;
                            while (true) {
                                if (i11 >= size) {
                                    o oVar = list2.get(i11);
                                    v7.g.f(oVar, "<this>");
                                    if (!oVar.b() && oVar.f11167g && !oVar.f11164d) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        z10 = false;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    z10 = true;
                                    break;
                                }
                            }
                            List<o> list3 = kVar.f11159a;
                            if (!z10) {
                                return list3.get(0);
                            }
                            int size3 = list3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size3) {
                                    o oVar2 = list3.get(i14);
                                    if (!oVar2.b() && !p.v(oVar2, cVar.p(), cVar.S())) {
                                        z12 = false;
                                        if (!z12) {
                                            z11 = true;
                                            break;
                                        }
                                        i14++;
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                } else {
                                    z11 = false;
                                    break;
                                }
                            }
                            if (z11) {
                                return null;
                            }
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            tapGestureDetectorKt$waitForUpOrCancellation$1.f1858l = cVar;
                            tapGestureDetectorKt$waitForUpOrCancellation$1.n = 2;
                            obj = cVar.A(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            List<o> list4 = ((k) obj).f11159a;
                            int size22 = list4.size();
                            int i132 = 0;
                            while (true) {
                                if (i132 < size22) {
                                }
                                i132++;
                            }
                            if (z14) {
                            }
                            PointerEventPass pointerEventPass3 = PointerEventPass.Main;
                            tapGestureDetectorKt$waitForUpOrCancellation$1.f1858l = cVar;
                            tapGestureDetectorKt$waitForUpOrCancellation$1.n = 1;
                            obj = cVar.A(pointerEventPass3, tapGestureDetectorKt$waitForUpOrCancellation$1);
                            if (obj == coroutineSingletons) {
                            }
                            k kVar2 = (k) obj;
                            List<o> list22 = kVar2.f11159a;
                            size = list22.size();
                            i11 = 0;
                            while (true) {
                                if (i11 >= size) {
                                }
                                i11++;
                            }
                            List<o> list32 = kVar2.f11159a;
                            if (!z10) {
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        cVar = tapGestureDetectorKt$waitForUpOrCancellation$1.f1858l;
                        m0.b.n1(obj);
                        k kVar22 = (k) obj;
                        List<o> list222 = kVar22.f11159a;
                        size = list222.size();
                        i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                            }
                            i11++;
                        }
                        List<o> list322 = kVar22.f11159a;
                        if (!z10) {
                        }
                    }
                } else {
                    m0.b.n1(obj);
                    PointerEventPass pointerEventPass32 = PointerEventPass.Main;
                    tapGestureDetectorKt$waitForUpOrCancellation$1.f1858l = cVar;
                    tapGestureDetectorKt$waitForUpOrCancellation$1.n = 1;
                    obj = cVar.A(pointerEventPass32, tapGestureDetectorKt$waitForUpOrCancellation$1);
                    if (obj == coroutineSingletons) {
                    }
                    k kVar222 = (k) obj;
                    List<o> list2222 = kVar222.f11159a;
                    size = list2222.size();
                    i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                        }
                        i11++;
                    }
                    List<o> list3222 = kVar222.f11159a;
                    if (!z10) {
                    }
                }
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$1 = new TapGestureDetectorKt$waitForUpOrCancellation$1(cVar2);
        Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$1.f1859m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = tapGestureDetectorKt$waitForUpOrCancellation$1.n;
        if (i10 == 0) {
        }
    }
}
