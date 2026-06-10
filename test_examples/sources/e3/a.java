package e3;

import a3.j0;
import a3.v0;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: y  reason: collision with root package name */
    public static final int f10607y = ViewConfiguration.getTapTimeout();

    /* renamed from: i  reason: collision with root package name */
    public final C0109a f10608i;

    /* renamed from: j  reason: collision with root package name */
    public final AccelerateInterpolator f10609j;

    /* renamed from: k  reason: collision with root package name */
    public final View f10610k;

    /* renamed from: l  reason: collision with root package name */
    public b f10611l;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f10612m;
    public final float[] n;

    /* renamed from: o  reason: collision with root package name */
    public int f10613o;

    /* renamed from: p  reason: collision with root package name */
    public int f10614p;

    /* renamed from: q  reason: collision with root package name */
    public final float[] f10615q;

    /* renamed from: r  reason: collision with root package name */
    public final float[] f10616r;

    /* renamed from: s  reason: collision with root package name */
    public final float[] f10617s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10618t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10619u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10620v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10621w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f10622x;

    /* renamed from: e3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0109a {

        /* renamed from: a  reason: collision with root package name */
        public int f10623a;

        /* renamed from: b  reason: collision with root package name */
        public int f10624b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f10625d;

        /* renamed from: h  reason: collision with root package name */
        public float f10629h;

        /* renamed from: i  reason: collision with root package name */
        public int f10630i;

        /* renamed from: e  reason: collision with root package name */
        public long f10626e = Long.MIN_VALUE;

        /* renamed from: g  reason: collision with root package name */
        public long f10628g = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f10627f = 0;

        public final float a(long j2) {
            long j10 = this.f10626e;
            if (j2 < j10) {
                return 0.0f;
            }
            long j11 = this.f10628g;
            if (j11 >= 0 && j2 >= j11) {
                float f10 = this.f10629h;
                return (a.b(((float) (j2 - j11)) / this.f10630i, 0.0f, 1.0f) * f10) + (1.0f - f10);
            }
            return a.b(((float) (j2 - j10)) / this.f10623a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            a aVar = a.this;
            if (!aVar.f10621w) {
                return;
            }
            boolean z11 = aVar.f10619u;
            C0109a c0109a = aVar.f10608i;
            if (z11) {
                aVar.f10619u = false;
                c0109a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0109a.f10626e = currentAnimationTimeMillis;
                c0109a.f10628g = -1L;
                c0109a.f10627f = currentAnimationTimeMillis;
                c0109a.f10629h = 0.5f;
            }
            if (c0109a.f10628g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0109a.f10628g + c0109a.f10630i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && aVar.e()) {
                boolean z12 = aVar.f10620v;
                View view = aVar.f10610k;
                if (z12) {
                    aVar.f10620v = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0109a.f10627f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = c0109a.a(currentAnimationTimeMillis2);
                    c0109a.f10627f = currentAnimationTimeMillis2;
                    ListView listView = ((e) aVar).f10634z;
                    f.b(listView, (int) (((float) (currentAnimationTimeMillis2 - c0109a.f10627f)) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0109a.f10625d));
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            aVar.f10621w = false;
        }
    }

    public a(View view) {
        C0109a c0109a = new C0109a();
        this.f10608i = c0109a;
        this.f10609j = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f10612m = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f10615q = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f10616r = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f10617s = fArr5;
        this.f10610k = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f10613o = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f10614p = f10607y;
        c0109a.f10623a = 500;
        c0109a.f10624b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i10, float f10, float f11, float f12) {
        float f13;
        float interpolation;
        int i11;
        float b5 = b(this.f10612m[i10] * f11, 0.0f, this.n[i10]);
        float c = c(f11 - f10, b5) - c(f10, b5);
        AccelerateInterpolator accelerateInterpolator = this.f10609j;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else if (c > 0.0f) {
            interpolation = accelerateInterpolator.getInterpolation(c);
        } else {
            f13 = 0.0f;
            i11 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                return 0.0f;
            }
            float f14 = this.f10615q[i10];
            float f15 = this.f10616r[i10];
            float f16 = this.f10617s[i10];
            float f17 = f14 * f12;
            if (i11 > 0) {
                return b(f13 * f17, f15, f16);
            }
            return -b((-f13) * f17, f15, f16);
        }
        f13 = b(interpolation, -1.0f, 1.0f);
        i11 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i11 != 0) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f10613o;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f10621w && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f10619u) {
            this.f10621w = false;
            return;
        }
        C0109a c0109a = this.f10608i;
        c0109a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0109a.f10626e);
        int i12 = c0109a.f10624b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0109a.f10630i = i10;
        c0109a.f10629h = c0109a.a(currentAnimationTimeMillis);
        c0109a.f10628g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        boolean z10;
        C0109a c0109a = this.f10608i;
        float f10 = c0109a.f10625d;
        int abs = (int) (f10 / Math.abs(f10));
        float f11 = c0109a.c;
        int abs2 = (int) (f11 / Math.abs(f11));
        if (abs == 0) {
            return false;
        }
        ListView listView = ((e) this).f10634z;
        int count = listView.getCount();
        if (count != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (abs > 0) {
                if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                }
                z10 = true;
            } else if (abs < 0) {
                if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                }
                z10 = true;
            }
            if (z10) {
                return false;
            }
            return true;
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.f10622x) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                }
            }
            d();
            return false;
        }
        this.f10620v = true;
        this.f10618t = false;
        View view2 = this.f10610k;
        float a10 = a(0, motionEvent.getX(), view.getWidth(), view2.getWidth());
        float a11 = a(1, motionEvent.getY(), view.getHeight(), view2.getHeight());
        C0109a c0109a = this.f10608i;
        c0109a.c = a10;
        c0109a.f10625d = a11;
        if (!this.f10621w && e()) {
            if (this.f10611l == null) {
                this.f10611l = new b();
            }
            this.f10621w = true;
            this.f10619u = true;
            if (!this.f10618t && (i10 = this.f10614p) > 0) {
                b bVar = this.f10611l;
                long j2 = i10;
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.n(view2, bVar, j2);
            } else {
                this.f10611l.run();
            }
            this.f10618t = true;
        }
        return false;
    }
}
