package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import b4.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a implements b.a {
        @Override // b4.b.a
        public final void a(b4.d dVar) {
            LinkedHashMap linkedHashMap;
            v7.g.f(dVar, "owner");
            if (dVar instanceof n0) {
                m0 X = ((n0) dVar).X();
                b4.b e10 = dVar.e();
                X.getClass();
                Iterator it = new HashSet(X.f5410a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = X.f5410a;
                    if (!hasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    v7.g.f(str, "key");
                    i0 i0Var = (i0) linkedHashMap.get(str);
                    v7.g.c(i0Var);
                    j.a(i0Var, e10, dVar.i0());
                }
                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                    e10.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    public static final void a(i0 i0Var, b4.b bVar, Lifecycle lifecycle) {
        Object obj;
        v7.g.f(bVar, "registry");
        v7.g.f(lifecycle, "lifecycle");
        HashMap hashMap = i0Var.f5397a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = i0Var.f5397a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f5352k) {
            savedStateHandleController.a(lifecycle, bVar);
            c(lifecycle, bVar);
        }
    }

    public static final SavedStateHandleController b(b4.b bVar, Lifecycle lifecycle, String str, Bundle bundle) {
        Bundle a10 = bVar.a(str);
        Class<? extends Object>[] clsArr = d0.f5375f;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(d0.a.a(a10, bundle), str);
        savedStateHandleController.a(lifecycle, bVar);
        c(lifecycle, bVar);
        return savedStateHandleController;
    }

    public static void c(final Lifecycle lifecycle, final b4.b bVar) {
        boolean z10;
        Lifecycle.State b5 = lifecycle.b();
        if (b5 != Lifecycle.State.INITIALIZED) {
            if (b5.compareTo(Lifecycle.State.STARTED) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                lifecycle.a(new o() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                    @Override // androidx.lifecycle.o
                    public final void f(q qVar, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_START) {
                            Lifecycle.this.c(this);
                            bVar.d();
                        }
                    }
                });
                return;
            }
        }
        bVar.d();
    }
}
