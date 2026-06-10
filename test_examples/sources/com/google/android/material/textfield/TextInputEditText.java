package com.google.android.material.textfield;

import a1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.l;
import com.noto.R;
import java.util.Locale;
import u5.j;

/* loaded from: classes.dex */
public class TextInputEditText extends l {

    /* renamed from: o  reason: collision with root package name */
    public final Rect f7405o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7406p;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, 0);
        this.f7405o = new Rect();
        TypedArray d5 = j.d(context, attributeSet, b.f63y0, R.attr.editTextStyle, 2132083553, new int[0]);
        setTextInputLayoutFocusedRectEnabled(d5.getBoolean(0, false));
        d5.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        boolean z10;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f7406p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && rect != null) {
            Rect rect2 = this.f7405o;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z10;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f7406p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.K) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.K && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.l, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean z10 = !TextUtils.isEmpty(text);
            String str2 = "";
            if (!(!TextUtils.isEmpty(hint))) {
                str = "";
            } else {
                str = hint.toString();
            }
            if (z10) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = ", " + str;
                }
                sb.append(str2);
                str2 = sb.toString();
            } else if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z10;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f7406p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && rect != null) {
            int height = textInputLayout.getHeight() - getHeight();
            int i10 = rect.left;
            int i11 = rect.top;
            int i12 = rect.right;
            int i13 = rect.bottom + height;
            Rect rect2 = this.f7405o;
            rect2.set(i10, i11, i12, i13);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f7406p = z10;
    }
}
