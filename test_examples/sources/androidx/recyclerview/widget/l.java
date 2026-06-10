package androidx.recyclerview.widget;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l extends RecyclerView.k implements RecyclerView.p {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f5891a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5892b;
    public final StateListDrawable c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f5893d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5894e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5895f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f5896g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f5897h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5898i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5899j;

    /* renamed from: k  reason: collision with root package name */
    public int f5900k;

    /* renamed from: l  reason: collision with root package name */
    public int f5901l;

    /* renamed from: m  reason: collision with root package name */
    public float f5902m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f5903o;

    /* renamed from: p  reason: collision with root package name */
    public float f5904p;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f5907s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f5914z;

    /* renamed from: q  reason: collision with root package name */
    public int f5905q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f5906r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5908t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5909u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f5910v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f5911w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f5912x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f5913y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            int i10 = lVar.A;
            ValueAnimator valueAnimator = lVar.f5914z;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            } else {
                valueAnimator.cancel();
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            boolean z10;
            boolean z11;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            l lVar = l.this;
            int computeVerticalScrollRange = lVar.f5907s.computeVerticalScrollRange();
            int i12 = lVar.f5906r;
            int i13 = computeVerticalScrollRange - i12;
            int i14 = lVar.f5891a;
            if (i13 > 0 && i12 >= i14) {
                z10 = true;
            } else {
                z10 = false;
            }
            lVar.f5908t = z10;
            int computeHorizontalScrollRange = lVar.f5907s.computeHorizontalScrollRange();
            int i15 = lVar.f5905q;
            if (computeHorizontalScrollRange - i15 > 0 && i15 >= i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            lVar.f5909u = z11;
            boolean z12 = lVar.f5908t;
            if (!z12 && !z11) {
                if (lVar.f5910v != 0) {
                    lVar.l(0);
                    return;
                }
                return;
            }
            if (z12) {
                float f10 = i12;
                lVar.f5901l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
                lVar.f5900k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (lVar.f5909u) {
                float f11 = computeHorizontalScrollOffset;
                float f12 = i15;
                lVar.f5903o = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
                lVar.n = Math.min(i15, (i15 * i15) / computeHorizontalScrollRange);
            }
            int i16 = lVar.f5910v;
            if (i16 == 0 || i16 == 1) {
                lVar.l(1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5917a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f5917a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f5917a) {
                this.f5917a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.f5914z.getAnimatedValue()).floatValue() == 0.0f) {
                lVar.A = 0;
                lVar.l(0);
                return;
            }
            lVar.A = 2;
            lVar.f5907s.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.c.setAlpha(floatValue);
            lVar.f5893d.setAlpha(floatValue);
            lVar.f5907s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5914z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.c = stateListDrawable;
        this.f5893d = drawable;
        this.f5896g = stateListDrawable2;
        this.f5897h = drawable2;
        this.f5894e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f5895f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f5898i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f5899j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f5891a = i11;
        this.f5892b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f5907s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.a0(this);
                RecyclerView recyclerView3 = this.f5907s;
                recyclerView3.f5651z.remove(this);
                if (recyclerView3.A == this) {
                    recyclerView3.A = null;
                }
                ArrayList arrayList = this.f5907s.f5638s0;
                if (arrayList != null) {
                    arrayList.remove(bVar);
                }
                this.f5907s.removeCallbacks(aVar);
            }
            this.f5907s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f5907s.f5651z.add(this);
                this.f5907s.h(bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r9 >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r5 >= 0) goto L50;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(MotionEvent motionEvent) {
        int i10;
        int i11;
        if (this.f5910v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean j2 = j(motionEvent.getX(), motionEvent.getY());
            boolean i12 = i(motionEvent.getX(), motionEvent.getY());
            if (j2 || i12) {
                if (i12) {
                    this.f5911w = 1;
                    this.f5904p = (int) motionEvent.getX();
                } else if (j2) {
                    this.f5911w = 2;
                    this.f5902m = (int) motionEvent.getY();
                }
                l(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f5910v == 2) {
            this.f5902m = 0.0f;
            this.f5904p = 0.0f;
            l(1);
            this.f5911w = 0;
        } else if (motionEvent.getAction() == 2 && this.f5910v == 2) {
            m();
            int i13 = this.f5911w;
            int i14 = this.f5892b;
            if (i13 == 1) {
                float x3 = motionEvent.getX();
                int[] iArr = this.f5913y;
                iArr[0] = i14;
                int i15 = this.f5905q - i14;
                iArr[1] = i15;
                float max = Math.max(i14, Math.min(i15, x3));
                if (Math.abs(this.f5903o - max) >= 2.0f) {
                    float f10 = this.f5904p;
                    int computeHorizontalScrollRange = this.f5907s.computeHorizontalScrollRange();
                    int computeHorizontalScrollOffset = this.f5907s.computeHorizontalScrollOffset();
                    int i16 = this.f5905q;
                    int i17 = iArr[1] - iArr[0];
                    if (i17 != 0) {
                        int i18 = computeHorizontalScrollRange - i16;
                        i11 = (int) (((max - f10) / i17) * i18);
                        int i19 = computeHorizontalScrollOffset + i11;
                        if (i19 < i18) {
                        }
                    }
                    i11 = 0;
                    if (i11 != 0) {
                        this.f5907s.scrollBy(i11, 0);
                    }
                    this.f5904p = max;
                }
            }
            if (this.f5911w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f5912x;
                iArr2[0] = i14;
                int i20 = this.f5906r - i14;
                iArr2[1] = i20;
                float max2 = Math.max(i14, Math.min(i20, y10));
                if (Math.abs(this.f5901l - max2) >= 2.0f) {
                    float f11 = this.f5902m;
                    int computeVerticalScrollRange = this.f5907s.computeVerticalScrollRange();
                    int computeVerticalScrollOffset = this.f5907s.computeVerticalScrollOffset();
                    int i21 = this.f5906r;
                    int i22 = iArr2[1] - iArr2[0];
                    if (i22 != 0) {
                        int i23 = computeVerticalScrollRange - i21;
                        i10 = (int) (((max2 - f11) / i22) * i23);
                        int i24 = computeVerticalScrollOffset + i10;
                        if (i24 < i23) {
                        }
                    }
                    i10 = 0;
                    if (i10 != 0) {
                        this.f5907s.scrollBy(0, i10);
                    }
                    this.f5902m = max2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean c(MotionEvent motionEvent) {
        int i10 = this.f5910v;
        if (i10 == 1) {
            boolean j2 = j(motionEvent.getX(), motionEvent.getY());
            boolean i11 = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (j2 || i11)) {
                if (i11) {
                    this.f5911w = 1;
                    this.f5904p = (int) motionEvent.getX();
                } else if (j2) {
                    this.f5911w = 2;
                    this.f5902m = (int) motionEvent.getY();
                }
                l(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void e(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        if (this.f5905q == this.f5907s.getWidth() && this.f5906r == this.f5907s.getHeight()) {
            if (this.A != 0) {
                if (this.f5908t) {
                    int i11 = this.f5905q;
                    int i12 = this.f5894e;
                    int i13 = i11 - i12;
                    int i14 = this.f5901l;
                    int i15 = this.f5900k;
                    int i16 = i14 - (i15 / 2);
                    StateListDrawable stateListDrawable = this.c;
                    stateListDrawable.setBounds(0, 0, i12, i15);
                    int i17 = this.f5906r;
                    int i18 = this.f5895f;
                    Drawable drawable = this.f5893d;
                    drawable.setBounds(0, 0, i18, i17);
                    RecyclerView recyclerView2 = this.f5907s;
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    boolean z10 = true;
                    if (j0.e.d(recyclerView2) != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        drawable.draw(canvas);
                        canvas.translate(i12, i16);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        i10 = -i12;
                    } else {
                        canvas.translate(i13, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i16);
                        stateListDrawable.draw(canvas);
                        i10 = -i13;
                    }
                    canvas.translate(i10, -i16);
                }
                if (this.f5909u) {
                    int i19 = this.f5906r;
                    int i20 = this.f5898i;
                    int i21 = i19 - i20;
                    int i22 = this.f5903o;
                    int i23 = this.n;
                    int i24 = i22 - (i23 / 2);
                    StateListDrawable stateListDrawable2 = this.f5896g;
                    stateListDrawable2.setBounds(0, 0, i23, i20);
                    int i25 = this.f5905q;
                    int i26 = this.f5899j;
                    Drawable drawable2 = this.f5897h;
                    drawable2.setBounds(0, 0, i25, i26);
                    canvas.translate(0.0f, i21);
                    drawable2.draw(canvas);
                    canvas.translate(i24, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i24, -i21);
                    return;
                }
                return;
            }
            return;
        }
        this.f5905q = this.f5907s.getWidth();
        this.f5906r = this.f5907s.getHeight();
        l(0);
    }

    public final boolean i(float f10, float f11) {
        if (f11 >= this.f5906r - this.f5898i) {
            int i10 = this.f5903o;
            int i11 = this.n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(float f10, float f11) {
        boolean z10;
        RecyclerView recyclerView = this.f5907s;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f5894e;
        if (z10) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f5905q - i10) {
            return false;
        }
        int i11 = this.f5901l;
        int i12 = this.f5900k / 2;
        if (f11 < i11 - i12 || f11 > i12 + i11) {
            return false;
        }
        return true;
    }

    public final void k(int i10) {
        RecyclerView recyclerView = this.f5907s;
        a aVar = this.B;
        recyclerView.removeCallbacks(aVar);
        this.f5907s.postDelayed(aVar, i10);
    }

    public final void l(int i10) {
        int i11;
        StateListDrawable stateListDrawable = this.c;
        if (i10 == 2 && this.f5910v != 2) {
            stateListDrawable.setState(C);
            this.f5907s.removeCallbacks(this.B);
        }
        if (i10 == 0) {
            this.f5907s.invalidate();
        } else {
            m();
        }
        if (this.f5910v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            i11 = 1200;
        } else {
            i11 = i10 == 1 ? 1500 : 1500;
            this.f5910v = i10;
        }
        k(i11);
        this.f5910v = i10;
    }

    public final void m() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f5914z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            valueAnimator.cancel();
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
