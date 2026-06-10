package androidx.compose.ui.graphics.vector;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.CompositionLocalsKt;
import g0.c;
import g0.d;
import g0.r0;
import g0.t0;
import g0.z0;
import java.util.List;
import java.util.Map;
import u0.f;
import u7.q;
import v0.l;
import v0.r;
import v0.s;
import v7.g;
import z0.h;
import z0.i;
import z0.k;
import z0.m;
import z0.n;

/* loaded from: classes.dex */
public final class VectorPainterKt {

    /* loaded from: classes.dex */
    public static final class a implements h {
        @Override // z0.h
        public final Object a(n nVar, Object obj) {
            g.f(nVar, "property");
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {
        @Override // z0.h
        public final Object a(n nVar, Object obj) {
            g.f(nVar, "property");
            return obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        r15 = kotlin.collections.d.K1();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(i iVar, Map<String, ? extends h> map, d dVar, int i10, int i11) {
        int i12;
        int i13;
        Map<String, ? extends h> map2;
        Map<String, ? extends h> map3;
        r0 T;
        g.f(iVar, "group");
        ComposerImpl p10 = dVar.p(-446179233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (p10.z(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 16;
        }
        if (i14 == 2 && (i12 & 91) == 18 && p10.s()) {
            p10.e();
            map2 = map;
            T = p10.T();
            if (T != null) {
                T.f11073d = new VectorPainterKt$RenderVectorGroup$2(iVar, map2, i10, i11);
                return;
            }
            return;
        }
        p10.t0();
        if ((i10 & 1) != 0 && !p10.X()) {
            p10.e();
            Map<String, ? extends h> K1 = map;
            p10.R();
            q<c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
            for (k kVar : iVar.f19077r) {
                if (kVar instanceof m) {
                    p10.f(-326285817);
                    m mVar = (m) kVar;
                    h hVar = K1.get(mVar.f19081i);
                    if (hVar == null) {
                        hVar = new a();
                    }
                    h hVar2 = hVar;
                    VectorComposeKt.b((List) hVar2.a(n.c.f19096a, mVar.f19082j), mVar.f19083k, mVar.f19081i, (v0.m) hVar2.a(n.a.f19094a, mVar.f19084l), ((Number) hVar2.a(n.b.f19095a, Float.valueOf(mVar.f19085m))).floatValue(), (v0.m) hVar2.a(n.i.f19102a, mVar.n), ((Number) hVar2.a(n.j.f19103a, Float.valueOf(mVar.f19086o))).floatValue(), ((Number) hVar2.a(n.k.f19104a, Float.valueOf(mVar.f19087p))).floatValue(), mVar.f19088q, mVar.f19089r, mVar.f19090s, ((Number) hVar2.a(n.p.f19109a, Float.valueOf(mVar.f19091t))).floatValue(), ((Number) hVar2.a(n.C0249n.f19107a, Float.valueOf(mVar.f19092u))).floatValue(), ((Number) hVar2.a(n.o.f19108a, Float.valueOf(mVar.f19093v))).floatValue(), p10, 8, 0, 0);
                    p10.Q(false);
                    K1 = K1;
                } else {
                    Map<String, ? extends h> map4 = K1;
                    if (kVar instanceof i) {
                        p10.f(-326283959);
                        i iVar2 = (i) kVar;
                        map3 = map4;
                        h hVar3 = map3.get(iVar2.f19069i);
                        if (hVar3 == null) {
                            hVar3 = new b();
                        }
                        VectorComposeKt.a(iVar2.f19069i, ((Number) hVar3.a(n.f.f19099a, Float.valueOf(iVar2.f19070j))).floatValue(), ((Number) hVar3.a(n.d.f19097a, Float.valueOf(iVar2.f19071k))).floatValue(), ((Number) hVar3.a(n.e.f19098a, Float.valueOf(iVar2.f19072l))).floatValue(), ((Number) hVar3.a(n.g.f19100a, Float.valueOf(iVar2.f19073m))).floatValue(), ((Number) hVar3.a(n.h.f19101a, Float.valueOf(iVar2.n))).floatValue(), ((Number) hVar3.a(n.l.f19105a, Float.valueOf(iVar2.f19074o))).floatValue(), ((Number) hVar3.a(n.m.f19106a, Float.valueOf(iVar2.f19075p))).floatValue(), (List) hVar3.a(n.c.f19096a, iVar2.f19076q), a1.c.i0(p10, 1450046638, new VectorPainterKt$RenderVectorGroup$1(kVar, map3)), p10, 939524096, 0);
                    } else {
                        map3 = map4;
                        p10.f(-326282489);
                    }
                    p10.Q(false);
                    K1 = map3;
                }
            }
            map2 = K1;
            q<c<?>, z0, t0, m7.n> qVar2 = ComposerKt.f2737a;
            T = p10.T();
            if (T != null) {
            }
        }
        Map<String, ? extends h> K12 = map;
        p10.R();
        q<c<?>, z0, t0, m7.n> qVar3 = ComposerKt.f2737a;
        while (r22.hasNext()) {
        }
        map2 = K12;
        q<c<?>, z0, t0, m7.n> qVar22 = ComposerKt.f2737a;
        T = p10.T();
        if (T != null) {
        }
    }

    public static final VectorPainter b(z0.c cVar, d dVar) {
        ColorFilter porterDuffColorFilter;
        g.f(cVar, "image");
        dVar.f(1413834416);
        q<c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        String str = cVar.f18993a;
        ComposableLambdaImpl i02 = a1.c.i0(dVar, 1873274766, new VectorPainterKt$rememberVectorPainter$3(cVar));
        dVar.f(1068590786);
        b2.b bVar = (b2.b) dVar.w(CompositionLocalsKt.f3703e);
        float H = bVar.H(cVar.f18994b);
        float H2 = bVar.H(cVar.c);
        float f10 = cVar.f18995d;
        if (Float.isNaN(f10)) {
            f10 = H;
        }
        float f11 = cVar.f18996e;
        if (Float.isNaN(f11)) {
            f11 = H2;
        }
        long j2 = cVar.f18998g;
        r rVar = new r(j2);
        int i10 = cVar.f18999h;
        v0.k kVar = new v0.k(i10);
        dVar.f(511388516);
        boolean z10 = dVar.z(rVar) | dVar.z(kVar);
        Object g10 = dVar.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (z10 || g10 == c0120a) {
            if (!r.c(j2, r.f18133g)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    porterDuffColorFilter = l.f18122a.a(j2, i10);
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(a1.c.I1(j2), a1.c.N1(i10));
                }
                g10 = new s(porterDuffColorFilter);
            } else {
                g10 = null;
            }
            dVar.q(g10);
        }
        dVar.u();
        s sVar = (s) g10;
        dVar.f(-492369756);
        Object g11 = dVar.g();
        if (g11 == c0120a) {
            g11 = new VectorPainter();
            dVar.q(g11);
        }
        dVar.u();
        VectorPainter vectorPainter = (VectorPainter) g11;
        vectorPainter.f3226f.setValue(new f(a1.c.v(H, H2)));
        vectorPainter.f3227g.setValue(Boolean.valueOf(cVar.f19000i));
        vectorPainter.f3228h.f3165f.setValue(sVar);
        vectorPainter.e(str, f10, f11, i02, dVar, 35840);
        dVar.u();
        dVar.u();
        return vectorPainter;
    }
}
