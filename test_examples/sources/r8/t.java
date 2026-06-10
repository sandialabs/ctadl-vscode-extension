package r8;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import r8.a;

/* loaded from: classes.dex */
public final class t extends p implements b9.v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17163a;

    public t(Object obj) {
        v7.g.f(obj, "recordComponent");
        this.f17163a = obj;
    }

    @Override // r8.p
    public final Member T() {
        Object obj = this.f17163a;
        v7.g.f(obj, "recordComponent");
        a.C0217a c0217a = a.f17135a;
        Method method = null;
        if (c0217a == null) {
            Class<?> cls = obj.getClass();
            try {
                c0217a = new a.C0217a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0217a = new a.C0217a(null, null);
            }
            a.f17135a = c0217a;
        }
        Method method2 = c0217a.f17137b;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, new Object[0]);
            v7.g.d(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // b9.v
    public final b9.w b() {
        Object obj = this.f17163a;
        v7.g.f(obj, "recordComponent");
        a.C0217a c0217a = a.f17135a;
        Class cls = null;
        if (c0217a == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c0217a = new a.C0217a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0217a = new a.C0217a(null, null);
            }
            a.f17135a = c0217a;
        }
        Method method = c0217a.f17136a;
        if (method != null) {
            Object invoke = method.invoke(obj, new Object[0]);
            v7.g.d(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new j(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // b9.v
    public final boolean h() {
        return false;
    }
}
