package com.noto.app.folder;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.noto.R;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.folder.NoteItem;
import x6.h0;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class r extends NoteItem implements c0<NoteItem.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(NoteItem.a aVar) {
        NoteItem.a aVar2 = aVar;
    }

    @Override // com.noto.app.folder.NoteItem
    public final boolean J() {
        return this.f8592r;
    }

    @Override // com.noto.app.folder.NoteItem
    public final boolean K() {
        return this.f8594t;
    }

    @Override // com.noto.app.folder.NoteItem
    public final boolean L() {
        return this.f8593s;
    }

    @Override // com.noto.app.folder.NoteItem
    public final boolean M() {
        return this.f8591q;
    }

    @Override // com.noto.app.folder.NoteItem
    public final boolean N() {
        return this.f8590p;
    }

    public final r O(NotoColor notoColor) {
        p();
        v7.g.f(notoColor, "<set-?>");
        this.f8588m = notoColor;
        return this;
    }

    public final r P(Font font) {
        p();
        v7.g.f(font, "<set-?>");
        this.f8587l = font;
        return this;
    }

    public final r Q(long j2) {
        super.k(j2);
        return this;
    }

    public final r R(boolean z10) {
        p();
        this.f8592r = z10;
        return this;
    }

    public final r S() {
        p();
        this.f8594t = true;
        return this;
    }

    public final r T(boolean z10) {
        p();
        this.f8593s = z10;
        return this;
    }

    public final r U() {
        p();
        this.f8591q = true;
        return this;
    }

    public final r V(boolean z10) {
        p();
        this.f8590p = z10;
        return this;
    }

    public final r W(h0 h0Var) {
        p();
        v7.g.f(h0Var, "<set-?>");
        this.f8586k = h0Var;
        return this;
    }

    public final r X(View.OnClickListener onClickListener) {
        p();
        this.f8596v = onClickListener;
        return this;
    }

    public final r Y(View.OnTouchListener onTouchListener) {
        p();
        this.f8598x = onTouchListener;
        return this;
    }

    public final r Z(View.OnLongClickListener onLongClickListener) {
        p();
        this.f8597w = onLongClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        NoteItem.a aVar = (NoteItem.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    public final r a0(int i10) {
        p();
        this.f8595u = i10;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        NoteItem.a aVar = (NoteItem.a) obj;
        v("The model was changed during the bind call.", i10);
    }

    public final r b0(int i10) {
        p();
        this.f8589o = i10;
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final void c(com.airbnb.epoxy.m mVar) {
        mVar.addInternal(this);
        d(mVar);
    }

    public final r c0(String str) {
        p();
        v7.g.f(str, "<set-?>");
        this.n = str;
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r) || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        rVar.getClass();
        G();
        if (!G().equals(rVar.G())) {
            return false;
        }
        F();
        if (!F().equals(rVar.F())) {
            return false;
        }
        E();
        if (!E().equals(rVar.E())) {
            return false;
        }
        H();
        if (!H().equals(rVar.H()) || this.f8589o != rVar.f8589o || this.f8590p != rVar.f8590p || this.f8591q != rVar.f8591q || this.f8592r != rVar.f8592r || this.f8593s != rVar.f8593s || this.f8594t != rVar.f8594t || this.f8595u != rVar.f8595u) {
            return false;
        }
        if (this.f8596v == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.f8596v == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return false;
        }
        if (this.f8597w == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.f8597w == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return false;
        }
        if (this.f8598x == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (rVar.f8598x == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 != z15) {
            return false;
        }
        if (this.f8599y == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVar.f8599y == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 != z17) {
            return false;
        }
        if (this.f8600z == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (rVar.f8600z == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 == z19) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.note_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        G();
        int hashCode = G().hashCode();
        F();
        int hashCode2 = F().hashCode();
        E();
        int hashCode3 = E().hashCode();
        H();
        int hashCode4 = (((((((((((((((H().hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31)) * 31)) * 31)) * 31) + this.f8589o) * 31) + (this.f8590p ? 1 : 0)) * 31) + (this.f8591q ? 1 : 0)) * 31) + (this.f8592r ? 1 : 0)) * 31) + (this.f8593s ? 1 : 0)) * 31) + (this.f8594t ? 1 : 0)) * 31) + this.f8595u) * 31;
        if (this.f8596v != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i15 = (hashCode4 + i10) * 31;
        if (this.f8597w != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        if (this.f8598x != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        if (this.f8599y != null) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        if (this.f8600z != null) {
            i14 = 1;
        }
        return i18 + i14;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "NoteItem_{model=" + G() + ", font=" + F() + ", color=" + E() + ", searchTerm=" + H() + ", previewSize=" + this.f8589o + ", isShowCreationDate=" + this.f8590p + ", isShowAccessDate=" + this.f8591q + ", isManualSorting=" + this.f8592r + ", isSelection=" + this.f8593s + ", isPreview=" + this.f8594t + ", parentWidth=" + this.f8595u + ", onClickListener=" + this.f8596v + ", onLongClickListener=" + this.f8597w + ", onDragHandleTouchListener=" + this.f8598x + ", onSelectListener=" + this.f8599y + ", onDeselectListener=" + this.f8600z + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        NoteItem.a aVar = (NoteItem.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final NoteItem.a z(ViewParent viewParent) {
        return new NoteItem.a();
    }
}
