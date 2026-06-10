package s0;

import androidx.compose.ui.node.BackwardsCompatNode;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: i  reason: collision with root package name */
    public final b f17230i;

    /* renamed from: j  reason: collision with root package name */
    public final l<b, g> f17231j;

    /* JADX WARN: Multi-variable type inference failed */
    public e(b bVar, l<? super b, g> lVar) {
        v7.g.f(bVar, "cacheDrawScope");
        v7.g.f(lVar, "onBuildDrawCache");
        this.f17230i = bVar;
        this.f17231j = lVar;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return v7.g.a(this.f17230i, eVar.f17230i) && v7.g.a(this.f17231j, eVar.f17231j);
        }
        return false;
    }

    @Override // s0.f
    public final void f(x0.c cVar) {
        v7.g.f(cVar, "<this>");
        g gVar = this.f17230i.f17228j;
        v7.g.c(gVar);
        gVar.f17232a.U(cVar);
    }

    @Override // s0.d
    public final void f0(BackwardsCompatNode backwardsCompatNode) {
        v7.g.f(backwardsCompatNode, "params");
        b bVar = this.f17230i;
        bVar.getClass();
        bVar.f17227i = backwardsCompatNode;
        bVar.f17228j = null;
        this.f17231j.U(bVar);
        if (bVar.f17228j != null) {
            return;
        }
        throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f17231j.hashCode() + (this.f17230i.hashCode() * 31);
    }

    public final String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f17230i + ", onBuildDrawCache=" + this.f17231j + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
