package com.noto.app.label;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.airbnb.epoxy.m;
import com.airbnb.epoxy.r;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.label.LabelListItem;
import java.util.List;
import u7.l;
import v7.g;
import x6.n;
import x6.o;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class a extends LabelListItem implements c0<LabelListItem.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(LabelListItem.a aVar) {
        LabelListItem.a aVar2 = aVar;
    }

    public final a I(NotoColor notoColor) {
        p();
        g.f(notoColor, "<set-?>");
        this.f8744l = notoColor;
        return this;
    }

    public final a J() {
        l("labels");
        return this;
    }

    public final a K(List list) {
        p();
        g.f(list, "<set-?>");
        this.f8743k = list;
        return this;
    }

    public final a L(n nVar) {
        p();
        this.f8745m = nVar;
        return this;
    }

    public final a M(l lVar) {
        p();
        this.n = lVar;
        return this;
    }

    public final a N(l lVar) {
        p();
        this.f8746o = lVar;
        return this;
    }

    public final a O(o oVar) {
        p();
        this.f8747p = oVar;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        LabelListItem.a aVar = (LabelListItem.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        LabelListItem.a aVar = (LabelListItem.a) obj;
        v("The model was changed during the bind call.", i10);
    }

    @Override // com.airbnb.epoxy.r
    public final void c(m mVar) {
        mVar.addInternal(this);
        d(mVar);
    }

    @Override // com.airbnb.epoxy.r
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        F();
        if (!F().equals(aVar.F())) {
            return false;
        }
        E();
        if (!E().equals(aVar.E())) {
            return false;
        }
        G();
        aVar.G();
        if (this.n != null) {
            if (aVar.n != null) {
                if (this.f8746o != null) {
                    if (aVar.f8746o != null) {
                        H();
                        aVar.H();
                        return true;
                    }
                    g.l("onLabelLongClickListener");
                    throw null;
                }
                g.l("onLabelLongClickListener");
                throw null;
            }
            g.l("onLabelClickListener");
            throw null;
        }
        g.l("onLabelClickListener");
        throw null;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.label_list_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        F();
        int hashCode = F().hashCode();
        E();
        int hashCode2 = E().hashCode();
        G();
        int hashCode3 = (((hashCode2 + ((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31)) * 31) + 1) * 31;
        if (this.n != null) {
            int i10 = (hashCode3 + 1) * 31;
            if (this.f8746o != null) {
                H();
                return ((i10 + 1) * 31) + 1;
            }
            g.l("onLabelLongClickListener");
            throw null;
        }
        g.l("onLabelClickListener");
        throw null;
    }

    @Override // com.airbnb.epoxy.r
    public final r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "LabelListItem_{labels=" + F() + ", color=" + E() + ", onAllLabelClickListener=" + G() + ", onNewLabelClickListener=" + H() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        LabelListItem.a aVar = (LabelListItem.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final LabelListItem.a z(ViewParent viewParent) {
        return new LabelListItem.a();
    }
}
