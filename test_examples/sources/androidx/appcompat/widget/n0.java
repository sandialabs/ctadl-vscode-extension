package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class n0 extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public boolean f1042i;

    /* renamed from: j  reason: collision with root package name */
    public int f1043j;

    /* renamed from: k  reason: collision with root package name */
    public int f1044k;

    /* renamed from: l  reason: collision with root package name */
    public int f1045l;

    /* renamed from: m  reason: collision with root package name */
    public int f1046m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public float f1047o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1048p;

    /* renamed from: q  reason: collision with root package name */
    public int[] f1049q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f1050r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f1051s;

    /* renamed from: t  reason: collision with root package name */
    public int f1052t;

    /* renamed from: u  reason: collision with root package name */
    public int f1053u;

    /* renamed from: v  reason: collision with root package name */
    public int f1054v;

    /* renamed from: w  reason: collision with root package name */
    public int f1055w;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public n0(Context context) {
        this(context, null);
    }

    public n0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public n0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f1042i = true;
        this.f1043j = -1;
        this.f1044k = 0;
        this.f1046m = 8388659;
        int[] iArr = a1.b.f60x;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        a3.j0.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f1047o = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1043j = obtainStyledAttributes.getInt(3, -1);
        this.f1048p = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = e.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.f1054v = obtainStyledAttributes.getInt(8, 0);
        this.f1055w = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i10) {
        this.f1051s.setBounds(getPaddingLeft() + this.f1055w, i10, (getWidth() - getPaddingRight()) - this.f1055w, this.f1053u + i10);
        this.f1051s.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.f1051s.setBounds(i10, getPaddingTop() + this.f1055w, this.f1052t + i10, (getHeight() - getPaddingBottom()) - this.f1055w);
        this.f1051s.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1045l;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1043j < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1043j;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1043j == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f1044k;
            if (this.f1045l == 1 && (i10 = this.f1046m & 112) != 48) {
                if (i10 == 16) {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.n) / 2;
                } else if (i10 == 80) {
                    i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.n;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1043j;
    }

    public Drawable getDividerDrawable() {
        return this.f1051s;
    }

    public int getDividerPadding() {
        return this.f1055w;
    }

    public int getDividerWidth() {
        return this.f1052t;
    }

    public int getGravity() {
        return this.f1046m;
    }

    public int getOrientation() {
        return this.f1045l;
    }

    public int getShowDividers() {
        return this.f1054v;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1047o;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.f1054v & 1) != 0;
        } else if (i10 == getChildCount()) {
            return (this.f1054v & 4) != 0;
        } else if ((this.f1054v & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int bottom;
        if (this.f1051s == null) {
            return;
        }
        int i11 = 0;
        if (this.f1045l == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && i(i11)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f1053u);
                }
                i11++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f1053u;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = n1.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i11)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (a10) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1052t;
                }
                e(canvas, left2);
            }
            i11++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a10) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i10 = getPaddingRight();
                    right = (left - i10) - this.f1052t;
                }
            } else {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft();
                    i10 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.f1052t;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int paddingTop;
        int i23;
        int i24;
        int i25 = 8;
        int i26 = 5;
        if (this.f1045l == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i27 = i12 - i10;
            int paddingRight = i27 - getPaddingRight();
            int paddingRight2 = (i27 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i28 = this.f1046m;
            int i29 = i28 & 112;
            int i30 = 8388615 & i28;
            if (i29 != 16) {
                if (i29 != 80) {
                    paddingTop = getPaddingTop();
                } else {
                    paddingTop = ((getPaddingTop() + i13) - i11) - this.n;
                }
            } else {
                paddingTop = getPaddingTop() + (((i13 - i11) - this.n) / 2);
            }
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View childAt = getChildAt(i31);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i25) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i32 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i32 < 0) {
                        i32 = i30;
                    }
                    WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i32, j0.e.d(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != i26) {
                            i24 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft2;
                            if (i(i31)) {
                                paddingTop += this.f1053u;
                            }
                            int i33 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                            int i34 = i33 + 0;
                            childAt.layout(i24, i34, measuredWidth + i24, measuredHeight + i34);
                            i31 += 0;
                            paddingTop = measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0 + i33;
                        } else {
                            i23 = paddingRight - measuredWidth;
                        }
                    } else {
                        i23 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    }
                    i24 = i23 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                    if (i(i31)) {
                    }
                    int i332 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    int i342 = i332 + 0;
                    childAt.layout(i24, i342, measuredWidth + i24, measuredHeight + i342);
                    i31 += 0;
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0 + i332;
                }
                i31++;
                i25 = 8;
                i26 = 5;
            }
            return;
        }
        boolean a10 = n1.a(this);
        int paddingTop2 = getPaddingTop();
        int i35 = i13 - i11;
        int paddingBottom = i35 - getPaddingBottom();
        int paddingBottom2 = (i35 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i36 = this.f1046m;
        int i37 = 8388615 & i36;
        int i38 = i36 & 112;
        boolean z11 = this.f1042i;
        int[] iArr = this.f1049q;
        int[] iArr2 = this.f1050r;
        WeakHashMap<View, a3.v0> weakHashMap2 = a3.j0.f188a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i37, j0.e.d(this));
        if (absoluteGravity2 != 1) {
            if (absoluteGravity2 != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i12) - i10) - this.n;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.n) / 2);
        }
        if (a10) {
            i14 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i39 = paddingLeft;
        int i40 = 0;
        while (i40 < virtualChildCount2) {
            int i41 = (i15 * i40) + i14;
            View childAt2 = getChildAt(i41);
            if (childAt2 == null) {
                i39 += 0;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                a aVar2 = (a) childAt2.getLayoutParams();
                i16 = i14;
                if (z11) {
                    i17 = virtualChildCount2;
                    if (((LinearLayout.LayoutParams) aVar2).height != -1) {
                        i18 = childAt2.getBaseline();
                        i19 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i19 < 0) {
                            i19 = i38;
                        }
                        i20 = i19 & 112;
                        i21 = i38;
                        if (i20 == 16) {
                            if (i20 != 48) {
                                if (i20 != 80) {
                                    i22 = paddingTop2;
                                } else {
                                    i22 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                                    if (i18 != -1) {
                                        i22 -= iArr2[2] - (childAt2.getMeasuredHeight() - i18);
                                    }
                                }
                            } else {
                                i22 = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                                if (i18 != -1) {
                                    i22 = (iArr[1] - i18) + i22;
                                }
                            }
                        } else {
                            i22 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        }
                        if (i(i41)) {
                            i39 += this.f1052t;
                        }
                        int i42 = i39 + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        int i43 = i42 + 0;
                        childAt2.layout(i43, i22, measuredWidth2 + i43, measuredHeight2 + i22);
                        i39 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + i42;
                        i40 += 0;
                        i40++;
                        i14 = i16;
                        virtualChildCount2 = i17;
                        i38 = i21;
                    }
                } else {
                    i17 = virtualChildCount2;
                }
                i18 = -1;
                i19 = ((LinearLayout.LayoutParams) aVar2).gravity;
                if (i19 < 0) {
                }
                i20 = i19 & 112;
                i21 = i38;
                if (i20 == 16) {
                }
                if (i(i41)) {
                }
                int i422 = i39 + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                int i432 = i422 + 0;
                childAt2.layout(i432, i22, measuredWidth2 + i432, measuredHeight2 + i22);
                i39 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + i422;
                i40 += 0;
                i40++;
                i14 = i16;
                virtualChildCount2 = i17;
                i38 = i21;
            }
            i16 = i14;
            i17 = virtualChildCount2;
            i21 = i38;
            i40++;
            i14 = i16;
            virtualChildCount2 = i17;
            i38 = i21;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02af, code lost:
        if (r13 < 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x072a, code lost:
        if (r7 < 0) goto L419;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08c0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        char c;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char c10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f11;
        boolean z11;
        int i24;
        boolean z12;
        int baseline;
        int i25;
        int i26;
        int i27;
        int i28;
        float f12;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z13;
        boolean z14;
        a aVar;
        boolean z15;
        int i35;
        boolean z16;
        int combineMeasuredStates;
        int i36;
        boolean z17;
        int baseline2;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z18;
        boolean z19;
        int measuredHeight;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        a aVar2;
        boolean z20;
        int i47;
        boolean z21;
        int combineMeasuredStates2;
        boolean z22;
        int i48 = -2;
        int i49 = Integer.MIN_VALUE;
        int i50 = 8;
        float f13 = 0.0f;
        int i51 = 1073741824;
        int i52 = 0;
        if (this.f1045l == 1) {
            this.n = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i53 = this.f1043j;
            boolean z23 = this.f1048p;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            float f14 = 0.0f;
            boolean z24 = false;
            boolean z25 = true;
            boolean z26 = false;
            while (i54 < virtualChildCount) {
                View childAt = getChildAt(i54);
                if (childAt == null) {
                    this.n += i52;
                } else if (childAt.getVisibility() == i50) {
                    i54 += 0;
                } else {
                    if (i(i54)) {
                        this.n += this.f1053u;
                    }
                    a aVar3 = (a) childAt.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) aVar3).weight;
                    f14 += f15;
                    if (mode2 == i51 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f15 > f13) {
                        int i60 = this.n;
                        this.n = Math.max(i60, ((LinearLayout.LayoutParams) aVar3).topMargin + i60 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        i43 = i53;
                        i44 = mode2;
                        i45 = mode;
                        i46 = virtualChildCount;
                        aVar2 = aVar3;
                        z20 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height == 0 && f15 > f13) {
                            ((LinearLayout.LayoutParams) aVar3).height = i48;
                            i41 = 0;
                        } else {
                            i41 = Integer.MIN_VALUE;
                        }
                        if (f14 == f13) {
                            i42 = this.n;
                        } else {
                            i42 = 0;
                        }
                        i43 = i53;
                        i44 = mode2;
                        i45 = mode;
                        i46 = virtualChildCount;
                        aVar2 = aVar3;
                        measureChildWithMargins(childAt, i10, 0, i11, i42);
                        if (i41 != i49) {
                            ((LinearLayout.LayoutParams) aVar2).height = i41;
                        }
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int i61 = this.n;
                        this.n = Math.max(i61, i61 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + 0);
                        int i62 = i57;
                        if (z23) {
                            i57 = Math.max(measuredHeight2, i62);
                        }
                        z20 = z24;
                    }
                    if (i43 >= 0 && i43 == i54 + 1) {
                        this.f1044k = this.n;
                    }
                    if (i54 < i43 && ((LinearLayout.LayoutParams) aVar2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i47 = i45;
                    if (i47 != 1073741824 && ((LinearLayout.LayoutParams) aVar2).width == -1) {
                        z21 = true;
                        z26 = true;
                    } else {
                        z21 = false;
                    }
                    int i63 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i63;
                    int max = Math.max(i59, measuredWidth);
                    combineMeasuredStates2 = View.combineMeasuredStates(i56, childAt.getMeasuredState());
                    if (z25 && ((LinearLayout.LayoutParams) aVar2).width == -1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar2).weight > 0.0f) {
                        if (!z21) {
                            i63 = measuredWidth;
                        }
                        i58 = Math.max(i58, i63);
                    } else {
                        int i64 = i58;
                        if (!z21) {
                            i63 = measuredWidth;
                        }
                        i55 = Math.max(i55, i63);
                        i58 = i64;
                    }
                    i54 += 0;
                    i59 = max;
                    z24 = z20;
                    z25 = z22;
                    i54++;
                    mode = i47;
                    i53 = i43;
                    i56 = combineMeasuredStates2;
                    mode2 = i44;
                    virtualChildCount = i46;
                    i52 = 0;
                    i48 = -2;
                    i49 = Integer.MIN_VALUE;
                    i50 = 8;
                    f13 = 0.0f;
                    i51 = 1073741824;
                }
                i43 = i53;
                i44 = mode2;
                i47 = mode;
                i46 = virtualChildCount;
                combineMeasuredStates2 = i56;
                i54++;
                mode = i47;
                i53 = i43;
                i56 = combineMeasuredStates2;
                mode2 = i44;
                virtualChildCount = i46;
                i52 = 0;
                i48 = -2;
                i49 = Integer.MIN_VALUE;
                i50 = 8;
                f13 = 0.0f;
                i51 = 1073741824;
            }
            int i65 = mode2;
            int i66 = mode;
            int i67 = virtualChildCount;
            int i68 = i55;
            int i69 = i56;
            int i70 = i57;
            int i71 = i58;
            int i72 = i59;
            if (this.n > 0 && i(i67)) {
                this.n += this.f1053u;
            }
            int i73 = i65;
            if (z23 && (i73 == Integer.MIN_VALUE || i73 == 0)) {
                int i74 = 0;
                this.n = 0;
                int i75 = 0;
                while (i75 < i67) {
                    View childAt2 = getChildAt(i75);
                    if (childAt2 == null) {
                        this.n += i74;
                    } else if (childAt2.getVisibility() == 8) {
                        i75 += 0;
                    } else {
                        a aVar4 = (a) childAt2.getLayoutParams();
                        int i76 = this.n;
                        this.n = Math.max(i76, i76 + i70 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin + 0);
                    }
                    i75++;
                    i74 = 0;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.n;
            this.n = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, 0);
            int i77 = (16777215 & resolveSizeAndState) - this.n;
            if (!z24 && (i77 == 0 || f14 <= 0.0f)) {
                i68 = Math.max(i68, i71);
                if (z23 && i73 != 1073741824) {
                    for (int i78 = 0; i78 < i67; i78++) {
                        View childAt3 = getChildAt(i78);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt3.getLayoutParams())).weight > 0.0f) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i70, 1073741824));
                        }
                    }
                }
                int i79 = i72;
                if (!z25 || i66 == 1073741824) {
                    i68 = i79;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i68, getSuggestedMinimumWidth()), i10, i69), resolveSizeAndState);
                if (!z26) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i80 = 0; i80 < i67; i80++) {
                        View childAt4 = getChildAt(i80);
                        if (childAt4.getVisibility() != 8) {
                            a aVar5 = (a) childAt4.getLayoutParams();
                            if (((LinearLayout.LayoutParams) aVar5).width == -1) {
                                int i81 = ((LinearLayout.LayoutParams) aVar5).height;
                                ((LinearLayout.LayoutParams) aVar5).height = childAt4.getMeasuredHeight();
                                measureChildWithMargins(childAt4, makeMeasureSpec, 0, i11, 0);
                                ((LinearLayout.LayoutParams) aVar5).height = i81;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            float f16 = this.f1047o;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            this.n = 0;
            int i82 = 0;
            while (i82 < i67) {
                View childAt5 = getChildAt(i82);
                if (childAt5.getVisibility() == 8) {
                    i38 = i73;
                } else {
                    a aVar6 = (a) childAt5.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) aVar6).weight;
                    if (f17 > 0.0f) {
                        int i83 = (int) ((i77 * f17) / f14);
                        f14 -= f17;
                        int i84 = i77 - i83;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar6).leftMargin + ((LinearLayout.LayoutParams) aVar6).rightMargin, ((LinearLayout.LayoutParams) aVar6).width);
                        if (((LinearLayout.LayoutParams) aVar6).height == 0 && i73 == 1073741824) {
                            if (i83 > 0) {
                                measuredHeight = i83;
                                childAt5.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                                i69 = View.combineMeasuredStates(i69, childAt5.getMeasuredState() & (-256));
                                i77 = i84;
                            }
                            measuredHeight = 0;
                            childAt5.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                            i69 = View.combineMeasuredStates(i69, childAt5.getMeasuredState() & (-256));
                            i77 = i84;
                        }
                        measuredHeight = childAt5.getMeasuredHeight() + i83;
                    }
                    int i85 = ((LinearLayout.LayoutParams) aVar6).leftMargin + ((LinearLayout.LayoutParams) aVar6).rightMargin;
                    int measuredWidth2 = childAt5.getMeasuredWidth() + i85;
                    int max2 = Math.max(i72, measuredWidth2);
                    i38 = i73;
                    if (i66 != 1073741824) {
                        i39 = max2;
                        i40 = -1;
                        if (((LinearLayout.LayoutParams) aVar6).width == -1) {
                            z18 = true;
                            if (z18) {
                                i85 = measuredWidth2;
                            }
                            int max3 = Math.max(i68, i85);
                            if (!z25 && ((LinearLayout.LayoutParams) aVar6).width == i40) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            int i86 = this.n;
                            this.n = Math.max(i86, childAt5.getMeasuredHeight() + i86 + ((LinearLayout.LayoutParams) aVar6).topMargin + ((LinearLayout.LayoutParams) aVar6).bottomMargin + 0);
                            z25 = z19;
                            i72 = i39;
                            i68 = max3;
                        }
                    } else {
                        i39 = max2;
                        i40 = -1;
                    }
                    z18 = false;
                    if (z18) {
                    }
                    int max32 = Math.max(i68, i85);
                    if (!z25) {
                    }
                    z19 = false;
                    int i862 = this.n;
                    this.n = Math.max(i862, childAt5.getMeasuredHeight() + i862 + ((LinearLayout.LayoutParams) aVar6).topMargin + ((LinearLayout.LayoutParams) aVar6).bottomMargin + 0);
                    z25 = z19;
                    i72 = i39;
                    i68 = max32;
                }
                i82++;
                i73 = i38;
            }
            this.n = getPaddingBottom() + getPaddingTop() + this.n;
            int i792 = i72;
            if (!z25) {
            }
            i68 = i792;
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i68, getSuggestedMinimumWidth()), i10, i69), resolveSizeAndState);
            if (!z26) {
            }
        } else {
            this.n = 0;
            int virtualChildCount2 = getVirtualChildCount();
            int mode3 = View.MeasureSpec.getMode(i10);
            int mode4 = View.MeasureSpec.getMode(i11);
            if (this.f1049q == null || this.f1050r == null) {
                this.f1049q = new int[4];
                this.f1050r = new int[4];
            }
            int[] iArr = this.f1049q;
            int[] iArr2 = this.f1050r;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            boolean z27 = this.f1042i;
            boolean z28 = this.f1048p;
            if (mode3 == 1073741824) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i87 = 0;
            float f18 = 0.0f;
            int i88 = 0;
            int i89 = 0;
            int i90 = 0;
            int i91 = 0;
            boolean z29 = true;
            boolean z30 = false;
            boolean z31 = false;
            int i92 = 0;
            while (i89 < virtualChildCount2) {
                View childAt6 = getChildAt(i89);
                if (childAt6 == null) {
                    this.n += 0;
                    i27 = i87;
                    i28 = i88;
                } else {
                    i27 = i87;
                    i28 = i88;
                    if (childAt6.getVisibility() == 8) {
                        i89 += 0;
                    } else {
                        if (i(i89)) {
                            this.n += this.f1052t;
                        }
                        a aVar7 = (a) childAt6.getLayoutParams();
                        float f19 = ((LinearLayout.LayoutParams) aVar7).weight;
                        float f20 = f18 + f19;
                        if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar7).width == 0 && f19 > 0.0f) {
                            if (z10) {
                                i37 = i89;
                                this.n = ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin + this.n;
                            } else {
                                i37 = i89;
                                int i93 = this.n;
                                this.n = Math.max(i93, ((LinearLayout.LayoutParams) aVar7).leftMargin + i93 + ((LinearLayout.LayoutParams) aVar7).rightMargin);
                            }
                            if (z27) {
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                                aVar = aVar7;
                                i31 = i27;
                                i32 = i28;
                                i34 = i37;
                                z13 = z28;
                                z14 = z27;
                            } else {
                                aVar = aVar7;
                                i31 = i27;
                                i32 = i28;
                                i34 = i37;
                                i35 = 1073741824;
                                z13 = z28;
                                z14 = z27;
                                z15 = true;
                                if (mode4 == i35 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                                    z16 = true;
                                    z31 = true;
                                } else {
                                    z16 = false;
                                }
                                int i94 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                int measuredHeight3 = childAt6.getMeasuredHeight() + i94;
                                combineMeasuredStates = View.combineMeasuredStates(i31, childAt6.getMeasuredState());
                                if (!z14 && (baseline2 = childAt6.getBaseline()) != -1) {
                                    int i95 = ((LinearLayout.LayoutParams) aVar).gravity;
                                    if (i95 < 0) {
                                        i95 = this.f1046m;
                                    }
                                    int i96 = (((i95 & 112) >> 4) & (-2)) >> 1;
                                    i36 = combineMeasuredStates;
                                    iArr[i96] = Math.max(iArr[i96], baseline2);
                                    iArr2[i96] = Math.max(iArr2[i96], measuredHeight3 - baseline2);
                                } else {
                                    i36 = combineMeasuredStates;
                                }
                                int max4 = Math.max(i92, measuredHeight3);
                                if (!z29 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                                    if (z16) {
                                        measuredHeight3 = i94;
                                    }
                                    i88 = Math.max(i32, measuredHeight3);
                                } else {
                                    int i97 = i32;
                                    if (z16) {
                                        measuredHeight3 = i94;
                                    }
                                    i91 = Math.max(i91, measuredHeight3);
                                    i88 = i97;
                                }
                                i92 = max4;
                                z29 = z17;
                                z30 = z15;
                                i87 = i36;
                                i89 = i34 + 0;
                                f18 = f20;
                                i89++;
                                z28 = z13;
                                z27 = z14;
                            }
                        } else {
                            int i98 = i89;
                            if (((LinearLayout.LayoutParams) aVar7).width == 0) {
                                f12 = 0.0f;
                                if (f19 > 0.0f) {
                                    ((LinearLayout.LayoutParams) aVar7).width = -2;
                                    i29 = 0;
                                    if (f20 != f12) {
                                        i30 = this.n;
                                    } else {
                                        i30 = 0;
                                    }
                                    i31 = i27;
                                    i32 = i28;
                                    i33 = i29;
                                    i34 = i98;
                                    z13 = z28;
                                    z14 = z27;
                                    measureChildWithMargins(childAt6, i10, i30, i11, 0);
                                    if (i33 == Integer.MIN_VALUE) {
                                        aVar = aVar7;
                                        ((LinearLayout.LayoutParams) aVar).width = i33;
                                    } else {
                                        aVar = aVar7;
                                    }
                                    int measuredWidth3 = childAt6.getMeasuredWidth();
                                    if (!z10) {
                                        this.n = ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).rightMargin + 0 + this.n;
                                    } else {
                                        int i99 = this.n;
                                        this.n = Math.max(i99, i99 + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + 0);
                                    }
                                    if (z13) {
                                        i90 = Math.max(measuredWidth3, i90);
                                    }
                                }
                            } else {
                                f12 = 0.0f;
                            }
                            i29 = Integer.MIN_VALUE;
                            if (f20 != f12) {
                            }
                            i31 = i27;
                            i32 = i28;
                            i33 = i29;
                            i34 = i98;
                            z13 = z28;
                            z14 = z27;
                            measureChildWithMargins(childAt6, i10, i30, i11, 0);
                            if (i33 == Integer.MIN_VALUE) {
                            }
                            int measuredWidth32 = childAt6.getMeasuredWidth();
                            if (!z10) {
                            }
                            if (z13) {
                            }
                        }
                        z15 = z30;
                        i35 = 1073741824;
                        if (mode4 == i35) {
                        }
                        z16 = false;
                        int i942 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        int measuredHeight32 = childAt6.getMeasuredHeight() + i942;
                        combineMeasuredStates = View.combineMeasuredStates(i31, childAt6.getMeasuredState());
                        if (!z14) {
                        }
                        i36 = combineMeasuredStates;
                        int max42 = Math.max(i92, measuredHeight32);
                        if (!z29) {
                        }
                        z17 = false;
                        if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                        }
                        i92 = max42;
                        z29 = z17;
                        z30 = z15;
                        i87 = i36;
                        i89 = i34 + 0;
                        f18 = f20;
                        i89++;
                        z28 = z13;
                        z27 = z14;
                    }
                }
                z14 = z27;
                i87 = i27;
                i88 = i28;
                z13 = z28;
                i89++;
                z28 = z13;
                z27 = z14;
            }
            int i100 = i88;
            boolean z32 = z28;
            boolean z33 = z27;
            int i101 = i92;
            if (this.n > 0 && i(virtualChildCount2)) {
                this.n += this.f1052t;
            }
            int i102 = iArr[1];
            int i103 = i87;
            if (i102 == -1 && iArr[0] == -1 && iArr[2] == -1) {
                c = 3;
                if (iArr[3] == -1) {
                    i12 = i101;
                    i13 = mode4;
                    if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                        int i104 = 0;
                        this.n = 0;
                        i26 = 0;
                        while (i26 < virtualChildCount2) {
                            View childAt7 = getChildAt(i26);
                            if (childAt7 == null) {
                                this.n += i104;
                            } else if (childAt7.getVisibility() == 8) {
                                i26 += 0;
                            } else {
                                a aVar8 = (a) childAt7.getLayoutParams();
                                if (z10) {
                                    this.n = ((LinearLayout.LayoutParams) aVar8).leftMargin + i90 + ((LinearLayout.LayoutParams) aVar8).rightMargin + 0 + this.n;
                                } else {
                                    int i105 = this.n;
                                    this.n = Math.max(i105, i105 + i90 + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin + 0);
                                }
                            }
                            i26++;
                            i104 = 0;
                        }
                    }
                    int paddingRight = getPaddingRight() + getPaddingLeft() + this.n;
                    this.n = paddingRight;
                    int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, 0);
                    int i106 = (16777215 & resolveSizeAndState2) - this.n;
                    if (!z30 && (i106 == 0 || f18 <= 0.0f)) {
                        int max5 = Math.max(i91, i100);
                        if (z32 && mode3 != 1073741824) {
                            for (i25 = 0; i25 < virtualChildCount2; i25++) {
                                View childAt8 = getChildAt(i25);
                                if (childAt8 != null && childAt8.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt8.getLayoutParams())).weight > 0.0f) {
                                    childAt8.measure(View.MeasureSpec.makeMeasureSpec(i90, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), 1073741824));
                                }
                            }
                        }
                        i16 = i11;
                        i91 = max5;
                        i15 = i103;
                        i17 = i13;
                        i19 = 0;
                        if (!z29 || i17 == 1073741824) {
                            i91 = i12;
                        }
                        setMeasuredDimension(resolveSizeAndState2 | ((-16777216) & i15), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i16, i15 << 16));
                        if (z31) {
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                            while (i19 < virtualChildCount2) {
                                View childAt9 = getChildAt(i19);
                                if (childAt9.getVisibility() != 8) {
                                    a aVar9 = (a) childAt9.getLayoutParams();
                                    if (((LinearLayout.LayoutParams) aVar9).height == -1) {
                                        int i107 = ((LinearLayout.LayoutParams) aVar9).width;
                                        ((LinearLayout.LayoutParams) aVar9).width = childAt9.getMeasuredWidth();
                                        measureChildWithMargins(childAt9, i10, 0, makeMeasureSpec3, 0);
                                        ((LinearLayout.LayoutParams) aVar9).width = i107;
                                    }
                                }
                                i19++;
                            }
                            return;
                        }
                        return;
                    }
                    f10 = this.f1047o;
                    if (f10 > 0.0f) {
                        f18 = f10;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.n = 0;
                    int i108 = i106;
                    int i109 = -1;
                    i14 = 0;
                    float f21 = f18;
                    i15 = i103;
                    while (i14 < virtualChildCount2) {
                        View childAt10 = getChildAt(i14);
                        if (childAt10 != null && childAt10.getVisibility() != 8) {
                            a aVar10 = (a) childAt10.getLayoutParams();
                            float f22 = ((LinearLayout.LayoutParams) aVar10).weight;
                            if (f22 > 0.0f) {
                                int i110 = (int) ((i108 * f22) / f21);
                                float f23 = f21 - f22;
                                int i111 = i108 - i110;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin, ((LinearLayout.LayoutParams) aVar10).height);
                                if (((LinearLayout.LayoutParams) aVar10).width == 0 && mode3 == 1073741824) {
                                    if (i110 > 0) {
                                        childAt10.measure(View.MeasureSpec.makeMeasureSpec(i110, 1073741824), childMeasureSpec2);
                                        i15 = View.combineMeasuredStates(i15, childAt10.getMeasuredState() & (-16777216));
                                        f21 = f23;
                                        i22 = i111;
                                    }
                                    i110 = 0;
                                    childAt10.measure(View.MeasureSpec.makeMeasureSpec(i110, 1073741824), childMeasureSpec2);
                                    i15 = View.combineMeasuredStates(i15, childAt10.getMeasuredState() & (-16777216));
                                    f21 = f23;
                                    i22 = i111;
                                }
                                i110 += childAt10.getMeasuredWidth();
                            } else {
                                i22 = i108;
                            }
                            if (z10) {
                                i23 = i15;
                                this.n = childAt10.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin + 0 + this.n;
                                f11 = f21;
                            } else {
                                i23 = i15;
                                int i112 = this.n;
                                f11 = f21;
                                this.n = Math.max(i112, childAt10.getMeasuredWidth() + i112 + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin + 0);
                            }
                            i21 = i13;
                            if (i21 != 1073741824 && ((LinearLayout.LayoutParams) aVar10).height == -1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int i113 = i22;
                            int i114 = ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin;
                            int measuredHeight4 = childAt10.getMeasuredHeight() + i114;
                            i109 = Math.max(i109, measuredHeight4);
                            if (!z11) {
                                i114 = measuredHeight4;
                            }
                            int max6 = Math.max(i91, i114);
                            if (z29) {
                                i24 = -1;
                                if (((LinearLayout.LayoutParams) aVar10).height == -1) {
                                    z12 = true;
                                    if (!z33 && (baseline = childAt10.getBaseline()) != i24) {
                                        int i115 = ((LinearLayout.LayoutParams) aVar10).gravity;
                                        if (i115 < 0) {
                                            i115 = this.f1046m;
                                        }
                                        int i116 = (((i115 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i116] = Math.max(iArr[i116], baseline);
                                        iArr2[i116] = Math.max(iArr2[i116], measuredHeight4 - baseline);
                                    }
                                    i91 = max6;
                                    z29 = z12;
                                    i20 = i113;
                                    i15 = i23;
                                    f21 = f11;
                                    i14++;
                                    i108 = i20;
                                    i13 = i21;
                                }
                            } else {
                                i24 = -1;
                            }
                            z12 = false;
                            if (!z33) {
                            }
                            i91 = max6;
                            z29 = z12;
                            i20 = i113;
                            i15 = i23;
                            f21 = f11;
                            i14++;
                            i108 = i20;
                            i13 = i21;
                        }
                        i20 = i108;
                        i21 = i13;
                        i14++;
                        i108 = i20;
                        i13 = i21;
                    }
                    i16 = i11;
                    i17 = i13;
                    this.n = getPaddingRight() + getPaddingLeft() + this.n;
                    i18 = iArr[1];
                    if (i18 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c10 = 3;
                        if (iArr[3] == -1) {
                            i12 = i109;
                            i19 = 0;
                            if (!z29) {
                            }
                            i91 = i12;
                            setMeasuredDimension(resolveSizeAndState2 | ((-16777216) & i15), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i16, i15 << 16));
                            if (z31) {
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                    i19 = 0;
                    i12 = Math.max(i109, Math.max(iArr2[c10], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i18, iArr[2]))));
                    if (!z29) {
                    }
                    i91 = i12;
                    setMeasuredDimension(resolveSizeAndState2 | ((-16777216) & i15), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i16, i15 << 16));
                    if (z31) {
                    }
                }
            } else {
                c = 3;
            }
            i13 = mode4;
            i12 = Math.max(i101, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i102, iArr[2]))));
            if (z32) {
                int i1042 = 0;
                this.n = 0;
                i26 = 0;
                while (i26 < virtualChildCount2) {
                }
            }
            int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.n;
            this.n = paddingRight2;
            int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i10, 0);
            int i1062 = (16777215 & resolveSizeAndState22) - this.n;
            if (!z30) {
                int max52 = Math.max(i91, i100);
                if (z32) {
                    while (i25 < virtualChildCount2) {
                    }
                }
                i16 = i11;
                i91 = max52;
                i15 = i103;
                i17 = i13;
                i19 = 0;
                if (!z29) {
                }
                i91 = i12;
                setMeasuredDimension(resolveSizeAndState22 | ((-16777216) & i15), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i16, i15 << 16));
                if (z31) {
                }
            }
            f10 = this.f1047o;
            if (f10 > 0.0f) {
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.n = 0;
            int i1082 = i1062;
            int i1092 = -1;
            i14 = 0;
            float f212 = f18;
            i15 = i103;
            while (i14 < virtualChildCount2) {
            }
            i16 = i11;
            i17 = i13;
            this.n = getPaddingRight() + getPaddingLeft() + this.n;
            i18 = iArr[1];
            if (i18 != -1) {
            }
            c10 = 3;
            i19 = 0;
            i12 = Math.max(i1092, Math.max(iArr2[c10], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i18, iArr[2]))));
            if (!z29) {
            }
            i91 = i12;
            setMeasuredDimension(resolveSizeAndState22 | ((-16777216) & i15), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i16, i15 << 16));
            if (z31) {
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f1042i = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1043j = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1051s) {
            return;
        }
        this.f1051s = drawable;
        if (drawable != null) {
            this.f1052t = drawable.getIntrinsicWidth();
            this.f1053u = drawable.getIntrinsicHeight();
        } else {
            this.f1052t = 0;
            this.f1053u = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1055w = i10;
    }

    public void setGravity(int i10) {
        if (this.f1046m != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1046m = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1046m;
        if ((8388615 & i12) != i11) {
            this.f1046m = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1048p = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1045l != i10) {
            this.f1045l = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1054v) {
            requestLayout();
        }
        this.f1054v = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1046m;
        if ((i12 & 112) != i11) {
            this.f1046m = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1047o = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
