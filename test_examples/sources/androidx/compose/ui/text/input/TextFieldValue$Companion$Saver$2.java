package androidx.compose.ui.text.input;

import androidx.compose.ui.text.SaversKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import p1.a;
import p1.o;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValue$Companion$Saver$2 extends Lambda implements l<Object, TextFieldValue> {

    /* renamed from: j  reason: collision with root package name */
    public static final TextFieldValue$Companion$Saver$2 f4134j = new TextFieldValue$Companion$Saver$2();

    public TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    @Override // u7.l
    public final TextFieldValue U(Object obj) {
        a aVar;
        Object obj2;
        f fVar;
        o oVar;
        g.f(obj, "it");
        List list = (List) obj;
        Object obj3 = list.get(0);
        f fVar2 = SaversKt.f4001a;
        Boolean bool = Boolean.FALSE;
        if (!g.a(obj3, bool) && obj3 != null) {
            aVar = (a) fVar2.f16183b.U(obj3);
            g.c(aVar);
            obj2 = list.get(1);
            int i10 = o.c;
            fVar = SaversKt.f4012m;
            if (!g.a(obj2, bool) && obj2 != null) {
                oVar = (o) fVar.f16183b.U(obj2);
                g.c(oVar);
                return new TextFieldValue(aVar, oVar.f16702a, null);
            }
            oVar = null;
            g.c(oVar);
            return new TextFieldValue(aVar, oVar.f16702a, null);
        }
        aVar = null;
        g.c(aVar);
        obj2 = list.get(1);
        int i102 = o.c;
        fVar = SaversKt.f4012m;
        if (!g.a(obj2, bool)) {
            oVar = (o) fVar.f16183b.U(obj2);
            g.c(oVar);
            return new TextFieldValue(aVar, oVar.f16702a, null);
        }
        oVar = null;
        g.c(oVar);
        return new TextFieldValue(aVar, oVar.f16702a, null);
    }
}
