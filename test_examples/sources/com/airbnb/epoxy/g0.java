package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g0 extends RecyclerView.Adapter<b0> {

    /* renamed from: d  reason: collision with root package name */
    public r<?> f6641d;

    /* renamed from: e  reason: collision with root package name */
    public ViewParent f6642e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int d() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void h(b0 b0Var, int i10) {
        b0 b0Var2 = b0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b0 j(ViewGroup viewGroup, int i10) {
        v7.g.f(viewGroup, "parent");
        ViewParent viewParent = this.f6642e;
        r<?> rVar = this.f6641d;
        v7.g.c(rVar);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(rVar.i(), viewGroup, false);
        r<?> rVar2 = this.f6641d;
        v7.g.c(rVar2);
        return new b0(viewParent, inflate, rVar2.s());
    }
}
