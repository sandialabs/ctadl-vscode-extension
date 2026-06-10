package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lm7/n;", "command", "invoke", "(Lu7/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements u7.l<u7.a<? extends m7.n>, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f3609j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f3609j = androidComposeView;
    }

    @Override // u7.l
    public final m7.n U(u7.a<? extends m7.n> aVar) {
        Looper looper;
        final u7.a<? extends m7.n> aVar2 = aVar;
        v7.g.f(aVar2, "command");
        AndroidComposeView androidComposeView = this.f3609j;
        Handler handler = androidComposeView.getHandler();
        if (handler != null) {
            looper = handler.getLooper();
        } else {
            looper = null;
        }
        if (looper == Looper.myLooper()) {
            aVar2.k0();
        } else {
            Handler handler2 = androidComposeView.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        u7.a aVar3 = u7.a.this;
                        v7.g.f(aVar3, "$tmp0");
                        aVar3.k0();
                    }
                });
            }
        }
        return m7.n.f16010a;
    }
}
