package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a0 implements a.InterfaceC0043a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5800a;

    public a0(RecyclerView recyclerView) {
        this.f5800a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f5797a;
        RecyclerView recyclerView = this.f5800a;
        if (i10 == 1) {
            recyclerView.f5643v.e0(bVar.f5798b, bVar.f5799d);
        } else if (i10 == 2) {
            recyclerView.f5643v.h0(bVar.f5798b, bVar.f5799d);
        } else if (i10 == 4) {
            recyclerView.f5643v.j0(recyclerView, bVar.f5798b, bVar.f5799d);
        } else if (i10 != 8) {
        } else {
            recyclerView.f5643v.g0(bVar.f5798b, bVar.f5799d);
        }
    }

    public final RecyclerView.b0 b(int i10) {
        RecyclerView recyclerView = this.f5800a;
        int h10 = recyclerView.n.h();
        int i11 = 0;
        RecyclerView.b0 b0Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.b0 L = RecyclerView.L(recyclerView.n.g(i11));
            if (L != null && !L.k() && L.c == i10) {
                if (recyclerView.n.k(L.f5666a)) {
                    b0Var = L;
                } else {
                    b0Var = L;
                    break;
                }
            }
            i11++;
        }
        if (b0Var == null || recyclerView.n.k(b0Var.f5666a)) {
            return null;
        }
        return b0Var;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f5800a;
        int h10 = recyclerView.n.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.n.g(i15);
            RecyclerView.b0 L = RecyclerView.L(g10);
            if (L != null && !L.q() && (i13 = L.c) >= i10 && i13 < i14) {
                L.b(2);
                L.a(obj);
                ((RecyclerView.m) g10.getLayoutParams()).f5713k = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f5622k;
        ArrayList<RecyclerView.b0> arrayList = sVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.b0 b0Var = arrayList.get(size);
                if (b0Var != null && (i12 = b0Var.c) >= i10 && i12 < i14) {
                    b0Var.b(2);
                    sVar.h(size);
                }
            } else {
                recyclerView.f5642u0 = true;
                return;
            }
        }
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f5800a;
        int h10 = recyclerView.n.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.b0 L = RecyclerView.L(recyclerView.n.g(i12));
            if (L != null && !L.q() && L.c >= i10) {
                L.n(i11, false);
                recyclerView.f5634q0.f5746f = true;
            }
        }
        ArrayList<RecyclerView.b0> arrayList = recyclerView.f5622k.c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.b0 b0Var = arrayList.get(i13);
            if (b0Var != null && b0Var.c >= i10) {
                b0Var.n(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5640t0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f5800a;
        int h10 = recyclerView.n.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.b0 L = RecyclerView.L(recyclerView.n.g(i20));
            if (L != null && (i18 = L.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    L.n(i11 - i10, false);
                } else {
                    L.n(i14, false);
                }
                recyclerView.f5634q0.f5746f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f5622k;
        sVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList<RecyclerView.b0> arrayList = sVar.c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.b0 b0Var = arrayList.get(i21);
            if (b0Var != null && (i17 = b0Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    b0Var.n(i11 - i10, false);
                } else {
                    b0Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5640t0 = true;
    }
}
