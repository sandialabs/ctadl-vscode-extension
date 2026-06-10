package x0;

import v0.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18558a;

    public b(d dVar) {
        this.f18558a = dVar;
    }

    public final void a(v0.h hVar, int i10) {
        this.f18558a.b().j(hVar, i10);
    }

    public final void b(float f10, float f11, float f12, float f13, int i10) {
        this.f18558a.b().h(f10, f11, f12, f13, i10);
    }

    public final void c(float f10, float f11, float f12, float f13) {
        boolean z10;
        d dVar = this.f18558a;
        o b5 = dVar.b();
        long v3 = a1.c.v(u0.f.d(dVar.a()) - (f12 + f10), u0.f.b(dVar.a()) - (f13 + f11));
        if (u0.f.d(v3) >= 0.0f && u0.f.b(v3) >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar.c(v3);
            b5.i(f10, f11);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }

    public final void d(long j2) {
        o b5 = this.f18558a.b();
        b5.i(u0.c.b(j2), u0.c.c(j2));
        b5.f();
        b5.i(-u0.c.b(j2), -u0.c.c(j2));
    }

    public final void e(float[] fArr) {
        this.f18558a.b().o(fArr);
    }

    public final void f(float f10, float f11) {
        this.f18558a.b().i(f10, f11);
    }
}
