package z0;

import java.util.List;

/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: i  reason: collision with root package name */
    public final String f19081i;

    /* renamed from: j  reason: collision with root package name */
    public final List<d> f19082j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19083k;

    /* renamed from: l  reason: collision with root package name */
    public final v0.m f19084l;

    /* renamed from: m  reason: collision with root package name */
    public final float f19085m;
    public final v0.m n;

    /* renamed from: o  reason: collision with root package name */
    public final float f19086o;

    /* renamed from: p  reason: collision with root package name */
    public final float f19087p;

    /* renamed from: q  reason: collision with root package name */
    public final int f19088q;

    /* renamed from: r  reason: collision with root package name */
    public final int f19089r;

    /* renamed from: s  reason: collision with root package name */
    public final float f19090s;

    /* renamed from: t  reason: collision with root package name */
    public final float f19091t;

    /* renamed from: u  reason: collision with root package name */
    public final float f19092u;

    /* renamed from: v  reason: collision with root package name */
    public final float f19093v;

    public m(String str, List list, int i10, v0.m mVar, float f10, v0.m mVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f19081i = str;
        this.f19082j = list;
        this.f19083k = i10;
        this.f19084l = mVar;
        this.f19085m = f10;
        this.n = mVar2;
        this.f19086o = f11;
        this.f19087p = f12;
        this.f19088q = i11;
        this.f19089r = i12;
        this.f19090s = f13;
        this.f19091t = f14;
        this.f19092u = f15;
        this.f19093v = f16;
    }

    public final boolean equals(Object obj) {
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
        if (this == obj) {
            return true;
        }
        if (obj != null && v7.g.a(v7.i.a(m.class), v7.i.a(obj.getClass()))) {
            m mVar = (m) obj;
            if (!v7.g.a(this.f19081i, mVar.f19081i) || !v7.g.a(this.f19084l, mVar.f19084l)) {
                return false;
            }
            if (this.f19085m == mVar.f19085m) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || !v7.g.a(this.n, mVar.n)) {
                return false;
            }
            if (this.f19086o == mVar.f19086o) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            if (this.f19087p == mVar.f19087p) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (this.f19088q == mVar.f19088q) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                return false;
            }
            if (this.f19089r == mVar.f19089r) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                return false;
            }
            if (this.f19090s == mVar.f19090s) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                return false;
            }
            if (this.f19091t == mVar.f19091t) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z16) {
                return false;
            }
            if (this.f19092u == mVar.f19092u) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                return false;
            }
            if (this.f19093v == mVar.f19093v) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                return false;
            }
            if (this.f19083k == mVar.f19083k) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19 && v7.g.a(this.f19082j, mVar.f19082j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f19082j.hashCode() + (this.f19081i.hashCode() * 31)) * 31;
        int i11 = 0;
        v0.m mVar = this.f19084l;
        if (mVar != null) {
            i10 = mVar.hashCode();
        } else {
            i10 = 0;
        }
        int e10 = androidx.activity.e.e(this.f19085m, (hashCode + i10) * 31, 31);
        v0.m mVar2 = this.n;
        if (mVar2 != null) {
            i11 = mVar2.hashCode();
        }
        int e11 = androidx.activity.e.e(this.f19086o, (e10 + i11) * 31, 31);
        return androidx.activity.e.e(this.f19093v, androidx.activity.e.e(this.f19092u, androidx.activity.e.e(this.f19091t, androidx.activity.e.e(this.f19090s, (((androidx.activity.e.e(this.f19087p, e11, 31) + this.f19088q) * 31) + this.f19089r) * 31, 31), 31), 31), 31) + this.f19083k;
    }
}
