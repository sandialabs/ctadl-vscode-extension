package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.s;
import g0.t0;
import g0.z0;
import k1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import u7.a;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class FocusModifierKt$focusTarget$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public static final FocusModifierKt$focusTarget$2 f3035j = new FocusModifierKt$focusTarget$2();

    public FocusModifierKt$focusTarget$2() {
        super(3);
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        d dVar3 = dVar;
        g0.d dVar4 = dVar2;
        num.intValue();
        g.f(dVar3, "$this$composed");
        dVar4.f(-326009031);
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar4.f(-492369756);
        Object g10 = dVar4.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g10 = new FocusModifier(0);
            dVar4.q(g10);
        }
        dVar4.u();
        FocusModifier focusModifier = (FocusModifier) g10;
        dVar4.f(1157296644);
        boolean z10 = dVar4.z(focusModifier);
        Object g11 = dVar4.g();
        if (z10 || g11 == c0120a) {
            g11 = new FocusModifierKt$focusTarget$2$1$1(focusModifier);
            dVar4.q(g11);
        }
        dVar4.u();
        s.d((a) g11, dVar4);
        h<FocusModifier> hVar = FocusModifierKt.f3032a;
        g.f(focusModifier, "focusModifier");
        q0.d Z = dVar3.Z(focusModifier).Z(FocusModifierKt.f3033b);
        dVar4.u();
        return Z;
    }
}
