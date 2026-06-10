package f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import f.d;
import r2.a;

/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f10693u = 0;

    /* renamed from: i  reason: collision with root package name */
    public c f10694i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f10695j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f10696k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f10697l;
    public boolean n;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10700p;

    /* renamed from: q  reason: collision with root package name */
    public a f10701q;

    /* renamed from: r  reason: collision with root package name */
    public long f10702r;

    /* renamed from: s  reason: collision with root package name */
    public long f10703s;

    /* renamed from: t  reason: collision with root package name */
    public C0114b f10704t;

    /* renamed from: m  reason: collision with root package name */
    public int f10698m = 255;

    /* renamed from: o  reason: collision with root package name */
    public int f10699o = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ b f10705i;

        public a(d dVar) {
            this.f10705i = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f10705i;
            bVar.a(true);
            bVar.invalidateSelf();
        }
    }

    /* renamed from: f.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0114b implements Drawable.Callback {

        /* renamed from: i  reason: collision with root package name */
        public Drawable.Callback f10706i;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f10706i;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f10706i;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a  reason: collision with root package name */
        public final b f10707a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f10708b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f10709d;

        /* renamed from: e  reason: collision with root package name */
        public int f10710e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f10711f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f10712g;

        /* renamed from: h  reason: collision with root package name */
        public int f10713h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10714i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f10715j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f10716k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10717l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f10718m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f10719o;

        /* renamed from: p  reason: collision with root package name */
        public int f10720p;

        /* renamed from: q  reason: collision with root package name */
        public int f10721q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f10722r;

        /* renamed from: s  reason: collision with root package name */
        public int f10723s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f10724t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f10725u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f10726v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f10727w;

        /* renamed from: x  reason: collision with root package name */
        public int f10728x;

        /* renamed from: y  reason: collision with root package name */
        public int f10729y;

        /* renamed from: z  reason: collision with root package name */
        public int f10730z;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            int i10;
            SparseArray<Drawable.ConstantState> sparseArray;
            this.f10714i = false;
            this.f10717l = false;
            this.f10727w = true;
            this.f10729y = 0;
            this.f10730z = 0;
            this.f10707a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.f10708b;
            } else {
                resources2 = null;
            }
            this.f10708b = resources2;
            if (cVar != null) {
                i10 = cVar.c;
            } else {
                i10 = 0;
            }
            int i11 = b.f10693u;
            if (resources != null) {
                i10 = resources.getDisplayMetrics().densityDpi;
            }
            i10 = i10 == 0 ? 160 : i10;
            this.c = i10;
            if (cVar != null) {
                this.f10709d = cVar.f10709d;
                this.f10710e = cVar.f10710e;
                this.f10725u = true;
                this.f10726v = true;
                this.f10714i = cVar.f10714i;
                this.f10717l = cVar.f10717l;
                this.f10727w = cVar.f10727w;
                this.f10728x = cVar.f10728x;
                this.f10729y = cVar.f10729y;
                this.f10730z = cVar.f10730z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                if (cVar.c == i10) {
                    if (cVar.f10715j) {
                        this.f10716k = cVar.f10716k != null ? new Rect(cVar.f10716k) : null;
                        this.f10715j = true;
                    }
                    if (cVar.f10718m) {
                        this.n = cVar.n;
                        this.f10719o = cVar.f10719o;
                        this.f10720p = cVar.f10720p;
                        this.f10721q = cVar.f10721q;
                        this.f10718m = true;
                    }
                }
                if (cVar.f10722r) {
                    this.f10723s = cVar.f10723s;
                    this.f10722r = true;
                }
                if (cVar.f10724t) {
                    this.f10724t = true;
                }
                Drawable[] drawableArr = cVar.f10712g;
                this.f10712g = new Drawable[drawableArr.length];
                this.f10713h = cVar.f10713h;
                SparseArray<Drawable.ConstantState> sparseArray2 = cVar.f10711f;
                if (sparseArray2 != null) {
                    sparseArray = sparseArray2.clone();
                } else {
                    sparseArray = new SparseArray<>(this.f10713h);
                }
                this.f10711f = sparseArray;
                int i12 = this.f10713h;
                for (int i13 = 0; i13 < i12; i13++) {
                    Drawable drawable = drawableArr[i13];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f10711f.put(i13, constantState);
                        } else {
                            this.f10712g[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.f10712g = new Drawable[10];
            this.f10713h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f10713h;
            if (i10 >= this.f10712g.length) {
                int i11 = i10 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f10712g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f10712g = drawableArr;
                int[][] iArr = new int[i11];
                System.arraycopy(aVar.H, 0, iArr, 0, i10);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f10707a);
            this.f10712g[i10] = drawable;
            this.f10713h++;
            this.f10710e = drawable.getChangingConfigurations() | this.f10710e;
            this.f10722r = false;
            this.f10724t = false;
            this.f10716k = null;
            this.f10715j = false;
            this.f10718m = false;
            this.f10725u = false;
            return i10;
        }

        public final void b() {
            this.f10718m = true;
            c();
            int i10 = this.f10713h;
            Drawable[] drawableArr = this.f10712g;
            this.f10719o = -1;
            this.n = -1;
            this.f10721q = 0;
            this.f10720p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f10719o) {
                    this.f10719o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f10720p) {
                    this.f10720p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f10721q) {
                    this.f10721q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f10711f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f10711f.keyAt(i10);
                    Drawable[] drawableArr = this.f10712g;
                    Drawable newDrawable = this.f10711f.valueAt(i10).newDrawable(this.f10708b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        r2.a.c(newDrawable, this.f10728x);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f10707a);
                    drawableArr[keyAt] = mutate;
                }
                this.f10711f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i10 = this.f10713h;
            Drawable[] drawableArr = this.f10712g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (a.b.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f10711f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f10712g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f10711f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f10711f.valueAt(indexOfKey).newDrawable(this.f10708b);
            if (Build.VERSION.SDK_INT >= 23) {
                r2.a.c(newDrawable, this.f10728x);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f10707a);
            this.f10712g[i10] = mutate;
            this.f10711f.removeAt(indexOfKey);
            if (this.f10711f.size() == 0) {
                this.f10711f = null;
            }
            return mutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f10709d | this.f10710e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        boolean z12 = true;
        this.n = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f10696k;
        if (drawable2 != null) {
            long j2 = this.f10702r;
            if (j2 != 0) {
                if (j2 <= uptimeMillis) {
                    drawable2.setAlpha(this.f10698m);
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - uptimeMillis) * 255)) / this.f10694i.f10729y)) * this.f10698m) / 255);
                    z11 = true;
                    drawable = this.f10697l;
                    if (drawable != null) {
                        long j10 = this.f10703s;
                        if (j10 != 0) {
                            if (j10 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j10 - uptimeMillis) * 255)) / this.f10694i.f10730z) * this.f10698m) / 255);
                                if (z10 && z12) {
                                    scheduleSelf(this.f10701q, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.f10697l = null;
                        }
                        z12 = z11;
                        if (z10) {
                            return;
                        }
                        return;
                    }
                    this.f10703s = 0L;
                    z12 = z11;
                    if (z10) {
                    }
                }
            }
            z11 = false;
            drawable = this.f10697l;
            if (drawable != null) {
            }
            this.f10703s = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f10702r = 0L;
        z11 = false;
        drawable = this.f10697l;
        if (drawable != null) {
        }
        this.f10703s = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f10694i;
        if (theme != null) {
            cVar.c();
            int i10 = cVar.f10713h;
            Drawable[] drawableArr = cVar.f10712g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && a.b.b(drawable)) {
                    a.b.a(drawableArr[i11], theme);
                    cVar.f10710e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f10708b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = cVar.c;
                cVar.c = i12;
                if (i13 != i12) {
                    cVar.f10718m = false;
                    cVar.f10715j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f10704t == null) {
            this.f10704t = new C0114b();
        }
        C0114b c0114b = this.f10704t;
        c0114b.f10706i = drawable.getCallback();
        drawable.setCallback(c0114b);
        try {
            if (this.f10694i.f10729y <= 0 && this.n) {
                drawable.setAlpha(this.f10698m);
            }
            c cVar = this.f10694i;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    a.b.h(drawable, cVar.D);
                }
                c cVar2 = this.f10694i;
                if (cVar2.G) {
                    a.b.i(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10694i.f10727w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                r2.a.c(drawable, r2.a.b(this));
            }
            a.C0214a.e(drawable, this.f10694i.A);
            Rect rect = this.f10695j;
            if (rect != null) {
                a.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0114b c0114b2 = this.f10704t;
            Drawable.Callback callback = c0114b2.f10706i;
            c0114b2.f10706i = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f10694i.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i10) {
        a aVar;
        if (i10 == this.f10699o) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f10694i.f10730z > 0) {
            Drawable drawable = this.f10697l;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f10696k;
            if (drawable2 != null) {
                this.f10697l = drawable2;
                this.f10703s = this.f10694i.f10730z + uptimeMillis;
            } else {
                this.f10697l = null;
                this.f10703s = 0L;
            }
        } else {
            Drawable drawable3 = this.f10696k;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            c cVar = this.f10694i;
            if (i10 < cVar.f10713h) {
                Drawable d5 = cVar.d(i10);
                this.f10696k = d5;
                this.f10699o = i10;
                if (d5 != null) {
                    int i11 = this.f10694i.f10729y;
                    if (i11 > 0) {
                        this.f10702r = uptimeMillis + i11;
                    }
                    c(d5);
                }
                if (this.f10702r == 0 || this.f10703s != 0) {
                    aVar = this.f10701q;
                    if (aVar != null) {
                        this.f10701q = new a((d) this);
                    } else {
                        unscheduleSelf(aVar);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f10696k = null;
        this.f10699o = -1;
        if (this.f10702r == 0) {
        }
        aVar = this.f10701q;
        if (aVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f10697l;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10698m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f10694i;
        return changingConfigurations | cVar.f10710e | cVar.f10709d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        c cVar = this.f10694i;
        if (cVar.f10725u) {
            z10 = cVar.f10726v;
        } else {
            cVar.c();
            cVar.f10725u = true;
            int i10 = cVar.f10713h;
            Drawable[] drawableArr = cVar.f10712g;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (drawableArr[i11].getConstantState() == null) {
                        cVar.f10726v = false;
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    cVar.f10726v = true;
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            this.f10694i.f10709d = getChangingConfigurations();
            return this.f10694i;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f10696k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10695j;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f10694i;
        if (cVar.f10717l) {
            if (!cVar.f10718m) {
                cVar.b();
            }
            return cVar.f10719o;
        }
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f10694i;
        if (cVar.f10717l) {
            if (!cVar.f10718m) {
                cVar.b();
            }
            return cVar.n;
        }
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f10694i;
        if (cVar.f10717l) {
            if (!cVar.f10718m) {
                cVar.b();
            }
            return cVar.f10721q;
        }
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f10694i;
        if (cVar.f10717l) {
            if (!cVar.f10718m) {
                cVar.b();
            }
            return cVar.f10720p;
        }
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f10696k;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            c cVar = this.f10694i;
            if (cVar.f10722r) {
                return cVar.f10723s;
            }
            cVar.c();
            int i11 = cVar.f10713h;
            Drawable[] drawableArr = cVar.f10712g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            cVar.f10723s = i10;
            cVar.f10722r = true;
            return i10;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f10694i;
        boolean z10 = true;
        Rect rect2 = null;
        if (!cVar.f10714i) {
            Rect rect3 = cVar.f10716k;
            if (rect3 == null && !cVar.f10715j) {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f10713h;
                Drawable[] drawableArr = cVar.f10712g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f10715j = true;
                cVar.f10716k = rect2;
            }
            rect2 = rect3;
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f10696k;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (!this.f10694i.A || r2.a.b(this) != 1) {
            z10 = false;
        }
        if (z10) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f10694i;
        if (cVar != null) {
            cVar.f10722r = false;
            cVar.f10724t = false;
        }
        if (drawable == this.f10696k && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f10694i.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f10697l;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f10697l = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f10696k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.n) {
                this.f10696k.setAlpha(this.f10698m);
            }
        }
        if (this.f10703s != 0) {
            this.f10703s = 0L;
            z10 = true;
        }
        if (this.f10702r != 0) {
            this.f10702r = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f10700p && super.mutate() == this) {
            c b5 = b();
            b5.e();
            e(b5);
            this.f10700p = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10697l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10696k;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean z10;
        c cVar = this.f10694i;
        int i11 = this.f10699o;
        int i12 = cVar.f10713h;
        Drawable[] drawableArr = cVar.f10712g;
        boolean z11 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = r2.a.c(drawable, i10);
                } else {
                    z10 = false;
                }
                if (i13 == i11) {
                    z11 = z10;
                }
            }
        }
        cVar.f10728x = i10;
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f10697l;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f10696k;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10697l;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f10696k;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f10696k || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.n && this.f10698m == i10) {
            return;
        }
        this.n = true;
        this.f10698m = i10;
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            if (this.f10702r == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f10694i;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.f10696k;
            if (drawable != null) {
                a.C0214a.e(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f10694i;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.f10696k;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        c cVar = this.f10694i;
        if (cVar.f10727w != z10) {
            cVar.f10727w = z10;
            Drawable drawable = this.f10696k;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f10695j;
        if (rect == null) {
            this.f10695j = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f10696k;
        if (drawable != null) {
            a.b.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f10694i;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            r2.a.e(this.f10696k, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f10694i;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            r2.a.f(this.f10696k, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f10697l;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f10696k;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f10696k || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
