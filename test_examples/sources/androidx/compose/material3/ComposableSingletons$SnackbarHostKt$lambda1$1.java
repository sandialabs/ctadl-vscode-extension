package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le0/m;", "it", "Lm7/n;", "invoke", "(Le0/m;Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends Lambda implements q<m, g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 f2302j = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    public ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    @Override // u7.q
    public final n O(m mVar, g0.d dVar, Integer num) {
        int i10;
        m mVar2 = mVar;
        g0.d dVar2 = dVar;
        int intValue = num.intValue();
        g.f(mVar2, "it");
        if ((intValue & 14) == 0) {
            if (dVar2.z(mVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        int i11 = intValue;
        if ((i11 & 91) == 18 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        SnackbarKt.b(mVar2, null, false, null, 0L, 0L, 0L, 0L, 0L, dVar2, i11 & 14, 510);
        return n.f16010a;
    }
}
