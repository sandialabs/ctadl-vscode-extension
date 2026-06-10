package j1;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;

/* loaded from: classes.dex */
public final class z extends o0 implements y {

    /* renamed from: j  reason: collision with root package name */
    public final u7.l<b2.h, m7.n> f12666j;

    /* renamed from: k  reason: collision with root package name */
    public long f12667k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(u7.l<? super b2.h, m7.n> lVar, u7.l<? super n0, m7.n> lVar2) {
        super(lVar2);
        v7.g.f(lVar2, "inspectorInfo");
        this.f12666j = lVar;
        this.f12667k = v8.b.f(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // j1.y
    public final void b(long j2) {
        if (!b2.h.a(this.f12667k, j2)) {
            this.f12666j.U(new b2.h(j2));
            this.f12667k = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return v7.g.a(this.f12666j, ((z) obj).f12666j);
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f12666j.hashCode();
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
