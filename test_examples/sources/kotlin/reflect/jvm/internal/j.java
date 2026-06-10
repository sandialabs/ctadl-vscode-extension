package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes.dex */
public final class j {
    public static final String a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        v7.g.e(parameterTypes, "parameterTypes");
        sb.append(kotlin.collections.b.q2(parameterTypes, "", "(", ")", RuntimeTypeMapperKt$signature$1.f13235j, 24));
        Class<?> returnType = method.getReturnType();
        v7.g.e(returnType, "returnType");
        sb.append(ReflectClassUtilKt.b(returnType));
        return sb.toString();
    }
}
