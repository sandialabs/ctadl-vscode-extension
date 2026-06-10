package com.google.android.material.materialswitch;

import a1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.x0;
import com.noto.R;
import i6.a;
import r2.a;
import u5.j;
import u5.n;

/* loaded from: classes.dex */
public class MaterialSwitch extends x0 {

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f7240q0 = {R.attr.state_with_icon};

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f7241e0;

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f7242f0;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f7243g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f7244h0;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f7245i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f7246j0;

    /* renamed from: k0  reason: collision with root package name */
    public PorterDuff.Mode f7247k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f7248l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f7249m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuff.Mode f7250n0;

    /* renamed from: o0  reason: collision with root package name */
    public int[] f7251o0;

    /* renamed from: p0  reason: collision with root package name */
    public int[] f7252p0;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialSwitchStyle, 2132083613), attributeSet, R.attr.materialSwitchStyle);
        Context context2 = getContext();
        this.f7241e0 = super.getThumbDrawable();
        this.f7245i0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f7243g0 = super.getTrackDrawable();
        this.f7248l0 = super.getTrackTintList();
        super.setTrackTintList(null);
        int[] iArr = b.f38l0;
        j.a(context2, attributeSet, R.attr.materialSwitchStyle, 2132083613);
        j.b(context2, attributeSet, iArr, R.attr.materialSwitchStyle, 2132083613, new int[0]);
        d1 d1Var = new d1(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.materialSwitchStyle, 2132083613));
        this.f7242f0 = d1Var.e(0);
        this.f7246j0 = d1Var.b(1);
        this.f7247k0 = n.f(d1Var.h(2, -1), PorterDuff.Mode.SRC_IN);
        this.f7244h0 = d1Var.e(3);
        this.f7249m0 = d1Var.b(4);
        this.f7250n0 = n.f(d1Var.h(5, -1), PorterDuff.Mode.SRC_IN);
        d1Var.n();
        setEnforceSwitchWidth(false);
        f();
        g();
    }

    public static void h(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f10) {
        if (drawable != null && colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, 0);
            int colorForState2 = colorStateList.getColorForState(iArr2, 0);
            ThreadLocal<double[]> threadLocal = q2.a.f16869a;
            float f11 = 1.0f - f10;
            a.b.g(drawable, Color.argb((int) ((Color.alpha(colorForState2) * f10) + (Color.alpha(colorForState) * f11)), (int) ((Color.red(colorForState2) * f10) + (Color.red(colorForState) * f11)), (int) ((Color.green(colorForState2) * f10) + (Color.green(colorForState) * f11)), (int) ((Color.blue(colorForState2) * f10) + (Color.blue(colorForState) * f11))));
        }
    }

    public final void f() {
        this.f7241e0 = q5.a.b(this.f7241e0, this.f7245i0, getThumbTintMode(), false);
        this.f7242f0 = q5.a.b(this.f7242f0, this.f7246j0, this.f7247k0, false);
        i();
        super.setThumbDrawable(q5.a.a(this.f7241e0, this.f7242f0));
        refreshDrawableState();
    }

    public final void g() {
        this.f7243g0 = q5.a.b(this.f7243g0, this.f7248l0, getTrackTintMode(), false);
        this.f7244h0 = q5.a.b(this.f7244h0, this.f7249m0, this.f7250n0, false);
        i();
        Drawable drawable = this.f7243g0;
        if (drawable != null && this.f7244h0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f7243g0, this.f7244h0});
        } else if (drawable == null) {
            drawable = this.f7244h0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.x0
    public Drawable getThumbDrawable() {
        return this.f7241e0;
    }

    public Drawable getThumbIconDrawable() {
        return this.f7242f0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f7246j0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f7247k0;
    }

    @Override // androidx.appcompat.widget.x0
    public ColorStateList getThumbTintList() {
        return this.f7245i0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f7244h0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f7249m0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f7250n0;
    }

    @Override // androidx.appcompat.widget.x0
    public Drawable getTrackDrawable() {
        return this.f7243g0;
    }

    @Override // androidx.appcompat.widget.x0
    public ColorStateList getTrackTintList() {
        return this.f7248l0;
    }

    public final void i() {
        if (this.f7245i0 == null && this.f7246j0 == null && this.f7248l0 == null && this.f7249m0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f7245i0;
        if (colorStateList != null) {
            h(this.f7241e0, colorStateList, this.f7251o0, this.f7252p0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f7246j0;
        if (colorStateList2 != null) {
            h(this.f7242f0, colorStateList2, this.f7251o0, this.f7252p0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f7248l0;
        if (colorStateList3 != null) {
            h(this.f7243g0, colorStateList3, this.f7251o0, this.f7252p0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f7249m0;
        if (colorStateList4 != null) {
            h(this.f7244h0, colorStateList4, this.f7251o0, this.f7252p0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        i();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.x0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f7242f0 != null) {
            View.mergeDrawableStates(onCreateDrawableState, f7240q0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i11 = 0;
        for (int i12 : onCreateDrawableState) {
            if (i12 != 16842912) {
                iArr[i11] = i12;
                i11++;
            }
        }
        this.f7251o0 = iArr;
        this.f7252p0 = q5.a.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.x0
    public void setThumbDrawable(Drawable drawable) {
        this.f7241e0 = drawable;
        f();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f7242f0 = drawable;
        f();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(e.a.a(getContext(), i10));
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f7246j0 = colorStateList;
        f();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f7247k0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.x0
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7245i0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.x0
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        f();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f7244h0 = drawable;
        g();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(e.a.a(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f7249m0 = colorStateList;
        g();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f7250n0 = mode;
        g();
    }

    @Override // androidx.appcompat.widget.x0
    public void setTrackDrawable(Drawable drawable) {
        this.f7243g0 = drawable;
        g();
    }

    @Override // androidx.appcompat.widget.x0
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f7248l0 = colorStateList;
        g();
    }

    @Override // androidx.appcompat.widget.x0
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        g();
    }
}
