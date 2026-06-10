package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.g;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0/g;", "", "it", "invoke", "(Lo0/g;J)Ljava/lang/Long;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class BasicTextKt$selectionIdSaver$1 extends Lambda implements p<g, Long, Long> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f2097j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(c cVar) {
        super(2);
        this.f2097j = cVar;
    }

    @Override // u7.p
    public final Long R(g gVar, Long l2) {
        long longValue = l2.longValue();
        v7.g.f(gVar, "$this$Saver");
        if (SelectionRegistrarKt.a(this.f2097j, longValue)) {
            return Long.valueOf(longValue);
        }
        return null;
    }
}
