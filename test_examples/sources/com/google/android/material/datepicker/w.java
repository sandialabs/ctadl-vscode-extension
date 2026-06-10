package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f7113i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x f7114j;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f7114j = xVar;
        this.f7113i = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
        boolean z10;
        MaterialCalendarGridView materialCalendarGridView = this.f7113i;
        v adapter2 = materialCalendarGridView.getAdapter2();
        if (i10 >= adapter2.b() && i10 <= (adapter2.b() + adapter2.f7108i.f7104m) - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            MaterialCalendar.e eVar = this.f7114j.f7118g;
            long longValue = materialCalendarGridView.getAdapter2().getItem(i10).longValue();
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (materialCalendar.f7016g0.f7037k.o(longValue)) {
                materialCalendar.f7015f0.i();
                Iterator it = materialCalendar.f7122d0.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).a(materialCalendar.f7015f0.x());
                }
                materialCalendar.f7022m0.getAdapter().f5653a.b();
                RecyclerView recyclerView = materialCalendar.f7021l0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f5653a.b();
                }
            }
        }
    }
}
