package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.k;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f6815a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f6816b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6817d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f6818e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f6818e = baseBehavior;
        this.f6815a = coordinatorLayout;
        this.f6816b = appBarLayout;
        this.c = view;
        this.f6817d = i10;
    }

    @Override // b3.k
    public final boolean a(View view) {
        this.f6818e.E(this.f6815a, this.f6816b, this.c, this.f6817d, new int[]{0, 0});
        return true;
    }
}
