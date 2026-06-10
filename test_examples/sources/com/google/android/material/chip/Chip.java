package com.google.android.material.chip;

import a3.j0;
import a3.v0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.datastore.preferences.protobuf.k;
import b3.g;
import b6.o;
import com.google.android.material.chip.a;
import com.noto.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import ma.i;
import u5.f;
import u5.h;
import u5.j;
import u5.n;
import x5.c;
import x5.d;
import y2.g;

/* loaded from: classes.dex */
public class Chip extends g implements a.InterfaceC0060a, o, Checkable {
    public static final Rect E = new Rect();
    public static final int[] F = {16842913};
    public static final int[] G = {16842911};
    public boolean A;
    public final Rect B;
    public final RectF C;
    public final a D;

    /* renamed from: m  reason: collision with root package name */
    public com.google.android.material.chip.a f6973m;
    public InsetDrawable n;

    /* renamed from: o  reason: collision with root package name */
    public RippleDrawable f6974o;

    /* renamed from: p  reason: collision with root package name */
    public View.OnClickListener f6975p;

    /* renamed from: q  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f6976q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6977r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6978s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6979t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6980u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6981v;

    /* renamed from: w  reason: collision with root package name */
    public int f6982w;

    /* renamed from: x  reason: collision with root package name */
    public int f6983x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f6984y;

    /* renamed from: z  reason: collision with root package name */
    public final b f6985z;

