package d1;

import androidx.activity.e;
import d1.b;
import k1.d;
import k1.f;
import k1.h;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class a<T extends b> implements d, f<a<T>> {

    /* renamed from: i  reason: collision with root package name */
    public final l<b, Boolean> f10377i;

    /* renamed from: j  reason: collision with root package name */
    public final l<b, Boolean> f10378j;

    /* renamed from: k  reason: collision with root package name */
    public final h<a<T>> f10379k;

    /* renamed from: l  reason: collision with root package name */
    public a<T> f10380l;

    public a(l lVar, h hVar) {
        g.f(hVar, "key");
        this.f10377i = lVar;
        this.f10378j = null;
        this.f10379k = hVar;
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        g.f(gVar, "scope");
        this.f10380l = (a) gVar.i(this.f10379k);
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return e.b(this, dVar);
    }

    public final boolean a(i1.a aVar) {
        l<b, Boolean> lVar = this.f10377i;
        if (lVar != null && lVar.U(aVar).booleanValue()) {
            return true;
        }
        a<T> aVar2 = this.f10380l;
        if (aVar2 != null) {
            return aVar2.a(aVar);
        }
        return false;
    }

    public final boolean c(i1.a aVar) {
        a<T> aVar2 = this.f10380l;
        if (aVar2 != null && aVar2.c(aVar)) {
            return true;
        }
        l<b, Boolean> lVar = this.f10378j;
        if (lVar != null) {
            return lVar.U(aVar).booleanValue();
        }
        return false;
    }

    @Override // k1.f
    public final h<a<T>> getKey() {
        return this.f10379k;
    }

    @Override // k1.f
    public final Object getValue() {
        return this;
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
