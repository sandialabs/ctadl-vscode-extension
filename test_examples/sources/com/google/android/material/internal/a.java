package com.google.android.material.internal;

import a3.j0;
import a3.v0;
import a4.b;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.WeakHashMap;
import y2.f;

/* loaded from: classes.dex */
public final class a {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f7211a;

    /* renamed from: a0  reason: collision with root package name */
    public float f7212a0;

    /* renamed from: b  reason: collision with root package name */
    public float f7213b;

    /* renamed from: b0  reason: collision with root package name */
    public float f7214b0;
    public final Rect c;
    public CharSequence c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f7215d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f7217e;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f7224j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f7225k;

    /* renamed from: l  reason: collision with root package name */
    public float f7226l;

    /* renamed from: m  reason: collision with root package name */
    public float f7227m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f7228o;

    /* renamed from: p  reason: collision with root package name */
    public float f7229p;

    /* renamed from: q  reason: collision with root package name */
    public float f7230q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f7231r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f7232s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f7233t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f7234u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f7235v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f7236w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f7237x;

    /* renamed from: y  reason: collision with root package name */
    public x5.a f7238y;

    /* renamed from: f  reason: collision with root package name */
    public int f7219f = 16;

    /* renamed from: g  reason: collision with root package name */
    public int f7221g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f7222h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f7223i = 15.0f;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f7239z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* renamed from: d0  reason: collision with root package name */
    public final int f7216d0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public final float f7218e0 = 1.0f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f7220f0 = StaticLayoutBuilderCompat.f7196m;

