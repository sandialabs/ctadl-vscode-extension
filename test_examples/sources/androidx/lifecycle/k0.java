package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import t3.a;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f5402a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5403b;
    public final t3.a c;

    /* loaded from: classes.dex */
    public static class a extends c {
        public static a c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f5404b;

        public a(Application application) {
            this.f5404b = application;
        }

        @Override // androidx.lifecycle.k0.c, androidx.lifecycle.k0.b
        public final <T extends i0> T a(Class<T> cls) {
            Application application = this.f5404b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.k0.c, androidx.lifecycle.k0.b
        public final i0 b(Class cls, t3.c cVar) {
            if (this.f5404b != null) {
                return a(cls);
            }
            Application application = (Application) cVar.f17562a.get(j0.f5399a);
            if (application != null) {
                return c(cls, application);
            }
            if (!androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends i0> T c(Class<T> cls, Application application) {
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    v7.g.e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        <T extends i0> T a(Class<T> cls);

        i0 b(Class cls, t3.c cVar);
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static c f5405a;

        @Override // androidx.lifecycle.k0.b
        public <T extends i0> T a(Class<T> cls) {
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                v7.g.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        @Override // androidx.lifecycle.k0.b
        public i0 b(Class cls, t3.c cVar) {
            return a(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public void c(i0 i0Var) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, b bVar) {
        this(m0Var, bVar, a.C0224a.f17563b);
        v7.g.f(m0Var, "store");
    }

    public k0(m0 m0Var, b bVar, t3.a aVar) {
        v7.g.f(m0Var, "store");
        v7.g.f(bVar, "factory");
        v7.g.f(aVar, "defaultCreationExtras");
        this.f5402a = m0Var;
        this.f5403b = bVar;
        this.c = aVar;
    }

    public final <T extends i0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final i0 b(Class cls, String str) {
        i0 a10;
        d dVar;
        v7.g.f(str, "key");
        m0 m0Var = this.f5402a;
        m0Var.getClass();
        i0 i0Var = (i0) m0Var.f5410a.get(str);
        boolean isInstance = cls.isInstance(i0Var);
        b bVar = this.f5403b;
        if (isInstance) {
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                v7.g.c(i0Var);
                dVar.c(i0Var);
            }
            v7.g.d(i0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return i0Var;
        }
        t3.c cVar = new t3.c(this.c);
        cVar.f17562a.put(l0.f5409a, str);
        try {
            a10 = bVar.b(cls, cVar);
        } catch (AbstractMethodError unused) {
            a10 = bVar.a(cls);
        }
        v7.g.f(a10, "viewModel");
        i0 i0Var2 = (i0) m0Var.f5410a.put(str, a10);
        if (i0Var2 != null) {
            i0Var2.b();
        }
        return a10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(n0 n0Var) {
        this(r0, r2, r1 ? ((i) n0Var).g() : a.C0224a.f17563b);
        b bVar;
        v7.g.f(n0Var, "owner");
        m0 X = n0Var.X();
        boolean z10 = n0Var instanceof i;
        if (z10) {
            bVar = ((i) n0Var).f();
        } else {
            if (c.f5405a == null) {
                c.f5405a = new c();
            }
            bVar = c.f5405a;
            v7.g.c(bVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, b bVar) {
        this(n0Var.X(), bVar, n0Var instanceof i ? ((i) n0Var).g() : a.C0224a.f17563b);
        v7.g.f(n0Var, "owner");
    }
}
