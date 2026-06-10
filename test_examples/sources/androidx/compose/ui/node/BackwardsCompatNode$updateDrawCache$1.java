package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class BackwardsCompatNode$updateDrawCache$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d.b f3390j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ BackwardsCompatNode f3391k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateDrawCache$1(d.b bVar, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.f3390j = bVar;
        this.f3391k = backwardsCompatNode;
    }

    @Override // u7.a
    public final n k0() {
        ((s0.d) this.f3390j).f0(this.f3391k);
        return n.f16010a;
    }
}
