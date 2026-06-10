package androidx.compose.foundation.gestures;

import g1.k;
import g1.o;
import g1.v;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if ((!r8) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r0.f1755l = r7;
        r0.n = 1;
        r8 = r7.A(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r8 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r8 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        return m7.n.f16010a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:26:0x0067). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g1.c cVar, p7.c<? super n> cVar2) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i10;
        boolean z10;
        boolean z11;
        if (cVar2 instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) cVar2;
            int i11 = forEachGestureKt$awaitAllPointersUp$3.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.n = i11 - Integer.MIN_VALUE;
                Object obj = forEachGestureKt$awaitAllPointersUp$3.f1756m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = forEachGestureKt$awaitAllPointersUp$3.n;
                if (i10 == 0) {
                    if (i10 == 1) {
                        cVar = forEachGestureKt$awaitAllPointersUp$3.f1755l;
                        m0.b.n1(obj);
                        List<o> list = ((k) obj).f11159a;
                        int size = list.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                if (list.get(i12).f11164d) {
                                    z11 = true;
                                    break;
                                }
                                i12++;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    g.f(cVar, "<this>");
                    List<o> list2 = cVar.C().f11159a;
                    int size2 = list2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            if (list2.get(i13).f11164d) {
                                z10 = true;
                                break;
                            }
                            i13++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
            }
        }
        forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(cVar2);
        Object obj2 = forEachGestureKt$awaitAllPointersUp$3.f1756m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = forEachGestureKt$awaitAllPointersUp$3.n;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[Catch: CancellationException -> 0x0096, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0096, blocks: (B:32:0x0078, B:35:0x008c), top: B:58:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v7, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0091 -> B:26:0x005f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c0 -> B:26:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(v vVar, p<? super v, ? super p7.c<? super n>, ? extends Object> pVar, p7.c<? super n> cVar) {
        ForEachGestureKt$forEachGesture$1 forEachGestureKt$forEachGesture$1;
        ?? r22;
        CoroutineSingletons coroutineSingletons;
        CoroutineContext coroutineContext;
        v vVar2;
        CoroutineContext coroutineContext2;
        v vVar3;
        CoroutineContext coroutineContext3;
        v vVar4;
        v vVar5;
        CoroutineSingletons coroutineSingletons2;
        if (cVar instanceof ForEachGestureKt$forEachGesture$1) {
            forEachGestureKt$forEachGesture$1 = (ForEachGestureKt$forEachGesture$1) cVar;
            int i10 = forEachGestureKt$forEachGesture$1.f1760p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$forEachGesture$1.f1760p = i10 - Integer.MIN_VALUE;
                Object obj = forEachGestureKt$forEachGesture$1.f1759o;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                r22 = forEachGestureKt$forEachGesture$1.f1760p;
                if (r22 == 0) {
                    try {
                    } catch (CancellationException e10) {
                        e = e10;
                        coroutineSingletons = coroutineSingletons3;
                        vVar4 = r22;
                        coroutineContext3 = vVar;
                        if (a1.b.h0(coroutineContext3)) {
                        }
                    }
                    if (r22 != 1) {
                        if (r22 != 2) {
                            if (r22 == 3) {
                                coroutineContext = forEachGestureKt$forEachGesture$1.n;
                                pVar = forEachGestureKt$forEachGesture$1.f1758m;
                                vVar2 = forEachGestureKt$forEachGesture$1.f1757l;
                                m0.b.n1(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            coroutineContext = forEachGestureKt$forEachGesture$1.n;
                            pVar = forEachGestureKt$forEachGesture$1.f1758m;
                            vVar2 = forEachGestureKt$forEachGesture$1.f1757l;
                            m0.b.n1(obj);
                        }
                        coroutineContext2 = coroutineContext;
                        vVar3 = vVar2;
                    } else {
                        CoroutineContext coroutineContext4 = forEachGestureKt$forEachGesture$1.n;
                        pVar = forEachGestureKt$forEachGesture$1.f1758m;
                        v vVar6 = forEachGestureKt$forEachGesture$1.f1757l;
                        m0.b.n1(obj);
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                        v vVar7 = vVar6;
                        CoroutineContext coroutineContext5 = coroutineContext4;
                        try {
                        } catch (CancellationException e11) {
                            coroutineSingletons = coroutineSingletons4;
                            e = e11;
                            vVar4 = vVar7;
                            coroutineContext3 = coroutineContext5;
                            if (a1.b.h0(coroutineContext3)) {
                            }
                        }
                        forEachGestureKt$forEachGesture$1.f1757l = vVar7;
                        forEachGestureKt$forEachGesture$1.f1758m = pVar;
                        forEachGestureKt$forEachGesture$1.n = coroutineContext5;
                        forEachGestureKt$forEachGesture$1.f1760p = 2;
                        Object Q = vVar7.Q(new ForEachGestureKt$awaitAllPointersUp$2(null), forEachGestureKt$forEachGesture$1);
                        if (Q == coroutineSingletons3) {
                            Q = n.f16010a;
                        }
                        if (Q != coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        CoroutineSingletons coroutineSingletons5 = coroutineSingletons4;
                        coroutineContext2 = coroutineContext5;
                        vVar5 = vVar7;
                        coroutineSingletons2 = coroutineSingletons5;
                        if (!a1.b.h0(coroutineContext2)) {
                            try {
                            } catch (CancellationException e12) {
                                CoroutineSingletons coroutineSingletons6 = coroutineSingletons2;
                                vVar4 = vVar5;
                                coroutineContext3 = coroutineContext2;
                                e = e12;
                                coroutineSingletons = coroutineSingletons6;
                                if (a1.b.h0(coroutineContext3)) {
                                    forEachGestureKt$forEachGesture$1.f1757l = vVar4;
                                    forEachGestureKt$forEachGesture$1.f1758m = pVar;
                                    forEachGestureKt$forEachGesture$1.n = coroutineContext3;
                                    forEachGestureKt$forEachGesture$1.f1760p = 3;
                                    Object Q2 = vVar4.Q(new ForEachGestureKt$awaitAllPointersUp$2(null), forEachGestureKt$forEachGesture$1);
                                    if (Q2 != coroutineSingletons3) {
                                        Q2 = n.f16010a;
                                    }
                                    if (Q2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    coroutineContext2 = coroutineContext3;
                                    vVar5 = vVar4;
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (!a1.b.h0(coroutineContext2)) {
                                    }
                                } else {
                                    throw e;
                                }
                            }
                            forEachGestureKt$forEachGesture$1.f1757l = vVar5;
                            forEachGestureKt$forEachGesture$1.f1758m = pVar;
                            forEachGestureKt$forEachGesture$1.n = coroutineContext2;
                            forEachGestureKt$forEachGesture$1.f1760p = 1;
                            if (pVar.R(vVar5, forEachGestureKt$forEachGesture$1) == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            CoroutineSingletons coroutineSingletons7 = coroutineSingletons2;
                            vVar7 = vVar5;
                            coroutineContext5 = coroutineContext2;
                            coroutineSingletons4 = coroutineSingletons7;
                            forEachGestureKt$forEachGesture$1.f1757l = vVar7;
                            forEachGestureKt$forEachGesture$1.f1758m = pVar;
                            forEachGestureKt$forEachGesture$1.n = coroutineContext5;
                            forEachGestureKt$forEachGesture$1.f1760p = 2;
                            Object Q3 = vVar7.Q(new ForEachGestureKt$awaitAllPointersUp$2(null), forEachGestureKt$forEachGesture$1);
                            if (Q3 == coroutineSingletons3) {
                            }
                            if (Q3 != coroutineSingletons4) {
                            }
                        } else {
                            return n.f16010a;
                        }
                    }
                } else {
                    m0.b.n1(obj);
                    coroutineContext2 = forEachGestureKt$forEachGesture$1.f13036j;
                    g.c(coroutineContext2);
                    vVar3 = vVar;
                }
                coroutineSingletons2 = coroutineSingletons3;
                vVar5 = vVar3;
                if (!a1.b.h0(coroutineContext2)) {
                }
            }
        }
        forEachGestureKt$forEachGesture$1 = new ForEachGestureKt$forEachGesture$1(cVar);
        Object obj2 = forEachGestureKt$forEachGesture$1.f1759o;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r22 = forEachGestureKt$forEachGesture$1.f1760p;
        if (r22 == 0) {
        }
        coroutineSingletons2 = coroutineSingletons32;
        vVar5 = vVar3;
        if (!a1.b.h0(coroutineContext2)) {
        }
    }
}
