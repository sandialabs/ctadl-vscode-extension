package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f3896a = new s();

    public final void a(View view, int i10, boolean z10) {
        v7.g.f(view, "view");
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
