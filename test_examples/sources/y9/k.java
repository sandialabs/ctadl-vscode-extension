package y9;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public final class k extends kotlin.reflect.jvm.internal.impl.types.q {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f18954d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.q f18955b;
    public final kotlin.reflect.jvm.internal.impl.types.q c;

    public k(kotlin.reflect.jvm.internal.impl.types.q qVar, kotlin.reflect.jvm.internal.impl.types.q qVar2) {
        this.f18955b = qVar;
        this.c = qVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean a() {
        if (!this.f18955b.a() && !this.c.a()) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean b() {
        if (!this.f18955b.b() && !this.c.b()) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final m8.e c(m8.e eVar) {
        v7.g.f(eVar, "annotations");
        return this.c.c(this.f18955b.c(eVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final f0 d(r rVar) {
        f0 d5 = this.f18955b.d(rVar);
        return d5 == null ? this.c.d(rVar) : d5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final r f(r rVar, Variance variance) {
        v7.g.f(rVar, "topLevelType");
        v7.g.f(variance, "position");
        return this.c.f(this.f18955b.f(rVar, variance), variance);
    }
}
