package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class d0 extends RecyclerView.i {

    /* renamed from: g  reason: collision with root package name */
    public boolean f5814g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.b0 b0Var, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i10;
        int i11;
        if (cVar == null || ((i10 = cVar.f5689a) == (i11 = cVar2.f5689a) && cVar.f5690b == cVar2.f5690b)) {
            n(b0Var);
            return true;
        }
        return p(b0Var, i10, cVar.f5690b, i11, cVar2.f5690b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean b(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f5689a;
        int i13 = cVar.f5690b;
        if (b0Var2.q()) {
            int i14 = cVar.f5689a;
            i11 = cVar.f5690b;
            i10 = i14;
        } else {
            i10 = cVar2.f5689a;
            i11 = cVar2.f5690b;
        }
        return o(b0Var, b0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean c(RecyclerView.b0 b0Var, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i10 = cVar.f5689a;
        int i11 = cVar.f5690b;
        View view = b0Var.f5666a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f5689a;
        int top = cVar2 == null ? view.getTop() : cVar2.f5690b;
        if (b0Var.k() || (i10 == left && i11 == top)) {
            q(b0Var);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return p(b0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean d(RecyclerView.b0 b0Var, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i10 = cVar.f5689a;
        int i11 = cVar2.f5689a;
        if (i10 == i11 && cVar.f5690b == cVar2.f5690b) {
            h(b0Var);
            return false;
        }
        return p(b0Var, i10, cVar.f5690b, i11, cVar2.f5690b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f(RecyclerView.b0 b0Var) {
        if (this.f5814g && !b0Var.i()) {
            return false;
        }
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract void n(RecyclerView.b0 b0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean o(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean p(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract void q(RecyclerView.b0 b0Var);
}
