package s;

import g0.g0;

/* loaded from: classes.dex */
public final class h implements g0.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f17212a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.j f17213b;

    public h(g0 g0Var, u.j jVar) {
        this.f17212a = g0Var;
        this.f17213b = jVar;
    }

    @Override // g0.p
    public final void a() {
        g0 g0Var = this.f17212a;
        u.d dVar = (u.d) g0Var.getValue();
        if (dVar != null) {
            u.e eVar = new u.e(dVar);
            u.j jVar = this.f17213b;
            if (jVar != null) {
                jVar.b(eVar);
            }
            g0Var.setValue(null);
        }
    }
}
