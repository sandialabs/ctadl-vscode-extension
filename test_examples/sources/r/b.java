package r;

import androidx.compose.animation.core.AnimationEndReason;
import r.i;

/* loaded from: classes.dex */
public final class b<T, V extends i> {

    /* renamed from: a  reason: collision with root package name */
    public final e<T, V> f16962a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationEndReason f16963b;

    public b(e<T, V> eVar, AnimationEndReason animationEndReason) {
        v7.g.f(eVar, "endState");
        this.f16962a = eVar;
        this.f16963b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.f16963b + ", endState=" + this.f16962a + ')';
    }
}
