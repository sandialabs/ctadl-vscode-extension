package p1;

import androidx.compose.ui.text.style.a;
import v0.g0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.text.style.a f16671a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16672b;
    public final u1.m c;

    /* renamed from: d  reason: collision with root package name */
    public final u1.i f16673d;

    /* renamed from: e  reason: collision with root package name */
    public final u1.j f16674e;

    /* renamed from: f  reason: collision with root package name */
    public final u1.e f16675f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16676g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16677h;

    /* renamed from: i  reason: collision with root package name */
    public final a2.a f16678i;

    /* renamed from: j  reason: collision with root package name */
    public final a2.i f16679j;

    /* renamed from: k  reason: collision with root package name */
    public final w1.c f16680k;

    /* renamed from: l  reason: collision with root package name */
    public final long f16681l;

    /* renamed from: m  reason: collision with root package name */
    public final a2.g f16682m;
    public final g0 n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(long j2, long j10, u1.m mVar, u1.i iVar, u1.j jVar, u1.e eVar, String str, long j11, a2.a aVar, a2.i iVar2, w1.c cVar, long j12, a2.g gVar, g0 g0Var, int i10) {
        this(r0, r3, r5, r7, r8, r9, r10, r11, r13, r14, r15, r16, r6, r39);
        g0 g0Var2;
        androidx.compose.ui.text.style.a aVar2;
        long j13 = (i10 & 1) != 0 ? v0.r.f18133g : j2;
        long j14 = (i10 & 2) != 0 ? b2.i.c : j10;
        u1.m mVar2 = (i10 & 4) != 0 ? null : mVar;
        u1.i iVar3 = (i10 & 8) != 0 ? null : iVar;
        u1.j jVar2 = (i10 & 16) != 0 ? null : jVar;
        u1.e eVar2 = (i10 & 32) != 0 ? null : eVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long j15 = (i10 & 128) != 0 ? b2.i.c : j11;
        a2.a aVar3 = (i10 & 256) != 0 ? null : aVar;
        a2.i iVar4 = (i10 & 512) != 0 ? null : iVar2;
        w1.c cVar2 = (i10 & 1024) != 0 ? null : cVar;
        long j16 = (i10 & 2048) != 0 ? v0.r.f18133g : j12;
        a2.g gVar2 = (i10 & 4096) != 0 ? null : gVar;
        g0 g0Var3 = (i10 & 8192) != 0 ? null : g0Var;
        if (j13 != v0.r.f18133g) {
            g0Var2 = g0Var3;
            aVar2 = new a2.c(j13);
        } else {
            g0Var2 = g0Var3;
            aVar2 = a.C0028a.f4166a;
        }
    }

    public final long a() {
        return this.f16671a.a();
    }

    public final boolean b(k kVar) {
        v7.g.f(kVar, "other");
        if (this == kVar) {
            return true;
        }
        return b2.i.a(this.f16672b, kVar.f16672b) && v7.g.a(this.c, kVar.c) && v7.g.a(this.f16673d, kVar.f16673d) && v7.g.a(this.f16674e, kVar.f16674e) && v7.g.a(this.f16675f, kVar.f16675f) && v7.g.a(this.f16676g, kVar.f16676g) && b2.i.a(this.f16677h, kVar.f16677h) && v7.g.a(this.f16678i, kVar.f16678i) && v7.g.a(this.f16679j, kVar.f16679j) && v7.g.a(this.f16680k, kVar.f16680k) && v0.r.c(this.f16681l, kVar.f16681l) && v7.g.a(null, null);
    }

    public final k c(k kVar) {
        boolean z10;
        long j2;
        if (kVar == null) {
            return this;
        }
        androidx.compose.ui.text.style.a c = this.f16671a.c(kVar.f16671a);
        u1.e eVar = kVar.f16675f;
        if (eVar == null) {
            eVar = this.f16675f;
        }
        u1.e eVar2 = eVar;
        long j10 = kVar.f16672b;
        if (a1.b.n0(j10)) {
            j10 = this.f16672b;
        }
        long j11 = j10;
        u1.m mVar = kVar.c;
        if (mVar == null) {
            mVar = this.c;
        }
        u1.m mVar2 = mVar;
        u1.i iVar = kVar.f16673d;
        if (iVar == null) {
            iVar = this.f16673d;
        }
        u1.i iVar2 = iVar;
        u1.j jVar = kVar.f16674e;
        if (jVar == null) {
            jVar = this.f16674e;
        }
        u1.j jVar2 = jVar;
        String str = kVar.f16676g;
        if (str == null) {
            str = this.f16676g;
        }
        String str2 = str;
        long j12 = kVar.f16677h;
        if (a1.b.n0(j12)) {
            j12 = this.f16677h;
        }
        long j13 = j12;
        a2.a aVar = kVar.f16678i;
        if (aVar == null) {
            aVar = this.f16678i;
        }
        a2.a aVar2 = aVar;
        a2.i iVar3 = kVar.f16679j;
        if (iVar3 == null) {
            iVar3 = this.f16679j;
        }
        a2.i iVar4 = iVar3;
        w1.c cVar = kVar.f16680k;
        if (cVar == null) {
            cVar = this.f16680k;
        }
        w1.c cVar2 = cVar;
        long j14 = v0.r.f18133g;
        long j15 = kVar.f16681l;
        if (j15 != j14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j2 = j15;
        } else {
            j2 = this.f16681l;
        }
        a2.g gVar = kVar.f16682m;
        if (gVar == null) {
            gVar = this.f16682m;
        }
        a2.g gVar2 = gVar;
        g0 g0Var = kVar.n;
        if (g0Var == null) {
            g0Var = this.n;
        }
        return new k(c, j11, mVar2, iVar2, jVar2, eVar2, str2, j13, aVar2, iVar4, cVar2, j2, gVar2, g0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (b(kVar)) {
            if (v7.g.a(this.f16671a, kVar.f16671a) && v7.g.a(this.f16682m, kVar.f16682m) && v7.g.a(this.n, kVar.n)) {
                z10 = true;
                if (z10) {
                    return true;
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long a10 = a();
        int i21 = v0.r.f18134h;
        int a11 = m7.j.a(a10) * 31;
        androidx.compose.ui.text.style.a aVar = this.f16671a;
        v0.m d5 = aVar.d();
        if (d5 != null) {
            i10 = d5.hashCode();
        } else {
            i10 = 0;
        }
        int floatToIntBits = Float.floatToIntBits(aVar.n());
        int d10 = (b2.i.d(this.f16672b) + ((floatToIntBits + ((a11 + i10) * 31)) * 31)) * 31;
        u1.m mVar = this.c;
        if (mVar != null) {
            i11 = mVar.f17759i;
        } else {
            i11 = 0;
        }
        int i22 = (d10 + i11) * 31;
        u1.i iVar = this.f16673d;
        if (iVar != null) {
            i12 = iVar.f17748a;
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        u1.j jVar = this.f16674e;
        if (jVar != null) {
            i13 = jVar.f17749a;
        } else {
            i13 = 0;
        }
        int i24 = (i23 + i13) * 31;
        u1.e eVar = this.f16675f;
        if (eVar != null) {
            i14 = eVar.hashCode();
        } else {
            i14 = 0;
        }
        int i25 = (i24 + i14) * 31;
        String str = this.f16676g;
        if (str != null) {
            i15 = str.hashCode();
        } else {
            i15 = 0;
        }
        int d11 = (b2.i.d(this.f16677h) + ((i25 + i15) * 31)) * 31;
        a2.a aVar2 = this.f16678i;
        if (aVar2 != null) {
            i16 = Float.floatToIntBits(aVar2.f89a);
        } else {
            i16 = 0;
        }
        int i26 = (d11 + i16) * 31;
        a2.i iVar2 = this.f16679j;
        if (iVar2 != null) {
            i17 = iVar2.hashCode();
        } else {
            i17 = 0;
        }
        int i27 = (i26 + i17) * 31;
        w1.c cVar = this.f16680k;
        if (cVar != null) {
            i18 = cVar.hashCode();
        } else {
            i18 = 0;
        }
        int f10 = androidx.activity.e.f(this.f16681l, (i27 + i18) * 31, 31);
        a2.g gVar = this.f16682m;
        if (gVar != null) {
            i19 = gVar.f102a;
        } else {
            i19 = 0;
        }
        int i28 = (f10 + i19) * 31;
        g0 g0Var = this.n;
        if (g0Var != null) {
            i20 = g0Var.hashCode();
        } else {
            i20 = 0;
        }
        return ((i28 + i20) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) v0.r.i(a()));
        sb.append(", brush=");
        androidx.compose.ui.text.style.a aVar = this.f16671a;
        sb.append(aVar.d());
        sb.append(", alpha=");
        sb.append(aVar.n());
        sb.append(", fontSize=");
        sb.append((Object) b2.i.e(this.f16672b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.f16673d);
        sb.append(", fontSynthesis=");
        sb.append(this.f16674e);
        sb.append(", fontFamily=");
        sb.append(this.f16675f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f16676g);
        sb.append(", letterSpacing=");
        sb.append((Object) b2.i.e(this.f16677h));
        sb.append(", baselineShift=");
        sb.append(this.f16678i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f16679j);
        sb.append(", localeList=");
        sb.append(this.f16680k);
        sb.append(", background=");
        sb.append((Object) v0.r.i(this.f16681l));
        sb.append(", textDecoration=");
        sb.append(this.f16682m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null)");
        return sb.toString();
    }

    public k(androidx.compose.ui.text.style.a aVar, long j2, u1.m mVar, u1.i iVar, u1.j jVar, u1.e eVar, String str, long j10, a2.a aVar2, a2.i iVar2, w1.c cVar, long j11, a2.g gVar, g0 g0Var) {
        this.f16671a = aVar;
        this.f16672b = j2;
        this.c = mVar;
        this.f16673d = iVar;
        this.f16674e = jVar;
        this.f16675f = eVar;
        this.f16676g = str;
        this.f16677h = j10;
        this.f16678i = aVar2;
        this.f16679j = iVar2;
        this.f16680k = cVar;
        this.f16681l = j11;
        this.f16682m = gVar;
        this.n = g0Var;
    }
}
