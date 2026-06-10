package u5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class a extends a3.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f17801d;

    public a(CheckableImageButton checkableImageButton) {
        this.f17801d = checkableImageButton;
    }

    @Override // a3.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f17801d.isChecked());
    }

    @Override // a3.a
    public final void d(View view, b3.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f108a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f17801d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f7193m);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
