package androidx.lifecycle;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/e0;", "invoke", "()Landroidx/lifecycle/e0;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandlesProvider$viewModel$2 extends Lambda implements u7.a<e0> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n0 f5359j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(n0 n0Var) {
        super(0);
        this.f5359j = n0Var;
    }

    @Override // u7.a
    public final e0 k0() {
        return SavedStateHandleSupport.b(this.f5359j);
    }
}
