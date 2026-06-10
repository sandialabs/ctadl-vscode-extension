package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class Recomposer$effectJob$1$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Recomposer f2798j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.f2798j = recomposer;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th2);
        Recomposer recomposer = this.f2798j;
        synchronized (recomposer.f2777d) {
            u0 u0Var = recomposer.f2778e;
            if (u0Var != null) {
                recomposer.f2789q.setValue(Recomposer.State.ShuttingDown);
                u0Var.c(cancellationException);
                recomposer.f2787o = null;
                u0Var.O(new Recomposer$effectJob$1$1$1$1(recomposer, th2));
            } else {
                recomposer.f2779f = cancellationException;
                recomposer.f2789q.setValue(Recomposer.State.ShutDown);
                n nVar = n.f16010a;
            }
        }
        return n.f16010a;
    }
}
