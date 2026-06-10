package com.airbnb.epoxy;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class o extends RecyclerView.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f6669a;

    public o(String str) {
        this.f6669a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void b(int i10, int i11) {
        Log.d(this.f6669a, "Item range changed. Start: " + i10 + " Count: " + i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void c(int i10, int i11, Object obj) {
        if (obj == null) {
            b(i10, i11);
            return;
        }
        Log.d(this.f6669a, a4.b.j("Item range changed with payloads. Start: ", i10, " Count: ", i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void d(int i10, int i11) {
        Log.d(this.f6669a, a4.b.j("Item range inserted. Start: ", i10, " Count: ", i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void e(int i10, int i11) {
        Log.d(this.f6669a, a4.b.j("Item moved. From: ", i10, " To: ", i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void f(int i10, int i11) {
        Log.d(this.f6669a, a4.b.j("Item range removed. Start: ", i10, " Count: ", i11));
    }
}
