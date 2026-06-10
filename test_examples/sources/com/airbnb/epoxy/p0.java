package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public final class p0 extends RecyclerView.r {

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<Queue<RecyclerView.b0>> f6670d = new SparseArray<>();

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a() {
        this.f6670d.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final RecyclerView.b0 b(int i10) {
        Queue<RecyclerView.b0> queue = this.f6670d.get(i10);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void d(RecyclerView.b0 b0Var) {
        v7.g.f(b0Var, "viewHolder");
        int i10 = b0Var.f5670f;
        SparseArray<Queue<RecyclerView.b0>> sparseArray = this.f6670d;
        Queue<RecyclerView.b0> queue = sparseArray.get(i10);
        if (queue == null) {
            queue = new LinkedList<>();
            sparseArray.put(i10, queue);
        }
        queue.add(b0Var);
    }
}
