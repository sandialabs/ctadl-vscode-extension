package t0;

import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusStateImpl;
import m7.n;
import u7.p;

/* loaded from: classes.dex */
public final class c implements k1.f<c>, k1.d {

    /* renamed from: i  reason: collision with root package name */
    public final u7.l<k, n> f17543i;

    /* renamed from: j  reason: collision with root package name */
    public c f17544j;

    /* renamed from: k  reason: collision with root package name */
    public final h0.e<c> f17545k;

    /* renamed from: l  reason: collision with root package name */
    public final h0.e<FocusModifier> f17546l;

    /* JADX WARN: Multi-variable type inference failed */
    public c(u7.l<? super k, n> lVar) {
        v7.g.f(lVar, "onFocusEvent");
        this.f17543i = lVar;
        this.f17545k = new h0.e<>(new c[16]);
        this.f17546l = new h0.e<>(new FocusModifier[16]);
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        v7.g.f(gVar, "scope");
        k1.h<c> hVar = FocusEventModifierKt.f3009a;
        c cVar = (c) gVar.i(hVar);
        if (!v7.g.a(cVar, this.f17544j)) {
            c cVar2 = this.f17544j;
            h0.e<FocusModifier> eVar = this.f17546l;
            if (cVar2 != null) {
                cVar2.f17545k.l(this);
                cVar2.g(eVar);
            }
            this.f17544j = cVar;
            if (cVar != null) {
                cVar.f17545k.b(this);
                cVar.c(eVar);
            }
        }
        this.f17544j = (c) gVar.i(hVar);
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final void a(FocusModifier focusModifier) {
        v7.g.f(focusModifier, "focusModifier");
        this.f17546l.b(focusModifier);
        c cVar = this.f17544j;
        if (cVar != null) {
            cVar.a(focusModifier);
        }
    }

    public final void c(h0.e<FocusModifier> eVar) {
        h0.e<FocusModifier> eVar2 = this.f17546l;
        eVar2.c(eVar2.f11334k, eVar);
        c cVar = this.f17544j;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Boolean] */
    public final void d() {
        FocusModifier focusModifier;
        FocusStateImpl focusStateImpl;
        FocusModifier focusModifier2;
        h0.e<FocusModifier> eVar = this.f17546l;
        int i10 = eVar.f11334k;
        FocusStateImpl focusStateImpl2 = FocusStateImpl.Inactive;
        if (i10 != 0) {
            int i11 = 0;
            if (i10 != 1) {
                FocusModifier focusModifier3 = null;
                if (i10 > 0) {
                    FocusModifier[] focusModifierArr = eVar.f11332i;
                    v7.g.d(focusModifierArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    FocusModifier focusModifier4 = null;
                    do {
                        FocusModifier focusModifier5 = focusModifierArr[i11];
                        int ordinal = focusModifier5.f3019l.ordinal();
                        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                            focusModifier2 = focusModifier3;
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    focusModifier2 = ordinal != 5 ? focusModifier3 : Boolean.FALSE;
                                }
                            } else if (focusModifier3 == null) {
                                focusModifier2 = Boolean.TRUE;
                            }
                            i11++;
                            focusModifier3 = focusModifier2;
                        }
                        focusModifier4 = focusModifier5;
                        focusModifier2 = Boolean.FALSE;
                        i11++;
                        focusModifier3 = focusModifier2;
                    } while (i11 < i10);
                    focusModifier = focusModifier2;
                    focusModifier3 = focusModifier4;
                } else {
                    focusModifier = null;
                }
                if (focusModifier3 != null && (focusStateImpl = focusModifier3.f3019l) != null) {
                    focusStateImpl2 = focusStateImpl;
                }
                if (v7.g.a(focusModifier, Boolean.TRUE)) {
                    focusStateImpl2 = FocusStateImpl.Deactivated;
                }
            } else {
                focusStateImpl2 = eVar.f11332i[0].f3019l;
            }
        }
        this.f17543i.U(focusStateImpl2);
        c cVar = this.f17544j;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final void e(FocusModifier focusModifier) {
        v7.g.f(focusModifier, "focusModifier");
        this.f17546l.l(focusModifier);
        c cVar = this.f17544j;
        if (cVar != null) {
            cVar.e(focusModifier);
        }
    }

    public final void g(h0.e<FocusModifier> eVar) {
        this.f17546l.m(eVar);
        c cVar = this.f17544j;
        if (cVar != null) {
            cVar.g(eVar);
        }
    }

    @Override // k1.f
    public final k1.h<c> getKey() {
        return FocusEventModifierKt.f3009a;
    }

    @Override // k1.f
    public final c getValue() {
        return this;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
