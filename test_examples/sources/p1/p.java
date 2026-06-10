package p1;

import androidx.compose.ui.text.style.a;
import v0.g0;

/* loaded from: classes.dex */
public final class p {
    public static final p c = new p(0, 0, null, null, null, 0, null, null, 0, 262143);

    /* renamed from: a  reason: collision with root package name */
    public final k f16703a;

    /* renamed from: b  reason: collision with root package name */
    public final h f16704b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [a2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(long j2, long j10, u1.m mVar, u1.i iVar, u1.e eVar, long j11, a2.g gVar, a2.f fVar, long j12, int i10) {
        this(new k((r1 > v0.r.f18133g ? 1 : (r1 == v0.r.f18133g ? 0 : -1)) != 0 ? new a2.c(r1) : a.C0028a.f4166a, (i10 & 2) != 0 ? b2.i.c : j10, (i10 & 4) != 0 ? null : mVar, (i10 & 8) != 0 ? null : iVar, null, (i10 & 32) != 0 ? null : eVar, null, (i10 & 128) != 0 ? b2.i.c : j11, null, null, null, (i10 & 2048) != 0 ? v0.r.f18133g : 0L, (i10 & 4096) != 0 ? null : gVar, null), new h((i10 & 16384) != 0 ? null : fVar, null, (i10 & 65536) != 0 ? b2.i.c : j12, null, null, null, null), null);
        long j13 = (i10 & 1) != 0 ? v0.r.f18133g : j2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(k kVar, h hVar) {
        this(kVar, hVar, null);
        v7.g.f(kVar, "spanStyle");
    }

    public p(k kVar, h hVar, ma.i iVar) {
        v7.g.f(kVar, "spanStyle");
        this.f16703a = kVar;
        this.f16704b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41, types: [u1.e] */
    public static p a(p pVar, long j2, u1.m mVar, u1.g gVar, int i10) {
        long j10;
        long j11;
        u1.m mVar2;
        u1.i iVar;
        u1.j jVar;
        u1.g gVar2;
        String str;
        long j12;
        a2.a aVar;
        a2.i iVar2;
        w1.c cVar;
        long j13;
        a2.g gVar3;
        g0 g0Var;
        a2.f fVar;
        a2.h hVar;
        boolean z10;
        androidx.compose.ui.text.style.a aVar2;
        long j14 = 0;
        if ((i10 & 1) != 0) {
            j10 = pVar.f16703a.a();
        } else {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = pVar.f16703a.f16672b;
        } else {
            j11 = j2;
        }
        if ((i10 & 4) != 0) {
            mVar2 = pVar.f16703a.c;
        } else {
            mVar2 = mVar;
        }
        a2.j jVar2 = null;
        if ((i10 & 8) != 0) {
            iVar = pVar.f16703a.f16673d;
        } else {
            iVar = null;
        }
        if ((i10 & 16) != 0) {
            jVar = pVar.f16703a.f16674e;
        } else {
            jVar = null;
        }
        if ((i10 & 32) != 0) {
            gVar2 = pVar.f16703a.f16675f;
        } else {
            gVar2 = gVar;
        }
        if ((i10 & 64) != 0) {
            str = pVar.f16703a.f16676g;
        } else {
            str = null;
        }
        if ((i10 & 128) != 0) {
            j12 = pVar.f16703a.f16677h;
        } else {
            j12 = 0;
        }
        if ((i10 & 256) != 0) {
            aVar = pVar.f16703a.f16678i;
        } else {
            aVar = null;
        }
        if ((i10 & 512) != 0) {
            iVar2 = pVar.f16703a.f16679j;
        } else {
            iVar2 = null;
        }
        if ((i10 & 1024) != 0) {
            cVar = pVar.f16703a.f16680k;
        } else {
            cVar = null;
        }
        if ((i10 & 2048) != 0) {
            j13 = pVar.f16703a.f16681l;
        } else {
            j13 = 0;
        }
        if ((i10 & 4096) != 0) {
            gVar3 = pVar.f16703a.f16682m;
        } else {
            gVar3 = null;
        }
        if ((i10 & 8192) != 0) {
            g0Var = pVar.f16703a.n;
        } else {
            g0Var = null;
        }
        if ((i10 & 16384) != 0) {
            fVar = pVar.f16704b.f16664a;
        } else {
            fVar = null;
        }
        if ((32768 & i10) != 0) {
            hVar = pVar.f16704b.f16665b;
        } else {
            hVar = null;
        }
        if ((65536 & i10) != 0) {
            j14 = pVar.f16704b.c;
        }
        long j15 = j14;
        if ((i10 & 131072) != 0) {
            jVar2 = pVar.f16704b.f16666d;
        }
        a2.j jVar3 = jVar2;
        k kVar = pVar.f16703a;
        if (v0.r.c(j10, kVar.a())) {
            aVar2 = kVar.f16671a;
        } else {
            if (j10 != v0.r.f18133g) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                aVar2 = new a2.c(j10);
            } else {
                aVar2 = a.C0028a.f4166a;
            }
        }
        k kVar2 = new k(aVar2, j11, mVar2, iVar, jVar, gVar2, str, j12, aVar, iVar2, cVar, j13, gVar3, g0Var);
        h hVar2 = pVar.f16704b;
        hVar2.getClass();
        hVar2.getClass();
        h hVar3 = new h(fVar, hVar, j15, jVar3, null, hVar2.f16667e, hVar2.f16668f);
        pVar.getClass();
        return new p(kVar2, hVar3, null);
    }

    public final p b(p pVar) {
        if (pVar != null && !v7.g.a(pVar, c)) {
            return new p(this.f16703a.c(pVar.f16703a), this.f16704b.a(pVar.f16704b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (v7.g.a(this.f16703a, pVar.f16703a) && v7.g.a(this.f16704b, pVar.f16704b)) {
                pVar.getClass();
                return v7.g.a(null, null);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16704b.hashCode() + (this.f16703a.hashCode() * 31)) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        k kVar = this.f16703a;
        sb.append((Object) v0.r.i(kVar.a()));
        sb.append(", brush=");
        sb.append(kVar.f16671a.d());
        sb.append(", alpha=");
        sb.append(kVar.f16671a.n());
        sb.append(", fontSize=");
        sb.append((Object) b2.i.e(kVar.f16672b));
        sb.append(", fontWeight=");
        sb.append(kVar.c);
        sb.append(", fontStyle=");
        sb.append(kVar.f16673d);
        sb.append(", fontSynthesis=");
        sb.append(kVar.f16674e);
        sb.append(", fontFamily=");
        sb.append(kVar.f16675f);
        sb.append(", fontFeatureSettings=");
        sb.append(kVar.f16676g);
        sb.append(", letterSpacing=");
        sb.append((Object) b2.i.e(kVar.f16677h));
        sb.append(", baselineShift=");
        sb.append(kVar.f16678i);
        sb.append(", textGeometricTransform=");
        sb.append(kVar.f16679j);
        sb.append(", localeList=");
        sb.append(kVar.f16680k);
        sb.append(", background=");
        sb.append((Object) v0.r.i(kVar.f16681l));
        sb.append(", textDecoration=");
        sb.append(kVar.f16682m);
        sb.append(", shadow=");
        sb.append(kVar.n);
        sb.append(", textAlign=");
        h hVar = this.f16704b;
        sb.append(hVar.f16664a);
        sb.append(", textDirection=");
        sb.append(hVar.f16665b);
        sb.append(", lineHeight=");
        sb.append((Object) b2.i.e(hVar.c));
        sb.append(", textIndent=");
        sb.append(hVar.f16666d);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(", lineHeightStyle=");
        hVar.getClass();
        sb.append((Object) null);
        sb.append(", lineBreak=");
        sb.append(hVar.f16667e);
        sb.append(", hyphens=");
        sb.append(hVar.f16668f);
        sb.append(')');
        return sb.toString();
    }
}
