package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.g;
import p1.a;
import u7.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo0/g;", "", "Lp1/a$a;", "", "it", "invoke", "(Lo0/g;Ljava/util/List;)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeListSaver$1 extends Lambda implements p<g, List<? extends a.C0207a<? extends Object>>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeListSaver$1 f4020j = new SaversKt$AnnotationRangeListSaver$1();

    public SaversKt$AnnotationRangeListSaver$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(g gVar, List<? extends a.C0207a<? extends Object>> list) {
        g gVar2 = gVar;
        List<? extends a.C0207a<? extends Object>> list2 = list;
        v7.g.f(gVar2, "$this$Saver");
        v7.g.f(list2, "it");
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(SaversKt.a(list2.get(i10), SaversKt.c, gVar2));
        }
        return arrayList;
    }
}
