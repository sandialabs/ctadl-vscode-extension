package androidx.compose.animation.core;

import androidx.compose.ui.platform.l0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import q0.e;
import r.a0;
import r.d;
import r.e;
import r.i;
import r.m;
import r.x;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[Catch: CancellationException -> 0x0047, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0047, blocks: (B:16:0x0041, B:33:0x00c6, B:35:0x00db), top: B:59:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, r.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, V extends i> Object a(e<T, V> eVar, r.a<T, V> aVar, long j2, l<? super r.c<T, V>, n> lVar, p7.c<? super n> cVar) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42;
        CoroutineSingletons coroutineSingletons;
        int i10;
        Ref$ObjectRef ref$ObjectRef;
        e<T, V> eVar2;
        l<? super r.c<T, V>, n> lVar2;
        l<? super r.c<T, V>, n> lVar3;
        Ref$ObjectRef ref$ObjectRef2;
        r.c cVar2;
        r.c cVar3;
        T t10;
        SuspendAnimationKt$animate$9 suspendAnimationKt$animate$9;
        r.a<T, V> aVar2 = aVar;
        if (cVar instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) cVar;
            int i11 = suspendAnimationKt$animate$4.f1313q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.f1313q = i11 - Integer.MIN_VALUE;
                suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
                Object obj = suspendAnimationKt$animate$42.f1312p;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = suspendAnimationKt$animate$42.f1313q;
                CoroutineContext coroutineContext = suspendAnimationKt$animate$42.f13036j;
                boolean z10 = true;
                if (i10 == 0) {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref$ObjectRef ref$ObjectRef3 = suspendAnimationKt$animate$42.f1311o;
                    lVar3 = suspendAnimationKt$animate$42.n;
                    r.a<T, V> aVar3 = suspendAnimationKt$animate$42.f1310m;
                    eVar2 = suspendAnimationKt$animate$42.f1309l;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    try {
                        m0.b.n1(obj);
                        aVar2 = aVar3;
                    } catch (CancellationException e10) {
                        e = e10;
                        ref$ObjectRef = ref$ObjectRef2;
                        cVar2 = (r.c) ref$ObjectRef.f13060i;
                        if (cVar2 == null) {
                            cVar2.f16971i.setValue(Boolean.FALSE);
                        }
                        cVar3 = (r.c) ref$ObjectRef.f13060i;
                        if (cVar3 != null || cVar3.f16969g != eVar2.f16977l) {
                            z10 = false;
                        }
                        if (z10) {
                            eVar2.n = false;
                        }
                        throw e;
                    }
                } else {
                    m0.b.n1(obj);
                    T b5 = aVar2.b(0L);
                    V f10 = aVar2.f(0L);
                    ref$ObjectRef = new Ref$ObjectRef();
                    try {
                        if (j2 == Long.MIN_VALUE) {
                            g.c(coroutineContext);
                            SuspendAnimationKt$animate$6 suspendAnimationKt$animate$6 = new SuspendAnimationKt$animate$6(ref$ObjectRef, b5, aVar, f10, eVar, f(coroutineContext), lVar);
                            suspendAnimationKt$animate$42.f1309l = eVar;
                            suspendAnimationKt$animate$42.f1310m = aVar2;
                            lVar2 = lVar;
                            suspendAnimationKt$animate$42.n = lVar2;
                            suspendAnimationKt$animate$42.f1311o = ref$ObjectRef;
                            suspendAnimationKt$animate$42.f1313q = 1;
                            if (d(aVar2, suspendAnimationKt$animate$6, suspendAnimationKt$animate$42) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            lVar2 = lVar;
                            try {
                                ?? r13 = (T) new r.c(b5, aVar.d(), f10, j2, aVar.e(), j2, new SuspendAnimationKt$animate$7(eVar));
                                g.c(coroutineContext);
                                ref$ObjectRef = ref$ObjectRef;
                                e(r13, j2, f(coroutineContext), aVar, eVar, lVar);
                                ref$ObjectRef.f13060i = r13;
                            } catch (CancellationException e11) {
                                e = e11;
                                ref$ObjectRef = ref$ObjectRef;
                                eVar2 = eVar;
                                cVar2 = (r.c) ref$ObjectRef.f13060i;
                                if (cVar2 == null) {
                                }
                                cVar3 = (r.c) ref$ObjectRef.f13060i;
                                if (cVar3 != null) {
                                }
                                z10 = false;
                                if (z10) {
                                }
                                throw e;
                            }
                        }
                        lVar3 = lVar2;
                        eVar2 = eVar;
                        ref$ObjectRef2 = ref$ObjectRef;
                    } catch (CancellationException e12) {
                        e = e12;
                    }
                }
                do {
                    t10 = ref$ObjectRef2.f13060i;
                    g.c(t10);
                    if (!((Boolean) ((r.c) t10).f16971i.getValue()).booleanValue()) {
                        g.c(coroutineContext);
                        suspendAnimationKt$animate$9 = new SuspendAnimationKt$animate$9(ref$ObjectRef2, f(coroutineContext), aVar2, eVar2, lVar3);
                        suspendAnimationKt$animate$42.f1309l = eVar2;
                        suspendAnimationKt$animate$42.f1310m = aVar2;
                        suspendAnimationKt$animate$42.n = lVar3;
                        suspendAnimationKt$animate$42.f1311o = ref$ObjectRef2;
                        suspendAnimationKt$animate$42.f1313q = 2;
                    } else {
                        return n.f16010a;
                    }
                } while (d(aVar2, suspendAnimationKt$animate$9, suspendAnimationKt$animate$42) != coroutineSingletons);
                return coroutineSingletons;
            }
        }
        suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(cVar);
        suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
        Object obj2 = suspendAnimationKt$animate$42.f1312p;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = suspendAnimationKt$animate$42.f1313q;
        CoroutineContext coroutineContext2 = suspendAnimationKt$animate$42.f13036j;
        boolean z102 = true;
        if (i10 == 0) {
        }
        do {
            t10 = ref$ObjectRef2.f13060i;
            g.c(t10);
            if (!((Boolean) ((r.c) t10).f16971i.getValue()).booleanValue()) {
            }
        } while (d(aVar2, suspendAnimationKt$animate$9, suspendAnimationKt$animate$42) != coroutineSingletons);
        return coroutineSingletons;
    }

    public static Object b(float f10, d dVar, p pVar, p7.c cVar) {
        a0 a0Var = VectorConvertersKt.f1327a;
        Float f11 = new Float(0.0f);
        Float f12 = new Float(f10);
        i iVar = (i) a0Var.f16960a.U(new Float(0.0f));
        if (iVar == null) {
            iVar = a1.c.W0((i) a0Var.f16960a.U(f11));
        }
        i iVar2 = iVar;
        Object a10 = a(new e(a0Var, f11, iVar2, 56), new x(dVar, a0Var, f11, f12, iVar2), Long.MIN_VALUE, new SuspendAnimationKt$animate$3(pVar, a0Var), cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (a10 != coroutineSingletons) {
            a10 = n.f16010a;
        }
        if (a10 != coroutineSingletons) {
            return n.f16010a;
        }
        return a10;
    }

    public static Object c(e eVar, r.n nVar, l lVar, ContinuationImpl continuationImpl) {
        Object a10 = a(eVar, new m(nVar, eVar.f16974i, eVar.getValue(), eVar.f16976k), Long.MIN_VALUE, lVar, continuationImpl);
        if (a10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return n.f16010a;
        }
        return a10;
    }

    public static final <R, T, V extends i> Object d(r.a<T, V> aVar, l<? super Long, ? extends R> lVar, p7.c<? super R> cVar) {
        if (aVar.a()) {
            ContinuationImpl continuationImpl = (ContinuationImpl) cVar;
            CoroutineContext coroutineContext = continuationImpl.f13036j;
            g.c(coroutineContext);
            l0 l0Var = (l0) coroutineContext.a(l0.a.f3855i);
            if (l0Var == null) {
                return a1.c.C0(continuationImpl.f()).D(cVar, lVar);
            }
            new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(null, lVar);
            return l0Var.h();
        }
        return a1.c.C0(((ContinuationImpl) cVar).f()).D(cVar, new SuspendAnimationKt$callWithFrameNanos$2(lVar));
    }

    public static final <T, V extends i> void e(r.c<T, V> cVar, long j2, float f10, r.a<T, V> aVar, e<T, V> eVar, l<? super r.c<T, V>, n> lVar) {
        boolean z10;
        long j10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j10 = aVar.c();
        } else {
            j10 = ((float) (j2 - cVar.c)) / f10;
        }
        cVar.f16969g = j2;
        cVar.f16967e.setValue(aVar.b(j10));
        V f11 = aVar.f(j10);
        g.f(f11, "<set-?>");
        cVar.f16968f = f11;
        if (aVar.g(j10)) {
            cVar.f16970h = cVar.f16969g;
            cVar.f16971i.setValue(Boolean.FALSE);
        }
        g(cVar, eVar);
        lVar.U(cVar);
    }

    public static final float f(CoroutineContext coroutineContext) {
        q0.e eVar = (q0.e) coroutineContext.a(e.a.f16831i);
        float H = eVar != null ? eVar.H() : 1.0f;
        if (H >= 0.0f) {
            return H;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends i> void g(r.c<T, V> cVar, r.e<T, V> eVar) {
        g.f(cVar, "<this>");
        g.f(eVar, "state");
        eVar.f16975j.setValue(cVar.a());
        V v3 = eVar.f16976k;
        V v10 = cVar.f16968f;
        g.f(v3, "<this>");
        g.f(v10, "source");
        int b5 = v3.b();
        for (int i10 = 0; i10 < b5; i10++) {
            v3.e(i10, v10.a(i10));
        }
        eVar.f16978m = cVar.f16970h;
        eVar.f16977l = cVar.f16969g;
        eVar.n = ((Boolean) cVar.f16971i.getValue()).booleanValue();
    }
}
