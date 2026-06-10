package r8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes.dex */
public final class d extends l implements b9.a {

    /* renamed from: a  reason: collision with root package name */
    public final Annotation f17146a;

    public d(Annotation annotation) {
        v7.g.f(annotation, "annotation");
        this.f17146a = annotation;
    }

    @Override // b9.a
    public final void O() {
    }

    @Override // b9.a
    public final ArrayList a() {
        b9.b oVar;
        Annotation annotation = this.f17146a;
        Method[] declaredMethods = a1.c.y0(a1.c.t0(annotation)).getDeclaredMethods();
        v7.g.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, new Object[0]);
            v7.g.e(invoke, "method.invoke(annotation)");
            h9.e k3 = h9.e.k(method.getName());
            Class<?> cls = invoke.getClass();
            List<c8.b<? extends Object>> list = ReflectClassUtilKt.f13582a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new m(k3, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                oVar = new f(k3, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                oVar = new g(k3, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                oVar = new i(k3, (Class) invoke);
            } else {
                oVar = new o(invoke, k3);
            }
            arrayList.add(oVar);
        }
        return arrayList;
    }

    @Override // b9.a
    public final h9.b d() {
        return ReflectClassUtilKt.a(a1.c.y0(a1.c.t0(this.f17146a)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (this.f17146a == ((d) obj).f17146a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f17146a);
    }

    @Override // b9.a
    public final void i() {
    }

    @Override // b9.a
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a q() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a(a1.c.y0(a1.c.t0(this.f17146a)));
    }

    public final String toString() {
        return d.class.getName() + ": " + this.f17146a;
    }
}
