package androidx.compose.foundation.relocation;

import j1.h;
import ja.u0;
import k1.f;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import u0.d;
import x.a;
import x.b;
import x.c;
import x.g;

/* loaded from: classes.dex */
public final class BringIntoViewResponderModifier extends b implements f<c>, c {

    /* renamed from: l  reason: collision with root package name */
    public g f2042l;

    /* renamed from: m  reason: collision with root package name */
    public Pair<d, ? extends u0> f2043m;
    public Pair<d, ? extends u0> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(a aVar) {
        super(aVar);
        v7.g.f(aVar, "defaultParent");
    }

    public static final Object c(BringIntoViewResponderModifier bringIntoViewResponderModifier, Pair pair, h hVar, p7.c cVar) {
        bringIntoViewResponderModifier.n = pair;
        d dVar = (d) pair.f12962i;
        g gVar = bringIntoViewResponderModifier.f2042l;
        if (gVar != null) {
            Object H = a1.b.H(new BringIntoViewResponderModifier$dispatchRequest$2(bringIntoViewResponderModifier, gVar.c(dVar), hVar, dVar, null), cVar);
            if (H != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return n.f16010a;
            }
            return H;
        }
        v7.g.l("responder");
        throw null;
    }

    @Override // x.c
    public final Object a(d dVar, h hVar, p7.c<? super n> cVar) {
        Object H = a1.b.H(new BringIntoViewResponderModifier$bringChildIntoView$2(this, hVar, dVar, null), cVar);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : n.f16010a;
    }

    @Override // k1.f
    public final k1.h<c> getKey() {
        return BringIntoViewKt.f2029a;
    }

    @Override // k1.f
    public final c getValue() {
        return this;
    }
}
