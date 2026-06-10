package kotlin.reflect.jvm.internal;

import c8.f;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.g;
import l8.z;
import m7.n;
import u7.q;

/* loaded from: classes.dex */
public final class d<D, E, V> extends e<D, E, V> implements c8.f {

    /* renamed from: r  reason: collision with root package name */
    public final g.b<a<D, E, V>> f13282r;

    /* loaded from: classes.dex */
    public static final class a<D, E, V> extends KPropertyImpl.Setter<V> implements q {

        /* renamed from: m  reason: collision with root package name */
        public final d<D, E, V> f13283m;

        public a(d<D, E, V> dVar) {
            v7.g.f(dVar, "property");
            this.f13283m = dVar;
        }

        @Override // u7.q
        public final Object O(Object obj, Object obj2, Object obj3) {
            a<D, E, V> k02 = this.f13283m.f13282r.k0();
            v7.g.e(k02, "_setter()");
            k02.a(obj, obj2, obj3);
            return n.f16010a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final KPropertyImpl h() {
            return this.f13283m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(KDeclarationContainerImpl kDeclarationContainerImpl, z zVar) {
        super(kDeclarationContainerImpl, zVar);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(zVar, "descriptor");
        this.f13282r = g.b(new KMutableProperty2Impl$_setter$1(this));
    }

    @Override // c8.f
    public final f.a l() {
        a<D, E, V> k02 = this.f13282r.k0();
        v7.g.e(k02, "_setter()");
        return k02;
    }
}
