package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class r implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p f7095i;

    public r(p pVar) {
        this.f7095i = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p pVar = this.f7095i;
        pVar.P0.setEnabled(pVar.g0().q());
        pVar.N0.toggle();
        pVar.m0(pVar.N0);
        pVar.l0();
    }
}
