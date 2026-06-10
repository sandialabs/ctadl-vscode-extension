package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.g;
import u7.p;
import w1.b;
import w1.c;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo0/g;", "Lw1/c;", "it", "", "invoke", "(Lo0/g;Lw1/c;)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$LocaleListSaver$1 extends Lambda implements p<g, c, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$LocaleListSaver$1 f4030j = new SaversKt$LocaleListSaver$1();

    public SaversKt$LocaleListSaver$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(g gVar, c cVar) {
        g gVar2 = gVar;
        c cVar2 = cVar;
        v7.g.f(gVar2, "$this$Saver");
        v7.g.f(cVar2, "it");
        List<b> list = cVar2.f18257i;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(SaversKt.a(list.get(i10), SaversKt.f4017s, gVar2));
        }
        return arrayList;
    }
}
