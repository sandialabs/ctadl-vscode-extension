package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import f1.a;
import g0.c;
import g0.d;
import g0.k;
import g0.s;
import g0.t0;
import g0.z0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class NestedScrollModifierKt$nestedScroll$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f3258j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a f3259k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierKt$nestedScroll$2(a aVar, NestedScrollDispatcher nestedScrollDispatcher) {
        super(3);
        this.f3258j = nestedScrollDispatcher;
        this.f3259k = aVar;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(410346167);
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar3.f(773894976);
        dVar3.f(-492369756);
        Object g10 = dVar3.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            k kVar = new k(s.e(EmptyCoroutineContext.f13021i, dVar3));
            dVar3.q(kVar);
            g10 = kVar;
        }
        dVar3.u();
        x xVar = ((k) g10).f11060a;
        dVar3.u();
        dVar3.f(100475956);
        NestedScrollDispatcher nestedScrollDispatcher = this.f3258j;
        if (nestedScrollDispatcher == null) {
            dVar3.f(-492369756);
            Object g11 = dVar3.g();
            if (g11 == c0120a) {
                g11 = new NestedScrollDispatcher();
                dVar3.q(g11);
            }
            dVar3.u();
            nestedScrollDispatcher = (NestedScrollDispatcher) g11;
        }
        dVar3.u();
        dVar3.f(1618982084);
        a aVar = this.f3259k;
        boolean z10 = dVar3.z(aVar) | dVar3.z(nestedScrollDispatcher) | dVar3.z(xVar);
        Object g12 = dVar3.g();
        if (z10 || g12 == c0120a) {
            nestedScrollDispatcher.f3252b = xVar;
            g12 = new NestedScrollModifierLocal(aVar, nestedScrollDispatcher);
            dVar3.q(g12);
        }
        dVar3.u();
        NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) g12;
        dVar3.u();
        return nestedScrollModifierLocal;
    }
}
