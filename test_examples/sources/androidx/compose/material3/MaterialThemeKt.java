package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import d0.h;
import e0.j;
import e0.l;
import e0.r;
import g0.d;
import g0.h1;
import g0.p0;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import u7.p;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class MaterialThemeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final d0.c f2326a = new d0.c(0.16f, 0.12f, 0.08f, 0.12f);

    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(e0.c cVar, l lVar, r rVar, p<? super g0.d, ? super Integer, n> pVar, g0.d dVar, int i10, int i11) {
        e0.c cVar2;
        int i12;
        l lVar2;
        r rVar2;
        int i13;
        Object a02;
        d.a.C0120a c0120a;
        boolean z10;
        Object a03;
        l lVar3;
        r rVar3;
        r0 T;
        Object obj;
        int i14;
        Object obj2;
        int i15;
        int i16;
        g.f(pVar, "content");
        ComposerImpl p10 = dVar.p(-2127166334);
        if ((i10 & 14) == 0) {
            if ((i11 & 1) == 0) {
                cVar2 = cVar;
                if (p10.z(cVar2)) {
                    i16 = 4;
                    i12 = i16 | i10;
                }
            } else {
                cVar2 = cVar;
            }
            i16 = 2;
            i12 = i16 | i10;
        } else {
            cVar2 = cVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                obj2 = lVar;
                boolean z11 = p10.z(obj2);
                obj2 = obj2;
                if (z11) {
                    i15 = 32;
                    i12 |= i15;
                    lVar2 = obj2;
                }
            } else {
                obj2 = lVar;
            }
            i15 = 16;
            i12 |= i15;
            lVar2 = obj2;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                obj = rVar;
                boolean z12 = p10.z(obj);
                obj = obj;
                if (z12) {
                    i14 = 256;
                    i12 |= i14;
                    rVar2 = obj;
                }
            } else {
                obj = rVar;
            }
            i14 = 128;
            i12 |= i14;
            rVar2 = obj;
        } else {
            rVar2 = rVar;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (p10.z(pVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && p10.s()) {
            p10.e();
            lVar3 = lVar2;
            rVar3 = rVar2;
            T = p10.T();
            if (T != null) {
                T.f11073d = new MaterialThemeKt$MaterialTheme$2(cVar2, lVar3, rVar3, pVar, i10, i11);
                return;
            }
            return;
        }
        p10.t0();
        if ((i10 & 1) != 0 && !p10.X()) {
            p10.e();
            if ((i11 & 1) != 0) {
                i12 &= -15;
            }
            if ((i11 & 2) != 0) {
                i12 &= -113;
            }
            if ((i11 & 4) != 0) {
                i12 &= -897;
            }
            int i17 = i12;
            l lVar4 = lVar2;
            r rVar4 = rVar2;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            p10.f(-492369756);
            a02 = p10.a0();
            c0120a = d.a.f11039a;
            if (a02 == c0120a) {
                e0.c cVar3 = new e0.c(cVar2.q(), cVar2.i(), cVar2.r(), cVar2.j(), ((v0.r) cVar2.f10516e.getValue()).f18135a, cVar2.s(), cVar2.k(), cVar2.t(), cVar2.l(), cVar2.x(), cVar2.o(), cVar2.y(), cVar2.p(), cVar2.a(), cVar2.f(), cVar2.u(), cVar2.m(), cVar2.w(), cVar2.n(), cVar2.v(), cVar2.e(), cVar2.d(), cVar2.b(), cVar2.g(), cVar2.c(), cVar2.h(), ((v0.r) cVar2.A.getValue()).f18135a, ((v0.r) cVar2.B.getValue()).f18135a, ((v0.r) cVar2.C.getValue()).f18135a);
                p10.I0(cVar3);
                a02 = cVar3;
            }
            p10.Q(false);
            e0.c cVar4 = (e0.c) a02;
            h1 h1Var = ColorSchemeKt.f2278a;
            g.f(cVar4, "<this>");
            g.f(cVar2, "other");
            cVar4.f10513a.setValue(new v0.r(cVar2.q()));
            cVar4.f10514b.setValue(new v0.r(cVar2.i()));
            cVar4.c.setValue(new v0.r(cVar2.r()));
            cVar4.f10515d.setValue(new v0.r(cVar2.j()));
            cVar4.f10516e.setValue(new v0.r(((v0.r) cVar2.f10516e.getValue()).f18135a));
            cVar4.f10517f.setValue(new v0.r(cVar2.s()));
            cVar4.f10518g.setValue(new v0.r(cVar2.k()));
            cVar4.f10519h.setValue(new v0.r(cVar2.t()));
            cVar4.f10520i.setValue(new v0.r(cVar2.l()));
            cVar4.f10521j.setValue(new v0.r(cVar2.x()));
            cVar4.f10522k.setValue(new v0.r(cVar2.o()));
            cVar4.f10523l.setValue(new v0.r(cVar2.y()));
            cVar4.f10524m.setValue(new v0.r(cVar2.p()));
            cVar4.n.setValue(new v0.r(cVar2.a()));
            cVar4.f10525o.setValue(new v0.r(cVar2.f()));
            cVar4.f10526p.setValue(new v0.r(cVar2.u()));
            cVar4.f10527q.setValue(new v0.r(cVar2.m()));
            cVar4.f10528r.setValue(new v0.r(cVar2.w()));
            cVar4.f10529s.setValue(new v0.r(cVar2.n()));
            cVar4.f10530t.setValue(new v0.r(cVar2.v()));
            cVar4.f10531u.setValue(new v0.r(cVar2.e()));
            cVar4.f10532v.setValue(new v0.r(cVar2.d()));
            cVar4.f10533w.setValue(new v0.r(cVar2.b()));
            cVar4.f10534x.setValue(new v0.r(cVar2.g()));
            cVar4.f10535y.setValue(new v0.r(cVar2.c()));
            cVar4.f10536z.setValue(new v0.r(cVar2.h()));
            cVar4.A.setValue(new v0.r(((v0.r) cVar2.A.getValue()).f18135a));
            cVar4.B.setValue(new v0.r(((v0.r) cVar2.B.getValue()).f18135a));
            cVar4.C.setValue(new v0.r(((v0.r) cVar2.C.getValue()).f18135a));
            d0.b a10 = h.a(0.0f, 0L, p10, 0, 7);
            p10.f(1866455512);
            long q10 = cVar4.q();
            v0.r rVar5 = new v0.r(q10);
            p10.f(1157296644);
            z10 = p10.z(rVar5);
            a03 = p10.a0();
            if (!z10 || a03 == c0120a) {
                a03 = new b0.d(q10, v0.r.b(q10, 0.4f));
                p10.I0(a03);
            }
            p10.Q(false);
            p10.Q(false);
            CompositionLocalKt.a(new p0[]{ColorSchemeKt.f2278a.b(cVar4), IndicationKt.f1540a.b(a10), RippleThemeKt.f2163a.b(j.f10549a), ShapesKt.f2400a.b(lVar4), TextSelectionColorsKt.f2127a.b((b0.d) a03), TypographyKt.f2598a.b(rVar4)}, a1.c.i0(p10, -1066563262, new MaterialThemeKt$MaterialTheme$1(rVar4, pVar, i17)), p10, 56);
            lVar3 = lVar4;
            rVar3 = rVar4;
            T = p10.T();
            if (T != null) {
            }
        }
        if ((i11 & 1) != 0) {
            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            cVar2 = (e0.c) p10.w(ColorSchemeKt.f2278a);
            i12 &= -15;
        }
        if ((i11 & 2) != 0) {
            q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
            lVar2 = (l) p10.w(ShapesKt.f2400a);
            i12 &= -113;
        }
        if ((i11 & 4) != 0) {
            q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
            rVar2 = (r) p10.w(TypographyKt.f2598a);
            i12 &= -897;
        }
        int i172 = i12;
        l lVar42 = lVar2;
        r rVar42 = rVar2;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar5 = ComposerKt.f2737a;
        p10.f(-492369756);
        a02 = p10.a0();
        c0120a = d.a.f11039a;
        if (a02 == c0120a) {
        }
        p10.Q(false);
        e0.c cVar42 = (e0.c) a02;
        h1 h1Var2 = ColorSchemeKt.f2278a;
        g.f(cVar42, "<this>");
        g.f(cVar2, "other");
        cVar42.f10513a.setValue(new v0.r(cVar2.q()));
        cVar42.f10514b.setValue(new v0.r(cVar2.i()));
        cVar42.c.setValue(new v0.r(cVar2.r()));
        cVar42.f10515d.setValue(new v0.r(cVar2.j()));
        cVar42.f10516e.setValue(new v0.r(((v0.r) cVar2.f10516e.getValue()).f18135a));
        cVar42.f10517f.setValue(new v0.r(cVar2.s()));
        cVar42.f10518g.setValue(new v0.r(cVar2.k()));
        cVar42.f10519h.setValue(new v0.r(cVar2.t()));
        cVar42.f10520i.setValue(new v0.r(cVar2.l()));
        cVar42.f10521j.setValue(new v0.r(cVar2.x()));
        cVar42.f10522k.setValue(new v0.r(cVar2.o()));
        cVar42.f10523l.setValue(new v0.r(cVar2.y()));
        cVar42.f10524m.setValue(new v0.r(cVar2.p()));
        cVar42.n.setValue(new v0.r(cVar2.a()));
        cVar42.f10525o.setValue(new v0.r(cVar2.f()));
        cVar42.f10526p.setValue(new v0.r(cVar2.u()));
        cVar42.f10527q.setValue(new v0.r(cVar2.m()));
        cVar42.f10528r.setValue(new v0.r(cVar2.w()));
        cVar42.f10529s.setValue(new v0.r(cVar2.n()));
        cVar42.f10530t.setValue(new v0.r(cVar2.v()));
        cVar42.f10531u.setValue(new v0.r(cVar2.e()));
        cVar42.f10532v.setValue(new v0.r(cVar2.d()));
        cVar42.f10533w.setValue(new v0.r(cVar2.b()));
        cVar42.f10534x.setValue(new v0.r(cVar2.g()));
        cVar42.f10535y.setValue(new v0.r(cVar2.c()));
        cVar42.f10536z.setValue(new v0.r(cVar2.h()));
        cVar42.A.setValue(new v0.r(((v0.r) cVar2.A.getValue()).f18135a));
        cVar42.B.setValue(new v0.r(((v0.r) cVar2.B.getValue()).f18135a));
        cVar42.C.setValue(new v0.r(((v0.r) cVar2.C.getValue()).f18135a));
        d0.b a102 = h.a(0.0f, 0L, p10, 0, 7);
        p10.f(1866455512);
        long q102 = cVar42.q();
        v0.r rVar52 = new v0.r(q102);
        p10.f(1157296644);
        z10 = p10.z(rVar52);
        a03 = p10.a0();
        if (!z10) {
        }
        a03 = new b0.d(q102, v0.r.b(q102, 0.4f));
        p10.I0(a03);
        p10.Q(false);
        p10.Q(false);
        CompositionLocalKt.a(new p0[]{ColorSchemeKt.f2278a.b(cVar42), IndicationKt.f1540a.b(a102), RippleThemeKt.f2163a.b(j.f10549a), ShapesKt.f2400a.b(lVar42), TextSelectionColorsKt.f2127a.b((b0.d) a03), TypographyKt.f2598a.b(rVar42)}, a1.c.i0(p10, -1066563262, new MaterialThemeKt$MaterialTheme$1(rVar42, pVar, i172)), p10, 56);
        lVar3 = lVar42;
        rVar3 = rVar42;
        T = p10.T();
        if (T != null) {
        }
    }
}
