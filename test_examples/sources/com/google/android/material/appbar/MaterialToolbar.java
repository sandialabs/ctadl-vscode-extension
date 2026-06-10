package com.google.android.material.appbar;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b6.g;
import com.noto.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import ma.i;
import r2.a;
import u5.j;
import u5.k;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: i0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f6807i0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: d0  reason: collision with root package name */
    public Integer f6808d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6809e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6810f0;

    /* renamed from: g0  reason: collision with root package name */
    public ImageView.ScaleType f6811g0;

    /* renamed from: h0  reason: collision with root package name */
    public Boolean f6812h0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.toolbarStyle, 2132083835), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray d5 = j.d(context2, attributeSet, a1.b.f43o0, R.attr.toolbarStyle, 2132083835, new int[0]);
        if (d5.hasValue(2)) {
            setNavigationIconTint(d5.getColor(2, -1));
        }
        this.f6809e0 = d5.getBoolean(4, false);
        this.f6810f0 = d5.getBoolean(3, false);
        int i10 = d5.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f6807i0;
            if (i10 < scaleTypeArr.length) {
                this.f6811g0 = scaleTypeArr[i10];
            }
        }
        if (d5.hasValue(0)) {
            this.f6812h0 = Boolean.valueOf(d5.getBoolean(0, false));
        }
        d5.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.n(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.k(context2);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            gVar.m(j0.i.i(this));
            j0.d.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f6811g0;
    }

    public Integer getNavigationIconTint() {
        return this.f6808d0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.L(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f6809e0 || this.f6810f0) {
            ArrayList b5 = k.b(this, getTitle());
            boolean isEmpty = b5.isEmpty();
            k.a aVar = k.f17823a;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(b5, aVar);
            }
            ArrayList b10 = k.b(this, getSubtitle());
            if (b10.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(b10, aVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f6809e0 && textView != null) {
                    t(textView, pair);
                }
                if (this.f6810f0 && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f6812h0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f6811g0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).m(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f6812h0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f6812h0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f6811g0 != scaleType) {
            this.f6811g0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f6808d0 != null) {
            drawable = r2.a.g(drawable.mutate());
            a.b.g(drawable, this.f6808d0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f6808d0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f6810f0 != z10) {
            this.f6810f0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f6809e0 != z10) {
            this.f6809e0 = z10;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
