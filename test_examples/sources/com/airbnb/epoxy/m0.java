package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class m0 extends RecyclerView.f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6663a;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void a() {
        if (!this.f6663a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void b(int i10, int i11) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void c(int i10, int i11, Object obj) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void d(int i10, int i11) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void e(int i10, int i11) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void f(int i10, int i11) {
        a();
    }
}
