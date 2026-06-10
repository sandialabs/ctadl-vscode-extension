package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.n;
import kotlin.jvm.internal.Lambda;
import m9.g;
import o8.c0;
import w8.e;
import x9.f;

/* loaded from: classes.dex */
final class LazyJavaScope$resolveProperty$1 extends Lambda implements u7.a<f<? extends g<?>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f13811j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ n f13812k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ c0 f13813l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<g<?>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ LazyJavaScope f13814j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ n f13815k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ c0 f13816l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyJavaScope lazyJavaScope, n nVar, c0 c0Var) {
            super(0);
            this.f13814j = lazyJavaScope;
            this.f13815k = nVar;
            this.f13816l = c0Var;
        }

        @Override // u7.a
        public final g<?> k0() {
            this.f13814j.f13785b.f18762a.f18745h.a(this.f13815k, this.f13816l);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$resolveProperty$1(LazyJavaScope lazyJavaScope, n nVar, e eVar) {
        super(0);
        this.f13811j = lazyJavaScope;
        this.f13812k = nVar;
        this.f13813l = eVar;
    }

    @Override // u7.a
    public final f<? extends g<?>> k0() {
        LazyJavaScope lazyJavaScope = this.f13811j;
        return lazyJavaScope.f13785b.f18762a.f18739a.g(new AnonymousClass1(lazyJavaScope, this.f13812k, this.f13813l));
    }
}
