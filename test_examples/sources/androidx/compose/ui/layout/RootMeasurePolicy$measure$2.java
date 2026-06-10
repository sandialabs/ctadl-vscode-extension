package androidx.compose.ui.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class RootMeasurePolicy$measure$2 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0 f3328j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$2(b0 b0Var) {
        super(1);
        this.f3328j = b0Var;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        b0.a.g(aVar2, this.f3328j, 0, 0);
        return n.f16010a;
    }
}
