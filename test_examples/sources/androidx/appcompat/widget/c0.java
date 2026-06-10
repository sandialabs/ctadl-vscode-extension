package androidx.appcompat.widget;

import a3.j0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import e3.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p2.f;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f880a;

    /* renamed from: b  reason: collision with root package name */
    public b1 f881b;
    public b1 c;

    /* renamed from: d  reason: collision with root package name */
    public b1 f882d;

    /* renamed from: e  reason: collision with root package name */
    public b1 f883e;

    /* renamed from: f  reason: collision with root package name */
    public b1 f884f;

    /* renamed from: g  reason: collision with root package name */
    public b1 f885g;

    /* renamed from: h  reason: collision with root package name */
    public b1 f886h;

    /* renamed from: i  reason: collision with root package name */
    public final f0 f887i;

    /* renamed from: j  reason: collision with root package name */
    public int f888j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f889k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f890l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f891m;

    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f892a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f893b;
        public final /* synthetic */ WeakReference c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f892a = i10;
            this.f893b = i11;
            this.c = weakReference;
        }

        @Override // p2.f.e
        public final void c(int i10) {
        }

        @Override // p2.f.e
        public final void d(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f892a) != -1) {
                if ((this.f893b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = f.a(typeface, i10, z10);
            }
            c0 c0Var = c0.this;
            if (c0Var.f891m) {
                c0Var.f890l = typeface;
                TextView textView = (TextView) this.c.get();
                if (textView != null) {
                    WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                    if (j0.g.b(textView)) {
                        textView.post(new d0(textView, typeface, c0Var.f888j));
                    } else {
                        textView.setTypeface(typeface, c0Var.f888j);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static LocaleList a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            Typeface create;
            create = Typeface.create(typeface, i10, z10);
            return create;
        }
    }

    public c0(TextView textView) {
        this.f880a = textView;
        this.f887i = new f0(textView);
    }

    public static b1 c(Context context, k kVar, int i10) {
        ColorStateList i11;
        synchronized (kVar) {
            i11 = kVar.f981a.i(context, i10);
        }
        if (i11 != null) {
            b1 b1Var = new b1();
            b1Var.f861d = true;
            b1Var.f859a = i11;
            return b1Var;
        }
        return null;
    }

    public final void a(Drawable drawable, b1 b1Var) {
        if (drawable == null || b1Var == null) {
            return;
        }
        k.e(drawable, b1Var, this.f880a.getDrawableState());
    }

    public final void b() {
        b1 b1Var = this.f881b;
        TextView textView = this.f880a;
        if (b1Var != null || this.c != null || this.f882d != null || this.f883e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f881b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f882d);
            a(compoundDrawables[3], this.f883e);
        }
        if (this.f884f == null && this.f885g == null) {
            return;
        }
        Drawable[] a10 = b.a(textView);
        a(a10[0], this.f884f);
        a(a10[2], this.f885g);
    }

    public final ColorStateList d() {
        b1 b1Var = this.f886h;
        if (b1Var != null) {
            return b1Var.f859a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        b1 b1Var = this.f886h;
        if (b1Var != null) {
            return b1Var.f860b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        String str;
        String str2;
        float f10;
        int i11;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Paint.FontMetricsInt fontMetricsInt;
        int d5;
        int d10;
        int d11;
        int i12;
        int resourceId;
        int i13;
        int i14;
        int i15;
        TextView textView = this.f880a;
        Context context = textView.getContext();
        k a10 = k.a();
        int[] iArr = a1.b.f48r;
        d1 m10 = d1.m(context, attributeSet, iArr, i10);
        a3.j0.o(textView, textView.getContext(), iArr, attributeSet, m10.f903b, i10, 0);
        int i16 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f881b = c(context, a10, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.c = c(context, a10, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.f882d = c(context, a10, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f883e = c(context, a10, m10.i(2, 0));
        }
        int i17 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f884f = c(context, a10, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f885g = c(context, a10, m10.i(6, 0));
        }
        m10.n();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = a1.b.H;
        if (i16 != -1) {
            d1 d1Var = new d1(context, context.obtainStyledAttributes(i16, iArr2));
            if (!z12 && d1Var.l(14)) {
                z10 = d1Var.a(14, false);
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            m(context, d1Var);
            if (i17 < 23) {
                if (d1Var.l(3)) {
                    colorStateList = d1Var.b(3);
                } else {
                    colorStateList = null;
                }
                if (d1Var.l(4)) {
                    colorStateList2 = d1Var.b(4);
                    i15 = 5;
                } else {
                    i15 = 5;
                    colorStateList2 = null;
                }
                if (d1Var.l(i15)) {
                    colorStateList3 = d1Var.b(i15);
                    i13 = 15;
                    if (!d1Var.l(i13)) {
                        str = d1Var.j(i13);
                        i14 = 26;
                    } else {
                        i14 = 26;
                        str = null;
                    }
                    if (i17 < i14 && d1Var.l(13)) {
                        str2 = d1Var.j(13);
                    } else {
                        str2 = null;
                    }
                    d1Var.n();
                }
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            i13 = 15;
            colorStateList3 = null;
            if (!d1Var.l(i13)) {
            }
            if (i17 < i14) {
            }
            str2 = null;
            d1Var.n();
        } else {
            z10 = false;
            z11 = false;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            str = null;
            str2 = null;
        }
        d1 d1Var2 = new d1(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z12 && d1Var2.l(14)) {
            z10 = d1Var2.a(14, false);
            z11 = true;
        }
        if (i17 < 23) {
            if (d1Var2.l(3)) {
                colorStateList = d1Var2.b(3);
            }
            if (d1Var2.l(4)) {
                colorStateList2 = d1Var2.b(4);
            }
            if (d1Var2.l(5)) {
                colorStateList3 = d1Var2.b(5);
            }
        }
        ColorStateList colorStateList4 = colorStateList;
        ColorStateList colorStateList5 = colorStateList2;
        ColorStateList colorStateList6 = colorStateList3;
        if (d1Var2.l(15)) {
            str = d1Var2.j(15);
        }
        String str3 = str;
        if (i17 >= 26 && d1Var2.l(13)) {
            str2 = d1Var2.j(13);
        }
        String str4 = str2;
        if (i17 >= 28 && d1Var2.l(0) && d1Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, d1Var2);
        d1Var2.n();
        if (colorStateList4 != null) {
            textView.setTextColor(colorStateList4);
        }
        if (colorStateList5 != null) {
            textView.setHintTextColor(colorStateList5);
        }
        if (colorStateList6 != null) {
            textView.setLinkTextColor(colorStateList6);
        }
        if (!z12 && z11) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f890l;
        if (typeface != null) {
            if (this.f889k == -1) {
                textView.setTypeface(typeface, this.f888j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            e.d(textView, str4);
        }
        if (str3 != null) {
            if (i17 >= 24) {
                d.b(textView, d.a(str3));
            } else {
                b.c(textView, c.a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = a1.b.f50s;
        f0 f0Var = this.f887i;
        Context context2 = f0Var.f932j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = f0Var.f931i;
        a3.j0.o(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i10, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            f0Var.f924a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f10 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f11 = obtainStyledAttributes.getDimension(2, -1.0f);
            i11 = 1;
        } else {
            i11 = 1;
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(i11)) {
            f12 = obtainStyledAttributes.getDimension(i11, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i18 = 0; i18 < length; i18++) {
                    iArr4[i18] = obtainTypedArray.getDimensionPixelSize(i18, -1);
                }
                f0Var.f928f = f0.b(iArr4);
                f0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (f0Var.i()) {
            if (f0Var.f924a == 1) {
                if (!f0Var.f929g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        i12 = 2;
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i12 = 2;
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    f0Var.j(f11, f12, f10);
                }
                f0Var.g();
            }
        } else {
            f0Var.f924a = 0;
        }
        if (n1.f1057b && f0Var.f924a != 0) {
            int[] iArr5 = f0Var.f928f;
            if (iArr5.length > 0) {
                if (e.a(textView) != -1.0f) {
                    e.b(textView, Math.round(f0Var.f926d), Math.round(f0Var.f927e), Math.round(f0Var.c), 0);
                } else {
                    e.c(textView, iArr5, 0);
                }
            }
        }
        d1 d1Var3 = new d1(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i19 = d1Var3.i(8, -1);
        if (i19 != -1) {
            drawable = a10.b(context, i19);
        } else {
            drawable = null;
        }
        int i20 = d1Var3.i(13, -1);
        if (i20 != -1) {
            drawable2 = a10.b(context, i20);
        } else {
            drawable2 = null;
        }
        int i21 = d1Var3.i(9, -1);
        if (i21 != -1) {
            drawable3 = a10.b(context, i21);
        } else {
            drawable3 = null;
        }
        int i22 = d1Var3.i(6, -1);
        if (i22 != -1) {
            drawable4 = a10.b(context, i22);
        } else {
            drawable4 = null;
        }
        int i23 = d1Var3.i(10, -1);
        if (i23 != -1) {
            drawable5 = a10.b(context, i23);
        } else {
            drawable5 = null;
        }
        int i24 = d1Var3.i(7, -1);
        if (i24 != -1) {
            drawable6 = a10.b(context, i24);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a11 = b.a(textView);
                Drawable drawable7 = a11[0];
                if (drawable7 == null && a11[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                }
                drawable2 = a11[1];
                Drawable drawable8 = a11[2];
                if (drawable4 == null) {
                    drawable4 = a11[3];
                }
                b.b(textView, drawable7, drawable2, drawable8, drawable4);
            }
            if (d1Var3.l(11)) {
                ColorStateList b5 = d1Var3.b(11);
                if (Build.VERSION.SDK_INT >= 24) {
                    h.c.f(textView, b5);
                } else if (textView instanceof e3.m) {
                    ((e3.m) textView).setSupportCompoundDrawablesTintList(b5);
                }
            }
            if (!d1Var3.l(12)) {
                fontMetricsInt = null;
                PorterDuff.Mode d12 = j0.d(d1Var3.h(12, -1), null);
                if (Build.VERSION.SDK_INT >= 24) {
                    h.c.g(textView, d12);
                } else if (textView instanceof e3.m) {
                    ((e3.m) textView).setSupportCompoundDrawablesTintMode(d12);
                }
            } else {
                fontMetricsInt = null;
            }
            d5 = d1Var3.d(15, -1);
            d10 = d1Var3.d(18, -1);
            d11 = d1Var3.d(19, -1);
            d1Var3.n();
            if (d5 != -1) {
                e3.h.b(textView, d5);
            }
            if (d10 != -1) {
                e3.h.c(textView, d10);
            }
            if (d11 == -1) {
                v8.b.l(d11);
                int fontMetricsInt2 = textView.getPaint().getFontMetricsInt(fontMetricsInt);
                if (d11 != fontMetricsInt2) {
                    textView.setLineSpacing(d11 - fontMetricsInt2, 1.0f);
                    return;
                }
                return;
            }
            return;
        }
        Drawable[] a12 = b.a(textView);
        if (drawable5 == null) {
            drawable5 = a12[0];
        }
        if (drawable2 == null) {
            drawable2 = a12[1];
        }
        if (drawable6 == null) {
            drawable6 = a12[2];
        }
        if (drawable4 == null) {
            drawable4 = a12[3];
        }
        b.b(textView, drawable5, drawable2, drawable6, drawable4);
        if (d1Var3.l(11)) {
        }
        if (!d1Var3.l(12)) {
        }
        d5 = d1Var3.d(15, -1);
        d10 = d1Var3.d(18, -1);
        d11 = d1Var3.d(19, -1);
        d1Var3.n();
        if (d5 != -1) {
        }
        if (d10 != -1) {
        }
        if (d11 == -1) {
        }
    }

    public final void g(Context context, int i10) {
        String j2;
        ColorStateList b5;
        ColorStateList b10;
        ColorStateList b11;
        d1 d1Var = new d1(context, context.obtainStyledAttributes(i10, a1.b.H));
        boolean l2 = d1Var.l(14);
        TextView textView = this.f880a;
        if (l2) {
            textView.setAllCaps(d1Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (d1Var.l(3) && (b11 = d1Var.b(3)) != null) {
                textView.setTextColor(b11);
            }
            if (d1Var.l(5) && (b10 = d1Var.b(5)) != null) {
                textView.setLinkTextColor(b10);
            }
            if (d1Var.l(4) && (b5 = d1Var.b(4)) != null) {
                textView.setHintTextColor(b5);
            }
        }
        if (d1Var.l(0) && d1Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, d1Var);
        if (i11 >= 26 && d1Var.l(13) && (j2 = d1Var.j(13)) != null) {
            e.d(textView, j2);
        }
        d1Var.n();
        Typeface typeface = this.f890l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f888j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        f0 f0Var = this.f887i;
        if (f0Var.i()) {
            DisplayMetrics displayMetrics = f0Var.f932j.getResources().getDisplayMetrics();
            f0Var.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (f0Var.g()) {
                f0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) {
        f0 f0Var = this.f887i;
        if (f0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = f0Var.f932j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                f0Var.f928f = f0.b(iArr2);
                if (!f0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                f0Var.f929g = false;
            }
            if (f0Var.g()) {
                f0Var.a();
            }
        }
    }

    public final void j(int i10) {
        f0 f0Var = this.f887i;
        if (f0Var.i()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = f0Var.f932j.getResources().getDisplayMetrics();
                    f0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (f0Var.g()) {
                        f0Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(androidx.activity.e.g("Unknown auto-size text type: ", i10));
            }
            f0Var.f924a = 0;
            f0Var.f926d = -1.0f;
            f0Var.f927e = -1.0f;
            f0Var.c = -1.0f;
            f0Var.f928f = new int[0];
            f0Var.f925b = false;
        }
    }

    public final void k(ColorStateList colorStateList) {
        boolean z10;
        if (this.f886h == null) {
            this.f886h = new b1();
        }
        b1 b1Var = this.f886h;
        b1Var.f859a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var.f861d = z10;
        this.f881b = b1Var;
        this.c = b1Var;
        this.f882d = b1Var;
        this.f883e = b1Var;
        this.f884f = b1Var;
        this.f885g = b1Var;
    }

    public final void l(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f886h == null) {
            this.f886h = new b1();
        }
        b1 b1Var = this.f886h;
        b1Var.f860b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var.c = z10;
        this.f881b = b1Var;
        this.c = b1Var;
        this.f882d = b1Var;
        this.f883e = b1Var;
        this.f884f = b1Var;
        this.f885g = b1Var;
    }

    public final void m(Context context, d1 d1Var) {
        String j2;
        Typeface create;
        Typeface typeface;
        this.f888j = d1Var.h(2, this.f888j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int h10 = d1Var.h(11, -1);
            this.f889k = h10;
            if (h10 != -1) {
                this.f888j = (this.f888j & 2) | 0;
            }
        }
        if (!d1Var.l(10) && !d1Var.l(12)) {
            if (d1Var.l(1)) {
                this.f891m = false;
                int h11 = d1Var.h(1, 1);
                if (h11 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (h11 == 2) {
                    typeface = Typeface.SERIF;
                } else if (h11 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f890l = typeface;
                return;
            }
            return;
        }
        this.f890l = null;
        int i11 = d1Var.l(12) ? 12 : 10;
        int i12 = this.f889k;
        int i13 = this.f888j;
        if (!context.isRestricted()) {
            try {
                Typeface g10 = d1Var.g(i11, this.f888j, new a(i12, i13, new WeakReference(this.f880a)));
                if (g10 != null) {
                    if (i10 >= 28 && this.f889k != -1) {
                        g10 = f.a(Typeface.create(g10, 0), this.f889k, (this.f888j & 2) != 0);
                    }
                    this.f890l = g10;
                }
                this.f891m = this.f890l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f890l != null || (j2 = d1Var.j(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f889k == -1) {
            create = Typeface.create(j2, this.f888j);
        } else {
            create = f.a(Typeface.create(j2, 0), this.f889k, (this.f888j & 2) != 0);
        }
        this.f890l = create;
    }
}
