package j4;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final p.b<String, Method> f12673a;

    /* renamed from: b  reason: collision with root package name */
    public final p.b<String, Method> f12674b;
    public final p.b<String, Class> c;

    public a(p.b<String, Method> bVar, p.b<String, Method> bVar2, p.b<String, Class> bVar3) {
        this.f12673a = bVar;
        this.f12674b = bVar2;
        this.c = bVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) {
        String name = cls.getName();
        p.b<String, Class> bVar = this.c;
        Class orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            bVar.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method c(String str) {
        p.b<String, Method> bVar = this.f12673a;
        Method orDefault = bVar.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            bVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        p.b<String, Method> bVar = this.f12674b;
        Method orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class b5 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b5.getDeclaredMethod("write", cls, a.class);
            bVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i10);

    public abstract int i();

    public abstract <T extends Parcelable> T j();

    public abstract String k();

    public final <T extends c> T l() {
        String k3 = k();
        if (k3 == null) {
            return null;
        }
        try {
            return (T) c(k3).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void m(int i10);

    public abstract void n(boolean z10);

    public abstract void o(byte[] bArr);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i10);

    public abstract void r(Parcelable parcelable);

    public abstract void s(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(c cVar) {
        if (cVar == null) {
            s(null);
            return;
        }
        try {
            s(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                a10.u();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
