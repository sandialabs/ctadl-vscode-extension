package r8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes.dex */
public final class j extends u implements b9.j {

    /* renamed from: a  reason: collision with root package name */
    public final Type f17153a;

    /* renamed from: b  reason: collision with root package name */
    public final l f17154b;

    public j(Type type) {
        l aVar;
        v7.g.f(type, "reflectType");
        this.f17153a = type;
        if (type instanceof Class) {
            aVar = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a((Class) type);
        } else if (type instanceof TypeVariable) {
            aVar = new v((TypeVariable) type);
        } else if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
        } else {
            Type rawType = ((ParameterizedType) type).getRawType();
            v7.g.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a((Class) rawType);
        }
        this.f17154b = aVar;
    }

    @Override // b9.j
    public final boolean P() {
        Type type = this.f17153a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            v7.g.e(typeParameters, "getTypeParameters()");
            return (typeParameters.length == 0) ^ true;
        }
        return false;
    }

    @Override // b9.j
    public final String Q() {
        throw new UnsupportedOperationException("Type not found: " + this.f17153a);
    }

    @Override // r8.u
    public final Type T() {
        return this.f17153a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r8.l, b9.i] */
    @Override // b9.j
    public final b9.i c() {
        return this.f17154b;
    }

    @Override // b9.d
    public final Collection<b9.a> getAnnotations() {
        return EmptyList.f12981i;
    }

    @Override // r8.u, b9.d
    public final b9.a j(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        return null;
    }

    @Override // b9.d
    public final void s() {
    }

    @Override // b9.j
    public final ArrayList v() {
        b9.d dVar;
        b9.d dVar2;
        List<Type> c = ReflectClassUtilKt.c(this.f17153a);
        ArrayList arrayList = new ArrayList(n7.l.Z1(c, 10));
        for (Type type : c) {
            v7.g.f(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    dVar2 = new s(cls);
                    arrayList.add(dVar2);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    dVar = new x((WildcardType) type);
                } else {
                    dVar = new j(type);
                }
                dVar2 = dVar;
                arrayList.add(dVar2);
            }
            dVar = new h(type);
            dVar2 = dVar;
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    @Override // b9.j
    public final String y() {
        return this.f17153a.toString();
    }
}
