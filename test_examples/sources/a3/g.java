package a3;

import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ WindowInsets f(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ void w(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setPaneTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ void x(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setScreenReaderFocusable(z10);
    }
}
