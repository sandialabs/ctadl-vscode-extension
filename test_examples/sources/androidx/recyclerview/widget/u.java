package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class u extends w {
    public u(RecyclerView.l lVar) {
        super(lVar);
    }

    @Override // androidx.recyclerview.widget.w
    public final int b(View view) {
        this.f5996a.getClass();
        return RecyclerView.l.M(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f5996a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f5712j;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f5996a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f5712j;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int e(View view) {
        this.f5996a.getClass();
        return (view.getLeft() - RecyclerView.l.F(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.w
    public final int f() {
        return this.f5996a.f5704o;
    }

    @Override // androidx.recyclerview.widget.w
    public final int g() {
        RecyclerView.l lVar = this.f5996a;
        return lVar.f5704o - lVar.I();
    }

    @Override // androidx.recyclerview.widget.w
    public final int h() {
        return this.f5996a.I();
    }

    @Override // androidx.recyclerview.widget.w
    public final int i() {
        return this.f5996a.f5703m;
    }

    @Override // androidx.recyclerview.widget.w
    public final int j() {
        return this.f5996a.n;
    }

    @Override // androidx.recyclerview.widget.w
    public final int k() {
        return this.f5996a.H();
    }

    @Override // androidx.recyclerview.widget.w
    public final int l() {
        RecyclerView.l lVar = this.f5996a;
        return (lVar.f5704o - lVar.H()) - lVar.I();
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(View view) {
        RecyclerView.l lVar = this.f5996a;
        Rect rect = this.c;
        lVar.P(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(View view) {
        RecyclerView.l lVar = this.f5996a;
        Rect rect = this.c;
        lVar.P(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.w
    public final void p(int i10) {
        this.f5996a.U(i10);
    }
}
