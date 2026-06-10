package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.noto.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e0 extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final MaterialCalendar<?> f7065d;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f7066u;

        public a(TextView textView) {
            super(textView);
            this.f7066u = textView;
        }
    }

    public e0(MaterialCalendar<?> materialCalendar) {
        this.f7065d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int d() {
        return this.f7065d.f7016g0.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void h(a aVar, int i10) {
        String format;
        b bVar;
        MaterialCalendar<?> materialCalendar = this.f7065d;
        int i11 = materialCalendar.f7016g0.f7035i.f7102k + i10;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = aVar.f7066u;
        textView.setText(format2);
        Context context = textView.getContext();
        if (c0.c().get(1) == i11) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
        }
        textView.setContentDescription(format);
        c cVar = materialCalendar.f7020k0;
        Calendar c = c0.c();
        if (c.get(1) == i11) {
            bVar = cVar.f7058f;
        } else {
            bVar = cVar.f7056d;
        }
        for (Long l2 : materialCalendar.f7015f0.v()) {
            c.setTimeInMillis(l2.longValue());
            if (c.get(1) == i11) {
                bVar = cVar.f7057e;
            }
        }
        bVar.b(textView);
        textView.setOnClickListener(new d0(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a j(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
