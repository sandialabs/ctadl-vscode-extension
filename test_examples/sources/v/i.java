package v;

import androidx.compose.ui.platform.o0;
import j1.a0;
import q0.a;
import q0.b;
import v.f;

/* loaded from: classes.dex */
public final class i extends o0 implements a0 {

    /* renamed from: j  reason: collision with root package name */
    public final a.b f18059j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b.a aVar, u7.l lVar) {
        super(lVar);
        v7.g.f(lVar, "inspectorInfo");
        this.f18059j = aVar;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar == null) {
            return false;
        }
        return v7.g.a(this.f18059j, iVar.f18059j);
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f18059j.hashCode();
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
        int i10 = f.f18048a;
        a.b bVar2 = this.f18059j;
        v7.g.f(bVar2, "horizontal");
        qVar.c = new f.c(bVar2);
        return qVar;
    }

    public final String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f18059j + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
