package androidx.appcompat.widget;

import a3.j0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import com.noto.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import r2.a;

/* loaded from: classes.dex */
public class x0 extends CompoundButton {
    public static final a c0 = new a();

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f1134d0 = {16842912};
    public boolean A;
    public int B;
    public final int C;
    public float D;
    public float E;
    public final VelocityTracker F;
    public final int G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public final TextPaint Q;
    public ColorStateList R;
    public StaticLayout S;
    public StaticLayout T;
    public h.a U;
    public ObjectAnimator V;
    public n W;

    /* renamed from: a0  reason: collision with root package name */
    public c f1135a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Rect f1136b0;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f1137i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f1138j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f1139k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1140l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1141m;
    public Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f1142o;

    /* renamed from: p  reason: collision with root package name */
    public PorterDuff.Mode f1143p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1144q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1145r;

    /* renamed from: s  reason: collision with root package name */
    public int f1146s;

    /* renamed from: t  reason: collision with root package name */
    public int f1147t;

    /* renamed from: u  reason: collision with root package name */
    public int f1148u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1149v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f1150w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f1151x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f1152y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f1153z;

    /* loaded from: classes.dex */
    public class a extends Property<x0, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(x0 x0Var) {
            return Float.valueOf(x0Var.H);
        }

        @Override // android.util.Property
        public final void set(x0 x0Var, Float f10) {
            x0Var.setThumbPosition(f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f1154a;

        public c(x0 x0Var) {
            this.f1154a = new WeakReference(x0Var);
        }

        @Override // androidx.emoji2.text.f.e
        public final void a() {
            x0 x0Var = (x0) this.f1154a.get();
            if (x0Var != null) {
                x0Var.d();
            }
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            x0 x0Var = (x0) this.f1154a.get();
            if (x0Var != null) {
                x0Var.d();
            }
        }
    }

    public x0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public x0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ColorStateList colorStateList;
        Typeface typeface;
        Typeface create;
        int i11;
        int resourceId;
        this.f1138j = null;
        this.f1139k = null;
        this.f1140l = false;
        this.f1141m = false;
        this.f1142o = null;
        this.f1143p = null;
        this.f1144q = false;
        this.f1145r = false;
        this.F = VelocityTracker.obtain();
        boolean z10 = true;
        this.P = true;
        this.f1136b0 = new Rect();
        y0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.Q = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = a1.b.G;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        d1 d1Var = new d1(context, obtainStyledAttributes);
        a3.j0.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        Drawable e10 = d1Var.e(2);
        this.f1137i = e10;
        if (e10 != null) {
            e10.setCallback(this);
        }
        Drawable e11 = d1Var.e(11);
        this.n = e11;
        if (e11 != null) {
            e11.setCallback(this);
        }
        setTextOnInternal(d1Var.k(0));
        setTextOffInternal(d1Var.k(1));
        this.A = d1Var.a(3, true);
        this.f1146s = d1Var.d(8, 0);
        this.f1147t = d1Var.d(5, 0);
        this.f1148u = d1Var.d(6, 0);
        this.f1149v = d1Var.a(4, false);
        ColorStateList b5 = d1Var.b(9);
        if (b5 != null) {
            this.f1138j = b5;
            this.f1140l = true;
        }
        PorterDuff.Mode d5 = j0.d(d1Var.h(10, -1), null);
        if (this.f1139k != d5) {
            this.f1139k = d5;
            this.f1141m = true;
        }
        if (this.f1140l || this.f1141m) {
            a();
        }
        ColorStateList b10 = d1Var.b(12);
        if (b10 != null) {
            this.f1142o = b10;
            this.f1144q = true;
        }
        PorterDuff.Mode d10 = j0.d(d1Var.h(13, -1), null);
        if (this.f1143p != d10) {
            this.f1143p = d10;
            this.f1145r = true;
        }
        if (this.f1144q || this.f1145r) {
            b();
        }
        int i12 = d1Var.i(7, 0);
        if (i12 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i12, a1.b.H);
            if (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = n2.a.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes2.getColorStateList(3);
            }
            if (colorStateList == null) {
                colorStateList = getTextColors();
            }
            this.R = colorStateList;
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i13 = obtainStyledAttributes2.getInt(1, -1);
            int i14 = obtainStyledAttributes2.getInt(2, -1);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i14 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i14);
                } else {
                    create = Typeface.create(typeface, i14);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i11 = create.getStyle();
                } else {
                    i11 = 0;
                }
                int i15 = (~i11) & i14;
                if ((i15 & 1) == 0) {
                    z10 = false;
                }
                textPaint.setFakeBoldText(z10);
                textPaint.setTextSkewX((i15 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            this.U = obtainStyledAttributes2.getBoolean(14, false) ? new h.a(getContext()) : null;
            setTextOnInternal(this.f1150w);
            setTextOffInternal(this.f1152y);
            obtainStyledAttributes2.recycle();
        }
        new c0(this).f(attributeSet, i10);
        d1Var.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.C = viewConfiguration.getScaledTouchSlop();
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private n getEmojiTextViewHelper() {
        if (this.W == null) {
            this.W = new n(this);
        }
        return this.W;
    }

    private boolean getTargetCheckedState() {
        return this.H > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((n1.a(this) ? 1.0f - this.H : this.H) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.n;
        if (drawable != null) {
            Rect rect = this.f1136b0;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f1137i;
            Rect c10 = drawable2 != null ? j0.c(drawable2) : j0.c;
            return ((((this.I - this.K) - rect.left) - rect.right) - c10.left) - c10.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1152y = charSequence;
        n emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1041b.f16907a.e(this.U);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f1153z = charSequence;
        this.T = null;
        if (this.A) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1150w = charSequence;
        n emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1041b.f16907a.e(this.U);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f1151x = charSequence;
        this.S = null;
        if (this.A) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.f1137i;
        if (drawable != null) {
            if (this.f1140l || this.f1141m) {
                Drawable mutate = r2.a.g(drawable).mutate();
                this.f1137i = mutate;
                if (this.f1140l) {
                    a.b.h(mutate, this.f1138j);
                }
                if (this.f1141m) {
                    a.b.i(this.f1137i, this.f1139k);
                }
                if (this.f1137i.isStateful()) {
                    this.f1137i.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.n;
        if (drawable != null) {
            if (this.f1144q || this.f1145r) {
                Drawable mutate = r2.a.g(drawable).mutate();
                this.n = mutate;
                if (this.f1144q) {
                    a.b.h(mutate, this.f1142o);
                }
                if (this.f1145r) {
                    a.b.i(this.n, this.f1143p);
                }
                if (this.n.isStateful()) {
                    this.n.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        TextPaint textPaint = this.Q;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        setTextOnInternal(this.f1150w);
        setTextOffInternal(this.f1152y);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        int i12 = this.L;
        int i13 = this.M;
        int i14 = this.N;
        int i15 = this.O;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1137i;
        if (drawable != null) {
            rect = j0.c(drawable);
        } else {
            rect = j0.c;
        }
        Drawable drawable2 = this.n;
        Rect rect2 = this.f1136b0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                if (i18 > i19) {
                    i10 = (i18 - i19) + i13;
                } else {
                    i10 = i13;
                }
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.n.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.n.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1137i;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.K + rect2.right;
            this.f1137i.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                a.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1137i;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            a.b.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1137i;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        if (this.f1135a0 == null && this.W.f1041b.f16907a.b()) {
            if (androidx.emoji2.text.f.f4981j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                int b5 = a10.b();
                if (b5 == 3 || b5 == 0) {
                    c cVar = new c(this);
                    this.f1135a0 = cVar;
                    a10.g(cVar);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (n1.a(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.I;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1148u : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (n1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.I;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1148u : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e3.h.f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.A;
    }

    public boolean getSplitTrack() {
        return this.f1149v;
    }

    public int getSwitchMinWidth() {
        return this.f1147t;
    }

    public int getSwitchPadding() {
        return this.f1148u;
    }

    public CharSequence getTextOff() {
        return this.f1152y;
    }

    public CharSequence getTextOn() {
        return this.f1150w;
    }

    public Drawable getThumbDrawable() {
        return this.f1137i;
    }

    public final float getThumbPosition() {
        return this.H;
    }

    public int getThumbTextPadding() {
        return this.f1146s;
    }

    public ColorStateList getThumbTintList() {
        return this.f1138j;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1139k;
    }

    public Drawable getTrackDrawable() {
        return this.n;
    }

    public ColorStateList getTrackTintList() {
        return this.f1142o;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1143p;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1137i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.V.end();
        this.V = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1134d0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.n;
        Rect rect = this.f1136b0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.M;
        int i11 = this.O;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1137i;
        if (drawable != null) {
            if (!this.f1149v || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c10 = j0.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c10.left;
                rect.right -= c10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.S : this.T;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.R;
            TextPaint textPaint = this.Q;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1150w : this.f1152y;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        super.onLayout(z10, i10, i11, i12, i13);
        int i18 = 0;
        if (this.f1137i != null) {
            Drawable drawable = this.n;
            Rect rect = this.f1136b0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c10 = j0.c(this.f1137i);
            i14 = Math.max(0, c10.left - rect.left);
            i18 = Math.max(0, c10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (n1.a(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.I + i15) - i14) - i18;
        } else {
            width = (getWidth() - getPaddingRight()) - i18;
            i15 = (width - this.I) + i14 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i19 = this.J;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i19 / 2);
            i16 = i19 + height;
            i17 = height;
        } else if (gravity != 80) {
            i17 = getPaddingTop();
            i16 = this.J + i17;
        } else {
            i16 = getHeight() - getPaddingBottom();
            i17 = i16 - this.J;
        }
        this.L = i15;
        this.M = i17;
        this.O = i16;
        this.N = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.A) {
            if (this.S == null) {
                this.S = c(this.f1151x);
            }
            if (this.T == null) {
                this.T = c(this.f1153z);
            }
        }
        Drawable drawable = this.f1137i;
        int i14 = 0;
        Rect rect = this.f1136b0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1137i.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1137i.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        this.K = Math.max(this.A ? (this.f1146s * 2) + Math.max(this.S.getWidth(), this.T.getWidth()) : 0, i12);
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.n.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f1137i;
        if (drawable3 != null) {
            Rect c10 = j0.c(drawable3);
            i15 = Math.max(i15, c10.left);
            i16 = Math.max(i16, c10.right);
        }
        int max = this.P ? Math.max(this.f1147t, (this.K * 2) + i15 + i16) : this.f1147t;
        int max2 = Math.max(i14, i13);
        this.I = max;
        this.J = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1150w : this.f1152y;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
        if (r0 > 0.0f) goto L58;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        float f10;
        VelocityTracker velocityTracker = this.F;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.C;
        boolean z12 = false;
        if (actionMasked != 0) {
            float f11 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else {
                    int i11 = this.B;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            float x3 = motionEvent.getX();
                            int thumbScrollRange = getThumbScrollRange();
                            float f12 = x3 - this.D;
                            if (thumbScrollRange != 0) {
                                f10 = f12 / thumbScrollRange;
                            } else if (f12 > 0.0f) {
                                f10 = 1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (n1.a(this)) {
                                f10 = -f10;
                            }
                            float f13 = this.H;
                            float f14 = f10 + f13;
                            if (f14 >= 0.0f) {
                                if (f14 > 1.0f) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = f14;
                                }
                            }
                            if (f11 != f13) {
                                this.D = x3;
                                setThumbPosition(f11);
                            }
                            return true;
                        }
                    } else {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (Math.abs(x10 - this.D) > i10 || Math.abs(y10 - this.E) > i10) {
                            this.B = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.D = x10;
                            this.E = y10;
                            return true;
                        }
                    }
                }
            }
            if (this.B == 2) {
                this.B = 0;
                if (motionEvent.getAction() == 1 && isEnabled()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isChecked = isChecked();
                if (z10) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.G) {
                        if (n1.a(this)) {
                            if (xVelocity < 0.0f) {
                                z11 = true;
                            }
                            z11 = false;
                        }
                    } else {
                        z11 = getTargetCheckedState();
                    }
                } else {
                    z11 = isChecked;
                }
                if (z11 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z11);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.B = 0;
            velocityTracker.clear();
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled()) {
                if (this.f1137i != null) {
                    int thumbOffset = getThumbOffset();
                    Drawable drawable = this.f1137i;
                    Rect rect = this.f1136b0;
                    drawable.getPadding(rect);
                    int i12 = this.M - i10;
                    int i13 = (this.L + thumbOffset) - i10;
                    int i14 = this.K + i13 + rect.left + rect.right + i10;
                    int i15 = this.O + i10;
                    if (x11 > i13 && x11 < i14 && y11 > i12 && y11 < i15) {
                        z12 = true;
                    }
                }
                if (z12) {
                    this.B = 1;
                    this.D = x11;
                    this.E = y11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f1150w;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                new a3.h0().e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f1152y;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, a3.v0> weakHashMap2 = a3.j0.f188a;
            new a3.h0().e(this, obj2);
        }
        float f10 = 0.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, a3.v0> weakHashMap3 = a3.j0.f188a;
            if (j0.g.c(this)) {
                if (isChecked) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c0, f10);
                this.V = ofFloat;
                ofFloat.setDuration(250L);
                b.a(this.V, true);
                this.V.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f10 = 1.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e3.h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f1150w);
        setTextOffInternal(this.f1152y);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.P = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            requestLayout();
            if (z10) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1149v = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1147t = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1148u = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.Q;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1152y;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
            new a3.h0().e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1150w;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
            new a3.h0().e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1137i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1137i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.H = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(e.a.a(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1146s = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1138j = colorStateList;
        this.f1140l = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1139k = mode;
        this.f1141m = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(e.a.a(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1142o = colorStateList;
        this.f1144q = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1143p = mode;
        this.f1145r = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1137i && drawable != this.n) {
            return false;
        }
        return true;
    }
}
