package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.q0;
import com.noto.R;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends RecyclerView.b0 {

    /* renamed from: u  reason: collision with root package name */
    public r f6617u;

    /* renamed from: v  reason: collision with root package name */
    public List<Object> f6618v;

    /* renamed from: w  reason: collision with root package name */
    public p f6619w;

    /* renamed from: x  reason: collision with root package name */
    public final q0.b f6620x;

    /* renamed from: y  reason: collision with root package name */
    public ViewParent f6621y;

    public b0(ViewParent viewParent, View view, boolean z10) {
        super(view);
        this.f6621y = viewParent;
        if (z10) {
            q0.b bVar = new q0.b();
            this.f6620x = bVar;
            int id = view.getId();
            if (view.getId() == -1) {
                view.setId(R.id.view_model_state_saving_id);
            }
            view.saveHierarchyState(bVar);
            view.setId(id);
        }
    }

    public final void s() {
        if (this.f6617u == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    public final void t(r rVar, r<?> rVar2, List<Object> list, int i10) {
        this.f6618v = list;
        if (this.f6619w == null && (rVar instanceof z)) {
            p z10 = ((z) rVar).z(this.f6621y);
            this.f6619w = z10;
            z10.a(this.f5666a);
        }
        this.f6621y = null;
        if (rVar instanceof c0) {
            ((c0) rVar).a(u(), i10);
        }
        rVar.getClass();
        if (rVar2 != null) {
            rVar.e(rVar2, u());
        } else if (list.isEmpty()) {
            rVar.f(u());
        } else {
            rVar.g(u(), list);
        }
        if (rVar instanceof c0) {
            ((c0) rVar).b(i10, u());
        }
        this.f6617u = rVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    public final String toString() {
        StringBuilder sb = new StringBuilder("EpoxyViewHolder{epoxyModel=");
        sb.append(this.f6617u);
        sb.append(", view=");
        sb.append(this.f5666a);
        sb.append(", super=");
        return androidx.activity.e.j(sb, super.toString(), '}');
    }

    public final Object u() {
        p pVar = this.f6619w;
        return pVar != null ? pVar : this.f5666a;
    }

    public final void v() {
        s();
        this.f6617u.u(u());
        this.f6617u = null;
    }
}
