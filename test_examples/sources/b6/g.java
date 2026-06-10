package b6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import b6.k;
import b6.l;
import b6.n;
import java.util.BitSet;

/* loaded from: classes.dex */
public class g extends Drawable implements r2.b, o {
    public static final Paint E;
    public PorterDuffColorFilter A;
    public PorterDuffColorFilter B;
    public final RectF C;
    public boolean D;

    /* renamed from: i  reason: collision with root package name */
    public b f6391i;

    /* renamed from: j  reason: collision with root package name */
    public final n.f[] f6392j;

    /* renamed from: k  reason: collision with root package name */
    public final n.f[] f6393k;

    /* renamed from: l  reason: collision with root package name */
    public final BitSet f6394l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6395m;
    public final Matrix n;

    /* renamed from: o  reason: collision with root package name */
    public final Path f6396o;

    /* renamed from: p  reason: collision with root package name */
    public final Path f6397p;

    /* renamed from: q  reason: collision with root package name */
    public final RectF f6398q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f6399r;

    /* renamed from: s  reason: collision with root package name */
    public final Region f6400s;

    /* renamed from: t  reason: collision with root package name */
    public final Region f6401t;

    /* renamed from: u  reason: collision with root package name */
    public k f6402u;

    /* renamed from: v  reason: collision with root package name */
    public final Paint f6403v;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f6404w;

    /* renamed from: x  reason: collision with root package name */
    public final a6.a f6405x;

    /* renamed from: y  reason: collision with root package name */
    public final a f6406y;

    /* renamed from: z  reason: collision with root package name */
    public final l f6407z;

    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f6409a;

        /* renamed from: b  reason: collision with root package name */
        public r5.a f6410b;
        public ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f6411d;

        /* renamed from: e  reason: collision with root package name */
        public final ColorStateList f6412e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f6413f;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f6414g;

        /* renamed from: h  reason: collision with root package name */
        public Rect f6415h;

        /* renamed from: i  reason: collision with root package name */
        public final float f6416i;

        /* renamed from: j  reason: collision with root package name */
        public float f6417j;

        /* renamed from: k  reason: collision with root package name */
        public float f6418k;

        /* renamed from: l  reason: collision with root package name */
        public int f6419l;

        /* renamed from: m  reason: collision with root package name */
        public float f6420m;
        public float n;

        /* renamed from: o  reason: collision with root package name */
        public final float f6421o;

        /* renamed from: p  reason: collision with root package name */
        public int f6422p;

        /* renamed from: q  reason: collision with root package name */
        public int f6423q;

        /* renamed from: r  reason: collision with root package name */
        public int f6424r;

        /* renamed from: s  reason: collision with root package name */
        public int f6425s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f6426t;

        /* renamed from: u  reason: collision with root package name */
        public Paint.Style f6427u;

        public b(b bVar) {
            this.c = null;
            this.f6411d = null;
            this.f6412e = null;
            this.f6413f = null;
            this.f6414g = PorterDuff.Mode.SRC_IN;
            this.f6415h = null;
            this.f6416i = 1.0f;
            this.f6417j = 1.0f;
            this.f6419l = 255;
            this.f6420m = 0.0f;
            this.n = 0.0f;
            this.f6421o = 0.0f;
            this.f6422p = 0;
            this.f6423q = 0;
            this.f6424r = 0;
            this.f6425s = 0;
            this.f6426t = false;
            this.f6427u = Paint.Style.FILL_AND_STROKE;
            this.f6409a = bVar.f6409a;
            this.f6410b = bVar.f6410b;
            this.f6418k = bVar.f6418k;
            this.c = bVar.c;
            this.f6411d = bVar.f6411d;
            this.f6414g = bVar.f6414g;
            this.f6413f = bVar.f6413f;
            this.f6419l = bVar.f6419l;
            this.f6416i = bVar.f6416i;
            this.f6424r = bVar.f6424r;
            this.f6422p = bVar.f6422p;
            this.f6426t = bVar.f6426t;
            this.f6417j = bVar.f6417j;
            this.f6420m = bVar.f6420m;
            this.n = bVar.n;
            this.f6421o = bVar.f6421o;
            this.f6423q = bVar.f6423q;
            this.f6425s = bVar.f6425s;
            this.f6412e = bVar.f6412e;
            this.f6427u = bVar.f6427u;
            if (bVar.f6415h != null) {
                this.f6415h = new Rect(bVar.f6415h);
            }
        }

