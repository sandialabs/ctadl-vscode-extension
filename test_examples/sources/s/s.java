package s;

import androidx.compose.foundation.lazy.layout.PinnableParentKt;

/* loaded from: classes.dex */
public final class s implements k1.d {

    /* renamed from: i  reason: collision with root package name */
    public final u7.l<w.a, m7.n> f17226i;

    /* JADX WARN: Multi-variable type inference failed */
    public s(u7.l<? super w.a, m7.n> lVar) {
        this.f17226i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k1.d
    public final void T(k1.g gVar) {
        v7.g.f(gVar, "scope");
        this.f17226i.U(gVar.i(PinnableParentKt.f2027a));
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && v7.g.a(((s) obj).f17226i, this.f17226i);
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f17226i.hashCode();
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
