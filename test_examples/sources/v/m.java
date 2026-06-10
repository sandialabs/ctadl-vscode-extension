package v;

import androidx.compose.ui.platform.o0;
import j1.a0;

/* loaded from: classes.dex */
public final class m extends o0 implements a0 {

    /* renamed from: j  reason: collision with root package name */
    public final float f18068j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18069k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, u7.l lVar) {
        super(lVar);
        v7.g.f(lVar, "inspectorInfo");
        this.f18068j = 1.0f;
        this.f18069k = z10;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar == null) {
            return false;
        }
        return ((this.f18068j > mVar.f18068j ? 1 : (this.f18068j == mVar.f18068j ? 0 : -1)) == 0) && this.f18069k == mVar.f18069k;
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f18068j) * 31) + (this.f18069k ? 1231 : 1237);
    }

    @Override // j1.a0
    public final Object j(b2.b bVar, Object obj) {
        q qVar;
        v7.g.f(bVar, "<this>");
        if (obj instanceof q) {
            qVar = (q) obj;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            qVar = new q(0);
        }
        qVar.f18075a = this.f18068j;
        qVar.f18076b = this.f18069k;
        return qVar;
    }

    public final String toString() {
        return "LayoutWeightImpl(weight=" + this.f18068j + ", fill=" + this.f18069k + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
