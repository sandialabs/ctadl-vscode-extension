package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import h0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import q0.d;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq0/d$b;", "it", "", "invoke", "(Lq0/d$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class NodeChainKt$fillVector$1 extends Lambda implements l<d.b, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e<d.b> f3498j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeChainKt$fillVector$1(e<d.b> eVar) {
        super(1);
        this.f3498j = eVar;
    }

    @Override // u7.l
    public final Boolean U(d.b bVar) {
        d.b bVar2 = bVar;
        g.f(bVar2, "it");
        this.f3498j.b(bVar2);
        return Boolean.TRUE;
    }
}
