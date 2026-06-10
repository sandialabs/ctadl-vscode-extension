package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f3830a = new b0();

    public final int a(AccessibilityManager accessibilityManager, int i10, int i11) {
        int recommendedTimeoutMillis;
        v7.g.f(accessibilityManager, "accessibilityManager");
        recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
        return recommendedTimeoutMillis;
    }
}
