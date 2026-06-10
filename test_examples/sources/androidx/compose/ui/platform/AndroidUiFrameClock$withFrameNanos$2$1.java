package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class AndroidUiFrameClock$withFrameNanos$2$1 extends Lambda implements u7.l<Throwable, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidUiDispatcher f3690j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Choreographer.FrameCallback f3691k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$1(AndroidUiDispatcher androidUiDispatcher, w wVar) {
        super(1);
        this.f3690j = androidUiDispatcher;
        this.f3691k = wVar;
    }

    @Override // u7.l
    public final m7.n U(Throwable th) {
        Throwable th2 = th;
        AndroidUiDispatcher androidUiDispatcher = this.f3690j;
        Choreographer.FrameCallback frameCallback = this.f3691k;
        androidUiDispatcher.getClass();
        v7.g.f(frameCallback, "callback");
        synchronized (androidUiDispatcher.f3681m) {
            androidUiDispatcher.f3682o.remove(frameCallback);
        }
        return m7.n.f16010a;
    }
}
