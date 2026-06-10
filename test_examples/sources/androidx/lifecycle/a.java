package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.k0;

/* loaded from: classes.dex */
public abstract class a extends k0.d implements k0.b {

    /* renamed from: a  reason: collision with root package name */
    public final b4.b f5363a;

    /* renamed from: b  reason: collision with root package name */
    public final Lifecycle f5364b;
    public final Bundle c;

    public a(b4.d dVar, Bundle bundle) {
        v7.g.f(dVar, "owner");
        this.f5363a = dVar.e();
        this.f5364b = dVar.i0();
        this.c = bundle;
    }

    @Override // androidx.lifecycle.k0.b
    public final <T extends i0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            Lifecycle lifecycle = this.f5364b;
            if (lifecycle != null) {
                b4.b bVar = this.f5363a;
                v7.g.c(bVar);
                v7.g.c(lifecycle);
                SavedStateHandleController b5 = j.b(bVar, lifecycle, canonicalName, this.c);
                T t10 = (T) d(canonicalName, cls, b5.f5351j);
                t10.c(b5, "androidx.lifecycle.savedstate.vm.tag");
                return t10;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.k0.b
    public final i0 b(Class cls, t3.c cVar) {
        String str = (String) cVar.f17562a.get(l0.f5409a);
        if (str != null) {
            b4.b bVar = this.f5363a;
            if (bVar != null) {
                v7.g.c(bVar);
                Lifecycle lifecycle = this.f5364b;
                v7.g.c(lifecycle);
                SavedStateHandleController b5 = j.b(bVar, lifecycle, str, this.c);
                i0 d5 = d(str, cls, b5.f5351j);
                d5.c(b5, "androidx.lifecycle.savedstate.vm.tag");
                return d5;
            }
            return d(str, cls, SavedStateHandleSupport.a(cVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.k0.d
    public final void c(i0 i0Var) {
        b4.b bVar = this.f5363a;
        if (bVar != null) {
            Lifecycle lifecycle = this.f5364b;
            v7.g.c(lifecycle);
            j.a(i0Var, bVar, lifecycle);
        }
    }

    public abstract <T extends i0> T d(String str, Class<T> cls, d0 d0Var);
}
