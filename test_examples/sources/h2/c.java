package h2;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class c extends androidx.constraintlayout.widget.a implements MotionLayout.c {

    /* renamed from: q  reason: collision with root package name */
    public boolean f11353q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11354r;

    /* renamed from: s  reason: collision with root package name */
    public float f11355s;

    /* renamed from: t  reason: collision with root package name */
    public View[] f11356t;

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.c
    public final void a() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.c
    public final void b() {
    }

    public float getProgress() {
        return this.f11355s;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a1.c.f83u);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f11353q = obtainStyledAttributes.getBoolean(index, this.f11353q);
                } else if (index == 0) {
                    this.f11354r = obtainStyledAttributes.getBoolean(index, this.f11354r);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f11355s = f10;
        int i10 = 0;
        if (this.f4470j > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f4474o;
            if (viewArr == null || viewArr.length != this.f4470j) {
                this.f4474o = new View[this.f4470j];
            }
            for (int i11 = 0; i11 < this.f4470j; i11++) {
                this.f4474o[i11] = constraintLayout.f4407i.get(this.f4469i[i11]);
            }
            this.f11356t = this.f4474o;
            while (i10 < this.f4470j) {
                View view = this.f11356t[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z10 = viewGroup.getChildAt(i10) instanceof c;
            i10++;
        }
    }
}
