package v0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f18085a = d.f18088a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f18086b = new Rect();
    public final Rect c = new Rect();

    @Override // v0.o
    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, f fVar) {
        this.f18085a.drawRoundRect(f10, f11, f12, f13, f14, f15, fVar.f18105a);
    }

    @Override // v0.o
    public final void b(u0.d dVar, f fVar) {
        v7.g.f(fVar, "paint");
        d(dVar.f17726a, dVar.f17727b, dVar.c, dVar.f17728d, fVar);
    }

    @Override // v0.o
    public final void c(w wVar, long j2, long j10, long j11, long j12, f fVar) {
        v7.g.f(wVar, "image");
        Canvas canvas = this.f18085a;
        if (wVar instanceof e) {
            int i10 = b2.g.c;
            int i11 = (int) (j2 >> 32);
            Rect rect = this.f18086b;
            rect.left = i11;
            rect.top = b2.g.a(j2);
            rect.right = i11 + ((int) (j10 >> 32));
            rect.bottom = b2.h.b(j10) + b2.g.a(j2);
            m7.n nVar = m7.n.f16010a;
            int i12 = (int) (j11 >> 32);
            Rect rect2 = this.c;
            rect2.left = i12;
            rect2.top = b2.g.a(j11);
            rect2.right = i12 + ((int) (j12 >> 32));
            rect2.bottom = b2.h.b(j12) + b2.g.a(j11);
            canvas.drawBitmap(((e) wVar).f18089a, rect, rect2, fVar.f18105a);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @Override // v0.o
    public final void d(float f10, float f11, float f12, float f13, f fVar) {
        v7.g.f(fVar, "paint");
        this.f18085a.drawRect(f10, f11, f12, f13, fVar.f18105a);
    }

    @Override // v0.o
    public final void e(float f10, long j2, f fVar) {
        this.f18085a.drawCircle(u0.c.b(j2), u0.c.c(j2), f10, fVar.f18105a);
    }

    @Override // v0.o
    public final void f() {
        this.f18085a.scale(-1.0f, 1.0f);
    }

    @Override // v0.o
    public final void g(u0.d dVar, int i10) {
        h(dVar.f17726a, dVar.f17727b, dVar.c, dVar.f17728d, i10);
    }

    @Override // v0.o
    public final void h(float f10, float f11, float f12, float f13, int i10) {
        boolean z10;
        Region.Op op;
        Canvas canvas = this.f18085a;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f10, f11, f12, f13, op);
    }

    @Override // v0.o
    public final void i(float f10, float f11) {
        this.f18085a.translate(f10, f11);
    }

    @Override // v0.o
    public final void j(z zVar, int i10) {
        boolean z10;
        Region.Op op;
        v7.g.f(zVar, "path");
        Canvas canvas = this.f18085a;
        if (zVar instanceof h) {
            h hVar = (h) zVar;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                op = Region.Op.DIFFERENCE;
            } else {
                op = Region.Op.INTERSECT;
            }
            canvas.clipPath(hVar.f18115a, op);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // v0.o
    public final void k(z zVar, f fVar) {
        v7.g.f(zVar, "path");
        Canvas canvas = this.f18085a;
        if (zVar instanceof h) {
            canvas.drawPath(((h) zVar).f18115a, fVar.f18105a);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // v0.o
    public final void l() {
        this.f18085a.restore();
    }

    @Override // v0.o
    public final void m() {
        this.f18085a.save();
    }

    @Override // v0.o
    public final void n() {
        p.l(this.f18085a, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    @Override // v0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(float[] fArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        float f10;
        boolean z19;
        int i10 = 0;
        loop0: while (true) {
            if (i10 < 4) {
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i10 == i11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (fArr[(i10 * 4) + i11] == f10) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (!z19) {
                        z10 = false;
                        break loop0;
                    }
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            Matrix matrix = new Matrix();
            float f11 = fArr[2];
            if (f11 == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (fArr[6] == 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    if (fArr[10] == 1.0f) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        if (fArr[14] == 0.0f) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            if (fArr[8] == 0.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                if (fArr[9] == 0.0f) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    if (fArr[11] == 0.0f) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (z18) {
                                        z12 = true;
                                        if (!z12) {
                                            float f12 = fArr[0];
                                            float f13 = fArr[1];
                                            float f14 = fArr[3];
                                            float f15 = fArr[4];
                                            float f16 = fArr[5];
                                            float f17 = fArr[6];
                                            float f18 = fArr[7];
                                            float f19 = fArr[8];
                                            float f20 = fArr[12];
                                            float f21 = fArr[13];
                                            float f22 = fArr[15];
                                            fArr[0] = f12;
                                            fArr[1] = f15;
                                            fArr[2] = f20;
                                            fArr[3] = f13;
                                            fArr[4] = f16;
                                            fArr[5] = f21;
                                            fArr[6] = f14;
                                            fArr[7] = f18;
                                            fArr[8] = f22;
                                            matrix.setValues(fArr);
                                            fArr[0] = f12;
                                            fArr[1] = f13;
                                            fArr[2] = f11;
                                            fArr[3] = f14;
                                            fArr[4] = f15;
                                            fArr[5] = f16;
                                            fArr[6] = f17;
                                            fArr[7] = f18;
                                            fArr[8] = f19;
                                            this.f18085a.concat(matrix);
                                            return;
                                        }
                                        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z12 = false;
            if (!z12) {
            }
        }
    }

    @Override // v0.o
    public final void p() {
        p.l(this.f18085a, true);
    }

    @Override // v0.o
    public final void q(u0.d dVar, y yVar) {
        this.f18085a.saveLayer(dVar.f17726a, dVar.f17727b, dVar.c, dVar.f17728d, yVar.a(), 31);
    }

    public final Canvas r() {
        return this.f18085a;
    }

    public final void s(Canvas canvas) {
        v7.g.f(canvas, "<set-?>");
        this.f18085a = canvas;
    }
}
