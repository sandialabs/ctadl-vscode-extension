package t0;

import androidx.compose.ui.focus.FocusPropertiesImpl;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import g0.k0;
import m7.n;
import u7.p;

/* loaded from: classes.dex */
public final class h extends o0 implements k1.d, k1.f<h> {

    /* renamed from: j  reason: collision with root package name */
    public final u7.l<g, n> f17548j;

    /* renamed from: k  reason: collision with root package name */
    public final k0 f17549k;

    /* renamed from: l  reason: collision with root package name */
    public final k1.h<h> f17550l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(u7.l<? super g, n> lVar, u7.l<? super n0, n> lVar2) {
        super(lVar2);
        v7.g.f(lVar, "focusPropertiesScope");
        v7.g.f(lVar2, "inspectorInfo");
        this.f17548j = lVar;
        this.f17549k = a1.c.V0(null);
        this.f17550l = FocusPropertiesKt.f3049a;
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        v7.g.f(gVar, "scope");
        this.f17549k.setValue((h) gVar.i(FocusPropertiesKt.f3049a));
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final void c(FocusPropertiesImpl focusPropertiesImpl) {
        v7.g.f(focusPropertiesImpl, "focusProperties");
        this.f17548j.U(focusPropertiesImpl);
        h hVar = (h) this.f17549k.getValue();
        if (hVar != null) {
            hVar.c(focusPropertiesImpl);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (v7.g.a(this.f17548j, ((h) obj).f17548j)) {
                return true;
            }
        }
        return false;
    }

    @Override // k1.f
    public final k1.h<h> getKey() {
        return this.f17550l;
    }

    @Override // k1.f
    public final h getValue() {
        return this;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f17548j.hashCode();
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
