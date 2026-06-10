package com.google.android.material.button;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import b6.k;
import b6.o;
import com.noto.R;
import e3.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ma.i;
import r2.a;
import u5.j;
import u5.n;

/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, o {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f6934y = {16842911};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f6935z = {16842912};

    /* renamed from: l  reason: collision with root package name */
    public final j5.a f6936l;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashSet<a> f6937m;
    public b n;

    /* renamed from: o  reason: collision with root package name */
    public PorterDuff.Mode f6938o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f6939p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f6940q;

    /* renamed from: r  reason: collision with root package name */
    public int f6941r;

    /* renamed from: s  reason: collision with root package name */
    public int f6942s;

    /* renamed from: t  reason: collision with root package name */
    public int f6943t;

    /* renamed from: u  reason: collision with root package name */
    public int f6944u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6945v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6946w;

    /* renamed from: x  reason: collision with root package name */
    public int f6947x;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends h3.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public boolean f6948k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f6948k = z10;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeInt(this.f6948k ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.materialButtonStyle, 2132083735), attributeSet, R.attr.materialButtonStyle);
        this.f6937m = new LinkedHashSet<>();
        this.f6945v = false;
        this.f6946w = false;
        Context context2 = getContext();
        TypedArray d5 = j.d(context2, attributeSet, a1.b.f22d0, R.attr.materialButtonStyle, 2132083735, new int[0]);
        this.f6944u = d5.getDimensionPixelSize(12, 0);
        this.f6938o = n.f(d5.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f6939p = x5.c.a(getContext(), d5, 14);
        this.f6940q = x5.c.d(getContext(), d5, 10);
        this.f6947x = d5.getInteger(11, 1);
        this.f6941r = d5.getDimensionPixelSize(13, 0);
        j5.a aVar = new j5.a(this, new k(k.b(context2, attributeSet, R.attr.materialButtonStyle, 2132083735)));
        this.f6936l = aVar;
        aVar.c = d5.getDimensionPixelOffset(1, 0);
        aVar.f12687d = d5.getDimensionPixelOffset(2, 0);
        aVar.f12688e = d5.getDimensionPixelOffset(3, 0);
        aVar.f12689f = d5.getDimensionPixelOffset(4, 0);
        if (d5.hasValue(8)) {
            int dimensionPixelSize = d5.getDimensionPixelSize(8, -1);
            aVar.f12690g = dimensionPixelSize;
            aVar.c(aVar.f12686b.e(dimensionPixelSize));
            aVar.f12698p = true;
        }
        aVar.f12691h = d5.getDimensionPixelSize(20, 0);
        aVar.f12692i = n.f(d5.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f12693j = x5.c.a(getContext(), d5, 6);
        aVar.f12694k = x5.c.a(getContext(), d5, 19);
        aVar.f12695l = x5.c.a(getContext(), d5, 16);
        aVar.f12699q = d5.getBoolean(5, false);
        aVar.f12702t = d5.getDimensionPixelSize(9, 0);
        aVar.f12700r = d5.getBoolean(21, true);
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        int f10 = j0.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = j0.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d5.hasValue(0)) {
            aVar.f12697o = true;
            setSupportBackgroundTintList(aVar.f12693j);
            setSupportBackgroundTintMode(aVar.f12692i);
        } else {
            aVar.e();
        }
        j0.e.k(this, f10 + aVar.c, paddingTop + aVar.f12688e, e10 + aVar.f12687d, paddingBottom + aVar.f12689f);
        d5.recycle();
        setCompoundDrawablePadding(this.f6944u);
        c(this.f6940q != null);
    }

    private String getA11yClassName() {
        boolean z10;
        Class cls;
        j5.a aVar = this.f6936l;
        if (aVar != null && aVar.f12699q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    public final boolean a() {
        j5.a aVar = this.f6936l;
        if (aVar != null && !aVar.f12697o) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        boolean z11;
        int i10 = this.f6947x;
        boolean z12 = false;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
            if (!z10) {
                h.b.e(this, this.f6940q, null, null, null);
                return;
            }
            if (i10 != 3 && i10 != 4) {
                z11 = false;
                if (!z11) {
                    h.b.e(this, null, null, this.f6940q, null);
                    return;
                }
                if ((i10 == 16 || i10 == 32) ? true : true) {
                    h.b.e(this, null, this.f6940q, null, null);
                    return;
                }
                return;
            }
            z11 = true;
            if (!z11) {
            }
        }
        z10 = true;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = this.f6940q;
        boolean z14 = true;
        if (drawable != null) {
            Drawable mutate = r2.a.g(drawable).mutate();
            this.f6940q = mutate;
            a.b.h(mutate, this.f6939p);
            PorterDuff.Mode mode = this.f6938o;
            if (mode != null) {
                a.b.i(this.f6940q, mode);
            }
            int i10 = this.f6941r;
            if (i10 == 0) {
                i10 = this.f6940q.getIntrinsicWidth();
            }
            int i11 = this.f6941r;
            if (i11 == 0) {
                i11 = this.f6940q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6940q;
            int i12 = this.f6942s;
            int i13 = this.f6943t;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f6940q.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] a10 = h.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.f6947x;
        if (i14 != 1 && i14 != 2) {
            z11 = false;
            if (z11 || drawable3 == this.f6940q) {
                if (i14 != 3 && i14 != 4) {
                    z12 = false;
                    if (z12 || drawable5 == this.f6940q) {
                        if (i14 != 16 && i14 != 32) {
                            z13 = false;
                            if (z13 || drawable4 == this.f6940q) {
                                z14 = false;
                            }
                        }
                        z13 = true;
                        if (z13) {
                        }
                        z14 = false;
                    }
                }
                z12 = true;
                if (z12) {
                }
                if (i14 != 16) {
                    z13 = false;
                    if (z13) {
                    }
                    z14 = false;
                }
                z13 = true;
                if (z13) {
                }
                z14 = false;
            }
            if (z14) {
                b();
                return;
            }
            return;
        }
        z11 = true;
        if (z11) {
        }
        if (i14 != 3) {
            z12 = false;
            if (z12) {
            }
            if (i14 != 16) {
            }
            z13 = true;
            if (z13) {
            }
            z14 = false;
            if (z14) {
            }
        }
        z12 = true;
        if (z12) {
        }
        if (i14 != 16) {
        }
        z13 = true;
        if (z13) {
        }
        z14 = false;
        if (z14) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
        r7.f6942s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
        if (r0 != 16) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
        r7.f6943t = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
        r8 = r7.f6941r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003e, code lost:
        if (r8 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:
        r8 = r7.f6940q.getIntrinsicHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
        r8 = java.lang.Math.max(0, (((((r9 - getTextHeight()) - getPaddingTop()) - r8) - r7.f6944u) - getPaddingBottom()) / 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        if (r7.f6943t == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
        r7.f6943t = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, int i11) {
        boolean z10;
        Layout.Alignment actualTextAlignment;
        int i12;
        int i13;
        int e10;
        boolean z11;
        boolean z12;
        if (this.f6940q != null && getLayout() != null) {
            int i14 = this.f6947x;
            boolean z13 = true;
            if (i14 != 1 && i14 != 2) {
                z10 = false;
                if (!z10) {
                    if (i14 != 3 && i14 != 4) {
                        z12 = false;
                        if (z12) {
                            if (i14 != 16 && i14 != 32) {
                                z13 = false;
                            }
                            return;
                        }
                    }
                    z12 = true;
                    if (z12) {
                    }
                }
                this.f6943t = 0;
                actualTextAlignment = getActualTextAlignment();
                i12 = this.f6947x;
                if (i12 != 1 && i12 != 3 && ((i12 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i12 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                    i13 = this.f6941r;
                    if (i13 == 0) {
                        i13 = this.f6940q.getIntrinsicWidth();
                    }
                    int textLayoutWidth = i10 - getTextLayoutWidth();
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    e10 = (((textLayoutWidth - j0.e.e(this)) - i13) - this.f6944u) - j0.e.f(this);
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        e10 /= 2;
                    }
                    if (j0.e.d(this) != 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f6947x == 4) {
                        z13 = false;
                    }
                    if (z11 != z13) {
                        e10 = -e10;
                    }
                    if (this.f6942s == e10) {
                        this.f6942s = e10;
                        c(false);
                        return;
                    }
                    return;
                }
                this.f6942s = 0;
                c(false);
            }
            z10 = true;
            if (!z10) {
            }
            this.f6943t = 0;
            actualTextAlignment = getActualTextAlignment();
            i12 = this.f6947x;
            if (i12 != 1) {
                i13 = this.f6941r;
                if (i13 == 0) {
                }
                int textLayoutWidth2 = i10 - getTextLayoutWidth();
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                e10 = (((textLayoutWidth2 - j0.e.e(this)) - i13) - this.f6944u) - j0.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                }
                if (j0.e.d(this) != 1) {
                }
                if (this.f6947x == 4) {
                }
                if (z11 != z13) {
                }
                if (this.f6942s == e10) {
                }
            }
            this.f6942s = 0;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f6936l.f12690g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6940q;
    }

    public int getIconGravity() {
        return this.f6947x;
    }

    public int getIconPadding() {
        return this.f6944u;
    }

    public int getIconSize() {
        return this.f6941r;
    }

    public ColorStateList getIconTint() {
        return this.f6939p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6938o;
    }

    public int getInsetBottom() {
        return this.f6936l.f12689f;
    }

    public int getInsetTop() {
        return this.f6936l.f12688e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f6936l.f12695l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f6936l.f12686b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f6936l.f12694k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f6936l.f12691h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f6936l.f12693j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f6936l.f12692i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6945v;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            i.M(this, this.f6936l.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        j5.a aVar = this.f6936l;
        if (aVar != null && aVar.f12699q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f6934y);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6935z);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        j5.a aVar = this.f6936l;
        if (aVar != null && aVar.f12699q) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        j5.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f6936l) != null) {
            int i14 = i13 - i11;
            int i15 = i12 - i10;
            Drawable drawable = aVar.f12696m;
            if (drawable != null) {
                drawable.setBounds(aVar.c, aVar.f12688e, i15 - aVar.f12687d, i14 - aVar.f12689f);
            }
        }
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f11358i);
        setChecked(cVar.f6948k);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f6948k = this.f6945v;
        return cVar;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f6936l.f12700r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f6940q != null) {
            if (this.f6940q.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (a()) {
            j5.a aVar = this.f6936l;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                j5.a aVar = this.f6936l;
                aVar.f12697o = true;
                ColorStateList colorStateList = aVar.f12693j;
                MaterialButton materialButton = aVar.f12685a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(aVar.f12692i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? e.a.a(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f6936l.f12699q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        boolean z11;
        j5.a aVar = this.f6936l;
        if (aVar != null && aVar.f12699q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && isEnabled() && this.f6945v != z10) {
            this.f6945v = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z12 = this.f6945v;
                if (!materialButtonToggleGroup.n) {
                    materialButtonToggleGroup.b(getId(), z12);
                }
            }
            if (this.f6946w) {
                return;
            }
            this.f6946w = true;
            Iterator<a> it = this.f6937m.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f6946w = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            j5.a aVar = this.f6936l;
            if (!aVar.f12698p || aVar.f12690g != i10) {
                aVar.f12690g = i10;
                aVar.f12698p = true;
                aVar.c(aVar.f12686b.e(i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f6936l.b(false).m(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6940q != drawable) {
            this.f6940q = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f6947x != i10) {
            this.f6947x = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f6944u != i10) {
            this.f6944u = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? e.a.a(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f6941r != i10) {
            this.f6941r = i10;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6939p != colorStateList) {
            this.f6939p = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6938o != mode) {
            this.f6938o = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(n2.a.c(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        j5.a aVar = this.f6936l;
        aVar.d(aVar.f12688e, i10);
    }

    public void setInsetTop(int i10) {
        j5.a aVar = this.f6936l;
        aVar.d(i10, aVar.f12689f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.n = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.n;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            j5.a aVar = this.f6936l;
            if (aVar.f12695l != colorStateList) {
                aVar.f12695l = colorStateList;
                boolean z10 = j5.a.f12683u;
                MaterialButton materialButton = aVar.f12685a;
                if (z10 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(y5.b.b(colorStateList));
                } else if (!z10 && (materialButton.getBackground() instanceof y5.a)) {
                    ((y5.a) materialButton.getBackground()).setTintList(y5.b.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(n2.a.c(getContext(), i10));
        }
    }

    @Override // b6.o
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f6936l.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            j5.a aVar = this.f6936l;
            aVar.n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            j5.a aVar = this.f6936l;
            if (aVar.f12694k != colorStateList) {
                aVar.f12694k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(n2.a.c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            j5.a aVar = this.f6936l;
            if (aVar.f12691h != i10) {
                aVar.f12691h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            j5.a aVar = this.f6936l;
            if (aVar.f12693j != colorStateList) {
                aVar.f12693j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f12693j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            j5.a aVar = this.f6936l;
            if (aVar.f12692i != mode) {
                aVar.f12692i = mode;
                if (aVar.b(false) != null && aVar.f12692i != null) {
                    a.b.i(aVar.b(false), aVar.f12692i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f6936l.f12700r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6945v);
    }
}
