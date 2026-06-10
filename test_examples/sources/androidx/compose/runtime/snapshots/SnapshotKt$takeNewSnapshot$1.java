package androidx.compose.runtime.snapshots;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p0.f;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp0/f;", "T", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Lp0/f;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements l<SnapshotIdSet, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<SnapshotIdSet, Object> f2953j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotKt$takeNewSnapshot$1(l<? super SnapshotIdSet, Object> lVar) {
        super(1);
        this.f2953j = lVar;
    }

    @Override // u7.l
    public final Object U(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        g.f(snapshotIdSet2, "invalid");
        f fVar = (f) this.f2953j.U(snapshotIdSet2);
        synchronized (SnapshotKt.c) {
            SnapshotKt.f2940d = SnapshotKt.f2940d.t(fVar.d());
            n nVar = n.f16010a;
        }
        return fVar;
    }
}
