package h6;

import a3.j0;
import a3.v0;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.e0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import java.util.WeakHashMap;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class w extends LinearLayout {

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout f11531i;

    /* renamed from: j  reason: collision with root package name */
    public final e0 f11532j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f11533k;

    /* renamed from: l  reason: collision with root package name */
    public final CheckableImageButton f11534l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f11535m;
    public PorterDuff.Mode n;

    /* renamed from: o  reason: collision with root package name */
    public int f11536o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView.ScaleType f11537p;

    /* renamed from: q  reason: collision with root package name */
    public View.OnLongClickListener f11538q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11539r;

    public w(TextInputLayout textInputLayout, d1 d1Var) {
        super(textInputLayout.getContext());
        CharSequence k3;
        this.f11531i = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f11534l = checkableImageButton;
        p.d(checkableImageButton);
        CharSequence charSequence = null;
        e0 e0Var = new e0(getContext(), null);
        this.f11532j = e0Var;
        if (x5.c.e(getContext())) {
            a3.m.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f11538q;
        checkableImageButton.setOnClickListener(null);
        p.e(checkableImageButton, onLongClickListener);
        this.f11538q = null;
        checkableImageButton.setOnLongClickListener(null);
        p.e(checkableImageButton, null);
        if (d1Var.l(67)) {
            this.f11535m = x5.c.b(getContext(), d1Var, 67);
        }
        if (d1Var.l(68)) {
            this.n = u5.n.f(d1Var.h(68, -1), null);
        }
        if (d1Var.l(64)) {
            a(d1Var.e(64));
            if (d1Var.l(63) && checkableImageButton.getContentDescription() != (k3 = d1Var.k(63))) {
                checkableImageButton.setContentDescription(k3);
            }
            checkableImageButton.setCheckable(d1Var.a(62, true));
        }
        int d5 = d1Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d5 >= 0) {
            if (d5 != this.f11536o) {
                this.f11536o = d5;
                checkableImageButton.setMinimumWidth(d5);
                checkableImageButton.setMinimumHeight(d5);
            }
            if (d1Var.l(66)) {
                ImageView.ScaleType b5 = p.b(d1Var.h(66, -1));
                this.f11537p = b5;
                checkableImageButton.setScaleType(b5);
            }
            e0Var.setVisibility(8);
            e0Var.setId(R.id.textinput_prefix_text);
            e0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.g.f(e0Var, 1);
            e3.h.e(e0Var, d1Var.i(58, 0));
            if (d1Var.l(59)) {
                e0Var.setTextColor(d1Var.b(59));
            }
            CharSequence k10 = d1Var.k(57);
            if (!TextUtils.isEmpty(k10)) {
                charSequence = k10;
            }
            this.f11533k = charSequence;
            e0Var.setText(k10);
            d();
            addView(checkableImageButton);
            addView(e0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f11534l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f11535m;
            PorterDuff.Mode mode = this.n;
            TextInputLayout textInputLayout = this.f11531i;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            p.c(textInputLayout, checkableImageButton, this.f11535m);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f11538q;
        checkableImageButton.setOnClickListener(null);
        p.e(checkableImageButton, onLongClickListener);
        this.f11538q = null;
        checkableImageButton.setOnLongClickListener(null);
        p.e(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f11534l;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            c();
            d();
        }
    }

    public final void c() {
        boolean z10;
        EditText editText = this.f11531i.f7420l;
        if (editText == null) {
            return;
        }
        int i10 = 0;
        if (this.f11534l.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            i10 = j0.e.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
        j0.e.k(this.f11532j, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z10;
        int i10 = 0;
        int i11 = (this.f11533k == null || this.f11539r) ? 8 : 0;
        if (this.f11534l.getVisibility() != 0 && i11 != 0) {
            z10 = false;
            if (z10) {
                i10 = 8;
            }
            setVisibility(i10);
            this.f11532j.setVisibility(i11);
            this.f11531i.o();
        }
        z10 = true;
        if (z10) {
        }
        setVisibility(i10);
        this.f11532j.setVisibility(i11);
        this.f11531i.o();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
