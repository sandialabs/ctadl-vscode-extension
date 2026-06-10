package com.google.android.material.snackbar;

import a3.j0;
import a3.v0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.noto.R;
import e6.h;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements h {

    /* renamed from: i  reason: collision with root package name */
    public TextView f7331i;

    /* renamed from: j  reason: collision with root package name */
    public Button f7332j;

    /* renamed from: k  reason: collision with root package name */
    public final TimeInterpolator f7333k;

    /* renamed from: l  reason: collision with root package name */
    public int f7334l;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7333k = v5.a.d(context, R.attr.motionEasingEmphasizedInterpolator, e5.a.f10648b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f7331i.getPaddingTop() == i11 && this.f7331i.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f7331i;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.g(textView)) {
            j0.e.k(textView, j0.e.f(textView), i11, j0.e.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f7332j;
    }

    public TextView getMessageView() {
        return this.f7331i;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f7331i = (TextView) findViewById(R.id.snackbar_text);
        this.f7332j = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean z10 = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f7331i.getLayout();
        boolean z11 = layout != null && layout.getLineCount() > 1;
        if (!z11 || this.f7334l <= 0 || this.f7332j.getMeasuredWidth() <= this.f7334l) {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (a(0, dimensionPixelSize, dimensionPixelSize)) {
            }
            z10 = false;
        } else {
            if (a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            }
            z10 = false;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f7334l = i10;
    }
}
