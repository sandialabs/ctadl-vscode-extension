package s;

import g0.g0;

/* loaded from: classes.dex */
public final class d implements g0.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f17204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.j f17205b;

    public d(g0 g0Var, u.j jVar) {
        this.f17204a = g0Var;
        this.f17205b = jVar;
    }

    @Override // g0.p
    public final void a() {
        g0 g0Var = this.f17204a;
        u.m mVar = (u.m) g0Var.getValue();
        if (mVar != null) {
            this.f17205b.b(new u.l(mVar));
            g0Var.setValue(null);
        }
    }
}
