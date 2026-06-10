package androidx.compose.ui.text.input;

import a1.c;
import androidx.compose.ui.text.SaversKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.g;
import p1.o;
import u7.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo0/g;", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "invoke", "(Lo0/g;Landroidx/compose/ui/text/input/TextFieldValue;)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class TextFieldValue$Companion$Saver$1 extends Lambda implements p<g, TextFieldValue, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final TextFieldValue$Companion$Saver$1 f4133j = new TextFieldValue$Companion$Saver$1();

    public TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(g gVar, TextFieldValue textFieldValue) {
        g gVar2 = gVar;
        TextFieldValue textFieldValue2 = textFieldValue;
        v7.g.f(gVar2, "$this$Saver");
        v7.g.f(textFieldValue2, "it");
        return c.O(SaversKt.a(textFieldValue2.f4131a, SaversKt.f4001a, gVar2), SaversKt.a(new o(textFieldValue2.f4132b), SaversKt.f4012m, gVar2));
    }
}
