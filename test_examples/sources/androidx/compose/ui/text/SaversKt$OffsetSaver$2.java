package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u0.c;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lu0/c;", "invoke-x-9fifI", "(Ljava/lang/Object;)Lu0/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$OffsetSaver$2 extends Lambda implements l<Object, c> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$OffsetSaver$2 f4035j = new SaversKt$OffsetSaver$2();

    public SaversKt$OffsetSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final c U(Object obj) {
        Float f10;
        g.f(obj, "it");
        if (g.a(obj, Boolean.FALSE)) {
            return new c(c.f17722d);
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f11 = null;
        if (obj2 != null) {
            f10 = (Float) obj2;
        } else {
            f10 = null;
        }
        g.c(f10);
        float floatValue = f10.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f11 = (Float) obj3;
        }
        g.c(f11);
        return new c(a1.c.s(floatValue, f11.floatValue()));
    }
}
