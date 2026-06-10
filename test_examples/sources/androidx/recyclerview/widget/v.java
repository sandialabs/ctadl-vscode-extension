package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class v extends w {
    public v(RecyclerView.l lVar) {
        super(lVar);
    }

    @Override // androidx.recyclerview.widget.w
    public final int b(View view) {
        this.f5996a.getClass();
        return RecyclerView.l.y(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f5996a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f5712j;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f5996a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f5712j;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int e(View view) {
        this.f5996a.getClass();
        return (view.getTop() - RecyclerView.l.O(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int f() {
        return this.f5996a.f5705p;
    }

    @Override // androidx.recyclerview.widget.w
    public final int g() {
        RecyclerView.l lVar = this.f5996a;
        return lVar.f5705p - lVar.G();
    }

    @Override // androidx.recyclerview.widget.w
    public final int h() {
        return this.f5996a.G();
    }

    @Override // androidx.recyclerview.widget.w
    public final int i() {
        return this.f5996a.n;
    }

    @Override // androidx.recyclerview.widget.w
    public final int j() {
        return this.f5996a.f5703m;
    }

    @Override // androidx.recyclerview.widget.w
    public final int k() {
        return this.f5996a.J();
    }

    @Override // androidx.recyclerview.widget.w
    public final int l() {
        RecyclerView.l lVar = this.f5996a;
        return (lVar.f5705p - lVar.J()) - lVar.G();
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(View view) {
        RecyclerView.l lVar = this.f5996a;
        Rect rect = this.c;
        lVar.P(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(View view) {
        RecyclerView.l lVar = this.f5996a;
        Rect rect = this.c;
        lVar.P(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.w
    public final void p(int i10) {
        this.f5996a.V(i10);
    }
}
