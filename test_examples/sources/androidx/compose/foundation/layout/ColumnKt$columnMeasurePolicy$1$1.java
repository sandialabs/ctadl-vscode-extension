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
final class ColumnKt$columnMeasurePolicy$1$1 extends Lambda implements s<Integer, int[], LayoutDirection, b2.b, int[], n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b.k f1907j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnKt$columnMeasurePolicy$1$1(b.k kVar) {
        super(5);
        this.f1907j = kVar;
    }

    @Override // u7.s
    public final n V(Integer num, int[] iArr, LayoutDirection layoutDirection, b2.b bVar, int[] iArr2) {
        int intValue = num.intValue();
        int[] iArr3 = iArr;
        b2.b bVar2 = bVar;
        int[] iArr4 = iArr2;
        g.f(iArr3, "size");
        g.f(layoutDirection, "<anonymous parameter 2>");
        g.f(bVar2, "density");
        g.f(iArr4, "outPosition");
        this.f1907j.c(bVar2, intValue, iArr3, iArr4);
        return n.f16010a;
    }
}
