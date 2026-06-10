package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.h1;
import g0.t0;
import g0.z0;
import kotlin.NoWhenBranchMatchedException;
import m7.n;
import ma.i;
import u7.q;
import v0.r;
import v7.g;

/* loaded from: classes.dex */
public final class ColorSchemeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f2278a = CompositionLocalKt.c(ColorSchemeKt$LocalColorScheme$1.f2279j);

    public static final long a(long j2, g0.d dVar) {
        long j10;
        boolean z10;
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        e0.c cVar = (e0.c) dVar.w(f2278a);
        g.f(cVar, "$this$contentColorFor");
        if (r.c(j2, cVar.q())) {
            j10 = cVar.i();
        } else if (r.c(j2, cVar.s())) {
            j10 = cVar.k();
        } else if (r.c(j2, cVar.x())) {
            j10 = cVar.o();
        } else if (r.c(j2, cVar.a())) {
            j10 = cVar.f();
        } else if (r.c(j2, cVar.b())) {
            j10 = cVar.g();
        } else if (r.c(j2, cVar.u())) {
            j10 = cVar.m();
        } else if (r.c(j2, cVar.w())) {
            j10 = cVar.n();
        } else if (r.c(j2, cVar.r())) {
            j10 = cVar.j();
        } else if (r.c(j2, cVar.t())) {
            j10 = cVar.l();
        } else if (r.c(j2, cVar.y())) {
            j10 = cVar.p();
        } else if (r.c(j2, cVar.c())) {
            j10 = cVar.h();
        } else if (r.c(j2, cVar.e())) {
            j10 = cVar.d();
        } else {
            j10 = r.f18133g;
        }
        if (j10 != r.f18133g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return ((r) dVar.w(ContentColorKt.f2305a)).f18135a;
        }
        return j10;
    }

    public static e0.c b(long j2, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        return new e0.c(j2, j10, f0.a.f10745m, f0.a.f10740h, f0.a.f10736d, j11, j12, f0.a.f10746o, f0.a.f10741i, f0.a.f10747p, f0.a.f10742j, f0.a.f10748q, f0.a.f10743k, j13, j14, j15, j16, j17, j18, j2, f0.a.f10737e, f0.a.c, f0.a.f10734a, f0.a.f10738f, f0.a.f10735b, f0.a.f10739g, j19, f0.a.f10744l, f0.a.n);
    }

    public static e0.c c(long j2, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i10) {
        long j20 = (i10 & 1) != 0 ? f0.b.f10766t : j2;
        return new e0.c(j20, (i10 & 2) != 0 ? f0.b.f10757j : j10, (i10 & 4) != 0 ? f0.b.f10767u : 0L, (i10 & 8) != 0 ? f0.b.f10758k : 0L, (i10 & 16) != 0 ? f0.b.f10752e : 0L, (i10 & 32) != 0 ? f0.b.f10769w : j11, (i10 & 64) != 0 ? f0.b.f10759l : j12, (i10 & 128) != 0 ? f0.b.f10770x : 0L, (i10 & 256) != 0 ? f0.b.f10760m : 0L, (i10 & 512) != 0 ? f0.b.A : 0L, (i10 & 1024) != 0 ? f0.b.f10762p : 0L, (i10 & 2048) != 0 ? f0.b.B : 0L, (i10 & 4096) != 0 ? f0.b.f10763q : 0L, (i10 & 8192) != 0 ? f0.b.f10749a : j13, (i10 & 16384) != 0 ? f0.b.f10754g : j14, (32768 & i10) != 0 ? f0.b.f10771y : j15, (65536 & i10) != 0 ? f0.b.n : j16, (131072 & i10) != 0 ? f0.b.f10772z : j17, (262144 & i10) != 0 ? f0.b.f10761o : j18, (524288 & i10) != 0 ? j20 : 0L, (1048576 & i10) != 0 ? f0.b.f10753f : 0L, (2097152 & i10) != 0 ? f0.b.f10751d : 0L, (4194304 & i10) != 0 ? f0.b.f10750b : 0L, (8388608 & i10) != 0 ? f0.b.f10755h : 0L, (16777216 & i10) != 0 ? f0.b.c : 0L, (33554432 & i10) != 0 ? f0.b.f10756i : 0L, (67108864 & i10) != 0 ? f0.b.f10764r : j19, (134217728 & i10) != 0 ? f0.b.f10765s : 0L, (i10 & 268435456) != 0 ? f0.b.f10768v : 0L);
    }

    public static final long d(e0.c cVar, float f10) {
        g.f(cVar, "$this$surfaceColorAtElevation");
        if (b2.d.a(f10, 0)) {
            return cVar.u();
        }
        return a1.c.k0(r.b(cVar.v(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f), cVar.u());
    }

    public static final long e(ColorSchemeKeyTokens colorSchemeKeyTokens, g0.d dVar) {
        g.f(colorSchemeKeyTokens, "<this>");
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        e0.c cVar = (e0.c) dVar.w(f2278a);
        g.f(cVar, "<this>");
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return cVar.a();
            case 1:
                return cVar.b();
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return cVar.c();
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return cVar.d();
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return ((r) cVar.f10516e.getValue()).f18135a;
            case 5:
                return cVar.e();
            case 6:
                return cVar.f();
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return cVar.g();
            case 8:
                return cVar.h();
            case i.f16046m /* 9 */:
                return cVar.i();
            case i.f16047o /* 10 */:
                return cVar.j();
            case 11:
                return cVar.k();
            case 12:
                return cVar.l();
            case 13:
                return cVar.m();
            case 14:
                return cVar.n();
            case i.f16049q /* 15 */:
                return cVar.o();
            case 16:
                return cVar.p();
            case 17:
                return ((r) cVar.A.getValue()).f18135a;
            case 18:
                return ((r) cVar.B.getValue()).f18135a;
            case 19:
                return cVar.q();
            case 20:
                return cVar.r();
            case 21:
                return ((r) cVar.C.getValue()).f18135a;
            case 22:
                return cVar.s();
            case 23:
                return cVar.t();
            case 24:
                return cVar.u();
            case 25:
                return cVar.v();
            case 26:
                return cVar.w();
            case 27:
                return cVar.x();
            case 28:
                return cVar.y();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
