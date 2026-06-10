package ga;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements h<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u7.p f11306a;

    public k(u7.p pVar) {
        this.f11306a = pVar;
    }

    @Override // ga.h
    public final Iterator<Object> iterator() {
        u7.p pVar = this.f11306a;
        v7.g.f(pVar, "block");
        i iVar = new i();
        iVar.f11305l = m0.b.P(iVar, iVar, pVar);
        return iVar;
    }
}
