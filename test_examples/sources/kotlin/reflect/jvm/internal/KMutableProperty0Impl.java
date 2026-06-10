package kotlin.reflect.jvm.internal;

import c8.f;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.g;
import l8.z;
import m7.n;
import u7.l;

/* loaded from: classes.dex */
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements c8.f {

    /* renamed from: r  reason: collision with root package name */
    public final g.b<a<V>> f13161r;

    /* loaded from: classes.dex */
    public static final class a<R> extends KPropertyImpl.Setter<R> implements l {

        /* renamed from: m  reason: collision with root package name */
        public final KMutableProperty0Impl<R> f13163m;

        public a(KMutableProperty0Impl<R> kMutableProperty0Impl) {
            v7.g.f(kMutableProperty0Impl, "property");
            this.f13163m = kMutableProperty0Impl;
        }

        @Override // u7.l
        public final Object U(Object obj) {
            a<R> k02 = this.f13163m.f13161r.k0();
            v7.g.e(k02, "_setter()");
            k02.a(obj);
            return n.f16010a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final KPropertyImpl h() {
            return this.f13163m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, z zVar) {
        super(kDeclarationContainerImpl, zVar);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(zVar, "descriptor");
        this.f13161r = g.b(new KMutableProperty0Impl$_setter$1(this));
    }

    @Override // c8.f
    public final f.a l() {
        a<V> k02 = this.f13161r.k0();
        v7.g.e(k02, "_setter()");
        return k02;
    }
}
