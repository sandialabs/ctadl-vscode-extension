package e0;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.ComposerKt;
import g0.t0;
import g0.z0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final v.p f10510a;

    /* renamed from: b  reason: collision with root package name */
    public static final v.p f10511b;
    public static final float c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f10512d;

    static {
        float f10 = 24;
        float f11 = 8;
        f10510a = new v.p(f10, f11, f10, f11);
        new v.p(16, f11, f10, f11);
        float f12 = 12;
        f10511b = new v.p(f12, f11, f12, f11);
        c = 58;
        f10512d = 40;
        float f13 = f0.d.f10776a;
    }

    public static a a(long j2, g0.d dVar, int i10) {
        long j10;
        long j11;
        long j12;
        dVar.f(-1402274782);
        long j13 = 0;
        if ((i10 & 1) != 0) {
            j10 = v0.r.f18132f;
        } else {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = ColorSchemeKt.e(ColorSchemeKeyTokens.Primary, dVar);
        } else {
            j11 = j2;
        }
        if ((i10 & 4) != 0) {
            j12 = v0.r.f18132f;
        } else {
            j12 = 0;
        }
        if ((i10 & 8) != 0) {
            j13 = v0.r.b(ColorSchemeKt.e(ColorSchemeKeyTokens.OnSurface, dVar), 0.38f);
        }
        u7.q<g0.c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        a aVar = new a(j10, j11, j12, j13);
        dVar.u();
        return aVar;
    }
}
