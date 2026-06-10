package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/o;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements o {

    /* renamed from: i  reason: collision with root package name */
    public final String f5350i;

    /* renamed from: j  reason: collision with root package name */
    public final d0 f5351j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5352k;

    public SavedStateHandleController(d0 d0Var, String str) {
        this.f5350i = str;
        this.f5351j = d0Var;
    }

    public final void a(Lifecycle lifecycle, b4.b bVar) {
        v7.g.f(bVar, "registry");
        v7.g.f(lifecycle, "lifecycle");
        if (!this.f5352k) {
            this.f5352k = true;
            lifecycle.a(this);
            bVar.c(this.f5350i, this.f5351j.f5379e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f5352k = false;
            qVar.i0().c(this);
        }
    }
}
