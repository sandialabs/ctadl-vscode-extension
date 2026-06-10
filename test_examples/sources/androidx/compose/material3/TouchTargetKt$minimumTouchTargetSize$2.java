package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class TouchTargetKt$minimumTouchTargetSize$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public static final TouchTargetKt$minimumTouchTargetSize$2 f2597j = new TouchTargetKt$minimumTouchTargetSize$2();

    public TouchTargetKt$minimumTouchTargetSize$2() {
        super(3);
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        q0.d dVar3;
        g0.d dVar4 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar4.f(-1937671640);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        if (((Boolean) dVar4.w(TouchTargetKt.f2595a)).booleanValue()) {
            dVar3 = new MinimumTouchTargetModifier(((j1) dVar4.w(CompositionLocalsKt.f3712o)).c());
        } else {
            dVar3 = d.a.f16824i;
        }
        dVar4.u();
        return dVar3;
    }
}
