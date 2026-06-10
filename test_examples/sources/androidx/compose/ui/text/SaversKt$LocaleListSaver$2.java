package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import u7.l;
import v7.g;
import w1.b;
import w1.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lw1/c;", "invoke", "(Ljava/lang/Object;)Lw1/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$LocaleListSaver$2 extends Lambda implements l<Object, c> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$LocaleListSaver$2 f4031j = new SaversKt$LocaleListSaver$2();

    public SaversKt$LocaleListSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final c U(Object obj) {
        b bVar;
        g.f(obj, "it");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            f fVar = SaversKt.f4017s;
            if (!g.a(obj2, Boolean.FALSE) && obj2 != null) {
                bVar = (b) fVar.f16183b.U(obj2);
                g.c(bVar);
                arrayList.add(bVar);
            }
            bVar = null;
            g.c(bVar);
            arrayList.add(bVar);
        }
        return new c(arrayList);
    }
}
