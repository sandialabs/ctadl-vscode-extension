package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.noto.R;

/* loaded from: classes.dex */
public class g extends CheckBox implements e3.l, e3.m {

    /* renamed from: i  reason: collision with root package name */
    public final j f936i;

    /* renamed from: j  reason: collision with root package name */
    public final e f937j;

    /* renamed from: k  reason: collision with root package name */
    public final c0 f938k;

    /* renamed from: l  reason: collision with root package name */
    public n f939l;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1.a(context);
        y0.a(this, getContext());
        j jVar = new j(this);
        this.f936i = jVar;
        jVar.b(attributeSet, i10);
        e eVar = new e(this);
        this.f937j = eVar;
        eVar.d(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f938k = c0Var;
        c0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f939l == null) {
            this.f939l = new n(this);
        }
        return this.f939l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f937j;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f938k;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f936i;
        if (jVar != null) {
            jVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f937j;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f937j;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e3.l
    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f936i;
        if (jVar != null) {
            return jVar.f967b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f936i;
        if (jVar != null) {
            return jVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f938k.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f938k.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f937j;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f937j;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(e.a.a(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f936i;
        if (jVar != null) {
            if (jVar.f970f) {
                jVar.f970f = false;
                return;
            }
            jVar.f970f = true;
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f938k;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f938k;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f937j;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f937j;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // e3.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f936i;
        if (jVar != null) {
            jVar.f967b = colorStateList;
            jVar.f968d = true;
            jVar.a();
        }
    }

    @Override // e3.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f936i;
        if (jVar != null) {
            jVar.c = mode;
            jVar.f969e = true;
            jVar.a();
        }
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f938k;
        c0Var.k(colorStateList);
        c0Var.b();
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f938k;
        c0Var.l(mode);
        c0Var.b();
    }
}
