package d0;

import g0.d;
import g0.g0;
import r.q;
import r.y;
import v0.r;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final y<Float> f10366a = new y<>(15, q.c, 2);

    public static final b a(float f10, long j2, g0.d dVar, int i10, int i11) {
        boolean z10;
        dVar.f(-1508283871);
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            j2 = r.f18133g;
        }
        g0 l12 = a1.c.l1(new r(j2), dVar);
        Boolean valueOf = Boolean.valueOf(z10);
        b2.d dVar2 = new b2.d(f10);
        dVar.f(-3686552);
        boolean z11 = dVar.z(valueOf) | dVar.z(dVar2);
        Object g10 = dVar.g();
        if (z11 || g10 == d.a.f11039a) {
            g10 = new b(z10, f10, l12);
            dVar.q(g10);
        }
        dVar.u();
        b bVar = (b) g10;
        dVar.u();
        return bVar;
    }
}
