package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityManager f3850a;

    public j(Context context) {
        Object systemService = context.getSystemService("accessibility");
        v7.g.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f3850a = (AccessibilityManager) systemService;
    }

    @Override // androidx.compose.ui.platform.h
    public final long a(long j2, boolean z10) {
        if (j2 >= 2147483647L) {
            return j2;
        }
        int i10 = z10 ? 7 : 3;
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f3850a;
        if (i11 >= 29) {
            int a10 = b0.f3830a.a(accessibilityManager, (int) j2, i10);
            if (a10 != Integer.MAX_VALUE) {
                return a10;
            }
        } else if (!z10 || !accessibilityManager.isTouchExplorationEnabled()) {
            return j2;
        }
        return Long.MAX_VALUE;
    }
}
