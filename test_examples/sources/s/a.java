package s;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17195a = new a();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        v7.g.f(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        float distance;
        v7.g.f(edgeEffect, "edgeEffect");
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f10, float f11) {
        float onPullDistance;
        v7.g.f(edgeEffect, "edgeEffect");
        try {
            onPullDistance = edgeEffect.onPullDistance(f10, f11);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f10, f11);
            return 0.0f;
        }
    }
}
