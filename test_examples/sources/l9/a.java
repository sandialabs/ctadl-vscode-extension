package l9;

import aa.h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.l;
import v7.g;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class a extends v implements ba.b {

    /* renamed from: j  reason: collision with root package name */
    public final f0 f15862j;

    /* renamed from: k  reason: collision with root package name */
    public final b f15863k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f15864l;

    /* renamed from: m  reason: collision with root package name */
    public final l f15865m;

    public a(f0 f0Var, b bVar, boolean z10, l lVar) {
        g.f(f0Var, "typeProjection");
        g.f(bVar, "constructor");
        g.f(lVar, "attributes");
        this.f15862j = f0Var;
        this.f15863k = bVar;
        this.f15864l = z10;
        this.f15865m = lVar;
    }

    @Override // y9.r
    public final List<f0> S0() {
        return EmptyList.f12981i;
    }

    @Override // y9.r
    public final l T0() {
        return this.f15865m;
    }

    @Override // y9.r
    public final e0 U0() {
        return this.f15863k;
    }

    @Override // y9.r
    public final boolean V0() {
        return this.f15864l;
    }

    @Override // y9.r
    public final r W0(e eVar) {
        g.f(eVar, "kotlinTypeRefiner");
        f0 c = this.f15862j.c(eVar);
        g.e(c, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(c, this.f15863k, this.f15864l, this.f15865m);
    }

    @Override // y9.v, y9.m0
    public final m0 Y0(boolean z10) {
        if (z10 == this.f15864l) {
            return this;
        }
        return new a(this.f15862j, this.f15863k, z10, this.f15865m);
    }

    @Override // y9.m0
    public final m0 Z0(e eVar) {
        g.f(eVar, "kotlinTypeRefiner");
        f0 c = this.f15862j.c(eVar);
        g.e(c, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(c, this.f15863k, this.f15864l, this.f15865m);
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        if (z10 == this.f15864l) {
            return this;
        }
        return new a(this.f15862j, this.f15863k, z10, this.f15865m);
    }

    @Override // y9.v
    public final v c1(l lVar) {
        g.f(lVar, "newAttributes");
        return new a(this.f15862j, this.f15863k, this.f15864l, lVar);
    }

    @Override // y9.v
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f15862j);
        sb.append(')');
        sb.append(this.f15864l ? "?" : "");
        return sb.toString();
    }

    @Override // y9.r
    public final MemberScope w() {
        return h.a(ErrorScopeKind.f15008j, true, new String[0]);
    }
}
