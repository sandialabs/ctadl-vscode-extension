package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.AbstractChannel;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$2 extends Lambda implements u7.l<Object, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ la.c<m7.n> f3743j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(AbstractChannel abstractChannel) {
        super(1);
        this.f3743j = abstractChannel;
    }

    @Override // u7.l
    public final m7.n U(Object obj) {
        v7.g.f(obj, "it");
        m7.n nVar = m7.n.f16010a;
        this.f3743j.F(nVar);
        return nVar;
    }
}
