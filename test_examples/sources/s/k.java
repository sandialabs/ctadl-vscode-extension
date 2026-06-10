package s;

import androidx.compose.foundation.FocusedBoundsKt;

/* loaded from: classes.dex */
public final class k implements k1.d, k1.f<u7.l<? super j1.h, ? extends m7.n>>, u7.l<j1.h, m7.n> {

    /* renamed from: i  reason: collision with root package name */
    public final u7.l<j1.h, m7.n> f17216i;

    /* renamed from: j  reason: collision with root package name */
    public u7.l<? super j1.h, m7.n> f17217j;

    /* renamed from: k  reason: collision with root package name */
    public j1.h f17218k;

    /* JADX WARN: Multi-variable type inference failed */
    public k(u7.l<? super j1.h, m7.n> lVar) {
        v7.g.f(lVar, "handler");
        this.f17216i = lVar;
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        v7.g.f(gVar, "scope");
        u7.l<? super j1.h, m7.n> lVar = (u7.l) gVar.i(FocusedBoundsKt.f1501a);
        if (!v7.g.a(lVar, this.f17217j)) {
            this.f17217j = lVar;
        }
    }

    @Override // u7.l
    public final m7.n U(j1.h hVar) {
        j1.h hVar2 = hVar;
        this.f17218k = hVar2;
        this.f17216i.U(hVar2);
        u7.l<? super j1.h, m7.n> lVar = this.f17217j;
        if (lVar != null) {
            lVar.U(hVar2);
        }
        return m7.n.f16010a;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // k1.f
    public final k1.h<u7.l<? super j1.h, ? extends m7.n>> getKey() {
        return FocusedBoundsKt.f1501a;
    }

    @Override // k1.f
    public final u7.l<? super j1.h, ? extends m7.n> getValue() {
        return this;
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