        public b(k kVar) {
            this.c = null;
            this.f6411d = null;
            this.f6412e = null;
            this.f6413f = null;
            this.f6414g = PorterDuff.Mode.SRC_IN;
            this.f6415h = null;
            this.f6416i = 1.0f;
            this.f6417j = 1.0f;
            this.f6419l = 255;
            this.f6420m = 0.0f;
            this.n = 0.0f;
            this.f6421o = 0.0f;
            this.f6422p = 0;
            this.f6423q = 0;
            this.f6424r = 0;
            this.f6425s = 0;
            this.f6426t = false;
            this.f6427u = Paint.Style.FILL_AND_STROKE;
            this.f6409a = kVar;
            this.f6410b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f6395m = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        E = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.b(context, attributeSet, i10, i11).a());
    }

    public g(b bVar) {
        l lVar;
        this.f6392j = new n.f[4];
        this.f6393k = new n.f[4];
        this.f6394l = new BitSet(8);
        this.n = new Matrix();
        this.f6396o = new Path();
        this.f6397p = new Path();
        this.f6398q = new RectF();
        this.f6399r = new RectF();
        this.f6400s = new Region();
        this.f6401t = new Region();
        Paint paint = new Paint(1);
        this.f6403v = paint;
        Paint paint2 = new Paint(1);
        this.f6404w = paint2;
        this.f6405x = new a6.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.a.f6466a;
        } else {
            lVar = new l();
        }
        this.f6407z = lVar;
        this.C = new RectF();
        this.D = true;
        this.f6391i = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u();
        t(getState());
        this.f6406y = new a();
    }

    public g(k kVar) {
        this(new b(kVar));
    }

    public final void b(RectF rectF, Path path) {
        l lVar = this.f6407z;
        b bVar = this.f6391i;
        lVar.a(bVar.f6409a, bVar.f6417j, rectF, this.f6406y, path);
        if (this.f6391i.f6416i != 1.0f) {
            Matrix matrix = this.n;
            matrix.reset();
            float f10 = this.f6391i.f6416i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.C, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = r4.getColor();
        r3 = d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r3 == r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        r2 = new android.graphics.PorterDuffColorFilter(r3, android.graphics.PorterDuff.Mode.SRC_IN);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    public final int d(int i10) {
        b bVar = this.f6391i;
        float f10 = bVar.n + bVar.f6421o + bVar.f6420m;
        r5.a aVar = bVar.f6410b;
        if (aVar != null) {
            return aVar.a(i10, f10);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean z10;
        Paint.Style style;
        boolean z11;
        Paint.Style style2;
        boolean z12;
        boolean z13;
        float f10;
        boolean z14;
        float f11;
        Paint paint = this.f6403v;
        paint.setColorFilter(this.A);
        int alpha = paint.getAlpha();
        int i10 = this.f6391i.f6419l;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f6404w;
        paint2.setColorFilter(this.B);
        paint2.setStrokeWidth(this.f6391i.f6418k);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f6391i.f6419l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z15 = this.f6395m;
        Path path = this.f6396o;
        boolean z16 = false;
        if (z15) {
            Paint.Style style3 = this.f6391i.f6427u;
            if ((style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                f10 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f10 = 0.0f;
            }
            float f12 = -f10;
            k kVar = this.f6391i.f6409a;
            kVar.getClass();
            k.a aVar = new k.a(kVar);
            c cVar = kVar.f6436e;
            if (!(cVar instanceof i)) {
                cVar = new b6.b(f12, cVar);
            }
            aVar.f6447e = cVar;
            c cVar2 = kVar.f6437f;
            if (!(cVar2 instanceof i)) {
                cVar2 = new b6.b(f12, cVar2);
            }
            aVar.f6448f = cVar2;
            c cVar3 = kVar.f6439h;
            if (!(cVar3 instanceof i)) {
                cVar3 = new b6.b(f12, cVar3);
            }
            aVar.f6450h = cVar3;
            c cVar4 = kVar.f6438g;
            if (!(cVar4 instanceof i)) {
                cVar4 = new b6.b(f12, cVar4);
            }
            aVar.f6449g = cVar4;
            k kVar2 = new k(aVar);
            this.f6402u = kVar2;
            float f13 = this.f6391i.f6417j;
            RectF rectF = this.f6399r;
            rectF.set(h());
            Paint.Style style4 = this.f6391i.f6427u;
            if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                f11 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f11 = 0.0f;
            }
            rectF.inset(f11, f11);
            this.f6407z.a(kVar2, f13, rectF, null, this.f6397p);
            b(h(), path);
            this.f6395m = false;
        }
        b bVar = this.f6391i;
        int i12 = bVar.f6422p;
        if (i12 != 1 && bVar.f6423q > 0) {
            if (i12 != 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (!l() && !path.isConvex() && i13 < 29) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            z10 = true;
            if (!z10) {
                canvas.save();
                b bVar2 = this.f6391i;
                canvas.translate((int) (Math.sin(Math.toRadians(bVar2.f6425s)) * bVar2.f6424r), i());
                if (!this.D) {
                    e(canvas);
                } else {
                    RectF rectF2 = this.C;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width >= 0 && height >= 0) {
                        Bitmap createBitmap = Bitmap.createBitmap((this.f6391i.f6423q * 2) + ((int) rectF2.width()) + width, (this.f6391i.f6423q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f14 = (getBounds().left - this.f6391i.f6423q) - width;
                        float f15 = (getBounds().top - this.f6391i.f6423q) - height;
                        canvas2.translate(-f14, -f15);
                        e(canvas2);
                        canvas.drawBitmap(createBitmap, f14, f15, (Paint) null);
                        createBitmap.recycle();
                    } else {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                }
                canvas.restore();
            }
            b bVar3 = this.f6391i;
            style = bVar3.f6427u;
            if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
                z11 = false;
                if (z11) {
                    f(canvas, paint, path, bVar3.f6409a, h());
                }
                style2 = this.f6391i.f6427u;
                if ((style2 != Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
                    z16 = true;
                }
                if (z16) {
                    g(canvas);
                }
                paint.setAlpha(alpha);
                paint2.setAlpha(alpha2);
            }
            z11 = true;
            if (z11) {
            }
            style2 = this.f6391i.f6427u;
            if (style2 != Paint.Style.FILL_AND_STROKE) {
            }
            z16 = true;
            if (z16) {
            }
            paint.setAlpha(alpha);
            paint2.setAlpha(alpha2);
        }
        z10 = false;
        if (!z10) {
        }
        b bVar32 = this.f6391i;
        style = bVar32.f6427u;
        if (style != Paint.Style.FILL_AND_STROKE) {
            z11 = false;
            if (z11) {
            }
            style2 = this.f6391i.f6427u;
            if (style2 != Paint.Style.FILL_AND_STROKE) {
            }
            z16 = true;
            if (z16) {
            }
            paint.setAlpha(alpha);
            paint2.setAlpha(alpha2);
        }
        z11 = true;
        if (z11) {
        }
        style2 = this.f6391i.f6427u;
        if (style2 != Paint.Style.FILL_AND_STROKE) {
        }
        z16 = true;
        if (z16) {
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f6394l.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f6391i.f6424r;
        Path path = this.f6396o;
        a6.a aVar = this.f6405x;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f246a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            n.f fVar = this.f6392j[i11];
            int i12 = this.f6391i.f6423q;
            Matrix matrix = n.f.f6485b;
            fVar.a(matrix, aVar, i12, canvas);
            this.f6393k[i11].a(matrix, aVar, this.f6391i.f6423q, canvas);
        }
        if (this.D) {
            b bVar = this.f6391i;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f6425s)) * bVar.f6424r);
            int i13 = i();
            canvas.translate(-sin, -i13);
            canvas.drawPath(path, E);
            canvas.translate(sin, i13);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a10 = kVar.f6437f.a(rectF) * this.f6391i.f6417j;
        canvas.drawRoundRect(rectF, a10, a10, paint);
    }

    public void g(Canvas canvas) {
        boolean z10;
        Paint paint = this.f6404w;
        Path path = this.f6397p;
        k kVar = this.f6402u;
        RectF rectF = this.f6399r;
        rectF.set(h());
        Paint.Style style = this.f6391i.f6427u;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f10, f10);
        f(canvas, paint, path, kVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6391i.f6419l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6391i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f6391i.f6422p == 2) {
            return;
        }
        if (l()) {
            outline.setRoundRect(getBounds(), j() * this.f6391i.f6417j);
            return;
        }
        RectF h10 = h();
        Path path = this.f6396o;
        b(h10, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f6391i.f6415h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f6400s;
        region.set(bounds);
        RectF h10 = h();
        Path path = this.f6396o;
        b(h10, path);
        Region region2 = this.f6401t;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.f6398q;
        rectF.set(getBounds());
        return rectF;
    }

    public final int i() {
        b bVar = this.f6391i;
        return (int) (Math.cos(Math.toRadians(bVar.f6425s)) * bVar.f6424r);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6395m = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f6391i.f6413f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f6391i.f6412e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f6391i.f6411d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f6391i.c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final float j() {
        return this.f6391i.f6409a.f6436e.a(h());
    }

    public final void k(Context context) {
        this.f6391i.f6410b = new r5.a(context);
        v();
    }

    public final boolean l() {
        return this.f6391i.f6409a.d(h());
    }

    public final void m(float f10) {
        b bVar = this.f6391i;
        if (bVar.n != f10) {
            bVar.n = f10;
            v();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f6391i = new b(this.f6391i);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        b bVar = this.f6391i;
        if (bVar.c != colorStateList) {
            bVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(float f10) {
        b bVar = this.f6391i;
        if (bVar.f6417j != f10) {
            bVar.f6417j = f10;
            this.f6395m = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6395m = true;
        super.onBoundsChange(rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean t10 = t(iArr);
        boolean u10 = u();
        if (!t10 && !u10) {
            z10 = false;
            if (z10) {
                invalidateSelf();
            }
            return z10;
        }
        z10 = true;
        if (z10) {
        }
        return z10;
    }

    public final void p(Paint.Style style) {
        this.f6391i.f6427u = style;
        super.invalidateSelf();
    }

    public final void q() {
        this.f6405x.a(-12303292);
        this.f6391i.f6426t = false;
        super.invalidateSelf();
    }

    public final void r(int i10) {
        b bVar = this.f6391i;
        if (bVar.f6422p != i10) {
            bVar.f6422p = i10;
            super.invalidateSelf();
        }
    }

    public final void s(ColorStateList colorStateList) {
        b bVar = this.f6391i;
        if (bVar.f6411d != colorStateList) {
            bVar.f6411d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f6391i;
        if (bVar.f6419l != i10) {
            bVar.f6419l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6391i.getClass();
        super.invalidateSelf();
    }

    @Override // b6.o
    public final void setShapeAppearanceModel(k kVar) {
        this.f6391i.f6409a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6391i.f6413f = colorStateList;
        u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f6391i;
        if (bVar.f6414g != mode) {
            bVar.f6414g = mode;
            u();
            super.invalidateSelf();
        }
    }

    public final boolean t(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f6391i.c == null || color2 == (colorForState2 = this.f6391i.c.getColorForState(iArr, (color2 = (paint2 = this.f6403v).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f6391i.f6411d == null || color == (colorForState = this.f6391i.f6411d.getColorForState(iArr, (color = (paint = this.f6404w).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean u() {
        PorterDuffColorFilter porterDuffColorFilter = this.A;
        PorterDuffColorFilter porterDuffColorFilter2 = this.B;
        b bVar = this.f6391i;
        this.A = c(bVar.f6413f, bVar.f6414g, this.f6403v, true);
        b bVar2 = this.f6391i;
        this.B = c(bVar2.f6412e, bVar2.f6414g, this.f6404w, false);
        b bVar3 = this.f6391i;
        if (bVar3.f6426t) {
            this.f6405x.a(bVar3.f6413f.getColorForState(getState(), 0));
        }
        if (!z2.b.a(porterDuffColorFilter, this.A) || !z2.b.a(porterDuffColorFilter2, this.B)) {
            return true;
        }
        return false;
    }

    public final void v() {
        b bVar = this.f6391i;
        float f10 = bVar.n + bVar.f6421o;
        bVar.f6423q = (int) Math.ceil(0.75f * f10);
        this.f6391i.f6424r = (int) Math.ceil(f10 * 0.25f);
        u();
        super.invalidateSelf();
    }
}
