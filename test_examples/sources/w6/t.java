package w6;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.noto.R;
import com.noto.app.filtered.FilteredItemModel;
import w6.r;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class t extends r implements c0<r.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(r.a aVar) {
        r.a aVar2 = aVar;
    }

    public final t G(boolean z10) {
        p();
        this.n = z10;
        return this;
    }

    public final t H(boolean z10) {
        p();
        this.f18477l = z10;
        return this;
    }

    public final t I(FilteredItemModel filteredItemModel) {
        p();
        this.f18476k = filteredItemModel;
        return this;
    }

    public final t J(View.OnClickListener onClickListener) {
        p();
        this.f18479o = onClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        r.a aVar = (r.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        r.a aVar = (r.a) obj;
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
        if (!(obj instanceof t) || !super.equals(obj)) {
            return false;
        }
        t tVar = (t) obj;
        tVar.getClass();
        E();
        if (!E().equals(tVar.E()) || this.f18477l != tVar.f18477l || this.f18478m != tVar.f18478m || this.n != tVar.n) {
            return false;
        }
        F();
        tVar.F();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.filtered_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        int hashCode = E().hashCode();
        F();
        return ((((((((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + (this.f18477l ? 1 : 0)) * 31) + this.f18478m) * 31) + (this.n ? 1 : 0)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "FilteredItem_{model=" + E() + ", isShowNotesCount=" + this.f18477l + ", notesCount=" + this.f18478m + ", isSelected=" + this.n + ", onClickListener=" + F() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        r.a aVar = (r.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final r.a z(ViewParent viewParent) {
        return new r.a();
    }
}
