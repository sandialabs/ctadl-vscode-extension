package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import b6.g;
import b6.l;
import com.noto.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import r2.a;
import r2.c;
import u5.h;
import u5.n;
import x5.d;
import y5.b;

/* loaded from: classes.dex */
public final class a extends g implements Drawable.Callback, h.b {
    public static final int[] O0 = {16842910};
    public static final ShapeDrawable P0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public ColorFilter C0;
    public PorterDuffColorFilter D0;
    public ColorStateList E0;
    public ColorStateList F;
    public PorterDuff.Mode F0;
    public ColorStateList G;
    public int[] G0;
    public float H;
    public boolean H0;
    public float I;
    public ColorStateList I0;
    public ColorStateList J;
    public WeakReference<InterfaceC0060a> J0;
    public float K;
    public TextUtils.TruncateAt K0;
    public ColorStateList L;
    public boolean L0;
    public CharSequence M;
    public int M0;
    public boolean N;
    public boolean N0;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public RippleDrawable U;
    public ColorStateList V;
    public float W;
    public SpannableStringBuilder X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f6988a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f6989b0;
    public e5.g c0;

    /* renamed from: d0  reason: collision with root package name */
    public e5.g f6990d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f6991e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f6992f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f6993g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f6994h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f6995i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f6996j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f6997k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f6998l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Context f6999m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Paint f7000n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Paint.FontMetrics f7001o0;

    /* renamed from: p0  reason: collision with root package name */
    public final RectF f7002p0;

    /* renamed from: q0  reason: collision with root package name */
    public final PointF f7003q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Path f7004r0;

