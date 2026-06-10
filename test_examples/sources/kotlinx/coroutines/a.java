package kotlinx.coroutines;

import ga.h;
import ga.l;
import ja.w;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import m7.n;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<w> f15161a;

    static {
        Iterator q10 = a4.b.q();
        g.f(q10, "<this>");
        h lVar = new l(q10);
        if (!(lVar instanceof ga.a)) {
            lVar = new ga.a(lVar);
        }
        f15161a = a1.c.a1(kotlin.sequences.a.Z0(lVar));
    }

    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        for (w wVar : f15161a) {
            try {
                wVar.M(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a1.c.M(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            a1.c.M(th, new DiagnosticCoroutineContextException(coroutineContext));
            n nVar = n.f16010a;
        } catch (Throwable th3) {
            m0.b.Q(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
