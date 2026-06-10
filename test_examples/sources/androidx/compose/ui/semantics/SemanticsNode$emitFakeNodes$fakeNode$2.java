package androidx.compose.ui.semantics;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.o;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/o;", "Lm7/n;", "invoke", "(Lo1/o;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class SemanticsNode$emitFakeNodes$fakeNode$2 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3943j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsNode$emitFakeNodes$fakeNode$2(String str) {
        super(1);
        this.f3943j = str;
    }

    @Override // u7.l
    public final n U(o oVar) {
        o oVar2 = oVar;
        g.f(oVar2, "$this$fakeSemanticsNode");
        o1.n.a(oVar2, this.f3943j);
        return n.f16010a;
    }
}
