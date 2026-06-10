package com.google.android.material.textfield;

import a3.j0;
import a3.m;
import a3.v0;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.e0;
import b6.g;
import b6.k;
import com.google.android.material.internal.CheckableImageButton;
import com.noto.R;
import e3.h;
import h6.h;
import h6.p;
import h6.q;
import h6.r;
import h6.t;
import h6.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import r2.a;
import u5.j;
import u5.n;
import y2.g;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] G0 = {new int[]{16842919}, new int[0]};
    public boolean A;
    public final com.google.android.material.internal.a A0;
    public e0 B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public int D;
    public ValueAnimator D0;
    public h4.d E;
    public boolean E0;
    public h4.d F;
    public boolean F0;
    public ColorStateList G;
    public ColorStateList H;
    public boolean I;
    public CharSequence J;
    public boolean K;
    public b6.g L;
    public b6.g M;
    public StateListDrawable N;
    public boolean O;
    public b6.g P;
    public b6.g Q;
    public k R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f7407a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f7408b0;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f7409d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f7410e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Rect f7411f0;

    /* renamed from: g0  reason: collision with root package name */
    public final RectF f7412g0;

    /* renamed from: h0  reason: collision with root package name */
    public Typeface f7413h0;

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f7414i;

    /* renamed from: i0  reason: collision with root package name */
    public ColorDrawable f7415i0;

    /* renamed from: j  reason: collision with root package name */
    public final w f7416j;

    /* renamed from: j0  reason: collision with root package name */
    public int f7417j0;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.android.material.textfield.a f7418k;

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashSet<g> f7419k0;

    /* renamed from: l  reason: collision with root package name */
    public EditText f7420l;

    /* renamed from: l0  reason: collision with root package name */
    public ColorDrawable f7421l0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f7422m;

    /* renamed from: m0  reason: collision with root package name */
    public int f7423m0;
    public int n;

    /* renamed from: n0  reason: collision with root package name */
    public Drawable f7424n0;

    /* renamed from: o  reason: collision with root package name */
    public int f7425o;

    /* renamed from: o0  reason: collision with root package name */
    public ColorStateList f7426o0;

    /* renamed from: p  reason: collision with root package name */
    public int f7427p;

    /* renamed from: p0  reason: collision with root package name */
    public ColorStateList f7428p0;

    /* renamed from: q  reason: collision with root package name */
    public int f7429q;

    /* renamed from: q0  reason: collision with root package name */
    public int f7430q0;

    /* renamed from: r  reason: collision with root package name */
    public final q f7431r;

    /* renamed from: r0  reason: collision with root package name */
    public int f7432r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7433s;

    /* renamed from: s0  reason: collision with root package name */
    public int f7434s0;

    /* renamed from: t  reason: collision with root package name */
    public int f7435t;

    /* renamed from: t0  reason: collision with root package name */
    public ColorStateList f7436t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7437u;

    /* renamed from: u0  reason: collision with root package name */
    public int f7438u0;

    /* renamed from: v  reason: collision with root package name */
    public f f7439v;

    /* renamed from: v0  reason: collision with root package name */
    public int f7440v0;

    /* renamed from: w  reason: collision with root package name */
    public e0 f7441w;

    /* renamed from: w0  reason: collision with root package name */
    public int f7442w0;

    /* renamed from: x  reason: collision with root package name */
    public int f7443x;

    /* renamed from: x0  reason: collision with root package name */
    public int f7444x0;

    /* renamed from: y  reason: collision with root package name */
    public int f7445y;

    /* renamed from: y0  reason: collision with root package name */
    public int f7446y0;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f7447z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f7448z0;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s(!textInputLayout.F0, false);
            if (textInputLayout.f7433s) {
                textInputLayout.m(editable);
            }
            if (textInputLayout.A) {
                textInputLayout.t(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f7418k.f7461o;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f7420l.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.A0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a3.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f7453d;

        public e(TextInputLayout textInputLayout) {
            this.f7453d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
            if (r7 != null) goto L57;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
        @Override // a3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(View view, b3.g gVar) {
            CharSequence charSequence;
            boolean z10;
            String str;
            View view2;
            int i10;
            e0 e0Var;
            View.AccessibilityDelegate accessibilityDelegate = this.f108a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f7453d;
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(charSequence);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !textInputLayout.f7448z0;
            boolean z14 = !TextUtils.isEmpty(error);
            if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
                if (!z12) {
                    str = hint.toString();
                } else {
                    str = "";
                }
                w wVar = textInputLayout.f7416j;
                view2 = wVar.f11532j;
                if (view2.getVisibility() != 0) {
                    accessibilityNodeInfo.setLabelFor(view2);
                } else {
                    view2 = wVar.f11534l;
                }
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 22) {
                    accessibilityNodeInfo.setTraversalAfter(view2);
                }
                if (!z11) {
                    gVar.q(charSequence);
                } else if (!TextUtils.isEmpty(str)) {
                    gVar.q(str);
                    if (z13 && placeholderText != null) {
                        placeholderText = str + ", " + ((Object) placeholderText);
                        gVar.q(placeholderText);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    if (i10 >= 26) {
                        gVar.n(str);
                    } else {
                        if (z11) {
                            str = ((Object) charSequence) + ", " + str;
                        }
                        gVar.q(str);
                    }
                    boolean z15 = true ^ z11;
                    if (i10 >= 26) {
                        accessibilityNodeInfo.setShowingHintText(z15);
                    } else {
                        gVar.h(4, z15);
                    }
                }
                if (charSequence != null || charSequence.length() != counterMaxLength) {
                    counterMaxLength = -1;
                }
                accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
                if (z10) {
                    if (!z14) {
                        error = counterOverflowDescription;
                    }
                    accessibilityNodeInfo.setError(error);
                }
                e0Var = textInputLayout.f7431r.f11511y;
                if (e0Var != null) {
                    accessibilityNodeInfo.setLabelFor(e0Var);
                }
                textInputLayout.f7418k.b().n(gVar);
            }
            z10 = true;
            if (!z12) {
            }
            w wVar2 = textInputLayout.f7416j;
            view2 = wVar2.f11532j;
            if (view2.getVisibility() != 0) {
            }
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22) {
            }
            if (!z11) {
            }
            if (!TextUtils.isEmpty(str)) {
            }
            if (charSequence != null) {
            }
            counterMaxLength = -1;
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z10) {
            }
            e0Var = textInputLayout.f7431r.f11511y;
            if (e0Var != null) {
            }
            textInputLayout.f7418k.b().n(gVar);
        }

        @Override // a3.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f7453d.f7418k.b().o(accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* loaded from: classes.dex */
    public static class i extends h3.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f7454k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f7455l;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new i[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7454k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f7455l = z10;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f7454k) + "}";
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            TextUtils.writeToParcel(this.f7454k, parcel, i10);
            parcel.writeInt(this.f7455l ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v57 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.textInputStyle, 2132083554), attributeSet, R.attr.textInputStyle);
        ?? r42;
        int colorForState;
        this.n = -1;
        this.f7425o = -1;
        this.f7427p = -1;
        this.f7429q = -1;
        this.f7431r = new q(this);
        this.f7439v = new androidx.activity.e();
        this.f7410e0 = new Rect();
        this.f7411f0 = new Rect();
        this.f7412g0 = new RectF();
        this.f7419k0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.A0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f7414i = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = e5.a.f10647a;
        aVar.Q = linearInterpolator;
        aVar.h(false);
        aVar.P = linearInterpolator;
        aVar.h(false);
        if (aVar.f7221g != 8388659) {
            aVar.f7221g = 8388659;
            aVar.h(false);
        }
        int[] iArr = a1.b.f65z0;
        j.a(context2, attributeSet, R.attr.textInputStyle, 2132083554);
        j.b(context2, attributeSet, iArr, R.attr.textInputStyle, 2132083554, 22, 20, 38, 43, 47);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2132083554);
        d1 d1Var = new d1(context2, obtainStyledAttributes);
        w wVar = new w(this, d1Var);
        this.f7416j = wVar;
        this.I = d1Var.a(46, true);
        setHint(d1Var.k(4));
        this.C0 = d1Var.a(45, true);
        this.B0 = d1Var.a(40, true);
        if (d1Var.l(6)) {
            setMinEms(d1Var.h(6, -1));
        } else if (d1Var.l(3)) {
            setMinWidth(d1Var.d(3, -1));
        }
        if (d1Var.l(5)) {
            setMaxEms(d1Var.h(5, -1));
        } else if (d1Var.l(2)) {
            setMaxWidth(d1Var.d(2, -1));
        }
        this.R = new k(k.b(context2, attributeSet, R.attr.textInputStyle, 2132083554));
        this.T = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = d1Var.c(9, 0);
        this.f7407a0 = d1Var.d(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f7408b0 = d1Var.d(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.f7407a0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        k kVar = this.R;
        kVar.getClass();
        k.a aVar2 = new k.a(kVar);
        if (dimension >= 0.0f) {
            aVar2.f6447e = new b6.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVar2.f6448f = new b6.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVar2.f6449g = new b6.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVar2.f6450h = new b6.a(dimension4);
        }
        this.R = new k(aVar2);
        ColorStateList b5 = x5.c.b(context2, d1Var, 7);
        if (b5 != null) {
            int defaultColor = b5.getDefaultColor();
            this.f7438u0 = defaultColor;
            this.f7409d0 = defaultColor;
            if (b5.isStateful()) {
                this.f7440v0 = b5.getColorForState(new int[]{-16842910}, -1);
                this.f7442w0 = b5.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = b5.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f7442w0 = this.f7438u0;
                ColorStateList c10 = n2.a.c(context2, R.color.mtrl_filled_background_color);
                this.f7440v0 = c10.getColorForState(new int[]{-16842910}, -1);
                colorForState = c10.getColorForState(new int[]{16843623}, -1);
            }
            this.f7444x0 = colorForState;
        } else {
            this.f7409d0 = 0;
            this.f7438u0 = 0;
            this.f7440v0 = 0;
            this.f7442w0 = 0;
            this.f7444x0 = 0;
        }
        if (d1Var.l(1)) {
            ColorStateList b10 = d1Var.b(1);
            this.f7428p0 = b10;
            this.f7426o0 = b10;
        }
        ColorStateList b11 = x5.c.b(context2, d1Var, 14);
        this.f7434s0 = obtainStyledAttributes.getColor(14, 0);
        this.f7430q0 = n2.a.b(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f7446y0 = n2.a.b(context2, R.color.mtrl_textinput_disabled_color);
        this.f7432r0 = n2.a.b(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b11 != null) {
            setBoxStrokeColorStateList(b11);
        }
        if (d1Var.l(15)) {
            setBoxStrokeErrorColor(x5.c.b(context2, d1Var, 15));
        }
        if (d1Var.i(47, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(d1Var.i(47, 0));
        } else {
            r42 = 0;
        }
        int i10 = d1Var.i(38, r42);
        CharSequence k3 = d1Var.k(33);
        int h10 = d1Var.h(32, 1);
        boolean a10 = d1Var.a(34, r42);
        int i11 = d1Var.i(43, r42);
        boolean a11 = d1Var.a(42, r42);
        CharSequence k10 = d1Var.k(41);
        int i12 = d1Var.i(55, r42);
        CharSequence k11 = d1Var.k(54);
        boolean a12 = d1Var.a(18, r42);
        setCounterMaxLength(d1Var.h(19, -1));
        this.f7445y = d1Var.i(22, 0);
        this.f7443x = d1Var.i(20, 0);
        setBoxBackgroundMode(d1Var.h(8, 0));
        setErrorContentDescription(k3);
        setErrorAccessibilityLiveRegion(h10);
        setCounterOverflowTextAppearance(this.f7443x);
        setHelperTextTextAppearance(i11);
        setErrorTextAppearance(i10);
        setCounterTextAppearance(this.f7445y);
        setPlaceholderText(k11);
        setPlaceholderTextAppearance(i12);
        if (d1Var.l(39)) {
            setErrorTextColor(d1Var.b(39));
        }
        if (d1Var.l(44)) {
            setHelperTextColor(d1Var.b(44));
        }
        if (d1Var.l(48)) {
            setHintTextColor(d1Var.b(48));
        }
        if (d1Var.l(23)) {
            setCounterTextColor(d1Var.b(23));
        }
        if (d1Var.l(21)) {
            setCounterOverflowTextColor(d1Var.b(21));
        }
        if (d1Var.l(56)) {
            setPlaceholderTextColor(d1Var.b(56));
        }
        com.google.android.material.textfield.a aVar3 = new com.google.android.material.textfield.a(this, d1Var);
        this.f7418k = aVar3;
        boolean a13 = d1Var.a(0, true);
        d1Var.n();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.s(this, 2);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26 && i13 >= 26) {
            j0.l.l(this, 1);
        }
        frameLayout.addView(wVar);
        frameLayout.addView(aVar3);
        addView(frameLayout);
        setEnabled(a13);
        setHelperTextEnabled(a11);
        setErrorEnabled(a10);
        setCounterEnabled(a12);
        setHelperText(k10);
    }

    private Drawable getEditTextBoxBackground() {
        boolean z10;
        int i10;
        EditText editText = this.f7420l;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int T = a1.b.T(this.f7420l, R.attr.colorControlHighlight);
                int i11 = this.U;
                int[][] iArr = G0;
                if (i11 == 2) {
                    Context context = getContext();
                    b6.g gVar = this.L;
                    TypedValue c10 = x5.b.c(R.attr.colorSurface, context, "TextInputLayout");
                    int i12 = c10.resourceId;
                    if (i12 != 0) {
                        i10 = n2.a.b(context, i12);
                    } else {
                        i10 = c10.data;
                    }
                    b6.g gVar2 = new b6.g(gVar.f6391i.f6409a);
                    int p02 = a1.b.p0(0.1f, T, i10);
                    gVar2.n(new ColorStateList(iArr, new int[]{p02, 0}));
                    gVar2.setTint(i10);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{p02, i10});
                    b6.g gVar3 = new b6.g(gVar.f6391i.f6409a);
                    gVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
                } else if (i11 == 1) {
                    b6.g gVar4 = this.L;
                    int i13 = this.f7409d0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{a1.b.p0(0.1f, T, i13), i13}), gVar4, gVar4);
                } else {
                    return null;
                }
            }
        }
        return this.L;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.N == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.N = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.N.addState(new int[0], f(false));
        }
        return this.N;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.M == null) {
            this.M = f(true);
        }
        return this.M;
    }

    public static void j(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f7420l == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f7420l = editText;
            int i10 = this.n;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f7427p);
            }
            int i11 = this.f7425o;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f7429q);
            }
            this.O = false;
            h();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.f7420l.getTypeface();
            com.google.android.material.internal.a aVar = this.A0;
            aVar.m(typeface);
            float textSize = this.f7420l.getTextSize();
            if (aVar.f7222h != textSize) {
                aVar.f7222h = textSize;
                aVar.h(false);
            }
            float letterSpacing = this.f7420l.getLetterSpacing();
            if (aVar.W != letterSpacing) {
                aVar.W = letterSpacing;
                aVar.h(false);
            }
            int gravity = this.f7420l.getGravity();
            int i12 = (gravity & (-113)) | 48;
            if (aVar.f7221g != i12) {
                aVar.f7221g = i12;
                aVar.h(false);
            }
            if (aVar.f7219f != gravity) {
                aVar.f7219f = gravity;
                aVar.h(false);
            }
            this.f7420l.addTextChangedListener(new a());
            if (this.f7426o0 == null) {
                this.f7426o0 = this.f7420l.getHintTextColors();
            }
            if (this.I) {
                if (TextUtils.isEmpty(this.J)) {
                    CharSequence hint = this.f7420l.getHint();
                    this.f7422m = hint;
                    setHint(hint);
                    this.f7420l.setHint((CharSequence) null);
                }
                this.K = true;
            }
            if (this.f7441w != null) {
                m(this.f7420l.getText());
            }
            p();
            this.f7431r.b();
            this.f7416j.bringToFront();
            com.google.android.material.textfield.a aVar2 = this.f7418k;
            aVar2.bringToFront();
            Iterator<g> it = this.f7419k0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            aVar2.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.J)) {
            this.J = charSequence;
            com.google.android.material.internal.a aVar = this.A0;
            if (charSequence == null || !TextUtils.equals(aVar.A, charSequence)) {
                aVar.A = charSequence;
                aVar.B = null;
                Bitmap bitmap = aVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    aVar.E = null;
                }
                aVar.h(false);
            }
            if (!this.f7448z0) {
                i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.A == z10) {
            return;
        }
        if (z10) {
            e0 e0Var = this.B;
            if (e0Var != null) {
                this.f7414i.addView(e0Var);
                this.B.setVisibility(0);
            }
        } else {
            e0 e0Var2 = this.B;
            if (e0Var2 != null) {
                e0Var2.setVisibility(8);
            }
            this.B = null;
        }
        this.A = z10;
    }

    public final void a(float f10) {
        com.google.android.material.internal.a aVar = this.A0;
        if (aVar.f7213b == f10) {
            return;
        }
        if (this.D0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.D0 = valueAnimator;
            valueAnimator.setInterpolator(v5.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, e5.a.f10648b));
            this.D0.setDuration(v5.a.c(getContext(), R.attr.motionDurationMedium4, 167));
            this.D0.addUpdateListener(new d());
        }
        this.D0.setFloatValues(aVar.f7213b, f10);
        this.D0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f7414i;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        b6.g gVar;
        int i10;
        boolean z11;
        b6.g gVar2 = this.L;
        if (gVar2 == null) {
            return;
        }
        k kVar = gVar2.f6391i.f6409a;
        k kVar2 = this.R;
        if (kVar != kVar2) {
            gVar2.setShapeAppearanceModel(kVar2);
        }
        boolean z12 = false;
        if (this.U == 2) {
            if (this.W > -1 && this.c0 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z10 = true;
                if (z10) {
                    b6.g gVar3 = this.L;
                    int i11 = this.c0;
                    gVar3.f6391i.f6418k = this.W;
                    gVar3.invalidateSelf();
                    gVar3.s(ColorStateList.valueOf(i11));
                }
                int i12 = this.f7409d0;
                if (this.U == 1) {
                    i12 = q2.a.b(this.f7409d0, a1.b.S(getContext(), R.attr.colorSurface, 0));
                }
                this.f7409d0 = i12;
                this.L.n(ColorStateList.valueOf(i12));
                gVar = this.P;
                if (gVar != null && this.Q != null) {
                    if (this.W > -1 && this.c0 != 0) {
                        z12 = true;
                    }
                    if (z12) {
                        if (this.f7420l.isFocused()) {
                            i10 = this.f7430q0;
                        } else {
                            i10 = this.c0;
                        }
                        gVar.n(ColorStateList.valueOf(i10));
                        this.Q.n(ColorStateList.valueOf(this.c0));
                    }
                    invalidate();
                }
                q();
            }
        }
        z10 = false;
        if (z10) {
        }
        int i122 = this.f7409d0;
        if (this.U == 1) {
        }
        this.f7409d0 = i122;
        this.L.n(ColorStateList.valueOf(i122));
        gVar = this.P;
        if (gVar != null) {
            if (this.W > -1) {
                z12 = true;
            }
            if (z12) {
            }
            invalidate();
        }
        q();
    }

    public final int c() {
        float d5;
        if (this.I) {
            int i10 = this.U;
            com.google.android.material.internal.a aVar = this.A0;
            if (i10 == 0) {
                d5 = aVar.d();
            } else if (i10 != 2) {
                return 0;
            } else {
                d5 = aVar.d() / 2.0f;
            }
            return (int) d5;
        }
        return 0;
    }

    public final h4.d d() {
        h4.d dVar = new h4.d();
        dVar.f11394k = v5.a.c(getContext(), R.attr.motionDurationShort2, 87);
        dVar.f11395l = v5.a.d(getContext(), R.attr.motionEasingLinearInterpolator, e5.a.f10647a);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f7420l;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f7422m != null) {
            boolean z10 = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.f7420l.setHint(this.f7422m);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                this.f7420l.setHint(hint);
                this.K = z10;
                return;
            } catch (Throwable th) {
                this.f7420l.setHint(hint);
                this.K = z10;
                throw th;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f7414i;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f7420l) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.F0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.F0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b6.g gVar;
        super.draw(canvas);
        boolean z10 = this.I;
        com.google.android.material.internal.a aVar = this.A0;
        if (z10) {
            aVar.getClass();
            int save = canvas.save();
            if (aVar.B != null) {
                RectF rectF = aVar.f7217e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = aVar.N;
                    textPaint.setTextSize(aVar.G);
                    float f10 = aVar.f7229p;
                    float f11 = aVar.f7230q;
                    float f12 = aVar.F;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    boolean z11 = true;
                    if ((aVar.f7216d0 <= 1 || aVar.C) ? false : false) {
                        int alpha = textPaint.getAlpha();
                        canvas.translate(aVar.f7229p - aVar.Y.getLineStart(0), f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (aVar.f7214b0 * f13));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(aVar.H, aVar.I, aVar.J, a1.b.C(aVar.K, textPaint.getAlpha()));
                        }
                        aVar.Y.draw(canvas);
                        textPaint.setAlpha((int) (aVar.f7212a0 * f13));
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(aVar.H, aVar.I, aVar.J, a1.b.C(aVar.K, textPaint.getAlpha()));
                        }
                        int lineBaseline = aVar.Y.getLineBaseline(0);
                        CharSequence charSequence = aVar.c0;
                        float f14 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(aVar.H, aVar.I, aVar.J, aVar.K);
                        }
                        String trim = aVar.c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(aVar.Y.getLineEnd(0), str.length()), 0.0f, f14, (Paint) textPaint);
                    } else {
                        canvas.translate(f10, f11);
                        aVar.Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.Q != null && (gVar = this.P) != null) {
            gVar.draw(canvas);
            if (this.f7420l.isFocused()) {
                Rect bounds = this.Q.getBounds();
                Rect bounds2 = this.P.getBounds();
                float f15 = aVar.f7213b;
                int centerX = bounds2.centerX();
                bounds.left = e5.a.b(f15, centerX, bounds2.left);
                bounds.right = e5.a.b(f15, centerX, bounds2.right);
                this.Q.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        boolean z11;
        boolean z12;
        if (this.E0) {
            return;
        }
        boolean z13 = true;
        this.E0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.A0;
        if (aVar != null) {
            aVar.L = drawableState;
            ColorStateList colorStateList2 = aVar.f7225k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = aVar.f7224j) != null && colorStateList.isStateful())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar.h(false);
                z12 = true;
            } else {
                z12 = false;
            }
            z10 = z12 | false;
        } else {
            z10 = false;
        }
        if (this.f7420l != null) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (!j0.g.c(this) || !isEnabled()) {
                z13 = false;
            }
            s(z13, false);
        }
        p();
        v();
        if (z10) {
            invalidate();
        }
        this.E0 = false;
    }

    public final boolean e() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof h6.h);
    }

    public final b6.g f(boolean z10) {
        float f10;
        float dimensionPixelOffset;
        int i10;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f7420l;
        if (editText instanceof t) {
            dimensionPixelOffset = ((t) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        k.a aVar = new k.a();
        aVar.f6447e = new b6.a(f10);
        aVar.f6448f = new b6.a(f10);
        aVar.f6450h = new b6.a(dimensionPixelOffset2);
        aVar.f6449g = new b6.a(dimensionPixelOffset2);
        k kVar = new k(aVar);
        Context context = getContext();
        Paint paint = b6.g.E;
        TypedValue c10 = x5.b.c(R.attr.colorSurface, context, b6.g.class.getSimpleName());
        int i11 = c10.resourceId;
        if (i11 != 0) {
            i10 = n2.a.b(context, i11);
        } else {
            i10 = c10.data;
        }
        b6.g gVar = new b6.g();
        gVar.k(context);
        gVar.n(ColorStateList.valueOf(i10));
        gVar.m(dimensionPixelOffset);
        gVar.setShapeAppearanceModel(kVar);
        g.b bVar = gVar.f6391i;
        if (bVar.f6415h == null) {
            bVar.f6415h = new Rect();
        }
        gVar.f6391i.f6415h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft = this.f7420l.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f7420l;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public b6.g getBoxBackground() {
        int i10 = this.U;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.L;
    }

    public int getBoxBackgroundColor() {
        return this.f7409d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        b6.c cVar;
        boolean e10 = n.e(this);
        RectF rectF = this.f7412g0;
        if (e10) {
            cVar = this.R.f6439h;
        } else {
            cVar = this.R.f6438g;
        }
        return cVar.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        b6.c cVar;
        boolean e10 = n.e(this);
        RectF rectF = this.f7412g0;
        if (e10) {
            cVar = this.R.f6438g;
        } else {
            cVar = this.R.f6439h;
        }
        return cVar.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        b6.c cVar;
        boolean e10 = n.e(this);
        RectF rectF = this.f7412g0;
        if (e10) {
            cVar = this.R.f6436e;
        } else {
            cVar = this.R.f6437f;
        }
        return cVar.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        b6.c cVar;
        boolean e10 = n.e(this);
        RectF rectF = this.f7412g0;
        if (e10) {
            cVar = this.R.f6437f;
        } else {
            cVar = this.R.f6436e;
        }
        return cVar.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f7434s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f7436t0;
    }

    public int getBoxStrokeWidth() {
        return this.f7407a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f7408b0;
    }

    public int getCounterMaxLength() {
        return this.f7435t;
    }

    public CharSequence getCounterOverflowDescription() {
        e0 e0Var;
        if (this.f7433s && this.f7437u && (e0Var = this.f7441w) != null) {
            return e0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.H;
    }

    public ColorStateList getCounterTextColor() {
        return this.G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f7426o0;
    }

    public EditText getEditText() {
        return this.f7420l;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f7418k.f7461o.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f7418k.f7461o.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f7418k.f7467u;
    }

    public int getEndIconMode() {
        return this.f7418k.f7463q;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f7418k.f7468v;
    }

    public CheckableImageButton getEndIconView() {
        return this.f7418k.f7461o;
    }

    public CharSequence getError() {
        q qVar = this.f7431r;
        if (qVar.f11503q) {
            return qVar.f11502p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f7431r.f11506t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f7431r.f11505s;
    }

    public int getErrorCurrentTextColors() {
        e0 e0Var = this.f7431r.f11504r;
        if (e0Var != null) {
            return e0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f7418k.f7458k.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f7431r;
        if (qVar.f11510x) {
            return qVar.f11509w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        e0 e0Var = this.f7431r.f11511y;
        if (e0Var != null) {
            return e0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.I) {
            return this.J;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.a aVar = this.A0;
        return aVar.e(aVar.f7225k);
    }

    public ColorStateList getHintTextColor() {
        return this.f7428p0;
    }

    public f getLengthCounter() {
        return this.f7439v;
    }

    public int getMaxEms() {
        return this.f7425o;
    }

    public int getMaxWidth() {
        return this.f7429q;
    }

    public int getMinEms() {
        return this.n;
    }

    public int getMinWidth() {
        return this.f7427p;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f7418k.f7461o.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f7418k.f7461o.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.A) {
            return this.f7447z;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.D;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.C;
    }

    public CharSequence getPrefixText() {
        return this.f7416j.f11533k;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f7416j.f11532j.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f7416j.f11532j;
    }

    public k getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f7416j.f11534l.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f7416j.f11534l.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f7416j.f11536o;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f7416j.f11537p;
    }

    public CharSequence getSuffixText() {
        return this.f7418k.f7470x;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f7418k.f7471y.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f7418k.f7471y;
    }

    public Typeface getTypeface() {
        return this.f7413h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        boolean z10;
        EditText editText;
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText2;
        int f10;
        int dimensionPixelSize;
        int e10;
        Resources resources;
        int i10;
        boolean z11;
        Resources resources2;
        int i11;
        int i12 = this.U;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    if (this.I && !(this.L instanceof h6.h)) {
                        k kVar = this.R;
                        int i13 = h6.h.G;
                        this.L = new h.a(kVar);
                    } else {
                        this.L = new b6.g(this.R);
                    }
                } else {
                    throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
            } else {
                this.L = new b6.g(this.R);
                this.P = new b6.g();
                this.Q = new b6.g();
                q();
                v();
                z10 = false;
                if (this.U == 1) {
                    if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        resources2 = getResources();
                        i11 = R.dimen.material_font_2_0_box_collapsed_padding_top;
                    } else if (x5.c.e(getContext())) {
                        resources2 = getResources();
                        i11 = R.dimen.material_font_1_3_box_collapsed_padding_top;
                    }
                    this.V = resources2.getDimensionPixelSize(i11);
                }
                if (this.f7420l != null && this.U == 1) {
                    if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                        z10 = true;
                    }
                    if (!z10) {
                        editText2 = this.f7420l;
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        f10 = j0.e.f(editText2);
                        dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top);
                        e10 = j0.e.e(this.f7420l);
                        resources = getResources();
                        i10 = R.dimen.material_filled_edittext_font_2_0_padding_bottom;
                    } else if (x5.c.e(getContext())) {
                        editText2 = this.f7420l;
                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                        f10 = j0.e.f(editText2);
                        dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top);
                        e10 = j0.e.e(this.f7420l);
                        resources = getResources();
                        i10 = R.dimen.material_filled_edittext_font_1_3_padding_bottom;
                    }
                    j0.e.k(editText2, f10, dimensionPixelSize, e10, resources.getDimensionPixelSize(i10));
                }
                if (this.U != 0) {
                    r();
                }
                editText = this.f7420l;
                if (!(editText instanceof AutoCompleteTextView)) {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                    if (autoCompleteTextView.getDropDownBackground() == null) {
                        int i14 = this.U;
                        if (i14 == 2) {
                            orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                        } else if (i14 == 1) {
                            orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                        } else {
                            return;
                        }
                        autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            this.L = null;
        }
        this.P = null;
        this.Q = null;
        q();
        v();
        z10 = false;
        if (this.U == 1) {
        }
        if (this.f7420l != null) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            }
            if (!z10) {
            }
            j0.e.k(editText2, f10, dimensionPixelSize, e10, resources.getDimensionPixelSize(i10));
        }
        if (this.U != 0) {
        }
        editText = this.f7420l;
        if (!(editText instanceof AutoCompleteTextView)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        if (!e()) {
            return;
        }
        int width = this.f7420l.getWidth();
        int gravity = this.f7420l.getGravity();
        com.google.android.material.internal.a aVar = this.A0;
        boolean b5 = aVar.b(aVar.A);
        aVar.C = b5;
        Rect rect = aVar.f7215d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b5) {
                    f10 = rect.right;
                    f11 = aVar.Z;
                    f12 = f10 - f11;
                    float max = Math.max(f12, rect.left);
                    rectF = this.f7412g0;
                    rectF.left = max;
                    rectF.top = rect.top;
                    if (gravity != 17 && (gravity & 7) != 1) {
                        if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                            if (aVar.C) {
                                f13 = aVar.Z + max;
                                rectF.right = Math.min(f13, rect.right);
                                rectF.bottom = aVar.d() + rect.top;
                                if (rectF.width() <= 0.0f) {
                                    float f14 = rectF.left;
                                    float f15 = this.T;
                                    rectF.left = f14 - f15;
                                    rectF.right += f15;
                                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                                    h6.h hVar = (h6.h) this.L;
                                    hVar.getClass();
                                    hVar.w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                                    return;
                                }
                                return;
                            }
                            f13 = rect.right;
                            rectF.right = Math.min(f13, rect.right);
                            rectF.bottom = aVar.d() + rect.top;
                            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                                float f142 = rectF.left;
                                float f152 = this.T;
                                rectF.left = f142 - f152;
                                rectF.right += f152;
                                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                                h6.h hVar2 = (h6.h) this.L;
                                hVar2.getClass();
                                hVar2.w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                                return;
                            }
                            return;
                        }
                        if (aVar.C) {
                            f13 = aVar.Z + max;
                            rectF.right = Math.min(f13, rect.right);
                            rectF.bottom = aVar.d() + rect.top;
                            if (rectF.width() <= 0.0f) {
                            }
                        }
                        f13 = rect.right;
                        rectF.right = Math.min(f13, rect.right);
                        rectF.bottom = aVar.d() + rect.top;
                        if (rectF.width() <= 0.0f) {
                        }
                    }
                    f13 = (width / 2.0f) + (aVar.Z / 2.0f);
                    rectF.right = Math.min(f13, rect.right);
                    rectF.bottom = aVar.d() + rect.top;
                    if (rectF.width() <= 0.0f) {
                    }
                }
                f12 = rect.left;
                float max2 = Math.max(f12, rect.left);
                rectF = this.f7412g0;
                rectF.left = max2;
                rectF.top = rect.top;
                if (gravity != 17) {
                    if ((gravity & 8388613) != 8388613) {
                        if (aVar.C) {
                        }
                    }
                    if (aVar.C) {
                    }
                    f13 = rect.right;
                    rectF.right = Math.min(f13, rect.right);
                    rectF.bottom = aVar.d() + rect.top;
                    if (rectF.width() <= 0.0f) {
                    }
                }
                f13 = (width / 2.0f) + (aVar.Z / 2.0f);
                rectF.right = Math.min(f13, rect.right);
                rectF.bottom = aVar.d() + rect.top;
                if (rectF.width() <= 0.0f) {
                }
            }
            f10 = rect.right;
            f11 = aVar.Z;
            f12 = f10 - f11;
            float max22 = Math.max(f12, rect.left);
            rectF = this.f7412g0;
            rectF.left = max22;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f13 = (width / 2.0f) + (aVar.Z / 2.0f);
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = aVar.d() + rect.top;
            if (rectF.width() <= 0.0f) {
            }
        }
        f10 = width / 2.0f;
        f11 = aVar.Z / 2.0f;
        f12 = f10 - f11;
        float max222 = Math.max(f12, rect.left);
        rectF = this.f7412g0;
        rectF.left = max222;
        rectF.top = rect.top;
        if (gravity != 17) {
        }
        f13 = (width / 2.0f) + (aVar.Z / 2.0f);
        rectF.right = Math.min(f13, rect.right);
        rectF.bottom = aVar.d() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(TextView textView, int i10) {
        boolean z10 = true;
        try {
            e3.h.e(textView, i10);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() == -65281) {
                if (z10) {
                    return;
                }
                e3.h.e(textView, 2132083131);
                textView.setTextColor(n2.a.b(getContext(), R.color.design_error));
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    public final boolean l() {
        q qVar = this.f7431r;
        if (qVar.f11501o == 1 && qVar.f11504r != null && !TextUtils.isEmpty(qVar.f11502p)) {
            return true;
        }
        return false;
    }

    public final void m(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        y2.a aVar;
        ((androidx.activity.e) this.f7439v).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z12 = this.f7437u;
        int i12 = this.f7435t;
        String str = null;
        if (i12 == -1) {
            this.f7441w.setText(String.valueOf(i10));
            this.f7441w.setContentDescription(null);
            this.f7437u = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7437u = z10;
            Context context = getContext();
            e0 e0Var = this.f7441w;
            int i13 = this.f7435t;
            if (this.f7437u) {
                i11 = R.string.character_counter_overflowed_content_description;
            } else {
                i11 = R.string.character_counter_content_description;
            }
            e0Var.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z12 != this.f7437u) {
                n();
            }
            String str2 = y2.a.f18789d;
            Locale locale = Locale.getDefault();
            int i14 = y2.g.f18809a;
            if (g.a.a(locale) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar = y2.a.f18792g;
            } else {
                aVar = y2.a.f18791f;
            }
            e0 e0Var2 = this.f7441w;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f7435t));
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.c).toString();
            }
            e0Var2.setText(str);
        }
        if (this.f7420l != null && z12 != this.f7437u) {
            s(false, false);
            v();
            p();
        }
    }

    public final void n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e0 e0Var = this.f7441w;
        if (e0Var != null) {
            k(e0Var, this.f7437u ? this.f7443x : this.f7445y);
            if (!this.f7437u && (colorStateList2 = this.G) != null) {
                this.f7441w.setTextColor(colorStateList2);
            }
            if (!this.f7437u || (colorStateList = this.H) == null) {
                return;
            }
            this.f7441w.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r3.c() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r3.f7470x != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ColorDrawable colorDrawable;
        EditText editText;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        boolean z14;
        if (this.f7420l == null) {
            return false;
        }
        Drawable startIconDrawable = getStartIconDrawable();
        boolean z15 = true;
        w wVar = this.f7416j;
        if ((startIconDrawable != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && wVar.getMeasuredWidth() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        CheckableImageButton checkableImageButton = null;
        if (z10) {
            int measuredWidth = wVar.getMeasuredWidth() - this.f7420l.getPaddingLeft();
            if (this.f7415i0 == null || this.f7417j0 != measuredWidth) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f7415i0 = colorDrawable2;
                this.f7417j0 = measuredWidth;
                colorDrawable2.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = h.b.a(this.f7420l);
            Drawable drawable4 = a10[0];
            ColorDrawable colorDrawable3 = this.f7415i0;
            if (drawable4 != colorDrawable3) {
                h.b.e(this.f7420l, colorDrawable3, a10[1], a10[2], a10[3]);
                z11 = true;
            }
            z11 = false;
        } else {
            if (this.f7415i0 != null) {
                Drawable[] a11 = h.b.a(this.f7420l);
                h.b.e(this.f7420l, null, a11[1], a11[2], a11[3]);
                this.f7415i0 = null;
                z11 = true;
            }
            z11 = false;
        }
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (!aVar.d()) {
            if (aVar.f7463q != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
            }
        }
        if (aVar.getMeasuredWidth() > 0) {
            z12 = true;
            if (!z12) {
                int measuredWidth2 = aVar.f7471y.getMeasuredWidth() - this.f7420l.getPaddingRight();
                if (aVar.d()) {
                    checkableImageButton = aVar.f7458k;
                } else {
                    if (aVar.f7463q != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 && aVar.c()) {
                        checkableImageButton = aVar.f7461o;
                    }
                }
                if (checkableImageButton != null) {
                    measuredWidth2 = m.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                }
                Drawable[] a12 = h.b.a(this.f7420l);
                ColorDrawable colorDrawable4 = this.f7421l0;
                if (colorDrawable4 != null && this.f7423m0 != measuredWidth2) {
                    this.f7423m0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                    editText = this.f7420l;
                    drawable = a12[0];
                    drawable2 = a12[1];
                    colorDrawable = this.f7421l0;
                    drawable3 = a12[3];
                } else {
                    if (colorDrawable4 == null) {
                        ColorDrawable colorDrawable5 = new ColorDrawable();
                        this.f7421l0 = colorDrawable5;
                        this.f7423m0 = measuredWidth2;
                        colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                    }
                    Drawable drawable5 = a12[2];
                    colorDrawable = this.f7421l0;
                    if (drawable5 != colorDrawable) {
                        this.f7424n0 = drawable5;
                        editText = this.f7420l;
                        drawable = a12[0];
                        drawable2 = a12[1];
                        drawable3 = a12[3];
                    } else {
                        z15 = z11;
                    }
                }
                h.b.e(editText, drawable, drawable2, colorDrawable, drawable3);
            } else if (this.f7421l0 != null) {
                Drawable[] a13 = h.b.a(this.f7420l);
                if (a13[2] == this.f7421l0) {
                    h.b.e(this.f7420l, a13[0], a13[1], this.f7424n0, a13[3]);
                } else {
                    z15 = z11;
                }
                this.f7421l0 = null;
            } else {
                return z11;
            }
            return z15;
        }
        z12 = false;
        if (!z12) {
        }
        return z15;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0.g(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b5  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        Rect rect;
        boolean z11;
        boolean z12;
        int compoundPaddingTop;
        boolean z13;
        int compoundPaddingBottom;
        boolean z14;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f7420l;
        if (editText != null) {
            ThreadLocal<Matrix> threadLocal = u5.c.f17803a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect2 = this.f7410e0;
            rect2.set(0, 0, width, height);
            u5.c.b(this, editText, rect2);
            b6.g gVar = this.P;
            if (gVar != null) {
                int i17 = rect2.bottom;
                gVar.setBounds(rect2.left, i17 - this.f7407a0, rect2.right, i17);
            }
            b6.g gVar2 = this.Q;
            if (gVar2 != null) {
                int i18 = rect2.bottom;
                gVar2.setBounds(rect2.left, i18 - this.f7408b0, rect2.right, i18);
            }
            if (this.I) {
                float textSize = this.f7420l.getTextSize();
                com.google.android.material.internal.a aVar = this.A0;
                if (aVar.f7222h != textSize) {
                    aVar.f7222h = textSize;
                    aVar.h(false);
                }
                int gravity = this.f7420l.getGravity();
                int i19 = (gravity & (-113)) | 48;
                if (aVar.f7221g != i19) {
                    aVar.f7221g = i19;
                    aVar.h(false);
                }
                if (aVar.f7219f != gravity) {
                    aVar.f7219f = gravity;
                    aVar.h(false);
                }
                if (this.f7420l != null) {
                    boolean e10 = n.e(this);
                    int i20 = rect2.bottom;
                    Rect rect3 = this.f7411f0;
                    rect3.bottom = i20;
                    int i21 = this.U;
                    if (i21 != 1) {
                        if (i21 != 2) {
                            rect3.left = g(rect2.left, e10);
                            i14 = getPaddingTop();
                        } else {
                            rect3.left = this.f7420l.getPaddingLeft() + rect2.left;
                            rect3.top = rect2.top - c();
                            i15 = rect2.right - this.f7420l.getPaddingRight();
                            rect3.right = i15;
                            i16 = rect3.left;
                            int i22 = rect3.top;
                            int i23 = rect3.bottom;
                            rect = aVar.f7215d;
                            if (rect.left != i16 && rect.top == i22 && rect.right == i15 && rect.bottom == i23) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                rect.set(i16, i22, i15, i23);
                                aVar.M = true;
                            }
                            if (this.f7420l == null) {
                                TextPaint textPaint = aVar.O;
                                textPaint.setTextSize(aVar.f7222h);
                                textPaint.setTypeface(aVar.f7234u);
                                textPaint.setLetterSpacing(aVar.W);
                                float f10 = -textPaint.ascent();
                                rect3.left = this.f7420l.getCompoundPaddingLeft() + rect2.left;
                                if (this.U == 1 && this.f7420l.getMinLines() <= 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    compoundPaddingTop = (int) (rect2.centerY() - (f10 / 2.0f));
                                } else {
                                    compoundPaddingTop = rect2.top + this.f7420l.getCompoundPaddingTop();
                                }
                                rect3.top = compoundPaddingTop;
                                rect3.right = rect2.right - this.f7420l.getCompoundPaddingRight();
                                if (this.U == 1 && this.f7420l.getMinLines() <= 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    compoundPaddingBottom = (int) (rect3.top + f10);
                                } else {
                                    compoundPaddingBottom = rect2.bottom - this.f7420l.getCompoundPaddingBottom();
                                }
                                rect3.bottom = compoundPaddingBottom;
                                int i24 = rect3.left;
                                int i25 = rect3.top;
                                int i26 = rect3.right;
                                Rect rect4 = aVar.c;
                                if (rect4.left == i24 && rect4.top == i25 && rect4.right == i26 && rect4.bottom == compoundPaddingBottom) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z14) {
                                    rect4.set(i24, i25, i26, compoundPaddingBottom);
                                    aVar.M = true;
                                }
                                aVar.h(false);
                                if (e() && !this.f7448z0) {
                                    i();
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException();
                        }
                    } else {
                        rect3.left = g(rect2.left, e10);
                        i14 = rect2.top + this.V;
                    }
                    rect3.top = i14;
                    int compoundPaddingRight = rect2.right - this.f7420l.getCompoundPaddingRight();
                    if (getPrefixText() != null && e10) {
                        i15 = (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight()) + compoundPaddingRight;
                    } else {
                        i15 = compoundPaddingRight;
                    }
                    rect3.right = i15;
                    i16 = rect3.left;
                    int i222 = rect3.top;
                    int i232 = rect3.bottom;
                    rect = aVar.f7215d;
                    if (rect.left != i16) {
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    if (this.f7420l == null) {
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int max;
        boolean z10;
        EditText editText;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f7420l;
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (editText2 != null && this.f7420l.getMeasuredHeight() < (max = Math.max(aVar.getMeasuredHeight(), this.f7416j.getMeasuredHeight()))) {
            this.f7420l.setMinimumHeight(max);
            z10 = true;
            boolean o10 = o();
            if (!z10 || o10) {
                this.f7420l.post(new c());
            }
            if (this.B != null && (editText = this.f7420l) != null) {
                this.B.setGravity(editText.getGravity());
                this.B.setPadding(this.f7420l.getCompoundPaddingLeft(), this.f7420l.getCompoundPaddingTop(), this.f7420l.getCompoundPaddingRight(), this.f7420l.getCompoundPaddingBottom());
            }
            aVar.l();
        }
        z10 = false;
        boolean o102 = o();
        if (!z10) {
        }
        this.f7420l.post(new c());
        if (this.B != null) {
            this.B.setGravity(editText.getGravity());
            this.B.setPadding(this.f7420l.getCompoundPaddingLeft(), this.f7420l.getCompoundPaddingTop(), this.f7420l.getCompoundPaddingRight(), this.f7420l.getCompoundPaddingBottom());
        }
        aVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f11358i);
        setError(iVar.f7454k);
        if (iVar.f7455l) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.S) {
            b6.c cVar = this.R.f6436e;
            RectF rectF = this.f7412g0;
            float a10 = cVar.a(rectF);
            float a11 = this.R.f6437f.a(rectF);
            float a12 = this.R.f6439h.a(rectF);
            float a13 = this.R.f6438g.a(rectF);
            k kVar = this.R;
            m0.b bVar = kVar.f6433a;
            k.a aVar = new k.a();
            m0.b bVar2 = kVar.f6434b;
            aVar.f6444a = bVar2;
            float b5 = k.a.b(bVar2);
            if (b5 != -1.0f) {
                aVar.f6447e = new b6.a(b5);
            }
            aVar.f6445b = bVar;
            float b10 = k.a.b(bVar);
            if (b10 != -1.0f) {
                aVar.f6448f = new b6.a(b10);
            }
            m0.b bVar3 = kVar.c;
            aVar.f6446d = bVar3;
            float b11 = k.a.b(bVar3);
            if (b11 != -1.0f) {
                aVar.f6450h = new b6.a(b11);
            }
            m0.b bVar4 = kVar.f6435d;
            aVar.c = bVar4;
            float b12 = k.a.b(bVar4);
            if (b12 != -1.0f) {
                aVar.f6449g = new b6.a(b12);
            }
            aVar.f6447e = new b6.a(a11);
            aVar.f6448f = new b6.a(a10);
            aVar.f6450h = new b6.a(a13);
            aVar.f6449g = new b6.a(a12);
            k kVar2 = new k(aVar);
            this.S = z10;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        i iVar = new i(super.onSaveInstanceState());
        if (l()) {
            iVar.f7454k = getError();
        }
        com.google.android.material.textfield.a aVar = this.f7418k;
        boolean z11 = true;
        if (aVar.f7463q != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !aVar.f7461o.isChecked()) {
            z11 = false;
        }
        iVar.f7455l = z11;
        return iVar;
    }

    public final void p() {
        Drawable background;
        e0 e0Var;
        int currentTextColor;
        EditText editText = this.f7420l;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = androidx.appcompat.widget.j0.f971a;
        Drawable mutate = background.mutate();
        if (l()) {
            currentTextColor = getErrorCurrentTextColors();
        } else if (!this.f7437u || (e0Var = this.f7441w) == null) {
            r2.a.a(mutate);
            this.f7420l.refreshDrawableState();
            return;
        } else {
            currentTextColor = e0Var.getCurrentTextColor();
        }
        mutate.setColorFilter(androidx.appcompat.widget.k.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void q() {
        EditText editText = this.f7420l;
        if (editText != null && this.L != null) {
            if ((this.O || editText.getBackground() == null) && this.U != 0) {
                EditText editText2 = this.f7420l;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.q(editText2, editTextBoxBackground);
                this.O = true;
            }
        }
    }

    public final void r() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f7414i;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fa, code lost:
        if (r9.f7448z0 == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        e0 e0Var;
        ColorStateList textColors;
        com.google.android.material.textfield.a aVar;
        w wVar;
        ValueAnimator valueAnimator;
        EditText editText;
        ValueAnimator valueAnimator2;
        e0 e0Var2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText2 = this.f7420l;
        if (editText2 != null && !TextUtils.isEmpty(editText2.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText3 = this.f7420l;
        if (editText3 != null && editText3.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList2 = this.f7426o0;
        com.google.android.material.internal.a aVar2 = this.A0;
        if (colorStateList2 != null) {
            aVar2.i(colorStateList2);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f7426o0;
            if (colorStateList3 != null) {
                i10 = colorStateList3.getColorForState(new int[]{-16842910}, this.f7446y0);
            } else {
                i10 = this.f7446y0;
            }
            textColors = ColorStateList.valueOf(i10);
        } else if (l()) {
            e0 e0Var3 = this.f7431r.f11504r;
            if (e0Var3 != null) {
                textColors = e0Var3.getTextColors();
            } else {
                textColors = null;
            }
        } else if (this.f7437u && (e0Var = this.f7441w) != null) {
            textColors = e0Var.getTextColors();
        } else {
            if (z13 && (colorStateList = this.f7428p0) != null && aVar2.f7225k != colorStateList) {
                aVar2.f7225k = colorStateList;
                aVar2.h(false);
            }
            aVar = this.f7418k;
            wVar = this.f7416j;
            if (!z12 && this.B0 && (!isEnabled() || !z13)) {
                if (!z11 || !this.f7448z0) {
                    valueAnimator2 = this.D0;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        this.D0.cancel();
                    }
                    if (!z10 && this.C0) {
                        a(0.0f);
                    } else {
                        aVar2.k(0.0f);
                    }
                    if (e() && (!((h6.h) this.L).F.isEmpty()) && e()) {
                        ((h6.h) this.L).w(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    this.f7448z0 = true;
                    e0Var2 = this.B;
                    if (e0Var2 != null && this.A) {
                        e0Var2.setText((CharSequence) null);
                        h4.n.a(this.f7414i, this.F);
                        this.B.setVisibility(4);
                    }
                    wVar.f11539r = true;
                    wVar.d();
                    aVar.f7472z = true;
                    aVar.m();
                    return;
                }
                return;
            }
            valueAnimator = this.D0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.D0.cancel();
            }
            if (!z10 && this.C0) {
                a(1.0f);
            } else {
                aVar2.k(1.0f);
            }
            this.f7448z0 = false;
            if (e()) {
                i();
            }
            editText = this.f7420l;
            if (editText == null) {
                editable = editText.getText();
            }
            t(editable);
            wVar.f11539r = false;
            wVar.d();
            aVar.f7472z = false;
            aVar.m();
        }
        aVar2.i(textColors);
        aVar = this.f7418k;
        wVar = this.f7416j;
        if (!z12) {
            if (!z11) {
            }
            valueAnimator2 = this.D0;
            if (valueAnimator2 != null) {
                this.D0.cancel();
            }
            if (!z10) {
            }
            aVar2.k(0.0f);
            if (e()) {
                ((h6.h) this.L).w(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f7448z0 = true;
            e0Var2 = this.B;
            if (e0Var2 != null) {
                e0Var2.setText((CharSequence) null);
                h4.n.a(this.f7414i, this.F);
                this.B.setVisibility(4);
            }
            wVar.f11539r = true;
            wVar.d();
            aVar.f7472z = true;
            aVar.m();
            return;
        }
        valueAnimator = this.D0;
        if (valueAnimator != null) {
            this.D0.cancel();
        }
        if (!z10) {
        }
        aVar2.k(1.0f);
        this.f7448z0 = false;
        if (e()) {
        }
        editText = this.f7420l;
        if (editText == null) {
        }
        t(editable);
        wVar.f11539r = false;
        wVar.d();
        aVar.f7472z = false;
        aVar.m();
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f7409d0 != i10) {
            this.f7409d0 = i10;
            this.f7438u0 = i10;
            this.f7442w0 = i10;
            this.f7444x0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(n2.a.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f7438u0 = defaultColor;
        this.f7409d0 = defaultColor;
        this.f7440v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7442w0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f7444x0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.U) {
            return;
        }
        this.U = i10;
        if (this.f7420l != null) {
            h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.V = i10;
    }

    public void setBoxCornerFamily(int i10) {
        k kVar = this.R;
        kVar.getClass();
        k.a aVar = new k.a(kVar);
        b6.c cVar = this.R.f6436e;
        m0.b v3 = ma.i.v(i10);
        aVar.f6444a = v3;
        float b5 = k.a.b(v3);
        if (b5 != -1.0f) {
            aVar.f6447e = new b6.a(b5);
        }
        aVar.f6447e = cVar;
        b6.c cVar2 = this.R.f6437f;
        m0.b v10 = ma.i.v(i10);
        aVar.f6445b = v10;
        float b10 = k.a.b(v10);
        if (b10 != -1.0f) {
            aVar.f6448f = new b6.a(b10);
        }
        aVar.f6448f = cVar2;
        b6.c cVar3 = this.R.f6439h;
        m0.b v11 = ma.i.v(i10);
        aVar.f6446d = v11;
        float b11 = k.a.b(v11);
        if (b11 != -1.0f) {
            aVar.f6450h = new b6.a(b11);
        }
        aVar.f6450h = cVar3;
        b6.c cVar4 = this.R.f6438g;
        m0.b v12 = ma.i.v(i10);
        aVar.c = v12;
        float b12 = k.a.b(v12);
        if (b12 != -1.0f) {
            aVar.f6449g = new b6.a(b12);
        }
        aVar.f6449g = cVar4;
        this.R = new k(aVar);
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f7434s0 != i10) {
            this.f7434s0 = i10;
            v();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f7434s0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            v();
        }
        this.f7430q0 = colorStateList.getDefaultColor();
        this.f7446y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7432r0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f7434s0 = defaultColor;
        v();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f7436t0 != colorStateList) {
            this.f7436t0 = colorStateList;
            v();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f7407a0 = i10;
        v();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f7408b0 = i10;
        v();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f7433s != z10) {
            Editable editable = null;
            q qVar = this.f7431r;
            if (z10) {
                e0 e0Var = new e0(getContext(), null);
                this.f7441w = e0Var;
                e0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f7413h0;
                if (typeface != null) {
                    this.f7441w.setTypeface(typeface);
                }
                this.f7441w.setMaxLines(1);
                qVar.a(this.f7441w, 2);
                m.h((ViewGroup.MarginLayoutParams) this.f7441w.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                n();
                if (this.f7441w != null) {
                    EditText editText = this.f7420l;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    m(editable);
                }
            } else {
                qVar.g(this.f7441w, 2);
                this.f7441w = null;
            }
            this.f7433s = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable text;
        if (this.f7435t != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f7435t = i10;
            if (this.f7433s && this.f7441w != null) {
                EditText editText = this.f7420l;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                m(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f7443x != i10) {
            this.f7443x = i10;
            n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            n();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f7445y != i10) {
            this.f7445y = i10;
            n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            n();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f7426o0 = colorStateList;
        this.f7428p0 = colorStateList;
        if (this.f7420l != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        j(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f7418k.f7461o.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f7418k.f7461o.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        CharSequence text = i10 != 0 ? aVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = aVar.f7461o;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        Drawable a10 = i10 != 0 ? e.a.a(aVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = aVar.f7461o;
        checkableImageButton.setImageDrawable(a10);
        if (a10 != null) {
            ColorStateList colorStateList = aVar.f7465s;
            PorterDuff.Mode mode = aVar.f7466t;
            TextInputLayout textInputLayout = aVar.f7456i;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            p.c(textInputLayout, checkableImageButton, aVar.f7465s);
        }
    }

    public void setEndIconMinSize(int i10) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (i10 >= 0) {
            if (i10 != aVar.f7467u) {
                aVar.f7467u = i10;
                CheckableImageButton checkableImageButton = aVar.f7461o;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = aVar.f7458k;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        aVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.f7418k.f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        View.OnLongClickListener onLongClickListener = aVar.f7469w;
        CheckableImageButton checkableImageButton = aVar.f7461o;
        checkableImageButton.setOnClickListener(onClickListener);
        p.e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.f7469w = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f7461o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.f7468v = scaleType;
        aVar.f7461o.setScaleType(scaleType);
        aVar.f7458k.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (aVar.f7465s != colorStateList) {
            aVar.f7465s = colorStateList;
            p.a(aVar.f7456i, aVar.f7461o, colorStateList, aVar.f7466t);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (aVar.f7466t != mode) {
            aVar.f7466t = mode;
            p.a(aVar.f7456i, aVar.f7461o, aVar.f7465s, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f7418k.g(z10);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.f7431r;
        if (!qVar.f11503q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            qVar.c();
            qVar.f11502p = charSequence;
            qVar.f11504r.setText(charSequence);
            int i10 = qVar.n;
            if (i10 != 1) {
                qVar.f11501o = 1;
            }
            qVar.i(i10, qVar.f11501o, qVar.h(qVar.f11504r, charSequence));
            return;
        }
        qVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        q qVar = this.f7431r;
        qVar.f11506t = i10;
        e0 e0Var = qVar.f11504r;
        if (e0Var != null) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.g.f(e0Var, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f7431r;
        qVar.f11505s = charSequence;
        e0 e0Var = qVar.f11504r;
        if (e0Var != null) {
            e0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.f7431r;
        if (qVar.f11503q != z10) {
            qVar.c();
            TextInputLayout textInputLayout = qVar.f11495h;
            if (z10) {
                e0 e0Var = new e0(qVar.f11494g, null);
                qVar.f11504r = e0Var;
                e0Var.setId(R.id.textinput_error);
                qVar.f11504r.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f11504r.setTypeface(typeface);
                }
                int i10 = qVar.f11507u;
                qVar.f11507u = i10;
                e0 e0Var2 = qVar.f11504r;
                if (e0Var2 != null) {
                    textInputLayout.k(e0Var2, i10);
                }
                ColorStateList colorStateList = qVar.f11508v;
                qVar.f11508v = colorStateList;
                e0 e0Var3 = qVar.f11504r;
                if (e0Var3 != null && colorStateList != null) {
                    e0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = qVar.f11505s;
                qVar.f11505s = charSequence;
                e0 e0Var4 = qVar.f11504r;
                if (e0Var4 != null) {
                    e0Var4.setContentDescription(charSequence);
                }
                int i11 = qVar.f11506t;
                qVar.f11506t = i11;
                e0 e0Var5 = qVar.f11504r;
                if (e0Var5 != null) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.g.f(e0Var5, i11);
                }
                qVar.f11504r.setVisibility(4);
                qVar.a(qVar.f11504r, 0);
            } else {
                qVar.f();
                qVar.g(qVar.f11504r, 0);
                qVar.f11504r = null;
                textInputLayout.p();
                textInputLayout.v();
            }
            qVar.f11503q = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        Drawable drawable;
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (i10 != 0) {
            drawable = e.a.a(aVar.getContext(), i10);
        } else {
            drawable = null;
        }
        aVar.h(drawable);
        p.c(aVar.f7456i, aVar.f7458k, aVar.f7459l);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f7418k.h(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        CheckableImageButton checkableImageButton = aVar.f7458k;
        View.OnLongClickListener onLongClickListener = aVar.n;
        checkableImageButton.setOnClickListener(onClickListener);
        p.e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.n = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f7458k;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (aVar.f7459l != colorStateList) {
            aVar.f7459l = colorStateList;
            p.a(aVar.f7456i, aVar.f7458k, colorStateList, aVar.f7460m);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (aVar.f7460m != mode) {
            aVar.f7460m = mode;
            p.a(aVar.f7456i, aVar.f7458k, aVar.f7459l, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        q qVar = this.f7431r;
        qVar.f11507u = i10;
        e0 e0Var = qVar.f11504r;
        if (e0Var != null) {
            qVar.f11495h.k(e0Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f7431r;
        qVar.f11508v = colorStateList;
        e0 e0Var = qVar.f11504r;
        if (e0Var != null && colorStateList != null) {
            e0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.B0 != z10) {
            this.B0 = z10;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f7431r;
        if (isEmpty) {
            if (qVar.f11510x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f11510x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f11509w = charSequence;
        qVar.f11511y.setText(charSequence);
        int i10 = qVar.n;
        if (i10 != 2) {
            qVar.f11501o = 2;
        }
        qVar.i(i10, qVar.f11501o, qVar.h(qVar.f11511y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f7431r;
        qVar.A = colorStateList;
        e0 e0Var = qVar.f11511y;
        if (e0Var != null && colorStateList != null) {
            e0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.f7431r;
        if (qVar.f11510x != z10) {
            qVar.c();
            if (z10) {
                e0 e0Var = new e0(qVar.f11494g, null);
                qVar.f11511y = e0Var;
                e0Var.setId(R.id.textinput_helper_text);
                qVar.f11511y.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f11511y.setTypeface(typeface);
                }
                qVar.f11511y.setVisibility(4);
                e0 e0Var2 = qVar.f11511y;
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.g.f(e0Var2, 1);
                int i10 = qVar.f11512z;
                qVar.f11512z = i10;
                e0 e0Var3 = qVar.f11511y;
                if (e0Var3 != null) {
                    e3.h.e(e0Var3, i10);
                }
                ColorStateList colorStateList = qVar.A;
                qVar.A = colorStateList;
                e0 e0Var4 = qVar.f11511y;
                if (e0Var4 != null && colorStateList != null) {
                    e0Var4.setTextColor(colorStateList);
                }
                qVar.a(qVar.f11511y, 1);
                qVar.f11511y.setAccessibilityDelegate(new r(qVar));
            } else {
                qVar.c();
                int i11 = qVar.n;
                if (i11 == 2) {
                    qVar.f11501o = 0;
                }
                qVar.i(i11, qVar.f11501o, qVar.h(qVar.f11511y, ""));
                qVar.g(qVar.f11511y, 1);
                qVar.f11511y = null;
                TextInputLayout textInputLayout = qVar.f11495h;
                textInputLayout.p();
                textInputLayout.v();
            }
            qVar.f11510x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        q qVar = this.f7431r;
        qVar.f11512z = i10;
        e0 e0Var = qVar.f11511y;
        if (e0Var != null) {
            e3.h.e(e0Var, i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.C0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.I) {
            this.I = z10;
            if (z10) {
                CharSequence hint = this.f7420l.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.f7420l.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.f7420l.getHint())) {
                    this.f7420l.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.f7420l != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        com.google.android.material.internal.a aVar = this.A0;
        View view = aVar.f7211a;
        x5.d dVar = new x5.d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f18642j;
        if (colorStateList != null) {
            aVar.f7225k = colorStateList;
        }
        float f10 = dVar.f18643k;
        if (f10 != 0.0f) {
            aVar.f7223i = f10;
        }
        ColorStateList colorStateList2 = dVar.f18634a;
        if (colorStateList2 != null) {
            aVar.U = colorStateList2;
        }
        aVar.S = dVar.f18637e;
        aVar.T = dVar.f18638f;
        aVar.R = dVar.f18639g;
        aVar.V = dVar.f18641i;
        x5.a aVar2 = aVar.f7238y;
        if (aVar2 != null) {
            aVar2.f18633k = true;
        }
        u5.b bVar = new u5.b(aVar);
        dVar.a();
        aVar.f7238y = new x5.a(bVar, dVar.n);
        dVar.c(view.getContext(), aVar.f7238y);
        aVar.h(false);
        this.f7428p0 = aVar.f7225k;
        if (this.f7420l != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f7428p0 != colorStateList) {
            if (this.f7426o0 == null) {
                com.google.android.material.internal.a aVar = this.A0;
                if (aVar.f7225k != colorStateList) {
                    aVar.f7225k = colorStateList;
                    aVar.h(false);
                }
            }
            this.f7428p0 = colorStateList;
            if (this.f7420l != null) {
                s(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f7439v = fVar;
    }

    public void setMaxEms(int i10) {
        this.f7425o = i10;
        EditText editText = this.f7420l;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f7429q = i10;
        EditText editText = this.f7420l;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.n = i10;
        EditText editText = this.f7420l;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f7427p = i10;
        EditText editText = this.f7420l;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.f7461o.setContentDescription(i10 != 0 ? aVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.f7461o.setImageDrawable(i10 != 0 ? e.a.a(aVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        if (z10 && aVar.f7463q != 1) {
            aVar.f(1);
        } else if (!z10) {
            aVar.f(0);
        } else {
            aVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.f7465s = colorStateList;
        p.a(aVar.f7456i, aVar.f7461o, colorStateList, aVar.f7466t);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.f7466t = mode;
        p.a(aVar.f7456i, aVar.f7461o, aVar.f7465s, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.B == null) {
            e0 e0Var = new e0(getContext(), null);
            this.B = e0Var;
            e0Var.setId(R.id.textinput_placeholder);
            e0 e0Var2 = this.B;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.s(e0Var2, 2);
            h4.d d5 = d();
            this.E = d5;
            d5.f11393j = 67L;
            this.F = d();
            setPlaceholderTextAppearance(this.D);
            setPlaceholderTextColor(this.C);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.A) {
                setPlaceholderTextEnabled(true);
            }
            this.f7447z = charSequence;
        }
        EditText editText = this.f7420l;
        if (editText != null) {
            editable = editText.getText();
        }
        t(editable);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.D = i10;
        e0 e0Var = this.B;
        if (e0Var != null) {
            e3.h.e(e0Var, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            e0 e0Var = this.B;
            if (e0Var == null || colorStateList == null) {
                return;
            }
            e0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        w wVar = this.f7416j;
        wVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        wVar.f11533k = charSequence2;
        wVar.f11532j.setText(charSequence);
        wVar.d();
    }

    public void setPrefixTextAppearance(int i10) {
        e3.h.e(this.f7416j.f11532j, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f7416j.f11532j.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        b6.g gVar = this.L;
        if (gVar != null && gVar.f6391i.f6409a != kVar) {
            this.R = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f7416j.f11534l.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f7416j.f11534l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? e.a.a(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7416j.a(drawable);
    }

    public void setStartIconMinSize(int i10) {
        w wVar = this.f7416j;
        if (i10 >= 0) {
            if (i10 != wVar.f11536o) {
                wVar.f11536o = i10;
                CheckableImageButton checkableImageButton = wVar.f11534l;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        wVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        w wVar = this.f7416j;
        View.OnLongClickListener onLongClickListener = wVar.f11538q;
        CheckableImageButton checkableImageButton = wVar.f11534l;
        checkableImageButton.setOnClickListener(onClickListener);
        p.e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        w wVar = this.f7416j;
        wVar.f11538q = onLongClickListener;
        CheckableImageButton checkableImageButton = wVar.f11534l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        w wVar = this.f7416j;
        wVar.f11537p = scaleType;
        wVar.f11534l.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        w wVar = this.f7416j;
        if (wVar.f11535m != colorStateList) {
            wVar.f11535m = colorStateList;
            p.a(wVar.f11531i, wVar.f11534l, colorStateList, wVar.n);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        w wVar = this.f7416j;
        if (wVar.n != mode) {
            wVar.n = mode;
            p.a(wVar.f11531i, wVar.f11534l, wVar.f11535m, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f7416j.b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        com.google.android.material.textfield.a aVar = this.f7418k;
        aVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        aVar.f7470x = charSequence2;
        aVar.f7471y.setText(charSequence);
        aVar.m();
    }

    public void setSuffixTextAppearance(int i10) {
        e3.h.e(this.f7418k.f7471y, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f7418k.f7471y.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f7420l;
        if (editText != null) {
            j0.p(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f7413h0) {
            this.f7413h0 = typeface;
            this.A0.m(typeface);
            q qVar = this.f7431r;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                e0 e0Var = qVar.f11504r;
                if (e0Var != null) {
                    e0Var.setTypeface(typeface);
                }
                e0 e0Var2 = qVar.f11511y;
                if (e0Var2 != null) {
                    e0Var2.setTypeface(typeface);
                }
            }
            e0 e0Var3 = this.f7441w;
            if (e0Var3 != null) {
                e0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(Editable editable) {
        int i10;
        ((androidx.activity.e) this.f7439v).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        FrameLayout frameLayout = this.f7414i;
        if (i10 == 0 && !this.f7448z0) {
            if (this.B != null && this.A && !TextUtils.isEmpty(this.f7447z)) {
                this.B.setText(this.f7447z);
                h4.n.a(frameLayout, this.E);
                this.B.setVisibility(0);
                this.B.bringToFront();
                announceForAccessibility(this.f7447z);
                return;
            }
            return;
        }
        e0 e0Var = this.B;
        if (e0Var != null && this.A) {
            e0Var.setText((CharSequence) null);
            h4.n.a(frameLayout, this.F);
            this.B.setVisibility(4);
        }
    }

    public final void u(boolean z10, boolean z11) {
        int defaultColor = this.f7436t0.getDefaultColor();
        int colorForState = this.f7436t0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f7436t0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.c0 = colorForState2;
        } else if (z11) {
            this.c0 = colorForState;
        } else {
            this.c0 = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        boolean z10;
        boolean z11;
        int i10;
        e0 e0Var;
        com.google.android.material.textfield.a aVar;
        int i11;
        int i12;
        ColorStateList valueOf;
        EditText editText;
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        EditText editText2;
        EditText editText3;
        if (this.L != null && this.U != 0) {
            boolean z12 = false;
            if (!isFocused() && ((editText3 = this.f7420l) == null || !editText3.hasFocus())) {
                z10 = false;
                if (!isHovered() && ((editText2 = this.f7420l) == null || !editText2.isHovered())) {
                    z11 = false;
                    if (!l() || (this.f7441w != null && this.f7437u)) {
                        z12 = true;
                    }
                    if (isEnabled()) {
                        i10 = this.f7446y0;
                    } else {
                        if (l()) {
                            if (this.f7436t0 == null) {
                                i10 = getErrorCurrentTextColors();
                            } else {
                                u(z10, z11);
                            }
                        } else if (this.f7437u && (e0Var = this.f7441w) != null) {
                            if (this.f7436t0 == null) {
                                i10 = e0Var.getCurrentTextColor();
                            }
                            u(z10, z11);
                        } else if (z10) {
                            i10 = this.f7434s0;
                        } else if (z11) {
                            i10 = this.f7432r0;
                        } else {
                            i10 = this.f7430q0;
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            Context context = getContext();
                            TypedValue a10 = x5.b.a(context, R.attr.colorControlActivated);
                            if (a10 != null) {
                                int i13 = a10.resourceId;
                                if (i13 != 0) {
                                    valueOf = n2.a.c(context, i13);
                                } else {
                                    int i14 = a10.data;
                                    if (i14 != 0) {
                                        valueOf = ColorStateList.valueOf(i14);
                                    }
                                }
                                editText = this.f7420l;
                                if (editText != null) {
                                    textCursorDrawable = editText.getTextCursorDrawable();
                                    if (textCursorDrawable != null && valueOf != null) {
                                        textCursorDrawable2 = this.f7420l.getTextCursorDrawable();
                                        if (z12) {
                                            ColorStateList colorStateList = this.f7436t0;
                                            if (colorStateList == null) {
                                                colorStateList = ColorStateList.valueOf(this.c0);
                                            }
                                            valueOf = colorStateList;
                                        }
                                        a.b.h(textCursorDrawable2, valueOf);
                                    }
                                }
                            }
                            valueOf = null;
                            editText = this.f7420l;
                            if (editText != null) {
                            }
                        }
                        aVar = this.f7418k;
                        aVar.k();
                        CheckableImageButton checkableImageButton = aVar.f7458k;
                        ColorStateList colorStateList2 = aVar.f7459l;
                        TextInputLayout textInputLayout = aVar.f7456i;
                        p.c(textInputLayout, checkableImageButton, colorStateList2);
                        ColorStateList colorStateList3 = aVar.f7465s;
                        CheckableImageButton checkableImageButton2 = aVar.f7461o;
                        p.c(textInputLayout, checkableImageButton2, colorStateList3);
                        if (aVar.b() instanceof h6.n) {
                            if (textInputLayout.l() && checkableImageButton2.getDrawable() != null) {
                                Drawable mutate = r2.a.g(checkableImageButton2.getDrawable()).mutate();
                                a.b.g(mutate, textInputLayout.getErrorCurrentTextColors());
                                checkableImageButton2.setImageDrawable(mutate);
                            } else {
                                p.a(textInputLayout, checkableImageButton2, aVar.f7465s, aVar.f7466t);
                            }
                        }
                        w wVar = this.f7416j;
                        p.c(wVar.f11531i, wVar.f11534l, wVar.f11535m);
                        if (this.U == 2) {
                            int i15 = this.W;
                            if (z10 && isEnabled()) {
                                i12 = this.f7408b0;
                            } else {
                                i12 = this.f7407a0;
                            }
                            this.W = i12;
                            if (i12 != i15 && e() && !this.f7448z0) {
                                if (e()) {
                                    ((h6.h) this.L).w(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                i();
                            }
                        }
                        if (this.U == 1) {
                            if (!isEnabled()) {
                                i11 = this.f7440v0;
                            } else if (z11 && !z10) {
                                i11 = this.f7444x0;
                            } else if (z10) {
                                i11 = this.f7442w0;
                            } else {
                                i11 = this.f7438u0;
                            }
                            this.f7409d0 = i11;
                        }
                        b();
                    }
                    this.c0 = i10;
                    if (Build.VERSION.SDK_INT >= 29) {
                    }
                    aVar = this.f7418k;
                    aVar.k();
                    CheckableImageButton checkableImageButton3 = aVar.f7458k;
                    ColorStateList colorStateList22 = aVar.f7459l;
                    TextInputLayout textInputLayout2 = aVar.f7456i;
                    p.c(textInputLayout2, checkableImageButton3, colorStateList22);
                    ColorStateList colorStateList32 = aVar.f7465s;
                    CheckableImageButton checkableImageButton22 = aVar.f7461o;
                    p.c(textInputLayout2, checkableImageButton22, colorStateList32);
                    if (aVar.b() instanceof h6.n) {
                    }
                    w wVar2 = this.f7416j;
                    p.c(wVar2.f11531i, wVar2.f11534l, wVar2.f11535m);
                    if (this.U == 2) {
                    }
                    if (this.U == 1) {
                    }
                    b();
                }
                z11 = true;
                if (!l()) {
                }
                z12 = true;
                if (isEnabled()) {
                }
                this.c0 = i10;
                if (Build.VERSION.SDK_INT >= 29) {
                }
                aVar = this.f7418k;
                aVar.k();
                CheckableImageButton checkableImageButton32 = aVar.f7458k;
                ColorStateList colorStateList222 = aVar.f7459l;
                TextInputLayout textInputLayout22 = aVar.f7456i;
                p.c(textInputLayout22, checkableImageButton32, colorStateList222);
                ColorStateList colorStateList322 = aVar.f7465s;
                CheckableImageButton checkableImageButton222 = aVar.f7461o;
                p.c(textInputLayout22, checkableImageButton222, colorStateList322);
                if (aVar.b() instanceof h6.n) {
                }
                w wVar22 = this.f7416j;
                p.c(wVar22.f11531i, wVar22.f11534l, wVar22.f11535m);
                if (this.U == 2) {
                }
                if (this.U == 1) {
                }
                b();
            }
            z10 = true;
            if (!isHovered()) {
                z11 = false;
                if (!l()) {
                }
                z12 = true;
                if (isEnabled()) {
                }
                this.c0 = i10;
                if (Build.VERSION.SDK_INT >= 29) {
                }
                aVar = this.f7418k;
                aVar.k();
                CheckableImageButton checkableImageButton322 = aVar.f7458k;
                ColorStateList colorStateList2222 = aVar.f7459l;
                TextInputLayout textInputLayout222 = aVar.f7456i;
                p.c(textInputLayout222, checkableImageButton322, colorStateList2222);
                ColorStateList colorStateList3222 = aVar.f7465s;
                CheckableImageButton checkableImageButton2222 = aVar.f7461o;
                p.c(textInputLayout222, checkableImageButton2222, colorStateList3222);
                if (aVar.b() instanceof h6.n) {
                }
                w wVar222 = this.f7416j;
                p.c(wVar222.f11531i, wVar222.f11534l, wVar222.f11535m);
                if (this.U == 2) {
                }
                if (this.U == 1) {
                }
                b();
            }
            z11 = true;
            if (!l()) {
            }
            z12 = true;
            if (isEnabled()) {
            }
            this.c0 = i10;
            if (Build.VERSION.SDK_INT >= 29) {
            }
            aVar = this.f7418k;
            aVar.k();
            CheckableImageButton checkableImageButton3222 = aVar.f7458k;
            ColorStateList colorStateList22222 = aVar.f7459l;
            TextInputLayout textInputLayout2222 = aVar.f7456i;
            p.c(textInputLayout2222, checkableImageButton3222, colorStateList22222);
            ColorStateList colorStateList32222 = aVar.f7465s;
            CheckableImageButton checkableImageButton22222 = aVar.f7461o;
            p.c(textInputLayout2222, checkableImageButton22222, colorStateList32222);
            if (aVar.b() instanceof h6.n) {
            }
            w wVar2222 = this.f7416j;
            p.c(wVar2222.f11531i, wVar2222.f11534l, wVar2222.f11535m);
            if (this.U == 2) {
            }
            if (this.U == 1) {
            }
            b();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f7418k.f7461o.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f7418k.f7461o.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f7418k.f7461o;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.f7418k;
        CheckableImageButton checkableImageButton = aVar.f7461o;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.f7465s;
            PorterDuff.Mode mode = aVar.f7466t;
            TextInputLayout textInputLayout = aVar.f7456i;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            p.c(textInputLayout, checkableImageButton, aVar.f7465s);
        }
    }
}
