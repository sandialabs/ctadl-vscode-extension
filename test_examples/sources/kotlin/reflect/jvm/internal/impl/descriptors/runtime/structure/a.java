package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import a1.c;
import b9.d;
import b9.g;
import b9.j;
import b9.r;
import g0.f1;
import h9.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import l8.m0;
import l8.n0;
import r8.b;
import r8.l;
import r8.t;
import r8.v;

/* loaded from: classes.dex */
public final class a extends l implements d, r, g {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f13595a;

    public a(Class<?> cls) {
        v7.g.f(cls, "klass");
        this.f13595a = cls;
    }

    @Override // b9.g
    public final a A() {
        Class<?> declaringClass = this.f13595a.getDeclaringClass();
        if (declaringClass != null) {
            return new a(declaringClass);
        }
        return null;
    }

    @Override // b9.g
    public final boolean B() {
        return this.f13595a.isInterface();
    }

    @Override // b9.r
    public final boolean C() {
        return Modifier.isAbstract(this.f13595a.getModifiers());
    }

    @Override // b9.g
    public final void D() {
    }

    @Override // b9.g
    public final List F() {
        Field[] declaredFields = this.f13595a.getDeclaredFields();
        v7.g.e(declaredFields, "klass.declaredFields");
        return c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.W0(kotlin.sequences.a.S0(b.i2(declaredFields), ReflectJavaClass$fields$1.f13589r), ReflectJavaClass$fields$2.f13590r)));
    }

    @Override // b9.g
    public final boolean G() {
        Class<?> cls = this.f13595a;
        v7.g.f(cls, "clazz");
        b.a aVar = r8.b.f17138a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            r8.b.f17138a = aVar;
        }
        Method method = aVar.c;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            v7.g.d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // b9.g
    public final void K() {
    }

    @Override // b9.g
    public final Collection<j> L() {
        Class<?> cls = this.f13595a;
        v7.g.f(cls, "clazz");
        b.a aVar = r8.b.f17138a;
        Class[] clsArr = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            r8.b.f17138a = aVar;
        }
        Method method = aVar.f17140b;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            v7.g.d(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) invoke;
        }
        if (clsArr != null) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new r8.j(cls2));
            }
            return arrayList;
        }
        return EmptyList.f12981i;
    }

    @Override // b9.g
    public final List N() {
        Method[] declaredMethods = this.f13595a.getDeclaredMethods();
        v7.g.e(declaredMethods, "klass.declaredMethods");
        return c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.W0(kotlin.sequences.a.R0(kotlin.collections.b.i2(declaredMethods), new ReflectJavaClass$methods$1(this)), ReflectJavaClass$methods$2.f13594r)));
    }

    @Override // b9.g
    public final List R() {
        Class<?>[] declaredClasses = this.f13595a.getDeclaredClasses();
        v7.g.e(declaredClasses, "klass.declaredClasses");
        return c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.X0(kotlin.sequences.a.S0(kotlin.collections.b.i2(declaredClasses), ReflectJavaClass$innerClassNames$1.f13591j), ReflectJavaClass$innerClassNames$2.f13592j)));
    }

    @Override // b9.r
    public final boolean S() {
        return Modifier.isStatic(this.f13595a.getModifiers());
    }

    @Override // b9.g
    public final h9.c e() {
        h9.c b5 = ReflectClassUtilKt.a(this.f13595a).b();
        v7.g.e(b5, "klass.classId.asSingleFqName()");
        return b5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (v7.g.a(this.f13595a, ((a) obj).f13595a)) {
                return true;
            }
        }
        return false;
    }

    @Override // b9.g
    public final Collection<j> f() {
        Class<?> cls = this.f13595a;
        Object obj = Object.class;
        if (v7.g.a(cls, obj)) {
            return EmptyList.f12981i;
        }
        f1 f1Var = new f1(2);
        Object genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        f1Var.a(obj);
        Type[] genericInterfaces = cls.getGenericInterfaces();
        v7.g.e(genericInterfaces, "klass.genericInterfaces");
        f1Var.b(genericInterfaces);
        List<Type> O0 = c.O0(f1Var.g(new Type[f1Var.f()]));
        ArrayList arrayList = new ArrayList(n7.l.Z1(O0, 10));
        for (Type type : O0) {
            arrayList.add(new r8.j(type));
        }
        return arrayList;
    }

    @Override // b9.r
    public final n0 g() {
        int modifiers = this.f13595a.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return m0.h.c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return m0.e.c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return p8.c.c;
            }
            return p8.b.c;
        }
        return p8.a.c;
    }

    @Override // b9.d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.f13595a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return m0.b.h0(declaredAnnotations);
        }
        return EmptyList.f12981i;
    }

    @Override // b9.s
    public final e getName() {
        return e.k(this.f13595a.getSimpleName());
    }

    @Override // b9.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f13595a.getTypeParameters();
        v7.g.e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new v(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f13595a.hashCode();
    }

    @Override // b9.d
    public final b9.a j(h9.c cVar) {
        Annotation[] declaredAnnotations;
        v7.g.f(cVar, "fqName");
        Class<?> cls = this.f13595a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return m0.b.a0(declaredAnnotations, cVar);
        }
        return null;
    }

    @Override // b9.g
    public final List k() {
        Constructor<?>[] declaredConstructors = this.f13595a.getDeclaredConstructors();
        v7.g.e(declaredConstructors, "klass.declaredConstructors");
        return c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.W0(kotlin.sequences.a.S0(kotlin.collections.b.i2(declaredConstructors), ReflectJavaClass$constructors$1.f13587r), ReflectJavaClass$constructors$2.f13588r)));
    }

    @Override // b9.g
    public final boolean p() {
        return this.f13595a.isEnum();
    }

    @Override // b9.g
    public final ArrayList r() {
        Class<?> cls = this.f13595a;
        v7.g.f(cls, "clazz");
        b.a aVar = r8.b.f17138a;
        Object[] objArr = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            r8.b.f17138a = aVar;
        }
        Method method = aVar.f17141d;
        if (method != null) {
            objArr = (Object[]) method.invoke(cls, new Object[0]);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new t(obj));
        }
        return arrayList;
    }

    @Override // b9.d
    public final void s() {
    }

    public final String toString() {
        return a.class.getName() + ": " + this.f13595a;
    }

    @Override // b9.g
    public final boolean u() {
        Class<?> cls = this.f13595a;
        v7.g.f(cls, "clazz");
        b.a aVar = r8.b.f17138a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            r8.b.f17138a = aVar;
        }
        Method method = aVar.f17139a;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            v7.g.d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // b9.r
    public final boolean w() {
        return Modifier.isFinal(this.f13595a.getModifiers());
    }

    @Override // b9.g
    public final boolean z() {
        return this.f13595a.isAnnotation();
    }
}
