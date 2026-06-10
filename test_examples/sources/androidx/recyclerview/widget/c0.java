package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 {
    public static int a(RecyclerView.x xVar, w wVar, View view, View view2, RecyclerView.l lVar, boolean z10) {
        if (lVar.A() != 0 && xVar.b() != 0 && view != null && view2 != null) {
            if (z10) {
                return Math.min(wVar.l(), wVar.b(view2) - wVar.e(view));
            }
            return Math.abs(RecyclerView.l.K(view) - RecyclerView.l.K(view2)) + 1;
        }
        return 0;
    }

    public static int b(RecyclerView.x xVar, w wVar, View view, View view2, RecyclerView.l lVar, boolean z10, boolean z11) {
        if (lVar.A() != 0 && xVar.b() != 0 && view != null && view2 != null) {
            int max = z11 ? Math.max(0, (xVar.b() - Math.max(RecyclerView.l.K(view), RecyclerView.l.K(view2))) - 1) : Math.max(0, Math.min(RecyclerView.l.K(view), RecyclerView.l.K(view2)));
            if (z10) {
                return Math.round((max * (Math.abs(wVar.b(view2) - wVar.e(view)) / (Math.abs(RecyclerView.l.K(view) - RecyclerView.l.K(view2)) + 1))) + (wVar.k() - wVar.e(view)));
            }
            return max;
        }
        return 0;
    }

    public static int c(RecyclerView.x xVar, w wVar, View view, View view2, RecyclerView.l lVar, boolean z10) {
        if (lVar.A() != 0 && xVar.b() != 0 && view != null && view2 != null) {
            if (z10) {
                return (int) (((wVar.b(view2) - wVar.e(view)) / (Math.abs(RecyclerView.l.K(view) - RecyclerView.l.K(view2)) + 1)) * xVar.b());
            }
            return xVar.b();
        }
        return 0;
    }
}
