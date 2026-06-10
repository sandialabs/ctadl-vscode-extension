package i7;

import android.view.animation.AccelerateDecelerateInterpolator;
import com.robinhood.ticker.TickerView;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TickerView f11820i;

    public b(TickerView tickerView) {
        this.f11820i = tickerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = TickerView.B;
        this.f11820i.d();
    }
}
