package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.noto.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f7054a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7055b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final b f7056d;

    /* renamed from: e  reason: collision with root package name */
    public final b f7057e;

    /* renamed from: f  reason: collision with root package name */
    public final b f7058f;

    /* renamed from: g  reason: collision with root package name */
    public final b f7059g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f7060h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x5.b.c(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, a1.b.f26f0);
        this.f7054a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f7059g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f7055b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = x5.c.a(context, obtainStyledAttributes, 6);
        this.f7056d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f7057e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f7058f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f7060h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
