package com.google.android.material.appbar;

import android.view.View;
import b3.k;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f6819a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6820b;

    public c(AppBarLayout appBarLayout, boolean z10) {
        this.f6819a = appBarLayout;
        this.f6820b = z10;
    }

    @Override // b3.k
    public final boolean a(View view) {
        this.f6819a.setExpanded(this.f6820b);
        return true;
    }
}
