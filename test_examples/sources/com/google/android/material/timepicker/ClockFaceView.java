package com.google.android.material.timepicker;

import a3.j0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b3.g;
import com.google.android.material.timepicker.ClockHandView;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
class ClockFaceView extends c implements ClockHandView.a {
    public final ClockHandView B;
    public final Rect C;
    public final RectF D;
    public final Rect E;
    public final SparseArray<TextView> F;
    public final b G;
    public final int[] H;
    public final float[] I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public String[] N;
    public float O;
    public final ColorStateList P;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.C = new Rect();
        this.D = new RectF();
        this.E = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.F = sparseArray;
        this.I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.V, R.attr.materialClockStyle, 2132083827);
        Resources resources = getResources();
        ColorStateList a10 = x5.c.a(context, obtainStyledAttributes, 1);
        this.P = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.B = clockHandView;
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.H = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f7484k.add(this);
        int defaultColor = n2.a.c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = x5.c.a(context, obtainStyledAttributes, 0);
        if (a11 != null) {
            defaultColor = a11.getDefaultColor();
        }
        setBackgroundColor(defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.G = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.N = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.max(this.N.length, size); i10++) {
            TextView textView = sparseArray.get(i10);
            if (i10 >= this.N.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.N[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z10 = i11 > 1 ? true : z10;
                j0.p(textView, this.G);
                textView.setTextColor(this.P);
            }
        }
        ClockHandView clockHandView2 = this.B;
        if (clockHandView2.f7483j && !z10) {
            clockHandView2.f7493u = 1;
        }
        clockHandView2.f7483j = z10;
        clockHandView2.invalidate();
        this.K = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.L = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.M = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f10) {
        if (Math.abs(this.O - f10) > 0.001f) {
            this.O = f10;
            l();
        }
    }

    @Override // com.google.android.material.timepicker.c
    public final void k() {
        super.k();
        int i10 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.F;
            if (i10 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i10).setVisibility(0);
            i10++;
        }
    }

    public final void l() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        boolean z10;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.B.f7487o;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.F;
            int size = sparseArray.size();
            rectF = this.D;
            rect = this.C;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = sparseArray.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.E);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.H, this.I, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(1, this.N.length, 1).f6374a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.M / Math.max(Math.max(this.K / displayMetrics.heightPixels, this.L / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
