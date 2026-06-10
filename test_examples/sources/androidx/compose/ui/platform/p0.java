package androidx.compose.ui.platform;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class p0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final u7.p<T, Matrix, m7.n> f3866a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f3867b;
    public Matrix c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f3868d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f3869e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3870f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3871g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3872h;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(u7.p<? super T, ? super Matrix, m7.n> pVar) {
        v7.g.f(pVar, "getMatrix");
        this.f3866a = pVar;
        this.f3870f = true;
        this.f3871g = true;
        this.f3872h = true;
    }

    public final float[] a(T t10) {
        float[] fArr = this.f3869e;
        if (fArr == null) {
            fArr = v0.p.k();
            this.f3869e = fArr;
        }
        if (this.f3871g) {
            this.f3872h = v0.p.t(b(t10), fArr);
            this.f3871g = false;
        }
        if (this.f3872h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T t10) {
        float[] fArr = this.f3868d;
        if (fArr == null) {
            fArr = v0.p.k();
            this.f3868d = fArr;
        }
        if (this.f3870f) {
            Matrix matrix = this.f3867b;
            if (matrix == null) {
                matrix = new Matrix();
                this.f3867b = matrix;
            }
            this.f3866a.R(t10, matrix);
            Matrix matrix2 = this.c;
            if (matrix2 == null || !v7.g.a(matrix, matrix2)) {
                a1.c.t1(matrix, fArr);
                this.f3867b = matrix2;
                this.c = matrix;
            }
            this.f3870f = false;
            return fArr;
        }
        return fArr;
    }

    public final void c() {
        this.f3870f = true;
        this.f3871g = true;
    }
}
