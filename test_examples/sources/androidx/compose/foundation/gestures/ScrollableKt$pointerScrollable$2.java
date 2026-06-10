package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import g1.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableKt$pointerScrollable$2 extends Lambda implements l<o, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final ScrollableKt$pointerScrollable$2 f1794j = new ScrollableKt$pointerScrollable$2();

    public ScrollableKt$pointerScrollable$2() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(o oVar) {
        boolean z10;
        o oVar2 = oVar;
        g.f(oVar2, "down");
        if (oVar2.f11168h == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(!z10);
    }
}
