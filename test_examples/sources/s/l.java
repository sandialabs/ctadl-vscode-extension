package s;

import g0.g0;

/* loaded from: classes.dex */
public final class l implements g0.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f17219a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.j f17220b;

    public l(g0 g0Var, u.j jVar) {
        this.f17219a = g0Var;
        this.f17220b = jVar;
    }

    @Override // g0.p
    public final void a() {
        g0 g0Var = this.f17219a;
        u.f fVar = (u.f) g0Var.getValue();
        if (fVar != null) {
            this.f17220b.b(new u.g(fVar));
            g0Var.setValue(null);
        }
    }
}
