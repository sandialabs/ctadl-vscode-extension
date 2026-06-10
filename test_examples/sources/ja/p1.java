package ja;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import p7.d;

/* loaded from: classes.dex */
public final class p1<T> extends kotlinx.coroutines.internal.p<T> {

    /* renamed from: l  reason: collision with root package name */
    public final ThreadLocal<Pair<CoroutineContext, Object>> f12790l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1(p7.c cVar, CoroutineContext coroutineContext) {
        super(cVar, r0);
        CoroutineContext coroutineContext2;
        q1 q1Var = q1.f12792i;
        if (coroutineContext.a(q1Var) == null) {
            coroutineContext2 = coroutineContext.m(q1Var);
        } else {
            coroutineContext2 = coroutineContext;
        }
        ThreadLocal<Pair<CoroutineContext, Object>> threadLocal = new ThreadLocal<>();
        this.f12790l = threadLocal;
        if (!(cVar.f().a(d.a.f16777i) instanceof CoroutineDispatcher)) {
            Object c = ThreadContextKt.c(coroutineContext, null);
            ThreadContextKt.a(coroutineContext, c);
            threadLocal.set(new Pair<>(coroutineContext, c));
        }
    }

    @Override // kotlinx.coroutines.internal.p, ja.a
    public final void A0(Object obj) {
        ThreadLocal<Pair<CoroutineContext, Object>> threadLocal = this.f12790l;
        Pair<CoroutineContext, Object> pair = threadLocal.get();
        if (pair != null) {
            ThreadContextKt.a(pair.f12962i, pair.f12963j);
            threadLocal.set(null);
        }
        Object x02 = a1.b.x0(obj);
        p7.c<T> cVar = this.f15493k;
        CoroutineContext f10 = cVar.f();
        Object c = ThreadContextKt.c(f10, null);
        p1<?> d5 = c != ThreadContextKt.f15463a ? CoroutineContextKt.d(cVar, f10, c) : null;
        try {
            cVar.t(x02);
            m7.n nVar = m7.n.f16010a;
        } finally {
            if (d5 == null || d5.E0()) {
                ThreadContextKt.a(f10, c);
            }
        }
    }

    public final boolean E0() {
        ThreadLocal<Pair<CoroutineContext, Object>> threadLocal = this.f12790l;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }
}
