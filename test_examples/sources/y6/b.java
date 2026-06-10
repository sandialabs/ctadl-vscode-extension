package y6;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import y6.a;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class b extends a implements c0<a.C0246a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(a.C0246a c0246a) {
        a.C0246a c0246a2 = c0246a;
    }

    public final b G(NotoColor notoColor) {
        p();
        this.f18896l = notoColor;
        return this;
    }

    public final b H() {
        l("all");
        return this;
    }

    public final b I(boolean z10) {
        p();
        this.f18895k = z10;
        return this;
    }

    public final b J(View.OnClickListener onClickListener) {
        p();
        this.f18897m = onClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        a.C0246a c0246a = (a.C0246a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        a.C0246a c0246a = (a.C0246a) obj;
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
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        if (this.f18895k != bVar.f18895k) {
            return false;
        }
        E();
        if (!E().equals(bVar.E())) {
            return false;
        }
        F();
        bVar.F();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.all_label_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        int hashCode = E().hashCode();
        F();
        return ((hashCode + (((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f18895k ? 1 : 0)) * 31)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "AllLabelItem_{isSelected=" + this.f18895k + ", color=" + E() + ", onClickListener=" + F() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        a.C0246a c0246a = (a.C0246a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final a.C0246a z(ViewParent viewParent) {
        return new a.C0246a();
    }
}
