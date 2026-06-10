package androidx.compose.ui.graphics.colorspace;

import java.util.Arrays;
import u7.l;
import v0.p;
import v7.g;
import v8.b;
import w0.c;
import w0.h;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f3138a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3139b;
    public final float[] c;

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0022a extends a {

        /* renamed from: d  reason: collision with root package name */
        public final Rgb f3140d;

        /* renamed from: e  reason: collision with root package name */
        public final Rgb f3141e;

        /* renamed from: f  reason: collision with root package name */
        public final float[] f3142f;

        public C0022a(Rgb rgb, Rgb rgb2, int i10) {
            super(rgb, rgb2, (float[]) null);
            boolean z10;
            float[] y10;
            this.f3140d = rgb;
            this.f3141e = rgb2;
            h hVar = rgb.f3118d;
            h hVar2 = rgb2.f3118d;
            boolean i11 = p.i(hVar, hVar2);
            float[] fArr = rgb.f3123i;
            float[] fArr2 = rgb2.f3124j;
            if (i11) {
                y10 = p.y(fArr2, fArr);
            } else {
                h hVar3 = rgb.f3118d;
                float[] a10 = hVar3.a();
                float[] a11 = hVar2.a();
                h hVar4 = b.f18176b;
                boolean i12 = p.i(hVar3, hVar4);
                float[] fArr3 = b.f18178e;
                float[] fArr4 = w0.a.f18235b.f18236a;
                if (!i12) {
                    float[] copyOf = Arrays.copyOf(fArr3, 3);
                    g.e(copyOf, "copyOf(this, size)");
                    fArr = p.y(p.h(fArr4, a10, copyOf), fArr);
                }
                if (!p.i(hVar2, hVar4)) {
                    float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                    g.e(copyOf2, "copyOf(this, size)");
                    fArr2 = p.s(p.y(p.h(fArr4, a11, copyOf2), rgb2.f3123i));
                }
                if (i10 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y10 = p.y(fArr2, z10 ? p.z(new float[]{a10[0] / a11[0], a10[1] / a11[1], a10[2] / a11[2]}, fArr) : fArr);
            }
            this.f3142f = y10;
        }

        @Override // androidx.compose.ui.graphics.colorspace.a
        public final void a(float[] fArr) {
            Rgb rgb = this.f3140d;
            fArr[0] = (float) ((Number) ((Rgb$eotf$1) rgb.n).U(Double.valueOf(fArr[0]))).doubleValue();
            l<Double, Double> lVar = rgb.n;
            fArr[1] = (float) ((Number) ((Rgb$eotf$1) lVar).U(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) ((Rgb$eotf$1) lVar).U(Double.valueOf(fArr[2]))).doubleValue();
            p.A(this.f3142f, fArr);
            Rgb rgb2 = this.f3141e;
            fArr[0] = (float) ((Number) ((Rgb$oetf$1) rgb2.f3126l).U(Double.valueOf(fArr[0]))).doubleValue();
            l<Double, Double> lVar2 = rgb2.f3126l;
            fArr[1] = (float) ((Number) ((Rgb$oetf$1) lVar2).U(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) ((Rgb$oetf$1) lVar2).U(Double.valueOf(fArr[2]))).doubleValue();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(c cVar, c cVar2, int i10) {
        this(r0, r1, r10);
        float[] fArr;
        long j2 = cVar.f18242b;
        long j10 = w0.b.f18237a;
        c d5 = w0.b.a(j2, j10) ? p.d(cVar) : cVar;
        c d10 = w0.b.a(cVar2.f18242b, j10) ? p.d(cVar2) : cVar2;
        if (i10 == 3) {
            boolean a10 = w0.b.a(cVar.f18242b, j10);
            boolean a11 = w0.b.a(cVar2.f18242b, j10);
            if (a10) {
                if (a11) {
                }
            }
            if (!a10) {
                if (a11) {
                }
            }
            if (!a10) {
                cVar = cVar2;
            }
            float[] fArr2 = b.f18178e;
            h hVar = ((Rgb) cVar).f3118d;
            float[] a12 = a10 ? hVar.a() : fArr2;
            fArr2 = a11 ? hVar.a() : fArr2;
            fArr = new float[]{a12[0] / fArr2[0], a12[1] / fArr2[1], a12[2] / fArr2[2]};
        }
        fArr = null;
    }

    public void a(float[] fArr) {
        float[] e10 = this.f3138a.e(fArr);
        float[] fArr2 = this.c;
        if (fArr2 != null) {
            e10[0] = e10[0] * fArr2[0];
            e10[1] = e10[1] * fArr2[1];
            e10[2] = e10[2] * fArr2[2];
        }
        this.f3139b.a(e10);
    }

    public a(c cVar, c cVar2, float[] fArr) {
        this.f3138a = cVar;
        this.f3139b = cVar2;
        this.c = fArr;
    }
}
