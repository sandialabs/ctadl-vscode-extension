package androidx.compose.ui.platform;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    public static final v1 f3913a = new v1();

    public final void a(AndroidComposeView androidComposeView) {
        v7.g.f(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
