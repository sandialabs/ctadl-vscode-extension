package r8;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f17142a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static a f17143b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17144a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f17145b;

        public a(Method method, Method method2) {
            this.f17144a = method;
            this.f17145b = method2;
        }
    }

    public static a a(Member member) {
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }
}
