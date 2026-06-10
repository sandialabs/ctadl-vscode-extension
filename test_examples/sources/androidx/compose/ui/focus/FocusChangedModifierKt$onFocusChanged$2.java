package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.g0;
import g0.t0;
import g0.z0;
import k1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import t0.k;
import u7.l;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class FocusChangedModifierKt$onFocusChanged$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<k, n> f3006j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedModifierKt$onFocusChanged$2(l<? super k, n> lVar) {
        super(3);
        this.f3006j = lVar;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(-1741761824);
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar3.f(-492369756);
        Object g10 = dVar3.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g10 = a1.c.V0(null);
            dVar3.q(g10);
        }
        dVar3.u();
        g0 g0Var = (g0) g10;
        d.a aVar = d.a.f16824i;
        dVar3.f(511388516);
        boolean z10 = dVar3.z(g0Var);
        l<k, n> lVar = this.f3006j;
        boolean z11 = z10 | dVar3.z(lVar);
        Object g11 = dVar3.g();
        if (z11 || g11 == c0120a) {
            g11 = new FocusChangedModifierKt$onFocusChanged$2$1$1(g0Var, lVar);
            dVar3.q(g11);
        }
        dVar3.u();
        l lVar2 = (l) g11;
        h<t0.c> hVar = FocusEventModifierKt.f3009a;
        g.f(lVar2, "onFocusEvent");
        q0.d a10 = ComposedModifierKt.a(aVar, InspectableValueKt.f3744a, new FocusEventModifierKt$onFocusEvent$2(lVar2));
        dVar3.u();
        return a10;
    }
}
