package d6;

import a3.j0;
import a3.v0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import b3.g;
import b6.g;
import b6.k;
import com.noto.R;
import d6.a;
import d6.b;
import d6.c;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import ma.i;
import r2.a;
import u5.h;
import u5.j;
import u5.n;

/* loaded from: classes.dex */
public abstract class c<S extends c<S, L, T>, L extends d6.a<S>, T extends d6.b<S>> extends View {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public float L;
    public MotionEvent M;
    public boolean N;
    public float O;
    public float P;
    public ArrayList<Float> Q;
    public int R;
    public int S;
    public float T;
    public float[] U;
    public boolean V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f10398a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f10399b0;
    public ColorStateList c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f10400d0;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f10401e0;

    /* renamed from: f0  reason: collision with root package name */
    public ColorStateList f10402f0;

    /* renamed from: g0  reason: collision with root package name */
    public ColorStateList f10403g0;

    /* renamed from: h0  reason: collision with root package name */
    public final g f10404h0;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f10405i;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f10406i0;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f10407j;

    /* renamed from: j0  reason: collision with root package name */
    public List<Drawable> f10408j0;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f10409k;

    /* renamed from: k0  reason: collision with root package name */
    public float f10410k0;

    /* renamed from: l  reason: collision with root package name */
    public final Paint f10411l;

    /* renamed from: l0  reason: collision with root package name */
    public int f10412l0;

    /* renamed from: m  reason: collision with root package name */
    public final Paint f10413m;
    public final Paint n;

    /* renamed from: o  reason: collision with root package name */
    public final C0104c f10414o;

    /* renamed from: p  reason: collision with root package name */
    public final AccessibilityManager f10415p;

    /* renamed from: q  reason: collision with root package name */
    public c<S, L, T>.b f10416q;

    /* renamed from: r  reason: collision with root package name */
    public int f10417r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f10418s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f10419t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f10420u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10421v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f10422w;

    /* renamed from: x  reason: collision with root package name */
    public ValueAnimator f10423x;

    /* renamed from: y  reason: collision with root package name */
    public final int f10424y;

