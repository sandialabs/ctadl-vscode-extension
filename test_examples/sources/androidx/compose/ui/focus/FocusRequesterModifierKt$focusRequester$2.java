package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import t0.j;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class FocusRequesterModifierKt$focusRequester$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f3059j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRequesterModifierKt$focusRequester$2(FocusRequester focusRequester) {
        super(3);
        this.f3059j = focusRequester;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(-307396750);
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar3.f(1157296644);
        FocusRequester focusRequester = this.f3059j;
        boolean z10 = dVar3.z(focusRequester);
        Object g10 = dVar3.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new j(focusRequester);
            dVar3.q(g10);
        }
        dVar3.u();
        j jVar = (j) g10;
        dVar3.u();
        return jVar;
    }
}
