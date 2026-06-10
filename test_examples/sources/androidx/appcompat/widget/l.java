package androidx.appcompat.widget;

import a3.e;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.b0;
import com.noto.R;

/* loaded from: classes.dex */
public class l extends EditText implements a3.z, e3.m {

    /* renamed from: i  reason: collision with root package name */
    public final e f1015i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f1016j;

    /* renamed from: k  reason: collision with root package name */
    public final b0 f1017k;

    /* renamed from: l  reason: collision with root package name */
    public final e3.k f1018l;

    /* renamed from: m  reason: collision with root package name */
    public final m f1019m;
    public a n;

    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.editTextStyle);
        a1.a(context);
        y0.a(this, getContext());
        e eVar = new e(this);
        this.f1015i = eVar;
        eVar.d(attributeSet, R.attr.editTextStyle);
        c0 c0Var = new c0(this);
        this.f1016j = c0Var;
        c0Var.f(attributeSet, R.attr.editTextStyle);
        c0Var.b();
        this.f1017k = new b0(this);
        this.f1018l = new e3.k();
        m mVar = new m(this);
        this.f1019m = mVar;
        mVar.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = mVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private a getSuperCaller() {
        if (this.n == null) {
            this.n = new a();
        }
        return this.n;
    }

    @Override // a3.z
    public final a3.e a(a3.e eVar) {
        return this.f1018l.a(this, eVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1015i;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f1016j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e3.h.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1015i;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1015i;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1016j.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1016j.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f1017k) != null) {
            TextClassifier textClassifier = b0Var.f858b;
            if (textClassifier == null) {
                return b0.a.a(b0Var.f857a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0123, code lost:
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g10;
        String[] stringArray;
        InputConnection fVar;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        CharSequence subSequence;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1016j.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i14 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
            } else {
                text.getClass();
                if (i14 >= 30) {
                    editorInfo.setInitialSurroundingSubText(text, 0);
                } else {
                    int i15 = editorInfo.initialSelStart;
                    int i16 = editorInfo.initialSelEnd;
                    if (i15 > i16) {
                        i10 = i16 + 0;
                    } else {
                        i10 = i15 + 0;
                    }
                    if (i15 > i16) {
                        i11 = i15 - 0;
                    } else {
                        i11 = i16 + 0;
                    }
                    int length = text.length();
                    if (i10 >= 0 && i11 <= length) {
                        int i17 = editorInfo.inputType & 4095;
                        if (i17 != 129 && i17 != 225 && i17 != 18) {
                            z10 = false;
                            if (z10) {
                                if (length <= 2048) {
                                    d3.c.a(editorInfo, text, i10, i11);
                                } else {
                                    int i18 = i11 - i10;
                                    if (i18 > 1024) {
                                        i12 = 0;
                                    } else {
                                        i12 = i18;
                                    }
                                    int i19 = 2048 - i12;
                                    int min = Math.min(text.length() - i11, i19 - Math.min(i10, (int) (i19 * 0.8d)));
                                    int min2 = Math.min(i10, i19 - min);
                                    int i20 = i10 - min2;
                                    if (Character.isLowSurrogate(text.charAt(i20))) {
                                        i20++;
                                        min2--;
                                    }
                                    if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                                        min--;
                                    }
                                    int i21 = min2 + i12 + min;
                                    if (i12 != i18) {
                                        CharSequence subSequence2 = text.subSequence(i20, i20 + min2);
                                        CharSequence subSequence3 = text.subSequence(i11, min + i11);
                                        i13 = 0;
                                        subSequence = TextUtils.concat(subSequence2, subSequence3);
                                    } else {
                                        i13 = 0;
                                        subSequence = text.subSequence(i20, i21 + i20);
                                    }
                                    int i22 = min2 + i13;
                                    d3.c.a(editorInfo, subSequence, i22, i12 + i22);
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
        if (onCreateInputConnection != null && i14 <= 30 && (g10 = a3.j0.g(this)) != null) {
            if (i14 >= 25) {
                editorInfo.contentMimeTypes = g10;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g10);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g10);
            }
            d3.d dVar = new d3.d(0, this);
            if (i14 >= 25) {
                fVar = new d3.e(onCreateInputConnection, dVar);
            } else {
                String[] strArr = d3.c.f10384a;
                if (i14 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                    if (strArr.length != 0) {
                        fVar = new d3.f(onCreateInputConnection, dVar);
                    }
                }
            }
            onCreateInputConnection = fVar;
        }
        return this.f1019m.c(onCreateInputConnection, editorInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        return true;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && a3.j0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = w.a(dragEvent, this, activity);
            }
        }
        return super.onDragEvent(dragEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        return true;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        e.b cVar;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && a3.j0.g(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    cVar = new e.a(primaryClip, 1);
                } else {
                    cVar = new e.c(primaryClip, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                cVar.b(i12);
                a3.j0.l(this, cVar.build());
            }
            i12 = 1;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1015i;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1015i;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1016j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1016j;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e3.h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1019m.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1019m.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1015i;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1015i;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f1016j;
        c0Var.k(colorStateList);
        c0Var.b();
    }

    @Override // e3.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f1016j;
        c0Var.l(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f1016j;
        if (c0Var != null) {
            c0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f1017k) != null) {
            b0Var.f858b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }
}
