package g0;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class n0<T> implements m0<T>, g0<T> {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineContext f11064i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0<T> f11065j;

    public n0(g0<T> g0Var, CoroutineContext coroutineContext) {
        v7.g.f(g0Var, "state");
        v7.g.f(coroutineContext, "coroutineContext");
        this.f11064i = coroutineContext;
        this.f11065j = g0Var;
    }

    @Override // g0.g0, g0.g1
    public final T getValue() {
        return this.f11065j.getValue();
    }

    @Override // ja.x
    public final CoroutineContext j() {
        return this.f11064i;
    }

    @Override // g0.g0
    public final void setValue(T t10) {
        this.f11065j.setValue(t10);
    }
}
