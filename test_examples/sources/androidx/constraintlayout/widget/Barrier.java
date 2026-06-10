package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class Barrier extends a {

    /* renamed from: q  reason: collision with root package name */
    public int f4388q;

    /* renamed from: r  reason: collision with root package name */
    public int f4389r;

    /* renamed from: s  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f4390s;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f4390s.f4283v0;
    }

    public int getMargin() {
        return this.f4390s.f4284w0;
    }

    public int getType() {
        return this.f4388q;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f4390s = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a1.c.f77o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f4390s.f4283v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f4390s.f4284w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4472l = this.f4390s;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 == 6) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // androidx.constraintlayout.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ConstraintWidget constraintWidget, boolean z10) {
        int i10;
        int i11 = this.f4388q;
        this.f4389r = i11;
        if (z10) {
            if (i11 != 5) {
                i10 = i11 == 6 ? 0 : 0;
                if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.a)) {
                    ((androidx.constraintlayout.core.widgets.a) constraintWidget).f4282u0 = this.f4389r;
                    return;
                }
                return;
            }
            i10 = 1;
        } else {
            if (i11 != 5) {
            }
        }
        this.f4389r = i10;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.a)) {
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f4390s.f4283v0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f4390s.f4284w0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f4390s.f4284w0 = i10;
    }

    public void setType(int i10) {
        this.f4388q = i10;
    }
}
