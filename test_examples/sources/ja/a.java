package ja;

import ja.u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public abstract class a<T> extends y0 implements p7.c<T>, x {

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext f12755j;

    public a(CoroutineContext coroutineContext, boolean z10) {
        super(z10);
        l0((u0) coroutineContext.a(u0.b.f12806i));
        this.f12755j = coroutineContext.m(this);
    }

    public void A0(Object obj) {
        Q(obj);
    }

    public void B0(Throwable th, boolean z10) {
    }

    public void C0(T t10) {
    }

    public final void D0(CoroutineStart coroutineStart, a aVar, u7.p pVar) {
        Object Q;
        int ordinal = coroutineStart.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            CoroutineContext coroutineContext = this.f12755j;
                            Object c = ThreadContextKt.c(coroutineContext, null);
                            v7.l.d(2, pVar);
                            Q = pVar.R(aVar, this);
                            ThreadContextKt.a(coroutineContext, c);
                        } catch (Throwable th) {
                            Q = m0.b.Q(th);
                        }
                        if (Q != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            t(Q);
                            return;
                        }
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                v7.g.f(pVar, "<this>");
                m0.b.y0(m0.b.P(aVar, this, pVar)).t(m7.n.f16010a);
                return;
            }
            return;
        }
        try {
            a1.b.z0(m0.b.y0(m0.b.P(aVar, this, pVar)), m7.n.f16010a, null);
        } catch (Throwable th2) {
            t(m0.b.Q(th2));
            throw th2;
        }
    }

    @Override // ja.y0
    public final String Y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // ja.y0, ja.u0
    public boolean b() {
        return super.b();
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return this.f12755j;
    }

    @Override // ja.x
    public final CoroutineContext j() {
        return this.f12755j;
    }

    @Override // ja.y0
    public final void k0(CompletionHandlerException completionHandlerException) {
        m0.b.v0(this.f12755j, completionHandlerException);
    }

    @Override // ja.y0
    public String p0() {
        return super.p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ja.y0
    public final void s0(Object obj) {
        if (!(obj instanceof s)) {
            C0(obj);
            return;
        }
        s sVar = (s) obj;
        B0(sVar.f12801a, sVar.a());
    }

    @Override // p7.c
    public final void t(Object obj) {
        Throwable a10 = Result.a(obj);
        if (a10 != null) {
            obj = new s(a10, false);
        }
        Object o02 = o0(obj);
        if (o02 == a1.c.A) {
            return;
        }
        A0(o02);
    }
}
