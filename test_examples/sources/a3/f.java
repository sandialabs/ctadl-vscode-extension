package a3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ DisplayCutout j(WindowInsets windowInsets) {
        return windowInsets.getDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ void y(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setHeading(z10);
    }
}
