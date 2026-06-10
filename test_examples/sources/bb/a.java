package bb;

import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import c8.b;
import t3.c;
import v7.g;

/* loaded from: classes.dex */
public final class a<T extends i0> implements k0.b {

    /* renamed from: a  reason: collision with root package name */
    public final org.koin.core.scope.a f6512a;

    /* renamed from: b  reason: collision with root package name */
    public final m1.a f6513b;

    public a(org.koin.core.scope.a aVar, m1.a aVar2) {
        g.f(aVar, "scope");
        this.f6512a = aVar;
        this.f6513b = aVar2;
    }

    @Override // androidx.lifecycle.k0.b
    public final <T extends i0> T a(Class<T> cls) {
        m1.a aVar = this.f6513b;
        u7.a aVar2 = aVar.f15900a;
        return (T) this.f6512a.a(aVar2, (b) aVar.f15901b, (kb.a) aVar.c);
    }

    @Override // androidx.lifecycle.k0.b
    public final i0 b(Class cls, c cVar) {
        return a(cls);
    }
}
