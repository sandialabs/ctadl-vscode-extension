package kotlinx.coroutines;

import ja.i0;
import ja.o1;
import ja.s;
import ja.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import u7.p;
import v7.l;

/* loaded from: classes.dex */
public final class TimeoutKt {
    public static final <U, T extends U> Object a(o1<U, ? super T> o1Var, p<? super x, ? super p7.c<? super T>, ? extends Object> pVar) {
        Object sVar;
        Object o02;
        o1Var.O(new i0(m0.b.l0(o1Var.f15493k.f()).j(o1Var.f12789l, o1Var, o1Var.f12755j)));
        boolean z10 = false;
        try {
            l.d(2, pVar);
            sVar = pVar.R(o1Var, o1Var);
        } catch (Throwable th) {
            sVar = new s(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (sVar != coroutineSingletons && (o02 = o1Var.o0(sVar)) != a1.c.A) {
            if (o02 instanceof s) {
                Throwable th2 = ((s) o02).f12801a;
                if (!(((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).f15157i == o1Var) ? true : true)) {
                    if (sVar instanceof s) {
                        throw ((s) sVar).f12801a;
                    }
                } else {
                    throw th2;
                }
            } else {
                sVar = a1.c.T1(o02);
            }
            return sVar;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ja.o1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(long j2, p<? super x, ? super p7.c<? super T>, ? extends Object> pVar, p7.c<? super T> cVar) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        int i10;
        TimeoutCancellationException e10;
        Ref$ObjectRef ref$ObjectRef;
        if (cVar instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) cVar;
            int i11 = timeoutKt$withTimeoutOrNull$1.f15160o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.f15160o = i11 - Integer.MIN_VALUE;
                Object obj = timeoutKt$withTimeoutOrNull$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = timeoutKt$withTimeoutOrNull$1.f15160o;
                if (i10 != 0) {
                    m0.b.n1(obj);
                    if (j2 <= 0) {
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        timeoutKt$withTimeoutOrNull$1.f15158l = pVar;
                        timeoutKt$withTimeoutOrNull$1.f15159m = ref$ObjectRef2;
                        timeoutKt$withTimeoutOrNull$1.f15160o = 1;
                        ?? r22 = (T) new o1(j2, timeoutKt$withTimeoutOrNull$1);
                        ref$ObjectRef2.f13060i = r22;
                        obj = a(r22, pVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (TimeoutCancellationException e11) {
                        e10 = e11;
                        ref$ObjectRef = ref$ObjectRef2;
                        if (e10.f15157i != ref$ObjectRef.f13060i) {
                            return null;
                        }
                        throw e10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ref$ObjectRef = timeoutKt$withTimeoutOrNull$1.f15159m;
                    try {
                        m0.b.n1(obj);
                    } catch (TimeoutCancellationException e12) {
                        e10 = e12;
                        if (e10.f15157i != ref$ObjectRef.f13060i) {
                        }
                    }
                }
                return obj;
            }
        }
        timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(cVar);
        Object obj2 = timeoutKt$withTimeoutOrNull$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = timeoutKt$withTimeoutOrNull$1.f15160o;
        if (i10 != 0) {
        }
        return obj2;
    }
}
