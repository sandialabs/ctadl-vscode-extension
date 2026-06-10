package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final p.h<ClassLoader, p.h<String, Class<?>>> f5261a = new p.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        p.h<ClassLoader, p.h<String, Class<?>>> hVar = f5261a;
        p.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new p.h<>();
            hVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException(a4.b.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException(a4.b.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public Fragment a(String str) {
        throw null;
    }
}
