package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import y9.b0;
import y9.f0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public abstract class b extends v {

    /* renamed from: j  reason: collision with root package name */
    public final z9.c f14975j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f14976k;

    /* renamed from: l  reason: collision with root package name */
    public final aa.e f14977l;

    public b(z9.c cVar, boolean z10) {
        v7.g.f(cVar, "originalTypeVariable");
        this.f14975j = cVar;
        this.f14976k = z10;
        this.f14977l = aa.h.b(ErrorScopeKind.f15011m, cVar.toString());
    }

    @Override // y9.r
    public final List<f0> S0() {
        return EmptyList.f12981i;
    }

    @Override // y9.r
    public final l T0() {
        l.f15045j.getClass();
        return l.f15046k;
    }

    @Override // y9.r
    public final boolean V0() {
        return this.f14976k;
    }

    @Override // y9.r
    public final y9.r W0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // y9.m0
    public final m0 Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // y9.v, y9.m0
    public final m0 a1(l lVar) {
        v7.g.f(lVar, "newAttributes");
        return this;
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        return z10 == this.f14976k ? this : d1(z10);
    }

    @Override // y9.v
    public final v c1(l lVar) {
        v7.g.f(lVar, "newAttributes");
        return this;
    }

    public abstract b0 d1(boolean z10);

    @Override // y9.r
    public MemberScope w() {
        return this.f14977l;
    }
}
