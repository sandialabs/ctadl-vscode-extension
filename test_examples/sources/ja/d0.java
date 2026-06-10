package ja;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public abstract class d0<T> extends kotlinx.coroutines.scheduling.f {

    /* renamed from: k  reason: collision with root package name */
    public int f12761k;

    public d0(int i10) {
        this.f12761k = i10;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }

    public abstract p7.c<T> c();

    public Throwable d(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.f12801a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            a1.c.M(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        v7.g.c(th);
        m0.b.v0(c().f(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r6 = (ja.u0) r6.a(ja.u0.b.f12806i);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object Q;
        Object Q2;
        Object Q3;
        kotlinx.coroutines.scheduling.g gVar = this.f15529j;
        try {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) c();
            p7.c<T> cVar = fVar.f15477m;
            Object obj = fVar.f15478o;
            CoroutineContext f10 = cVar.f();
            Object c = ThreadContextKt.c(f10, obj);
            p1<?> d5 = c != ThreadContextKt.f15463a ? CoroutineContextKt.d(cVar, f10, c) : null;
            CoroutineContext f11 = cVar.f();
            Object i10 = i();
            Throwable d10 = d(i10);
            if (d10 == null) {
                int i11 = this.f12761k;
                boolean z10 = true;
                if (i11 != 1 && i11 != 2) {
                    z10 = false;
                }
            }
            u0 u0Var = null;
            if (u0Var == null || u0Var.b()) {
                Q2 = d10 != null ? m0.b.Q(d10) : e(i10);
            } else {
                CancellationException C = u0Var.C();
                a(i10, C);
                Q2 = m0.b.Q(C);
            }
            cVar.t(Q2);
            m7.n nVar = m7.n.f16010a;
            if (d5 == null || d5.E0()) {
                ThreadContextKt.a(f10, c);
            }
            try {
                gVar.a();
                Q3 = m7.n.f16010a;
            } catch (Throwable th) {
                Q3 = m0.b.Q(th);
            }
            h(null, Result.a(Q3));
        } catch (Throwable th2) {
            try {
                gVar.a();
                Q = m7.n.f16010a;
            } catch (Throwable th3) {
                Q = m0.b.Q(th3);
            }
            h(th2, Result.a(Q));
        }
    }
}
