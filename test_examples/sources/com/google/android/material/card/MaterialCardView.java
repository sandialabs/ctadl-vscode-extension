package com.google.android.material.card;

import a1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import b6.g;
import b6.k;
import b6.o;
import com.noto.R;
import k5.c;
import ma.i;
import r2.a;
import u5.j;

/* loaded from: classes.dex */
public class MaterialCardView extends o.a implements Checkable, o {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f6966t = {16842911};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f6967u = {16842912};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f6968v = {R.attr.state_dragged};

    /* renamed from: p  reason: collision with root package name */
    public final c f6969p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f6970q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6971r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6972s;

    /* loaded from: classes.dex */
    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.materialCardViewStyle, 2132083747), attributeSet, R.attr.materialCardViewStyle);
        this.f6971r = false;
        this.f6972s = false;
        this.f6970q = true;
        TypedArray d5 = j.d(getContext(), attributeSet, b.f30h0, R.attr.materialCardViewStyle, 2132083747, new int[0]);
        c cVar = new c(this, attributeSet);
        this.f6969p = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g gVar = cVar.c;
        gVar.n(cardBackgroundColor);
        cVar.f12897b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.j();
        MaterialCardView materialCardView = cVar.f12896a;
        ColorStateList a10 = x5.c.a(materialCardView.getContext(), d5, 11);
        cVar.n = a10;
        if (a10 == null) {
            cVar.n = ColorStateList.valueOf(-1);
        }
        cVar.f12902h = d5.getDimensionPixelSize(12, 0);
        boolean z10 = d5.getBoolean(0, false);
        cVar.f12912s = z10;
        materialCardView.setLongClickable(z10);
        cVar.f12906l = x5.c.a(materialCardView.getContext(), d5, 6);
        cVar.g(x5.c.d(materialCardView.getContext(), d5, 2));
        cVar.f12900f = d5.getDimensionPixelSize(5, 0);
        cVar.f12899e = d5.getDimensionPixelSize(4, 0);
        cVar.f12901g = d5.getInteger(3, 8388661);
        ColorStateList a11 = x5.c.a(materialCardView.getContext(), d5, 7);
        cVar.f12905k = a11;
        if (a11 == null) {
            cVar.f12905k = ColorStateList.valueOf(b.T(materialCardView, R.attr.colorControlHighlight));
        }
        ColorStateList a12 = x5.c.a(materialCardView.getContext(), d5, 1);
        g gVar2 = cVar.f12898d;
        gVar2.n(a12 == null ? ColorStateList.valueOf(0) : a12);
        int[] iArr = y5.b.f18890a;
        RippleDrawable rippleDrawable = cVar.f12908o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f12905k);
        }
        gVar.m(materialCardView.getCardElevation());
        ColorStateList colorStateList = cVar.n;
        gVar2.f6391i.f6418k = cVar.f12902h;
        gVar2.invalidateSelf();
        gVar2.s(colorStateList);
        materialCardView.setBackgroundInternal(cVar.d(gVar));
        LayerDrawable c = materialCardView.isClickable() ? cVar.c() : gVar2;
        cVar.f12903i = c;
        materialCardView.setForeground(cVar.d(c));
        d5.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f6969p.c.getBounds());
        return rectF;
    }

    public final void d() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = (cVar = this.f6969p).f12908o) != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i10 = bounds.bottom;
            cVar.f12908o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            cVar.f12908o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    @Override // o.a
    public ColorStateList getCardBackgroundColor() {
        return this.f6969p.c.f6391i.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f6969p.f12898d.f6391i.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f6969p.f12904j;
    }

    public int getCheckedIconGravity() {
        return this.f6969p.f12901g;
    }

    public int getCheckedIconMargin() {
        return this.f6969p.f12899e;
    }

    public int getCheckedIconSize() {
        return this.f6969p.f12900f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f6969p.f12906l;
    }

    @Override // o.a
    public int getContentPaddingBottom() {
        return this.f6969p.f12897b.bottom;
    }

    @Override // o.a
    public int getContentPaddingLeft() {
        return this.f6969p.f12897b.left;
    }

    @Override // o.a
    public int getContentPaddingRight() {
        return this.f6969p.f12897b.right;
    }

    @Override // o.a
    public int getContentPaddingTop() {
        return this.f6969p.f12897b.top;
    }

    public float getProgress() {
        return this.f6969p.c.f6391i.f6417j;
    }

    @Override // o.a
    public float getRadius() {
        return this.f6969p.c.j();
    }

    public ColorStateList getRippleColor() {
        return this.f6969p.f12905k;
    }

    public k getShapeAppearanceModel() {
        return this.f6969p.f12907m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f6969p.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f6969p.n;
    }

    public int getStrokeWidth() {
        return this.f6969p.f12902h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6971r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.M(this, this.f6969p.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.f6969p;
        if (cVar != null && cVar.f12912s) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f6966t);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6967u);
        }
        if (this.f6972s) {
            View.mergeDrawableStates(onCreateDrawableState, f6968v);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f6969p;
        if (cVar != null && cVar.f12912s) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // o.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f6969p.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f6970q) {
            c cVar = this.f6969p;
            if (!cVar.f12911r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f12911r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // o.a
    public void setCardBackgroundColor(int i10) {
        this.f6969p.c.n(ColorStateList.valueOf(i10));
    }

    @Override // o.a
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.f6969p;
        cVar.c.m(cVar.f12896a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.f6969p.f12898d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.n(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f6969p.f12912s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f6971r != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f6969p.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.f6969p;
        if (cVar.f12901g != i10) {
            cVar.f12901g = i10;
            MaterialCardView materialCardView = cVar.f12896a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f6969p.f12899e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f6969p.f12899e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f6969p.g(e.a.a(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f6969p.f12900f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f6969p.f12900f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f6969p;
        cVar.f12906l = colorStateList;
        Drawable drawable = cVar.f12904j;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        Drawable drawable;
        super.setClickable(z10);
        c cVar = this.f6969p;
        if (cVar != null) {
            Drawable drawable2 = cVar.f12903i;
            MaterialCardView materialCardView = cVar.f12896a;
            if (materialCardView.isClickable()) {
                drawable = cVar.c();
            } else {
                drawable = cVar.f12898d;
            }
            cVar.f12903i = drawable;
            if (drawable2 != drawable) {
                if (Build.VERSION.SDK_INT >= 23 && (materialCardView.getForeground() instanceof InsetDrawable)) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
                } else {
                    materialCardView.setForeground(cVar.d(drawable));
                }
            }
        }
    }

    public void setDragged(boolean z10) {
        if (this.f6972s != z10) {
            this.f6972s = z10;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // o.a
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f6969p.k();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // o.a
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        c cVar = this.f6969p;
        cVar.k();
        cVar.j();
    }

    public void setProgress(float f10) {
        c cVar = this.f6969p;
        cVar.c.o(f10);
        g gVar = cVar.f12898d;
        if (gVar != null) {
            gVar.o(f10);
        }
        g gVar2 = cVar.f12910q;
        if (gVar2 != null) {
            gVar2.o(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r3 != false) goto L16;
     */
    @Override // o.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setRadius(float f10) {
        boolean z10;
        super.setRadius(f10);
        c cVar = this.f6969p;
        cVar.h(cVar.f12907m.e(f10));
        cVar.f12903i.invalidateSelf();
        if (!cVar.i()) {
            if (cVar.f12896a.getPreventCornerOverlap() && !cVar.c.l()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        cVar.j();
        if (cVar.i()) {
            cVar.k();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f6969p;
        cVar.f12905k = colorStateList;
        int[] iArr = y5.b.f18890a;
        RippleDrawable rippleDrawable = cVar.f12908o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList c = n2.a.c(getContext(), i10);
        c cVar = this.f6969p;
        cVar.f12905k = c;
        int[] iArr = y5.b.f18890a;
        RippleDrawable rippleDrawable = cVar.f12908o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c);
        }
    }

    @Override // b6.o
    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.d(getBoundsAsRectF()));
        this.f6969p.h(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f6969p;
        if (cVar.n != colorStateList) {
            cVar.n = colorStateList;
            g gVar = cVar.f12898d;
            gVar.f6391i.f6418k = cVar.f12902h;
            gVar.invalidateSelf();
            gVar.s(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        c cVar = this.f6969p;
        if (i10 != cVar.f12902h) {
            cVar.f12902h = i10;
            g gVar = cVar.f12898d;
            ColorStateList colorStateList = cVar.n;
            gVar.f6391i.f6418k = i10;
            gVar.invalidateSelf();
            gVar.s(colorStateList);
        }
        invalidate();
    }

    @Override // o.a
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        c cVar = this.f6969p;
        cVar.k();
        cVar.j();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        boolean z10;
        c cVar = this.f6969p;
        if (cVar != null && cVar.f12912s) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && isEnabled()) {
            this.f6971r = !this.f6971r;
            refreshDrawableState();
            d();
            cVar.f(this.f6971r, true);
        }
    }

    @Override // o.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f6969p.c.n(colorStateList);
    }
}
