package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/o;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends m implements o {

    /* renamed from: i  reason: collision with root package name */
    public final Lifecycle f5324i;

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext f5325j;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "coroutineContext");
        this.f5324i = lifecycle;
        this.f5325j = coroutineContext;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            a1.b.r(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.m
    public final Lifecycle a() {
        return this.f5324i;
    }

    public final void e() {
        kotlinx.coroutines.scheduling.b bVar = ja.f0.f12766a;
        m0.b.M0(this, kotlinx.coroutines.internal.l.f15491a.W(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2);
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        Lifecycle lifecycle = this.f5324i;
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            lifecycle.c(this);
            a1.b.r(this.f5325j, null);
        }
    }

    @Override // ja.x
    public final CoroutineContext j() {
        return this.f5325j;
    }
}
