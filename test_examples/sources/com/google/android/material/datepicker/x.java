package com.google.android.material.datepicker;

import a3.i0;
import a3.j0;
import a3.v0;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.noto.R;
import java.util.Calendar;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final com.google.android.material.datepicker.a f7115d;

    /* renamed from: e  reason: collision with root package name */
    public final d<?> f7116e;

    /* renamed from: f  reason: collision with root package name */
    public final f f7117f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialCalendar.e f7118g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7119h;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f7120u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f7121v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f7120u = textView;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            new i0().e(textView, Boolean.TRUE);
            this.f7121v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public x(ContextThemeWrapper contextThemeWrapper, d dVar, com.google.android.material.datepicker.a aVar, f fVar, MaterialCalendar.d dVar2) {
        int i10;
        Calendar calendar = aVar.f7035i.f7100i;
        u uVar = aVar.f7038l;
        if (calendar.compareTo(uVar.f7100i) <= 0) {
            if (uVar.f7100i.compareTo(aVar.f7036j.f7100i) <= 0) {
                int i11 = v.f7106o;
                int i12 = MaterialCalendar.f7013r0;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
                if (p.j0(contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.f7119h = dimensionPixelSize + i10;
                this.f7115d = aVar;
                this.f7116e = dVar;
                this.f7117f = fVar;
                this.f7118g = dVar2;
                q();
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int d() {
        return this.f7115d.f7040o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long e(int i10) {
        Calendar b5 = c0.b(this.f7115d.f7035i.f7100i);
        b5.add(2, i10);
        return new u(b5).f7100i.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void h(a aVar, int i10) {
        a aVar2 = aVar;
        com.google.android.material.datepicker.a aVar3 = this.f7115d;
        Calendar b5 = c0.b(aVar3.f7035i.f7100i);
        b5.add(2, i10);
        u uVar = new u(b5);
        aVar2.f7120u.setText(uVar.L());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f7121v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && uVar.equals(materialCalendarGridView.getAdapter2().f7108i)) {
            materialCalendarGridView.invalidate();
            v adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l2 : adapter2.f7110k) {
                adapter2.e(materialCalendarGridView, l2.longValue());
            }
            d<?> dVar = adapter2.f7109j;
            if (dVar != null) {
                for (Long l4 : dVar.v()) {
                    adapter2.e(materialCalendarGridView, l4.longValue());
                }
                adapter2.f7110k = dVar.v();
            }
        } else {
            v vVar = new v(uVar, this.f7116e, aVar3, this.f7117f);
            materialCalendarGridView.setNumColumns(uVar.f7103l);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a j(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (p.j0(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f7119h));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}
