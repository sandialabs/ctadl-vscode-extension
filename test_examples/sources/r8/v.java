package r8;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class v extends l implements b9.d, b9.x {

    /* renamed from: a  reason: collision with root package name */
    public final TypeVariable<?> f17164a;

    public v(TypeVariable<?> typeVariable) {
        v7.g.f(typeVariable, "typeVariable");
        this.f17164a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            if (v7.g.a(this.f17164a, ((v) obj).f17164a)) {
                return true;
            }
        }
        return false;
    }

    @Override // b9.d
    public final Collection getAnnotations() {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.f17164a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement != null && (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) != null) {
            return m0.b.h0(declaredAnnotations);
        }
        return EmptyList.f12981i;
    }

    @Override // b9.s
    public final h9.e getName() {
        return h9.e.k(this.f17164a.getName());
    }

    @Override // b9.x
    public final Collection getUpperBounds() {
        Type type;
        Type[] bounds = this.f17164a.getBounds();
        v7.g.e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new j(type2));
        }
        j jVar = (j) kotlin.collections.c.E2(arrayList);
        if (jVar != null) {
            type = jVar.f17153a;
        } else {
            type = null;
        }
        if (v7.g.a(type, Object.class)) {
            return EmptyList.f12981i;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f17164a.hashCode();
    }

    @Override // b9.d
    public final b9.a j(h9.c cVar) {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        v7.g.f(cVar, "fqName");
        TypeVariable<?> typeVariable = this.f17164a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return m0.b.a0(declaredAnnotations, cVar);
    }

    @Override // b9.d
    public final void s() {
    }

    public final String toString() {
        return v.class.getName() + ": " + this.f17164a;
    }
}
