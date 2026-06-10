package y9;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public final class b0 extends kotlin.reflect.jvm.internal.impl.types.b {

    /* renamed from: m  reason: collision with root package name */
    public final e0 f18942m;
    public final MemberScope n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z9.c cVar, boolean z10, e0 e0Var) {
        super(cVar, z10);
        v7.g.f(cVar, "originalTypeVariable");
        v7.g.f(e0Var, "constructor");
        this.f18942m = e0Var;
        this.n = cVar.u().f().w();
    }

    @Override // y9.r
    public final e0 U0() {
        return this.f18942m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b
    public final b0 d1(boolean z10) {
        return new b0(this.f14975j, z10, this.f18942m);
    }

    @Override // y9.v
    public final String toString() {
        StringBuilder sb = new StringBuilder("Stub (BI): ");
        sb.append(this.f14975j);
        sb.append(this.f14976k ? "?" : "");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b, y9.r
    public final MemberScope w() {
        return this.n;
    }
}
