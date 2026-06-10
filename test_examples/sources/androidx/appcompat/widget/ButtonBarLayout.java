package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: i  reason: collision with root package name */
    public boolean f744i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f745j;

    /* renamed from: k  reason: collision with root package name */
    public int f746k;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f746k = -1;
        int[] iArr = a1.b.f54u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        a3.j0.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f744i = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f744i);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f745j != z10) {
            if (!z10 || this.f744i) {
                this.f745j = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int paddingBottom;
        boolean z11;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        if (this.f744i) {
            if (size > this.f746k && this.f745j) {
                setStacked(false);
            }
            this.f746k = size;
        }
        if (!this.f745j && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            i12 = i10;
            z10 = false;
        }
        super.onMeasure(i12, i11);
        if (this.f744i && !this.f745j) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (i15 < childCount) {
                if (getChildAt(i15).getVisibility() == 0) {
                    break;
                }
                i15++;
            } else {
                i15 = -1;
                break;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i14 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f745j) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    } else if (getChildAt(i16).getVisibility() == 0) {
                        i13 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i13 >= 0) {
                    paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i14 += paddingBottom;
        }
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        if (j0.d.d(this) != i14) {
            setMinimumHeight(i14);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f744i != z10) {
            this.f744i = z10;
            if (!z10 && this.f745j) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
