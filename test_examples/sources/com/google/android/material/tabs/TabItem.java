package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f7348i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f7349j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7350k;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f57v0);
        this.f7348i = obtainStyledAttributes.getText(2);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = e.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        this.f7349j = drawable;
        this.f7350k = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
