package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1040a;

    /* renamed from: b  reason: collision with root package name */
    public final q3.f f1041b;

    public n(TextView textView) {
        this.f1040a = textView;
        this.f1041b = new q3.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1041b.f16907a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1040a.getContext().obtainStyledAttributes(attributeSet, a1.b.f50s, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        this.f1041b.f16907a.c(z10);
    }

    public final void d(boolean z10) {
        this.f1041b.f16907a.d(z10);
    }
}
