package androidx.work;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "throwable", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class JobListenableFuture$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c<Object> f6179j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobListenableFuture$1(c<Object> cVar) {
        super(1);
        this.f6179j = cVar;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        c<Object> cVar = this.f6179j;
        if (th2 == null) {
            if (!cVar.f6217j.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            cVar.f6217j.cancel(true);
        } else {
            androidx.work.impl.utils.futures.a<Object> aVar = cVar.f6217j;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            aVar.j(th2);
        }
        return n.f16010a;
    }
}
