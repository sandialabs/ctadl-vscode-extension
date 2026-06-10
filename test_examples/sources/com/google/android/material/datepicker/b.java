package com.google.android.material.datepicker;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f7047a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f7048b;
    public final ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f7049d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7050e;

    /* renamed from: f  reason: collision with root package name */
    public final b6.k f7051f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, b6.k kVar, Rect rect) {
        v8.b.l(rect.left);
        v8.b.l(rect.top);
        v8.b.l(rect.right);
        v8.b.l(rect.bottom);
        this.f7047a = rect;
        this.f7048b = colorStateList2;
        this.c = colorStateList;
        this.f7049d = colorStateList3;
        this.f7050e = i10;
        this.f7051f = kVar;
    }

    public static b a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.b.k("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a1.b.f28g0);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = x5.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = x5.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = x5.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        b6.k kVar = new b6.k(b6.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new b6.a(0)));
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, kVar, rect);
    }

    public final void b(TextView textView) {
        b6.g gVar = new b6.g();
        b6.g gVar2 = new b6.g();
        b6.k kVar = this.f7051f;
        gVar.setShapeAppearanceModel(kVar);
        gVar2.setShapeAppearanceModel(kVar);
        gVar.n(this.c);
        gVar.f6391i.f6418k = this.f7050e;
        gVar.invalidateSelf();
        gVar.s(this.f7049d);
        ColorStateList colorStateList = this.f7048b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7047a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.q(textView, insetDrawable);
    }
}
