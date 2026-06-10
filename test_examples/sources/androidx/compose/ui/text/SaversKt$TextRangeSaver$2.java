package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import p1.o;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp1/o;", "invoke-VqIyPBM", "(Ljava/lang/Object;)Lp1/o;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$TextRangeSaver$2 extends Lambda implements l<Object, o> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$TextRangeSaver$2 f4049j = new SaversKt$TextRangeSaver$2();

    public SaversKt$TextRangeSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final o U(Object obj) {
        Integer num;
        g.f(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num2 = null;
        if (obj2 != null) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        g.c(num);
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num2 = (Integer) obj3;
        }
        g.c(num2);
        return new o(b.m(intValue, num2.intValue()));
    }
}
