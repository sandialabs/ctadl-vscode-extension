package r8;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes.dex */
public final class m extends e implements b9.m {

    /* renamed from: b  reason: collision with root package name */
    public final Enum<?> f17156b;

    public m(h9.e eVar, Enum<?> r22) {
        super(eVar);
        this.f17156b = r22;
    }

    @Override // b9.m
    public final h9.e a() {
        return h9.e.k(this.f17156b.name());
    }

    @Override // b9.m
    public final h9.b d() {
        Class<?> cls = this.f17156b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        v7.g.e(cls, "enumClass");
        return ReflectClassUtilKt.a(cls);
    }
}
