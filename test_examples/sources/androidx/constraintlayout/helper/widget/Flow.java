package androidx.constraintlayout.helper.widget;

import a1.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.h;
import i2.e;

/* loaded from: classes.dex */
public class Flow extends e {

    /* renamed from: s  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.e f4376s;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // i2.e, androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f4376s = new androidx.constraintlayout.core.widgets.e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f77o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f4376s.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    androidx.constraintlayout.core.widgets.e eVar = this.f4376s;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.f4370u0 = dimensionPixelSize;
                    eVar.f4371v0 = dimensionPixelSize;
                    eVar.f4372w0 = dimensionPixelSize;
                    eVar.f4373x0 = dimensionPixelSize;
                } else if (index == 18) {
                    androidx.constraintlayout.core.widgets.e eVar2 = this.f4376s;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.f4372w0 = dimensionPixelSize2;
                    eVar2.f4374y0 = dimensionPixelSize2;
                    eVar2.f4375z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f4376s.f4373x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f4376s.f4374y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f4376s.f4370u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f4376s.f4375z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f4376s.f4371v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f4376s.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f4376s.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f4376s.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f4376s.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f4376s.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f4376s.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f4376s.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f4376s.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f4376s.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f4376s.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f4376s.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f4376s.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f4376s.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f4376s.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f4376s.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f4376s.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f4376s.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f4376s.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4472l = this.f4376s;
        k();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void j(ConstraintWidget constraintWidget, boolean z10) {
        androidx.constraintlayout.core.widgets.e eVar = this.f4376s;
        int i10 = eVar.f4372w0;
        if (i10 > 0 || eVar.f4373x0 > 0) {
            if (z10) {
                eVar.f4374y0 = eVar.f4373x0;
                eVar.f4375z0 = i10;
                return;
            }
            eVar.f4374y0 = i10;
            eVar.f4375z0 = eVar.f4373x0;
        }
    }

    @Override // i2.e
    public final void l(h hVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (hVar != null) {
            hVar.R(mode, size, mode2, size2);
            setMeasuredDimension(hVar.B0, hVar.C0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        l(this.f4376s, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f4376s.N0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f4376s.H0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f4376s.O0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f4376s.I0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f4376s.T0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f4376s.L0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f4376s.R0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f4376s.F0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f4376s.P0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f4376s.J0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f4376s.Q0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f4376s.K0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f4376s.W0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f4376s.X0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        androidx.constraintlayout.core.widgets.e eVar = this.f4376s;
        eVar.f4370u0 = i10;
        eVar.f4371v0 = i10;
        eVar.f4372w0 = i10;
        eVar.f4373x0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f4376s.f4371v0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f4376s.f4374y0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f4376s.f4375z0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f4376s.f4370u0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f4376s.U0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f4376s.M0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f4376s.S0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f4376s.G0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f4376s.V0 = i10;
        requestLayout();
    }
}
