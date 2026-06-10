package g0;

import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class i0<N> implements c<N> {

    /* renamed from: a  reason: collision with root package name */
    public final c<N> f11054a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11055b;
    public int c;

    public i0(c<N> cVar, int i10) {
        v7.g.f(cVar, "applier");
        this.f11054a = cVar;
        this.f11055b = i10;
    }

    @Override // g0.c
    public final N a() {
        return this.f11054a.a();
    }

    @Override // g0.c
    public final void b(int i10, N n) {
        this.f11054a.b(i10 + (this.c == 0 ? this.f11055b : 0), n);
    }

    @Override // g0.c
    public final void c(N n) {
        this.c++;
        this.f11054a.c(n);
    }

    @Override // g0.c
    public final void clear() {
        ComposerKt.c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // g0.c
    public final /* synthetic */ void d() {
    }

    @Override // g0.c
    public final void e(int i10, N n) {
        this.f11054a.e(i10 + (this.c == 0 ? this.f11055b : 0), n);
    }

    @Override // g0.c
    public final /* synthetic */ void f() {
    }

    @Override // g0.c
    public final void g(int i10, int i11, int i12) {
        int i13 = this.c == 0 ? this.f11055b : 0;
        this.f11054a.g(i10 + i13, i11 + i13, i12);
    }

    @Override // g0.c
    public final void h(int i10, int i11) {
        this.f11054a.h(i10 + (this.c == 0 ? this.f11055b : 0), i11);
    }

    @Override // g0.c
    public final void i() {
        int i10 = this.c;
        if (!(i10 > 0)) {
            ComposerKt.c("OffsetApplier up called with no corresponding down".toString());
            throw null;
        }
        this.c = i10 - 1;
        this.f11054a.i();
    }
}
