package androidx.compose.ui.text;

import a1.b;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.i;
import b2.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb2/i;", "invoke-XNhUCwk", "(Ljava/lang/Object;)Lb2/i;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$TextUnitSaver$2 extends Lambda implements l<Object, i> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$TextUnitSaver$2 f4051j = new SaversKt$TextUnitSaver$2();

    public SaversKt$TextUnitSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final i U(Object obj) {
        Float f10;
        g.f(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        j jVar = null;
        if (obj2 != null) {
            f10 = (Float) obj2;
        } else {
            f10 = null;
        }
        g.c(f10);
        float floatValue = f10.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            jVar = (j) obj3;
        }
        g.c(jVar);
        return new i(b.u0(floatValue, jVar.f6349a));
    }
}
