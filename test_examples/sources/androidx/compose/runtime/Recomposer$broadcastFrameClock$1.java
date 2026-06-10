package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class Recomposer$broadcastFrameClock$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Recomposer f2797j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.f2797j = recomposer;
    }

    @Override // u7.a
    public final n k0() {
        i<n> x3;
        Recomposer recomposer = this.f2797j;
        synchronized (recomposer.f2777d) {
            x3 = recomposer.x();
            if (((Recomposer.State) recomposer.f2789q.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                Throwable th = recomposer.f2779f;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (x3 != null) {
            x3.t(n.f16010a);
        }
        return n.f16010a;
    }
}
