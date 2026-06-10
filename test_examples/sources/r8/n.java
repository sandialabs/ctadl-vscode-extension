package r8;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class n extends p implements b9.n {

    /* renamed from: a  reason: collision with root package name */
    public final Field f17157a;

    public n(Field field) {
        v7.g.f(field, "member");
        this.f17157a = field;
    }

    @Override // b9.n
    public final void M() {
    }

    @Override // r8.p
    public final Member T() {
        return this.f17157a;
    }

    @Override // b9.n
    public final b9.w b() {
        b9.w hVar;
        Type genericType = this.f17157a.getGenericType();
        v7.g.e(genericType, "member.genericType");
        boolean z10 = genericType instanceof Class;
        if (z10) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new s(cls);
            }
        }
        if (!(genericType instanceof GenericArrayType) && (!z10 || !((Class) genericType).isArray())) {
            if (genericType instanceof WildcardType) {
                hVar = new x((WildcardType) genericType);
            } else {
                hVar = new j(genericType);
            }
            return hVar;
        }
        hVar = new h(genericType);
        return hVar;
    }

    @Override // b9.n
    public final boolean x() {
        return this.f17157a.isEnumConstant();
    }
}
