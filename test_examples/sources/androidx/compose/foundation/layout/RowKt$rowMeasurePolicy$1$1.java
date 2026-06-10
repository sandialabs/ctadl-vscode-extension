package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.s;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class RowKt$rowMeasurePolicy$1$1 extends Lambda implements s<Integer, int[], LayoutDirection, b2.b, int[], n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b.d f1956j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowKt$rowMeasurePolicy$1$1(b.d dVar) {
        super(5);
        this.f1956j = dVar;
    }

    @Override // u7.s
    public final n V(Integer num, int[] iArr, LayoutDirection layoutDirection, b2.b bVar, int[] iArr2) {
        int intValue = num.intValue();
        int[] iArr3 = iArr;
        LayoutDirection layoutDirection2 = layoutDirection;
        b2.b bVar2 = bVar;
        int[] iArr4 = iArr2;
        g.f(iArr3, "size");
        g.f(layoutDirection2, "layoutDirection");
        g.f(bVar2, "density");
        g.f(iArr4, "outPosition");
        this.f1956j.b(intValue, bVar2, layoutDirection2, iArr3, iArr4);
        return n.f16010a;
    }
}
