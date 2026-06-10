package kotlin.reflect.jvm.internal;

import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.g;
import l8.z;

/* loaded from: classes.dex */
public class KProperty0Impl<V> extends KPropertyImpl<V> implements c8.h<V> {

    /* renamed from: q  reason: collision with root package name */
    public final g.b<a<V>> f13188q;

    /* loaded from: classes.dex */
    public static final class a<R> extends KPropertyImpl.Getter<R> implements u7.a {

        /* renamed from: m  reason: collision with root package name */
        public final KProperty0Impl<R> f13190m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(KProperty0Impl<? extends R> kProperty0Impl) {
            v7.g.f(kProperty0Impl, "property");
            this.f13190m = kProperty0Impl;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final KPropertyImpl h() {
            return this.f13190m;
        }

        @Override // u7.a
        public final R k0() {
            return this.f13190m.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(str, "name");
        v7.g.f(str2, "signature");
        this.f13188q = g.b(new KProperty0Impl$_getter$1(this));
        kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new KProperty0Impl$delegateValue$1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, z zVar) {
        super(kDeclarationContainerImpl, zVar);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(zVar, "descriptor");
        this.f13188q = g.b(new KProperty0Impl$_getter$1(this));
        kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new KProperty0Impl$delegateValue$1(this));
    }

    @Override // c8.h
    public final V get() {
        return i().a(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    /* renamed from: j */
    public final a<V> i() {
        a<V> k02 = this.f13188q.k0();
        v7.g.e(k02, "_getter()");
        return k02;
    }

    @Override // u7.a
    public final V k0() {
        return get();
    }
}
