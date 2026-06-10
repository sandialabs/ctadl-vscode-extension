package com.google.android.material.radiobutton;

import a1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;
import com.noto.R;
import e3.b;
import i6.a;
import u5.j;
import x5.c;

/* loaded from: classes.dex */
public class MaterialRadioButton extends u {

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f7254o = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f7255m;
    public boolean n;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.radioButtonStyle, 2132083760), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d5 = j.d(context2, attributeSet, b.f34j0, R.attr.radioButtonStyle, 2132083760, new int[0]);
        if (d5.hasValue(0)) {
            b.a.c(this, c.a(context2, d5, 0));
        }
        this.n = d5.getBoolean(1, false);
        d5.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7255m == null) {
            int T = a1.b.T(this, R.attr.colorControlActivated);
            int T2 = a1.b.T(this, R.attr.colorOnSurface);
            int T3 = a1.b.T(this, R.attr.colorSurface);
            this.f7255m = new ColorStateList(f7254o, new int[]{a1.b.p0(1.0f, T3, T), a1.b.p0(0.54f, T3, T2), a1.b.p0(0.38f, T3, T2), a1.b.p0(0.38f, T3, T2)});
        }
        return this.f7255m;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n && b.a.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        ColorStateList colorStateList;
        this.n = z10;
        if (z10) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        b.a.c(this, colorStateList);
    }
}
