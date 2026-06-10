package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.unit.LayoutDirection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import v0.c0;

/* loaded from: classes.dex */
public final class ViewLayer extends View implements l1.z {
    public static boolean A;

    /* renamed from: v  reason: collision with root package name */
    public static final u7.p<View, Matrix, m7.n> f3763v = ViewLayer$Companion$getMatrix$1.f3780j;

    /* renamed from: w  reason: collision with root package name */
    public static final a f3764w = new a();

    /* renamed from: x  reason: collision with root package name */
    public static Method f3765x;

    /* renamed from: y  reason: collision with root package name */
    public static Field f3766y;

    /* renamed from: z  reason: collision with root package name */
    public static boolean f3767z;

    /* renamed from: i  reason: collision with root package name */
    public final AndroidComposeView f3768i;

    /* renamed from: j  reason: collision with root package name */
    public final j0 f3769j;

    /* renamed from: k  reason: collision with root package name */
    public u7.l<? super v0.o, m7.n> f3770k;

    /* renamed from: l  reason: collision with root package name */
    public u7.a<m7.n> f3771l;

    /* renamed from: m  reason: collision with root package name */
    public final r0 f3772m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public Rect f3773o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3774p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3775q;

    /* renamed from: r  reason: collision with root package name */
    public final j0.c f3776r;

    /* renamed from: s  reason: collision with root package name */
    public final p0<View> f3777s;

    /* renamed from: t  reason: collision with root package name */
    public long f3778t;