    /* loaded from: classes.dex */
    public class a extends k {
        public a() {
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void D0(int i10) {
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void E0(Typeface typeface, boolean z10) {
            CharSequence text;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f6973m;
            if (aVar.L0) {
                text = aVar.M;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b extends i3.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // i3.a
        public final int n(float f10, float f11) {
            Rect rect = Chip.E;
            Chip chip = Chip.this;
            if (chip.e() && chip.getCloseIconTouchBounds().contains(f10, f11)) {
                return 1;
            }
            return 0;
        }

        @Override // i3.a
        public final void o(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.E;
            Chip chip = Chip.this;
            if (chip.e()) {
                com.google.android.material.chip.a aVar = chip.f6973m;
                if (aVar != null && aVar.S) {
                    z10 = true;
                }
                if (z10 && chip.f6975p != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // i3.a
        public final boolean s(int i10, int i11, Bundle bundle) {
            boolean z10 = false;
            if (i11 == 16) {
                Chip chip = Chip.this;
                if (i10 == 0) {
                    return chip.performClick();
                }
                if (i10 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f6975p;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z10 = true;
                    }
                    if (chip.A) {
                        chip.f6985z.x(1, 1);
                    }
                }
            }
            return z10;
        }

        @Override // i3.a
        public final void t(b3.g gVar) {
            boolean z10;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f6973m;
            if (aVar != null && aVar.Y) {
                z10 = true;
            } else {
                z10 = false;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
            accessibilityNodeInfo.setCheckable(z10);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            gVar.i(chip.getAccessibilityClassName());
            CharSequence text = chip.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                gVar.q(text);
            } else {
                gVar.l(text);
            }
        }

        @Override // i3.a
        public final void u(int i10, b3.g gVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
            String str = "";
            if (i10 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    gVar.l(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    gVar.l(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                gVar.b(g.a.f6359e);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            gVar.l("");
            accessibilityNodeInfo.setBoundsInParent(Chip.E);
        }

        @Override // i3.a
        public final void v(int i10, boolean z10) {
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.f6980u = z10;
                chip.refreshDrawableState();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.chipStyle, 2132083749), attributeSet, R.attr.chipStyle);
        d dVar;
        TextUtils.TruncateAt truncateAt;
        float dimension;
        float dimension2;
        float dimension3;
        float dimension4;
        boolean hasValue;
        int resourceId;
        this.B = new Rect();
        this.C = new RectF();
        this.D = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        Context context3 = aVar.f6999m0;
        int[] iArr = a1.b.T;
        TypedArray d5 = j.d(context3, attributeSet, iArr, R.attr.chipStyle, 2132083749, new int[0]);
        aVar.N0 = d5.hasValue(37);
        Context context4 = aVar.f6999m0;
        ColorStateList a10 = c.a(context4, d5, 24);
        if (aVar.F != a10) {
            aVar.F = a10;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList a11 = c.a(context4, d5, 11);
        if (aVar.G != a11) {
            aVar.G = a11;
            aVar.onStateChange(aVar.getState());
        }
        float dimension5 = d5.getDimension(19, 0.0f);
        if (aVar.H != dimension5) {
            aVar.H = dimension5;
            aVar.invalidateSelf();
            aVar.D();
        }
        if (d5.hasValue(12)) {
            aVar.J(d5.getDimension(12, 0.0f));
        }
        aVar.O(c.a(context4, d5, 22));
        aVar.P(d5.getDimension(23, 0.0f));
        aVar.Y(c.a(context4, d5, 36));
        String text = d5.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(aVar.M, text);
        h hVar = aVar.f7005s0;
        if (!equals) {
            aVar.M = text;
            hVar.f17817d = true;
            aVar.invalidateSelf();
            aVar.D();
        }
        if (d5.hasValue(0) && (resourceId = d5.getResourceId(0, 0)) != 0) {
            dVar = new d(context4, resourceId);
        } else {
            dVar = null;
        }
        dVar.f18643k = d5.getDimension(1, dVar.f18643k);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            dVar.f18642j = c.a(context4, d5, 2);
        }
        hVar.b(dVar, context4);
        int i11 = d5.getInt(3, 0);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    truncateAt = TextUtils.TruncateAt.END;
                } else {
                    aVar.N(d5.getBoolean(18, false));
                    if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                        aVar.N(d5.getBoolean(15, false));
                    }
                    aVar.K(c.d(context4, d5, 14));
                    if (d5.hasValue(17)) {
                        aVar.M(c.a(context4, d5, 17));
                    }
                    aVar.L(d5.getDimension(16, -1.0f));
                    aVar.V(d5.getBoolean(31, false));
                    if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                        aVar.V(d5.getBoolean(26, false));
                    }
                    aVar.Q(c.d(context4, d5, 25));
                    aVar.U(c.a(context4, d5, 30));
                    aVar.S(d5.getDimension(28, 0.0f));
                    aVar.F(d5.getBoolean(6, false));
                    aVar.I(d5.getBoolean(10, false));
                    if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                        aVar.I(d5.getBoolean(8, false));
                    }
                    aVar.G(c.d(context4, d5, 7));
                    if (d5.hasValue(9)) {
                        aVar.H(c.a(context4, d5, 9));
                    }
                    aVar.c0 = e5.g.a(context4, d5, 39);
                    aVar.f6990d0 = e5.g.a(context4, d5, 33);
                    dimension = d5.getDimension(21, 0.0f);
                    if (aVar.f6991e0 != dimension) {
                        aVar.f6991e0 = dimension;
                        aVar.invalidateSelf();
                        aVar.D();
                    }
                    aVar.X(d5.getDimension(35, 0.0f));
                    aVar.W(d5.getDimension(34, 0.0f));
                    dimension2 = d5.getDimension(41, 0.0f);
                    if (aVar.f6994h0 != dimension2) {
                        aVar.f6994h0 = dimension2;
                        aVar.invalidateSelf();
                        aVar.D();
                    }
                    dimension3 = d5.getDimension(40, 0.0f);
                    if (aVar.f6995i0 != dimension3) {
                        aVar.f6995i0 = dimension3;
                        aVar.invalidateSelf();
                        aVar.D();
                    }
                    aVar.T(d5.getDimension(29, 0.0f));
                    aVar.R(d5.getDimension(27, 0.0f));
                    dimension4 = d5.getDimension(13, 0.0f);
                    if (aVar.f6998l0 != dimension4) {
                        aVar.f6998l0 = dimension4;
                        aVar.invalidateSelf();
                        aVar.D();
                    }
                    aVar.M0 = d5.getDimensionPixelSize(4, Integer.MAX_VALUE);
                    d5.recycle();
                    TypedArray d10 = j.d(context2, attributeSet, iArr, R.attr.chipStyle, 2132083749, new int[0]);
                    this.f6981v = d10.getBoolean(32, false);
                    this.f6983x = (int) Math.ceil(d10.getDimension(20, (float) Math.ceil(n.b(getContext(), 48))));
                    d10.recycle();
                    setChipDrawable(aVar);
                    aVar.m(j0.i.i(this));
                    TypedArray d11 = j.d(context2, attributeSet, iArr, R.attr.chipStyle, 2132083749, new int[0]);
                    if (i10 < 23) {
                        setTextColor(c.a(context2, d11, 2));
                    }
                    hasValue = d11.hasValue(37);
                    d11.recycle();
                    this.f6985z = new b(this);
                    f();
                    if (!hasValue) {
                        setOutlineProvider(new m5.b(this));
                    }
                    setChecked(this.f6977r);
                    setText(aVar.M);
                    setEllipsize(aVar.K0);
                    i();
                    if (!this.f6973m.L0) {
                        setLines(1);
                        setHorizontallyScrolling(true);
                    }
                    setGravity(8388627);
                    h();
                    if (this.f6981v) {
                        setMinHeight(this.f6983x);
                    }
                    this.f6982w = j0.e.d(this);
                    super.setOnCheckedChangeListener(new m5.a(this, 0));
                }
            } else {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            truncateAt = TextUtils.TruncateAt.START;
        }
        aVar.K0 = truncateAt;
        aVar.N(d5.getBoolean(18, false));
        if (attributeSet != null) {
            aVar.N(d5.getBoolean(15, false));
        }
        aVar.K(c.d(context4, d5, 14));
        if (d5.hasValue(17)) {
        }
        aVar.L(d5.getDimension(16, -1.0f));
        aVar.V(d5.getBoolean(31, false));
        if (attributeSet != null) {
            aVar.V(d5.getBoolean(26, false));
        }
        aVar.Q(c.d(context4, d5, 25));
        aVar.U(c.a(context4, d5, 30));
        aVar.S(d5.getDimension(28, 0.0f));
        aVar.F(d5.getBoolean(6, false));
        aVar.I(d5.getBoolean(10, false));
        if (attributeSet != null) {
            aVar.I(d5.getBoolean(8, false));
        }
        aVar.G(c.d(context4, d5, 7));
        if (d5.hasValue(9)) {
        }
        aVar.c0 = e5.g.a(context4, d5, 39);
        aVar.f6990d0 = e5.g.a(context4, d5, 33);
        dimension = d5.getDimension(21, 0.0f);
        if (aVar.f6991e0 != dimension) {
        }
        aVar.X(d5.getDimension(35, 0.0f));
        aVar.W(d5.getDimension(34, 0.0f));
        dimension2 = d5.getDimension(41, 0.0f);
        if (aVar.f6994h0 != dimension2) {
        }
        dimension3 = d5.getDimension(40, 0.0f);
        if (aVar.f6995i0 != dimension3) {
        }
        aVar.T(d5.getDimension(29, 0.0f));
        aVar.R(d5.getDimension(27, 0.0f));
        dimension4 = d5.getDimension(13, 0.0f);
        if (aVar.f6998l0 != dimension4) {
        }
        aVar.M0 = d5.getDimensionPixelSize(4, Integer.MAX_VALUE);
        d5.recycle();
        TypedArray d102 = j.d(context2, attributeSet, iArr, R.attr.chipStyle, 2132083749, new int[0]);
        this.f6981v = d102.getBoolean(32, false);
        this.f6983x = (int) Math.ceil(d102.getDimension(20, (float) Math.ceil(n.b(getContext(), 48))));
        d102.recycle();
        setChipDrawable(aVar);
        aVar.m(j0.i.i(this));
        TypedArray d112 = j.d(context2, attributeSet, iArr, R.attr.chipStyle, 2132083749, new int[0]);
        if (i10 < 23) {
        }
        hasValue = d112.hasValue(37);
        d112.recycle();
        this.f6985z = new b(this);
        f();
        if (!hasValue) {
        }
        setChecked(this.f6977r);
        setText(aVar.M);
        setEllipsize(aVar.K0);
        i();
        if (!this.f6973m.L0) {
        }
        setGravity(8388627);
        h();
        if (this.f6981v) {
        }
        this.f6982w = j0.e.d(this);
        super.setOnCheckedChangeListener(new m5.a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.C;
        rectF.setEmpty();
        if (e() && this.f6975p != null) {
            com.google.android.material.chip.a aVar = this.f6973m;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.b0()) {
                float f10 = aVar.f6998l0 + aVar.f6997k0 + aVar.W + aVar.f6996j0 + aVar.f6995i0;
                if (r2.a.b(aVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.B;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f7005s0.f17819f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f6979t != z10) {
            this.f6979t = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f6978s != z10) {
            this.f6978s = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0060a
    public final void a() {
        d(this.f6983x);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i10) {
        int i11;
        int i12;
        this.f6983x = i10;
        if (!this.f6981v) {
            InsetDrawable insetDrawable = this.n;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.n = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = y5.b.f18890a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr2 = y5.b.f18890a;
            g();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f6973m.H));
        int max2 = Math.max(0, i10 - this.f6973m.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.n;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.n = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = y5.b.f18890a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr4 = y5.b.f18890a;
            g();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        } else {
            i12 = 0;
        }
        if (this.n != null) {
            Rect rect = new Rect();
            this.n.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = y5.b.f18890a;
                g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.n = new InsetDrawable((Drawable) this.f6973m, i11, i12, i11, i12);
        int[] iArr6 = y5.b.f18890a;
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A) {
            if (!this.f6985z.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.A) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f6985z;
        bVar.getClass();
        boolean z10 = false;
        z10 = false;
        int i10 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i11 = 130;
                                        }
                                    } else {
                                        i11 = 17;
                                    }
                                } else {
                                    i11 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i10 < repeatCount && bVar.q(i11, null)) {
                                    i10++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = bVar.f11699l;
                    if (i12 != Integer.MIN_VALUE) {
                        bVar.s(i12, 16, null);
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = bVar.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = bVar.q(1, null);
            }
        }
        if (z10 && bVar.f11699l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f6973m;
        boolean z10 = false;
        if (aVar != null && com.google.android.material.chip.a.C(aVar.T)) {
            com.google.android.material.chip.a aVar2 = this.f6973m;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.f6980u) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.f6979t) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.f6978s) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f6980u) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f6979t) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f6978s) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(aVar2.G0, iArr)) {
                aVar2.G0 = iArr;
                if (aVar2.b0()) {
                    z10 = aVar2.E(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            Drawable drawable = aVar.T;
            if (drawable != null) {
                if (drawable instanceof r2.c) {
                    drawable = ((r2.c) drawable).b();
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        boolean z10;
        boolean z11 = false;
        if (e()) {
            com.google.android.material.chip.a aVar = this.f6973m;
            if (aVar != null && aVar.S) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f6975p != null) {
                j0.p(this, this.f6985z);
                z11 = true;
                this.A = z11;
            }
        }
        j0.p(this, null);
        this.A = z11;
    }

    public final void g() {
        this.f6974o = new RippleDrawable(y5.b.b(this.f6973m.L), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar.H0) {
            aVar.H0 = false;
            aVar.I0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f6974o;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.q(this, rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z10;
        if (!TextUtils.isEmpty(this.f6984y)) {
            return this.f6984y;
        }
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ViewParent parent = getParent();
            if (!(parent instanceof m5.c)) {
                return "android.widget.Button";
            }
            ((m5.c) parent).getClass();
            throw null;
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.n;
        return insetDrawable == null ? this.f6973m : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6988a0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6989b0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.G;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return Math.max(0.0f, aVar.A());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6973m;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6998l0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar == null || (drawable = aVar.O) == null) {
            return null;
        }
        if (drawable instanceof r2.c) {
            drawable = ((r2.c) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.Q;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.P;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.H;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6991e0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.J;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.K;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar == null || (drawable = aVar.T) == null) {
            return null;
        }
        if (drawable instanceof r2.c) {
            drawable = ((r2.c) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6997k0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.W;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6996j0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.K0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.A) {
            b bVar = this.f6985z;
            if (bVar.f11699l == 1 || bVar.f11698k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public e5.g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6990d0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6993g0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6992f0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.L;
        }
        return null;
    }

    public b6.k getShapeAppearanceModel() {
        return this.f6973m.f6391i.f6409a;
    }

    public e5.g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.c0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6995i0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            return aVar.f6994h0;
        }
        return 0.0f;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f6973m) != null) {
            int z10 = (int) (aVar.z() + aVar.f6998l0 + aVar.f6995i0);
            com.google.android.material.chip.a aVar2 = this.f6973m;
            int y10 = (int) (aVar2.y() + aVar2.f6991e0 + aVar2.f6994h0);
            if (this.n != null) {
                Rect rect = new Rect();
                this.n.getPadding(rect);
                y10 += rect.left;
                z10 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.e.k(this, y10, paddingTop, z10, paddingBottom);
        }
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.D);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.M(this, this.f6973m);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.A) {
            b bVar = this.f6985z;
            int i11 = bVar.f11699l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z10) {
                bVar.q(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        } else if (actionMasked != 10) {
            return super.onHoverEvent(motionEvent);
        } else {
            contains = false;
        }
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        boolean z11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof m5.c) {
            m5.c cVar = (m5.c) getParent();
            int i11 = -1;
            if (cVar.f17807k) {
                i10 = 0;
                for (int i12 = 0; i12 < cVar.getChildCount(); i12++) {
                    View childAt = cVar.getChildAt(i12);
                    if (childAt instanceof Chip) {
                        if (cVar.getChildAt(i12).getVisibility() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            i10 = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) g.c.a(i11, 1, i10, 1, isChecked()).f6375a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f6982w != i10) {
            this.f6982w = i10;
            h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f6978s) {
                    if (!contains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else if (this.f6978s) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f6975p;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.A) {
                    this.f6985z.x(1, 1);
                }
                z10 = true;
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z10 = true;
            }
            z10 = false;
        }
        if (z10 || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f6984y = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6974o) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6974o) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.F(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.F(aVar.f6999m0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar == null) {
            this.f6977r = z10;
        } else if (aVar.Y) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.G(e.a.a(aVar.f6999m0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.H(n2.a.c(aVar.f6999m0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.I(aVar.f6999m0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.I(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.G != colorStateList) {
            aVar.G = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList c;
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.G != (c = n2.a.c(aVar.f6999m0, i10))) {
            aVar.G = c;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.J(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.J(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f6973m;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.J0 = new WeakReference<>(null);
            }
            this.f6973m = aVar;
            aVar.L0 = false;
            aVar.J0 = new WeakReference<>(this);
            d(this.f6983x);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.f6998l0 != f10) {
            aVar.f6998l0 = f10;
            aVar.invalidateSelf();
            aVar.D();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            float dimension = aVar.f6999m0.getResources().getDimension(i10);
            if (aVar.f6998l0 != dimension) {
                aVar.f6998l0 = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.K(e.a.a(aVar.f6999m0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.L(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.L(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.M(n2.a.c(aVar.f6999m0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.N(aVar.f6999m0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.N(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.H != f10) {
            aVar.H = f10;
            aVar.invalidateSelf();
            aVar.D();
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            float dimension = aVar.f6999m0.getResources().getDimension(i10);
            if (aVar.H != dimension) {
                aVar.H = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.f6991e0 != f10) {
            aVar.f6991e0 = f10;
            aVar.invalidateSelf();
            aVar.D();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            float dimension = aVar.f6999m0.getResources().getDimension(i10);
            if (aVar.f6991e0 != dimension) {
                aVar.f6991e0 = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.O(n2.a.c(aVar.f6999m0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.P(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.Q(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        y2.a aVar;
        com.google.android.material.chip.a aVar2 = this.f6973m;
        if (aVar2 != null && aVar2.X != charSequence) {
            String str = y2.a.f18789d;
            Locale locale = Locale.getDefault();
            int i10 = y2.g.f18809a;
            boolean z10 = true;
            if (g.a.a(locale) != 1) {
                z10 = false;
            }
            if (z10) {
                aVar = y2.a.f18792g;
            } else {
                aVar = y2.a.f18791f;
            }
            aVar2.X = aVar.c(charSequence, aVar.c);
            aVar2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.R(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.R(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.Q(e.a.a(aVar.f6999m0, i10));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.S(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.T(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.T(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.U(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.U(n2.a.c(aVar.f6999m0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.V(z10);
        }
        f();
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.m(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6973m == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f6973m;
            if (aVar != null) {
                aVar.K0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f6981v = z10;
        d(this.f6983x);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(e5.g gVar) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.f6990d0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.f6990d0 = e5.g.b(aVar.f6999m0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.W(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.W(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.X(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.X(aVar.f6999m0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(f<Chip> fVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f6973m == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.M0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6976q = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6975p = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.Y(colorStateList);
        }
        if (!this.f6973m.H0) {
            g();
        }
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.Y(n2.a.c(aVar.f6999m0, i10));
            if (!this.f6973m.H0) {
                g();
            }
        }
    }

    @Override // b6.o
    public void setShapeAppearanceModel(b6.k kVar) {
        this.f6973m.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(e5.g gVar) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.c0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.c0 = e5.g.b(aVar.f6999m0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.L0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.f6973m;
        if (aVar2 != null && !TextUtils.equals(aVar2.M, charSequence)) {
            aVar2.M = charSequence;
            aVar2.f7005s0.f17817d = true;
            aVar2.invalidateSelf();
            aVar2.D();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            Context context = aVar.f6999m0;
            aVar.f7005s0.b(new d(context, i10), context);
        }
        i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.f6995i0 != f10) {
            aVar.f6995i0 = f10;
            aVar.invalidateSelf();
            aVar.D();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            float dimension = aVar.f6999m0.getResources().getDimension(i10);
            if (aVar.f6995i0 != dimension) {
                aVar.f6995i0 = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            h hVar = aVar.f7005s0;
            d dVar = hVar.f17819f;
            if (dVar != null) {
                dVar.f18643k = applyDimension;
                hVar.f17815a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null && aVar.f6994h0 != f10) {
            aVar.f6994h0 = f10;
            aVar.invalidateSelf();
            aVar.D();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            float dimension = aVar.f6999m0.getResources().getDimension(i10);
            if (aVar.f6994h0 != dimension) {
                aVar.f6994h0 = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            Context context2 = aVar.f6999m0;
            aVar.f7005s0.b(new d(context2, i10), context2);
        }
        i();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f6973m;
        if (aVar != null) {
            aVar.f7005s0.b(dVar, aVar.f6999m0);
        }
        i();
    }
}
