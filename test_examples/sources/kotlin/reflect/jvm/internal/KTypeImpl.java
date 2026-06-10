package kotlin.reflect.jvm.internal;

import c8.k;
import c8.m;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import l8.h0;
import l8.i0;
import y9.f0;
import y9.r;

/* loaded from: classes.dex */
public final class KTypeImpl implements k {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ c8.j<Object>[] f13216e = {v7.i.c(new PropertyReference1Impl(v7.i.a(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), v7.i.c(new PropertyReference1Impl(v7.i.a(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    public final r f13217a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a<Type> f13218b;
    public final g.a c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a f13219d;

    public KTypeImpl(r rVar, u7.a<? extends Type> aVar) {
        v7.g.f(rVar, "type");
        this.f13217a = rVar;
        g.a<Type> aVar2 = null;
        g.a<Type> aVar3 = aVar instanceof g.a ? (g.a) aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = g.c(aVar);
        }
        this.f13218b = aVar2;
        this.c = g.c(new KTypeImpl$classifier$2(this));
        this.f13219d = g.c(new KTypeImpl$arguments$2(this, aVar));
    }

    @Override // c8.k
    public final List<m> a() {
        c8.j<Object> jVar = f13216e[1];
        Object k02 = this.f13219d.k0();
        v7.g.e(k02, "<get-arguments>(...)");
        return (List) k02;
    }

    @Override // c8.k
    public final boolean b() {
        return this.f13217a.V0();
    }

    @Override // c8.k
    public final c8.c c() {
        c8.j<Object> jVar = f13216e[0];
        return (c8.c) this.c.k0();
    }

    public final c8.c d(r rVar) {
        r b5;
        l8.d c = rVar.U0().c();
        if (c instanceof l8.b) {
            Class<?> j2 = f8.i.j((l8.b) c);
            if (j2 == null) {
                return null;
            }
            if (j2.isArray()) {
                f0 f0Var = (f0) kotlin.collections.c.E2(rVar.S0());
                if (f0Var != null && (b5 = f0Var.b()) != null) {
                    c8.c d5 = d(b5);
                    if (d5 != null) {
                        return new KClassImpl(Array.newInstance(a1.c.y0(m0.b.p0(d5)), 0).getClass());
                    }
                    throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
                }
                return new KClassImpl(j2);
            } else if (!kotlin.reflect.jvm.internal.impl.types.r.g(rVar)) {
                Class<? extends Object> cls = ReflectClassUtilKt.f13583b.get(j2);
                if (cls != null) {
                    j2 = cls;
                }
                return new KClassImpl(j2);
            } else {
                return new KClassImpl(j2);
            }
        } else if (c instanceof i0) {
            return new KTypeParameterImpl(null, (i0) c);
        } else {
            if (!(c instanceof h0)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KTypeImpl) {
            KTypeImpl kTypeImpl = (KTypeImpl) obj;
            if (v7.g.a(this.f13217a, kTypeImpl.f13217a) && v7.g.a(c(), kTypeImpl.c()) && v7.g.a(a(), kTypeImpl.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13217a.hashCode() * 31;
        c8.c c = c();
        return a().hashCode() + ((hashCode + (c != null ? c.hashCode() : 0)) * 31);
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f13232a;
        return ReflectionObjectRenderer.d(this.f13217a);
    }
}
