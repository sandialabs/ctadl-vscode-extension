package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.s;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import t0.k;
import u7.a;
import u7.l;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class FocusEventModifierKt$onFocusEvent$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<k, n> f3011j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventModifierKt$onFocusEvent$2(l<? super k, n> lVar) {
        super(3);
        this.f3011j = lVar;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(607036704);
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar3.f(1157296644);
        l<k, n> lVar = this.f3011j;
        boolean z10 = dVar3.z(lVar);
        Object g10 = dVar3.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (z10 || g10 == c0120a) {
            g10 = new t0.c(lVar);
            dVar3.q(g10);
        }
        dVar3.u();
        t0.c cVar = (t0.c) g10;
        dVar3.f(1157296644);
        boolean z11 = dVar3.z(cVar);
        Object g11 = dVar3.g();
        if (z11 || g11 == c0120a) {
            g11 = new FocusEventModifierKt$onFocusEvent$2$1$1(cVar);
            dVar3.q(g11);
        }
        dVar3.u();
        s.d((a) g11, dVar3);
        dVar3.u();
        return cVar;
    }
}
