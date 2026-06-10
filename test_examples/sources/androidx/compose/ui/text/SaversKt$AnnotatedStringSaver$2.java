package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp1/a;", "invoke", "(Ljava/lang/Object;)Lp1/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$AnnotatedStringSaver$2 extends Lambda implements l<Object, p1.a> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$AnnotatedStringSaver$2 f4019j = new SaversKt$AnnotatedStringSaver$2();

    public SaversKt$AnnotatedStringSaver$2() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[ADDED_TO_REGION] */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1.a U(Object obj) {
        String str;
        List list;
        Object obj2;
        List list2;
        Object obj3;
        g.f(obj, "it");
        List list3 = (List) obj;
        Object obj4 = list3.get(0);
        List list4 = null;
        if (obj4 != null) {
            str = (String) obj4;
        } else {
            str = null;
        }
        g.c(str);
        Object obj5 = list3.get(1);
        f fVar = SaversKt.f4002b;
        Boolean bool = Boolean.FALSE;
        if (!g.a(obj5, bool) && obj5 != null) {
            list = (List) fVar.f16183b.U(obj5);
            g.c(list);
            obj2 = list3.get(2);
            if (!g.a(obj2, bool) && obj2 != null) {
                list2 = (List) fVar.f16183b.U(obj2);
                g.c(list2);
                obj3 = list3.get(3);
                if (!g.a(obj3, bool) && obj3 != null) {
                    list4 = (List) fVar.f16183b.U(obj3);
                }
                g.c(list4);
                return new p1.a(str, list, list2, list4);
            }
            list2 = null;
            g.c(list2);
            obj3 = list3.get(3);
            if (!g.a(obj3, bool)) {
                list4 = (List) fVar.f16183b.U(obj3);
            }
            g.c(list4);
            return new p1.a(str, list, list2, list4);
        }
        list = null;
        g.c(list);
        obj2 = list3.get(2);
        if (!g.a(obj2, bool)) {
            list2 = (List) fVar.f16183b.U(obj2);
            g.c(list2);
            obj3 = list3.get(3);
            if (!g.a(obj3, bool)) {
            }
            g.c(list4);
            return new p1.a(str, list, list2, list4);
        }
        list2 = null;
        g.c(list2);
        obj3 = list3.get(3);
        if (!g.a(obj3, bool)) {
        }
        g.c(list4);
        return new p1.a(str, list, list2, list4);
    }
}
