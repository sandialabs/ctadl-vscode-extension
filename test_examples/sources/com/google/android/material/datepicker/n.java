package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ x f7079i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7080j;

    public n(MaterialCalendar materialCalendar, x xVar) {
        this.f7080j = materialCalendar;
        this.f7079i = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f7080j;
        int T0 = ((LinearLayoutManager) materialCalendar.f7022m0.getLayoutManager()).T0() + 1;
        if (T0 < materialCalendar.f7022m0.getAdapter().d()) {
            Calendar b5 = c0.b(this.f7079i.f7115d.f7035i.f7100i);
            b5.add(2, T0);
            materialCalendar.b0(new u(b5));
        }
    }
}
