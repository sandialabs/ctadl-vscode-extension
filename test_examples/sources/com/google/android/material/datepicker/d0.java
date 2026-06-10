package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f7062i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e0 f7063j;

    public d0(e0 e0Var, int i10) {
        this.f7063j = e0Var;
        this.f7062i = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e0 e0Var = this.f7063j;
        u J = u.J(this.f7062i, e0Var.f7065d.f7018i0.f7101j);
        MaterialCalendar<?> materialCalendar = e0Var.f7065d;
        a aVar = materialCalendar.f7016g0;
        u uVar = aVar.f7035i;
        Calendar calendar = uVar.f7100i;
        Calendar calendar2 = J.f7100i;
        if (calendar2.compareTo(calendar) < 0) {
            J = uVar;
        } else {
            u uVar2 = aVar.f7036j;
            if (calendar2.compareTo(uVar2.f7100i) > 0) {
                J = uVar2;
            }
        }
        materialCalendar.b0(J);
        materialCalendar.c0(MaterialCalendar.CalendarSelector.DAY);
    }
}
