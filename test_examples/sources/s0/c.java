package s0;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import m7.n;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class c extends o0 implements f {

    /* renamed from: j  reason: collision with root package name */
    public final l<x0.f, n> f17229j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super x0.f, n> lVar, l<? super n0, n> lVar2) {
        super(lVar2);
        v7.g.f(lVar2, "inspectorInfo");
        this.f17229j = lVar;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return v7.g.a(this.f17229j, ((c) obj).f17229j);
        }
        return false;
    }

    @Override // s0.f
    public final void f(x0.c cVar) {
        v7.g.f(cVar, "<this>");
        this.f17229j.U(cVar);
        cVar.o0();
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f17229j.hashCode();
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
