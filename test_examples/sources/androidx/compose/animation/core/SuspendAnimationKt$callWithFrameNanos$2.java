package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr/i;", "V", "", "it", "invoke", "(J)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SuspendAnimationKt$callWithFrameNanos$2 extends Lambda implements l<Long, R> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<Long, R> f1326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$callWithFrameNanos$2(l<? super Long, ? extends R> lVar) {
        super(1);
        this.f1326j = lVar;
    }

    @Override // u7.l
    public final Object U(Long l2) {
        return this.f1326j.U(Long.valueOf(l2.longValue() / 1));
    }
}
