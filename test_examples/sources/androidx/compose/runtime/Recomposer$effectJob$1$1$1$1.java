package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class Recomposer$effectJob$1$1$1$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Recomposer f2799j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Throwable f2800k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1$1$1(Recomposer recomposer, Throwable th) {
        super(1);
        this.f2799j = recomposer;
        this.f2800k = th;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        Recomposer recomposer = this.f2799j;
        Object obj = recomposer.f2777d;
        Throwable th3 = this.f2800k;
        synchronized (obj) {
            if (th3 != null) {
                if (th2 != null) {
                    if (!(!(th2 instanceof CancellationException))) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        a1.c.M(th3, th2);
                    }
                }
            } else {
                th3 = null;
            }
            recomposer.f2779f = th3;
            recomposer.f2789q.setValue(Recomposer.State.ShutDown);
        }
        return n.f16010a;
    }
}
