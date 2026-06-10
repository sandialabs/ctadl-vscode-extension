package j1;

import androidx.compose.ui.platform.o0;

/* loaded from: classes.dex */
public final class l extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final u7.q<t, p, b2.a, r> f12654j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u7.l lVar, u7.q qVar) {
        super(lVar);
        v7.g.f(qVar, "measureBlock");
        v7.g.f(lVar, "inspectorInfo");
        this.f12654j = qVar;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l lVar = obj instanceof l ? (l) obj : null;
        if (lVar == null) {
            return false;
        }
        return v7.g.a(this.f12654j, lVar.f12654j);
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f12654j.hashCode();
    }

    @Override // j1.k
    public final r n(t tVar, p pVar, long j2) {
        v7.g.f(tVar, "$this$measure");
        return this.f12654j.O(tVar, pVar, new b2.a(j2));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f12654j + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
