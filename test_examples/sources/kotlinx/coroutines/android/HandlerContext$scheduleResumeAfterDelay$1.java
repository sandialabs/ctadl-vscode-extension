package kotlinx.coroutines.android;

import androidx.datastore.preferences.PreferencesProto$Value;
import ka.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class HandlerContext$scheduleResumeAfterDelay$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f15162j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Runnable f15163k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerContext$scheduleResumeAfterDelay$1(a aVar, d dVar) {
        super(1);
        this.f15162j = aVar;
        this.f15163k = dVar;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        this.f15162j.f15164k.removeCallbacks(this.f15163k);
        return n.f16010a;
    }
}
