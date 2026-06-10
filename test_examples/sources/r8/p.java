package r8;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;
import l8.m0;
import l8.n0;
import r8.c;

/* loaded from: classes.dex */
public abstract class p extends l implements b9.d, b9.r, b9.p {
    @Override // b9.r
    public final boolean C() {
        return Modifier.isAbstract(T().getModifiers());
    }

    @Override // b9.r
    public final boolean S() {
        return Modifier.isStatic(T().getModifiers());
    }

    public abstract Member T();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList U(Type[] typeArr, Annotation[][] annotationArr, boolean z10) {
        Method method;
        ArrayList arrayList;
        int i10;
        int length;
        int i11;
        u hVar;
        u uVar;
        String str;
        boolean z11;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        c cVar = c.f17142a;
        Member T = T();
        v7.g.f(T, "member");
        c.a aVar = c.f17143b;
        if (aVar == null) {
            synchronized (cVar) {
                aVar = c.f17143b;
                if (aVar == null) {
                    aVar = c.a(T);
                    c.f17143b = aVar;
                }
            }
        }
        Method method2 = aVar.f17144a;
        if (method2 != null && (method = aVar.f17145b) != null) {
            Object invoke = method2.invoke(T, new Object[0]);
            v7.g.d(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = method.invoke(obj, new Object[0]);
                v7.g.d(invoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) invoke2);
            }
            if (arrayList == null) {
                i10 = arrayList.size() - typeArr.length;
            } else {
                i10 = 0;
            }
            length = typeArr.length;
            for (i11 = 0; i11 < length; i11++) {
                Type type = typeArr[i11];
                v7.g.f(type, "type");
                boolean z12 = type instanceof Class;
                if (z12) {
                    Class cls = (Class) type;
                    if (cls.isPrimitive()) {
                        uVar = new s(cls);
                        if (arrayList != null) {
                            str = (String) kotlin.collections.c.q2(i11 + i10, arrayList);
                            if (str == null) {
                                throw new IllegalStateException(("No parameter with index " + i11 + '+' + i10 + " (name=" + getName() + " type=" + uVar + ") in " + this).toString());
                            }
                        } else {
                            str = null;
                        }
                        if (!z10 && i11 == typeArr.length - 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList2.add(new w(uVar, annotationArr[i11], str, z11));
                    }
                }
                if (!(type instanceof GenericArrayType) && (!z12 || !((Class) type).isArray())) {
                    if (type instanceof WildcardType) {
                        hVar = new x((WildcardType) type);
                    } else {
                        hVar = new j(type);
                    }
                    uVar = hVar;
                    if (arrayList != null) {
                    }
                    if (!z10) {
                    }
                    z11 = false;
                    arrayList2.add(new w(uVar, annotationArr[i11], str, z11));
                }
                hVar = new h(type);
                uVar = hVar;
                if (arrayList != null) {
                }
                if (!z10) {
                }
                z11 = false;
                arrayList2.add(new w(uVar, annotationArr[i11], str, z11));
            }
            return arrayList2;
        }
        arrayList = null;
        if (arrayList == null) {
        }
        length = typeArr.length;
        while (i11 < length) {
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && v7.g.a(T(), ((p) obj).T());
    }

    @Override // b9.r
    public final n0 g() {
        int modifiers = T().getModifiers();
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
        Member T = T();
        v7.g.d(T, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) T).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return m0.b.h0(declaredAnnotations);
        }
        return EmptyList.f12981i;
    }

    @Override // b9.s
    public final h9.e getName() {
        String name = T().getName();
        h9.e k3 = name != null ? h9.e.k(name) : null;
        return k3 == null ? h9.g.f11575a : k3;
    }

    public final int hashCode() {
        return T().hashCode();
    }

    @Override // b9.d
    public final b9.a j(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        Member T = T();
        v7.g.d(T, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) T).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return m0.b.a0(declaredAnnotations, cVar);
        }
        return null;
    }

    @Override // b9.d
    public final void s() {
    }

    @Override // b9.p
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a t() {
        Class<?> declaringClass = T().getDeclaringClass();
        v7.g.e(declaringClass, "member.declaringClass");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a(declaringClass);
    }

    public final String toString() {
        return getClass().getName() + ": " + T();
    }

    @Override // b9.r
    public final boolean w() {
        return Modifier.isFinal(T().getModifiers());
    }
}
