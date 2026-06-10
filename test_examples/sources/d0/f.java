package d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import d0.k;
import java.lang.reflect.Method;
import m7.n;
import u.m;
import v0.r;

/* loaded from: classes.dex */
public final class f extends View {
    public static final int[] n = {16842919, 16842910};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f10358o = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public k f10359i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f10360j;

    /* renamed from: k  reason: collision with root package name */
    public Long f10361k;

    /* renamed from: l  reason: collision with root package name */
    public Runnable f10362l;

    /* renamed from: m  reason: collision with root package name */
    public u7.a<n> f10363m;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            k kVar = fVar.f10359i;
            if (kVar != null) {
                kVar.setState(f.f10358o);
            }
            fVar.f10362l = null;
        }
    }

    public f(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f10362l;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l2 = this.f10361k;
        long longValue = currentAnimationTimeMillis - (l2 == null ? 0L : l2.longValue());
        if (z10 || longValue >= 5) {
            int[] iArr = z10 ? n : f10358o;
            k kVar = this.f10359i;
            if (kVar != null) {
                kVar.setState(iArr);
            }
        } else {
            a aVar = new a();
            this.f10362l = aVar;
            postDelayed(aVar, 50L);
        }
        this.f10361k = Long.valueOf(currentAnimationTimeMillis);
    }

    public final void a(m mVar, boolean z10, long j2, int i10, long j10, float f10, u7.a<n> aVar) {
        v7.g.f(mVar, "interaction");
        v7.g.f(aVar, "onInvalidateRipple");
        if (this.f10359i == null || !v7.g.a(Boolean.valueOf(z10), this.f10360j)) {
            k kVar = new k(z10);
            setBackground(kVar);
            n nVar = n.f16010a;
            this.f10359i = kVar;
            this.f10360j = Boolean.valueOf(z10);
        }
        k kVar2 = this.f10359i;
        v7.g.c(kVar2);
        this.f10363m = aVar;
        d(j2, i10, j10, f10);
        if (z10) {
            long j11 = mVar.f17714a;
            kVar2.setHotspot(u0.c.b(j11), u0.c.c(j11));
        } else {
            kVar2.setHotspot(kVar2.getBounds().centerX(), kVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void b() {
        this.f10363m = null;
        Runnable runnable = this.f10362l;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f10362l;
            v7.g.c(runnable2);
            runnable2.run();
        } else {
            k kVar = this.f10359i;
            if (kVar != null) {
                kVar.setState(f10358o);
            }
        }
        k kVar2 = this.f10359i;
        if (kVar2 == null) {
            return;
        }
        kVar2.setVisible(false, false);
        unscheduleDrawable(kVar2);
    }

    public final void c() {
        setRippleState(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r1.intValue() != r10) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j2, int i10, long j10, float f10) {
        k kVar = this.f10359i;
        if (kVar == null) {
            return;
        }
        Integer num = kVar.f10374k;
        boolean z10 = false;
        if (num != null) {
        }
        kVar.f10374k = Integer.valueOf(i10);
        if (Build.VERSION.SDK_INT < 23) {
            try {
                if (!k.n) {
                    k.n = true;
                    k.f10371m = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                }
                Method method = k.f10371m;
                if (method != null) {
                    method.invoke(kVar, Integer.valueOf(i10));
                }
            } catch (Exception unused) {
            }
        } else {
            k.a.f10376a.a(kVar, i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        long b5 = r.b(j10, f10);
        r rVar = kVar.f10373j;
        if (rVar != null) {
            z10 = r.c(rVar.f18135a, b5);
        }
        if (!z10) {
            kVar.f10373j = new r(b5);
            kVar.setColor(ColorStateList.valueOf(a1.c.I1(b5)));
        }
        Rect q12 = m0.b.q1(a1.c.t(u0.c.f17721b, j2));
        setLeft(q12.left);
        setTop(q12.top);
        setRight(q12.right);
        setBottom(q12.bottom);
        kVar.setBounds(q12);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        v7.g.f(drawable, "who");
        u7.a<n> aVar = this.f10363m;
        if (aVar == null) {
            return;
        }
        aVar.k0();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
