package y6;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import y6.g;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class i extends g implements c0<g.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(g.a aVar) {
        g.a aVar2 = aVar;
    }

    public final i I(NotoColor notoColor) {
        p();
        v7.g.f(notoColor, "<set-?>");
        this.f18909m = notoColor;
        return this;
    }

    public final i J(long j2) {
        super.k(j2);
        return this;
    }

    public final i K(boolean z10) {
        p();
        this.f18908l = z10;
        return this;
    }

    public final i L(t6.c cVar) {
        p();
        v7.g.f(cVar, "<set-?>");
        this.f18907k = cVar;
        return this;
    }

    public final i M(View.OnClickListener onClickListener) {
        p();
        this.n = onClickListener;
        return this;
    }

    public final i N(View.OnLongClickListener onLongClickListener) {
        p();
        this.f18910o = onLongClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        g.a aVar = (g.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        g.a aVar = (g.a) obj;
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
        if (!(obj instanceof i) || !super.equals(obj)) {
            return false;
        }
        i iVar = (i) obj;
        iVar.getClass();
        F();
        if (!F().equals(iVar.F()) || this.f18908l != iVar.f18908l) {
            return false;
        }
        E();
        if (!E().equals(iVar.E())) {
            return false;
        }
        G();
        iVar.G();
        H();
        iVar.H();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.label_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        F();
        int hashCode = F().hashCode();
        E();
        int hashCode2 = E().hashCode();
        G();
        H();
        return ((((hashCode2 + ((((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + (this.f18908l ? 1 : 0)) * 31)) * 31) + 1) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "LabelItem_{label=" + F() + ", isSelected=" + this.f18908l + ", color=" + E() + ", onClickListener=" + G() + ", onLongClickListener=" + H() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        g.a aVar = (g.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final g.a z(ViewParent viewParent) {
        return new g.a();
    }
}
