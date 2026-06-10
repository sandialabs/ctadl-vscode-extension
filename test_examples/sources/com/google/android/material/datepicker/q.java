package com.google.android.material.datepicker;

import a3.b1;
import android.view.View;

/* loaded from: classes.dex */
public final class q implements a3.x {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f7092i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f7093j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f7094k;

    public q(int i10, View view, int i11) {
        this.f7092i = i10;
        this.f7093j = view;
        this.f7094k = i11;
    }

    @Override // a3.x
    public final b1 a(View view, b1 b1Var) {
        int i10 = b1Var.a(7).f16872b;
        View view2 = this.f7093j;
        int i11 = this.f7092i;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f7094k + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return b1Var;
    }
}