    /* renamed from: u  reason: collision with root package name */
    public final long f3779u;

    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            v7.g.f(view, "view");
            v7.g.f(outline, "outline");
            Outline b5 = ((ViewLayer) view).f3772m.b();
            v7.g.c(b5);
            outline.set(b5);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @SuppressLint({"BanUncheckedReflection"})
        public static void a(View view) {
            Field field;
            v7.g.f(view, "view");
            try {
                if (!ViewLayer.f3767z) {
                    ViewLayer.f3767z = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f3765x = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        field = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f3765x = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    ViewLayer.f3766y = field;
                    Method method = ViewLayer.f3765x;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field2 = ViewLayer.f3766y;
                    if (field2 != null) {
                        field2.setAccessible(true);
                    }
                }
                Field field3 = ViewLayer.f3766y;
                if (field3 != null) {
                    field3.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f3765x;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ViewLayer.A = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final long a(View view) {
            long uniqueDrawingId;
            v7.g.f(view, "view");
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, j0 j0Var, u7.l<? super v0.o, m7.n> lVar, u7.a<m7.n> aVar) {
        super(androidComposeView.getContext());
        v7.g.f(androidComposeView, "ownerView");
        v7.g.f(lVar, "drawBlock");
        v7.g.f(aVar, "invalidateParentLayer");
        this.f3768i = androidComposeView;
        this.f3769j = j0Var;
        this.f3770k = lVar;
        this.f3771l = aVar;
        this.f3772m = new r0(androidComposeView.getDensity());
        this.f3776r = new j0.c(1);
        this.f3777s = new p0<>(f3763v);
        this.f3778t = v0.l0.f18123a;
        setWillNotDraw(false);
        j0Var.addView(this);
        this.f3779u = View.generateViewId();
    }

    private final v0.z getManualClipPath() {
        if (getClipToOutline()) {
            r0 r0Var = this.f3772m;
            if (!(!r0Var.f3887i)) {
                r0Var.e();
                return r0Var.f3885g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f3774p) {
            this.f3774p = z10;
            this.f3768i.F(this, z10);
        }
    }

    @Override // l1.z
    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j2, v0.h0 h0Var, boolean z10, long j10, long j11, LayoutDirection layoutDirection, b2.b bVar) {
        u7.a<m7.n> aVar;
        v7.g.f(h0Var, "shape");
        v7.g.f(layoutDirection, "layoutDirection");
        v7.g.f(bVar, "density");
        this.f3778t = j2;
        setScaleX(f10);
        setScaleY(f11);
        setAlpha(f12);
        setTranslationX(f13);
        setTranslationY(f14);
        setElevation(f15);
        setRotation(f18);
        setRotationX(f16);
        setRotationY(f17);
        long j12 = this.f3778t;
        int i10 = v0.l0.f18124b;
        setPivotX(Float.intBitsToFloat((int) (j12 >> 32)) * getWidth());
        setPivotY(Float.intBitsToFloat((int) (this.f3778t & 4294967295L)) * getHeight());
        setCameraDistancePx(f19);
        c0.a aVar2 = v0.c0.f18087a;
        this.n = z10 && h0Var == aVar2;
        j();
        boolean z11 = getManualClipPath() != null;
        setClipToOutline(z10 && h0Var != aVar2);
        boolean d5 = this.f3772m.d(h0Var, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, bVar);
        setOutlineProvider(this.f3772m.b() != null ? f3764w : null);
        boolean z12 = getManualClipPath() != null;
        if (z11 != z12 || (z12 && d5)) {
            invalidate();
        }
        if (!this.f3775q && getElevation() > 0.0f && (aVar = this.f3771l) != null) {
            aVar.k0();
        }
        this.f3777s.c();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            l1 l1Var = l1.f3856a;
            l1Var.a(this, a1.c.I1(j10));
            l1Var.b(this, a1.c.I1(j11));
        }
        if (i11 >= 31) {
            m1.f3859a.a(this, null);
        }
    }

    @Override // l1.z
    public final long b(long j2, boolean z10) {
        p0<View> p0Var = this.f3777s;
        if (z10) {
            float[] a10 = p0Var.a(this);
            if (a10 != null) {
                return v0.p.w(a10, j2);
            }
            int i10 = u0.c.f17723e;
            return u0.c.c;
        }
        return v0.p.w(p0Var.b(this), j2);
    }

    @Override // l1.z
    public final void c(v0.o oVar) {
        v7.g.f(oVar, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.f3775q = z10;
        if (z10) {
            oVar.p();
        }
        this.f3769j.a(oVar, this, getDrawingTime());
        if (this.f3775q) {
            oVar.n();
        }
    }

    @Override // l1.z
    public final void d(long j2) {
        a aVar;
        int i10 = (int) (j2 >> 32);
        int b5 = b2.h.b(j2);
        if (i10 != getWidth() || b5 != getHeight()) {
            long j10 = this.f3778t;
            int i11 = v0.l0.f18124b;
            float f10 = i10;
            setPivotX(Float.intBitsToFloat((int) (j10 >> 32)) * f10);
            float f11 = b5;
            setPivotY(Float.intBitsToFloat((int) (this.f3778t & 4294967295L)) * f11);
            long v3 = a1.c.v(f10, f11);
            r0 r0Var = this.f3772m;
            if (!u0.f.a(r0Var.f3882d, v3)) {
                r0Var.f3882d = v3;
                r0Var.f3886h = true;
            }
            if (r0Var.b() != null) {
                aVar = f3764w;
            } else {
                aVar = null;
            }
            setOutlineProvider(aVar);
            layout(getLeft(), getTop(), getLeft() + i10, getTop() + b5);
            j();
            this.f3777s.c();
        }
    }

    @Override // l1.z
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f3768i;
        androidComposeView.D = true;
        this.f3770k = null;
        this.f3771l = null;
        boolean H = androidComposeView.H(this);
        if (Build.VERSION.SDK_INT < 23 && !A && H) {
            setVisibility(8);
            return;
        }
        this.f3769j.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v7.g.f(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        j0.c cVar = this.f3776r;
        Object obj = cVar.f12625b;
        Canvas canvas2 = ((v0.c) obj).f18085a;
        v0.c cVar2 = (v0.c) obj;
        cVar2.getClass();
        cVar2.f18085a = canvas;
        v0.c cVar3 = (v0.c) cVar.f12625b;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            cVar3.m();
            this.f3772m.a(cVar3);
            z10 = true;
        }
        u7.l<? super v0.o, m7.n> lVar = this.f3770k;
        if (lVar != null) {
            lVar.U(cVar3);
        }
        if (z10) {
            cVar3.l();
        }
        ((v0.c) cVar.f12625b).s(canvas2);
    }

    @Override // l1.z
    public final void e(u7.a aVar, u7.l lVar) {
        v7.g.f(lVar, "drawBlock");
        v7.g.f(aVar, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT < 23 && !A) {
            setVisibility(0);
            this.n = false;
            this.f3775q = false;
            int i10 = v0.l0.f18124b;
            this.f3778t = v0.l0.f18123a;
            this.f3770k = lVar;
            this.f3771l = aVar;
        }
        this.f3769j.addView(this);
        this.n = false;
        this.f3775q = false;
        int i102 = v0.l0.f18124b;
        this.f3778t = v0.l0.f18123a;
        this.f3770k = lVar;
        this.f3771l = aVar;
    }

    @Override // l1.z
    public final void f(u0.b bVar, boolean z10) {
        p0<View> p0Var = this.f3777s;
        if (z10) {
            float[] a10 = p0Var.a(this);
            if (a10 != null) {
                v0.p.x(a10, bVar);
                return;
            }
            bVar.f17718a = 0.0f;
            bVar.f17719b = 0.0f;
            bVar.c = 0.0f;
            bVar.f17720d = 0.0f;
            return;
        }
        v0.p.x(p0Var.b(this), bVar);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // l1.z
    public final void g(long j2) {
        int i10 = b2.g.c;
        int i11 = (int) (j2 >> 32);
        int left = getLeft();
        p0<View> p0Var = this.f3777s;
        if (i11 != left) {
            offsetLeftAndRight(i11 - getLeft());
            p0Var.c();
        }
        int a10 = b2.g.a(j2);
        if (a10 != getTop()) {
            offsetTopAndBottom(a10 - getTop());
            p0Var.c();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final j0 getContainer() {
        return this.f3769j;
    }

    public long getLayerId() {
        return this.f3779u;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f3768i;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(this.f3768i);
        }
        return -1L;
    }

    @Override // l1.z
    public final void h() {
        if (!this.f3774p || A) {
            return;
        }
        setInvalidated(false);
        b.a(this);
    }

    @Override // l1.z
    public final boolean i(long j2) {
        float b5 = u0.c.b(j2);
        float c10 = u0.c.c(j2);
        if (this.n) {
            return 0.0f <= b5 && b5 < ((float) getWidth()) && 0.0f <= c10 && c10 < ((float) getHeight());
        } else if (getClipToOutline()) {
            return this.f3772m.c(j2);
        } else {
            return true;
        }
    }

    @Override // android.view.View, l1.z
    public final void invalidate() {
        if (this.f3774p) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f3768i.invalidate();
    }

    public final void j() {
        Rect rect;
        if (this.n) {
            Rect rect2 = this.f3773o;
            if (rect2 == null) {
                this.f3773o = new Rect(0, 0, getWidth(), getHeight());
            } else {
                v7.g.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f3773o;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }
}
