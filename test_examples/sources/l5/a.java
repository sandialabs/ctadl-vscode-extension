package l5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.activity.e;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.g;
import com.noto.R;
import e3.b;
import i4.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import p2.f;
import r2.a;
import u5.j;
import u5.n;

/* loaded from: classes.dex */
public final class a extends g {
    public static final int[] G = {R.attr.state_indeterminate};
    public static final int[] H = {R.attr.state_error};
    public static final int[][] I = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @SuppressLint({"DiscouragedApi"})
    public static final int J = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public int[] A;
    public boolean B;
    public CharSequence C;
    public CompoundButton.OnCheckedChangeListener D;
    public final i4.d E;
    public final C0181a F;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashSet<c> f15793m;
    public final LinkedHashSet<b> n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f15794o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15795p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15796q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15797r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f15798s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f15799t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f15800u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15801v;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f15802w;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f15803x;

    /* renamed from: y  reason: collision with root package name */
    public PorterDuff.Mode f15804y;

    /* renamed from: z  reason: collision with root package name */
    public int f15805z;

    /* renamed from: l5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0181a extends i4.c {
        public C0181a() {
        }

        @Override // i4.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = a.this.f15802w;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        @Override // i4.c
        public final void b(Drawable drawable) {
            a aVar = a.this;
            ColorStateList colorStateList = aVar.f15802w;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(aVar.A, colorStateList.getDefaultColor()));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0182a();

        /* renamed from: i  reason: collision with root package name */
        public int f15807i;

