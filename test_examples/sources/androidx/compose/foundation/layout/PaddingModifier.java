package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.o0;
import b2.d;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class PaddingModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final float f1929j;

    /* renamed from: k  reason: collision with root package name */
    public final float f1930k;

    /* renamed from: l  reason: collision with root package name */
    public final float f1931l;

    /* renamed from: m  reason: collision with root package name */
    public final float f1932m;
    public final boolean n;

    public PaddingModifier() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaddingModifier(float f10, float f11, float f12, float f13, l lVar) {
        super(lVar);
        this.f1929j = f10;
        this.f1930k = f11;
        this.f1931l = f12;
        this.f1932m = f13;
        boolean z10 = true;
        this.n = true;
        if ((f10 < 0.0f && !d.a(f10, Float.NaN)) || ((f11 < 0.0f && !d.a(f11, Float.NaN)) || ((f12 < 0.0f && !d.a(f12, Float.NaN)) || (f13 < 0.0f && !d.a(f13, Float.NaN))))) {
            z10 = false;
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        PaddingModifier paddingModifier = obj instanceof PaddingModifier ? (PaddingModifier) obj : null;
        return paddingModifier != null && d.a(this.f1929j, paddingModifier.f1929j) && d.a(this.f1930k, paddingModifier.f1930k) && d.a(this.f1931l, paddingModifier.f1931l) && d.a(this.f1932m, paddingModifier.f1932m) && this.n == paddingModifier.n;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        int i10;
        int e10 = e.e(this.f1932m, e.e(this.f1931l, e.e(this.f1930k, Float.floatToIntBits(this.f1929j) * 31, 31), 31), 31);
        if (this.n) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return e10 + i10;
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        r m02;
        g.f(tVar, "$this$measure");
        int a02 = tVar.a0(this.f1931l) + tVar.a0(this.f1929j);
        int a03 = tVar.a0(this.f1932m) + tVar.a0(this.f1930k);
        b0 b5 = pVar.b(v8.b.A(j2, -a02, -a03));
        m02 = tVar.m0(v8.b.q(j2, b5.f12640i + a02), v8.b.p(j2, b5.f12641j + a03), kotlin.collections.d.K1(), new PaddingModifier$measure$1(this, b5, tVar));
        return m02;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
