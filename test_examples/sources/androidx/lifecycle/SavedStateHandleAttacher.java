package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/o;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements o {

    /* renamed from: i  reason: collision with root package name */
    public final SavedStateHandlesProvider f5349i;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f5349i = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        boolean z10;
        if (event == Lifecycle.Event.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qVar.i0().c(this);
            SavedStateHandlesProvider savedStateHandlesProvider = this.f5349i;
            if (!savedStateHandlesProvider.f5357b) {
                savedStateHandlesProvider.c = savedStateHandlesProvider.f5356a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                savedStateHandlesProvider.f5357b = true;
                e0 e0Var = (e0) savedStateHandlesProvider.f5358d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
