package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import o0.g;
import u0.c;
import u7.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo0/g;", "Lu0/c;", "it", "", "invoke-Uv8p0NA", "(Lo0/g;J)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$OffsetSaver$1 extends Lambda implements p<g, c, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$OffsetSaver$1 f4034j = new SaversKt$OffsetSaver$1();

    public SaversKt$OffsetSaver$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(g gVar, c cVar) {
        long j2 = cVar.f17724a;
        v7.g.f(gVar, "$this$Saver");
        if (c.a(j2, c.f17722d)) {
            return Boolean.FALSE;
        }
        Float valueOf = Float.valueOf(c.b(j2));
        f fVar = SaversKt.f4001a;
        return a1.c.O(valueOf, Float.valueOf(c.c(j2)));
    }
}