    /* renamed from: s0  reason: collision with root package name */
    public final h f7005s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f7006t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f7007u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f7008v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f7009w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f7010x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f7011y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f7012z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0060a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132083749);
        this.I = -1.0f;
        this.f7000n0 = new Paint(1);
        this.f7001o0 = new Paint.FontMetrics();
        this.f7002p0 = new RectF();
        this.f7003q0 = new PointF();
        this.f7004r0 = new Path();
        this.B0 = 255;
        this.F0 = PorterDuff.Mode.SRC_IN;
        this.J0 = new WeakReference<>(null);
        k(context);
        this.f6999m0 = context;
        h hVar = new h(this);
        this.f7005s0 = hVar;
        this.M = "";
        hVar.f17815a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = O0;
        setState(iArr);
        if (!Arrays.equals(this.G0, iArr)) {
            this.G0 = iArr;
            if (b0()) {
                E(getState(), iArr);
            }
        }
        this.L0 = true;
        int[] iArr2 = b.f18890a;
        P0.setTint(-1);
    }

    public static boolean B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void c0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        return this.N0 ? j() : this.I;
    }

    public final void D() {
        InterfaceC0060a interfaceC0060a = this.J0.get();
        if (interfaceC0060a != null) {
            interfaceC0060a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        ColorStateList colorStateList;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList2;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList3 = this.F;
        if (colorStateList3 != null) {
            i10 = colorStateList3.getColorForState(iArr, this.f7006t0);
        } else {
            i10 = 0;
        }
        int d5 = d(i10);
        boolean z15 = true;
        if (this.f7006t0 != d5) {
            this.f7006t0 = d5;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.G;
        if (colorStateList4 != null) {
            i11 = colorStateList4.getColorForState(iArr, this.f7007u0);
        } else {
            i11 = 0;
        }
        int d10 = d(i11);
        if (this.f7007u0 != d10) {
            this.f7007u0 = d10;
            onStateChange = true;
        }
        int b5 = q2.a.b(d10, d5);
        if (this.f7008v0 != b5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6391i.c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.f7008v0 = b5;
            n(ColorStateList.valueOf(b5));
            onStateChange = true;
        }
        ColorStateList colorStateList5 = this.J;
        if (colorStateList5 != null) {
            i12 = colorStateList5.getColorForState(iArr, this.f7009w0);
        } else {
            i12 = 0;
        }
        if (this.f7009w0 != i12) {
            this.f7009w0 = i12;
            onStateChange = true;
        }
        if (this.I0 != null && b.c(iArr)) {
            i13 = this.I0.getColorForState(iArr, this.f7010x0);
        } else {
            i13 = 0;
        }
        if (this.f7010x0 != i13) {
            this.f7010x0 = i13;
            if (this.H0) {
                onStateChange = true;
            }
        }
        d dVar = this.f7005s0.f17819f;
        if (dVar != null && (colorStateList2 = dVar.f18642j) != null) {
            i14 = colorStateList2.getColorForState(iArr, this.f7011y0);
        } else {
            i14 = 0;
        }
        if (this.f7011y0 != i14) {
            this.f7011y0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i16 : state) {
                if (i16 == 16842912) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12 && this.Y) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f7012z0 != z13 && this.f6988a0 != null) {
            float y10 = y();
            this.f7012z0 = z13;
            if (y10 != y()) {
                onStateChange = true;
                z14 = true;
                colorStateList = this.E0;
                if (colorStateList == null) {
                    i15 = colorStateList.getColorForState(iArr, this.A0);
                } else {
                    i15 = 0;
                }
                if (this.A0 == i15) {
                    this.A0 = i15;
                    ColorStateList colorStateList6 = this.E0;
                    PorterDuff.Mode mode = this.F0;
                    if (colorStateList6 != null && mode != null) {
                        porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                        this.D0 = porterDuffColorFilter;
                    }
                    porterDuffColorFilter = null;
                    this.D0 = porterDuffColorFilter;
                } else {
                    z15 = onStateChange;
                }
                if (C(this.O)) {
                    z15 |= this.O.setState(iArr);
                }
                if (C(this.f6988a0)) {
                    z15 |= this.f6988a0.setState(iArr);
                }
                if (C(this.T)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z15 |= this.T.setState(iArr3);
                }
                int[] iArr4 = b.f18890a;
                if (C(this.U)) {
                    z15 |= this.U.setState(iArr2);
                }
                if (z15) {
                    invalidateSelf();
                }
                if (z14) {
                    D();
                }
                return z15;
            }
            onStateChange = true;
        }
        z14 = false;
        colorStateList = this.E0;
        if (colorStateList == null) {
        }
        if (this.A0 == i15) {
        }
        if (C(this.O)) {
        }
        if (C(this.f6988a0)) {
        }
        if (C(this.T)) {
        }
        int[] iArr42 = b.f18890a;
        if (C(this.U)) {
        }
        if (z15) {
        }
        if (z14) {
        }
        return z15;
    }

    public final void F(boolean z10) {
        if (this.Y != z10) {
            this.Y = z10;
            float y10 = y();
            if (!z10 && this.f7012z0) {
                this.f7012z0 = false;
            }
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void G(Drawable drawable) {
        if (this.f6988a0 != drawable) {
            float y10 = y();
            this.f6988a0 = drawable;
            float y11 = y();
            c0(this.f6988a0);
            w(this.f6988a0);
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        boolean z10;
        if (this.f6989b0 != colorStateList) {
            this.f6989b0 = colorStateList;
            if (this.Z && this.f6988a0 != null && this.Y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a.b.h(this.f6988a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z10) {
        if (this.Z != z10) {
            boolean Z = Z();
            this.Z = z10;
            boolean Z2 = Z();
            if (Z != Z2) {
                if (Z2) {
                    w(this.f6988a0);
                } else {
                    c0(this.f6988a0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    @Deprecated
    public final void J(float f10) {
        if (this.I != f10) {
            this.I = f10;
            setShapeAppearanceModel(this.f6391i.f6409a.e(f10));
        }
    }

    public final void K(Drawable drawable) {
        Drawable drawable2 = this.O;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof c) {
                drawable2 = ((c) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float y10 = y();
            if (drawable != null) {
                drawable3 = r2.a.g(drawable).mutate();
            }
            this.O = drawable3;
            float y11 = y();
            c0(drawable2);
            if (a0()) {
                w(this.O);
            }
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void L(float f10) {
        if (this.Q != f10) {
            float y10 = y();
            this.Q = f10;
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        this.R = true;
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (a0()) {
                a.b.h(this.O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.N != z10) {
            boolean a02 = a0();
            this.N = z10;
            boolean a03 = a0();
            if (a02 != a03) {
                if (a03) {
                    w(this.O);
                } else {
                    c0(this.O);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (this.N0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(float f10) {
        if (this.K != f10) {
            this.K = f10;
            this.f7000n0.setStrokeWidth(f10);
            if (this.N0) {
                this.f6391i.f6418k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void Q(Drawable drawable) {
        Drawable drawable2 = this.T;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof c) {
                drawable2 = ((c) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float z10 = z();
            if (drawable != null) {
                drawable3 = r2.a.g(drawable).mutate();
            }
            this.T = drawable3;
            int[] iArr = b.f18890a;
            this.U = new RippleDrawable(b.b(this.L), this.T, P0);
            float z11 = z();
            c0(drawable2);
            if (b0()) {
                w(this.T);
            }
            invalidateSelf();
            if (z10 != z11) {
                D();
            }
        }
    }

    public final void R(float f10) {
        if (this.f6997k0 != f10) {
            this.f6997k0 = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void S(float f10) {
        if (this.W != f10) {
            this.W = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void T(float f10) {
        if (this.f6996j0 != f10) {
            this.f6996j0 = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (b0()) {
                a.b.h(this.T, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(boolean z10) {
        if (this.S != z10) {
            boolean b02 = b0();
            this.S = z10;
            boolean b03 = b0();
            if (b02 != b03) {
                if (b03) {
                    w(this.T);
                } else {
                    c0(this.T);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void W(float f10) {
        if (this.f6993g0 != f10) {
            float y10 = y();
            this.f6993g0 = f10;
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void X(float f10) {
        if (this.f6992f0 != f10) {
            float y10 = y();
            this.f6992f0 = f10;
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void Y(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.H0) {
                colorStateList2 = b.b(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.I0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final boolean Z() {
        return this.Z && this.f6988a0 != null && this.f7012z0;
    }

    @Override // u5.h.b
    public final void a() {
        D();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.N && this.O != null;
    }

    public final boolean b0() {
        return this.S && this.T != null;
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        RectF rectF;
        int i13;
        int i14;
        boolean z10;
        int i15;
        float f10;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.B0) != 0) {
            if (i10 < 255) {
                float f11 = bounds.left;
                float f12 = bounds.top;
                float f13 = bounds.right;
                float f14 = bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = canvas.saveLayerAlpha(f11, f12, f13, f14, i10);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f11, f12, f13, f14, i10, 31);
                }
                i11 = saveLayerAlpha;
            } else {
                i11 = 0;
            }
            boolean z11 = this.N0;
            Paint paint = this.f7000n0;
            RectF rectF2 = this.f7002p0;
            if (!z11) {
                paint.setColor(this.f7006t0);
                paint.setStyle(Paint.Style.FILL);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, A(), A(), paint);
            }
            if (!this.N0) {
                paint.setColor(this.f7007u0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.C0;
                if (colorFilter == null) {
                    colorFilter = this.D0;
                }
                paint.setColorFilter(colorFilter);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, A(), A(), paint);
            }
            if (this.N0) {
                super.draw(canvas);
            }
            if (this.K > 0.0f && !this.N0) {
                paint.setColor(this.f7009w0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.N0) {
                    ColorFilter colorFilter2 = this.C0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.D0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f15 = this.K / 2.0f;
                rectF2.set(bounds.left + f15, bounds.top + f15, bounds.right - f15, bounds.bottom - f15);
                float f16 = this.I - (this.K / 2.0f);
                canvas.drawRoundRect(rectF2, f16, f16, paint);
            }
            paint.setColor(this.f7010x0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            if (!this.N0) {
                canvas.drawRoundRect(rectF2, A(), A(), paint);
                i12 = 0;
            } else {
                RectF rectF3 = new RectF(bounds);
                Path path = this.f7004r0;
                l lVar = this.f6407z;
                g.b bVar = this.f6391i;
                lVar.a(bVar.f6409a, bVar.f6417j, rectF3, this.f6406y, path);
                i12 = 0;
                f(canvas, paint, path, this.f6391i.f6409a, h());
            }
            if (a0()) {
                x(bounds, rectF2);
                float f17 = rectF2.left;
                float f18 = rectF2.top;
                canvas.translate(f17, f18);
                this.O.setBounds(i12, i12, (int) rectF2.width(), (int) rectF2.height());
                this.O.draw(canvas);
                canvas.translate(-f17, -f18);
            }
            if (Z()) {
                x(bounds, rectF2);
                float f19 = rectF2.left;
                float f20 = rectF2.top;
                canvas.translate(f19, f20);
                this.f6988a0.setBounds(i12, i12, (int) rectF2.width(), (int) rectF2.height());
                this.f6988a0.draw(canvas);
                canvas.translate(-f19, -f20);
            }
            if (this.L0 && this.M != null) {
                PointF pointF = this.f7003q0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.M;
                h hVar = this.f7005s0;
                if (charSequence != null) {
                    float y10 = y() + this.f6991e0 + this.f6994h0;
                    if (r2.a.b(this) == 0) {
                        pointF.x = bounds.left + y10;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - y10;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = hVar.f17815a;
                    Paint.FontMetrics fontMetrics = this.f7001o0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF2.setEmpty();
                if (this.M != null) {
                    float y11 = y() + this.f6991e0 + this.f6994h0;
                    float z12 = z() + this.f6998l0 + this.f6995i0;
                    if (r2.a.b(this) == 0) {
                        rectF2.left = bounds.left + y11;
                        f10 = bounds.right - z12;
                    } else {
                        rectF2.left = bounds.left + z12;
                        f10 = bounds.right - y11;
                    }
                    rectF2.right = f10;
                    rectF2.top = bounds.top;
                    rectF2.bottom = bounds.bottom;
                }
                d dVar = hVar.f17819f;
                TextPaint textPaint2 = hVar.f17815a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    hVar.f17819f.e(this.f6999m0, textPaint2, hVar.f17816b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(hVar.a(this.M.toString())) > Math.round(rectF2.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15 = canvas.save();
                    canvas.clipRect(rectF2);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence2 = this.M;
                if (z10 && this.K0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF2.width(), this.K0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f21 = pointF.x;
                float f22 = pointF.y;
                i14 = 255;
                rectF = rectF2;
                i13 = i11;
                canvas.drawText(charSequence3, 0, length, f21, f22, textPaint2);
                if (z10) {
                    canvas.restoreToCount(i15);
                }
            } else {
                rectF = rectF2;
                i13 = i11;
                i14 = 255;
            }
            if (b0()) {
                rectF.setEmpty();
                if (b0()) {
                    float f23 = this.f6998l0 + this.f6997k0;
                    if (r2.a.b(this) == 0) {
                        float f24 = bounds.right - f23;
                        rectF.right = f24;
                        rectF.left = f24 - this.W;
                    } else {
                        float f25 = bounds.left + f23;
                        rectF.left = f25;
                        rectF.right = f25 + this.W;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f26 = this.W;
                    float f27 = exactCenterY - (f26 / 2.0f);
                    rectF.top = f27;
                    rectF.bottom = f27 + f26;
                }
                float f28 = rectF.left;
                float f29 = rectF.top;
                canvas.translate(f28, f29);
                this.T.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                int[] iArr = b.f18890a;
                this.U.setBounds(this.T.getBounds());
                this.U.jumpToCurrentState();
                this.U.draw(canvas);
                canvas.translate(-f28, -f29);
            }
            if (this.B0 < i14) {
                canvas.restoreToCount(i13);
            }
        }
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.B0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.C0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(z() + this.f7005s0.a(this.M.toString()) + y() + this.f6991e0 + this.f6994h0 + this.f6995i0 + this.f6998l0), this.M0);
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.I);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.H, this.I);
        }
        outline.setAlpha(this.B0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (B(this.F) || B(this.G) || B(this.J)) {
            return true;
        }
        if (this.H0 && B(this.I0)) {
            return true;
        }
        d dVar = this.f7005s0.f17819f;
        if (dVar != null && (colorStateList = dVar.f18642j) != null && colorStateList.isStateful()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.Z && this.f6988a0 != null && this.Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || C(this.O) || C(this.f6988a0) || B(this.E0)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (a0()) {
            onLayoutDirectionChanged |= r2.a.c(this.O, i10);
        }
        if (Z()) {
            onLayoutDirectionChanged |= r2.a.c(this.f6988a0, i10);
        }
        if (b0()) {
            onLayoutDirectionChanged |= r2.a.c(this.T, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (a0()) {
            onLevelChange |= this.O.setLevel(i10);
        }
        if (Z()) {
            onLevelChange |= this.f6988a0.setLevel(i10);
        }
        if (b0()) {
            onLevelChange |= this.T.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.N0) {
            super.onStateChange(iArr);
        }
        return E(iArr, this.G0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.B0 != i10) {
            this.B0 = i10;
            invalidateSelf();
        }
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.C0 != colorFilter) {
            this.C0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.F0 != mode) {
            this.F0 = mode;
            ColorStateList colorStateList = this.E0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
                this.D0 = porterDuffColorFilter;
                invalidateSelf();
            }
            porterDuffColorFilter = null;
            this.D0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (a0()) {
            visible |= this.O.setVisible(z10, z11);
        }
        if (Z()) {
            visible |= this.f6988a0.setVisible(z10, z11);
        }
        if (b0()) {
            visible |= this.T.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        r2.a.c(drawable, r2.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.T) {
            if (drawable.isStateful()) {
                drawable.setState(this.G0);
            }
            a.b.h(drawable, this.V);
            return;
        }
        Drawable drawable2 = this.O;
        if (drawable == drawable2 && this.R) {
            a.b.h(drawable2, this.P);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void x(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (a0() || Z()) {
            float f11 = this.f6991e0 + this.f6992f0;
            if (this.f7012z0) {
                drawable = this.f6988a0;
            } else {
                drawable = this.O;
            }
            float f12 = this.Q;
            if (f12 <= 0.0f && drawable != null) {
                f12 = drawable.getIntrinsicWidth();
            }
            if (r2.a.b(this) == 0) {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = rect.right - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.f7012z0) {
                drawable2 = this.f6988a0;
            } else {
                drawable2 = this.O;
            }
            float f15 = this.Q;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil(n.b(this.f6999m0, 24));
                if (drawable2.getIntrinsicHeight() <= f15) {
                    f10 = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float y() {
        Drawable drawable;
        if (!a0() && !Z()) {
            return 0.0f;
        }
        float f10 = this.f6992f0;
        if (this.f7012z0) {
            drawable = this.f6988a0;
        } else {
            drawable = this.O;
        }
        float f11 = this.Q;
        if (f11 <= 0.0f && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f6993g0;
    }

    public final float z() {
        if (b0()) {
            return this.f6996j0 + this.W + this.f6997k0;
        }
        return 0.0f;
    }
}
