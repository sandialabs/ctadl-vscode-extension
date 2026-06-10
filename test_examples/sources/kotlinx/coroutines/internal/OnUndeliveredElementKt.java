package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class OnUndeliveredElementKt {
    public static final <E> u7.l<Throwable, m7.n> a(u7.l<? super E, m7.n> lVar, E e10, CoroutineContext coroutineContext) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(lVar, e10, coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException b(u7.l<? super E, m7.n> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.U(e10);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th);
            }
            a1.c.M(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }
}
