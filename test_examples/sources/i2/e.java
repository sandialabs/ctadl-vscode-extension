package i2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class e extends androidx.constraintlayout.widget.a {

    /* renamed from: q  reason: collision with root package name */
    public boolean f11687q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11688r;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a1.c.f77o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f11687q = true;
                } else if (index == 22) {
                    this.f11688r = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void l(h hVar, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11687q || this.f11688r) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f4470j; i10++) {
                    View view = constraintLayout.f4407i.get(this.f4469i[i10]);
                    if (view != null) {
                        if (this.f11687q) {
                            view.setVisibility(visibility);
                        }
                        if (this.f11688r && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
