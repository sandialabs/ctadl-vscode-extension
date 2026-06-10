package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f5390a = a1.c.O0(Application.class, d0.class);

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f5391b = a1.c.N0(d0.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        v7.g.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        v7.g.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            v7.g.e(parameterTypes, "constructor.parameterTypes");
            List w22 = kotlin.collections.b.w2(parameterTypes);
            if (v7.g.a(list, w22)) {
                return constructor2;
            }
            if (list.size() == w22.size() && w22.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends i0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
