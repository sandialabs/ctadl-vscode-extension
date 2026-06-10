package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import b0.c;
import j1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj1/h;", "it", "Lm7/n;", "invoke", "(Lj1/h;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TextController$coreModifiers$1 extends Lambda implements l<h, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TextController f2109j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$coreModifiers$1(TextController textController) {
        super(1);
        this.f2109j = textController;
    }

    @Override // u7.l
    public final n U(h hVar) {
        c cVar;
        h hVar2 = hVar;
        g.f(hVar2, "it");
        TextController textController = this.f2109j;
        TextState textState = textController.f2103a;
        textState.f2120d = hVar2;
        if (SelectionRegistrarKt.a(textController.f2104b, textState.f2119b)) {
            long j2 = hVar2.j(u0.c.f17721b);
            TextState textState2 = textController.f2103a;
            if (!u0.c.a(j2, textState2.f2122f) && (cVar = textController.f2104b) != null) {
                cVar.f();
            }
            textState2.f2122f = j2;
        }
        return n.f16010a;
    }
}
