package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class l extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f7076a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f7077b;
    public final /* synthetic */ MaterialCalendar c;

    public l(MaterialCalendar materialCalendar, x xVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.f7076a = xVar;
        this.f7077b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(int i10, RecyclerView recyclerView) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f7077b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int U0;
        MaterialCalendar materialCalendar = this.c;
        if (i10 < 0) {
            U0 = ((LinearLayoutManager) materialCalendar.f7022m0.getLayoutManager()).T0();
        } else {
            U0 = ((LinearLayoutManager) materialCalendar.f7022m0.getLayoutManager()).U0();
        }
        x xVar = this.f7076a;
        Calendar b5 = c0.b(xVar.f7115d.f7035i.f7100i);
        b5.add(2, U0);
        materialCalendar.f7018i0 = new u(b5);
        Calendar b10 = c0.b(xVar.f7115d.f7035i.f7100i);
        b10.add(2, U0);
        b10.set(5, 1);
        Calendar b11 = c0.b(b10);
        b11.get(2);
        b11.get(1);
        b11.getMaximum(7);
        b11.getActualMaximum(5);
        b11.getTimeInMillis();
        this.f7077b.setText(DateUtils.formatDateTime(null, b11.getTimeInMillis(), 8228));
    }
}
