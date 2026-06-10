package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.calls.b;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import u7.k;
import u7.l;
import u7.m;
import u7.n;
import u7.o;
import u7.p;
import u7.q;
import u7.r;
import u7.s;
import u7.t;
import u7.u;
import u7.v;
import u7.w;

/* loaded from: classes.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements v7.f<Object>, c8.e<Object>, u7.a, l, u7.b, u7.c, u7.d, u7.e, u7.f, u7.g, u7.h, u7.i, u7.j, k, p, m, n, o, q, r, s, t, u, v, w {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ c8.j<Object>[] f13152o = {v7.i.c(new PropertyReference1Impl(v7.i.a(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), v7.i.c(new PropertyReference1Impl(v7.i.a(KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), v7.i.c(new PropertyReference1Impl(v7.i.a(KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: j  reason: collision with root package name */
    public final KDeclarationContainerImpl f13153j;

    /* renamed from: k  reason: collision with root package name */
    public final String f13154k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f13155l;

    /* renamed from: m  reason: collision with root package name */
    public final g.a f13156m;
    public final g.b n;

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Object obj) {
        this.f13153j = kDeclarationContainerImpl;
        this.f13154k = str2;
        this.f13155l = obj;
        this.f13156m = new g.a(eVar, new KFunctionImpl$descriptor$2(this, str));
        this.n = new g.b(new KFunctionImpl$caller$2(this));
        new g.b(new KFunctionImpl$defaultCaller$2(this));
    }

    public static final kotlin.reflect.jvm.internal.calls.b g(KFunctionImpl kFunctionImpl, Constructor constructor, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z10) {
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar;
        boolean z11;
        if (!z10) {
            kFunctionImpl.getClass();
            if (eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) eVar;
            } else {
                bVar = null;
            }
            if (bVar != null && !l8.l.e(bVar.g())) {
                l8.b P = bVar.P();
                v7.g.e(P, "constructorDescriptor.constructedClass");
                if (!k9.e.b(P) && !k9.d.q(bVar.P())) {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = bVar.m();
                    v7.g.e(m10, "constructorDescriptor.valueParameters");
                    if (!m10.isEmpty()) {
                        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : m10) {
                            y9.r b5 = hVar.b();
                            v7.g.e(b5, "it.type");
                            if (m0.b.c1(b5)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                }
            }
            z11 = false;
            if (z11) {
                if (kFunctionImpl.f()) {
                    return new b.a(constructor, a1.c.e0(kFunctionImpl.f13155l, kFunctionImpl.d()));
                }
                return new b.C0143b(constructor);
            }
        }
        if (kFunctionImpl.f()) {
            return new b.c(constructor, a1.c.e0(kFunctionImpl.f13155l, kFunctionImpl.d()));
        }
        return new b.d(constructor);
    }

    @Override // v7.f
    public final int D() {
        return m0.b.i0(b());
    }

    @Override // u7.t
    public final Object E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return a(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // u7.q
    public final Object O(Object obj, Object obj2, Object obj3) {
        return a(obj, obj2, obj3);
    }

    @Override // u7.p
    public final Object R(Object obj, Object obj2) {
        return a(obj, obj2);
    }

    @Override // u7.l
    public final Object U(Object obj) {
        return a(obj);
    }

    @Override // u7.s
    public final Object V(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final kotlin.reflect.jvm.internal.calls.a<?> b() {
        c8.j<Object> jVar = f13152o[1];
        Object k02 = this.n.k0();
        v7.g.e(k02, "<get-caller>(...)");
        return (kotlin.reflect.jvm.internal.calls.a) k02;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final KDeclarationContainerImpl c() {
        return this.f13153j;
    }

    public final boolean equals(Object obj) {
        KFunctionImpl b5 = f8.i.b(obj);
        return b5 != null && v7.g.a(this.f13153j, b5.f13153j) && v7.g.a(getName(), b5.getName()) && v7.g.a(this.f13154k, b5.f13154k) && v7.g.a(this.f13155l, b5.f13155l);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final boolean f() {
        return !v7.g.a(this.f13155l, CallableReference.f13046o);
    }

    @Override // c8.a
    public final String getName() {
        String b5 = d().getName().b();
        v7.g.e(b5, "descriptor.name.asString()");
        return b5;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: h */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e d() {
        c8.j<Object> jVar = f13152o[0];
        Object k02 = this.f13156m.k0();
        v7.g.e(k02, "<get-descriptor>(...)");
        return (kotlin.reflect.jvm.internal.impl.descriptors.e) k02;
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return this.f13154k.hashCode() + ((hashCode + (this.f13153j.hashCode() * 31)) * 31);
    }

    @Override // u7.a
    public final Object k0() {
        return a(new Object[0]);
    }

    @Override // u7.r
    public final Object l0(Object obj, Object obj2, Object obj3, Object obj4) {
        return a(obj, obj2, obj3, obj4);
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f13232a;
        return ReflectionObjectRenderer.b(d());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        this(kDeclarationContainerImpl, r3, i.c(eVar).a(), eVar, CallableReference.f13046o);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(eVar, "descriptor");
        String b5 = eVar.getName().b();
        v7.g.e(b5, "descriptor.name.asString()");
    }
}
