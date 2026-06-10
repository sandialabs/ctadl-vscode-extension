package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.noto.R;

/* loaded from: classes.dex */
public class f extends Button implements e3.m {

    /* renamed from: i  reason: collision with root package name */
    public final e f919i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f920j;

    /* renamed from: k  reason: collision with root package name */
    public n f921k;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1.a(context);
        y0.a(this, getContext());
        e eVar = new e(this);
        this.f919i = eVar;
        eVar.d(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f920j = c0Var;
        c0Var.f(attributeSet, i10);
        c0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f921k == null) {
            this.f921k = new n(this);
        }
        return this.f921k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f919i;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (n1.f1057b) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            return Math.round(c0Var.f887i.f927e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (n1.f1057b) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            return Math.round(c0Var.f887i.f926d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (n1.f1057b) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            return Math.round(c0Var.f887i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (n1.f1057b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            return c0Var.f887i.f928f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (n1.f1057b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        c0 c0Var = this.f920j;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f887i.f924a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e3.h.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f919i;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f919i;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f920j.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f920j.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c0 c0Var = this.f920j;
        if (c0Var != null && !n1.f1057b) {
            c0Var.f887i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z11 = false;
        c0 c0Var = this.f920j;
        if (c0Var != null && !n1.f1057b) {
            f0 f0Var = c0Var.f887i;
            if (f0Var.i() && f0Var.f924a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            c0Var.f887i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (n1.f1057b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            c0Var.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (n1.f1057b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            c0Var.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (n1.f1057b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            c0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f919i;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f919i;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e3.h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            c0Var.f880a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f919i;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f919i;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f920j;
        c0Var.k(colorStateList);
        c0Var.b();
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f920j;
        c0Var.l(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f920j;
        if (c0Var != null) {
            c0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = n1.f1057b;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        c0 c0Var = this.f920j;
        if (c0Var != null && !z11) {
            f0 f0Var = c0Var.f887i;
            if (f0Var.i() && f0Var.f924a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                f0Var.f(i10, f10);
            }
        }
    }
}
