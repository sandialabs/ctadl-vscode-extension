package u5;

import a3.j0;
import a3.v0;
import android.view.View;
import android.view.ViewGroup;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public int f17805i;

    /* renamed from: j  reason: collision with root package name */
    public int f17806j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17807k;

    /* renamed from: l  reason: collision with root package name */
    public int f17808l;

    public boolean a() {
        return this.f17807k;
    }

    public int getItemSpacing() {
        return this.f17806j;
    }

    public int getLineSpacing() {
        return this.f17805i;
    }

    public int getRowCount() {
        return this.f17808l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f17808l = 0;
            return;
        }
        this.f17808l = 1;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingRight;
        int i17 = paddingLeft;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = a3.m.c(marginLayoutParams);
                    i14 = a3.m.b(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i17 + i15;
                if (!this.f17807k && measuredWidth > i16) {
                    i18 = this.f17805i + paddingTop;
                    this.f17808l++;
                    i17 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f17808l - 1));
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    i20 = i16 - measuredWidth2;
                    measuredWidth2 = (i16 - i17) - i15;
                }
                childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                i17 += childAt.getMeasuredWidth() + i15 + i14 + this.f17806j;
                paddingTop = measuredHeight;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i12 = Integer.MAX_VALUE;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = i12 - getPaddingRight();
            int i16 = paddingTop;
            int i17 = 0;
            for (i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i10, i11);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i15 = marginLayoutParams.leftMargin + 0;
                        i14 = marginLayoutParams.rightMargin + 0;
                    } else {
                        i14 = 0;
                        i15 = 0;
                    }
                    if (childAt.getMeasuredWidth() + paddingLeft + i15 > paddingRight && !a()) {
                        paddingLeft = getPaddingLeft();
                        i16 = this.f17805i + paddingTop;
                    }
                    int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i15;
                    int measuredHeight = childAt.getMeasuredHeight() + i16;
                    if (measuredWidth > i17) {
                        i17 = measuredWidth;
                    }
                    int measuredWidth2 = childAt.getMeasuredWidth() + i15 + i14 + this.f17806j + paddingLeft;
                    if (i13 == getChildCount() - 1) {
                        i17 += i14;
                    }
                    paddingLeft = measuredWidth2;
                    paddingTop = measuredHeight;
                }
            }
            int paddingRight2 = getPaddingRight() + i17;
            int paddingBottom = getPaddingBottom() + paddingTop;
            if (mode == Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    size = paddingRight2;
                }
            } else {
                size = Math.min(paddingRight2, size);
            }
            if (mode2 == Integer.MIN_VALUE) {
                if (mode2 != 1073741824) {
                    size2 = paddingBottom;
                }
            } else {
                size2 = Math.min(paddingBottom, size2);
            }
            setMeasuredDimension(size, size2);
        }
        i12 = size;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        int paddingRight3 = i12 - getPaddingRight();
        int i162 = paddingTop2;
        int i172 = 0;
        while (i13 < getChildCount()) {
        }
        int paddingRight22 = getPaddingRight() + i172;
        int paddingBottom2 = getPaddingBottom() + paddingTop2;
        if (mode == Integer.MIN_VALUE) {
        }
        if (mode2 == Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f17806j = i10;
    }

    public void setLineSpacing(int i10) {
        this.f17805i = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f17807k = z10;
    }
}
