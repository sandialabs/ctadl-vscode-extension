package g8;

import a1.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import m7.e;
import v7.g;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Class f11263a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f11264b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final e f11265d;

    /* renamed from: e  reason: collision with root package name */
    public final List f11266e;

    public a(Class cls, Map map, e eVar, e eVar2, List list) {
        this.f11263a = cls;
        this.f11264b = map;
        this.c = eVar;
        this.f11265d = eVar2;
        this.f11266e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z10;
        Annotation annotation;
        boolean a10;
        boolean z11;
        Class cls = this.f11263a;
        g.f(cls, "$annotationClass");
        Map map = this.f11264b;
        g.f(map, "$values");
        e eVar = this.c;
        g.f(eVar, "$toString$delegate");
        e eVar2 = this.f11265d;
        g.f(eVar2, "$hashCode$delegate");
        List<Method> list = this.f11266e;
        g.f(list, "$methods");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) eVar2.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) eVar.getValue();
            }
        }
        boolean z12 = false;
        if (g.a(name, "equals")) {
            if (objArr != null && objArr.length == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g.e(objArr, "args");
                Object s22 = kotlin.collections.b.s2(objArr);
                Class cls2 = null;
                if (s22 instanceof Annotation) {
                    annotation = (Annotation) s22;
                } else {
                    annotation = null;
                }
                if (annotation != null) {
                    cls2 = c.y0(c.t0(annotation));
                }
                if (g.a(cls2, cls)) {
                    if (!list.isEmpty()) {
                        for (Method method2 : list) {
                            Object obj2 = map.get(method2.getName());
                            Object invoke = method2.invoke(s22, new Object[0]);
                            if (obj2 instanceof boolean[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                a10 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                                continue;
                            } else if (obj2 instanceof char[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                                a10 = Arrays.equals((char[]) obj2, (char[]) invoke);
                                continue;
                            } else if (obj2 instanceof byte[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                a10 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                                continue;
                            } else if (obj2 instanceof short[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                a10 = Arrays.equals((short[]) obj2, (short[]) invoke);
                                continue;
                            } else if (obj2 instanceof int[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                                a10 = Arrays.equals((int[]) obj2, (int[]) invoke);
                                continue;
                            } else if (obj2 instanceof float[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                a10 = Arrays.equals((float[]) obj2, (float[]) invoke);
                                continue;
                            } else if (obj2 instanceof long[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                                a10 = Arrays.equals((long[]) obj2, (long[]) invoke);
                                continue;
                            } else if (obj2 instanceof double[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                a10 = Arrays.equals((double[]) obj2, (double[]) invoke);
                                continue;
                            } else if (obj2 instanceof Object[]) {
                                g.d(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                a10 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                                continue;
                            } else {
                                a10 = g.a(obj2, invoke);
                                continue;
                            }
                            if (!a10) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                        z12 = true;
                    }
                }
                return Boolean.valueOf(z12);
            }
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(kotlin.collections.b.w2(objArr));
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }
}
