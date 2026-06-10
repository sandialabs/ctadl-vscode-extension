package i7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import com.robinhood.ticker.TickerView;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f11821a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TickerView f11822b;

    public c(TickerView tickerView, b bVar) {
        this.f11822b = tickerView;
        this.f11821a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TickerView tickerView = this.f11822b;
        tickerView.f10148k.b();
        tickerView.a();
        tickerView.invalidate();
        int i10 = Build.VERSION.SDK_INT;
        Runnable runnable = this.f11821a;
        if (i10 >= 26) {
            runnable.run();
        } else {
            tickerView.post(runnable);
        }
    }
}
