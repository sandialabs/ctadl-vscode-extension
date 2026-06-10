package i4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p2.k;
import q2.d;
import r2.a;

/* loaded from: classes.dex */
public final class i extends i4.h {

    /* renamed from: r  reason: collision with root package name */
    public static final PorterDuff.Mode f11752r = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public g f11753j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuffColorFilter f11754k;

    /* renamed from: l  reason: collision with root package name */
    public ColorFilter f11755l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11756m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final float[] f11757o;

    /* renamed from: p  reason: collision with root package name */
    public final Matrix f11758p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f11759q;

    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public p2.c f11760e;

        /* renamed from: f  reason: collision with root package name */
        public float f11761f;

        /* renamed from: g  reason: collision with root package name */
        public p2.c f11762g;

        /* renamed from: h  reason: collision with root package name */
        public float f11763h;

        /* renamed from: i  reason: collision with root package name */
        public float f11764i;

        /* renamed from: j  reason: collision with root package name */
        public float f11765j;

        /* renamed from: k  reason: collision with root package name */
        public float f11766k;

        /* renamed from: l  reason: collision with root package name */
        public float f11767l;

        /* renamed from: m  reason: collision with root package name */
        public Paint.Cap f11768m;
        public Paint.Join n;

        /* renamed from: o  reason: collision with root package name */
        public float f11769o;

        public b() {
            this.f11761f = 0.0f;
            this.f11763h = 1.0f;
            this.f11764i = 1.0f;
            this.f11765j = 0.0f;
            this.f11766k = 1.0f;
            this.f11767l = 0.0f;
            this.f11768m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.f11769o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f11761f = 0.0f;
            this.f11763h = 1.0f;
            this.f11764i = 1.0f;
            this.f11765j = 0.0f;
            this.f11766k = 1.0f;
            this.f11767l = 0.0f;
            this.f11768m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.f11769o = 4.0f;
            this.f11760e = bVar.f11760e;
            this.f11761f = bVar.f11761f;
            this.f11763h = bVar.f11763h;
            this.f11762g = bVar.f11762g;
            this.c = bVar.c;
            this.f11764i = bVar.f11764i;
            this.f11765j = bVar.f11765j;
            this.f11766k = bVar.f11766k;
            this.f11767l = bVar.f11767l;
            this.f11768m = bVar.f11768m;
            this.n = bVar.n;
            this.f11769o = bVar.f11769o;
        }

        @Override // i4.i.d
        public final boolean a() {
            if (!this.f11762g.b() && !this.f11760e.b()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // i4.i.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(int[] iArr) {
            boolean z10;
            p2.c cVar;
            p2.c cVar2 = this.f11762g;
            boolean z11 = true;
            if (cVar2.b()) {
                ColorStateList colorStateList = cVar2.f16714b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != cVar2.c) {
                    cVar2.c = colorForState;
                    z10 = true;
                    cVar = this.f11760e;
                    if (cVar.b()) {
                        ColorStateList colorStateList2 = cVar.f16714b;
                        int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                        if (colorForState2 != cVar.c) {
                            cVar.c = colorForState2;
                            return z11 | z10;
                        }
                    }
                    z11 = false;
                    return z11 | z10;
                }
            }
            z10 = false;
            cVar = this.f11760e;
            if (cVar.b()) {
            }
            z11 = false;
            return z11 | z10;
        }

        public float getFillAlpha() {
            return this.f11764i;
        }

        public int getFillColor() {
            return this.f11762g.c;
        }

        public float getStrokeAlpha() {
            return this.f11763h;
        }

        public int getStrokeColor() {
            return this.f11760e.c;
        }

        public float getStrokeWidth() {
            return this.f11761f;
        }

        public float getTrimPathEnd() {
            return this.f11766k;
        }

        public float getTrimPathOffset() {
            return this.f11767l;
        }

        public float getTrimPathStart() {
            return this.f11765j;
        }

        public void setFillAlpha(float f10) {
            this.f11764i = f10;
        }

        public void setFillColor(int i10) {
            this.f11762g.c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f11763h = f10;
        }

