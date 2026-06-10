package y9;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public class h extends kotlin.reflect.jvm.internal.impl.types.q {

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.q f18949b;

    public h(kotlin.reflect.jvm.internal.impl.types.q qVar) {
        this.f18949b = qVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean a() {
        return this.f18949b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final m8.e c(m8.e eVar) {
        v7.g.f(eVar, "annotations");
        return this.f18949b.c(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean e() {
        return this.f18949b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final r f(r rVar, Variance variance) {
        v7.g.f(rVar, "topLevelType");
        v7.g.f(variance, "position");
        return this.f18949b.f(rVar, variance);
    }
}
