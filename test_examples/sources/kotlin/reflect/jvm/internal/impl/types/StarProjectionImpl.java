package kotlin.reflect.jvm.internal.impl.types;

import kotlin.LazyThreadSafetyMode;
import l8.i0;
import y9.f0;
import y9.g0;

/* loaded from: classes.dex */
public final class StarProjectionImpl extends g0 {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f14956a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.e f14957b;

    public StarProjectionImpl(i0 i0Var) {
        v7.g.f(i0Var, "typeParameter");
        this.f14956a = i0Var;
        this.f14957b = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new StarProjectionImpl$_type$2(this));
    }

    @Override // y9.f0
    public final Variance a() {
        return Variance.OUT_VARIANCE;
    }

    @Override // y9.f0
    public final y9.r b() {
        return (y9.r) this.f14957b.getValue();
    }

    @Override // y9.f0
    public final f0 c(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // y9.f0
    public final boolean d() {
        return true;
    }
}
