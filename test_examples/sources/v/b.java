package v;

import androidx.compose.ui.platform.o0;
import j1.a0;

/* loaded from: classes.dex */
public final class b extends o0 implements a0 {

    /* renamed from: j  reason: collision with root package name */
    public final q0.a f18045j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18046k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q0.b bVar, u7.l lVar) {
        super(lVar);
        v7.g.f(lVar, "inspectorInfo");
        this.f18045j = bVar;
        this.f18046k = false;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && v7.g.a(this.f18045j, bVar.f18045j) && this.f18046k == bVar.f18046k;
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return (this.f18045j.hashCode() * 31) + (this.f18046k ? 1231 : 1237);
    }

    @Override // j1.a0
    public final Object j(b2.b bVar, Object obj) {
        v7.g.f(bVar, "<this>");
        return this;
    }

    public final String toString() {
        return "BoxChildData(alignment=" + this.f18045j + ", matchParentSize=" + this.f18046k + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
