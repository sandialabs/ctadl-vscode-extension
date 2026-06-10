package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import v7.g;

/* loaded from: classes.dex */
public final class AnnotationConstructorCallerKt {
    public static final <T> T a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        g.f(cls, "annotationClass");
        g.f(list, "methods");
        m7.e b5 = kotlin.a.b(new AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2(map));
        T t10 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new g8.a(cls, map, kotlin.a.b(new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(cls, map)), b5, list));
        g.d(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }
}
