package com.noto.app.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import o3.b;
import o3.c;
import o3.d;
import v7.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/noto/app/util/BounceScrollingViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BounceScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: g  reason: collision with root package name */
    public int f9811g;

    public BounceScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void x(View view) {
        g.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            g.e(childAt, "getChildAt(index)");
            c cVar = new c(childAt, b.f16246m);
            d dVar = new d();
            dVar.f16274i = 0.0f;
            dVar.a(0.5f);
            dVar.b(200.0f);
            cVar.f16264t = dVar;
            cVar.e();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        g.f(coordinatorLayout, "coordinatorLayout");
        g.f(view2, "target");
        if (this.f9811g == 0) {
            return false;
        }
        x(view2);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int[] iArr) {
        g.f(coordinatorLayout, "coordinatorLayout");
        g.f(view2, "target");
        g.f(iArr, "consumed");
        if (i12 == 0) {
            return;
        }
        this.f9811g -= (i12 < 0 ? (char) 65535 : i12 > 0 ? (char) 1 : (char) 0) == 1 ? i12 / 2 : i12 / 6;
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            g.e(childAt, "getChildAt(index)");
            childAt.setTranslationY(this.f9811g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        g.f(coordinatorLayout, "coordinatorLayout");
        g.f(view2, "directTargetChild");
        g.f(view3, "target");
        this.f9811g = 0;
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        g.f(coordinatorLayout, "coordinatorLayout");
        g.f(view2, "target");
        x(view2);
    }
}
