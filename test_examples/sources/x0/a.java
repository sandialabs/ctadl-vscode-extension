package x0;

import android.graphics.Paint;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.k;
import kotlin.NoWhenBranchMatchedException;
import v0.m;
import v0.o;
import v0.r;
import v0.s;
import v0.w;
import v0.z;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: i  reason: collision with root package name */
    public final C0237a f18549i = new C0237a();

    /* renamed from: j  reason: collision with root package name */
    public final b f18550j = new b();

    /* renamed from: k  reason: collision with root package name */
    public v0.f f18551k;

    /* renamed from: l  reason: collision with root package name */
    public v0.f f18552l;

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0237a {

        /* renamed from: a  reason: collision with root package name */
        public b2.b f18553a;

        /* renamed from: b  reason: collision with root package name */
        public LayoutDirection f18554b;
        public o c;

        /* renamed from: d  reason: collision with root package name */
        public long f18555d;

        public C0237a() {
            b2.c cVar = v8.b.f18179f;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            g gVar = new g();
            long j2 = u0.f.f17736b;
            this.f18553a = cVar;
            this.f18554b = layoutDirection;
            this.c = gVar;
            this.f18555d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0237a) {
                C0237a c0237a = (C0237a) obj;
                return v7.g.a(this.f18553a, c0237a.f18553a) && this.f18554b == c0237a.f18554b && v7.g.a(this.c, c0237a.c) && u0.f.a(this.f18555d, c0237a.f18555d);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f18554b.hashCode();
            int hashCode2 = this.c.hashCode();
            long j2 = this.f18555d;
            int i10 = u0.f.f17737d;
            return ((int) (j2 ^ (j2 >>> 32))) + ((hashCode2 + ((hashCode + (this.f18553a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.f18553a + ", layoutDirection=" + this.f18554b + ", canvas=" + this.c + ", size=" + ((Object) u0.f.e(this.f18555d)) + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final x0.b f18556a = new x0.b(this);

        public b() {
        }

        @Override // x0.d
        public final long a() {
            return a.this.f18549i.f18555d;
        }

        @Override // x0.d
        public final o b() {
            return a.this.f18549i.c;
        }

        @Override // x0.d
        public final void c(long j2) {
            a.this.f18549i.f18555d = j2;
        }
    }

    public static v0.f b(a aVar, long j2, k kVar, float f10, s sVar, int i10) {
        boolean z10;
        boolean z11;
        v0.f l2 = aVar.l(kVar);
        boolean z12 = false;
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            j2 = r.b(j2, r.d(j2) * f10);
        }
        if (!r.c(l2.c(), j2)) {
            l2.f(j2);
        }
        if (l2.c != null) {
            l2.h(null);
        }
        if (!v7.g.a(l2.f18107d, sVar)) {
            l2.g(sVar);
        }
        if (l2.f18106b == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            l2.e(i10);
        }
        Paint paint = l2.f18105a;
        v7.g.f(paint, "<this>");
        if (paint.isFilterBitmap()) {
            z12 = true;
        }
        if (!z12) {
            v7.g.f(paint, "$this$setNativeFilterQuality");
            paint.setFilterBitmap(true);
        }
        return l2;
    }

    @Override // x0.f
    public final void F(m mVar, long j2, long j10, float f10, k kVar, s sVar, int i10) {
        v7.g.f(mVar, "brush");
        v7.g.f(kVar, "style");
        this.f18549i.c.d(u0.c.b(j2), u0.c.c(j2), u0.f.d(j10) + u0.c.b(j2), u0.f.b(j10) + u0.c.c(j2), f(mVar, kVar, f10, sVar, i10, 1));
    }

    @Override // b2.b
    public final float H(float f10) {
        return getDensity() * f10;
    }

    @Override // x0.f
    public final void K(v0.h hVar, long j2, float f10, k kVar, s sVar, int i10) {
        v7.g.f(hVar, "path");
        v7.g.f(kVar, "style");
        this.f18549i.c.k(hVar, b(this, j2, kVar, f10, sVar, i10));
    }

    @Override // x0.f
    public final void L(long j2, float f10, long j10, float f11, k kVar, s sVar, int i10) {
        v7.g.f(kVar, "style");
        this.f18549i.c.e(f10, j10, b(this, j2, kVar, f11, sVar, i10));
    }

    @Override // x0.f
    public final b N() {
        return this.f18550j;
    }

    @Override // x0.f
    public final void X(long j2, long j10, long j11, long j12, k kVar, float f10, s sVar, int i10) {
        this.f18549i.c.a(u0.c.b(j10), u0.c.c(j10), u0.f.d(j11) + u0.c.b(j10), u0.f.b(j11) + u0.c.c(j10), u0.a.b(j12), u0.a.c(j12), b(this, j2, kVar, f10, sVar, i10));
    }

    @Override // x0.f
    public final void Y(long j2, long j10, long j11, float f10, k kVar, s sVar, int i10) {
        v7.g.f(kVar, "style");
        this.f18549i.c.d(u0.c.b(j10), u0.c.c(j10), u0.f.d(j11) + u0.c.b(j10), u0.f.b(j11) + u0.c.c(j10), b(this, j2, kVar, f10, sVar, i10));
    }

    @Override // x0.f
    public final long a() {
        int i10 = e.f18559a;
        return this.f18550j.a();
    }

    @Override // b2.b
    public final /* synthetic */ int a0(float f10) {
        return androidx.activity.e.a(f10, this);
    }

    @Override // x0.f
    public final void d0(z zVar, m mVar, float f10, k kVar, s sVar, int i10) {
        v7.g.f(zVar, "path");
        v7.g.f(mVar, "brush");
        v7.g.f(kVar, "style");
        this.f18549i.c.k(zVar, f(mVar, kVar, f10, sVar, i10, 1));
    }

    @Override // x0.f
    public final long e0() {
        int i10 = e.f18559a;
        return a1.c.u0(this.f18550j.a());
    }

    public final v0.f f(m mVar, k kVar, float f10, s sVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        v0.f l2 = l(kVar);
        boolean z13 = false;
        if (mVar != null) {
            mVar.a(f10, a(), l2);
        } else {
            if (l2.b() == f10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                l2.d(f10);
            }
        }
        if (!v7.g.a(l2.f18107d, sVar)) {
            l2.g(sVar);
        }
        if (l2.f18106b == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            l2.e(i10);
        }
        Paint paint = l2.f18105a;
        v7.g.f(paint, "<this>");
        if (paint.isFilterBitmap() == i11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            v7.g.f(paint, "$this$setNativeFilterQuality");
            if (i11 == 0) {
                z13 = true;
            }
            paint.setFilterBitmap(!z13);
        }
        return l2;
    }

    @Override // b2.b
    public final /* synthetic */ long g0(long j2) {
        return androidx.activity.e.d(j2, this);
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f18549i.f18553a.getDensity();
    }

    @Override // x0.f
    public final LayoutDirection getLayoutDirection() {
        return this.f18549i.f18554b;
    }

    @Override // b2.b
    public final /* synthetic */ float i0(long j2) {
        return androidx.activity.e.c(j2, this);
    }

    @Override // x0.f
    public final void j0(m mVar, long j2, long j10, long j11, float f10, k kVar, s sVar, int i10) {
        v7.g.f(mVar, "brush");
        v7.g.f(kVar, "style");
        this.f18549i.c.a(u0.c.b(j2), u0.c.c(j2), u0.c.b(j2) + u0.f.d(j10), u0.c.c(j2) + u0.f.b(j10), u0.a.b(j11), u0.a.c(j11), f(mVar, kVar, f10, sVar, i10, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v0.f l(k kVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        float strokeMiter;
        float f10;
        boolean z12;
        Paint.Join strokeJoin;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        Paint.Join join;
        boolean z16;
        boolean z17;
        Paint.Cap cap;
        boolean z18 = false;
        if (v7.g.a(kVar, h.f18561i)) {
            v0.f fVar = this.f18551k;
            if (fVar == null) {
                v0.f fVar2 = new v0.f();
                fVar2.i(0);
                this.f18551k = fVar2;
                return fVar2;
            }
            return fVar;
        } else if (kVar instanceof i) {
            v0.f fVar3 = this.f18552l;
            if (fVar3 == null) {
                fVar3 = new v0.f();
                fVar3.i(1);
                this.f18552l = fVar3;
            }
            Paint paint = fVar3.f18105a;
            v7.g.f(paint, "<this>");
            float strokeWidth = paint.getStrokeWidth();
            i iVar = (i) kVar;
            float f11 = iVar.f18562i;
            if (strokeWidth == f11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Paint paint2 = fVar3.f18105a;
                v7.g.f(paint2, "<this>");
                paint2.setStrokeWidth(f11);
            }
            Paint.Cap strokeCap = paint.getStrokeCap();
            int i15 = -1;
            if (strokeCap == null) {
                i10 = -1;
            } else {
                i10 = v0.g.f18110a[strokeCap.ordinal()];
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        i11 = 2;
                    }
                } else {
                    i11 = 1;
                }
                i12 = iVar.f18564k;
                if (i11 != i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (i12 == 2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        cap = Paint.Cap.SQUARE;
                    } else {
                        if (i12 == 1) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            cap = Paint.Cap.ROUND;
                        } else {
                            cap = Paint.Cap.BUTT;
                        }
                    }
                    paint.setStrokeCap(cap);
                }
                strokeMiter = paint.getStrokeMiter();
                f10 = iVar.f18563j;
                if (strokeMiter != f10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    paint.setStrokeMiter(f10);
                }
                strokeJoin = paint.getStrokeJoin();
                if (strokeJoin == null) {
                    i15 = v0.g.f18111b[strokeJoin.ordinal()];
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            i13 = 1;
                        }
                    } else {
                        i13 = 2;
                    }
                    i14 = iVar.f18565l;
                    if (i13 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (i14 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            if (i14 == 2) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                join = Paint.Join.BEVEL;
                            } else {
                                if (i14 == 1) {
                                    z18 = true;
                                }
                                if (z18) {
                                    join = Paint.Join.ROUND;
                                }
                            }
                            paint.setStrokeJoin(join);
                        }
                        join = Paint.Join.MITER;
                        paint.setStrokeJoin(join);
                    }
                    fVar3.getClass();
                    iVar.getClass();
                    if (!v7.g.a(null, null)) {
                        paint.setPathEffect(null);
                        fVar3.getClass();
                    }
                    return fVar3;
                }
                i13 = 0;
                i14 = iVar.f18565l;
                if (i13 == i14) {
                }
                if (!z13) {
                }
                fVar3.getClass();
                iVar.getClass();
                if (!v7.g.a(null, null)) {
                }
                return fVar3;
            }
            i11 = 0;
            i12 = iVar.f18564k;
            if (i11 != i12) {
            }
            if (!z11) {
            }
            strokeMiter = paint.getStrokeMiter();
            f10 = iVar.f18563j;
            if (strokeMiter != f10) {
            }
            if (!z12) {
            }
            strokeJoin = paint.getStrokeJoin();
            if (strokeJoin == null) {
            }
            if (i15 != 1) {
            }
            i13 = 0;
            i14 = iVar.f18565l;
            if (i13 == i14) {
            }
            if (!z13) {
            }
            fVar3.getClass();
            iVar.getClass();
            if (!v7.g.a(null, null)) {
            }
            return fVar3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // x0.f
    public final void p0(w wVar, long j2, long j10, long j11, long j12, float f10, k kVar, s sVar, int i10, int i11) {
        v7.g.f(wVar, "image");
        v7.g.f(kVar, "style");
        this.f18549i.c.c(wVar, j2, j10, j11, j12, f(null, kVar, f10, sVar, i10, i11));
    }

    @Override // b2.b
    public final float r0(int i10) {
        return i10 / getDensity();
    }

    @Override // b2.b
    public final float t0(float f10) {
        return f10 / getDensity();
    }

    @Override // b2.b
    public final float y() {
        return this.f18549i.f18553a.y();
    }
}
