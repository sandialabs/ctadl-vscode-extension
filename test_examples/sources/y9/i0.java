package y9;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public final class i0 extends kotlin.reflect.jvm.internal.impl.types.q {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.q f18952b;

    public i0(kotlin.reflect.jvm.internal.impl.types.q qVar) {
        this.f18952b = qVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final m8.e c(m8.e eVar) {
        v7.g.f(eVar, "annotations");
        return this.f18952b.c(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final f0 d(r rVar) {
        return this.f18952b.d(rVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean e() {
        return this.f18952b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final r f(r rVar, Variance variance) {
        v7.g.f(rVar, "topLevelType");
        v7.g.f(variance, "position");
        return this.f18952b.f(rVar, variance);
    }
}
