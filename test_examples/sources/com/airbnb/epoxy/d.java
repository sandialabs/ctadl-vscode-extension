package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.q0;
import com.noto.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d extends RecyclerView.Adapter<b0> {

    /* renamed from: d  reason: collision with root package name */
    public int f6631d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final s0 f6632e = new s0();

    /* renamed from: f  reason: collision with root package name */
    public final f f6633f = new f();

    /* renamed from: g  reason: collision with root package name */
    public q0 f6634g = new q0();

    /* renamed from: h  reason: collision with root package name */
    public final a f6635h;

    /* loaded from: classes.dex */
    public class a extends GridLayoutManager.c {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            d dVar = d.this;
            try {
                return dVar.t(i10).t(dVar.f6631d, i10, dVar.d());
            } catch (IndexOutOfBoundsException e10) {
                dVar.v(e10);
                return 1;
            }
        }
    }

    public d() {
        a aVar = new a();
        this.f6635h = aVar;
        q();
        aVar.c = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int d() {
        return s().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long e(int i10) {
        return s().get(i10).f6681a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int f(int i10) {
        r<?> t10 = t(i10);
        this.f6632e.f6693a = t10;
        return s0.a(t10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void h(b0 b0Var, int i10) {
        i(b0Var, i10, Collections.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b0 j(ViewGroup viewGroup, int i10) {
        r<?> rVar;
        s0 s0Var = this.f6632e;
        r<?> rVar2 = s0Var.f6693a;
        if (rVar2 != null && s0.a(rVar2) == i10) {
            rVar = s0Var.f6693a;
        } else {
            v(new IllegalStateException("Last model did not match expected view type"));
            Iterator<? extends r<?>> it = s().iterator();
            while (true) {
                if (it.hasNext()) {
                    r<?> next = it.next();
                    if (s0.a(next) == i10) {
                        rVar = next;
                        break;
                    }
                } else {
                    h0 h0Var = new h0();
                    if (i10 == h0Var.i()) {
                        rVar = h0Var;
                    } else {
                        throw new IllegalStateException(androidx.activity.e.g("Could not find model for view type: ", i10));
                    }
                }
            }
        }
        rVar.getClass();
        return new b0(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(rVar.i(), viewGroup, false), rVar.s());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void k(RecyclerView recyclerView) {
        this.f6632e.f6693a = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean l(b0 b0Var) {
        b0 b0Var2 = b0Var;
        b0Var2.s();
        b0Var2.f6617u.o(b0Var2.u());
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void o(b0 b0Var) {
        b0 b0Var2 = b0Var;
        this.f6634g.N(b0Var2);
        this.f6633f.f6637i.K(b0Var2.f5669e);
        b0Var2.s();
        r<?> rVar = b0Var2.f6617u;
        b0Var2.v();
        x(b0Var2, rVar);
    }

    public abstract List<? extends r<?>> s();

    public r<?> t(int i10) {
        return s().get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: u */
    public final void i(b0 b0Var, int i10, List<Object> list) {
        r<?> rVar;
        r<?> t10 = t(i10);
        boolean z10 = this instanceof n;
        if (z10) {
            long e10 = e(i10);
            if (!list.isEmpty()) {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    rVar = iVar.f6645a;
                    if (rVar != null) {
                        if (rVar.f6681a == e10) {
                            break;
                        }
                    } else {
                        rVar = (r) iVar.f6646b.h(e10, null);
                        if (rVar != null) {
                            break;
                        }
                    }
                }
            }
        }
        rVar = null;
        b0Var.t(t10, rVar, list, i10);
        if (list.isEmpty()) {
            q0 q0Var = this.f6634g;
            q0Var.getClass();
            b0Var.s();
            if (b0Var.f6617u.s()) {
                q0.b bVar = (q0.b) q0Var.h(b0Var.f5669e, null);
                View view = b0Var.f5666a;
                if (bVar != null) {
                    int id = view.getId();
                    if (view.getId() == -1) {
                        view.setId(R.id.view_model_state_saving_id);
                    }
                    view.restoreHierarchyState(bVar);
                    view.setId(id);
                } else {
                    q0.b bVar2 = b0Var.f6620x;
                    if (bVar2 != null) {
                        int id2 = view.getId();
                        if (view.getId() == -1) {
                            view.setId(R.id.view_model_state_saving_id);
                        }
                        view.restoreHierarchyState(bVar2);
                        view.setId(id2);
                    }
                }
            }
        }
        this.f6633f.f6637i.J(b0Var.f5669e, b0Var);
        if (z10) {
            w(b0Var, t10, i10, rVar);
        }
    }

    public void v(RuntimeException runtimeException) {
    }

    public void w(b0 b0Var, r<?> rVar, int i10, r<?> rVar2) {
    }

    public void x(b0 b0Var, r<?> rVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: y */
    public void m(b0 b0Var) {
        b0Var.s();
        b0Var.f6617u.q(b0Var.u());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: z */
    public void n(b0 b0Var) {
        b0Var.s();
        b0Var.f6617u.r(b0Var.u());
    }
}
