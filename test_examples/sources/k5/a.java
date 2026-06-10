package k5;

import android.animation.ValueAnimator;
import h6.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12893b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f12892a = i10;
        this.f12893b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f12892a;
        Object obj = this.f12893b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f12904j.setAlpha((int) (255.0f * floatValue));
                cVar.f12917x = floatValue;
                return;
            default:
                f fVar = (f) obj;
                fVar.getClass();
                fVar.f11488d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
