package androidx.compose.runtime;

import g0.c0;
import g0.z;
import ja.j;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class c implements c0 {

    /* renamed from: i  reason: collision with root package name */
    public final c0 f2869i;

    /* renamed from: j  reason: collision with root package name */
    public final z f2870j = new z();

    public c(c0 c0Var) {
        this.f2869i = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[PHI: r7 
      PHI: (r7v9 java.lang.Object) = (r7v8 java.lang.Object), (r7v1 java.lang.Object) binds: [B:31:0x0083, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // g0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(p7.c cVar, l lVar) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i10;
        Object s10;
        c cVar2;
        if (cVar instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) cVar;
            int i11 = pausableMonotonicFrameClock$withFrameNanos$1.f2768p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.f2768p = i11 - Integer.MIN_VALUE;
                obj = pausableMonotonicFrameClock$withFrameNanos$1.n;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = pausableMonotonicFrameClock$withFrameNanos$1.f2768p;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = pausableMonotonicFrameClock$withFrameNanos$1.f2766m;
                    cVar2 = pausableMonotonicFrameClock$withFrameNanos$1.f2765l;
                    m0.b.n1(obj);
                } else {
                    m0.b.n1(obj);
                    z zVar = this.f2870j;
                    pausableMonotonicFrameClock$withFrameNanos$1.f2765l = this;
                    pausableMonotonicFrameClock$withFrameNanos$1.f2766m = lVar;
                    pausableMonotonicFrameClock$withFrameNanos$1.f2768p = 1;
                    if (!zVar.a()) {
                        j jVar = new j(1, m0.b.y0(pausableMonotonicFrameClock$withFrameNanos$1));
                        jVar.u();
                        synchronized (zVar.f11116a) {
                            zVar.f11117b.add(jVar);
                        }
                        jVar.x(new Latch$await$2$2(zVar, jVar));
                        s10 = jVar.s();
                        if (s10 == coroutineSingletons) {
                            if (s10 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            cVar2 = this;
                        }
                    }
                    s10 = n.f16010a;
                    if (s10 != coroutineSingletons) {
                    }
                }
                c0 c0Var = cVar2.f2869i;
                pausableMonotonicFrameClock$withFrameNanos$1.f2765l = null;
                pausableMonotonicFrameClock$withFrameNanos$1.f2766m = null;
                pausableMonotonicFrameClock$withFrameNanos$1.f2768p = 2;
                obj = c0Var.D(pausableMonotonicFrameClock$withFrameNanos$1, lVar);
                if (obj != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return obj;
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, cVar);
        obj = pausableMonotonicFrameClock$withFrameNanos$1.n;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = pausableMonotonicFrameClock$withFrameNanos$1.f2768p;
        if (i10 == 0) {
        }
        c0 c0Var2 = cVar2.f2869i;
        pausableMonotonicFrameClock$withFrameNanos$1.f2765l = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f2766m = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f2768p = 2;
        obj = c0Var2.D(pausableMonotonicFrameClock$withFrameNanos$1, lVar);
        if (obj != coroutineSingletons) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(r3, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        v7.g.f(bVar, "key");
        return CoroutineContext.a.C0140a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        v7.g.f(bVar, "key");
        return (E) CoroutineContext.a.C0140a.a(this, bVar);
    }

    public final void d() {
        z zVar = this.f2870j;
        synchronized (zVar.f11116a) {
            zVar.f11118d = false;
            n nVar = n.f16010a;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b getKey() {
        return c0.a.f11038i;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }
}
