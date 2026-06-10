package y6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import y6.l;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class n extends l implements c0<l.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(l.a aVar) {
        l.a aVar2 = aVar;
    }

    public final n H(NotoColor notoColor) {
        p();
        v7.g.f(notoColor, "<set-?>");
        this.f18919l = notoColor;
        return this;
    }

    public final n I(long j2) {
        super.k(j2);
        return this;
    }

    public final n J(t6.c cVar) {
        p();
        this.f18918k = cVar;
        return this;
    }

    public final n K(t tVar) {
        p();
        this.f18920m = tVar;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        l.a aVar = (l.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        l.a aVar = (l.a) obj;
        v("The model was changed during the bind call.", i10);
    }

    @Override // com.airbnb.epoxy.r
    public final void c(com.airbnb.epoxy.m mVar) {
        mVar.addInternal(this);
        d(mVar);
    }

    @Override // com.airbnb.epoxy.r
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && super.equals(obj)) {
            n nVar = (n) obj;
            nVar.getClass();
            F();
            if (F().equals(nVar.F())) {
                E();
                if (E().equals(nVar.E())) {
                    G();
                    nVar.G();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.label_order_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        F();
        int hashCode = F().hashCode();
        E();
        int hashCode2 = E().hashCode();
        G();
        return ((hashCode2 + ((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "LabelOrderItem_{label=" + F() + ", color=" + E() + ", onDragHandleTouchListener=" + G() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        l.a aVar = (l.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final l.a z(ViewParent viewParent) {
        return new l.a();
    }
}
