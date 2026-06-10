package com.google.android.material.datepicker;

import android.view.View;
import com.noto.R;

/* loaded from: classes.dex */
public final class k extends a3.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7075d;

    public k(MaterialCalendar materialCalendar) {
        this.f7075d = materialCalendar;
    }

    @Override // a3.a
    public final void d(View view, b3.g gVar) {
        int i10;
        this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
        MaterialCalendar materialCalendar = this.f7075d;
        if (materialCalendar.f7026q0.getVisibility() == 0) {
            i10 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            i10 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        gVar.n(materialCalendar.q(i10));
    }
}
