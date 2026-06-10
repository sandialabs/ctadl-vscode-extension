package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.s;
import v7.g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "totalSize", "", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "<anonymous parameter 2>", "Lb2/b;", "density", "outPosition", "Lm7/n;", "invoke", "(I[ILandroidx/compose/ui/unit/LayoutDirection;Lb2/b;[I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ColumnKt$DefaultColumnMeasurePolicy$1 extends Lambda implements s<Integer, int[], LayoutDirection, b2.b, int[], n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ColumnKt$DefaultColumnMeasurePolicy$1 f1906j = new ColumnKt$DefaultColumnMeasurePolicy$1();

    public ColumnKt$DefaultColumnMeasurePolicy$1() {
        super(5);
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
        b.c.c(bVar2, intValue, iArr3, iArr4);
        return n.f16010a;
    }
}
