package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.m;
import y9.m0;
import y9.r;

/* loaded from: classes.dex */
public final class g implements f {
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final KotlinTypePreparator f15002d;

    /* renamed from: e  reason: collision with root package name */
    public final OverridingUtil f15003e;

    public g(e.a aVar) {
        KotlinTypePreparator.a aVar2 = KotlinTypePreparator.a.f14979i;
        v7.g.f(aVar, "kotlinTypeRefiner");
        v7.g.f(aVar2, "kotlinTypePreparator");
        this.c = aVar;
        this.f15002d = aVar2;
        this.f15003e = new OverridingUtil(OverridingUtil.f14688g, aVar, aVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
    public final OverridingUtil a() {
        return this.f15003e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
    public final e b() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.d
    public final boolean c(r rVar, r rVar2) {
        v7.g.f(rVar, "a");
        v7.g.f(rVar2, "b");
        m a10 = a.a(false, false, null, this.f15002d, this.c, 6);
        m0 X0 = rVar.X0();
        m0 X02 = rVar2.X0();
        v7.g.f(X0, "a");
        v7.g.f(X02, "b");
        return kotlin.reflect.jvm.internal.impl.types.c.e(a10, X0, X02);
    }

    public final boolean d(r rVar, r rVar2) {
        v7.g.f(rVar, "subtype");
        v7.g.f(rVar2, "supertype");
        m a10 = a.a(true, false, null, this.f15002d, this.c, 6);
        m0 X0 = rVar.X0();
        m0 X02 = rVar2.X0();
        v7.g.f(X0, "subType");
        v7.g.f(X02, "superType");
        return kotlin.reflect.jvm.internal.impl.types.c.i(kotlin.reflect.jvm.internal.impl.types.c.f14978a, a10, X0, X02);
    }
}
