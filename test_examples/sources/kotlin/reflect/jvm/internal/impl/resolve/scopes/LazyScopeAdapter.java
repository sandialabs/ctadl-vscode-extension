package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import v7.g;
import x9.e;
import x9.h;

/* loaded from: classes.dex */
public final class LazyScopeAdapter extends r9.a {

    /* renamed from: b  reason: collision with root package name */
    public final e<MemberScope> f14735b;

    public LazyScopeAdapter(h hVar, u7.a<? extends MemberScope> aVar) {
        g.f(hVar, "storageManager");
        this.f14735b = hVar.a(new LazyScopeAdapter$lazyScope$1(aVar));
    }

    @Override // r9.a
    public final MemberScope i() {
        return this.f14735b.k0();
    }
}
