package com.google.android.material.textfield;

import a3.j0;
import a3.m;
import a3.v0;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.e;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.e0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import e3.h;
import h6.f;
import h6.g;
import h6.o;
import h6.p;
import h6.u;
import h6.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u5.i;
import u5.n;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends LinearLayout {
    public EditText A;
    public final AccessibilityManager B;
    public b3.d C;
    public final C0066a D;

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout f7456i;

    /* renamed from: j  reason: collision with root package name */
    public final FrameLayout f7457j;

    /* renamed from: k  reason: collision with root package name */
    public final CheckableImageButton f7458k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f7459l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f7460m;
    public View.OnLongClickListener n;

    /* renamed from: o  reason: collision with root package name */
    public final CheckableImageButton f7461o;

    /* renamed from: p  reason: collision with root package name */
    public final d f7462p;

    /* renamed from: q  reason: collision with root package name */
    public int f7463q;

    /* renamed from: r  reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.h> f7464r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f7465s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f7466t;

    /* renamed from: u  reason: collision with root package name */
    public int f7467u;

    /* renamed from: v  reason: collision with root package name */
    public ImageView.ScaleType f7468v;

    /* renamed from: w  reason: collision with root package name */
    public View.OnLongClickListener f7469w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f7470x;

    /* renamed from: y  reason: collision with root package name */
    public final e0 f7471y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7472z;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0066a extends i {
        public C0066a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // u5.i, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.b().b();
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.A == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.A;
            C0066a c0066a = aVar.D;
            if (editText != null) {
                editText.removeTextChangedListener(c0066a);
                if (aVar.A.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.A.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.A = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0066a);
            }
            aVar.b().m(aVar.A);
            aVar.i(aVar.b());
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.C != null && (accessibilityManager = aVar.B) != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.g.b(aVar)) {
                    b3.c.a(accessibilityManager, aVar.C);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            b3.d dVar = aVar.C;
            if (dVar != null && (accessibilityManager = aVar.B) != null) {
                b3.c.b(accessibilityManager, dVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<o> f7476a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public final a f7477b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7478d;

        public d(a aVar, d1 d1Var) {
            this.f7477b = aVar;
            this.c = d1Var.i(26, 0);
            this.f7478d = d1Var.i(50, 0);
        }
    }

    public a(TextInputLayout textInputLayout, d1 d1Var) {
        super(textInputLayout.getContext());
        CharSequence k3;
        this.f7463q = 0;
        this.f7464r = new LinkedHashSet<>();
        this.D = new C0066a();
        b bVar = new b();
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f7456i = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7457j = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f7458k = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f7461o = a11;
        this.f7462p = new d(this, d1Var);
        CharSequence charSequence = null;
        e0 e0Var = new e0(getContext(), null);
        this.f7471y = e0Var;
        if (d1Var.l(36)) {
            this.f7459l = x5.c.b(getContext(), d1Var, 36);
        }
        if (d1Var.l(37)) {
            this.f7460m = n.f(d1Var.h(37, -1), null);
        }
        if (d1Var.l(35)) {
            h(d1Var.e(35));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!d1Var.l(51)) {
            if (d1Var.l(30)) {
                this.f7465s = x5.c.b(getContext(), d1Var, 30);
            }
            if (d1Var.l(31)) {
                this.f7466t = n.f(d1Var.h(31, -1), null);
            }
        }
        if (d1Var.l(28)) {
            f(d1Var.h(28, 0));
            if (d1Var.l(25) && a11.getContentDescription() != (k3 = d1Var.k(25))) {
                a11.setContentDescription(k3);
            }
            a11.setCheckable(d1Var.a(24, true));
        } else if (d1Var.l(51)) {
            if (d1Var.l(52)) {
                this.f7465s = x5.c.b(getContext(), d1Var, 52);
            }
            if (d1Var.l(53)) {
                this.f7466t = n.f(d1Var.h(53, -1), null);
            }
            f(d1Var.a(51, false) ? 1 : 0);
            CharSequence k10 = d1Var.k(49);
            if (a11.getContentDescription() != k10) {
                a11.setContentDescription(k10);
            }
        }
        int d5 = d1Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d5 >= 0) {
            if (d5 != this.f7467u) {
                this.f7467u = d5;
                a11.setMinimumWidth(d5);
                a11.setMinimumHeight(d5);
                a10.setMinimumWidth(d5);
                a10.setMinimumHeight(d5);
            }
            if (d1Var.l(29)) {
                ImageView.ScaleType b5 = p.b(d1Var.h(29, -1));
                this.f7468v = b5;
                a11.setScaleType(b5);
                a10.setScaleType(b5);
            }
            e0Var.setVisibility(8);
            e0Var.setId(R.id.textinput_suffix_text);
            e0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            j0.g.f(e0Var, 1);
            h.e(e0Var, d1Var.i(70, 0));
            if (d1Var.l(71)) {
                e0Var.setTextColor(d1Var.b(71));
            }
            CharSequence k11 = d1Var.k(69);
            if (!TextUtils.isEmpty(k11)) {
                charSequence = k11;
            }
            this.f7470x = charSequence;
            e0Var.setText(k11);
            m();
            frameLayout.addView(a11);
            addView(e0Var);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f7419k0.add(bVar);
            if (textInputLayout.f7420l != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        p.d(checkableImageButton);
        if (x5.c.e(getContext())) {
            m.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o gVar;
        int i10 = this.f7463q;
        d dVar = this.f7462p;
        SparseArray<o> sparseArray = dVar.f7476a;
        o oVar = sparseArray.get(i10);
        if (oVar == null) {
            a aVar = dVar.f7477b;
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                gVar = new h6.n(aVar);
                            } else {
                                throw new IllegalArgumentException(e.g("Invalid end icon mode: ", i10));
                            }
                        } else {
                            gVar = new f(aVar);
                        }
                    } else {
                        oVar = new v(aVar, dVar.f7478d);
                        sparseArray.append(i10, oVar);
                    }
                } else {
                    gVar = new u(aVar);
                }
            } else {
                gVar = new g(aVar);
            }
            oVar = gVar;
            sparseArray.append(i10, oVar);
        }
        return oVar;
    }

    public final boolean c() {
        return this.f7457j.getVisibility() == 0 && this.f7461o.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f7458k.getVisibility() == 0;
    }

    public final void e(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        o b5 = b();
        boolean k3 = b5.k();
        CheckableImageButton checkableImageButton = this.f7461o;
        boolean z12 = true;
        if (k3 && (isChecked = checkableImageButton.isChecked()) != b5.l()) {
            checkableImageButton.setChecked(!isChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b5 instanceof h6.n) && (isActivated = checkableImageButton.isActivated()) != b5.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z11;
        }
        if (z10 || z12) {
            p.c(this.f7456i, checkableImageButton, this.f7465s);
        }
    }

    public final void f(int i10) {
        boolean z10;
        Drawable drawable;
        if (this.f7463q == i10) {
            return;
        }
        o b5 = b();
        b3.d dVar = this.C;
        AccessibilityManager accessibilityManager = this.B;
        if (dVar != null && accessibilityManager != null) {
            b3.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.C = null;
        b5.s();
        this.f7463q = i10;
        Iterator<TextInputLayout.h> it = this.f7464r.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        o b10 = b();
        int i11 = this.f7462p.c;
        if (i11 == 0) {
            i11 = b10.d();
        }
        if (i11 != 0) {
            drawable = e.a.a(getContext(), i11);
        } else {
            drawable = null;
        }
        CheckableImageButton checkableImageButton = this.f7461o;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f7456i;
        if (drawable != null) {
            p.a(textInputLayout, checkableImageButton, this.f7465s, this.f7466t);
            p.c(textInputLayout, checkableImageButton, this.f7465s);
        }
        int c10 = b10.c();
        if (c10 != 0) {
            charSequence = getResources().getText(c10);
        }
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
        checkableImageButton.setCheckable(b10.k());
        if (b10.i(textInputLayout.getBoxBackgroundMode())) {
            b10.r();
            b3.d h10 = b10.h();
            this.C = h10;
            if (h10 != null && accessibilityManager != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.g.b(this)) {
                    b3.c.a(accessibilityManager, this.C);
                }
            }
            View.OnClickListener f10 = b10.f();
            View.OnLongClickListener onLongClickListener = this.f7469w;
            checkableImageButton.setOnClickListener(f10);
            p.e(checkableImageButton, onLongClickListener);
            EditText editText = this.A;
            if (editText != null) {
                b10.m(editText);
                i(b10);
            }
            p.a(textInputLayout, checkableImageButton, this.f7465s, this.f7466t);
            e(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
    }

    public final void g(boolean z10) {
        if (c() != z10) {
            this.f7461o.setVisibility(z10 ? 0 : 8);
            j();
            l();
            this.f7456i.o();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7458k;
        checkableImageButton.setImageDrawable(drawable);
        k();
        p.a(this.f7456i, checkableImageButton, this.f7459l, this.f7460m);
    }

    public final void i(o oVar) {
        if (this.A == null) {
            return;
        }
        if (oVar.e() != null) {
            this.A.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.f7461o.setOnFocusChangeListener(oVar.g());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z10;
        this.f7457j.setVisibility((this.f7461o.getVisibility() != 0 || d()) ? 8 : 0);
        char c10 = (this.f7470x == null || this.f7472z) ? '\b' : (char) 0;
        if (!c() && !d() && c10 != 0) {
            z10 = false;
            setVisibility(z10 ? 0 : 8);
        }
        z10 = true;
        setVisibility(z10 ? 0 : 8);
    }

    public final void k() {
        boolean z10;
        int i10;
        CheckableImageButton checkableImageButton = this.f7458k;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z11 = true;
        TextInputLayout textInputLayout = this.f7456i;
        if (drawable != null && textInputLayout.f7431r.f11503q && textInputLayout.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        j();
        l();
        if (this.f7463q == 0) {
            z11 = false;
        }
        if (!z11) {
            textInputLayout.o();
        }
    }

    public final void l() {
        int i10;
        TextInputLayout textInputLayout = this.f7456i;
        if (textInputLayout.f7420l == null) {
            return;
        }
        if (!c() && !d()) {
            EditText editText = textInputLayout.f7420l;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            i10 = j0.e.e(editText);
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = textInputLayout.f7420l.getPaddingTop();
            int paddingBottom = textInputLayout.f7420l.getPaddingBottom();
            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            j0.e.k(this.f7471y, dimensionPixelSize, paddingTop, i10, paddingBottom);
        }
        i10 = 0;
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop2 = textInputLayout.f7420l.getPaddingTop();
        int paddingBottom2 = textInputLayout.f7420l.getPaddingBottom();
        WeakHashMap<View, v0> weakHashMap22 = j0.f188a;
        j0.e.k(this.f7471y, dimensionPixelSize2, paddingTop2, i10, paddingBottom2);
    }

    public final void m() {
        e0 e0Var = this.f7471y;
        int visibility = e0Var.getVisibility();
        int i10 = (this.f7470x == null || this.f7472z) ? 8 : 0;
        if (visibility != i10) {
            b().p(i10 == 0);
        }
        j();
        e0Var.setVisibility(i10);
        this.f7456i.o();
    }
}
