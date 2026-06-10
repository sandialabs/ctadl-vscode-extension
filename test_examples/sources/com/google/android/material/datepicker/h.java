package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ x f7071i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7072j;

    public h(MaterialCalendar materialCalendar, x xVar) {
        this.f7072j = materialCalendar;
        this.f7071i = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f7072j;
        int U0 = ((LinearLayoutManager) materialCalendar.f7022m0.getLayoutManager()).U0() - 1;
        if (U0 >= 0) {
            Calendar b5 = c0.b(this.f7071i.f7115d.f7035i.f7100i);
            b5.add(2, U0);
            materialCalendar.b0(new u(b5));
        }
    }
}
