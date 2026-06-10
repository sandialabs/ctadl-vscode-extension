package d0;

import androidx.compose.material.ripple.RippleThemeKt;
import v0.r;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10348a = new a();

    @Override // d0.i
    public final long a(g0.d dVar) {
        dVar.f(602926056);
        long j2 = r.f18129b;
        a1.c.Q0(j2);
        dVar.u();
        return j2;
    }

    @Override // d0.i
    public final c b(g0.d dVar) {
        c cVar;
        dVar.f(-261015870);
        if (a1.c.Q0(r.f18129b) > 0.5d) {
            cVar = RippleThemeKt.f2164b;
        } else {
            cVar = RippleThemeKt.c;
        }
        dVar.u();
        return cVar;
    }
}
