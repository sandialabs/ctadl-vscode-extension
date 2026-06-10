package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q<m, g0.d, Integer, n> f2413j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f2414k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f2415l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(q<? super m, ? super g0.d, ? super Integer, n> qVar, m mVar, int i10) {
        super(2);
        this.f2413j = qVar;
        this.f2414k = mVar;
        this.f2415l = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        m mVar = this.f2414k;
        g.c(mVar);
        this.f2413j.O(mVar, dVar2, Integer.valueOf((this.f2415l >> 3) & 112));
        return n.f16010a;
    }
}
