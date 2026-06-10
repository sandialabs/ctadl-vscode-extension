package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "<anonymous parameter 0>", "Lg0/z0;", "slots", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerKt$resetSlotsInstance$1 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposerKt$resetSlotsInstance$1 f2749j = new ComposerKt$resetSlotsInstance$1();

    public ComposerKt$resetSlotsInstance$1() {
        super(3);
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        boolean z10;
        z0 z0Var2 = z0Var;
        androidx.activity.e.p(cVar, "<anonymous parameter 0>", z0Var2, "slots", t0Var, "<anonymous parameter 2>");
        if (z0Var2.f11130m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z0Var2.B();
            z0Var2.f11134r = 0;
            z0Var2.f11124g = (z0Var2.f11120b.length / 5) - z0Var2.f11123f;
            z0Var2.f11125h = 0;
            z0Var2.f11126i = 0;
            z0Var2.n = 0;
            return n.f16010a;
        }
        ComposerKt.c("Cannot reset when inserting".toString());
        throw null;
    }
}
