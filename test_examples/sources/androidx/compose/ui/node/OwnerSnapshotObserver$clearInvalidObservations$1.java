package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l1.c0;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver$clearInvalidObservations$1 extends Lambda implements l<Object, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 f3543j = new OwnerSnapshotObserver$clearInvalidObservations$1();

    public OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(Object obj) {
        g.f(obj, "it");
        return Boolean.valueOf(!((c0) obj).w());
    }
}
