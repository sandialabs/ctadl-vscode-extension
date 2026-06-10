package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import r.e;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lr/i;", "V", "Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$7 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e<T, V> f1321j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$7(e<T, V> eVar) {
        super(0);
        this.f1321j = eVar;
    }

    @Override // u7.a
    public final n k0() {
        this.f1321j.n = false;
        return n.f16010a;
    }
}
