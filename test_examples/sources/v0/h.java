package v0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class h implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Path f18115a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f18116b;
    public final float[] c;

    public h() {
        this(0);
    }

    public /* synthetic */ h(int i10) {
        this(new Path());
    }

    public h(Path path) {
        v7.g.f(path, "internalPath");
        this.f18115a = path;
        this.f18116b = new RectF();
        this.c = new float[8];
        new Matrix();
    }

    @Override // v0.z
    public final boolean a() {
        return this.f18115a.isConvex();
    }

    @Override // v0.z
    public final void b(u0.e eVar) {
        v7.g.f(eVar, "roundRect");
        RectF rectF = this.f18116b;
        rectF.set(eVar.f17729a, eVar.f17730b, eVar.c, eVar.f17731d);
        long j2 = eVar.f17732e;
        float b5 = u0.a.b(j2);
        float[] fArr = this.c;
        fArr[0] = b5;
        fArr[1] = u0.a.c(j2);
        long j10 = eVar.f17733f;
        fArr[2] = u0.a.b(j10);
        fArr[3] = u0.a.c(j10);
        long j11 = eVar.f17734g;
        fArr[4] = u0.a.b(j11);
        fArr[5] = u0.a.c(j11);
        long j12 = eVar.f17735h;
        fArr[6] = u0.a.b(j12);
        fArr[7] = u0.a.c(j12);
        this.f18115a.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    @Override // v0.z
    public final void c(float f10, float f11) {
        this.f18115a.moveTo(f10, f11);
    }

    @Override // v0.z
    public final void close() {
        this.f18115a.close();
    }

    @Override // v0.z
    public final void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18115a.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // v0.z
    public final void e(float f10, float f11) {
        this.f18115a.rMoveTo(f10, f11);
    }

    @Override // v0.z
    public final void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18115a.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // v0.z
    public final void g(float f10, float f11, float f12, float f13) {
        this.f18115a.quadTo(f10, f11, f12, f13);
    }

    @Override // v0.z
    public final boolean h(z zVar, z zVar2, int i10) {
        Path.Op op;
        v7.g.f(zVar, "path1");
        if (i10 == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i10 == 1) {
                op = Path.Op.INTERSECT;
            } else {
                if (i10 == 4) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    op = i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        if (zVar instanceof h) {
            h hVar = (h) zVar;
            if (zVar2 instanceof h) {
                return this.f18115a.op(hVar.f18115a, ((h) zVar2).f18115a, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // v0.z
    public final void i(float f10, float f11, float f12, float f13) {
        this.f18115a.rQuadTo(f10, f11, f12, f13);
    }

    @Override // v0.z
    public final void j(float f10, float f11) {
        this.f18115a.rLineTo(f10, f11);
    }

    @Override // v0.z
    public final void k(float f10, float f11) {
        this.f18115a.lineTo(f10, f11);
    }

    @Override // v0.z
    public final void l() {
        this.f18115a.reset();
    }

    public final void m(z zVar, long j2) {
        v7.g.f(zVar, "path");
        if (!(zVar instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f18115a.addPath(((h) zVar).f18115a, u0.c.b(j2), u0.c.c(j2));
    }

    public final void n(u0.d dVar) {
        float f10 = dVar.f17726a;
        if (!Float.isNaN(f10)) {
            float f11 = dVar.f17727b;
            if (!Float.isNaN(f11)) {
                float f12 = dVar.c;
                if (!Float.isNaN(f12)) {
                    float f13 = dVar.f17728d;
                    if (!Float.isNaN(f13)) {
                        RectF rectF = this.f18116b;
                        rectF.set(new RectF(f10, f11, f12, f13));
                        this.f18115a.addRect(rectF, Path.Direction.CCW);
                        return;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    public final boolean o() {
        return this.f18115a.isEmpty();
    }
}
