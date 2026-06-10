package o1;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import java.util.concurrent.atomic.AtomicInteger;
import u7.p;

/* loaded from: classes.dex */
public final class l extends o0 implements k {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicInteger f16209k = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public final j f16210j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z10, boolean z11, u7.l<? super o, m7.n> lVar, u7.l<? super n0, m7.n> lVar2) {
        super(lVar2);
        v7.g.f(lVar, "properties");
        v7.g.f(lVar2, "inspectorInfo");
        j jVar = new j();
        jVar.f16207j = z10;
        jVar.f16208k = z11;
        lVar.U(jVar);
        this.f16210j = jVar;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        if (v7.g.a(this.f16210j, ((l) obj).f16210j)) {
            return true;
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f16210j.hashCode();
    }

    @Override // o1.k
    public final j t() {
        return this.f16210j;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
