package a7;

import a7.x0;
import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class y0 extends x0 implements com.airbnb.epoxy.c0<x0.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(x0.a aVar) {
        x0.a aVar2 = aVar;
    }

    public final y0 I(NotoColor notoColor) {
        p();
        v7.g.f(notoColor, "<set-?>");
        this.f382o = notoColor;
        return this;
    }

    public final y0 J(int i10) {
        p();
        this.f381m = i10;
        return this;
    }

    public final y0 K(int i10) {
        p();
        this.f380l = i10;
        return this;
    }

    public final y0 L(boolean z10) {
        p();
        this.n = z10;
        return this;
    }

    public final y0 M(v0 v0Var) {
        p();
        this.f383p = v0Var;
        return this;
    }

    public final y0 N(com.noto.app.note.n nVar) {
        p();
        this.f384q = nVar;
        return this;
    }

    public final y0 O(String str) {
        p();
        v7.g.f(str, "<set-?>");
        this.f379k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        x0.a aVar = (x0.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        x0.a aVar = (x0.a) obj;
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
        if (!(obj instanceof y0) || !super.equals(obj)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        y0Var.getClass();
        H();
        if (!H().equals(y0Var.H()) || this.f380l != y0Var.f380l || this.f381m != y0Var.f381m || this.n != y0Var.n) {
            return false;
        }
        E();
        if (!E().equals(y0Var.E())) {
            return false;
        }
        F();
        y0Var.F();
        G();
        y0Var.G();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.undo_redo_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        H();
        int hashCode = H().hashCode();
        E();
        int hashCode2 = E().hashCode();
        F();
        G();
        return ((((hashCode2 + ((((((((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + this.f380l) * 31) + this.f381m) * 31) + (this.n ? 1 : 0)) * 31)) * 31) + 1) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "UndoRedoItem_{text=" + H() + ", cursorStartPosition=" + this.f380l + ", cursorEndPosition=" + this.f381m + ", isSelected=" + this.n + ", color=" + E() + ", onClickListener=" + F() + ", onCopyClickListener=" + G() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        x0.a aVar = (x0.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final x0.a z(ViewParent viewParent) {
        return new x0.a();
    }
}
