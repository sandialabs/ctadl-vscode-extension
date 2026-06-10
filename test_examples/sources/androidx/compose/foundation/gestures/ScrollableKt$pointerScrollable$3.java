package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import s.r;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableKt$pointerScrollable$3 extends Lambda implements u7.a<Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g1<ScrollingLogic> f1795j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$3(g0 g0Var) {
        super(0);
        this.f1795j = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != false) goto L11;
     */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean k0() {
        boolean z10;
        boolean z11;
        ScrollingLogic value = this.f1795j.getValue();
        if (!value.f1813d.a()) {
            z10 = false;
            r rVar = value.f1815f;
            if (rVar != null) {
                z11 = rVar.c();
            } else {
                z11 = false;
            }
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
