package r8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class h extends u implements b9.f {

    /* renamed from: a  reason: collision with root package name */
    public final Type f17150a;

    /* renamed from: b  reason: collision with root package name */
    public final u f17151b;
    public final EmptyList c;

    public h(Type type) {
        u hVar;
        u uVar;
        this.f17150a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            v7.g.e(genericComponentType, "genericComponentType");
            boolean z10 = genericComponentType instanceof Class;
            if (z10) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    uVar = new s(cls);
                    this.f17151b = uVar;
                    this.c = EmptyList.f12981i;
                }
            }
            if (!(genericComponentType instanceof GenericArrayType) && (!z10 || !((Class) genericComponentType).isArray())) {
                if (genericComponentType instanceof WildcardType) {
                    hVar = new x((WildcardType) genericComponentType);
                } else {
                    hVar = new j(genericComponentType);
                }
            }
            hVar = new h(genericComponentType);
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    v7.g.e(componentType, "getComponentType()");
                    if (componentType.isPrimitive()) {
                        hVar = new s(componentType);
                    } else {
                        if (!(componentType instanceof GenericArrayType) && !componentType.isArray()) {
                            if (componentType instanceof WildcardType) {
                                hVar = new x((WildcardType) componentType);
                            } else {
                                hVar = new j(componentType);
                            }
                        }
                        hVar = new h(componentType);
                    }
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        uVar = hVar;
        this.f17151b = uVar;
        this.c = EmptyList.f12981i;
    }

    @Override // b9.f
    public final u I() {
        return this.f17151b;
    }

    @Override // r8.u
    public final Type T() {
        return this.f17150a;
    }

    @Override // b9.d
    public final Collection<b9.a> getAnnotations() {
        return this.c;
    }

    @Override // b9.d
    public final void s() {
    }
}
