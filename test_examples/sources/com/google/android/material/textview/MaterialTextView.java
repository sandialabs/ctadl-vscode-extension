package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.e0;
import com.noto.R;
import i6.a;
import x5.b;
import x5.c;

/* loaded from: classes.dex */
public class MaterialTextView extends e0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z10 = true;
        if (b.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a1.b.f41n0;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int[] iArr2 = {1, 2};
            int i10 = -1;
            for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
                i10 = c.c(context2, obtainStyledAttributes, iArr2[i11], -1);
            }
            obtainStyledAttributes.recycle();
            if (i10 == -1) {
                z10 = false;
            }
            if (!z10) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public final void l(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, a1.b.f40m0);
        Context context = getContext();
        int[] iArr = {1, 2};
        int i11 = -1;
        for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
            i11 = c.c(context, obtainStyledAttributes, iArr[i12], -1);
        }
        obtainStyledAttributes.recycle();
        if (i11 >= 0) {
            setLineHeight(i11);
        }
    }

    @Override // androidx.appcompat.widget.e0, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (b.b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            l(i10, context.getTheme());
        }
    }
}
