package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.noto.R;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class v extends BaseAdapter {

    /* renamed from: o  reason: collision with root package name */
    public static final int f7106o = c0.d(null).getMaximum(4);

    /* renamed from: p  reason: collision with root package name */
    public static final int f7107p = (c0.d(null).getMaximum(7) + c0.d(null).getMaximum(5)) - 1;

    /* renamed from: i  reason: collision with root package name */
    public final u f7108i;

    /* renamed from: j  reason: collision with root package name */
    public final d<?> f7109j;

    /* renamed from: k  reason: collision with root package name */
    public Collection<Long> f7110k;

    /* renamed from: l  reason: collision with root package name */
    public c f7111l;

    /* renamed from: m  reason: collision with root package name */
    public final a f7112m;
    public final f n;

    public v(u uVar, d<?> dVar, a aVar, f fVar) {
        this.f7108i = uVar;
        this.f7109j = dVar;
        this.f7112m = aVar;
        this.n = fVar;
        this.f7110k = dVar.v();
    }

    public final int b() {
        int i10 = this.f7112m.f7039m;
        u uVar = this.f7108i;
        Calendar calendar = uVar.f7100i;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + uVar.f7103l;
        }
        return i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final Long getItem(int i10) {
        if (i10 >= b()) {
            int b5 = b();
            u uVar = this.f7108i;
            if (i10 <= (b5 + uVar.f7104m) - 1) {
                Calendar b10 = c0.b(uVar.f7100i);
                b10.set(5, (i10 - b()) + 1);
                return Long.valueOf(b10.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    public final void d(TextView textView, long j2, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String format;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        b bVar;
        boolean z14;
        DateFormat instanceForSkeleton2;
        TimeZone timeZone2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z15 = true;
        if (c0.c().getTimeInMillis() == j2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d<?> dVar = this.f7109j;
        Iterator<z2.c<Long, Long>> it = dVar.n().iterator();
        while (true) {
            if (it.hasNext()) {
                Long l2 = it.next().f19113a;
                if (l2 != null && l2.longValue() == j2) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        Iterator<z2.c<Long, Long>> it2 = dVar.n().iterator();
        while (true) {
            if (it2.hasNext()) {
                Long l4 = it2.next().f19114b;
                if (l4 != null && l4.longValue() == j2) {
                    z12 = true;
                    break;
                }
            } else {
                z12 = false;
                break;
            }
        }
        Calendar c = c0.c();
        Calendar d5 = c0.d(null);
        d5.setTimeInMillis(j2);
        if (c.get(1) == d5.get(1)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            Locale locale = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                timeZone2 = TimeZone.getTimeZone("UTC");
                instanceForSkeleton2.setTimeZone(timeZone2);
                format = instanceForSkeleton2.format(new Date(j2));
            } else {
                java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                format = dateInstance.format(new Date(j2));
            }
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                timeZone = TimeZone.getTimeZone("UTC");
                instanceForSkeleton.setTimeZone(timeZone);
                format = instanceForSkeleton.format(new Date(j2));
            } else {
                java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                dateInstance2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                format = dateInstance2.format(new Date(j2));
            }
        }
        if (z10) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z11) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z12) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f7112m.f7037k.o(j2)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = dVar.v().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (c0.a(j2) == c0.a(it3.next().longValue())) {
                        z14 = true;
                        break;
                    }
                } else {
                    z14 = false;
                    break;
                }
            }
            textView.setSelected(z14);
            if (z14) {
                bVar = this.f7111l.f7055b;
            } else {
                if (c0.c().getTimeInMillis() != j2) {
                    z15 = false;
                }
                c cVar = this.f7111l;
                if (z15) {
                    bVar = cVar.c;
                } else {
                    bVar = cVar.f7054a;
                }
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f7111l.f7059g;
        }
        if (this.n != null && i10 != -1) {
            int i11 = this.f7108i.f7102k;
            bVar.b(textView);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(format);
            return;
        }
        bVar.b(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j2) {
        u K = u.K(j2);
        u uVar = this.f7108i;
        if (K.equals(uVar)) {
            Calendar b5 = c0.b(uVar.f7100i);
            b5.setTimeInMillis(j2);
            int i10 = b5.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter2().b() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j2, i10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f7107p;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f7108i.f7103l;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        Long item;
        Context context = viewGroup.getContext();
        if (this.f7111l == null) {
            this.f7111l = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int b5 = i10 - b();
        if (b5 >= 0) {
            u uVar = this.f7108i;
            if (b5 < uVar.f7104m) {
                i11 = b5 + 1;
                textView.setTag(uVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i10);
                if (item == null) {
                    d(textView, item.longValue(), i11);
                }
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i11 = -1;
        item = getItem(i10);
        if (item == null) {
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
