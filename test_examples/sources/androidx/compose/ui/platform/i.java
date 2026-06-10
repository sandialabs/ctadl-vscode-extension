package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f3848a = new i();

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        v7.g.f(accessibilityNodeInfo, "node");
        v7.g.f(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
