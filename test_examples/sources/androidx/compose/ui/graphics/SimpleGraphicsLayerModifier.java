package androidx.compose.ui.graphics;

import a4.b;
import androidx.activity.e;
import androidx.compose.ui.platform.o0;
import j1.b0;
import j1.k;
import j1.t;
import m7.j;
import m7.n;
import q0.d;
import u7.l;
import u7.p;
import v0.h0;
import v0.l0;
import v0.r;
import v0.u;
import v7.g;

/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final float f3078j;

    /* renamed from: k  reason: collision with root package name */
    public final float f3079k;

    /* renamed from: l  reason: collision with root package name */
    public final float f3080l;

    /* renamed from: m  reason: collision with root package name */
    public final float f3081m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final float f3082o;

    /* renamed from: p  reason: collision with root package name */
    public final float f3083p;

    /* renamed from: q  reason: collision with root package name */
    public final float f3084q;

    /* renamed from: r  reason: collision with root package name */
    public final float f3085r;

    /* renamed from: s  reason: collision with root package name */
    public final float f3086s;

    /* renamed from: t  reason: collision with root package name */
    public final long f3087t;

    /* renamed from: u  reason: collision with root package name */
    public final h0 f3088u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f3089v;

    /* renamed from: w  reason: collision with root package name */
    public final long f3090w;

    /* renamed from: x  reason: collision with root package name */
    public final long f3091x;

    /* renamed from: y  reason: collision with root package name */
    public final l<u, n> f3092y;

    public SimpleGraphicsLayerModifier() {
        throw null;
    }

    public SimpleGraphicsLayerModifier(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j2, h0 h0Var, boolean z10, long j10, long j11, l lVar) {
        super(lVar);
        this.f3078j = f10;
        this.f3079k = f11;
        this.f3080l = f12;
        this.f3081m = f13;
        this.n = f14;
        this.f3082o = f15;
        this.f3083p = f16;
        this.f3084q = f17;
        this.f3085r = f18;
        this.f3086s = f19;
        this.f3087t = j2;
        this.f3088u = h0Var;
        this.f3089v = z10;
        this.f3090w = j10;
        this.f3091x = j11;
        this.f3092y = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        if (obj instanceof SimpleGraphicsLayerModifier) {
            simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) obj;
        } else {
            simpleGraphicsLayerModifier = null;
        }
        if (simpleGraphicsLayerModifier == null) {
            return false;
        }
        if (this.f3078j == simpleGraphicsLayerModifier.f3078j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f3079k == simpleGraphicsLayerModifier.f3079k) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (this.f3080l == simpleGraphicsLayerModifier.f3080l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (this.f3081m == simpleGraphicsLayerModifier.f3081m) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        if (this.n == simpleGraphicsLayerModifier.n) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            return false;
        }
        if (this.f3082o == simpleGraphicsLayerModifier.f3082o) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            return false;
        }
        if (this.f3083p == simpleGraphicsLayerModifier.f3083p) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!z16) {
            return false;
        }
        if (this.f3084q == simpleGraphicsLayerModifier.f3084q) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            return false;
        }
        if (this.f3085r == simpleGraphicsLayerModifier.f3085r) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (!z18) {
            return false;
        }
        if (this.f3086s == simpleGraphicsLayerModifier.f3086s) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (!z19) {
            return false;
        }
        int i10 = l0.f18124b;
        if (this.f3087t == simpleGraphicsLayerModifier.f3087t) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (!z20 || !g.a(this.f3088u, simpleGraphicsLayerModifier.f3088u) || this.f3089v != simpleGraphicsLayerModifier.f3089v || !g.a(null, null) || !r.c(this.f3090w, simpleGraphicsLayerModifier.f3090w) || !r.c(this.f3091x, simpleGraphicsLayerModifier.f3091x)) {
            return false;
        }
        return true;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        int i10;
        int e10 = e.e(this.f3086s, e.e(this.f3085r, e.e(this.f3084q, e.e(this.f3083p, e.e(this.f3082o, e.e(this.n, e.e(this.f3081m, e.e(this.f3080l, e.e(this.f3079k, Float.floatToIntBits(this.f3078j) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i11 = l0.f18124b;
        long j2 = this.f3087t;
        int hashCode = (this.f3088u.hashCode() + ((((int) (j2 ^ (j2 >>> 32))) + e10) * 31)) * 31;
        if (this.f3089v) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = r.f18134h;
        return j.a(this.f3091x) + e.f(this.f3090w, (((hashCode + i10) * 31) + 0) * 31, 31);
    }

    @Override // j1.k
    public final j1.r n(t tVar, j1.p pVar, long j2) {
        j1.r m02;
        g.f(tVar, "$this$measure");
        b0 b5 = pVar.b(j2);
        m02 = tVar.m0(b5.f12640i, b5.f12641j, kotlin.collections.d.K1(), new SimpleGraphicsLayerModifier$measure$1(b5, this));
        return m02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f3078j);
        sb.append(", scaleY=");
        sb.append(this.f3079k);
        sb.append(", alpha = ");
        sb.append(this.f3080l);
        sb.append(", translationX=");
        sb.append(this.f3081m);
        sb.append(", translationY=");
        sb.append(this.n);
        sb.append(", shadowElevation=");
        sb.append(this.f3082o);
        sb.append(", rotationX=");
        sb.append(this.f3083p);
        sb.append(", rotationY=");
        sb.append(this.f3084q);
        sb.append(", rotationZ=");
        sb.append(this.f3085r);
        sb.append(", cameraDistance=");
        sb.append(this.f3086s);
        sb.append(", transformOrigin=");
        int i10 = l0.f18124b;
        sb.append((Object) ("TransformOrigin(packedValue=" + this.f3087t + ')'));
        sb.append(", shape=");
        sb.append(this.f3088u);
        sb.append(", clip=");
        sb.append(this.f3089v);
        sb.append(", renderEffect=null, ambientShadowColor=");
        sb.append((Object) r.i(this.f3090w));
        sb.append(", spotShadowColor=");
        sb.append((Object) r.i(this.f3091x));
        sb.append(')');
        return sb.toString();
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return b.a(this, lVar);
    }
}
