package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class Arrangement$spacedBy$1 extends Lambda implements p<Integer, LayoutDirection, Integer> {

    /* renamed from: j  reason: collision with root package name */
    public static final Arrangement$spacedBy$1 f1885j = new Arrangement$spacedBy$1();

    public Arrangement$spacedBy$1() {
        super(2);
    }

    @Override // u7.p
    public final Integer R(Integer num, LayoutDirection layoutDirection) {
        int intValue = num.intValue();
        LayoutDirection layoutDirection2 = layoutDirection;
        g.f(layoutDirection2, "layoutDirection");
        int i10 = q0.a.f16811a;
        float f10 = (intValue + 0) / 2.0f;
        float f11 = -1.0f;
        if (layoutDirection2 != LayoutDirection.Ltr) {
            f11 = (-1.0f) * (-1);
        }
        return Integer.valueOf(m0.b.g1((1 + f11) * f10));
    }
}
