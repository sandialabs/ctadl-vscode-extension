package kotlin.reflect.jvm.internal;

import c8.i;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.g;
import l8.z;

/* loaded from: classes.dex */
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements c8.i<T, V> {

    /* renamed from: q  reason: collision with root package name */
    public final g.b<a<T, V>> f13192q;

    /* loaded from: classes.dex */
    public static final class a<T, V> extends KPropertyImpl.Getter<V> implements i.a<T, V> {

        /* renamed from: m  reason: collision with root package name */
        public final KProperty1Impl<T, V> f13194m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(KProperty1Impl<T, ? extends V> kProperty1Impl) {
            v7.g.f(kProperty1Impl, "property");
            this.f13194m = kProperty1Impl;
        }

        @Override // u7.l
        public final V U(T t10) {
            return this.f13194m.s().a(t10);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final KPropertyImpl h() {
            return this.f13194m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(str, "name");
        v7.g.f(str2, "signature");
        this.f13192q = g.b(new KProperty1Impl$_getter$1(this));
        kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new KProperty1Impl$delegateSource$1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, z zVar) {
        super(kDeclarationContainerImpl, zVar);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(zVar, "descriptor");
        this.f13192q = g.b(new KProperty1Impl$_getter$1(this));
        kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new KProperty1Impl$delegateSource$1(this));
    }

    @Override // u7.l
    public final V U(T t10) {
        return s().a(t10);
    }

    @Override // c8.i
    /* renamed from: j */
    public final a<T, V> s() {
        a<T, V> k02 = this.f13192q.k0();
        v7.g.e(k02, "_getter()");
        return k02;
    }
}
