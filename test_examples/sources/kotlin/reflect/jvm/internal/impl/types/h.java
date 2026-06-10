package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.s;
import y9.t;
import y9.v;
import y9.w;

/* loaded from: classes.dex */
public final class h extends v {

    /* renamed from: j  reason: collision with root package name */
    public final e0 f15035j;

    /* renamed from: k  reason: collision with root package name */
    public final List<f0> f15036k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f15037l;

    /* renamed from: m  reason: collision with root package name */
    public final MemberScope f15038m;
    public final u7.l<kotlin.reflect.jvm.internal.impl.types.checker.e, v> n;

    /* JADX WARN: Multi-variable type inference failed */
    public h(e0 e0Var, List<? extends f0> list, boolean z10, MemberScope memberScope, u7.l<? super kotlin.reflect.jvm.internal.impl.types.checker.e, ? extends v> lVar) {
        v7.g.f(e0Var, "constructor");
        v7.g.f(list, "arguments");
        v7.g.f(memberScope, "memberScope");
        v7.g.f(lVar, "refinedTypeFactory");
        this.f15035j = e0Var;
        this.f15036k = list;
        this.f15037l = z10;
        this.f15038m = memberScope;
        this.n = lVar;
        if ((memberScope instanceof aa.e) && !(memberScope instanceof aa.i)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + e0Var);
        }
    }

    @Override // y9.r
    public final List<f0> S0() {
        return this.f15036k;
    }

    @Override // y9.r
    public final l T0() {
        l.f15045j.getClass();
        return l.f15046k;
    }

    @Override // y9.r
    public final e0 U0() {
        return this.f15035j;
    }

    @Override // y9.r
    public final boolean V0() {
        return this.f15037l;
    }

    @Override // y9.r
    public final y9.r W0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        v U = this.n.U(eVar);
        if (U == null) {
            return this;
        }
        return U;
    }

    @Override // y9.m0
    public final m0 Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        v U = this.n.U(eVar);
        if (U == null) {
            return this;
        }
        return U;
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        return z10 == this.f15037l ? this : z10 ? new t(this) : new s(this);
    }

    @Override // y9.v
    public final v c1(l lVar) {
        v7.g.f(lVar, "newAttributes");
        return lVar.isEmpty() ? this : new w(this, lVar);
    }

    @Override // y9.r
    public final MemberScope w() {
        return this.f15038m;
    }
}
