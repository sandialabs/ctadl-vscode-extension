package com.google.android.material.datepicker;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<b0> f7061a = new AtomicReference<>();

    public static long a(long j2) {
        Calendar d5 = d(null);
        d5.setTimeInMillis(j2);
        return b(d5).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar d5 = d(calendar);
        Calendar d10 = d(null);
        d10.set(d5.get(1), d5.get(2), d5.get(5));
        return d10;
    }

    public static Calendar c() {
        Calendar calendar;
        b0 b0Var = f7061a.get();
        if (b0Var == null) {
            b0Var = b0.c;
        }
        TimeZone timeZone = b0Var.f7053b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l2 = b0Var.f7052a;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
