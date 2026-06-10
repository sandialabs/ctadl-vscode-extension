package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.k0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends k0.d implements k0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f5386a;

    /* renamed from: b  reason: collision with root package name */
    public final k0.a f5387b;
    public final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final Lifecycle f5388d;

    /* renamed from: e  reason: collision with root package name */
    public final b4.b f5389e;

    @SuppressLint({"LambdaLast"})
    public f0(Application application, b4.d dVar, Bundle bundle) {
        k0.a aVar;
        v7.g.f(dVar, "owner");
        this.f5389e = dVar.e();
        this.f5388d = dVar.i0();
        this.c = bundle;
        this.f5386a = application;
        if (application != null) {
            if (k0.a.c == null) {
                k0.a.c = new k0.a(application);
            }
            aVar = k0.a.c;
            v7.g.c(aVar);
        } else {
            aVar = new k0.a(null);
        }
        this.f5387b = aVar;
    }

    @Override // androidx.lifecycle.k0.b
    public final <T extends i0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.k0.b
    public final i0 b(Class cls, t3.c cVar) {
        List<Class<?>> list;
        l0 l0Var = l0.f5409a;
        LinkedHashMap linkedHashMap = cVar.f17562a;
        String str = (String) linkedHashMap.get(l0Var);
        if (str != null) {
            if (linkedHashMap.get(SavedStateHandleSupport.f5353a) != null && linkedHashMap.get(SavedStateHandleSupport.f5354b) != null) {
                Application application = (Application) linkedHashMap.get(j0.f5399a);
                boolean isAssignableFrom = b.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    list = g0.f5390a;
                } else {
                    list = g0.f5391b;
                }
                Constructor a10 = g0.a(cls, list);
                if (a10 == null) {
                    return this.f5387b.b(cls, cVar);
                }
                if (isAssignableFrom && application != null) {
                    return g0.b(cls, a10, application, SavedStateHandleSupport.a(cVar));
                }
                return g0.b(cls, a10, SavedStateHandleSupport.a(cVar));
            } else if (this.f5388d != null) {
                return d(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.k0.d
    public final void c(i0 i0Var) {
        Lifecycle lifecycle = this.f5388d;
        if (lifecycle != null) {
            b4.b bVar = this.f5389e;
            v7.g.c(bVar);
            j.a(i0Var, bVar, lifecycle);
        }
    }

    public final i0 d(Class cls, String str) {
        List<Class<?>> list;
        i0 b5;
        Lifecycle lifecycle = this.f5388d;
        if (lifecycle != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Application application = this.f5386a;
            if (isAssignableFrom && application != null) {
                list = g0.f5390a;
            } else {
                list = g0.f5391b;
            }
            Constructor a10 = g0.a(cls, list);
            if (a10 == null) {
                if (application != null) {
                    return this.f5387b.a(cls);
                }
                if (k0.c.f5405a == null) {
                    k0.c.f5405a = new k0.c();
                }
                k0.c cVar = k0.c.f5405a;
                v7.g.c(cVar);
                return cVar.a(cls);
            }
            b4.b bVar = this.f5389e;
            v7.g.c(bVar);
            SavedStateHandleController b10 = j.b(bVar, lifecycle, str, this.c);
            d0 d0Var = b10.f5351j;
            if (isAssignableFrom && application != null) {
                b5 = g0.b(cls, a10, application, d0Var);
            } else {
                b5 = g0.b(cls, a10, d0Var);
            }
            b5.c(b10, "androidx.lifecycle.savedstate.vm.tag");
            return b5;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
