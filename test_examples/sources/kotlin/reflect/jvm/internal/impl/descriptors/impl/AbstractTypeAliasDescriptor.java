package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.r;
import l8.d0;
import l8.f;
import l8.h;
import l8.h0;
import l8.i0;
import l8.m;
import o8.o;
import v7.g;
import w9.i;
import y9.e0;
import y9.v;

/* loaded from: classes.dex */
public abstract class AbstractTypeAliasDescriptor extends o implements h0 {

    /* renamed from: m  reason: collision with root package name */
    public final m f13510m;
    public List<? extends i0> n;

    /* renamed from: o  reason: collision with root package name */
    public final o8.e f13511o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractTypeAliasDescriptor(f fVar, m8.e eVar, h9.e eVar2, m mVar) {
        super(fVar, eVar, eVar2, r0);
        d0.a aVar = d0.f15835a;
        g.f(fVar, "containingDeclaration");
        g.f(mVar, "visibilityImpl");
        this.f13510m = mVar;
        this.f13511o = new o8.e(this);
    }

    @Override // l8.r
    public final boolean D() {
        return false;
    }

    @Override // l8.r
    public final boolean L0() {
        return false;
    }

    public final v M0() {
        MemberScope memberScope;
        i iVar = (i) this;
        l8.b n = iVar.n();
        if (n == null || (memberScope = n.I0()) == null) {
            memberScope = MemberScope.a.f14741b;
        }
        return r.o(this, memberScope, new AbstractTypeAliasDescriptor$computeDefaultType$1(iVar));
    }

    @Override // o8.o, o8.n, l8.f
    public final l8.d a() {
        return this;
    }

    @Override // o8.o, o8.n, l8.f
    public final f a() {
        return this;
    }

    @Override // l8.j, l8.r
    public final m g() {
        return this.f13510m;
    }

    @Override // l8.r
    public final boolean l0() {
        return false;
    }

    @Override // l8.e
    public final boolean m0() {
        return r.c(((i) this).F(), new AbstractTypeAliasDescriptor$isInner$1(this));
    }

    @Override // l8.f
    public final <R, D> R n0(h<R, D> hVar, D d5) {
        return hVar.h(this, d5);
    }

    @Override // l8.d
    public final e0 o() {
        return this.f13511o;
    }

    @Override // o8.n
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // l8.e
    public final List<i0> x() {
        List list = this.n;
        if (list != null) {
            return list;
        }
        g.l("declaredTypeParametersImpl");
        throw null;
    }

    @Override // o8.o
    public final l8.i z0() {
        return this;
    }
}
