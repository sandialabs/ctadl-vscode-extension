package kotlin.reflect.jvm.internal;

import c8.f;
import c8.g;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.g;
import l8.z;
import m7.n;

/* loaded from: classes.dex */
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements c8.g<T, V> {

    /* renamed from: r  reason: collision with root package name */
    public final g.b<a<T, V>> f13164r;

    /* loaded from: classes.dex */
    public static final class a<T, V> extends KPropertyImpl.Setter<V> implements g.a<T, V> {

        /* renamed from: m  reason: collision with root package name */
        public final KMutableProperty1Impl<T, V> f13166m;

        public a(KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
            v7.g.f(kMutableProperty1Impl, "property");
            this.f13166m = kMutableProperty1Impl;
        }

        @Override // u7.p
        public final n R(Object obj, Object obj2) {
            a<T, V> k02 = this.f13166m.f13164r.k0();
            v7.g.e(k02, "_setter()");
            k02.a(obj, obj2);
            return n.f16010a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final KPropertyImpl h() {
            return this.f13166m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(str, "name");
        v7.g.f(str2, "signature");
        this.f13164r = g.b(new KMutableProperty1Impl$_setter$1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, z zVar) {
        super(kDeclarationContainerImpl, zVar);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(zVar, "descriptor");
        this.f13164r = g.b(new KMutableProperty1Impl$_setter$1(this));
    }

    @Override // c8.g, c8.f
    public final f.a l() {
        a<T, V> k02 = this.f13164r.k0();
        v7.g.e(k02, "_setter()");
        return k02;
    }

    @Override // c8.g, c8.f
    public final g.a l() {
        a<T, V> k02 = this.f13164r.k0();
        v7.g.e(k02, "_setter()");
        return k02;
    }
}
