package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import p1.a;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lp1/a$a;", "invoke", "(Ljava/lang/Object;)Ljava/util/List;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeListSaver$2 extends Lambda implements l<Object, List<? extends a.C0207a<? extends Object>>> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeListSaver$2 f4021j = new SaversKt$AnnotationRangeListSaver$2();

    public SaversKt$AnnotationRangeListSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final List<? extends a.C0207a<? extends Object>> U(Object obj) {
        a.C0207a c0207a;
        g.f(obj, "it");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            f fVar = SaversKt.c;
            if (!g.a(obj2, Boolean.FALSE) && obj2 != null) {
                c0207a = (a.C0207a) fVar.f16183b.U(obj2);
                g.c(c0207a);
                arrayList.add(c0207a);
            }
            c0207a = null;
            g.c(c0207a);
            arrayList.add(c0207a);
        }
        return arrayList;
    }
}
