package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class e implements SwipeDismissBehavior.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7339a;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7339a = baseTransientBottomBar;
    }

    public final void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f7339a.b(0);
    }
}
