package androidx.compose.runtime.snapshots;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "it", "Lm7/n;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SnapshotKt$advanceGlobalSnapshot$2 extends Lambda implements l<SnapshotIdSet, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final SnapshotKt$advanceGlobalSnapshot$2 f2947j = new SnapshotKt$advanceGlobalSnapshot$2();

    public SnapshotKt$advanceGlobalSnapshot$2() {
        super(1);
    }

    @Override // u7.l
    public final n U(SnapshotIdSet snapshotIdSet) {
        g.f(snapshotIdSet, "it");
        return n.f16010a;
    }
}