        public void setStrokeColor(int i10) {
            this.f11760e.c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f11761f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f11766k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f11767l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f11765j = f10;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f11784p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f11785a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f11786b;
        public final Matrix c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f11787d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f11788e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f11789f;

        /* renamed from: g  reason: collision with root package name */
        public final c f11790g;

        /* renamed from: h  reason: collision with root package name */
        public float f11791h;

        /* renamed from: i  reason: collision with root package name */
        public float f11792i;

        /* renamed from: j  reason: collision with root package name */
        public float f11793j;

        /* renamed from: k  reason: collision with root package name */
        public float f11794k;

        /* renamed from: l  reason: collision with root package name */
        public int f11795l;

        /* renamed from: m  reason: collision with root package name */
        public String f11796m;
        public Boolean n;

        /* renamed from: o  reason: collision with root package name */
        public final p.b<String, Object> f11797o;

        public f() {
            this.c = new Matrix();
            this.f11791h = 0.0f;
            this.f11792i = 0.0f;
            this.f11793j = 0.0f;
            this.f11794k = 0.0f;
            this.f11795l = 255;
            this.f11796m = null;
            this.n = null;
            this.f11797o = new p.b<>();
            this.f11790g = new c();
            this.f11785a = new Path();
            this.f11786b = new Path();
        }

        public f(f fVar) {
            this.c = new Matrix();
            this.f11791h = 0.0f;
            this.f11792i = 0.0f;
            this.f11793j = 0.0f;
            this.f11794k = 0.0f;
            this.f11795l = 255;
            this.f11796m = null;
            this.n = null;
            p.b<String, Object> bVar = new p.b<>();
            this.f11797o = bVar;
            this.f11790g = new c(fVar.f11790g, bVar);
            this.f11785a = new Path(fVar.f11785a);
            this.f11786b = new Path(fVar.f11786b);
            this.f11791h = fVar.f11791h;
            this.f11792i = fVar.f11792i;
            this.f11793j = fVar.f11793j;
            this.f11794k = fVar.f11794k;
            this.f11795l = fVar.f11795l;
            this.f11796m = fVar.f11796m;
            String str = fVar.f11796m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.n = fVar.n;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x022e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            int i12;
            float f10;
            float f11;
            boolean z10;
            boolean z11;
            p2.c cVar2;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.f11770a.set(matrix);
            Matrix matrix2 = cVar.f11770a;
            matrix2.preConcat(cVar.f11778j);
            canvas.save();
            char c = 0;
            int i13 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f11771b;
                if (i13 < arrayList.size()) {
                    d dVar = arrayList.get(i13);
                    if (dVar instanceof c) {
                        a((c) dVar, matrix2, canvas, i10, i11);
                    } else if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f12 = i10 / this.f11793j;
                        float f13 = i11 / this.f11794k;
                        float min = Math.min(f12, f13);
                        Matrix matrix3 = this.c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f12, f13);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        i12 = i13;
                        float hypot = (float) Math.hypot(fArr[2], fArr[3]);
                        float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), hypot);
                        if (max > 0.0f) {
                            f10 = Math.abs(f14) / max;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != 0.0f) {
                            eVar.getClass();
                            Path path = this.f11785a;
                            path.reset();
                            d.a[] aVarArr = eVar.f11781a;
                            if (aVarArr != null) {
                                d.a.b(aVarArr, path);
                            }
                            Path path2 = this.f11786b;
                            path2.reset();
                            if (eVar instanceof a) {
                                if (eVar.c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f15 = bVar.f11765j;
                                if (f15 != 0.0f || bVar.f11766k != 1.0f) {
                                    float f16 = bVar.f11767l;
                                    float f17 = (f15 + f16) % 1.0f;
                                    float f18 = (bVar.f11766k + f16) % 1.0f;
                                    if (this.f11789f == null) {
                                        this.f11789f = new PathMeasure();
                                    }
                                    this.f11789f.setPath(path, false);
                                    float length = this.f11789f.getLength();
                                    float f19 = f17 * length;
                                    float f20 = f18 * length;
                                    path.reset();
                                    if (f19 > f20) {
                                        this.f11789f.getSegment(f19, length, path, true);
                                        f11 = 0.0f;
                                        this.f11789f.getSegment(0.0f, f20, path, true);
                                    } else {
                                        f11 = 0.0f;
                                        this.f11789f.getSegment(f19, f20, path, true);
                                    }
                                    path.rLineTo(f11, f11);
                                }
                                path2.addPath(path, matrix3);
                                p2.c cVar3 = bVar.f11762g;
                                if (cVar3.f16713a != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10 && cVar3.c == 0) {
                                    z11 = false;
                                    if (z11) {
                                        if (this.f11788e == null) {
                                            Paint paint = new Paint(1);
                                            this.f11788e = paint;
                                            paint.setStyle(Paint.Style.FILL);
                                        }
                                        Paint paint2 = this.f11788e;
                                        Shader shader = cVar3.f16713a;
                                        if (shader != null) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            shader.setLocalMatrix(matrix3);
                                            paint2.setShader(shader);
                                            paint2.setAlpha(Math.round(bVar.f11764i * 255.0f));
                                        } else {
                                            paint2.setShader(null);
                                            paint2.setAlpha(255);
                                            int i14 = cVar3.c;
                                            float f21 = bVar.f11764i;
                                            PorterDuff.Mode mode = i.f11752r;
                                            paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f21)) << 24));
                                        }
                                        paint2.setColorFilter(null);
                                        if (bVar.c == 0) {
                                            fillType = Path.FillType.WINDING;
                                        } else {
                                            fillType = Path.FillType.EVEN_ODD;
                                        }
                                        path2.setFillType(fillType);
                                        canvas.drawPath(path2, paint2);
                                    }
                                    cVar2 = bVar.f11760e;
                                    if (cVar2.f16713a == null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12 && cVar2.c == 0) {
                                        z13 = false;
                                        if (z13) {
                                            if (this.f11787d == null) {
                                                z14 = true;
                                                Paint paint3 = new Paint(1);
                                                this.f11787d = paint3;
                                                paint3.setStyle(Paint.Style.STROKE);
                                            } else {
                                                z14 = true;
                                            }
                                            Paint paint4 = this.f11787d;
                                            Paint.Join join = bVar.n;
                                            if (join != null) {
                                                paint4.setStrokeJoin(join);
                                            }
                                            Paint.Cap cap = bVar.f11768m;
                                            if (cap != null) {
                                                paint4.setStrokeCap(cap);
                                            }
                                            paint4.setStrokeMiter(bVar.f11769o);
                                            Shader shader2 = cVar2.f16713a;
                                            if (shader2 == null) {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                shader2.setLocalMatrix(matrix3);
                                                paint4.setShader(shader2);
                                                paint4.setAlpha(Math.round(bVar.f11763h * 255.0f));
                                            } else {
                                                paint4.setShader(null);
                                                paint4.setAlpha(255);
                                                int i15 = cVar2.c;
                                                float f22 = bVar.f11763h;
                                                PorterDuff.Mode mode2 = i.f11752r;
                                                paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f22)) << 24));
                                            }
                                            paint4.setColorFilter(null);
                                            paint4.setStrokeWidth(bVar.f11761f * f10 * min);
                                            canvas.drawPath(path2, paint4);
                                        }
                                    }
                                    z13 = true;
                                    if (z13) {
                                    }
                                }
                                z11 = true;
                                if (z11) {
                                }
                                cVar2 = bVar.f11760e;
                                if (cVar2.f16713a == null) {
                                }
                                if (!z12) {
                                    z13 = false;
                                    if (z13) {
                                    }
                                }
                                z13 = true;
                                if (z13) {
                                }
                            }
                        }
                        i13 = i12 + 1;
                        c = 0;
                    }
                    i12 = i13;
                    i13 = i12 + 1;
                    c = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11795l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f11795l = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f11798a;

        /* renamed from: b  reason: collision with root package name */
        public f f11799b;
        public ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f11800d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11801e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f11802f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f11803g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f11804h;

        /* renamed from: i  reason: collision with root package name */
        public int f11805i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f11806j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f11807k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f11808l;

        public g() {
            this.c = null;
            this.f11800d = i.f11752r;
            this.f11799b = new f();
        }

        public g(g gVar) {
            this.c = null;
            this.f11800d = i.f11752r;
            if (gVar != null) {
                this.f11798a = gVar.f11798a;
                f fVar = new f(gVar.f11799b);
                this.f11799b = fVar;
                if (gVar.f11799b.f11788e != null) {
                    fVar.f11788e = new Paint(gVar.f11799b.f11788e);
                }
                if (gVar.f11799b.f11787d != null) {
                    this.f11799b.f11787d = new Paint(gVar.f11799b.f11787d);
                }
                this.c = gVar.c;
                this.f11800d = gVar.f11800d;
                this.f11801e = gVar.f11801e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11798a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f11809a;

        public h(Drawable.ConstantState constantState) {
            this.f11809a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f11809a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11809a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            i iVar = new i();
            iVar.f11751i = (VectorDrawable) this.f11809a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f11751i = (VectorDrawable) this.f11809a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f11751i = (VectorDrawable) this.f11809a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public i() {
        this.n = true;
        this.f11757o = new float[9];
        this.f11758p = new Matrix();
        this.f11759q = new Rect();
        this.f11753j = new g();
    }

    public i(g gVar) {
        this.n = true;
        this.f11757o = new float[9];
        this.f11758p = new Matrix();
        this.f11759q = new Rect();
        this.f11753j = gVar;
        this.f11754k = a(gVar.c, gVar.f11800d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r10 == false) goto L70;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Paint paint;
        boolean z12;
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f11759q;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f11755l;
            if (colorFilter == null) {
                colorFilter = this.f11754k;
            }
            Matrix matrix = this.f11758p;
            canvas.getMatrix(matrix);
            float[] fArr = this.f11757o;
            matrix.getValues(fArr);
            boolean z13 = false;
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && r2.a.b(this) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                g gVar = this.f11753j;
                Bitmap bitmap = gVar.f11802f;
                if (bitmap != null) {
                    if (min == bitmap.getWidth() && min2 == gVar.f11802f.getHeight()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                gVar.f11802f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                gVar.f11807k = true;
                if (!this.n) {
                    g gVar2 = this.f11753j;
                    gVar2.f11802f.eraseColor(0);
                    Canvas canvas2 = new Canvas(gVar2.f11802f);
                    f fVar = gVar2.f11799b;
                    fVar.a(fVar.f11790g, f.f11784p, canvas2, min, min2);
                } else {
                    g gVar3 = this.f11753j;
                    if (!gVar3.f11807k && gVar3.f11803g == gVar3.c && gVar3.f11804h == gVar3.f11800d && gVar3.f11806j == gVar3.f11801e && gVar3.f11805i == gVar3.f11799b.getRootAlpha()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        g gVar4 = this.f11753j;
                        gVar4.f11802f.eraseColor(0);
                        Canvas canvas3 = new Canvas(gVar4.f11802f);
                        f fVar2 = gVar4.f11799b;
                        fVar2.a(fVar2.f11790g, f.f11784p, canvas3, min, min2);
                        g gVar5 = this.f11753j;
                        gVar5.f11803g = gVar5.c;
                        gVar5.f11804h = gVar5.f11800d;
                        gVar5.f11805i = gVar5.f11799b.getRootAlpha();
                        gVar5.f11806j = gVar5.f11801e;
                        gVar5.f11807k = false;
                    }
                }
                g gVar6 = this.f11753j;
                if (gVar6.f11799b.getRootAlpha() < 255) {
                    z13 = true;
                }
                if (!z13 && colorFilter == null) {
                    paint = null;
                } else {
                    if (gVar6.f11808l == null) {
                        Paint paint2 = new Paint();
                        gVar6.f11808l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    gVar6.f11808l.setAlpha(gVar6.f11799b.getRootAlpha());
                    gVar6.f11808l.setColorFilter(colorFilter);
                    paint = gVar6.f11808l;
                }
                canvas.drawBitmap(gVar6.f11802f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return a.C0214a.a(drawable);
        }
        return this.f11753j.f11799b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11753j.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f11755l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11751i == null || Build.VERSION.SDK_INT < 24) {
            this.f11753j.f11798a = getChangingConfigurations();
            return this.f11753j;
        }
        return new h(this.f11751i.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11753j.f11799b.f11792i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11753j.f11799b.f11791h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f fVar;
        int i10;
        Resources resources2 = resources;
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.b.d(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f11753j;
        gVar.f11799b = new f();
        TypedArray g10 = k.g(resources2, theme, attributeSet, i4.a.f11726a);
        g gVar2 = this.f11753j;
        f fVar2 = gVar2.f11799b;
        int d5 = k.d(g10, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (d5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (d5 != 5) {
            if (d5 != 9) {
                switch (d5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case ma.i.f16049q /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.f11800d = mode;
        ColorStateList a10 = k.a(g10, xmlPullParser, theme);
        if (a10 != null) {
            gVar2.c = a10;
        }
        boolean z10 = gVar2.f11801e;
        if (k.f(xmlPullParser, "autoMirrored")) {
            z10 = g10.getBoolean(5, z10);
        }
        gVar2.f11801e = z10;
        fVar2.f11793j = k.c(g10, xmlPullParser, "viewportWidth", 7, fVar2.f11793j);
        float c10 = k.c(g10, xmlPullParser, "viewportHeight", 8, fVar2.f11794k);
        fVar2.f11794k = c10;
        if (fVar2.f11793j <= 0.0f) {
            throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c10 <= 0.0f) {
            throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            fVar2.f11791h = g10.getDimension(3, fVar2.f11791h);
            int i11 = 2;
            float dimension = g10.getDimension(2, fVar2.f11792i);
            fVar2.f11792i = dimension;
            if (fVar2.f11791h <= 0.0f) {
                throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                fVar2.setAlpha(k.c(g10, xmlPullParser, "alpha", 4, fVar2.getAlpha()));
                String string = g10.getString(0);
                if (string != null) {
                    fVar2.f11796m = string;
                    fVar2.f11797o.put(string, fVar2);
                }
                g10.recycle();
                gVar.f11798a = getChangingConfigurations();
                int i12 = 1;
                gVar.f11807k = true;
                g gVar3 = this.f11753j;
                f fVar3 = gVar3.f11799b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(fVar3.f11790g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                for (int i13 = 3; eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != i13); i13 = 3) {
                    if (eventType == i11) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i10 = depth;
                        p.b<String, Object> bVar = fVar3.f11797o;
                        if (equals) {
                            b bVar2 = new b();
                            TypedArray g11 = k.g(resources2, theme, attributeSet, i4.a.c);
                            if (k.f(xmlPullParser, "pathData")) {
                                String string2 = g11.getString(0);
                                if (string2 != null) {
                                    bVar2.f11782b = string2;
                                }
                                String string3 = g11.getString(2);
                                if (string3 != null) {
                                    bVar2.f11781a = q2.d.c(string3);
                                }
                                bVar2.f11762g = k.b(g11, xmlPullParser, theme, "fillColor", 1);
                                fVar = fVar3;
                                bVar2.f11764i = k.c(g11, xmlPullParser, "fillAlpha", 12, bVar2.f11764i);
                                int d10 = k.d(g11, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = bVar2.f11768m;
                                if (d10 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (d10 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (d10 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                bVar2.f11768m = cap;
                                int d11 = k.d(g11, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = bVar2.n;
                                if (d11 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (d11 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (d11 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                bVar2.n = join;
                                bVar2.f11769o = k.c(g11, xmlPullParser, "strokeMiterLimit", 10, bVar2.f11769o);
                                bVar2.f11760e = k.b(g11, xmlPullParser, theme, "strokeColor", 3);
                                bVar2.f11763h = k.c(g11, xmlPullParser, "strokeAlpha", 11, bVar2.f11763h);
                                bVar2.f11761f = k.c(g11, xmlPullParser, "strokeWidth", 4, bVar2.f11761f);
                                bVar2.f11766k = k.c(g11, xmlPullParser, "trimPathEnd", 6, bVar2.f11766k);
                                bVar2.f11767l = k.c(g11, xmlPullParser, "trimPathOffset", 7, bVar2.f11767l);
                                bVar2.f11765j = k.c(g11, xmlPullParser, "trimPathStart", 5, bVar2.f11765j);
                                bVar2.c = k.d(g11, xmlPullParser, "fillType", 13, bVar2.c);
                            } else {
                                fVar = fVar3;
                            }
                            g11.recycle();
                            cVar.f11771b.add(bVar2);
                            if (bVar2.getPathName() != null) {
                                bVar.put(bVar2.getPathName(), bVar2);
                            }
                            gVar3.f11798a = bVar2.f11783d | gVar3.f11798a;
                            z11 = false;
                        } else {
                            fVar = fVar3;
                            if ("clip-path".equals(name)) {
                                a aVar = new a();
                                if (k.f(xmlPullParser, "pathData")) {
                                    TypedArray g12 = k.g(resources2, theme, attributeSet, i4.a.f11728d);
                                    String string4 = g12.getString(0);
                                    if (string4 != null) {
                                        aVar.f11782b = string4;
                                    }
                                    String string5 = g12.getString(1);
                                    if (string5 != null) {
                                        aVar.f11781a = q2.d.c(string5);
                                    }
                                    aVar.c = k.d(g12, xmlPullParser, "fillType", 2, 0);
                                    g12.recycle();
                                }
                                cVar.f11771b.add(aVar);
                                if (aVar.getPathName() != null) {
                                    bVar.put(aVar.getPathName(), aVar);
                                }
                                gVar3.f11798a |= aVar.f11783d;
                            } else if ("group".equals(name)) {
                                c cVar2 = new c();
                                TypedArray g13 = k.g(resources2, theme, attributeSet, i4.a.f11727b);
                                cVar2.c = k.c(g13, xmlPullParser, "rotation", 5, cVar2.c);
                                cVar2.f11772d = g13.getFloat(1, cVar2.f11772d);
                                cVar2.f11773e = g13.getFloat(2, cVar2.f11773e);
                                cVar2.f11774f = k.c(g13, xmlPullParser, "scaleX", 3, cVar2.f11774f);
                                cVar2.f11775g = k.c(g13, xmlPullParser, "scaleY", 4, cVar2.f11775g);
                                cVar2.f11776h = k.c(g13, xmlPullParser, "translateX", 6, cVar2.f11776h);
                                cVar2.f11777i = k.c(g13, xmlPullParser, "translateY", 7, cVar2.f11777i);
                                String string6 = g13.getString(0);
                                if (string6 != null) {
                                    cVar2.f11780l = string6;
                                }
                                cVar2.c();
                                g13.recycle();
                                cVar.f11771b.add(cVar2);
                                arrayDeque.push(cVar2);
                                if (cVar2.getGroupName() != null) {
                                    bVar.put(cVar2.getGroupName(), cVar2);
                                }
                                gVar3.f11798a = cVar2.f11779k | gVar3.f11798a;
                            }
                        }
                    } else {
                        fVar = fVar3;
                        i10 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources2 = resources;
                    depth = i10;
                    fVar3 = fVar;
                    i12 = 1;
                    i11 = 2;
                }
                if (!z11) {
                    this.f11754k = a(gVar.c, gVar.f11800d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires height > 0");
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return a.C0214a.d(drawable);
        }
        return this.f11753j.f11801e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f11753j;
            if (gVar != null) {
                f fVar = gVar.f11799b;
                if (fVar.n == null) {
                    fVar.n = Boolean.valueOf(fVar.f11790g.a());
                }
                if (!fVar.n.booleanValue()) {
                    ColorStateList colorStateList = this.f11753j.c;
                    if (colorStateList != null && colorStateList.isStateful()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11756m && super.mutate() == this) {
            this.f11753j = new g(this.f11753j);
            this.f11756m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f11753j;
        ColorStateList colorStateList = gVar.c;
        if (colorStateList != null && (mode = gVar.f11800d) != null) {
            this.f11754k = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = gVar.f11799b;
        if (fVar.n == null) {
            fVar.n = Boolean.valueOf(fVar.f11790g.a());
        }
        if (fVar.n.booleanValue()) {
            boolean b5 = gVar.f11799b.f11790g.b(iArr);
            gVar.f11807k |= b5;
            if (b5) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f11753j.f11799b.getRootAlpha() != i10) {
            this.f11753j.f11799b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.C0214a.e(drawable, z10);
        } else {
            this.f11753j.f11801e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f11755l = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            r2.a.d(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f11753j;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.f11754k = a(colorStateList, gVar.f11800d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        g gVar = this.f11753j;
        if (gVar.f11800d != mode) {
            gVar.f11800d = mode;
            this.f11754k = a(gVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f11751i;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11751i;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f11770a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f11771b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f11772d;

        /* renamed from: e  reason: collision with root package name */
        public float f11773e;

        /* renamed from: f  reason: collision with root package name */
        public float f11774f;

        /* renamed from: g  reason: collision with root package name */
        public float f11775g;

        /* renamed from: h  reason: collision with root package name */
        public float f11776h;

        /* renamed from: i  reason: collision with root package name */
        public float f11777i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f11778j;

        /* renamed from: k  reason: collision with root package name */
        public final int f11779k;

        /* renamed from: l  reason: collision with root package name */
        public String f11780l;

        public c() {
            this.f11770a = new Matrix();
            this.f11771b = new ArrayList<>();
            this.c = 0.0f;
            this.f11772d = 0.0f;
            this.f11773e = 0.0f;
            this.f11774f = 1.0f;
            this.f11775g = 1.0f;
            this.f11776h = 0.0f;
            this.f11777i = 0.0f;
            this.f11778j = new Matrix();
            this.f11780l = null;
        }

        @Override // i4.i.d
        public final boolean a() {
            int i10 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f11771b;
                if (i10 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i10).a()) {
                    return true;
                }
                i10++;
            }
        }

        @Override // i4.i.d
        public final boolean b(int[] iArr) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList<d> arrayList = this.f11771b;
                if (i10 >= arrayList.size()) {
                    return z10;
                }
                z10 |= arrayList.get(i10).b(iArr);
                i10++;
            }
        }

        public final void c() {
            Matrix matrix = this.f11778j;
            matrix.reset();
            matrix.postTranslate(-this.f11772d, -this.f11773e);
            matrix.postScale(this.f11774f, this.f11775g);
            matrix.postRotate(this.c, 0.0f, 0.0f);
            matrix.postTranslate(this.f11776h + this.f11772d, this.f11777i + this.f11773e);
        }

        public String getGroupName() {
            return this.f11780l;
        }

        public Matrix getLocalMatrix() {
            return this.f11778j;
        }

        public float getPivotX() {
            return this.f11772d;
        }

        public float getPivotY() {
            return this.f11773e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f11774f;
        }

        public float getScaleY() {
            return this.f11775g;
        }

        public float getTranslateX() {
            return this.f11776h;
        }

        public float getTranslateY() {
            return this.f11777i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f11772d) {
                this.f11772d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f11773e) {
                this.f11773e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.c) {
                this.c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f11774f) {
                this.f11774f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f11775g) {
                this.f11775g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f11776h) {
                this.f11776h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f11777i) {
                this.f11777i = f10;
                c();
            }
        }

        public c(c cVar, p.b<String, Object> bVar) {
            e aVar;
            this.f11770a = new Matrix();
            this.f11771b = new ArrayList<>();
            this.c = 0.0f;
            this.f11772d = 0.0f;
            this.f11773e = 0.0f;
            this.f11774f = 1.0f;
            this.f11775g = 1.0f;
            this.f11776h = 0.0f;
            this.f11777i = 0.0f;
            Matrix matrix = new Matrix();
            this.f11778j = matrix;
            this.f11780l = null;
            this.c = cVar.c;
            this.f11772d = cVar.f11772d;
            this.f11773e = cVar.f11773e;
            this.f11774f = cVar.f11774f;
            this.f11775g = cVar.f11775g;
            this.f11776h = cVar.f11776h;
            this.f11777i = cVar.f11777i;
            String str = cVar.f11780l;
            this.f11780l = str;
            this.f11779k = cVar.f11779k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f11778j);
            ArrayList<d> arrayList = cVar.f11771b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f11771b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (!(dVar instanceof a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        aVar = new a((a) dVar);
                    }
                    this.f11771b.add(aVar);
                    String str2 = aVar.f11782b;
                    if (str2 != null) {
                        bVar.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f11781a;

        /* renamed from: b  reason: collision with root package name */
        public String f11782b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11783d;

        public e() {
            this.f11781a = null;
            this.c = 0;
        }

        public d.a[] getPathData() {
            return this.f11781a;
        }

        public String getPathName() {
            return this.f11782b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!q2.d.a(this.f11781a, aVarArr)) {
                this.f11781a = q2.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f11781a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f16875a = aVarArr[i10].f16875a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f16876b;
                    if (i11 < fArr.length) {
                        aVarArr2[i10].f16876b[i11] = fArr[i11];
                        i11++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f11781a = null;
            this.c = 0;
            this.f11782b = eVar.f11782b;
            this.f11783d = eVar.f11783d;
            this.f11781a = q2.d.e(eVar.f11781a);
        }
    }
}
