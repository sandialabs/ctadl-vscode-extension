package j1;

import androidx.compose.ui.platform.o0;

/* loaded from: classes.dex */
public final class i extends o0 implements a0, j {

    /* renamed from: j  reason: collision with root package name */
    public final Object f12653j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, u7.l lVar) {
        super(lVar);
        v7.g.f(lVar, "inspectorInfo");
        this.f12653j = str;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // j1.j
    public final Object a() {
        return this.f12653j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar == null) {
            return false;
        }
        return v7.g.a(this.f12653j, iVar.f12653j);
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f12653j.hashCode();
    }

    @Override // j1.a0
    public final Object j(b2.b bVar, Object obj) {
        v7.g.f(bVar, "<this>");
        return this;
    }

    public final String toString() {
        return "LayoutId(id=" + this.f12653j + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
