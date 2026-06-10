package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.noto.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a0 extends n.d {
    @Override // androidx.recyclerview.widget.n.d
    public final boolean b(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "current");
        v7.g.f(b0Var2, "target");
        b0 b0Var3 = (b0) b0Var;
        b0 b0Var4 = (b0) b0Var2;
        b0Var4.s();
        return ((y) this).s(b0Var4.f6617u);
    }

    @Override // androidx.recyclerview.widget.n.d
    public final RecyclerView.b0 c(RecyclerView.b0 b0Var, ArrayList arrayList, int i10, int i11) {
        v7.g.f(b0Var, "selected");
        RecyclerView.b0 c = super.c((b0) b0Var, arrayList, i10, i11);
        if (c instanceof b0) {
            return (b0) c;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void d(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        p(recyclerView, (b0) b0Var);
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void e(RecyclerView.b0 b0Var) {
        v7.g.f(b0Var, "viewHolder");
        b0 b0Var2 = (b0) b0Var;
    }

    @Override // androidx.recyclerview.widget.n.d
    public final int f(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        boolean z10;
        boolean z11;
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        b0 b0Var2 = (b0) b0Var;
        y yVar = (y) this;
        b0Var2.s();
        r<?> rVar = b0Var2.f6617u;
        if (yVar.f6731f == null && yVar.f6732g == null) {
            z10 = true;
            if (recyclerView.getTag(R.id.epoxy_touch_helper_selection_status) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (z10 && yVar.s(rVar)) {
                    b0Var2.d();
                    return yVar.a(rVar);
                }
            }
        }
        z10 = false;
        return z10 ? 0 : 0;
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void g(RecyclerView.b0 b0Var) {
        b0 b0Var2 = (b0) b0Var;
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void j(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f10, float f11, int i10, boolean z10) {
        v7.g.f(canvas, "c");
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        q(canvas, recyclerView, (b0) b0Var, f10, f11, i10, z10);
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        b0 b0Var2;
        v7.g.f(canvas, "c");
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        if (b0Var instanceof b0) {
            b0Var2 = (b0) b0Var;
        } else {
            b0Var2 = null;
        }
        v7.g.d(b0Var2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void l(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        b0 b0Var3 = (b0) b0Var;
        b0 b0Var4 = (b0) b0Var2;
        y yVar = (y) this;
        m mVar = yVar.f6729d;
        if (mVar != null) {
            mVar.moveModel(b0Var3.d(), b0Var4.d());
            b0Var3.s();
            r<?> rVar = b0Var3.f6617u;
            if (yVar.s(rVar)) {
                yVar.v(rVar);
                return;
            }
            throw new IllegalStateException("A model was dragged that is not a valid target: " + rVar.getClass());
        }
        throw new IllegalStateException("A controller must be provided in the constructor if dragging is enabled");
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void m(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10, RecyclerView.b0 b0Var2, int i11, int i12, int i13) {
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        super.m(recyclerView, (b0) b0Var, i10, (b0) b0Var2, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void n(RecyclerView.b0 b0Var, int i10) {
        b0 b0Var2 = (b0) b0Var;
        y yVar = (y) this;
        if (b0Var2 != null) {
            b0Var2.s();
            r<?> rVar = b0Var2.f6617u;
            if (yVar.s(rVar)) {
                View view = b0Var2.f5666a;
                ((RecyclerView) view.getParent()).setTag(R.id.epoxy_touch_helper_selection_status, Boolean.TRUE);
                if (i10 == 1) {
                    yVar.f6732g = b0Var2;
                    b0Var2.d();
                    return;
                } else if (i10 == 2) {
                    yVar.f6731f = b0Var2;
                    b0Var2.d();
                    yVar.u(rVar, view);
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalStateException("A model was selected that is not a valid target: " + rVar.getClass());
        }
        b0 b0Var3 = yVar.f6731f;
        if (b0Var3 != null) {
            b0Var3.s();
            yVar.t(b0Var3.f6617u, yVar.f6731f.f5666a);
            yVar.f6731f = null;
            return;
        }
        b0 b0Var4 = yVar.f6732g;
        if (b0Var4 != null) {
            b0Var4.s();
            View view2 = yVar.f6732g.f5666a;
            yVar.f6732g = null;
        }
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void o(RecyclerView.b0 b0Var, int i10) {
        v7.g.f(b0Var, "viewHolder");
        r((b0) b0Var, i10);
    }

    public void p(RecyclerView recyclerView, b0 b0Var) {
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        super.d(recyclerView, b0Var);
    }

    public void q(Canvas canvas, RecyclerView recyclerView, b0 b0Var, float f10, float f11, int i10, boolean z10) {
        v7.g.f(canvas, "c");
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        super.j(canvas, recyclerView, b0Var, f10, f11, i10, z10);
    }

    public abstract void r(b0 b0Var, int i10);
}
