package androidx.compose.foundation.selection;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.o;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/o;", "Lm7/n;", "invoke", "(Lo1/o;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class SelectableKt$selectable$4$1 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f2057j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectable$4$1(boolean z10) {
        super(1);
        this.f2057j = z10;
    }

    @Override // u7.l
    public final n U(o oVar) {
        o oVar2 = oVar;
        g.f(oVar2, "$this$semantics");
        o1.n.f16217g.a(oVar2, o1.n.f16212a[12], Boolean.valueOf(this.f2057j));
        return n.f16010a;
    }
}
