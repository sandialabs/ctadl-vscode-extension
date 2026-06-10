package q8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes.dex */
public final class c {
    public static m9.f a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            v7.g.e(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (v7.g.a(cls, Void.TYPE)) {
                return new m9.f(h9.b.l(g.a.f13362d.h()), i10);
            }
            PrimitiveType j2 = JvmPrimitiveType.b(cls.getName()).j();
            v7.g.e(j2, "get(currentClass.name).primitiveType");
            if (i10 > 0) {
                return new m9.f(h9.b.l((h9.c) j2.f13308l.getValue()), i10 - 1);
            }
            return new m9.f(h9.b.l((h9.c) j2.f13307k.getValue()), i10);
        }
        h9.b a10 = ReflectClassUtilKt.a(cls);
        String str = k8.c.f12921a;
        h9.c b5 = a10.b();
        v7.g.e(b5, "javaClassId.asSingleFqName()");
        h9.b f10 = k8.c.f(b5);
        if (f10 != null) {
            a10 = f10;
        }
        return new m9.f(a10, i10);
    }

    public static void b(Class cls, h.c cVar) {
        v7.g.f(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        v7.g.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            v7.g.e(annotation, "annotation");
            c(cVar, annotation);
        }
        cVar.a();
    }

    public static void c(h.c cVar, Annotation annotation) {
        Class y02 = a1.c.y0(a1.c.t0(annotation));
        h.a b5 = cVar.b(ReflectClassUtilKt.a(y02), new b(annotation));
        if (b5 != null) {
            d(b5, annotation, y02);
        }
    }

    public static void d(h.a aVar, Annotation annotation, Class cls) {
        Object[] objArr;
        Object[] objArr2;
        Method[] declaredMethods = cls.getDeclaredMethods();
        v7.g.e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                v7.g.c(invoke);
                h9.e k3 = h9.e.k(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (v7.g.a(cls2, Class.class)) {
                    aVar.d(k3, a((Class) invoke));
                } else if (g.f16954a.contains(cls2)) {
                    aVar.c(invoke, k3);
                } else {
                    List<c8.b<? extends Object>> list = ReflectClassUtilKt.f13582a;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        v7.g.e(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        aVar.b(k3, ReflectClassUtilKt.a(cls2), h9.e.k(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        v7.g.e(interfaces, "clazz.interfaces");
                        Class cls3 = (Class) kotlin.collections.b.s2(interfaces);
                        v7.g.e(cls3, "annotationClass");
                        h.a e10 = aVar.e(ReflectClassUtilKt.a(cls3), k3);
                        if (e10 != null) {
                            d(e10, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        h.b f10 = aVar.f(k3);
                        if (f10 != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                h9.b a10 = ReflectClassUtilKt.a(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    v7.g.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    f10.d(a10, h9.e.k(((Enum) obj).name()));
                                }
                            } else if (v7.g.a(componentType, Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    v7.g.d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    f10.b(a((Class) obj2));
                                }
                            } else {
                                Object[] objArr3 = (Object[]) invoke;
                                if (Annotation.class.isAssignableFrom(componentType)) {
                                    for (Object obj3 : objArr3) {
                                        h.a c = f10.c(ReflectClassUtilKt.a(componentType));
                                        if (c != null) {
                                            v7.g.d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                            d(c, (Annotation) obj3, componentType);
                                        }
                                    }
                                } else {
                                    for (Object obj4 : objArr3) {
                                        f10.e(obj4);
                                    }
                                }
                            }
                            f10.a();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}
