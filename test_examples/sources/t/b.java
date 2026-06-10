package t;

import g0.g0;
import g0.p;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f17537a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.j f17538b;

    public b(g0 g0Var, u.j jVar) {
        this.f17537a = g0Var;
        this.f17538b = jVar;
    }

    @Override // g0.p
    public final void a() {
        g0 g0Var = this.f17537a;
        u.b bVar = (u.b) g0Var.getValue();
        if (bVar != null) {
            u.j jVar = this.f17538b;
            if (jVar != null) {
                jVar.b(new u.a(bVar));
            }
            g0Var.setValue(null);
        }
    }
}