    public a(View view) {
        this.f7211a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f7215d = new Rect();
        this.c = new Rect();
        this.f7217e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = e5.a.f10647a;
        return b.f(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        f.d dVar;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        boolean z10 = true;
        if (j0.e.d(this.f7211a) != 1) {
            z10 = false;
        }
        if (this.D) {
            if (z10) {
                dVar = f.f18805d;
            } else {
                dVar = f.c;
            }
            return dVar.b(charSequence, charSequence.length());
        }
        return z10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:43|(8:47|(1:49)(1:72)|50|(1:52)(2:58|(2:60|(3:62|(2:64|65)|66)(1:67))(1:69))|53|54|55|56)|73|(0)(0)|50|(0)(0)|53|54|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010c, code lost:
        if (r12.C != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0139, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013a, code lost:
        android.util.Log.e("CollapsingTextHelper", r13.getCause().getMessage(), r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5 A[Catch: StaticLayoutBuilderCompatException -> 0x0139, TRY_ENTER, TryCatch #0 {StaticLayoutBuilderCompatException -> 0x0139, blocks: (B:75:0x00f5, B:88:0x0116, B:76:0x00f8, B:80:0x0105, B:86:0x0111, B:85:0x010e, B:83:0x010a, B:87:0x0114), top: B:94:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8 A[Catch: StaticLayoutBuilderCompatException -> 0x0139, TryCatch #0 {StaticLayoutBuilderCompatException -> 0x0139, blocks: (B:75:0x00f5, B:88:0x0116, B:76:0x00f8, B:80:0x0105, B:86:0x0111, B:85:0x010e, B:83:0x010a, B:87:0x0114), top: B:94:0x00f3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(float f10, boolean z10) {
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        Typeface typeface;
        boolean z13;
        boolean z14;
        Layout.Alignment alignment;
        boolean z15;
        boolean z16;
        boolean z17;
        StaticLayout staticLayout;
        boolean z18;
        boolean z19;
        if (this.A == null) {
            return;
        }
        float width = this.f7215d.width();
        float width2 = this.c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f11 = this.f7223i;
            f12 = this.V;
            this.F = 1.0f;
            typeface = this.f7231r;
        } else {
            float f13 = this.f7222h;
            float f14 = this.W;
            Typeface typeface2 = this.f7234u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f7222h, this.f7223i, f10, this.Q) / this.f7222h;
            }
            float f15 = this.f7223i / this.f7222h;
            float f16 = width2 * f15;
            if (!z10 && f16 > width) {
                width = Math.min(width / f15, width2);
                f11 = f13;
                f12 = f14;
                typeface = typeface2;
            }
            width = width2;
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (width > 0.0f) {
            if (this.G != f11) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.X != f12) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.f7237x != typeface) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.Y != null && width != staticLayout.getWidth()) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z15 && !z16 && !z18 && !z17 && !this.M) {
                z13 = false;
                this.G = f11;
                this.X = f12;
                this.f7237x = typeface;
                this.M = false;
                if (this.F == 1.0f) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                textPaint.setLinearText(z19);
            }
            z13 = true;
            this.G = f11;
            this.X = f12;
            this.f7237x = typeface;
            this.M = false;
            if (this.F == 1.0f) {
            }
            textPaint.setLinearText(z19);
        } else {
            z13 = false;
        }
        if (this.B == null || z13) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f7237x);
            textPaint.setLetterSpacing(this.X);
            boolean b5 = b(this.A);
            this.C = b5;
            int i10 = this.f7216d0;
            if (i10 > 1 && !b5) {
                z14 = true;
                if (z14) {
                    i10 = 1;
                }
                if (i10 != 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f7219f, b5 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.C) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat((int) width, textPaint, this.A);
                staticLayoutBuilderCompat.f7209l = this.f7239z;
                staticLayoutBuilderCompat.f7208k = b5;
                staticLayoutBuilderCompat.f7202e = alignment;
                staticLayoutBuilderCompat.f7207j = false;
                staticLayoutBuilderCompat.f7203f = i10;
                float f17 = this.f7218e0;
                staticLayoutBuilderCompat.f7204g = 0.0f;
                staticLayoutBuilderCompat.f7205h = f17;
                staticLayoutBuilderCompat.f7206i = this.f7220f0;
                StaticLayout staticLayout2 = staticLayoutBuilderCompat.a();
                staticLayout2.getClass();
                this.Y = staticLayout2;
                this.B = staticLayout2.getText();
            }
            z14 = false;
            if (z14) {
            }
            if (i10 != 1) {
            }
            StaticLayoutBuilderCompat staticLayoutBuilderCompat2 = new StaticLayoutBuilderCompat((int) width, textPaint, this.A);
            staticLayoutBuilderCompat2.f7209l = this.f7239z;
            staticLayoutBuilderCompat2.f7208k = b5;
            staticLayoutBuilderCompat2.f7202e = alignment;
            staticLayoutBuilderCompat2.f7207j = false;
            staticLayoutBuilderCompat2.f7203f = i10;
            float f172 = this.f7218e0;
            staticLayoutBuilderCompat2.f7204g = 0.0f;
            staticLayoutBuilderCompat2.f7205h = f172;
            staticLayoutBuilderCompat2.f7206i = this.f7220f0;
            StaticLayout staticLayout22 = staticLayoutBuilderCompat2.a();
            staticLayout22.getClass();
            this.Y = staticLayout22;
            this.B = staticLayout22.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f7223i);
        textPaint.setTypeface(this.f7231r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f7233t;
            if (typeface != null) {
                this.f7232s = x5.f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f7236w;
            if (typeface2 != null) {
                this.f7235v = x5.f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f7232s;
            if (typeface3 == null) {
                typeface3 = this.f7233t;
            }
            this.f7231r = typeface3;
            Typeface typeface4 = this.f7235v;
            if (typeface4 == null) {
                typeface4 = this.f7236w;
            }
            this.f7234u = typeface4;
            h(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z10) {
        float centerX;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float f12;
        StaticLayout staticLayout2;
        CharSequence charSequence;
        float f13;
        StaticLayout staticLayout3;
        int i10;
        float f14;
        int i11;
        float centerX2;
        float f15;
        Bitmap bitmap;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        int e10;
        float f16;
        float f17;
        float ascent;
        StaticLayout staticLayout4;
        View view = this.f7211a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z10) {
            c(1.0f, z10);
            CharSequence charSequence2 = this.B;
            TextPaint textPaint = this.N;
            if (charSequence2 != null && (staticLayout4 = this.Y) != null) {
                this.c0 = TextUtils.ellipsize(charSequence2, textPaint, staticLayout4.getWidth(), this.f7239z);
            }
            CharSequence charSequence3 = this.c0;
            if (charSequence3 != null) {
                this.Z = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f7221g, this.C ? 1 : 0);
            int i12 = absoluteGravity & 112;
            Rect rect = this.f7215d;
            if (i12 != 48) {
                if (i12 != 80) {
                    ascent = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    ascent = textPaint.ascent() + rect.bottom;
                }
                this.f7227m = ascent;
            } else {
                this.f7227m = rect.top;
            }
            int i13 = absoluteGravity & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    f11 = rect.left;
                    this.f7228o = f11;
                    c(0.0f, z10);
                    staticLayout = this.Y;
                    if (staticLayout == null) {
                        f12 = staticLayout.getHeight();
                    } else {
                        f12 = 0.0f;
                    }
                    staticLayout2 = this.Y;
                    if (staticLayout2 == null && this.f7216d0 > 1) {
                        f13 = staticLayout2.getWidth();
                    } else {
                        charSequence = this.B;
                        if (charSequence == null) {
                            f13 = textPaint.measureText(charSequence, 0, charSequence.length());
                        } else {
                            f13 = 0.0f;
                        }
                    }
                    staticLayout3 = this.Y;
                    if (staticLayout3 != null) {
                        staticLayout3.getLineCount();
                    }
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f7219f, this.C ? 1 : 0);
                    i10 = absoluteGravity2 & 112;
                    Rect rect2 = this.c;
                    if (i10 == 48) {
                        if (i10 != 80) {
                            this.f7226l = rect2.centerY() - (f12 / 2.0f);
                            i11 = absoluteGravity2 & 8388615;
                            if (i11 != 1) {
                                if (i11 != 5) {
                                    f15 = rect2.left;
                                    this.n = f15;
                                    bitmap = this.E;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        this.E = null;
                                    }
                                    l(this.f7213b);
                                    float f18 = this.f7213b;
                                    float f19 = f(rect2.left, rect.left, f18, this.P);
                                    RectF rectF = this.f7217e;
                                    rectF.left = f19;
                                    rectF.top = f(this.f7226l, this.f7227m, f18, this.P);
                                    rectF.right = f(rect2.right, rect.right, f18, this.P);
                                    rectF.bottom = f(rect2.bottom, rect.bottom, f18, this.P);
                                    this.f7229p = f(this.n, this.f7228o, f18, this.P);
                                    this.f7230q = f(this.f7226l, this.f7227m, f18, this.P);
                                    l(f18);
                                    s3.b bVar = e5.a.f10648b;
                                    this.f7212a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f18, bVar);
                                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                    j0.d.k(view);
                                    this.f7214b0 = f(1.0f, 0.0f, f18, bVar);
                                    j0.d.k(view);
                                    colorStateList = this.f7225k;
                                    colorStateList2 = this.f7224j;
                                    if (colorStateList == colorStateList2) {
                                        e10 = a(f18, e(colorStateList2), e(this.f7225k));
                                    } else {
                                        e10 = e(colorStateList);
                                    }
                                    textPaint.setColor(e10);
                                    f16 = this.V;
                                    f17 = this.W;
                                    if (f16 != f17) {
                                        f16 = f(f17, f16, f18, bVar);
                                    }
                                    textPaint.setLetterSpacing(f16);
                                    this.H = f(0.0f, this.R, f18, null);
                                    this.I = f(0.0f, this.S, f18, null);
                                    this.J = f(0.0f, this.T, f18, null);
                                    int a10 = a(f18, e(null), e(this.U));
                                    this.K = a10;
                                    textPaint.setShadowLayer(this.H, this.I, this.J, a10);
                                    j0.d.k(view);
                                }
                                centerX2 = rect2.right;
                            } else {
                                centerX2 = rect2.centerX();
                                f13 /= 2.0f;
                            }
                            f15 = centerX2 - f13;
                            this.n = f15;
                            bitmap = this.E;
                            if (bitmap != null) {
                            }
                            l(this.f7213b);
                            float f182 = this.f7213b;
                            float f192 = f(rect2.left, rect.left, f182, this.P);
                            RectF rectF2 = this.f7217e;
                            rectF2.left = f192;
                            rectF2.top = f(this.f7226l, this.f7227m, f182, this.P);
                            rectF2.right = f(rect2.right, rect.right, f182, this.P);
                            rectF2.bottom = f(rect2.bottom, rect.bottom, f182, this.P);
                            this.f7229p = f(this.n, this.f7228o, f182, this.P);
                            this.f7230q = f(this.f7226l, this.f7227m, f182, this.P);
                            l(f182);
                            s3.b bVar2 = e5.a.f10648b;
                            this.f7212a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f182, bVar2);
                            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                            j0.d.k(view);
                            this.f7214b0 = f(1.0f, 0.0f, f182, bVar2);
                            j0.d.k(view);
                            colorStateList = this.f7225k;
                            colorStateList2 = this.f7224j;
                            if (colorStateList == colorStateList2) {
                            }
                            textPaint.setColor(e10);
                            f16 = this.V;
                            f17 = this.W;
                            if (f16 != f17) {
                            }
                            textPaint.setLetterSpacing(f16);
                            this.H = f(0.0f, this.R, f182, null);
                            this.I = f(0.0f, this.S, f182, null);
                            this.J = f(0.0f, this.T, f182, null);
                            int a102 = a(f182, e(null), e(this.U));
                            this.K = a102;
                            textPaint.setShadowLayer(this.H, this.I, this.J, a102);
                            j0.d.k(view);
                        }
                        f14 = textPaint.descent() + (rect2.bottom - f12);
                    } else {
                        f14 = rect2.top;
                    }
                    this.f7226l = f14;
                    i11 = absoluteGravity2 & 8388615;
                    if (i11 != 1) {
                    }
                    f15 = centerX2 - f13;
                    this.n = f15;
                    bitmap = this.E;
                    if (bitmap != null) {
                    }
                    l(this.f7213b);
                    float f1822 = this.f7213b;
                    float f1922 = f(rect2.left, rect.left, f1822, this.P);
                    RectF rectF22 = this.f7217e;
                    rectF22.left = f1922;
                    rectF22.top = f(this.f7226l, this.f7227m, f1822, this.P);
                    rectF22.right = f(rect2.right, rect.right, f1822, this.P);
                    rectF22.bottom = f(rect2.bottom, rect.bottom, f1822, this.P);
                    this.f7229p = f(this.n, this.f7228o, f1822, this.P);
                    this.f7230q = f(this.f7226l, this.f7227m, f1822, this.P);
                    l(f1822);
                    s3.b bVar22 = e5.a.f10648b;
                    this.f7212a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f1822, bVar22);
                    WeakHashMap<View, v0> weakHashMap22 = j0.f188a;
                    j0.d.k(view);
                    this.f7214b0 = f(1.0f, 0.0f, f1822, bVar22);
                    j0.d.k(view);
                    colorStateList = this.f7225k;
                    colorStateList2 = this.f7224j;
                    if (colorStateList == colorStateList2) {
                    }
                    textPaint.setColor(e10);
                    f16 = this.V;
                    f17 = this.W;
                    if (f16 != f17) {
                    }
                    textPaint.setLetterSpacing(f16);
                    this.H = f(0.0f, this.R, f1822, null);
                    this.I = f(0.0f, this.S, f1822, null);
                    this.J = f(0.0f, this.T, f1822, null);
                    int a1022 = a(f1822, e(null), e(this.U));
                    this.K = a1022;
                    textPaint.setShadowLayer(this.H, this.I, this.J, a1022);
                    j0.d.k(view);
                }
                centerX = rect.right;
                f10 = this.Z;
            } else {
                centerX = rect.centerX();
                f10 = this.Z / 2.0f;
            }
            f11 = centerX - f10;
            this.f7228o = f11;
            c(0.0f, z10);
            staticLayout = this.Y;
            if (staticLayout == null) {
            }
            staticLayout2 = this.Y;
            if (staticLayout2 == null) {
            }
            charSequence = this.B;
            if (charSequence == null) {
            }
            staticLayout3 = this.Y;
            if (staticLayout3 != null) {
            }
            int absoluteGravity22 = Gravity.getAbsoluteGravity(this.f7219f, this.C ? 1 : 0);
            i10 = absoluteGravity22 & 112;
            Rect rect22 = this.c;
            if (i10 == 48) {
            }
            this.f7226l = f14;
            i11 = absoluteGravity22 & 8388615;
            if (i11 != 1) {
            }
            f15 = centerX2 - f13;
            this.n = f15;
            bitmap = this.E;
            if (bitmap != null) {
            }
            l(this.f7213b);
            float f18222 = this.f7213b;
            float f19222 = f(rect22.left, rect.left, f18222, this.P);
            RectF rectF222 = this.f7217e;
            rectF222.left = f19222;
            rectF222.top = f(this.f7226l, this.f7227m, f18222, this.P);
            rectF222.right = f(rect22.right, rect.right, f18222, this.P);
            rectF222.bottom = f(rect22.bottom, rect.bottom, f18222, this.P);
            this.f7229p = f(this.n, this.f7228o, f18222, this.P);
            this.f7230q = f(this.f7226l, this.f7227m, f18222, this.P);
            l(f18222);
            s3.b bVar222 = e5.a.f10648b;
            this.f7212a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f18222, bVar222);
            WeakHashMap<View, v0> weakHashMap222 = j0.f188a;
            j0.d.k(view);
            this.f7214b0 = f(1.0f, 0.0f, f18222, bVar222);
            j0.d.k(view);
            colorStateList = this.f7225k;
            colorStateList2 = this.f7224j;
            if (colorStateList == colorStateList2) {
            }
            textPaint.setColor(e10);
            f16 = this.V;
            f17 = this.W;
            if (f16 != f17) {
            }
            textPaint.setLetterSpacing(f16);
            this.H = f(0.0f, this.R, f18222, null);
            this.I = f(0.0f, this.S, f18222, null);
            this.J = f(0.0f, this.T, f18222, null);
            int a10222 = a(f18222, e(null), e(this.U));
            this.K = a10222;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10222);
            j0.d.k(view);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f7225k != colorStateList || this.f7224j != colorStateList) {
            this.f7225k = colorStateList;
            this.f7224j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        x5.a aVar = this.f7238y;
        if (aVar != null) {
            aVar.f18633k = true;
        }
        if (this.f7233t != typeface) {
            this.f7233t = typeface;
            Typeface a10 = x5.f.a(this.f7211a.getContext().getResources().getConfiguration(), typeface);
            this.f7232s = a10;
            if (a10 == null) {
                a10 = this.f7233t;
            }
            this.f7231r = a10;
            return true;
        }
        return false;
    }

    public final void k(float f10) {
        int e10;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f7213b) {
            this.f7213b = f10;
            Rect rect = this.c;
            Rect rect2 = this.f7215d;
            float f11 = f(rect.left, rect2.left, f10, this.P);
            RectF rectF = this.f7217e;
            rectF.left = f11;
            rectF.top = f(this.f7226l, this.f7227m, f10, this.P);
            rectF.right = f(rect.right, rect2.right, f10, this.P);
            rectF.bottom = f(rect.bottom, rect2.bottom, f10, this.P);
            this.f7229p = f(this.n, this.f7228o, f10, this.P);
            this.f7230q = f(this.f7226l, this.f7227m, f10, this.P);
            l(f10);
            s3.b bVar = e5.a.f10648b;
            this.f7212a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            View view = this.f7211a;
            j0.d.k(view);
            this.f7214b0 = f(1.0f, 0.0f, f10, bVar);
            j0.d.k(view);
            ColorStateList colorStateList = this.f7225k;
            ColorStateList colorStateList2 = this.f7224j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                e10 = a(f10, e(colorStateList2), e(this.f7225k));
            } else {
                e10 = e(colorStateList);
            }
            textPaint.setColor(e10);
            float f12 = this.V;
            float f13 = this.W;
            if (f12 != f13) {
                f12 = f(f13, f12, f10, bVar);
            }
            textPaint.setLetterSpacing(f12);
            this.H = f(0.0f, this.R, f10, null);
            this.I = f(0.0f, this.S, f10, null);
            this.J = f(0.0f, this.T, f10, null);
            int a10 = a(f10, e(null), e(this.U));
            this.K = a10;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10);
            j0.d.k(view);
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.k(this.f7211a);
    }

    public final void m(Typeface typeface) {
        boolean z10;
        boolean j2 = j(typeface);
        if (this.f7236w != typeface) {
            this.f7236w = typeface;
            Typeface a10 = x5.f.a(this.f7211a.getContext().getResources().getConfiguration(), typeface);
            this.f7235v = a10;
            if (a10 == null) {
                a10 = this.f7236w;
            }
            this.f7234u = a10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (j2 || z10) {
            h(false);
        }
    }
}
