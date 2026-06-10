package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.o0;
import j1.b0;
import j1.d;
import j1.k;
import j1.r;
import j1.t;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class a extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final j1.a f1995j;

    /* renamed from: k  reason: collision with root package name */
    public final float f1996k;

    /* renamed from: l  reason: collision with root package name */
    public final float f1997l;

    public a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(d dVar, float f10, float f11, l lVar) {
        super(lVar);
        boolean z10;
        this.f1995j = dVar;
        this.f1996k = f10;
        this.f1997l = f11;
        if ((f10 < 0.0f && !b2.d.a(f10, Float.NaN)) || (f11 < 0.0f && !b2.d.a(f11, Float.NaN))) {
            z10 = false;
            if (z10) {
                throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
            }
            return;
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a aVar = obj instanceof a ? (a) obj : null;
        return aVar != null && g.a(this.f1995j, aVar.f1995j) && b2.d.a(this.f1996k, aVar.f1996k) && b2.d.a(this.f1997l, aVar.f1997l);
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1997l) + e.e(this.f1996k, this.f1995j.hashCode() * 31, 31);
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        long a10;
        int i10;
        int f10;
        int i11;
        int i12;
        int max;
        int i13;
        r m02;
        g.f(tVar, "$this$measure");
        j1.a aVar = this.f1995j;
        float f11 = this.f1996k;
        boolean z10 = aVar instanceof d;
        if (z10) {
            a10 = b2.a.a(j2, 0, 0, 0, 0, 11);
        } else {
            a10 = b2.a.a(j2, 0, 0, 0, 0, 14);
        }
        b0 b5 = pVar.b(a10);
        int f02 = b5.f0(aVar);
        if (f02 == Integer.MIN_VALUE) {
            f02 = 0;
        }
        if (z10) {
            i10 = b5.f12641j;
        } else {
            i10 = b5.f12640i;
        }
        if (z10) {
            f10 = b2.a.e(j2);
        } else {
            f10 = b2.a.f(j2);
        }
        if (!b2.d.a(f11, Float.NaN)) {
            i11 = tVar.a0(f11);
        } else {
            i11 = 0;
        }
        int i14 = f10 - i10;
        int c0 = a1.c.c0(i11 - f02, 0, i14);
        float f12 = this.f1997l;
        if (!b2.d.a(f12, Float.NaN)) {
            i12 = tVar.a0(f12);
        } else {
            i12 = 0;
        }
        int c02 = a1.c.c0((i12 - i10) + f02, 0, i14 - c0);
        if (z10) {
            max = b5.f12640i;
        } else {
            max = Math.max(b5.f12640i + c0 + c02, b2.a.h(j2));
        }
        int i15 = max;
        if (z10) {
            i13 = Math.max(b5.f12641j + c0 + c02, b2.a.g(j2));
        } else {
            i13 = b5.f12641j;
        }
        m02 = tVar.m0(i15, i13, kotlin.collections.d.K1(), new AlignmentLineKt$alignmentLineOffsetMeasure$1(aVar, f11, c0, i15, c02, b5, i13));
        return m02;
    }

    public final String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.f1995j + ", before=" + ((Object) b2.d.b(this.f1996k)) + ", after=" + ((Object) b2.d.b(this.f1997l)) + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
