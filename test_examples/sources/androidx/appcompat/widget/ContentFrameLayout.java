package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    public TypedValue f747i;

    /* renamed from: j  reason: collision with root package name */
    public TypedValue f748j;

    /* renamed from: k  reason: collision with root package name */
    public TypedValue f749k;

    /* renamed from: l  reason: collision with root package name */
    public TypedValue f750l;

    /* renamed from: m  reason: collision with root package name */
    public TypedValue f751m;
    public TypedValue n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f752o;

    /* renamed from: p  reason: collision with root package name */
    public a f753p;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f752o = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f751m == null) {
            this.f751m = new TypedValue();
        }
        return this.f751m;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.n == null) {
            this.n = new TypedValue();
        }
        return this.n;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f749k == null) {
            this.f749k = new TypedValue();
        }
        return this.f749k;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f750l == null) {
            this.f750l = new TypedValue();
        }
        return this.f750l;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f747i == null) {
            this.f747i = new TypedValue();
        }
        return this.f747i;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f748j == null) {
            this.f748j = new TypedValue();
        }
        return this.f748j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f753p;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f753p;
        if (aVar != null) {
            d.k kVar = ((d.m) aVar).f10312a;
            h0 h0Var = kVar.f10281z;
            if (h0Var != null) {
                h0Var.l();
            }
            if (kVar.E != null) {
                kVar.f10275t.getDecorView().removeCallbacks(kVar.F);
                if (kVar.E.isShowing()) {
                    try {
                        kVar.E.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                kVar.E = null;
            }
            a3.v0 v0Var = kVar.G;
            if (v0Var != null) {
                v0Var.b();
            }
            androidx.appcompat.view.menu.f fVar = kVar.R(0).f10302h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int measuredWidth;
        TypedValue typedValue;
        int i14;
        int i15;
        float fraction;
        int i16;
        int i17;
        float fraction2;
        int i18;
        int i19;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f752o;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f750l : this.f749k;
            if (typedValue2 != null && (i18 = typedValue2.type) != 0) {
                if (i18 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i18 == 6) {
                    int i20 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i20, i20);
                } else {
                    i19 = 0;
                    if (i19 > 0) {
                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i19 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z12 ? this.f751m : this.n;
                            if (typedValue3 != null && (i16 = typedValue3.type) != 0) {
                                if (i16 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i16 == 6) {
                                    int i21 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i21, i21);
                                } else {
                                    i17 = 0;
                                    if (i17 > 0) {
                                        i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                                        super.onMeasure(i12, i13);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z10 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z12 ? this.f748j : this.f747i;
                                            if (typedValue != null && (i14 = typedValue.type) != 0) {
                                                if (i14 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i14 == 6) {
                                                    int i22 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i22, i22);
                                                } else {
                                                    i15 = 0;
                                                    if (i15 > 0) {
                                                        i15 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i15) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                                        if (z11) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i13);
                                                        return;
                                                    }
                                                }
                                                i15 = (int) fraction;
                                                if (i15 > 0) {
                                                }
                                                if (measuredWidth < i15) {
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z11) {
                                        }
                                    }
                                }
                                i17 = (int) fraction2;
                                if (i17 > 0) {
                                }
                            }
                        }
                        i13 = i11;
                        super.onMeasure(i12, i13);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z10) {
                            if (!z12) {
                            }
                            if (typedValue != null) {
                                if (i14 != 5) {
                                }
                                i15 = (int) fraction;
                                if (i15 > 0) {
                                }
                                if (measuredWidth < i15) {
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                }
                i19 = (int) fraction3;
                if (i19 > 0) {
                }
            }
        }
        i12 = i10;
        z10 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i13 = i11;
        super.onMeasure(i12, i13);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z10) {
        }
        z11 = false;
        if (z11) {
        }
    }

    public void setAttachListener(a aVar) {
        this.f753p = aVar;
    }
}