        /* renamed from: l5.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0182a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f15807i = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i10 = this.f15807i;
            if (i10 != 1) {
                if (i10 != 2) {
                    str = "unchecked";
                } else {
                    str = "indeterminate";
                }
            } else {
                str = "checked";
            }
            return e.k(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f15807i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.checkboxStyle, 2132083759), attributeSet, R.attr.checkboxStyle);
        i4.d dVar;
        int next;
        d1 d1Var;
        int i10;
        boolean z10;
        this.f15793m = new LinkedHashSet<>();
        this.n = new LinkedHashSet<>();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            dVar = new i4.d(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal<TypedValue> threadLocal = f.f16726a;
            Drawable a10 = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            dVar.f11751i = a10;
            a10.setCallback(dVar.n);
            new d.c(dVar.f11751i.getConstantState());
        } else {
            int i11 = i4.d.f11738o;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    Resources resources2 = context2.getResources();
                    Resources.Theme theme2 = context2.getTheme();
                    i4.d dVar2 = new i4.d(context2);
                    dVar2.inflate(resources2, xml, asAttributeSet, theme2);
                    dVar = dVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e10) {
                e = e10;
                Log.e("AnimatedVDCompat", "parser error", e);
                dVar = null;
                this.E = dVar;
                this.F = new C0181a();
                Context context3 = getContext();
                this.f15799t = e3.b.a(this);
                this.f15802w = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr = a1.b.f32i0;
                j.a(context3, attributeSet, R.attr.checkboxStyle, 2132083759);
                j.b(context3, attributeSet, iArr, R.attr.checkboxStyle, 2132083759, new int[0]);
                d1Var = new d1(context3, context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2132083759));
                this.f15800u = d1Var.e(2);
                if (this.f15799t != null) {
                    i10 = d1Var.i(0, 0);
                    int i12 = d1Var.i(1, 0);
                    if (i10 != J) {
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
                this.f15803x = x5.c.b(context3, d1Var, 3);
                this.f15804y = n.f(d1Var.h(4, -1), PorterDuff.Mode.SRC_IN);
                this.f15795p = d1Var.a(10, false);
                this.f15796q = d1Var.a(6, true);
                this.f15797r = d1Var.a(9, false);
                this.f15798s = d1Var.k(8);
                if (d1Var.l(7)) {
                }
                d1Var.n();
                b();
            } catch (XmlPullParserException e11) {
                e = e11;
                Log.e("AnimatedVDCompat", "parser error", e);
                dVar = null;
                this.E = dVar;
                this.F = new C0181a();
                Context context32 = getContext();
                this.f15799t = e3.b.a(this);
                this.f15802w = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr2 = a1.b.f32i0;
                j.a(context32, attributeSet, R.attr.checkboxStyle, 2132083759);
                j.b(context32, attributeSet, iArr2, R.attr.checkboxStyle, 2132083759, new int[0]);
                d1Var = new d1(context32, context32.obtainStyledAttributes(attributeSet, iArr2, R.attr.checkboxStyle, 2132083759));
                this.f15800u = d1Var.e(2);
                if (this.f15799t != null) {
                }
                this.f15803x = x5.c.b(context32, d1Var, 3);
                this.f15804y = n.f(d1Var.h(4, -1), PorterDuff.Mode.SRC_IN);
                this.f15795p = d1Var.a(10, false);
                this.f15796q = d1Var.a(6, true);
                this.f15797r = d1Var.a(9, false);
                this.f15798s = d1Var.k(8);
                if (d1Var.l(7)) {
                }
                d1Var.n();
                b();
            }
        }
        this.E = dVar;
        this.F = new C0181a();
        Context context322 = getContext();
        this.f15799t = e3.b.a(this);
        this.f15802w = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr22 = a1.b.f32i0;
        j.a(context322, attributeSet, R.attr.checkboxStyle, 2132083759);
        j.b(context322, attributeSet, iArr22, R.attr.checkboxStyle, 2132083759, new int[0]);
        d1Var = new d1(context322, context322.obtainStyledAttributes(attributeSet, iArr22, R.attr.checkboxStyle, 2132083759));
        this.f15800u = d1Var.e(2);
        if (this.f15799t != null && x5.b.b(context322, R.attr.isMaterial3Theme, false)) {
            i10 = d1Var.i(0, 0);
            int i122 = d1Var.i(1, 0);
            if (i10 != J && i122 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                super.setButtonDrawable((Drawable) null);
                this.f15799t = e.a.a(context322, R.drawable.mtrl_checkbox_button);
                this.f15801v = true;
                if (this.f15800u == null) {
                    this.f15800u = e.a.a(context322, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f15803x = x5.c.b(context322, d1Var, 3);
        this.f15804y = n.f(d1Var.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f15795p = d1Var.a(10, false);
        this.f15796q = d1Var.a(6, true);
        this.f15797r = d1Var.a(9, false);
        this.f15798s = d1Var.k(8);
        if (d1Var.l(7)) {
            setCheckedState(d1Var.h(7, 0));
        }
        d1Var.n();
        b();
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i10;
        int i11 = this.f15805z;
        if (i11 == 1) {
            resources = getResources();
            i10 = R.string.mtrl_checkbox_state_description_checked;
        } else if (i11 == 0) {
            resources = getResources();
            i10 = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i10 = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i10);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15794o == null) {
            int T = a1.b.T(this, R.attr.colorControlActivated);
            int T2 = a1.b.T(this, R.attr.colorError);
            int T3 = a1.b.T(this, R.attr.colorSurface);
            int T4 = a1.b.T(this, R.attr.colorOnSurface);
            this.f15794o = new ColorStateList(I, new int[]{a1.b.p0(1.0f, T3, T2), a1.b.p0(1.0f, T3, T), a1.b.p0(0.54f, T3, T4), a1.b.p0(0.38f, T3, T4), a1.b.p0(0.38f, T3, T4)});
        }
        return this.f15794o;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f15802w;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        boolean z10;
        i4.e eVar;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f15799t;
        ColorStateList colorStateList3 = this.f15802w;
        PorterDuff.Mode b5 = b.a.b(this);
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        if (i10 < 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15799t = q5.a.b(drawable, colorStateList3, b5, z10);
        Drawable drawable2 = this.f15800u;
        ColorStateList colorStateList4 = this.f15803x;
        PorterDuff.Mode mode = this.f15804y;
        if (i10 >= 23) {
            z11 = false;
        }
        this.f15800u = q5.a.b(drawable2, colorStateList4, mode, z11);
        if (this.f15801v) {
            i4.d dVar = this.E;
            if (dVar != null) {
                Drawable drawable3 = dVar.f11751i;
                C0181a c0181a = this.F;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0181a.f11737a == null) {
                        c0181a.f11737a = new i4.b(c0181a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0181a.f11737a);
                }
                ArrayList<i4.c> arrayList = dVar.f11742m;
                d.b bVar = dVar.f11739j;
                if (arrayList != null && c0181a != null) {
                    arrayList.remove(c0181a);
                    if (dVar.f11742m.size() == 0 && (eVar = dVar.f11741l) != null) {
                        bVar.f11745b.removeListener(eVar);
                        dVar.f11741l = null;
                    }
                }
                Drawable drawable4 = dVar.f11751i;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0181a.f11737a == null) {
                        c0181a.f11737a = new i4.b(c0181a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0181a.f11737a);
                } else if (c0181a != null) {
                    if (dVar.f11742m == null) {
                        dVar.f11742m = new ArrayList<>();
                    }
                    if (!dVar.f11742m.contains(c0181a)) {
                        dVar.f11742m.add(c0181a);
                        if (dVar.f11741l == null) {
                            dVar.f11741l = new i4.e(dVar);
                        }
                        bVar.f11745b.addListener(dVar.f11741l);
                    }
                }
            }
            if (i10 >= 24) {
                Drawable drawable5 = this.f15799t;
                if ((drawable5 instanceof AnimatedStateListDrawable) && dVar != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                    ((AnimatedStateListDrawable) this.f15799t).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
                }
            }
        }
        Drawable drawable6 = this.f15799t;
        if (drawable6 != null && (colorStateList2 = this.f15802w) != null) {
            a.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f15800u;
        if (drawable7 != null && (colorStateList = this.f15803x) != null) {
            a.b.h(drawable7, colorStateList);
        }
        super.setButtonDrawable(q5.a.a(this.f15799t, this.f15800u));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f15799t;
    }

    public Drawable getButtonIconDrawable() {
        return this.f15800u;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f15803x;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f15804y;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f15802w;
    }

    public int getCheckedState() {
        return this.f15805z;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f15798s;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f15805z == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15795p && this.f15802w == null && this.f15803x == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        if (this.f15797r) {
            View.mergeDrawableStates(onCreateDrawableState, H);
        }
        this.A = q5.a.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (this.f15796q && TextUtils.isEmpty(getText()) && (a10 = e3.b.a(this)) != null) {
            if (n.e(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f15797r) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f15798s));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f15807i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f15807i = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(e.a.a(getContext(), i10));
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f15799t = drawable;
        this.f15801v = false;
        b();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f15800u = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(e.a.a(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f15803x == colorStateList) {
            return;
        }
        this.f15803x = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f15804y == mode) {
            return;
        }
        this.f15804y = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f15802w == colorStateList) {
            return;
        }
        this.f15802w = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f15796q = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f15805z != i10) {
            this.f15805z = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.C == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.B) {
                return;
            }
            this.B = true;
            LinkedHashSet<b> linkedHashSet = this.n;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.f15805z != 2 && (onCheckedChangeListener = this.D) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService(AutofillManager.class);
                AutofillManager autofillManager = (AutofillManager) systemService;
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
            }
            this.B = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f15798s = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f15797r == z10) {
            return;
        }
        this.f15797r = z10;
        refreshDrawableState();
        Iterator<c> it = this.f15793m.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.D = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.C = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        ColorStateList colorStateList;
        this.f15795p = z10;
        if (z10) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        b.a.c(this, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
