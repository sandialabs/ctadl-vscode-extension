package b6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b6.g;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final n[] f6455a = new n[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f6456b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f6457d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f6458e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f6459f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final n f6460g = new n();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f6461h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f6462i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f6463j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f6464k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6465l = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f6466a = new l();
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f6455a[i10] = new n();
            this.f6456b[i10] = new Matrix();
            this.c[i10] = new Matrix();
        }
    }

    public final void a(k kVar, float f10, RectF rectF, g.a aVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        n[] nVarArr;
        float centerX;
        float f11;
        e eVar;
        Path path2;
        g.a aVar2;
        c cVar;
        m0.b bVar;
        float f12;
        float f13;
        float f14;
        float f15;
        l lVar = this;
        k kVar2 = kVar;
        RectF rectF2 = rectF;
        g.a aVar3 = aVar;
        Path path3 = path;
        path.rewind();
        Path path4 = lVar.f6458e;
        path4.rewind();
        Path path5 = lVar.f6459f;
        path5.rewind();
        path5.addRect(rectF2, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i10 = 4;
            matrixArr = lVar.c;
            fArr = lVar.f6461h;
            matrixArr2 = lVar.f6456b;
            nVarArr = lVar.f6455a;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar = kVar2.f6437f;
                    } else {
                        cVar = kVar2.f6436e;
                    }
                } else {
                    cVar = kVar2.f6439h;
                }
            } else {
                cVar = kVar2.f6438g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        bVar = kVar2.f6434b;
                    } else {
                        bVar = kVar2.f6433a;
                    }
                } else {
                    bVar = kVar2.f6435d;
                }
            } else {
                bVar = kVar2.c;
            }
            n nVar = nVarArr[i11];
            bVar.getClass();
            bVar.k0(f10, cVar.a(rectF2), nVar);
            int i12 = i11 + 1;
            float f16 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = lVar.f6457d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        f15 = rectF2.right;
                    } else {
                        f15 = rectF2.left;
                    }
                    f13 = f15;
                    f14 = rectF2.top;
                    pointF.set(f13, f14);
                    matrixArr2[i11].setTranslate(pointF.x, pointF.y);
                    matrixArr2[i11].preRotate(f16);
                    n nVar2 = nVarArr[i11];
                    fArr[0] = nVar2.c;
                    fArr[1] = nVar2.f6470d;
                    matrixArr2[i11].mapPoints(fArr);
                    matrixArr[i11].reset();
                    matrixArr[i11].setTranslate(fArr[0], fArr[1]);
                    matrixArr[i11].preRotate(f16);
                    rectF2 = rectF;
                    i11 = i12;
                } else {
                    f12 = rectF2.left;
                }
            } else {
                f12 = rectF2.right;
            }
            f13 = f12;
            f14 = rectF2.bottom;
            pointF.set(f13, f14);
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f16);
            n nVar22 = nVarArr[i11];
            fArr[0] = nVar22.c;
            fArr[1] = nVar22.f6470d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f16);
            rectF2 = rectF;
            i11 = i12;
        }
        char c = 1;
        char c10 = 0;
        int i13 = 0;
        while (i13 < i10) {
            n nVar3 = nVarArr[i13];
            fArr[c10] = nVar3.f6468a;
            fArr[c] = nVar3.f6469b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path3.moveTo(fArr[c10], fArr[c]);
            } else {
                path3.lineTo(fArr[c10], fArr[c]);
            }
            nVarArr[i13].c(matrixArr2[i13], path3);
            if (aVar3 != null) {
                n nVar4 = nVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                g gVar = g.this;
                BitSet bitSet = gVar.f6394l;
                nVar4.getClass();
                bitSet.set(i13, false);
                nVar4.b(nVar4.f6472f);
                gVar.f6392j[i13] = new m(new ArrayList(nVar4.f6474h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            n nVar5 = nVarArr[i13];
            fArr[0] = nVar5.c;
            fArr[1] = nVar5.f6470d;
            matrixArr2[i13].mapPoints(fArr);
            n nVar6 = nVarArr[i15];
            float f17 = nVar6.f6468a;
            float[] fArr2 = lVar.f6462i;
            fArr2[0] = f17;
            fArr2[1] = nVar6.f6469b;
            matrixArr2[i15].mapPoints(fArr2);
            Path path6 = path4;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            n nVar7 = nVarArr[i13];
            fArr[0] = nVar7.c;
            fArr[1] = nVar7.f6470d;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                centerX = rectF.centerY();
                f11 = fArr[1];
            } else {
                centerX = rectF.centerX();
                f11 = fArr[0];
            }
            float abs = Math.abs(centerX - f11);
            n nVar8 = lVar.f6460g;
            nVar8.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = kVar2.f6441j;
                    } else {
                        eVar = kVar2.f6440i;
                    }
                } else {
                    eVar = kVar2.f6443l;
                }
            } else {
                eVar = kVar2.f6442k;
            }
            eVar.b(max, abs, f10, nVar8);
            Path path7 = lVar.f6463j;
            path7.reset();
            nVar8.c(matrixArr[i13], path7);
            if (lVar.f6465l && (eVar.a() || lVar.b(path7, i13) || lVar.b(path7, i15))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = nVar8.f6468a;
                fArr[1] = nVar8.f6469b;
                matrixArr[i13].mapPoints(fArr);
                path6.moveTo(fArr[0], fArr[1]);
                nVar8.c(matrixArr[i13], path6);
                aVar2 = aVar;
                path2 = path;
            } else {
                path2 = path;
                nVar8.c(matrixArr[i13], path2);
                aVar2 = aVar;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i13];
                g gVar2 = g.this;
                gVar2.f6394l.set(i13 + 4, false);
                nVar8.b(nVar8.f6472f);
                gVar2.f6393k[i13] = new m(new ArrayList(nVar8.f6474h), new Matrix(matrix2));
            }
            lVar = this;
            kVar2 = kVar;
            i13 = i14;
            c = 1;
            i10 = 4;
            c10 = 0;
            Path path8 = path2;
            path4 = path6;
            aVar3 = aVar2;
            path3 = path8;
        }
        Path path9 = path4;
        Path path10 = path3;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path10.op(path9, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f6464k;
        path2.reset();
        this.f6455a[i10].c(this.f6456b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
