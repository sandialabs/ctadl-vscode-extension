package r8;

import b9.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class k extends p implements b9.k {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<?> f17155a;

    public k(Constructor<?> constructor) {
        v7.g.f(constructor, "member");
        this.f17155a = constructor;
    }

    @Override // r8.p
    public final Member T() {
        return this.f17155a;
    }

    @Override // b9.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f17155a.getTypeParameters();
        v7.g.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new v(typeVariable));
        }
        return arrayList;
    }

    @Override // b9.k
    public final List<z> m() {
        boolean z10;
        Constructor<?> constructor = this.f17155a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        v7.g.e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return EmptyList.f12981i;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) n7.i.f2(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                parameterAnnotations = (Annotation[][]) n7.i.f2(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
            }
            return U(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }
}
