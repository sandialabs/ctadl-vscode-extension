package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import d0.h;
import e0.i;
import f0.e;
import g0.d;
import g0.g0;
import g0.p0;
import g0.r0;
import g0.t0;
import g0.v0;
import g0.z0;
import m7.n;
import q0.a;
import u.j;
import u.k;
import u7.p;
import u7.q;
import v0.c0;
import v0.r;
import v7.g;

/* loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f1, code lost:
        r2 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(u7.a<n> aVar, q0.d dVar, boolean z10, i iVar, j jVar, p<? super g0.d, ? super Integer, n> pVar, g0.d dVar2, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        boolean z11;
        i iVar2;
        int i14;
        Object obj2;
        int i15;
        Object obj3;
        boolean z12;
        int i16;
        q0.d dVar3;
        boolean z13;
        j jVar2;
        i iVar3;
        q0.d dVar4;
        boolean z14;
        i iVar4;
        j jVar3;
        r0 T;
        Object obj4;
        int i17;
        g.f(aVar, "onClick");
        g.f(pVar, "content");
        ComposerImpl p10 = dVar2.p(-1142896114);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.z(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj = dVar;
            i12 |= p10.z(obj) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                z11 = z10;
                i12 |= p10.c(z11) ? 256 : 128;
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        obj4 = iVar;
                        boolean z15 = p10.z(obj4);
                        obj4 = obj4;
                        if (z15) {
                            i17 = 2048;
                            i12 |= i17;
                            iVar2 = obj4;
                        }
                    } else {
                        obj4 = iVar;
                    }
                    i17 = 1024;
                    i12 |= i17;
                    iVar2 = obj4;
                } else {
                    iVar2 = iVar;
                }
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    obj2 = jVar;
                    i12 |= p10.z(obj2) ? 16384 : 8192;
                    if ((i11 & 32) == 0) {
                        i15 = 196608;
                    } else {
                        if ((458752 & i10) == 0) {
                            i15 = p10.z(pVar) ? 131072 : 65536;
                        }
                        if ((374491 & i12) == 74898 && p10.s()) {
                            p10.e();
                            dVar4 = obj;
                            z14 = z11;
                            iVar4 = iVar2;
                            jVar3 = obj2;
                            T = p10.T();
                            if (T == null) {
                                return;
                            }
                            T.f11073d = new IconButtonKt$IconButton$3(aVar, dVar4, z14, iVar4, jVar3, pVar, i10, i11);
                            return;
                        }
                        p10.t0();
                        if ((i10 & 1) != 0 && !p10.X()) {
                            p10.e();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            obj3 = obj;
                            z12 = z11;
                            i16 = i12;
                            dVar3 = obj3;
                            iVar3 = iVar2;
                            jVar2 = obj2;
                            z13 = z12;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                            q0.d a10 = TouchTargetKt.a(dVar3);
                            float f10 = e.f10785b;
                            q0.d d5 = SizeKt.d(a10, f10);
                            iVar3.getClass();
                            p10.f(1876083926);
                            g0 l12 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
                            p10.Q(false);
                            q0.d c = ClickableKt.c(a1.c.P(d5, ((r) l12.getValue()).f18135a, c0.f18087a), jVar2, h.a(f10 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
                            q0.b bVar = a.C0210a.c;
                            p10.f(733328855);
                            j1.q c10 = BoxKt.c(bVar, false, p10);
                            p10.f(-1323940314);
                            b2.b bVar2 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
                            LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                            j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
                            ComposeUiNode.f3400a.getClass();
                            u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
                            ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(c);
                            if (!(p10.f2640a instanceof g0.c)) {
                                p10.r();
                                if (p10.L) {
                                    p10.m(aVar2);
                                } else {
                                    p10.n();
                                }
                                p10.f2661x = false;
                                a1.c.s1(p10, c10, ComposeUiNode.Companion.f3404e);
                                a1.c.s1(p10, bVar2, ComposeUiNode.Companion.f3403d);
                                a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
                                a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
                                p10.h();
                                androidx.activity.e.o(0, a11, new v0(p10), p10, 2058660585, -2137368960);
                                p10.f(1428615496);
                                p10.f(613133646);
                                g0 l13 = a1.c.l1(new r(z13 ? iVar3.f10547b : iVar3.f10548d), p10);
                                p10.Q(false);
                                CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(((r) l13.getValue()).f18135a))}, pVar, p10, ((i16 >> 12) & 112) | 8);
                                p10.Q(false);
                                p10.Q(false);
                                p10.Q(false);
                                p10.Q(true);
                                p10.Q(false);
                                p10.Q(false);
                                dVar4 = dVar3;
                                z14 = z13;
                                iVar4 = iVar3;
                                jVar3 = jVar2;
                                T = p10.T();
                                if (T == null) {
                                }
                            } else {
                                a1.c.L0();
                                throw null;
                            }
                        }
                        obj3 = obj;
                        z12 = i13 != 0 ? true : z11;
                        if ((i11 & 8) != 0) {
                            p10.f(999008085);
                            long j2 = r.f18132f;
                            long j10 = ((r) p10.w(ContentColorKt.f2305a)).f18135a;
                            long b5 = r.b(j10, 0.38f);
                            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                            iVar2 = new i(j2, j10, j2, b5);
                            p10.Q(false);
                            i12 &= -7169;
                        }
                        if (i14 != 0) {
                            p10.f(-492369756);
                            Object a02 = p10.a0();
                            if (a02 == d.a.f11039a) {
                                a02 = new k();
                                p10.I0(a02);
                            }
                            p10.Q(false);
                            i16 = i12;
                            dVar3 = obj3;
                            z13 = z12;
                            jVar2 = (j) a02;
                            iVar3 = iVar2;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                            q0.d a102 = TouchTargetKt.a(dVar3);
                            float f102 = e.f10785b;
                            q0.d d52 = SizeKt.d(a102, f102);
                            iVar3.getClass();
                            p10.f(1876083926);
                            g0 l122 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
                            p10.Q(false);
                            q0.d c11 = ClickableKt.c(a1.c.P(d52, ((r) l122.getValue()).f18135a, c0.f18087a), jVar2, h.a(f102 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
                            q0.b bVar3 = a.C0210a.c;
                            p10.f(733328855);
                            j1.q c102 = BoxKt.c(bVar3, false, p10);
                            p10.f(-1323940314);
                            b2.b bVar22 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
                            LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                            j1 j1Var2 = (j1) p10.w(CompositionLocalsKt.f3712o);
                            ComposeUiNode.f3400a.getClass();
                            u7.a<ComposeUiNode> aVar22 = ComposeUiNode.Companion.f3402b;
                            ComposableLambdaImpl a112 = androidx.compose.ui.layout.a.a(c11);
                            if (!(p10.f2640a instanceof g0.c)) {
                            }
                        }
                        i16 = i12;
                        dVar3 = obj3;
                        iVar3 = iVar2;
                        jVar2 = obj2;
                        z13 = z12;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar32 = ComposerKt.f2737a;
                        q0.d a1022 = TouchTargetKt.a(dVar3);
                        float f1022 = e.f10785b;
                        q0.d d522 = SizeKt.d(a1022, f1022);
                        iVar3.getClass();
                        p10.f(1876083926);
                        g0 l1222 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
                        p10.Q(false);
                        q0.d c112 = ClickableKt.c(a1.c.P(d522, ((r) l1222.getValue()).f18135a, c0.f18087a), jVar2, h.a(f1022 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
                        q0.b bVar32 = a.C0210a.c;
                        p10.f(733328855);
                        j1.q c1022 = BoxKt.c(bVar32, false, p10);
                        p10.f(-1323940314);
                        b2.b bVar222 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
                        LayoutDirection layoutDirection22 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                        j1 j1Var22 = (j1) p10.w(CompositionLocalsKt.f3712o);
                        ComposeUiNode.f3400a.getClass();
                        u7.a<ComposeUiNode> aVar222 = ComposeUiNode.Companion.f3402b;
                        ComposableLambdaImpl a1122 = androidx.compose.ui.layout.a.a(c112);
                        if (!(p10.f2640a instanceof g0.c)) {
                        }
                    }
                    i12 |= i15;
                    if ((374491 & i12) == 74898) {
                        p10.e();
                        dVar4 = obj;
                        z14 = z11;
                        iVar4 = iVar2;
                        jVar3 = obj2;
                        T = p10.T();
                        if (T == null) {
                        }
                    }
                    p10.t0();
                    if ((i10 & 1) != 0) {
                        p10.e();
                        if ((i11 & 8) != 0) {
                        }
                        obj3 = obj;
                        z12 = z11;
                        i16 = i12;
                        dVar3 = obj3;
                        iVar3 = iVar2;
                        jVar2 = obj2;
                        z13 = z12;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar322 = ComposerKt.f2737a;
                        q0.d a10222 = TouchTargetKt.a(dVar3);
                        float f10222 = e.f10785b;
                        q0.d d5222 = SizeKt.d(a10222, f10222);
                        iVar3.getClass();
                        p10.f(1876083926);
                        g0 l12222 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
                        p10.Q(false);
                        q0.d c1122 = ClickableKt.c(a1.c.P(d5222, ((r) l12222.getValue()).f18135a, c0.f18087a), jVar2, h.a(f10222 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
                        q0.b bVar322 = a.C0210a.c;
                        p10.f(733328855);
                        j1.q c10222 = BoxKt.c(bVar322, false, p10);
                        p10.f(-1323940314);
                        b2.b bVar2222 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
                        LayoutDirection layoutDirection222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                        j1 j1Var222 = (j1) p10.w(CompositionLocalsKt.f3712o);
                        ComposeUiNode.f3400a.getClass();
                        u7.a<ComposeUiNode> aVar2222 = ComposeUiNode.Companion.f3402b;
                        ComposableLambdaImpl a11222 = androidx.compose.ui.layout.a.a(c1122);
                        if (!(p10.f2640a instanceof g0.c)) {
                        }
                    }
                    obj3 = obj;
                    if (i13 != 0) {
                    }
                    if ((i11 & 8) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    i16 = i12;
                    dVar3 = obj3;
                    iVar3 = iVar2;
                    jVar2 = obj2;
                    z13 = z12;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar3222 = ComposerKt.f2737a;
                    q0.d a102222 = TouchTargetKt.a(dVar3);
                    float f102222 = e.f10785b;
                    q0.d d52222 = SizeKt.d(a102222, f102222);
                    iVar3.getClass();
                    p10.f(1876083926);
                    g0 l122222 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
                    p10.Q(false);
                    q0.d c11222 = ClickableKt.c(a1.c.P(d52222, ((r) l122222.getValue()).f18135a, c0.f18087a), jVar2, h.a(f102222 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
                    q0.b bVar3222 = a.C0210a.c;
                    p10.f(733328855);
                    j1.q c102222 = BoxKt.c(bVar3222, false, p10);
                    p10.f(-1323940314);
                    b2.b bVar22222 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
                    LayoutDirection layoutDirection2222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                    j1 j1Var2222 = (j1) p10.w(CompositionLocalsKt.f3712o);
                    ComposeUiNode.f3400a.getClass();
                    u7.a<ComposeUiNode> aVar22222 = ComposeUiNode.Companion.f3402b;
                    ComposableLambdaImpl a112222 = androidx.compose.ui.layout.a.a(c11222);
                    if (!(p10.f2640a instanceof g0.c)) {
                    }
                }
                obj2 = jVar;
                if ((i11 & 32) == 0) {
                }
                i12 |= i15;
                if ((374491 & i12) == 74898) {
                }
                p10.t0();
                if ((i10 & 1) != 0) {
                }
                obj3 = obj;
                if (i13 != 0) {
                }
                if ((i11 & 8) != 0) {
                }
                if (i14 != 0) {
                }
                i16 = i12;
                dVar3 = obj3;
                iVar3 = iVar2;
                jVar2 = obj2;
                z13 = z12;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar32222 = ComposerKt.f2737a;
                q0.d a1022222 = TouchTargetKt.a(dVar3);
                float f1022222 = e.f10785b;
                q0.d d522222 = SizeKt.d(a1022222, f1022222);
                iVar3.getClass();
                p10.f(1876083926);
                g0 l1222222 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
                p10.Q(false);
                q0.d c112222 = ClickableKt.c(a1.c.P(d522222, ((r) l1222222.getValue()).f18135a, c0.f18087a), jVar2, h.a(f1022222 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
                q0.b bVar32222 = a.C0210a.c;
                p10.f(733328855);
                j1.q c1022222 = BoxKt.c(bVar32222, false, p10);
                p10.f(-1323940314);
                b2.b bVar222222 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
                LayoutDirection layoutDirection22222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                j1 j1Var22222 = (j1) p10.w(CompositionLocalsKt.f3712o);
                ComposeUiNode.f3400a.getClass();
                u7.a<ComposeUiNode> aVar222222 = ComposeUiNode.Companion.f3402b;
                ComposableLambdaImpl a1122222 = androidx.compose.ui.layout.a.a(c112222);
                if (!(p10.f2640a instanceof g0.c)) {
                }
            }
            z11 = z10;
            if ((i10 & 7168) == 0) {
            }
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            obj2 = jVar;
            if ((i11 & 32) == 0) {
            }
            i12 |= i15;
            if ((374491 & i12) == 74898) {
            }
            p10.t0();
            if ((i10 & 1) != 0) {
            }
            obj3 = obj;
            if (i13 != 0) {
            }
            if ((i11 & 8) != 0) {
            }
            if (i14 != 0) {
            }
            i16 = i12;
            dVar3 = obj3;
            iVar3 = iVar2;
            jVar2 = obj2;
            z13 = z12;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar322222 = ComposerKt.f2737a;
            q0.d a10222222 = TouchTargetKt.a(dVar3);
            float f10222222 = e.f10785b;
            q0.d d5222222 = SizeKt.d(a10222222, f10222222);
            iVar3.getClass();
            p10.f(1876083926);
            g0 l12222222 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
            p10.Q(false);
            q0.d c1122222 = ClickableKt.c(a1.c.P(d5222222, ((r) l12222222.getValue()).f18135a, c0.f18087a), jVar2, h.a(f10222222 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
            q0.b bVar322222 = a.C0210a.c;
            p10.f(733328855);
            j1.q c10222222 = BoxKt.c(bVar322222, false, p10);
            p10.f(-1323940314);
            b2.b bVar2222222 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
            LayoutDirection layoutDirection222222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
            j1 j1Var222222 = (j1) p10.w(CompositionLocalsKt.f3712o);
            ComposeUiNode.f3400a.getClass();
            u7.a<ComposeUiNode> aVar2222222 = ComposeUiNode.Companion.f3402b;
            ComposableLambdaImpl a11222222 = androidx.compose.ui.layout.a.a(c1122222);
            if (!(p10.f2640a instanceof g0.c)) {
            }
        }
        obj = dVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 7168) == 0) {
        }
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        obj2 = jVar;
        if ((i11 & 32) == 0) {
        }
        i12 |= i15;
        if ((374491 & i12) == 74898) {
        }
        p10.t0();
        if ((i10 & 1) != 0) {
        }
        obj3 = obj;
        if (i13 != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        if (i14 != 0) {
        }
        i16 = i12;
        dVar3 = obj3;
        iVar3 = iVar2;
        jVar2 = obj2;
        z13 = z12;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar3222222 = ComposerKt.f2737a;
        q0.d a102222222 = TouchTargetKt.a(dVar3);
        float f102222222 = e.f10785b;
        q0.d d52222222 = SizeKt.d(a102222222, f102222222);
        iVar3.getClass();
        p10.f(1876083926);
        g0 l122222222 = a1.c.l1(new r(!z13 ? iVar3.f10546a : iVar3.c), p10);
        p10.Q(false);
        q0.d c11222222 = ClickableKt.c(a1.c.P(d52222222, ((r) l122222222.getValue()).f18135a, c0.f18087a), jVar2, h.a(f102222222 / 2, 0L, p10, 54, 4), z13, new o1.g(0), aVar, 8);
        q0.b bVar3222222 = a.C0210a.c;
        p10.f(733328855);
        j1.q c102222222 = BoxKt.c(bVar3222222, false, p10);
        p10.f(-1323940314);
        b2.b bVar22222222 = (b2.b) p10.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection2222222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
        j1 j1Var2222222 = (j1) p10.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar22222222 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a112222222 = androidx.compose.ui.layout.a.a(c11222222);
        if (!(p10.f2640a instanceof g0.c)) {
        }
    }
}
