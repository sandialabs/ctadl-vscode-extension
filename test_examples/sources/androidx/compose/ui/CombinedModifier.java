package androidx.compose.ui;

import androidx.activity.e;
import q0.d;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class CombinedModifier implements d {

    /* renamed from: i  reason: collision with root package name */
    public final d f2985i;

    /* renamed from: j  reason: collision with root package name */
    public final d f2986j;

    public CombinedModifier(d dVar, d dVar2) {
        g.f(dVar, "outer");
        g.f(dVar2, "inner");
        this.f2985i = dVar;
        this.f2986j = dVar2;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (g.a(this.f2985i, combinedModifier.f2985i) && g.a(this.f2986j, combinedModifier.f2986j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q0.d
    public final <R> R h0(R r3, p<? super R, ? super d.b, ? extends R> pVar) {
        g.f(pVar, "operation");
        return (R) this.f2986j.h0(this.f2985i.h0(r3, pVar), pVar);
    }

    public final int hashCode() {
        return (this.f2986j.hashCode() * 31) + this.f2985i.hashCode();
    }

    public final String toString() {
        return e.j(new StringBuilder("["), (String) h0("", CombinedModifier$toString$1.f2987j), ']');
    }

    @Override // q0.d
    public final boolean x(l<? super d.b, Boolean> lVar) {
        g.f(lVar, "predicate");
        return this.f2985i.x(lVar) && this.f2986j.x(lVar);
    }
}
