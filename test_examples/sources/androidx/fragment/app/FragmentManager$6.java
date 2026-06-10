package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.o {
    @Override // androidx.lifecycle.o
    public final void f(androidx.lifecycle.q qVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_START) {
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            throw null;
        }
        throw null;
    }
}
