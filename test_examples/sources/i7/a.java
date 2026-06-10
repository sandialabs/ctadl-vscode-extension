package i7;

import android.animation.ValueAnimator;
import com.robinhood.ticker.TickerView;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TickerView f11819a;

    public a(TickerView tickerView) {
        this.f11819a = tickerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TickerView tickerView = this.f11819a;
        tickerView.f10148k.c(valueAnimator.getAnimatedFraction());
        tickerView.a();
        tickerView.invalidate();
    }
}
