package kotlin.reflect.jvm.internal;

import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.g;
import l8.z;
import u7.p;

/* loaded from: classes.dex */
public class e<D, E, V> extends KPropertyImpl<V> implements p {

    /* renamed from: q  reason: collision with root package name */
    public final g.b<a<D, E, V>> f13284q;

    /* loaded from: classes.dex */
    public static final class a<D, E, V> extends KPropertyImpl.Getter<V> implements p {

        /* renamed from: m  reason: collision with root package name */
        public final e<D, E, V> f13285m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e<D, E, ? extends V> eVar) {
            v7.g.f(eVar, "property");
            this.f13285m = eVar;
        }

        @Override // u7.p
        public final V R(D d5, E e10) {
            a<D, E, V> k02 = this.f13285m.f13284q.k0();
            v7.g.e(k02, "_getter()");
            return k02.a(d5, e10);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final KPropertyImpl h() {
            return this.f13285m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(KDeclarationContainerImpl kDeclarationContainerImpl, z zVar) {
        super(kDeclarationContainerImpl, zVar);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(zVar, "descriptor");
        this.f13284q = g.b(new KProperty2Impl$_getter$1(this));
        kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new KProperty2Impl$delegateSource$1(this));
    }

    @Override // u7.p
    public final V R(D d5, E e10) {
        a<D, E, V> k02 = this.f13284q.k0();
        v7.g.e(k02, "_getter()");
        return k02.a(d5, e10);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    public final KPropertyImpl.Getter i() {
        a<D, E, V> k02 = this.f13284q.k0();
        v7.g.e(k02, "_getter()");
        return k02;
    }
}
