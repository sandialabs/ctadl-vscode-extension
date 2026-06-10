package androidx.compose.ui.platform;

import q0.d;

/* loaded from: classes.dex */
public final class m0 extends o0 implements d.b {

    /* renamed from: j  reason: collision with root package name */
    public final a f3858j;

    /* loaded from: classes.dex */
    public final class a implements d.b {
        @Override // q0.d
        public final /* synthetic */ q0.d Z(q0.d dVar) {
            return androidx.activity.e.b(this, dVar);
        }

        @Override // q0.d
        public final Object h0(Object obj, u7.p pVar) {
            v7.g.f(pVar, "operation");
            return pVar.R(obj, this);
        }

        @Override // q0.d
        public final /* synthetic */ boolean x(u7.l lVar) {
            return a4.b.a(this, lVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(u7.l<? super n0, m7.n> lVar) {
        super(lVar);
        v7.g.f(lVar, "inspectorInfo");
        this.f3858j = new a();
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
