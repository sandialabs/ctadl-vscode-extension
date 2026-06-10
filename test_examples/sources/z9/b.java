package z9;

import aa.h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import v7.g;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public final class b extends v implements ba.b {

    /* renamed from: j  reason: collision with root package name */
    public final CaptureStatus f19184j;

    /* renamed from: k  reason: collision with root package name */
    public final NewCapturedTypeConstructor f19185k;

    /* renamed from: l  reason: collision with root package name */
    public final m0 f19186l;

    /* renamed from: m  reason: collision with root package name */
    public final l f19187m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f19188o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, m0 m0Var, l lVar, boolean z10, int i10) {
        this(captureStatus, newCapturedTypeConstructor, m0Var, lVar, (i10 & 16) != 0 ? false : z10, false);
        if ((i10 & 8) != 0) {
            l.f15045j.getClass();
            lVar = l.f15046k;
        }
    }

    public b(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, m0 m0Var, l lVar, boolean z10, boolean z11) {
        g.f(captureStatus, "captureStatus");
        g.f(newCapturedTypeConstructor, "constructor");
        g.f(lVar, "attributes");
        this.f19184j = captureStatus;
        this.f19185k = newCapturedTypeConstructor;
        this.f19186l = m0Var;
        this.f19187m = lVar;
        this.n = z10;
        this.f19188o = z11;
    }

    @Override // y9.r
    public final List<f0> S0() {
        return EmptyList.f12981i;
    }

    @Override // y9.r
    public final l T0() {
        return this.f19187m;
    }

    @Override // y9.r
    public final e0 U0() {
        return this.f19185k;
    }

    @Override // y9.r
    public final boolean V0() {
        return this.n;
    }

    @Override // y9.v, y9.m0
    public final m0 Y0(boolean z10) {
        return new b(this.f19184j, this.f19185k, this.f19186l, this.f19187m, z10, 32);
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        return new b(this.f19184j, this.f19185k, this.f19186l, this.f19187m, z10, 32);
    }

    @Override // y9.v
    public final v c1(l lVar) {
        g.f(lVar, "newAttributes");
        return new b(this.f19184j, this.f19185k, this.f19186l, lVar, this.n, this.f19188o);
    }

    @Override // y9.m0
    /* renamed from: d1 */
    public final b Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        m0 m0Var;
        g.f(eVar, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f19184j;
        NewCapturedTypeConstructor g10 = this.f19185k.g(eVar);
        m0 m0Var2 = this.f19186l;
        if (m0Var2 != null) {
            m0Var = eVar.P0(m0Var2).X0();
        } else {
            m0Var = null;
        }
        return new b(captureStatus, g10, m0Var, this.f19187m, this.n, 32);
    }

    @Override // y9.r
    public final MemberScope w() {
        return h.a(ErrorScopeKind.f15008j, true, new String[0]);
    }
}
