package w5;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import java.util.ArrayList;
import w5.b;

/* loaded from: classes.dex */
public abstract class l extends Drawable implements Animatable {

    /* renamed from: s  reason: collision with root package name */
    public static final a f18416s = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Context f18417i;

    /* renamed from: j  reason: collision with root package name */
    public final c f18418j;

    /* renamed from: l  reason: collision with root package name */
    public ValueAnimator f18420l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f18421m;
    public ArrayList n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18422o;

    /* renamed from: p  reason: collision with root package name */
    public float f18423p;

    /* renamed from: r  reason: collision with root package name */
    public int f18425r;

    /* renamed from: q  reason: collision with root package name */
    public final Paint f18424q = new Paint();

    /* renamed from: k  reason: collision with root package name */
    public w5.a f18419k = new w5.a();

    /* loaded from: classes.dex */
    public class a extends Property<l, Float> {
        public a() {
            super(Float.class, "growFraction");
        }

        @Override // android.util.Property
        public final Float get(l lVar) {
            return Float.valueOf(lVar.b());
        }

        @Override // android.util.Property
        public final void set(l lVar, Float f10) {
            l lVar2 = lVar;
            float floatValue = f10.floatValue();
            if (lVar2.f18423p != floatValue) {
                lVar2.f18423p = floatValue;
                lVar2.invalidateSelf();
            }
        }
    }

    public l(Context context, h hVar) {
        this.f18417i = context;
        this.f18418j = hVar;
        setAlpha(255);
    }

    public final float b() {
        boolean z10;
        c cVar = this.f18418j;
        boolean z11 = true;
        if (cVar.f18386e != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (cVar.f18387f == 0) {
                z11 = false;
            }
            if (!z11) {
                return 1.0f;
            }
        }
        return this.f18423p;
    }

    public final boolean c(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        w5.a aVar = this.f18419k;
        ContentResolver contentResolver = this.f18417i.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z12 && f10 > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        return d(z10, z11, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
        if (r2.f18386e != 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z13;
        ValueAnimator valueAnimator3 = this.f18420l;
        a aVar = f18416s;
        if (valueAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f18420l = ofFloat;
            ofFloat.setDuration(500L);
            this.f18420l.setInterpolator(e5.a.f10648b);
            ValueAnimator valueAnimator4 = this.f18420l;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f18420l = valueAnimator4;
            valueAnimator4.addListener(new j(this));
        }
        if (this.f18421m == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, 0.0f);
            this.f18421m = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f18421m.setInterpolator(e5.a.f10648b);
            ValueAnimator valueAnimator5 = this.f18421m;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f18421m = valueAnimator5;
            valueAnimator5.addListener(new k(this));
        }
        boolean z14 = false;
        if (!isVisible() && !z10) {
            return false;
        }
        if (z10) {
            valueAnimator = this.f18420l;
        } else {
            valueAnimator = this.f18421m;
        }
        if (z10) {
            valueAnimator2 = this.f18421m;
        } else {
            valueAnimator2 = this.f18420l;
        }
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                boolean z15 = this.f18422o;
                this.f18422o = true;
                valueAnimator2.cancel();
                this.f18422o = z15;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                boolean z16 = this.f18422o;
                this.f18422o = true;
                valueAnimator.end();
                this.f18422o = z16;
            }
            return super.setVisible(z10, false);
        } else if (z12 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z10 && !super.setVisible(z10, false)) {
                z13 = false;
                c cVar = this.f18418j;
                if (z10) {
                    if (cVar.f18387f != 0) {
                        z14 = true;
                    }
                    if (!z14) {
                        boolean z17 = this.f18422o;
                        this.f18422o = true;
                        valueAnimator.end();
                        this.f18422o = z17;
                        return z13;
                    }
                    if (!z11 && valueAnimator.isPaused()) {
                        valueAnimator.resume();
                        return z13;
                    }
                    valueAnimator.start();
                    return z13;
                }
            }
            z13 = true;
            c cVar2 = this.f18418j;
            if (z10) {
            }
        }
    }

    public final void e(b.d dVar) {
        ArrayList arrayList = this.n;
        if (arrayList == null || !arrayList.contains(dVar)) {
            return;
        }
        this.n.remove(dVar);
        if (this.n.isEmpty()) {
            this.n = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f18425r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Animatable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isRunning() {
        boolean z10;
        boolean z11;
        ValueAnimator valueAnimator = this.f18420l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            z10 = true;
            if (!z10) {
                return true;
            }
            ValueAnimator valueAnimator2 = this.f18421m;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                z11 = true;
                if (!z11) {
                    return true;
                }
                return false;
            }
            z11 = false;
            if (!z11) {
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f18425r = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18424q.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return c(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
