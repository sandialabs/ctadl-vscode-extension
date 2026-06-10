package r8;

import b9.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes.dex */
public final class q extends p implements b9.q {

    /* renamed from: a  reason: collision with root package name */
    public final Method f17159a;

    public q(Method method) {
        v7.g.f(method, "member");
        this.f17159a = method;
    }

    @Override // b9.q
    public final boolean J() {
        Object oVar;
        Object defaultValue = this.f17159a.getDefaultValue();
        Object obj = null;
        if (defaultValue != null) {
            if (ReflectClassUtilKt.e(defaultValue.getClass())) {
                oVar = new m(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                oVar = new f(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                oVar = new g(null, (Object[]) defaultValue);
            } else if (defaultValue instanceof Class) {
                oVar = new i(null, (Class) defaultValue);
            } else {
                oVar = new o(defaultValue, null);
            }
            obj = oVar;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // r8.p
    public final Member T() {
        return this.f17159a;
    }

    @Override // b9.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f17159a.getTypeParameters();
        v7.g.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new v(typeVariable));
        }
        return arrayList;
    }

    @Override // b9.q
    public final u l() {
        u hVar;
        Type genericReturnType = this.f17159a.getGenericReturnType();
        v7.g.e(genericReturnType, "member.genericReturnType");
        boolean z10 = genericReturnType instanceof Class;
        if (z10) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new s(cls);
            }
        }
        if (!(genericReturnType instanceof GenericArrayType) && (!z10 || !((Class) genericReturnType).isArray())) {
            if (genericReturnType instanceof WildcardType) {
                hVar = new x((WildcardType) genericReturnType);
            } else {
                hVar = new j(genericReturnType);
            }
            return hVar;
        }
        hVar = new h(genericReturnType);
        return hVar;
    }

    @Override // b9.q
    public final List<z> m() {
        Method method = this.f17159a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        v7.g.e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        v7.g.e(parameterAnnotations, "member.parameterAnnotations");
        return U(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }
}
