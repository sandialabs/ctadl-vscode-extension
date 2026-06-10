package r8;

import b9.a0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class x extends u implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final WildcardType f17168a;

    /* renamed from: b  reason: collision with root package name */
    public final EmptyList f17169b = EmptyList.f12981i;

    public x(WildcardType wildcardType) {
        this.f17168a = wildcardType;
    }

    @Override // b9.a0
    public final boolean E() {
        Type[] upperBounds = this.f17168a.getUpperBounds();
        v7.g.e(upperBounds, "reflectType.upperBounds");
        return !v7.g.a(kotlin.collections.b.m2(upperBounds), Object.class);
    }

    @Override // b9.a0
    public final u H() {
        u hVar;
        WildcardType wildcardType = this.f17168a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                Object s22 = kotlin.collections.b.s2(lowerBounds);
                v7.g.e(s22, "lowerBounds.single()");
                Type type = (Type) s22;
                boolean z10 = type instanceof Class;
                if (z10) {
                    Class cls = (Class) type;
                    if (cls.isPrimitive()) {
                        return new s(cls);
                    }
                }
                if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                    if (type instanceof WildcardType) {
                        hVar = new x((WildcardType) type);
                    } else {
                        hVar = new j(type);
                    }
                }
                hVar = new h(type);
            } else {
                if (upperBounds.length == 1) {
                    Type type2 = (Type) kotlin.collections.b.s2(upperBounds);
                    if (!v7.g.a(type2, Object.class)) {
                        v7.g.e(type2, "ub");
                        boolean z11 = type2 instanceof Class;
                        if (z11) {
                            Class cls2 = (Class) type2;
                            if (cls2.isPrimitive()) {
                                return new s(cls2);
                            }
                        }
                        if (!(type2 instanceof GenericArrayType) && (!z11 || !((Class) type2).isArray())) {
                            if (type2 instanceof WildcardType) {
                                hVar = new x((WildcardType) type2);
                            } else {
                                hVar = new j(type2);
                            }
                        }
                        hVar = new h(type2);
                    }
                }
                return null;
            }
            return hVar;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
    }

    @Override // r8.u
    public final Type T() {
        return this.f17168a;
    }

    @Override // b9.d
    public final Collection<b9.a> getAnnotations() {
        return this.f17169b;
    }

    @Override // b9.d
    public final void s() {
    }
}
