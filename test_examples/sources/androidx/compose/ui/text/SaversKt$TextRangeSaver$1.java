package androidx.compose.ui.text;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import o0.g;
import p1.o;
import u7.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo0/g;", "Lp1/o;", "it", "", "invoke-FDrldGo", "(Lo0/g;J)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$TextRangeSaver$1 extends Lambda implements p<g, o, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$TextRangeSaver$1 f4048j = new SaversKt$TextRangeSaver$1();

    public SaversKt$TextRangeSaver$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(g gVar, o oVar) {
        long j2 = oVar.f16702a;
        v7.g.f(gVar, "$this$Saver");
        int i10 = o.c;
        Integer valueOf = Integer.valueOf((int) (j2 >> 32));
        f fVar = SaversKt.f4001a;
        return c.O(valueOf, Integer.valueOf(o.a(j2)));
    }
}
