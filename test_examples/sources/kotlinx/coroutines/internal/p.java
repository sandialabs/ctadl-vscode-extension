package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public class p<T> extends ja.a<T> implements q7.b {

    /* renamed from: k  reason: collision with root package name */
    public final p7.c<T> f15493k;

    public p(p7.c cVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f15493k = cVar;
    }

    @Override // ja.a
    public void A0(Object obj) {
        this.f15493k.t(a1.b.x0(obj));
    }

    @Override // ja.y0
    public void Q(Object obj) {
        a1.b.z0(m0.b.y0(this.f15493k), a1.b.x0(obj), null);
    }

    @Override // q7.b
    public final q7.b g() {
        p7.c<T> cVar = this.f15493k;
        if (cVar instanceof q7.b) {
            return (q7.b) cVar;
        }
        return null;
    }

    @Override // ja.y0
    public final boolean m0() {
        return true;
    }
}
