package z0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19020a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19021b;

    /* loaded from: classes.dex */
    public static final class a extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19022d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19023e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f19024f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f19025g;

        /* renamed from: h  reason: collision with root package name */
        public final float f19026h;

        /* renamed from: i  reason: collision with root package name */
        public final float f19027i;

        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3);
            this.c = f10;
            this.f19022d = f11;
            this.f19023e = f12;
            this.f19024f = z10;
            this.f19025g = z11;
            this.f19026h = f13;
            this.f19027i = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(aVar.c)) && v7.g.a(Float.valueOf(this.f19022d), Float.valueOf(aVar.f19022d)) && v7.g.a(Float.valueOf(this.f19023e), Float.valueOf(aVar.f19023e)) && this.f19024f == aVar.f19024f && this.f19025g == aVar.f19025g && v7.g.a(Float.valueOf(this.f19026h), Float.valueOf(aVar.f19026h)) && v7.g.a(Float.valueOf(this.f19027i), Float.valueOf(aVar.f19027i));
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int e10 = androidx.activity.e.e(this.f19023e, androidx.activity.e.e(this.f19022d, Float.floatToIntBits(this.c) * 31, 31), 31);
            int i10 = 1;
            boolean z10 = this.f19024f;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            int i12 = (e10 + i11) * 31;
            boolean z11 = this.f19025g;
            if (!z11) {
                i10 = z11 ? 1 : 0;
            }
            return Float.floatToIntBits(this.f19027i) + androidx.activity.e.e(this.f19026h, (i12 + i10) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f19022d);
            sb.append(", theta=");
            sb.append(this.f19023e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f19024f);
            sb.append(", isPositiveArc=");
            sb.append(this.f19025g);
            sb.append(", arcStartX=");
            sb.append(this.f19026h);
            sb.append(", arcStartY=");
            return a4.b.n(sb, this.f19027i, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {
        public static final b c = new b();

        public b() {
            super(false, false, 3);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19028d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19029e;

        /* renamed from: f  reason: collision with root package name */
        public final float f19030f;

        /* renamed from: g  reason: collision with root package name */
        public final float f19031g;

        /* renamed from: h  reason: collision with root package name */
        public final float f19032h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2);
            this.c = f10;
            this.f19028d = f11;
            this.f19029e = f12;
            this.f19030f = f13;
            this.f19031g = f14;
            this.f19032h = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(cVar.c)) && v7.g.a(Float.valueOf(this.f19028d), Float.valueOf(cVar.f19028d)) && v7.g.a(Float.valueOf(this.f19029e), Float.valueOf(cVar.f19029e)) && v7.g.a(Float.valueOf(this.f19030f), Float.valueOf(cVar.f19030f)) && v7.g.a(Float.valueOf(this.f19031g), Float.valueOf(cVar.f19031g)) && v7.g.a(Float.valueOf(this.f19032h), Float.valueOf(cVar.f19032h));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19032h) + androidx.activity.e.e(this.f19031g, androidx.activity.e.e(this.f19030f, androidx.activity.e.e(this.f19029e, androidx.activity.e.e(this.f19028d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.f19028d);
            sb.append(", x2=");
            sb.append(this.f19029e);
            sb.append(", y2=");
            sb.append(this.f19030f);
            sb.append(", x3=");
            sb.append(this.f19031g);
            sb.append(", y3=");
            return a4.b.n(sb, this.f19032h, ')');
        }
    }

    /* renamed from: z0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0248d extends d {
        public final float c;

        public C0248d(float f10) {
            super(false, false, 3);
            this.c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0248d) && v7.g.a(Float.valueOf(this.c), Float.valueOf(((C0248d) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return a4.b.n(new StringBuilder("HorizontalTo(x="), this.c, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19033d;

        public e(float f10, float f11) {
            super(false, false, 3);
            this.c = f10;
            this.f19033d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(eVar.c)) && v7.g.a(Float.valueOf(this.f19033d), Float.valueOf(eVar.f19033d));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19033d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return a4.b.n(sb, this.f19033d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19034d;

        public f(float f10, float f11) {
            super(false, false, 3);
            this.c = f10;
            this.f19034d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(fVar.c)) && v7.g.a(Float.valueOf(this.f19034d), Float.valueOf(fVar.f19034d));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19034d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return a4.b.n(sb, this.f19034d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19035d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19036e;

        /* renamed from: f  reason: collision with root package name */
        public final float f19037f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, 1);
            this.c = f10;
            this.f19035d = f11;
            this.f19036e = f12;
            this.f19037f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(gVar.c)) && v7.g.a(Float.valueOf(this.f19035d), Float.valueOf(gVar.f19035d)) && v7.g.a(Float.valueOf(this.f19036e), Float.valueOf(gVar.f19036e)) && v7.g.a(Float.valueOf(this.f19037f), Float.valueOf(gVar.f19037f));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19037f) + androidx.activity.e.e(this.f19036e, androidx.activity.e.e(this.f19035d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.f19035d);
            sb.append(", x2=");
            sb.append(this.f19036e);
            sb.append(", y2=");
            return a4.b.n(sb, this.f19037f, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19038d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19039e;

        /* renamed from: f  reason: collision with root package name */
        public final float f19040f;

        public h(float f10, float f11, float f12, float f13) {
            super(true, false, 2);
            this.c = f10;
            this.f19038d = f11;
            this.f19039e = f12;
            this.f19040f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(hVar.c)) && v7.g.a(Float.valueOf(this.f19038d), Float.valueOf(hVar.f19038d)) && v7.g.a(Float.valueOf(this.f19039e), Float.valueOf(hVar.f19039e)) && v7.g.a(Float.valueOf(this.f19040f), Float.valueOf(hVar.f19040f));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19040f) + androidx.activity.e.e(this.f19039e, androidx.activity.e.e(this.f19038d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.f19038d);
            sb.append(", x2=");
            sb.append(this.f19039e);
            sb.append(", y2=");
            return a4.b.n(sb, this.f19040f, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19041d;

        public i(float f10, float f11) {
            super(false, true, 1);
            this.c = f10;
            this.f19041d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(iVar.c)) && v7.g.a(Float.valueOf(this.f19041d), Float.valueOf(iVar.f19041d));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19041d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return a4.b.n(sb, this.f19041d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19042d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19043e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f19044f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f19045g;

        /* renamed from: h  reason: collision with root package name */
        public final float f19046h;

        /* renamed from: i  reason: collision with root package name */
        public final float f19047i;

        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3);
            this.c = f10;
            this.f19042d = f11;
            this.f19043e = f12;
            this.f19044f = z10;
            this.f19045g = z11;
            this.f19046h = f13;
            this.f19047i = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(jVar.c)) && v7.g.a(Float.valueOf(this.f19042d), Float.valueOf(jVar.f19042d)) && v7.g.a(Float.valueOf(this.f19043e), Float.valueOf(jVar.f19043e)) && this.f19044f == jVar.f19044f && this.f19045g == jVar.f19045g && v7.g.a(Float.valueOf(this.f19046h), Float.valueOf(jVar.f19046h)) && v7.g.a(Float.valueOf(this.f19047i), Float.valueOf(jVar.f19047i));
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int e10 = androidx.activity.e.e(this.f19043e, androidx.activity.e.e(this.f19042d, Float.floatToIntBits(this.c) * 31, 31), 31);
            int i10 = 1;
            boolean z10 = this.f19044f;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            int i12 = (e10 + i11) * 31;
            boolean z11 = this.f19045g;
            if (!z11) {
                i10 = z11 ? 1 : 0;
            }
            return Float.floatToIntBits(this.f19047i) + androidx.activity.e.e(this.f19046h, (i12 + i10) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f19042d);
            sb.append(", theta=");
            sb.append(this.f19043e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f19044f);
            sb.append(", isPositiveArc=");
            sb.append(this.f19045g);
            sb.append(", arcStartDx=");
            sb.append(this.f19046h);
            sb.append(", arcStartDy=");
            return a4.b.n(sb, this.f19047i, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19048d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19049e;

        /* renamed from: f  reason: collision with root package name */
        public final float f19050f;

        /* renamed from: g  reason: collision with root package name */
        public final float f19051g;

        /* renamed from: h  reason: collision with root package name */
        public final float f19052h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2);
            this.c = f10;
            this.f19048d = f11;
            this.f19049e = f12;
            this.f19050f = f13;
            this.f19051g = f14;
            this.f19052h = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(kVar.c)) && v7.g.a(Float.valueOf(this.f19048d), Float.valueOf(kVar.f19048d)) && v7.g.a(Float.valueOf(this.f19049e), Float.valueOf(kVar.f19049e)) && v7.g.a(Float.valueOf(this.f19050f), Float.valueOf(kVar.f19050f)) && v7.g.a(Float.valueOf(this.f19051g), Float.valueOf(kVar.f19051g)) && v7.g.a(Float.valueOf(this.f19052h), Float.valueOf(kVar.f19052h));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19052h) + androidx.activity.e.e(this.f19051g, androidx.activity.e.e(this.f19050f, androidx.activity.e.e(this.f19049e, androidx.activity.e.e(this.f19048d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.f19048d);
            sb.append(", dx2=");
            sb.append(this.f19049e);
            sb.append(", dy2=");
            sb.append(this.f19050f);
            sb.append(", dx3=");
            sb.append(this.f19051g);
            sb.append(", dy3=");
            return a4.b.n(sb, this.f19052h, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends d {
        public final float c;

        public l(float f10) {
            super(false, false, 3);
            this.c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && v7.g.a(Float.valueOf(this.c), Float.valueOf(((l) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return a4.b.n(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19053d;

        public m(float f10, float f11) {
            super(false, false, 3);
            this.c = f10;
            this.f19053d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(mVar.c)) && v7.g.a(Float.valueOf(this.f19053d), Float.valueOf(mVar.f19053d));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19053d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return a4.b.n(sb, this.f19053d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19054d;

        public n(float f10, float f11) {
            super(false, false, 3);
            this.c = f10;
            this.f19054d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(nVar.c)) && v7.g.a(Float.valueOf(this.f19054d), Float.valueOf(nVar.f19054d));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19054d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return a4.b.n(sb, this.f19054d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19055d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19056e;

        /* renamed from: f  reason: collision with root package name */
        public final float f19057f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, 1);
            this.c = f10;
            this.f19055d = f11;
            this.f19056e = f12;
            this.f19057f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(oVar.c)) && v7.g.a(Float.valueOf(this.f19055d), Float.valueOf(oVar.f19055d)) && v7.g.a(Float.valueOf(this.f19056e), Float.valueOf(oVar.f19056e)) && v7.g.a(Float.valueOf(this.f19057f), Float.valueOf(oVar.f19057f));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19057f) + androidx.activity.e.e(this.f19056e, androidx.activity.e.e(this.f19055d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.f19055d);
            sb.append(", dx2=");
            sb.append(this.f19056e);
            sb.append(", dy2=");
            return a4.b.n(sb, this.f19057f, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19058d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19059e;

        /* renamed from: f  reason: collision with root package name */
        public final float f19060f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2);
            this.c = f10;
            this.f19058d = f11;
            this.f19059e = f12;
            this.f19060f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(pVar.c)) && v7.g.a(Float.valueOf(this.f19058d), Float.valueOf(pVar.f19058d)) && v7.g.a(Float.valueOf(this.f19059e), Float.valueOf(pVar.f19059e)) && v7.g.a(Float.valueOf(this.f19060f), Float.valueOf(pVar.f19060f));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19060f) + androidx.activity.e.e(this.f19059e, androidx.activity.e.e(this.f19058d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.f19058d);
            sb.append(", dx2=");
            sb.append(this.f19059e);
            sb.append(", dy2=");
            return a4.b.n(sb, this.f19060f, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends d {
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19061d;

        public q(float f10, float f11) {
            super(false, true, 1);
            this.c = f10;
            this.f19061d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return v7.g.a(Float.valueOf(this.c), Float.valueOf(qVar.c)) && v7.g.a(Float.valueOf(this.f19061d), Float.valueOf(qVar.f19061d));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19061d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return a4.b.n(sb, this.f19061d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends d {
        public final float c;

        public r(float f10) {
            super(false, false, 3);
            this.c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && v7.g.a(Float.valueOf(this.c), Float.valueOf(((r) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return a4.b.n(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends d {
        public final float c;

        public s(float f10) {
            super(false, false, 3);
            this.c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && v7.g.a(Float.valueOf(this.c), Float.valueOf(((s) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return a4.b.n(new StringBuilder("VerticalTo(y="), this.c, ')');
        }
    }

    public d(boolean z10, boolean z11, int i10) {
        z10 = (i10 & 1) != 0 ? false : z10;
        z11 = (i10 & 2) != 0 ? false : z11;
        this.f19020a = z10;
        this.f19021b = z11;
    }
}
