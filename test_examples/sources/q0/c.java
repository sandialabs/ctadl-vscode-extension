package q0;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import m7.n;
import q0.d;
import u7.l;
import u7.p;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class c extends o0 implements d.b {

    /* renamed from: j  reason: collision with root package name */
    public final q<d, g0.d, Integer, d> f16822j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super n0, n> lVar, q<? super d, ? super g0.d, ? super Integer, ? extends d> qVar) {
        super(lVar);
        g.f(lVar, "inspectorInfo");
        g.f(qVar, "factory");
        this.f16822j = qVar;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
