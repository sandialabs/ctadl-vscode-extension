package r8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class i extends e implements b9.h {

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f17152b;

    public i(h9.e eVar, Class<?> cls) {
        super(eVar);
        this.f17152b = cls;
    }

    @Override // b9.h
    public final u e() {
        Class<?> cls = this.f17152b;
        v7.g.f(cls, "type");
        if (cls.isPrimitive()) {
            return new s(cls);
        }
        if (!(cls instanceof GenericArrayType) && !cls.isArray()) {
            return cls instanceof WildcardType ? new x((WildcardType) cls) : new j(cls);
        }
        return new h(cls);
    }
}
