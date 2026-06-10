package com.google.android.material.timepicker;

import a3.j0;
import a3.v0;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.noto.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import u5.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: i  reason: collision with root package name */
    public final ValueAnimator f7482i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7483j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f7484k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7485l;

    /* renamed from: m  reason: collision with root package name */
    public final float f7486m;
    public final Paint n;

    /* renamed from: o  reason: collision with root package name */
    public final RectF f7487o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7488p;

    /* renamed from: q  reason: collision with root package name */
    public float f7489q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f7490r;

    /* renamed from: s  reason: collision with root package name */
    public double f7491s;

    /* renamed from: t  reason: collision with root package name */
    public int f7492t;

    /* renamed from: u  reason: collision with root package name */
    public int f7493u;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f7482i = new ValueAnimator();
        this.f7484k = new ArrayList();
        Paint paint = new Paint();
        this.n = paint;
        this.f7487o = new RectF();
        this.f7493u = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.W, R.attr.materialClockStyle, 2132083827);
        v5.a.c(context, R.attr.motionDurationLong2, 200);
        v5.a.d(context, R.attr.motionEasingEmphasizedInterpolator, e5.a.f10648b);
        this.f7492t = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f7485l = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f7488p = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f7486m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.f7492t * 0.66f) : this.f7492t;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f7482i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10, false);
    }

    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f7489q = f11;
        this.f7491s = Math.toRadians(f11 - 90.0f);
        float a10 = a(this.f7493u);
        float cos = (((float) Math.cos(this.f7491s)) * a10) + (getWidth() / 2);
        float sin = (a10 * ((float) Math.sin(this.f7491s))) + (getHeight() / 2);
        float f12 = this.f7485l;
        this.f7487o.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f7484k.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a10;
        int i10;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float a11 = a(this.f7493u);
        float f11 = height;
        Paint paint = this.n;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f7491s)) * a11) + f10, (a11 * ((float) Math.sin(this.f7491s))) + f11, this.f7485l, paint);
        double sin = Math.sin(this.f7491s);
        paint.setStrokeWidth(this.f7488p);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f7491s) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f10, f11, this.f7486m, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f7482i.isRunning()) {
            b(this.f7489q);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
            } else {
                z10 = this.f7490r;
                if (this.f7483j) {
                    if (((float) Math.hypot(x3 - (getWidth() / 2), y10 - (getHeight() / 2))) <= a(2) + n.b(getContext(), 12)) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.f7493u = i10;
                }
            }
            z11 = false;
        } else {
            this.f7490r = false;
            z10 = false;
            z11 = true;
        }
        boolean z14 = this.f7490r;
        int degrees = ((int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x3 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = degrees;
        if (this.f7489q != f10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 || !z12) {
            if (z12 || z10) {
                b(f10);
            }
            this.f7490r = z14 | z13;
            return true;
        }
        z13 = true;
        this.f7490r = z14 | z13;
        return true;
    }
}
