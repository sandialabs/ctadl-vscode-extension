package m9;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16019b = 1;

    public c(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // m9.g
    public final /* bridge */ /* synthetic */ y9.r a(l8.s sVar) {
        switch (this.f16019b) {
            case 0:
                return c(sVar);
            default:
                return c(sVar);
        }
    }

    public final y9.v c(l8.s sVar) {
        switch (this.f16019b) {
            case 0:
                v7.g.f(sVar, "module");
                kotlin.reflect.jvm.internal.impl.builtins.e u10 = sVar.u();
                u10.getClass();
                y9.v t10 = u10.t(PrimitiveType.n);
                if (t10 != null) {
                    return t10;
                }
                kotlin.reflect.jvm.internal.impl.builtins.e.a(63);
                throw null;
            default:
                v7.g.f(sVar, "module");
                kotlin.reflect.jvm.internal.impl.builtins.e u11 = sVar.u();
                u11.getClass();
                y9.v t11 = u11.t(PrimitiveType.f13301s);
                if (t11 != null) {
                    return t11;
                }
                kotlin.reflect.jvm.internal.impl.builtins.e.a(60);
                throw null;
        }
    }

    @Override // m9.g
    public final String toString() {
        switch (this.f16019b) {
            case 1:
                return ((Number) this.f16022a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(boolean z10) {
        super(Boolean.valueOf(z10));
    }
}
