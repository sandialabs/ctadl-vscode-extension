package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class BackwardsCompatNode$updateModifierLocalConsumer$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ BackwardsCompatNode f3393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateModifierLocalConsumer$1(BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.f3393j = backwardsCompatNode;
    }

    @Override // u7.a
    public final n k0() {
        BackwardsCompatNode backwardsCompatNode = this.f3393j;
        d.b bVar = backwardsCompatNode.f3381p;
        g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
        ((k1.d) bVar).T(backwardsCompatNode);
        return n.f16010a;
    }
}
