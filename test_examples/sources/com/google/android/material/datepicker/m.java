package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public final class m implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7078i;

    public m(MaterialCalendar materialCalendar) {
        this.f7078i = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f7078i;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f7019j0;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        MaterialCalendar.CalendarSelector calendarSelector3 = MaterialCalendar.CalendarSelector.DAY;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.c0(calendarSelector3);
        } else if (calendarSelector == calendarSelector3) {
            materialCalendar.c0(calendarSelector2);
        }
    }
}
