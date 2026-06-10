package y;

import a4.b;
import androidx.activity.e;
import androidx.compose.foundation.gestures.ScrollableKt;
import g0.g0;
import k1.d;
import k1.g;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g0<Boolean> f18774i;

    public a(g0<Boolean> g0Var) {
        this.f18774i = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k1.d
    public final void T(g gVar) {
        v7.g.f(gVar, "scope");
        this.f18774i.setValue(gVar.i(ScrollableKt.f1783b));
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return e.b(this, dVar);
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return b.a(this, lVar);
    }
}
