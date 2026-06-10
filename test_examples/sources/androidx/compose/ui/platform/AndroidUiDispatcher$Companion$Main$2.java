package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements u7.a<CoroutineContext> {

    /* renamed from: j  reason: collision with root package name */
    public static final AndroidUiDispatcher$Companion$Main$2 f3688j = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // u7.a
    public final CoroutineContext k0() {
        boolean z10;
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            choreographer = Choreographer.getInstance();
        } else {
            kotlinx.coroutines.scheduling.b bVar = ja.f0.f12766a;
            choreographer = (Choreographer) m0.b.h1(kotlinx.coroutines.internal.l.f15491a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
        }
        v7.g.e(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler a10 = v2.g.a(Looper.getMainLooper());
        v7.g.e(a10, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, a10);
        return androidUiDispatcher.m(androidUiDispatcher.f3687t);
    }
}
