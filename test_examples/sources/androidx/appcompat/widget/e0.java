package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.b0;
import e3.h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import y2.d;

/* loaded from: classes.dex */
public class e0 extends TextView implements e3.m {

    /* renamed from: i  reason: collision with root package name */
    public final e f909i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f910j;

    /* renamed from: k  reason: collision with root package name */
    public final b0 f911k;

    /* renamed from: l  reason: collision with root package name */
    public n f912l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f913m;
    public b n;

    /* renamed from: o  reason: collision with root package name */
    public Future<y2.d> f914o;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);

        void b(int i10);
    }

    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.e0.a
        public void a(int i10) {
        }

        @Override // androidx.appcompat.widget.e0.a
        public void b(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.e0.b, androidx.appcompat.widget.e0.a
        public final void a(int i10) {
            e0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.e0.b, androidx.appcompat.widget.e0.a
        public final void b(int i10) {
            e0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public e0() {
        throw null;
    }

    public e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1.a(context);
        this.f913m = false;
        this.n = null;
        y0.a(this, getContext());
        e eVar = new e(this);
        this.f909i = eVar;
        eVar.d(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f910j = c0Var;
        c0Var.f(attributeSet, i10);
        c0Var.b();
        this.f911k = new b0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f912l == null) {
            this.f912l = new n(this);
        }
        return this.f912l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f909i;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (n1.f1057b) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f910j;
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
        c0 c0Var = this.f910j;
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
        c0 c0Var = this.f910j;
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
        c0 c0Var = this.f910j;
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
        c0 c0Var = this.f910j;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f887i.f924a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e3.h.f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        b bVar;
        if (this.n == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.n = bVar;
        }
        return this.n;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f909i;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f909i;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f910j.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f910j.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<y2.d> future = this.f914o;
        if (future != null) {
            try {
                this.f914o = null;
                e3.h.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f911k) != null) {
            TextClassifier textClassifier = b0Var.f858b;
            if (textClassifier == null) {
                return b0.a.a(b0Var.f857a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public d.a getTextMetricsParamsCompat() {
        return e3.h.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        CharSequence subSequence;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f910j.getClass();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
            } else {
                text.getClass();
                if (i13 >= 30) {
                    editorInfo.setInitialSurroundingSubText(text, 0);
                } else {
                    int i14 = editorInfo.initialSelStart;
                    int i15 = editorInfo.initialSelEnd;
                    if (i14 > i15) {
                        i10 = i15 + 0;
                    } else {
                        i10 = i14 + 0;
                    }
                    if (i14 > i15) {
                        i11 = i14 - 0;
                    } else {
                        i11 = i15 + 0;
                    }
                    int length = text.length();
                    if (i10 >= 0 && i11 <= length) {
                        int i16 = editorInfo.inputType & 4095;
                        if (i16 != 129 && i16 != 225 && i16 != 18) {
                            z10 = false;
                            if (z10) {
                                if (length <= 2048) {
                                    d3.c.a(editorInfo, text, i10, i11);
                                } else {
                                    int i17 = i11 - i10;
                                    if (i17 > 1024) {
                                        i12 = 0;
                                    } else {
                                        i12 = i17;
                                    }
                                    int i18 = 2048 - i12;
                                    int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (i18 * 0.8d)));
                                    int min2 = Math.min(i10, i18 - min);
                                    int i19 = i10 - min2;
                                    if (Character.isLowSurrogate(text.charAt(i19))) {
                                        i19++;
                                        min2--;
                                    }
                                    if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                                        min--;
                                    }
                                    int i20 = min2 + i12 + min;
                                    if (i12 != i17) {
                                        subSequence = TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11));
                                    } else {
                                        subSequence = text.subSequence(i19, i20 + i19);
                                    }
                                    int i21 = min2 + 0;
                                    d3.c.a(editorInfo, subSequence, i21, i12 + i21);
                                }
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                    d3.c.a(editorInfo, null, 0, 0);
                }
            }
        }
        a1.c.Z0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c0 c0Var = this.f910j;
        if (c0Var != null && !n1.f1057b) {
            c0Var.f887i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<y2.d> future = this.f914o;
        if (future != null) {
            try {
                this.f914o = null;
                e3.h.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z11 = false;
        c0 c0Var = this.f910j;
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
        c0 c0Var = this.f910j;
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
        c0 c0Var = this.f910j;
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
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f909i;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f909i;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? e.a.a(context, i10) : null, i11 != 0 ? e.a.a(context, i11) : null, i12 != 0 ? e.a.a(context, i12) : null, i13 != 0 ? e.a.a(context, i13) : null);
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? e.a.a(context, i10) : null, i11 != 0 ? e.a.a(context, i11) : null, i12 != 0 ? e.a.a(context, i12) : null, i13 != 0 ? e.a.a(context, i13) : null);
        c0 c0Var = this.f910j;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            e3.h.b(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            e3.h.c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        v8.b.l(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(y2.d dVar) {
        e3.h.d(this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f909i;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f909i;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f910j;
        c0Var.k(colorStateList);
        c0Var.b();
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f910j;
        c0Var.l(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f911k) != null) {
            b0Var.f858b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<y2.d> future) {
        this.f914o = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTextMetricsParamsCompat(d.a aVar) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f18801b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
            h.b.h(this, i10);
            TextPaint textPaint = aVar.f18800a;
            if (i11 >= 23) {
                float textScaleX = textPaint.getTextScaleX();
                getPaint().set(textPaint);
                if (textScaleX == getTextScaleX()) {
                    setTextScaleX((textScaleX / 2.0f) + 1.0f);
                }
                setTextScaleX(textScaleX);
                return;
            }
            getPaint().set(textPaint);
            h.c.e(this, aVar.c);
            h.c.h(this, aVar.f18802d);
            return;
        }
        i10 = 1;
        h.b.h(this, i10);
        TextPaint textPaint2 = aVar.f18800a;
        if (i11 >= 23) {
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
        c0 c0Var = this.f910j;
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f913m) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            q2.l lVar = q2.e.f16877a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f913m = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f913m = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f910j;
        if (c0Var != null) {
            c0Var.b();
        }
    }
}
