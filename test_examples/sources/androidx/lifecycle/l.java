package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import ja.u0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Lifecycle f5406a;

    /* renamed from: b  reason: collision with root package name */
    public final Lifecycle.State f5407b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public final k f5408d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.p, androidx.lifecycle.k] */
    public l(Lifecycle lifecycle, Lifecycle.State state, f fVar, final u0 u0Var) {
        v7.g.f(lifecycle, "lifecycle");
        v7.g.f(state, "minState");
        v7.g.f(fVar, "dispatchQueue");
        this.f5406a = lifecycle;
        this.f5407b = state;
        this.c = fVar;
        ?? r3 = new o() { // from class: androidx.lifecycle.k
            @Override // androidx.lifecycle.o
            public final void f(q qVar, Lifecycle.Event event) {
                l lVar = l.this;
                v7.g.f(lVar, "this$0");
                u0 u0Var2 = u0Var;
                v7.g.f(u0Var2, "$parentJob");
                if (qVar.i0().f5413d == Lifecycle.State.DESTROYED) {
                    u0Var2.c(null);
                    lVar.a();
                    return;
                }
                int compareTo = qVar.i0().f5413d.compareTo(lVar.f5407b);
                f fVar2 = lVar.c;
                if (compareTo < 0) {
                    fVar2.f5383a = true;
                } else if (fVar2.f5383a) {
                    if (!fVar2.f5384b) {
                        fVar2.f5383a = false;
                        fVar2.a();
                        return;
                    }
                    throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                }
            }
        };
        this.f5408d = r3;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            u0Var.c(null);
            a();
            return;
        }
        lifecycle.a(r3);
    }

    public final void a() {
        this.f5406a.c(this.f5408d);
        f fVar = this.c;
        fVar.f5384b = true;
        fVar.a();
    }
}
