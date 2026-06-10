package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.noto.R;

/* loaded from: classes.dex */
public final class h extends CheckedTextView implements e3.m {

    /* renamed from: i  reason: collision with root package name */
    public final i f943i;

    /* renamed from: j  reason: collision with root package name */
    public final e f944j;

    /* renamed from: k  reason: collision with root package name */
    public final c0 f945k;

    /* renamed from: l  reason: collision with root package name */
    public n f946l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:3:0x0048, B:5:0x004f, B:7:0x0055, B:12:0x0065, B:14:0x006b, B:16:0x0071, B:17:0x007c, B:19:0x0083, B:20:0x008a, B:22:0x0091), top: B:28:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #0 {all -> 0x00a9, blocks: (B:3:0x0048, B:5:0x004f, B:7:0x0055, B:12:0x0065, B:14:0x006b, B:16:0x0071, B:17:0x007c, B:19:0x0083, B:20:0x008a, B:22:0x0091), top: B:28:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int i10;
        int i11;
        a1.a(context);
        y0.a(this, getContext());
        c0 c0Var = new c0(this);
        this.f945k = c0Var;
        c0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        c0Var.b();
        e eVar = new e(this);
        this.f944j = eVar;
        eVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f943i = new i(this);
        Context context2 = getContext();
        int[] iArr = a1.b.f56v;
        d1 m10 = d1.m(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        a3.j0.o(this, getContext(), iArr, attributeSet, m10.f903b, R.attr.checkedTextViewStyle, 0);
        boolean z10 = true;
        try {
            if (m10.l(1) && (i11 = m10.i(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(e.a.a(getContext(), i11));
                } catch (Resources.NotFoundException unused) {
                }
                if (!z10 && m10.l(0) && (i10 = m10.i(0, 0)) != 0) {
                    setCheckMarkDrawable(e.a.a(getContext(), i10));
                }
                if (m10.l(2)) {
                    setCheckMarkTintList(m10.b(2));
                }
                if (m10.l(3)) {
                    setCheckMarkTintMode(j0.d(m10.h(3, -1), null));
                }
                m10.n();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            z10 = false;
            if (!z10) {
                setCheckMarkDrawable(e.a.a(getContext(), i10));
            }
            if (m10.l(2)) {
            }
            if (m10.l(3)) {
            }
            m10.n();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            m10.n();
            throw th;
        }
    }

    private n getEmojiTextViewHelper() {
        if (this.f946l == null) {
            this.f946l = new n(this);
        }
        return this.f946l;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c0 c0Var = this.f945k;
        if (c0Var != null) {
            c0Var.b();
        }
        e eVar = this.f944j;
        if (eVar != null) {
            eVar.a();
        }
        i iVar = this.f943i;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e3.h.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f944j;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f944j;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i iVar = this.f943i;
        if (iVar != null) {
            return iVar.f962b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i iVar = this.f943i;
        if (iVar != null) {
            return iVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f945k.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f945k.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a1.c.Z0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f944j;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f944j;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(e.a.a(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i iVar = this.f943i;
        if (iVar != null) {
            if (iVar.f965f) {
                iVar.f965f = false;
                return;
            }
            iVar.f965f = true;
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f945k;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f945k;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e3.h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f944j;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f944j;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i iVar = this.f943i;
        if (iVar != null) {
            iVar.f962b = colorStateList;
            iVar.f963d = true;
            iVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i iVar = this.f943i;
        if (iVar != null) {
            iVar.c = mode;
            iVar.f964e = true;
            iVar.a();
        }
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f945k;
        c0Var.k(colorStateList);
        c0Var.b();
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f945k;
        c0Var.l(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f945k;
        if (c0Var != null) {
            c0Var.g(context, i10);
        }
    }
}
