package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.noto.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: l  reason: collision with root package name */
    public static final int f7067l;

    /* renamed from: i  reason: collision with root package name */
    public final Calendar f7068i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7069j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7070k;

    static {
        f7067l = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar d5 = c0.d(null);
        this.f7068i = d5;
        this.f7069j = d5.getMaximum(7);
        this.f7070k = d5.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7069j;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f7069j;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f7070k;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f7070k;
        int i12 = this.f7069j;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f7068i;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f7067l, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public g(int i10) {
        Calendar d5 = c0.d(null);
        this.f7068i = d5;
        this.f7069j = d5.getMaximum(7);
        this.f7070k = i10;
    }
}
