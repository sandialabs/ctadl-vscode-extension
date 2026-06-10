package x6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import x6.s0;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class t0 extends s0 implements com.airbnb.epoxy.c0<s0.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(s0.a aVar) {
        s0.a aVar2 = aVar;
    }

    public final t0 G(boolean z10) {
        p();
        this.f18717l = z10;
        return this;
    }

    public final t0 H(NotoColor notoColor) {
        p();
        v7.g.f(notoColor, "<set-?>");
        this.f18716k = notoColor;
        return this;
    }

    public final t0 I(com.noto.app.folder.o oVar) {
        p();
        this.f18718m = oVar;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        s0.a aVar = (s0.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        s0.a aVar = (s0.a) obj;
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
        if (!(obj instanceof t0) || !super.equals(obj)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        t0Var.getClass();
        E();
        if (!E().equals(t0Var.E()) || this.f18717l != t0Var.f18717l) {
            return false;
        }
        F();
        t0Var.F();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.noto_color_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        int hashCode = E().hashCode();
        F();
        return ((((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + (this.f18717l ? 1 : 0)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "NotoColorItem_{notoColor=" + E() + ", isChecked=" + this.f18717l + ", onClickListener=" + F() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        s0.a aVar = (s0.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final s0.a z(ViewParent viewParent) {
        return new s0.a();
    }
}
