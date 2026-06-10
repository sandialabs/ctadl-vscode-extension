package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class q extends ImageView {

    /* renamed from: i  reason: collision with root package name */
    public final e f1087i;

    /* renamed from: j  reason: collision with root package name */
    public final p f1088j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1089k;

    public q(Context context) {
        this(context, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1.a(context);
        this.f1089k = false;
        y0.a(this, getContext());
        e eVar = new e(this);
        this.f1087i = eVar;
        eVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f1088j = pVar;
        pVar.b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1087i;
        if (eVar != null) {
            eVar.a();
        }
        p pVar = this.f1088j;
        if (pVar != null) {
            pVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1087i;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1087i;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b1 b1Var;
        p pVar = this.f1088j;
        if (pVar == null || (b1Var = pVar.f1063b) == null) {
            return null;
        }
        return b1Var.f859a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b1 b1Var;
        p pVar = this.f1088j;
        if (pVar == null || (b1Var = pVar.f1063b) == null) {
            return null;
        }
        return b1Var.f860b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f1088j.f1062a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1087i;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1087i;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.f1088j;
        if (pVar != null) {
            pVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        p pVar = this.f1088j;
        if (pVar != null && drawable != null && !this.f1089k) {
            pVar.f1064d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (pVar != null) {
            pVar.a();
            if (!this.f1089k) {
                ImageView imageView = pVar.f1062a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(pVar.f1064d);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1089k = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        p pVar = this.f1088j;
        if (pVar != null) {
            pVar.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.f1088j;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1087i;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1087i;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.f1088j;
        if (pVar != null) {
            if (pVar.f1063b == null) {
                pVar.f1063b = new b1();
            }
            b1 b1Var = pVar.f1063b;
            b1Var.f859a = colorStateList;
            b1Var.f861d = true;
            pVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1088j;
        if (pVar != null) {
            if (pVar.f1063b == null) {
                pVar.f1063b = new b1();
            }
            b1 b1Var = pVar.f1063b;
            b1Var.f860b = mode;
            b1Var.c = true;
            pVar.a();
        }
    }
}
