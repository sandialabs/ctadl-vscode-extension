package f8;

import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import l8.a0;
import l8.b0;
import l8.c0;
import l8.h0;
import l8.i0;
import l8.s;
import l8.u;
import l8.x;
import l8.z;
import m7.n;

/* loaded from: classes.dex */
public class c implements l8.h<KCallableImpl<?>, n> {

    /* renamed from: a  reason: collision with root package name */
    public final KDeclarationContainerImpl f10966a;

    public c(KDeclarationContainerImpl kDeclarationContainerImpl) {
        v7.g.f(kDeclarationContainerImpl, "container");
        this.f10966a = kDeclarationContainerImpl;
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> a(u uVar, n nVar) {
        return null;
    }

    @Override // l8.h
    public final KCallableImpl<?> b(z zVar, n nVar) {
        int i10;
        v7.g.f(zVar, "descriptor");
        v7.g.f(nVar, "data");
        int i11 = 0;
        if (zVar.E() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (zVar.R() != null) {
            i11 = 1;
        }
        int i12 = i10 + i11;
        boolean M = zVar.M();
        KDeclarationContainerImpl kDeclarationContainerImpl = this.f10966a;
        if (M) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        return new kotlin.reflect.jvm.internal.d(kDeclarationContainerImpl, zVar);
                    }
                } else {
                    return new KMutableProperty1Impl(kDeclarationContainerImpl, zVar);
                }
            } else {
                return new KMutableProperty0Impl(kDeclarationContainerImpl, zVar);
            }
        } else if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return new kotlin.reflect.jvm.internal.e(kDeclarationContainerImpl, zVar);
                }
            } else {
                return new KProperty1Impl(kDeclarationContainerImpl, zVar);
            }
        } else {
            return new KProperty0Impl(kDeclarationContainerImpl, zVar);
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + zVar);
    }

    @Override // l8.h
    public final KCallableImpl<?> c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, n nVar) {
        v7.g.f(eVar, "descriptor");
        v7.g.f(nVar, "data");
        return new KFunctionImpl(this.f10966a, eVar);
    }

    @Override // l8.h
    public final KCallableImpl<?> d(b0 b0Var, n nVar) {
        return c(b0Var, nVar);
    }

    @Override // l8.h
    public KCallableImpl<?> e(kotlin.reflect.jvm.internal.impl.descriptors.c cVar, n nVar) {
        return c(cVar, nVar);
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> f(c0 c0Var, n nVar) {
        return null;
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> g(s sVar, n nVar) {
        return null;
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> h(h0 h0Var, n nVar) {
        return null;
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> i(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, n nVar) {
        return null;
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> j(l8.b bVar, n nVar) {
        return null;
    }

    @Override // l8.h
    public final KCallableImpl<?> k(a0 a0Var, n nVar) {
        return c(a0Var, nVar);
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> l(i0 i0Var, n nVar) {
        return null;
    }

    @Override // l8.h
    public final /* bridge */ /* synthetic */ KCallableImpl<?> m(x xVar, n nVar) {
        return null;
    }
}
