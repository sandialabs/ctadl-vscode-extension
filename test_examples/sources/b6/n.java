package b6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f6468a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f6469b;
    @Deprecated
    public float c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f6470d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f6471e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f6472f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f6473g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f6474h = new ArrayList();

    /* loaded from: classes.dex */
    public static class a extends f {
        public final c c;

        public a(c cVar) {
            this.c = cVar;
        }

        @Override // b6.n.f
        public final void a(Matrix matrix, a6.a aVar, int i10, Canvas canvas) {
            boolean z10;
            c cVar = this.c;
            float f10 = cVar.f6481f;
            float f11 = cVar.f6482g;
            RectF rectF = new RectF(cVar.f6478b, cVar.c, cVar.f6479d, cVar.f6480e);
            aVar.getClass();
            if (f11 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path = aVar.f251g;
            int[] iArr = a6.a.f244k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar.f250f;
                iArr[2] = aVar.f249e;
                iArr[3] = aVar.f248d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i10;
                rectF.inset(f12, f12);
                iArr[0] = 0;
                iArr[1] = aVar.f248d;
                iArr[2] = aVar.f249e;
                iArr[3] = aVar.f250f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (i10 / width);
                float[] fArr = a6.a.f245l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = aVar.f247b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, aVar.f252h);
                }
                canvas.drawArc(rectF, f10, f11, true, paint);
                canvas.restore();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {
        public final d c;

        /* renamed from: d  reason: collision with root package name */
        public final float f6475d;

        /* renamed from: e  reason: collision with root package name */
        public final float f6476e;

        public b(d dVar, float f10, float f11) {
            this.c = dVar;
            this.f6475d = f10;
            this.f6476e = f11;
        }

        @Override // b6.n.f
        public final void a(Matrix matrix, a6.a aVar, int i10, Canvas canvas) {
            d dVar = this.c;
            float f10 = dVar.c;
            float f11 = this.f6476e;
            float f12 = dVar.f6483b;
            float f13 = this.f6475d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
            Matrix matrix2 = this.f6486a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i10;
            rectF.offset(0.0f, -i10);
            int[] iArr = a6.a.f242i;
            iArr[0] = aVar.f250f;
            iArr[1] = aVar.f249e;
            iArr[2] = aVar.f248d;
            Paint paint = aVar.c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, a6.a.f243j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.c;
            return (float) Math.toDegrees(Math.atan((dVar.c - this.f6476e) / (dVar.f6483b - this.f6475d)));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f6477h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f6478b;
        @Deprecated
        public float c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f6479d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f6480e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f6481f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f6482g;

        public c(float f10, float f11, float f12, float f13) {
            this.f6478b = f10;
            this.c = f11;
            this.f6479d = f12;
            this.f6480e = f13;
        }

        @Override // b6.n.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6484a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f6477h;
            rectF.set(this.f6478b, this.c, this.f6479d, this.f6480e);
            path.arcTo(rectF, this.f6481f, this.f6482g, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f6483b;
        public float c;

        @Override // b6.n.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6484a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f6483b, this.c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f6484a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Matrix f6485b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f6486a = new Matrix();

        public abstract void a(Matrix matrix, a6.a aVar, int i10, Canvas canvas);
    }

    public n() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        c cVar = new c(f10, f11, f12, f13);
        cVar.f6481f = f14;
        cVar.f6482g = f15;
        this.f6473g.add(cVar);
        a aVar = new a(cVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        b(f14);
        this.f6474h.add(aVar);
        this.f6471e = f16;
        double d5 = f17;
        this.c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d5)))) + ((f10 + f12) * 0.5f);
        this.f6470d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d5)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f6471e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.c;
        float f14 = this.f6470d;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f6481f = this.f6471e;
        cVar.f6482g = f12;
        this.f6474h.add(new a(cVar));
        this.f6471e = f10;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f6473g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f6483b = f10;
        dVar.c = f11;
        this.f6473g.add(dVar);
        b bVar = new b(dVar, this.c, this.f6470d);
        b(bVar.b() + 270.0f);
        this.f6474h.add(bVar);
        this.f6471e = bVar.b() + 270.0f;
        this.c = f10;
        this.f6470d = f11;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f6468a = f10;
        this.f6469b = f11;
        this.c = f10;
        this.f6470d = f11;
        this.f6471e = f12;
        this.f6472f = (f12 + f13) % 360.0f;
        this.f6473g.clear();
        this.f6474h.clear();
    }
}
