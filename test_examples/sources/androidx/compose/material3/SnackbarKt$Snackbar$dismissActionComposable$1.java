package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$dismissActionComposable$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f2505j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$dismissActionComposable$1(m mVar, int i10) {
        super(2);
        this.f2505j = mVar;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar2.f(1157296644);
        m mVar = this.f2505j;
        boolean z10 = dVar2.z(mVar);
        Object g10 = dVar2.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new SnackbarKt$Snackbar$dismissActionComposable$1$1$1(mVar);
            dVar2.q(g10);
        }
        dVar2.u();
        IconButtonKt.a((u7.a) g10, null, false, null, null, ComposableSingletons$SnackbarKt.f2303a, dVar2, 196608, 30);
        return n.f16010a;
    }
}
