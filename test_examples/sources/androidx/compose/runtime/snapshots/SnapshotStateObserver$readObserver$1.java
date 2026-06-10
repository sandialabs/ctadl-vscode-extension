package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lm7/n;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SnapshotStateObserver$readObserver$1 extends Lambda implements l<Object, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f2982j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.f2982j = snapshotStateObserver;
    }

    @Override // u7.l
    public final n U(Object obj) {
        g.f(obj, "state");
        SnapshotStateObserver snapshotStateObserver = this.f2982j;
        if (!snapshotStateObserver.f2963f) {
            synchronized (snapshotStateObserver.f2961d) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.f2964g;
                g.c(observedScopeMap);
                observedScopeMap.c(obj);
                n nVar = n.f16010a;
            }
        }
        return n.f16010a;
    }
}
