package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import d.t;
import l5.a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends t {
    @Override // d.t
    public final d a(Context context, AttributeSet attributeSet) {
        return new h6.t(context, attributeSet);
    }

    @Override // d.t
    public final f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // d.t
    public final g c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // d.t
    public final u d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // d.t
    public final e0 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