    /* renamed from: z  reason: collision with root package name */
    public int f10425z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            c cVar = c.this;
            Iterator it = cVar.f10418s.iterator();
            while (it.hasNext()) {
                j6.a aVar = (j6.a) it.next();
                aVar.T = 1.2f;
                aVar.R = floatValue;
                aVar.S = floatValue;
                aVar.U = e5.a.a(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                aVar.invalidateSelf();
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(cVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public int f10427i = -1;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f10414o.x(this.f10427i, 4);
        }
    }

    /* renamed from: d6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0104c extends i3.a {

        /* renamed from: q  reason: collision with root package name */
        public final c<?, ?, ?> f10429q;

        /* renamed from: r  reason: collision with root package name */
        public final Rect f10430r;

        public C0104c(c<?, ?, ?> cVar) {
            super(cVar);
            this.f10430r = new Rect();
            this.f10429q = cVar;
        }

        @Override // i3.a
        public final int n(float f10, float f11) {
            int i10 = 0;
            while (true) {
                c<?, ?, ?> cVar = this.f10429q;
                if (i10 >= cVar.getValues().size()) {
                    return -1;
                }
                Rect rect = this.f10430r;
                cVar.p(i10, rect);
                if (rect.contains((int) f10, (int) f11)) {
                    return i10;
                }
                i10++;
            }
        }

        @Override // i3.a
        public final void o(ArrayList arrayList) {
            for (int i10 = 0; i10 < this.f10429q.getValues().size(); i10++) {
                arrayList.add(Integer.valueOf(i10));
            }
        }

        @Override // i3.a
        public final boolean s(int i10, int i11, Bundle bundle) {
            float f10;
            float f11;
            c<?, ?, ?> cVar = this.f10429q;
            if (!cVar.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && cVar.o(i10, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                }
                return false;
            }
            float f12 = cVar.T;
            if (f12 == 0.0f) {
                f12 = 1.0f;
            }
            if ((cVar.P - cVar.O) / f12 > 20) {
                f12 *= Math.round(f10 / f11);
            }
            if (i11 == 8192) {
                f12 = -f12;
            }
            if (cVar.g()) {
                f12 = -f12;
            }
            float floatValue = cVar.getValues().get(i10).floatValue() + f12;
            float valueFrom = cVar.getValueFrom();
            float valueTo = cVar.getValueTo();
            if (floatValue < valueFrom) {
                floatValue = valueFrom;
            } else if (floatValue > valueTo) {
                floatValue = valueTo;
            }
            if (!cVar.o(i10, floatValue)) {
                return false;
            }
            cVar.q();
            cVar.postInvalidate();
            p(i10);
            return true;
        }

        @Override // i3.a
        public final void u(int i10, b3.g gVar) {
            String str;
            String str2;
            Context context;
            int i11;
            gVar.b(g.a.f6370q);
            c<?, ?, ?> cVar = this.f10429q;
            List<Float> values = cVar.getValues();
            float floatValue = values.get(i10).floatValue();
            float valueFrom = cVar.getValueFrom();
            float valueTo = cVar.getValueTo();
            if (cVar.isEnabled()) {
                if (floatValue > valueFrom) {
                    gVar.a(8192);
                }
                if (floatValue < valueTo) {
                    gVar.a(4096);
                }
            }
            AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue);
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
            accessibilityNodeInfo.setRangeInfo(obtain);
            gVar.i(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (cVar.getContentDescription() != null) {
                sb.append(cVar.getContentDescription());
                sb.append(",");
            }
            if (((int) floatValue) == floatValue) {
                str = "%.0f";
            } else {
                str = "%.2f";
            }
            String format = String.format(str, Float.valueOf(floatValue));
            String string = cVar.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                if (i10 == cVar.getValues().size() - 1) {
                    context = cVar.getContext();
                    i11 = R.string.material_slider_range_end;
                } else if (i10 == 0) {
                    context = cVar.getContext();
                    i11 = R.string.material_slider_range_start;
                } else {
                    str2 = "";
                    string = str2;
                }
                str2 = context.getString(i11);
                string = str2;
            }
            sb.append(String.format(Locale.US, "%s, %s", string, format));
            gVar.l(sb.toString());
            Rect rect = this.f10430r;
            cVar.p(i10, rect);
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public float f10431i;

        /* renamed from: j  reason: collision with root package name */
        public float f10432j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList<Float> f10433k;

        /* renamed from: l  reason: collision with root package name */
        public float f10434l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f10435m;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
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
            this.f10431i = parcel.readFloat();
            this.f10432j = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f10433k = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f10434l = parcel.readFloat();
            this.f10435m = parcel.createBooleanArray()[0];
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f10431i);
            parcel.writeFloat(this.f10432j);
            parcel.writeList(this.f10433k);
            parcel.writeFloat(this.f10434l);
            parcel.writeBooleanArray(new boolean[]{this.f10435m});
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(i6.a.a(context, attributeSet, R.attr.sliderStyle, 2132083805), attributeSet, R.attr.sliderStyle);
        this.f10418s = new ArrayList();
        this.f10419t = new ArrayList();
        this.f10420u = new ArrayList();
        this.f10421v = false;
        this.N = false;
        this.Q = new ArrayList<>();
        this.R = -1;
        this.S = -1;
        this.T = 0.0f;
        this.V = true;
        this.f10398a0 = false;
        b6.g gVar = new b6.g();
        this.f10404h0 = gVar;
        this.f10408j0 = Collections.emptyList();
        this.f10412l0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f10405i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f10407j = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f10409k = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f10411l = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f10413m = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.n = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.D = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f10425z = dimensionPixelOffset;
        this.H = dimensionPixelOffset;
        this.A = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.B = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.K = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        TypedArray d5 = j.d(context2, attributeSet, a1.b.f53t0, R.attr.sliderStyle, 2132083805, new int[0]);
        this.f10417r = d5.getResourceId(8, 2132083839);
        this.O = d5.getFloat(3, 0.0f);
        this.P = d5.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.O));
        this.T = d5.getFloat(2, 0.0f);
        this.C = (int) Math.ceil(d5.getDimension(9, (float) Math.ceil(n.b(getContext(), 48))));
        int i11 = 19;
        boolean hasValue = d5.hasValue(19);
        int i12 = hasValue ? 19 : 21;
        if (!hasValue) {
            i11 = 20;
        }
        ColorStateList a10 = x5.c.a(context2, d5, i12);
        if (a10 == null) {
            a10 = n2.a.c(context2, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a10);
        ColorStateList a11 = x5.c.a(context2, d5, i11);
        if (a11 == null) {
            a11 = n2.a.c(context2, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(a11);
        gVar.n(x5.c.a(context2, d5, 10));
        if (d5.hasValue(13)) {
            setThumbStrokeColor(x5.c.a(context2, d5, 13));
        }
        setThumbStrokeWidth(d5.getDimension(14, 0.0f));
        ColorStateList a12 = x5.c.a(context2, d5, 5);
        if (a12 == null) {
            a12 = n2.a.c(context2, R.color.material_slider_halo_color);
        }
        setHaloTintList(a12);
        this.V = d5.getBoolean(18, true);
        int i13 = 15;
        boolean hasValue2 = d5.hasValue(15);
        int i14 = hasValue2 ? 15 : 17;
        if (!hasValue2) {
            i13 = 16;
        }
        ColorStateList a13 = x5.c.a(context2, d5, i14);
        if (a13 == null) {
            a13 = n2.a.c(context2, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a13);
        ColorStateList a14 = x5.c.a(context2, d5, i13);
        if (a14 == null) {
            a14 = n2.a.c(context2, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a14);
        setThumbRadius(d5.getDimensionPixelSize(12, 0));
        setHaloRadius(d5.getDimensionPixelSize(6, 0));
        setThumbElevation(d5.getDimension(11, 0.0f));
        setTrackHeight(d5.getDimensionPixelSize(22, 0));
        setLabelBehavior(d5.getInt(7, 0));
        if (!d5.getBoolean(0, true)) {
            setEnabled(false);
        }
        d5.recycle();
        setFocusable(true);
        setClickable(true);
        gVar.r(2);
        this.f10424y = ViewConfiguration.get(context2).getScaledTouchSlop();
        C0104c c0104c = new C0104c(this);
        this.f10414o = c0104c;
        j0.p(this, c0104c);
        this.f10415p = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.Q.size() == 1) {
            floatValue2 = this.O;
        }
        float k3 = k(floatValue2);
        float k10 = k(floatValue);
        return g() ? new float[]{k10, k3} : new float[]{k3, k10};
    }

    private float getValueOfTouchPosition() {
        double d5;
        float f10;
        int i10;
        float f11 = this.f10410k0;
        float f12 = this.T;
        if (f12 > 0.0f) {
            d5 = Math.round(f11 * i10) / ((int) ((this.P - this.O) / f12));
        } else {
            d5 = f11;
        }
        if (g()) {
            d5 = 1.0d - d5;
        }
        float f13 = this.P;
        return (float) ((d5 * (f13 - f10)) + this.O);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.f10410k0;
        if (g()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.P;
        float f12 = this.O;
        return a4.b.f(f11, f12, f10, f12);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        x5.d dVar;
        int i10;
        int i11;
        int i12;
        ViewGroup c;
        int resourceId;
        j0.c d5;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.Q.size() == arrayList.size() && this.Q.equals(arrayList)) {
                return;
            }
            this.Q = arrayList;
            int i13 = 1;
            this.f10399b0 = true;
            this.S = 0;
            q();
            ArrayList arrayList2 = this.f10418s;
            if (arrayList2.size() > this.Q.size()) {
                List<j6.a> subList = arrayList2.subList(this.Q.size(), arrayList2.size());
                for (j6.a aVar : subList) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    if (j0.g.b(this) && (d5 = n.d(this)) != null) {
                        ((ViewOverlay) d5.f12625b).remove(aVar);
                        ViewGroup c10 = n.c(this);
                        if (c10 == null) {
                            aVar.getClass();
                        } else {
                            c10.removeOnLayoutChangeListener(aVar.J);
                        }
                    }
                }
                subList.clear();
            }
            while (arrayList2.size() < this.Q.size()) {
                Context context = getContext();
                int i14 = this.f10417r;
                j6.a aVar2 = new j6.a(context, i14);
                TypedArray d10 = j.d(aVar2.G, null, a1.b.B0, 0, i14, new int[0]);
                Context context2 = aVar2.G;
                aVar2.P = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
                k kVar = aVar2.f6391i.f6409a;
                kVar.getClass();
                k.a aVar3 = new k.a(kVar);
                aVar3.f6453k = aVar2.x();
                aVar2.setShapeAppearanceModel(new k(aVar3));
                CharSequence text = d10.getText(6);
                boolean equals = TextUtils.equals(aVar2.F, text);
                h hVar = aVar2.I;
                if (!equals) {
                    aVar2.F = text;
                    hVar.f17817d = true;
                    aVar2.invalidateSelf();
                }
                if (d10.hasValue(0) && (resourceId = d10.getResourceId(0, 0)) != 0) {
                    dVar = new x5.d(context2, resourceId);
                } else {
                    dVar = null;
                }
                if (dVar != null && d10.hasValue(1)) {
                    dVar.f18642j = x5.c.a(context2, d10, 1);
                }
                hVar.b(dVar, context2);
                TypedValue c11 = x5.b.c(R.attr.colorOnBackground, context2, j6.a.class.getCanonicalName());
                int i15 = c11.resourceId;
                if (i15 != 0) {
                    i10 = n2.a.b(context2, i15);
                } else {
                    i10 = c11.data;
                }
                TypedValue c12 = x5.b.c(16842801, context2, j6.a.class.getCanonicalName());
                int i16 = c12.resourceId;
                if (i16 != 0) {
                    i11 = n2.a.b(context2, i16);
                } else {
                    i11 = c12.data;
                }
                aVar2.n(ColorStateList.valueOf(d10.getColor(7, q2.a.b(q2.a.d(i10, 153), q2.a.d(i11, 229)))));
                TypedValue c13 = x5.b.c(R.attr.colorSurface, context2, j6.a.class.getCanonicalName());
                int i17 = c13.resourceId;
                if (i17 != 0) {
                    i12 = n2.a.b(context2, i17);
                } else {
                    i12 = c13.data;
                }
                aVar2.s(ColorStateList.valueOf(i12));
                aVar2.L = d10.getDimensionPixelSize(2, 0);
                aVar2.M = d10.getDimensionPixelSize(4, 0);
                aVar2.N = d10.getDimensionPixelSize(5, 0);
                aVar2.O = d10.getDimensionPixelSize(3, 0);
                d10.recycle();
                arrayList2.add(aVar2);
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                if (j0.g.b(this) && (c = n.c(this)) != null) {
                    int[] iArr = new int[2];
                    c.getLocationOnScreen(iArr);
                    aVar2.Q = iArr[0];
                    c.getWindowVisibleDisplayFrame(aVar2.K);
                    c.addOnLayoutChangeListener(aVar2.J);
                }
            }
            if (arrayList2.size() == 1) {
                i13 = 0;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                j6.a aVar4 = (j6.a) it.next();
                aVar4.f6391i.f6418k = i13;
                aVar4.invalidateSelf();
            }
            Iterator it2 = this.f10419t.iterator();
            while (it2.hasNext()) {
                d6.a aVar5 = (d6.a) it2.next();
                Iterator<Float> it3 = this.Q.iterator();
                while (it3.hasNext()) {
                    aVar5.a(this, it3.next().floatValue());
                }
            }
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public final void a(Drawable drawable) {
        int i10 = this.I * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i10, i10);
            return;
        }
        float max = i10 / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r2 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b() {
        int i10 = this.E / 2;
        int i11 = this.F;
        boolean z10 = true;
        int i12 = 0;
        if (i11 != 1) {
            if (i11 != 3) {
                z10 = false;
            }
        }
        i12 = ((j6.a) this.f10418s.get(0)).getIntrinsicHeight();
        return i10 + i12;
    }

    public final ValueAnimator c(boolean z10) {
        float f10;
        ValueAnimator valueAnimator;
        int c;
        Context context;
        TimeInterpolator timeInterpolator;
        int i10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            valueAnimator = this.f10423x;
        } else {
            valueAnimator = this.f10422w;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        if (z10) {
            c = v5.a.c(getContext(), R.attr.motionDurationMedium4, 83);
            context = getContext();
            timeInterpolator = e5.a.f10650e;
            i10 = R.attr.motionEasingEmphasizedInterpolator;
        } else {
            c = v5.a.c(getContext(), R.attr.motionDurationShort3, 117);
            context = getContext();
            timeInterpolator = e5.a.c;
            i10 = R.attr.motionEasingEmphasizedAccelerateInterpolator;
        }
        TimeInterpolator d5 = v5.a.d(context, i10, timeInterpolator);
        ofFloat.setDuration(c);
        ofFloat.setInterpolator(d5);
        ofFloat.addUpdateListener(new a());
        return ofFloat;
    }

    public final int d(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f10414o.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f10405i.setColor(d(this.f10403g0));
        this.f10407j.setColor(d(this.f10402f0));
        this.f10413m.setColor(d(this.f10401e0));
        this.n.setColor(d(this.f10400d0));
        Iterator it = this.f10418s.iterator();
        while (it.hasNext()) {
            j6.a aVar = (j6.a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        b6.g gVar = this.f10404h0;
        if (gVar.isStateful()) {
            gVar.setState(getDrawableState());
        }
        Paint paint = this.f10411l;
        paint.setColor(d(this.c0));
        paint.setAlpha(63);
    }

    public final boolean e() {
        ViewParent parent = getParent();
        while (true) {
            boolean z10 = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) ? true : true) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    public final boolean f(float f10) {
        double doubleValue = new BigDecimal(Float.toString(f10)).divide(new BigDecimal(Float.toString(this.T)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean g() {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.d(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f10414o.f11698k;
    }

    public int getActiveThumbIndex() {
        return this.R;
    }

    public int getFocusedThumbIndex() {
        return this.S;
    }

    public int getHaloRadius() {
        return this.J;
    }

    public ColorStateList getHaloTintList() {
        return this.c0;
    }

    public int getLabelBehavior() {
        return this.F;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.T;
    }

    public float getThumbElevation() {
        return this.f10404h0.f6391i.n;
    }

    public int getThumbRadius() {
        return this.I;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f10404h0.f6391i.f6411d;
    }

    public float getThumbStrokeWidth() {
        return this.f10404h0.f6391i.f6418k;
    }

    public ColorStateList getThumbTintList() {
        return this.f10404h0.f6391i.c;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f10400d0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f10401e0;
    }

    public ColorStateList getTickTintList() {
        if (this.f10401e0.equals(this.f10400d0)) {
            return this.f10400d0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f10402f0;
    }

    public int getTrackHeight() {
        return this.G;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f10403g0;
    }

    public int getTrackSidePadding() {
        return this.H;
    }

    public ColorStateList getTrackTintList() {
        if (this.f10403g0.equals(this.f10402f0)) {
            return this.f10402f0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.W;
    }

    public float getValueFrom() {
        return this.O;
    }

    public float getValueTo() {
        return this.P;
    }

    public List<Float> getValues() {
        return new ArrayList(this.Q);
    }

    public final void h() {
        if (this.T <= 0.0f) {
            return;
        }
        s();
        int min = Math.min((int) (((this.P - this.O) / this.T) + 1.0f), (this.W / (this.G * 2)) + 1);
        float[] fArr = this.U;
        if (fArr == null || fArr.length != min * 2) {
            this.U = new float[min * 2];
        }
        float f10 = this.W / (min - 1);
        for (int i10 = 0; i10 < min * 2; i10 += 2) {
            float[] fArr2 = this.U;
            fArr2[i10] = ((i10 / 2.0f) * f10) + this.H;
            fArr2[i10 + 1] = b();
        }
    }

    public final boolean i(int i10) {
        int i11 = this.S;
        long j2 = i11 + i10;
        long size = this.Q.size() - 1;
        if (j2 < 0) {
            j2 = 0;
        } else if (j2 > size) {
            j2 = size;
        }
        int i12 = (int) j2;
        this.S = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.R != -1) {
            this.R = i12;
        }
        q();
        postInvalidate();
        return true;
    }

    public final void j(int i10) {
        if (g()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        i(i10);
    }

    public final float k(float f10) {
        float f11 = this.O;
        float f12 = (f10 - f11) / (this.P - f11);
        return g() ? 1.0f - f12 : f12;
    }

    public final void l() {
        Iterator it = this.f10420u.iterator();
        while (it.hasNext()) {
            ((d6.b) it.next()).b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        if ((r8 - r3) < 0.0f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m() {
        boolean z10;
        if (this.R != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float k3 = (k(valueOfTouchPositionAbsolute) * this.W) + this.H;
        this.R = 0;
        float abs = Math.abs(this.Q.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.Q.size(); i10++) {
            float abs2 = Math.abs(this.Q.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float k10 = (k(this.Q.get(i10).floatValue()) * this.W) + this.H;
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (g()) {
                if (k10 - k3 > 0.0f) {
                    z10 = true;
                }
                z10 = false;
            }
            if (Float.compare(abs2, abs) >= 0) {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(k10 - k3) < this.f10424y) {
                    this.R = -1;
                    return false;
                } else if (!z10) {
                }
            }
            this.R = i10;
            abs = abs2;
        }
        if (this.R != -1) {
            return true;
        }
        return false;
    }

    public final void n(j6.a aVar, float f10) {
        String str;
        if (((int) f10) == f10) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, Float.valueOf(f10));
        if (!TextUtils.equals(aVar.F, format)) {
            aVar.F = format;
            aVar.I.f17817d = true;
            aVar.invalidateSelf();
        }
        int k3 = (this.H + ((int) (k(f10) * this.W))) - (aVar.getIntrinsicWidth() / 2);
        int b5 = b() - (this.K + this.I);
        aVar.setBounds(k3, b5 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + k3, b5);
        Rect rect = new Rect(aVar.getBounds());
        u5.c.b(n.c(this), this, rect);
        aVar.setBounds(rect);
        ((ViewOverlay) n.d(this).f12625b).add(aVar);
    }

    public final boolean o(int i10, float f10) {
        float floatValue;
        float floatValue2;
        this.S = i10;
        if (Math.abs(f10 - this.Q.get(i10).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f10412l0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f11 = this.O;
                minSeparation = a4.b.f(f11, this.P, (minSeparation - this.H) / this.W, f11);
            }
        }
        if (g()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        if (i11 >= this.Q.size()) {
            floatValue = this.P;
        } else {
            floatValue = this.Q.get(i11).floatValue() - minSeparation;
        }
        int i12 = i10 - 1;
        if (i12 < 0) {
            floatValue2 = this.O;
        } else {
            floatValue2 = minSeparation + this.Q.get(i12).floatValue();
        }
        if (f10 < floatValue2) {
            f10 = floatValue2;
        } else if (f10 > floatValue) {
            f10 = floatValue;
        }
        this.Q.set(i10, Float.valueOf(f10));
        Iterator it = this.f10419t.iterator();
        while (it.hasNext()) {
            ((d6.a) it.next()).a(this, this.Q.get(i10).floatValue());
        }
        AccessibilityManager accessibilityManager = this.f10415p;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            c<S, L, T>.b bVar = this.f10416q;
            if (bVar == null) {
                this.f10416q = new b();
            } else {
                removeCallbacks(bVar);
            }
            c<S, L, T>.b bVar2 = this.f10416q;
            bVar2.f10427i = i10;
            postDelayed(bVar2, 200L);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f10418s.iterator();
        while (it.hasNext()) {
            j6.a aVar = (j6.a) it.next();
            ViewGroup c = n.c(this);
            if (c == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                c.getLocationOnScreen(iArr);
                aVar.Q = iArr[0];
                c.getWindowVisibleDisplayFrame(aVar.K);
                c.addOnLayoutChangeListener(aVar.J);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        c<S, L, T>.b bVar = this.f10416q;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.f10421v = false;
        Iterator it = this.f10418s.iterator();
        while (it.hasNext()) {
            j6.a aVar = (j6.a) it.next();
            j0.c d5 = n.d(this);
            if (d5 != null) {
                ((ViewOverlay) d5.f12625b).remove(aVar);
                ViewGroup c = n.c(this);
                if (c == null) {
                    aVar.getClass();
                } else {
                    c.removeOnLayoutChangeListener(aVar.J);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0124, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z10;
        if (this.f10399b0) {
            s();
            h();
        }
        super.onDraw(canvas);
        int b5 = b();
        int i10 = this.W;
        float[] activeRange = getActiveRange();
        int i11 = this.H;
        float f10 = i10;
        float f11 = i11 + (activeRange[1] * f10);
        float f12 = i11 + i10;
        Paint paint = this.f10405i;
        if (f11 < f12) {
            float f13 = b5;
            canvas.drawLine(f11, f13, f12, f13, paint);
        }
        float f14 = this.H;
        float f15 = (activeRange[0] * f10) + f14;
        if (f15 > f14) {
            float f16 = b5;
            canvas.drawLine(f14, f16, f15, f16, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.O) {
            int i12 = this.W;
            float[] activeRange2 = getActiveRange();
            float f17 = this.H;
            float f18 = i12;
            float f19 = b5;
            canvas.drawLine((activeRange2[0] * f18) + f17, f19, (activeRange2[1] * f18) + f17, f19, this.f10407j);
        }
        if (this.V && this.T > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int round = Math.round(activeRange3[0] * ((this.U.length / 2) - 1));
            int round2 = Math.round(activeRange3[1] * ((this.U.length / 2) - 1));
            float[] fArr = this.U;
            int i13 = round * 2;
            Paint paint2 = this.f10413m;
            canvas.drawPoints(fArr, 0, i13, paint2);
            int i14 = round2 * 2;
            canvas.drawPoints(this.U, i13, i14 - i13, this.n);
            float[] fArr2 = this.U;
            canvas.drawPoints(fArr2, i14, fArr2.length - i14, paint2);
        }
        if ((this.N || isFocused()) && isEnabled()) {
            int i15 = this.W;
            if (!(getBackground() instanceof RippleDrawable)) {
                int k3 = (int) ((k(this.Q.get(this.S).floatValue()) * i15) + this.H);
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = this.J;
                    canvas.clipRect(k3 - i16, b5 - i16, k3 + i16, i16 + b5, Region.Op.UNION);
                }
                canvas.drawCircle(k3, b5, this.J, this.f10411l);
            }
        }
        if (this.R == -1) {
            if (this.F == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (isEnabled()) {
            if (this.F != 2) {
                if (!this.f10421v) {
                    this.f10421v = true;
                    ValueAnimator c = c(true);
                    this.f10422w = c;
                    this.f10423x = null;
                    c.start();
                }
                ArrayList arrayList = this.f10418s;
                Iterator it = arrayList.iterator();
                for (int i17 = 0; i17 < this.Q.size() && it.hasNext(); i17++) {
                    if (i17 != this.S) {
                        n((j6.a) it.next(), this.Q.get(i17).floatValue());
                    }
                }
                if (it.hasNext()) {
                    n((j6.a) it.next(), this.Q.get(this.S).floatValue());
                } else {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.Q.size())));
                }
            }
            int i18 = this.W;
            for (int i19 = 0; i19 < this.Q.size(); i19++) {
                float floatValue = this.Q.get(i19).floatValue();
                Drawable drawable = this.f10406i0;
                if (drawable == null) {
                    if (i19 < this.f10408j0.size()) {
                        drawable = this.f10408j0.get(i19);
                    } else {
                        if (!isEnabled()) {
                            canvas.drawCircle((k(floatValue) * i18) + this.H, b5, this.I, this.f10409k);
                        }
                        drawable = this.f10404h0;
                    }
                }
                canvas.save();
                canvas.translate((this.H + ((int) (k(floatValue) * i18))) - (drawable.getBounds().width() / 2.0f), b5 - (drawable.getBounds().height() / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f10421v) {
            this.f10421v = false;
            ValueAnimator c10 = c(false);
            this.f10423x = c10;
            this.f10422w = null;
            c10.addListener(new d6.d(this));
            this.f10423x.start();
        }
        int i182 = this.W;
        while (i19 < this.Q.size()) {
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        C0104c c0104c = this.f10414o;
        if (!z10) {
            this.R = -1;
            c0104c.j(this.S);
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 == 66) {
                        j(Integer.MIN_VALUE);
                    }
                } else {
                    j(Integer.MAX_VALUE);
                }
            } else {
                i(Integer.MIN_VALUE);
            }
        } else {
            i(Integer.MAX_VALUE);
        }
        c0104c.w(this.S);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        float f10;
        float f11;
        boolean i11;
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.Q.size() == 1) {
            this.R = 0;
        }
        Float f12 = null;
        Boolean bool = null;
        if (this.R == -1) {
            if (i10 != 61) {
                if (i10 != 66) {
                    if (i10 != 81) {
                        if (i10 != 69) {
                            if (i10 != 70) {
                                switch (i10) {
                                    case 21:
                                        j(-1);
                                        break;
                                    case 22:
                                        j(1);
                                        break;
                                }
                            }
                        } else {
                            i(-1);
                        }
                        bool = Boolean.TRUE;
                    }
                    i(1);
                    bool = Boolean.TRUE;
                }
                this.R = this.S;
                postInvalidate();
                bool = Boolean.TRUE;
            } else {
                if (keyEvent.hasNoModifiers()) {
                    i11 = i(1);
                } else if (keyEvent.isShiftPressed()) {
                    i11 = i(-1);
                } else {
                    bool = Boolean.FALSE;
                }
                bool = Boolean.valueOf(i11);
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return super.onKeyDown(i10, keyEvent);
        }
        boolean isLongPress = this.f10398a0 | keyEvent.isLongPress();
        this.f10398a0 = isLongPress;
        float f13 = 1.0f;
        if (isLongPress) {
            float f14 = this.T;
            if (f14 != 0.0f) {
                f13 = f14;
            }
            if ((this.P - this.O) / f13 > 20) {
                f13 *= Math.round(f10 / f11);
            }
        } else {
            float f15 = this.T;
            if (f15 != 0.0f) {
                f13 = f15;
            }
        }
        if (i10 != 21) {
            if (i10 != 22) {
                if (i10 != 69) {
                    if (i10 != 70 && i10 != 81) {
                    }
                    f12 = Float.valueOf(f13);
                }
                f13 = -f13;
                f12 = Float.valueOf(f13);
            } else {
                if (g()) {
                    f13 = -f13;
                }
                f12 = Float.valueOf(f13);
            }
        } else {
            if (g()) {
                f12 = Float.valueOf(f13);
            }
            f13 = -f13;
            f12 = Float.valueOf(f13);
        }
        if (f12 != null) {
            if (o(this.R, f12.floatValue() + this.Q.get(this.R).floatValue())) {
                q();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 != 61) {
                if (i10 != 66) {
                    return super.onKeyDown(i10, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return i(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return i(-1);
            }
        }
        this.R = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.f10398a0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r1 != false) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12 = this.E;
        int i13 = this.F;
        boolean z10 = true;
        int i14 = 0;
        if (i13 != 1) {
            if (i13 != 3) {
                z10 = false;
            }
        }
        i14 = ((j6.a) this.f10418s.get(0)).getIntrinsicHeight();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + i14, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.O = dVar.f10431i;
        this.P = dVar.f10432j;
        setValuesInternal(dVar.f10433k);
        this.T = dVar.f10434l;
        if (dVar.f10435m) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f10431i = this.O;
        dVar.f10432j = this.P;
        dVar.f10433k = new ArrayList<>(this.Q);
        dVar.f10434l = this.T;
        dVar.f10435m = hasFocus();
        return dVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.W = Math.max(i10 - (this.H * 2), 0);
        h();
        q();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x3 = motionEvent.getX();
        float f10 = (x3 - this.H) / this.W;
        this.f10410k0 = f10;
        float max = Math.max(0.0f, f10);
        this.f10410k0 = max;
        this.f10410k0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i10 = this.f10424y;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else {
                    if (!this.N) {
                        if (e() && Math.abs(x3 - this.L) < i10) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        l();
                    }
                    if (m()) {
                        this.N = true;
                        o(this.R, getValueOfTouchPosition());
                        q();
                        invalidate();
                    }
                }
            }
            this.N = false;
            MotionEvent motionEvent2 = this.M;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                float f11 = i10;
                if (Math.abs(this.M.getX() - motionEvent.getX()) <= f11 && Math.abs(this.M.getY() - motionEvent.getY()) <= f11 && m()) {
                    l();
                }
            }
            if (this.R != -1) {
                o(this.R, getValueOfTouchPosition());
                this.R = -1;
                Iterator it = this.f10420u.iterator();
                while (it.hasNext()) {
                    ((d6.b) it.next()).a();
                }
            }
            invalidate();
        } else {
            this.L = x3;
            if (!e()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (m()) {
                    requestFocus();
                    this.N = true;
                    o(this.R, getValueOfTouchPosition());
                    q();
                    invalidate();
                    l();
                }
            }
        }
        setPressed(this.N);
        this.M = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        j0.c d5;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (d5 = n.d(this)) == null) {
            return;
        }
        Iterator it = this.f10418s.iterator();
        while (it.hasNext()) {
            ((ViewOverlay) d5.f12625b).remove((j6.a) it.next());
        }
    }

    public final void p(int i10, Rect rect) {
        int k3 = this.H + ((int) (k(getValues().get(i10).floatValue()) * this.W));
        int b5 = b();
        int i11 = this.I;
        int i12 = this.C;
        if (i11 <= i12) {
            i11 = i12;
        }
        int i13 = i11 / 2;
        rect.set(k3 - i13, b5 - i13, k3 + i13, b5 + i13);
    }

    public final void q() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int k3 = (int) ((k(this.Q.get(this.S).floatValue()) * this.W) + this.H);
                int b5 = b();
                int i10 = this.J;
                a.b.f(background, k3 - i10, b5 - i10, k3 + i10, b5 + i10);
            }
        }
    }

    public final void r() {
        boolean z10;
        int max = Math.max(this.D, Math.max(this.G + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.I * 2)));
        boolean z11 = true;
        if (max == this.E) {
            z10 = false;
        } else {
            this.E = max;
            z10 = true;
        }
        int max2 = Math.max(this.I - this.A, 0);
        int max3 = Math.max((this.G - this.B) / 2, 0);
        int max4 = Math.max(max2, max3) + this.f10425z;
        if (this.H == max4) {
            z11 = false;
        } else {
            this.H = max4;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.g.c(this)) {
                this.W = Math.max(getWidth() - (this.H * 2), 0);
                h();
            }
        }
        if (z10) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public final void s() {
        if (this.f10399b0) {
            float f10 = this.O;
            float f11 = this.P;
            if (f10 < f11) {
                if (f11 > f10) {
                    if (this.T > 0.0f && !f(f11 - f10)) {
                        throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.T), Float.valueOf(this.O), Float.valueOf(this.P)));
                    }
                    Iterator<Float> it = this.Q.iterator();
                    while (it.hasNext()) {
                        Float next = it.next();
                        if (next.floatValue() >= this.O && next.floatValue() <= this.P) {
                            if (this.T > 0.0f && !f(next.floatValue() - this.O)) {
                                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.O), Float.valueOf(this.T), Float.valueOf(this.T)));
                            }
                        } else {
                            throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.O), Float.valueOf(this.P)));
                        }
                    }
                    float minSeparation = getMinSeparation();
                    if (minSeparation >= 0.0f) {
                        float f12 = this.T;
                        if (f12 > 0.0f && minSeparation > 0.0f) {
                            if (this.f10412l0 == 1) {
                                if (minSeparation < f12 || !f(minSeparation)) {
                                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.T), Float.valueOf(this.T)));
                                }
                            } else {
                                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.T)));
                            }
                        }
                        float f13 = this.T;
                        if (f13 != 0.0f) {
                            if (((int) f13) != f13) {
                                Log.w("c", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f13)));
                            }
                            float f14 = this.O;
                            if (((int) f14) != f14) {
                                Log.w("c", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f14)));
                            }
                            float f15 = this.P;
                            if (((int) f15) != f15) {
                                Log.w("c", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f15)));
                            }
                        }
                        this.f10399b0 = false;
                        return;
                    }
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
                }
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.P), Float.valueOf(this.O)));
            }
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.O), Float.valueOf(this.P)));
        }
    }

    public void setActiveThumbIndex(int i10) {
        this.R = i10;
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.f10406i0 = newDrawable;
        this.f10408j0.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f10406i0 = null;
        this.f10408j0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.f10408j0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.Q.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.S = i10;
        this.f10414o.w(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.J = i10;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int i11 = this.J;
            if (Build.VERSION.SDK_INT >= 23) {
                rippleDrawable.setRadius(i11);
                return;
            }
            try {
                RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i11));
                return;
            } catch (IllegalAccessException e10) {
                e = e10;
                throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
            } catch (InvocationTargetException e12) {
                e = e12;
                throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
            }
        }
        postInvalidate();
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.c0)) {
            return;
        }
        this.c0 = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f10411l;
        paint.setColor(d(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.F != i10) {
            this.F = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(e eVar) {
    }

    public void setSeparationUnit(int i10) {
        this.f10412l0 = i10;
        this.f10399b0 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.O), Float.valueOf(this.P)));
        }
        if (this.T != f10) {
            this.T = f10;
            this.f10399b0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        this.f10404h0.m(f10);
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(int i10) {
        if (i10 == this.I) {
            return;
        }
        this.I = i10;
        b6.g gVar = this.f10404h0;
        k.a aVar = new k.a();
        float f10 = this.I;
        m0.b v3 = i.v(0);
        aVar.f6444a = v3;
        float b5 = k.a.b(v3);
        if (b5 != -1.0f) {
            aVar.f6447e = new b6.a(b5);
        }
        aVar.f6445b = v3;
        float b10 = k.a.b(v3);
        if (b10 != -1.0f) {
            aVar.f6448f = new b6.a(b10);
        }
        aVar.c = v3;
        float b11 = k.a.b(v3);
        if (b11 != -1.0f) {
            aVar.f6449g = new b6.a(b11);
        }
        aVar.f6446d = v3;
        float b12 = k.a.b(v3);
        if (b12 != -1.0f) {
            aVar.f6450h = new b6.a(b12);
        }
        aVar.c(f10);
        gVar.setShapeAppearanceModel(new k(aVar));
        int i11 = this.I * 2;
        gVar.setBounds(0, 0, i11, i11);
        Drawable drawable = this.f10406i0;
        if (drawable != null) {
            a(drawable);
        }
        for (Drawable drawable2 : this.f10408j0) {
            a(drawable2);
        }
        r();
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f10404h0.s(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(n2.a.c(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        b6.g gVar = this.f10404h0;
        gVar.f6391i.f6418k = f10;
        gVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        b6.g gVar = this.f10404h0;
        if (colorStateList.equals(gVar.f6391i.c)) {
            return;
        }
        gVar.n(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10400d0)) {
            return;
        }
        this.f10400d0 = colorStateList;
        this.n.setColor(d(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10401e0)) {
            return;
        }
        this.f10401e0 = colorStateList;
        this.f10413m.setColor(d(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10402f0)) {
            return;
        }
        this.f10402f0 = colorStateList;
        this.f10407j.setColor(d(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i10) {
        if (this.G != i10) {
            this.G = i10;
            this.f10405i.setStrokeWidth(i10);
            this.f10407j.setStrokeWidth(this.G);
            this.f10413m.setStrokeWidth(this.G / 2.0f);
            this.n.setStrokeWidth(this.G / 2.0f);
            r();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10403g0)) {
            return;
        }
        this.f10403g0 = colorStateList;
        this.f10405i.setColor(d(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.O = f10;
        this.f10399b0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.P = f10;
        this.f10399b0 = true;
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }
}
