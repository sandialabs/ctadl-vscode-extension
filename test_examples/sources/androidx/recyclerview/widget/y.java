package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class y extends e0 {
    public v c;

    /* renamed from: d  reason: collision with root package name */
    public u f5999d;

    public static int e(View view, w wVar) {
        return ((wVar.c(view) / 2) + wVar.e(view)) - ((wVar.l() / 2) + wVar.k());
    }

    public static View f(RecyclerView.l lVar, w wVar) {
        int A = lVar.A();
        View view = null;
        if (A == 0) {
            return null;
        }
        int l2 = (wVar.l() / 2) + wVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < A; i11++) {
            View z10 = lVar.z(i11);
            int abs = Math.abs(((wVar.c(z10) / 2) + wVar.e(z10)) - l2);
            if (abs < i10) {
                view = z10;
                i10 = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.e0
    public final int[] b(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.h()) {
            iArr[0] = e(view, g(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.i()) {
            iArr[1] = e(view, h(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.e0
    @SuppressLint({"UnknownNullness"})
    public View c(RecyclerView.l lVar) {
        w g10;
        if (lVar.i()) {
            g10 = h(lVar);
        } else if (!lVar.h()) {
            return null;
        } else {
            g10 = g(lVar);
        }
        return f(lVar, g10);
    }

    public final w g(RecyclerView.l lVar) {
        u uVar = this.f5999d;
        if (uVar == null || uVar.f5996a != lVar) {
            this.f5999d = new u(lVar);
        }
        return this.f5999d;
    }

    public final w h(RecyclerView.l lVar) {
        v vVar = this.c;
        if (vVar == null || vVar.f5996a != lVar) {
            this.c = new v(lVar);
        }
        return this.c;
    }
}
