package androidx.compose.ui;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.s;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import t0.b;
import t0.c;
import u7.a;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt0/b;", "mod", "Lt0/c;", "invoke", "(Lt0/b;Lg0/d;I)Lt0/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposedModifierKt$WrapFocusEventModifier$1 extends Lambda implements q<b, d, Integer, c> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposedModifierKt$WrapFocusEventModifier$1 f2990j = new ComposedModifierKt$WrapFocusEventModifier$1();

    public ComposedModifierKt$WrapFocusEventModifier$1() {
        super(3);
    }

    @Override // u7.q
    public final c O(b bVar, d dVar, Integer num) {
        b bVar2 = bVar;
        d dVar2 = dVar;
        num.intValue();
        g.f(bVar2, "mod");
        dVar2.f(-1790596922);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar2.f(1157296644);
        boolean z10 = dVar2.z(bVar2);
        Object g10 = dVar2.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (z10 || g10 == c0120a) {
            g10 = new c(new ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(bVar2));
            dVar2.q(g10);
        }
        dVar2.u();
        c cVar = (c) g10;
        dVar2.f(1157296644);
        boolean z11 = dVar2.z(cVar);
        Object g11 = dVar2.g();
        if (z11 || g11 == c0120a) {
            g11 = new ComposedModifierKt$WrapFocusEventModifier$1$1$1(cVar);
            dVar2.q(g11);
        }
        dVar2.u();
        s.d((a) g11, dVar2);
        dVar2.u();
        return cVar;
    }
}
