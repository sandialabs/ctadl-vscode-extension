package androidx.compose.runtime.snapshots;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p0.a;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lp0/a;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Lp0/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends Lambda implements l<SnapshotIdSet, a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<Object, n> f2921j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l<Object, n> f2922k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(l<Object, n> lVar, l<Object, n> lVar2) {
        super(1);
        this.f2921j = lVar;
        this.f2922k = lVar2;
    }

    @Override // u7.l
    public final a U(SnapshotIdSet snapshotIdSet) {
        int i10;
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        g.f(snapshotIdSet2, "invalid");
        synchronized (SnapshotKt.c) {
            i10 = SnapshotKt.f2941e;
            SnapshotKt.f2941e = i10 + 1;
        }
        return new a(i10, snapshotIdSet2, this.f2921j, this.f2922k);
    }
}
