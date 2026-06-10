package androidx.compose.foundation.selection;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ToggleableKt$toggleable$4$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<Boolean, n> f2058j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f2059k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableKt$toggleable$4$1(l<? super Boolean, n> lVar, boolean z10) {
        super(0);
        this.f2058j = lVar;
        this.f2059k = z10;
    }

    @Override // u7.a
    public final n k0() {
        this.f2058j.U(Boolean.valueOf(!this.f2059k));
        return n.f16010a;
    }
}
