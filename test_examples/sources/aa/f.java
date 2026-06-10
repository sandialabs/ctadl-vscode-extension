package aa;

import java.util.Arrays;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.l;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class f extends v {

    /* renamed from: j  reason: collision with root package name */
    public final e0 f397j;

    /* renamed from: k  reason: collision with root package name */
    public final MemberScope f398k;

    /* renamed from: l  reason: collision with root package name */
    public final ErrorTypeKind f399l;

    /* renamed from: m  reason: collision with root package name */
    public final List<f0> f400m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final String[] f401o;

    /* renamed from: p  reason: collision with root package name */
    public final String f402p;

    /* JADX WARN: Multi-variable type inference failed */
    public f(e0 e0Var, MemberScope memberScope, ErrorTypeKind errorTypeKind, List<? extends f0> list, boolean z10, String... strArr) {
        v7.g.f(e0Var, "constructor");
        v7.g.f(memberScope, "memberScope");
        v7.g.f(errorTypeKind, "kind");
        v7.g.f(list, "arguments");
        v7.g.f(strArr, "formatParams");
        this.f397j = e0Var;
        this.f398k = memberScope;
        this.f399l = errorTypeKind;
        this.f400m = list;
        this.n = z10;
        this.f401o = strArr;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(errorTypeKind.f15030i, Arrays.copyOf(copyOf, copyOf.length));
        v7.g.e(format, "format(format, *args)");
        this.f402p = format;
    }

    @Override // y9.r
    public final List<f0> S0() {
        return this.f400m;
    }

    @Override // y9.r
    public final l T0() {
        l.f15045j.getClass();
        return l.f15046k;
    }

    @Override // y9.r
    public final e0 U0() {
        return this.f397j;
    }

    @Override // y9.r
    public final boolean V0() {
        return this.n;
    }

    @Override // y9.r
    public final r W0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
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
        e0 e0Var = this.f397j;
        MemberScope memberScope = this.f398k;
        ErrorTypeKind errorTypeKind = this.f399l;
        List<f0> list = this.f400m;
        String[] strArr = this.f401o;
        return new f(e0Var, memberScope, errorTypeKind, list, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // y9.v
    public final v c1(l lVar) {
        v7.g.f(lVar, "newAttributes");
        return this;
    }

    @Override // y9.r
    public final MemberScope w() {
        return this.f398k;
    }
}
