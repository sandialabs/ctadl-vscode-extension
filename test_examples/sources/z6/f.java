package z6;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.noto.R;
import z6.d;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class f extends d implements com.airbnb.epoxy.c0<d.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(d.a aVar) {
        d.a aVar2 = aVar;
    }

    @Override // z6.d
    public final boolean I() {
        return this.f19134l;
    }

    @Override // z6.d
    public final boolean J() {
        return this.f19136o;
    }

    @Override // z6.d
    public final boolean K() {
        return this.f19135m;
    }

    public final f L(t6.a aVar) {
        p();
        v7.g.f(aVar, "<set-?>");
        this.f19133k = aVar;
        return this;
    }

    public final f M(long j2) {
        super.k(j2);
        return this;
    }

    public final f N(boolean z10) {
        p();
        this.f19134l = z10;
        return this;
    }

    public final f O(boolean z10) {
        p();
        this.f19136o = z10;
        return this;
    }

    public final f P(boolean z10) {
        p();
        this.f19135m = z10;
        return this;
    }

    public final f Q(int i10) {
        p();
        this.n = i10;
        return this;
    }

    public final f R(View.OnClickListener onClickListener) {
        p();
        this.f19138q = onClickListener;
        return this;
    }

    public final f S(View.OnTouchListener onTouchListener) {
        p();
        this.f19140s = onTouchListener;
        return this;
    }

    public final f T(View.OnLongClickListener onLongClickListener) {
        p();
        this.f19139r = onLongClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        d.a aVar = (d.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        d.a aVar = (d.a) obj;
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
        if (!(obj instanceof f) || !super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        E();
        if (!E().equals(fVar.E()) || this.f19134l != fVar.f19134l || this.f19135m != fVar.f19135m || this.n != fVar.n || this.f19136o != fVar.f19136o || this.f19137p != fVar.f19137p) {
            return false;
        }
        F();
        fVar.F();
        H();
        fVar.H();
        G();
        fVar.G();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.folder_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        int hashCode = E().hashCode();
        F();
        H();
        G();
        return ((((((((((((((((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + (this.f19134l ? 1 : 0)) * 31) + (this.f19135m ? 1 : 0)) * 31) + this.n) * 31) + (this.f19136o ? 1 : 0)) * 31) + this.f19137p) * 31) + 1) * 31) + 1) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "FolderItem_{folder=" + E() + ", isManualSorting=" + this.f19134l + ", isShowNotesCount=" + this.f19135m + ", notesCount=" + this.n + ", isSelected=" + this.f19136o + ", depth=" + this.f19137p + ", onClickListener=" + F() + ", onLongClickListener=" + H() + ", onDragHandleTouchListener=" + G() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        d.a aVar = (d.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final d.a z(ViewParent viewParent) {
        return new d.a();
    }
}
