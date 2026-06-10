package kotlin.reflect.jvm.internal;

import g9.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class JvmFunctionSignature {

    /* loaded from: classes.dex */
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* renamed from: a  reason: collision with root package name */
        public final List<Method> f13084a;

        /* loaded from: classes.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(((Method) t10).getName(), ((Method) t11).getName());
            }
        }

        public FakeJavaAnnotationConstructor(Class<?> cls) {
            v7.g.f(cls, "jClass");
            Method[] declaredMethods = cls.getDeclaredMethods();
            v7.g.e(declaredMethods, "jClass.declaredMethods");
            this.f13084a = kotlin.collections.b.t2(declaredMethods, new a());
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        public final String a() {
            return kotlin.collections.c.t2(this.f13084a, "", "<init>(", ")V", JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1.f13085j, 24);
        }
    }

    /* loaded from: classes.dex */
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* renamed from: a  reason: collision with root package name */
        public final Constructor<?> f13086a;

        public JavaConstructor(Constructor<?> constructor) {
            v7.g.f(constructor, "constructor");
            this.f13086a = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        public final String a() {
            Class<?>[] parameterTypes = this.f13086a.getParameterTypes();
            v7.g.e(parameterTypes, "constructor.parameterTypes");
            return kotlin.collections.b.q2(parameterTypes, "", "<init>(", ")V", JvmFunctionSignature$JavaConstructor$asString$1.f13087j, 24);
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends JvmFunctionSignature {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13088a;

        public a(Method method) {
            this.f13088a = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        public final String a() {
            return j.a(this.f13088a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends JvmFunctionSignature {

        /* renamed from: a  reason: collision with root package name */
        public final d.b f13089a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13090b;

        public b(d.b bVar) {
            this.f13089a = bVar;
            this.f13090b = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        public final String a() {
            return this.f13090b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends JvmFunctionSignature {

        /* renamed from: a  reason: collision with root package name */
        public final d.b f13091a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13092b;

        public c(d.b bVar) {
            this.f13091a = bVar;
            this.f13092b = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        public final String a() {
            return this.f13092b;
        }
    }

    public abstract String a();
}
