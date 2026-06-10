package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class z implements j1 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewConfiguration f3922a;

    public z(ViewConfiguration viewConfiguration) {
        this.f3922a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.j1
    public final long a() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.j1
    public final float b() {
        return this.f3922a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.j1
    public final long c() {
        float f10 = 48;
        return v8.b.e(f10, f10);
    }
}
